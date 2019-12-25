/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob;

import com.google.common.base.Stopwatch;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.execution.Execution;
import net.runelite.deob.deobfuscators.*;
import net.runelite.deob.deobfuscators.arithmetic.ModArith;
import net.runelite.deob.deobfuscators.arithmetic.MultiplicationDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyOneDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyZeroDeobfuscator;
import net.runelite.deob.deobfuscators.cfg.ControlFlowDeobfuscator;
import net.runelite.deob.deobfuscators.constparam.ConstantParameter;
import net.runelite.deob.deobfuscators.exprargorder.ExprArgOrder;
import net.runelite.deob.deobfuscators.menuaction.MenuActionDeobfuscator;
import net.runelite.deob.deobfuscators.transformers.*;
import net.runelite.deob.util.JarUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class DeobMobile
{
    private static final Logger logger = LoggerFactory.getLogger(Deob.class);

    public static final int OBFUSCATED_NAME_MAX_LEN = 3;
    private static final boolean CHECK_EXEC = false;

    public static void main(String[] args) throws IOException
    {
        if (args == null || args.length < 2)
        {
            System.err.println("Syntax: input_jar output_jar");
            System.exit(-1);
        }

        logger.info("Deobfuscator revision {}", DeobProperties.getRevision());

        Stopwatch stopwatch = Stopwatch.createStarted();

        ClassGroup group = JarUtil.loadJar(new File(args[0]));

        //Doesn't work as intended on mobile, and removes annotations currently.
        //run(group, new StaticShouldBeInstance());

        if (args.length <= 2 || !args[2].equals("rl"))
        {

            // remove except RuntimeException
            run(group, new RuntimeExceptions());

            //Adds more logic on mobile?
            //run(group, new ControlFlowDeobfuscator());

            run(group, new RenameUnique());

            // remove unused methods - this leaves Code with no instructions,
            // which is not valid, so unused methods is run after
            run(group, new UnreachedCode());
            run(group, new UnusedMethods());
            // remove illegal state exceptions, frees up some parameters
            run(group, new IllegalStateExceptions());
            // remove constant logically dead parameters
            run(group, new ConstantParameter());
            // remove unhit blocks
            run(group, new UnreachedCode());
            run(group, new UnusedMethods());
            // remove unused parameters
            run(group, new UnusedParameters());
            // remove unused fields
            run(group, new UnusedFields());
            run(group, new FieldInliner());
            // order uses class name order for sorting fields/methods,
            // so run it before removing classes below
            run(group, new Order());
            run(group, new UnusedClass());

            //Only target gamepack
            ClassGroup filteredGroup = new ClassGroup();
            for (ClassFile cf : group)
            {
                if ((cf.getName().startsWith("com"))
                        || cf.getName().startsWith("android")
                        || cf.getName().startsWith("butterknife"))
                {
                    continue;
                }
                filteredGroup.addClass(cf);
            }

            runMath(filteredGroup);


            //run(filteredGroup, new ExprArgOrder());

            run(filteredGroup, new Lvt());
            run(filteredGroup, new CastNull());
            run(filteredGroup, new EnumDeobfuscator());

            new OpcodesTransformer().transform(filteredGroup);
            run(filteredGroup, new MenuActionDeobfuscator());
            new GetPathTransformer().transform(filteredGroup);

            new ClientErrorTransformer().transform(filteredGroup);
            new ReflectionTransformer().transform(filteredGroup);
            new MaxMemoryTransformer().transform(filteredGroup);

            //Need the other classes still
            for (ClassFile cf : group)
            {
                if ((cf.getName().startsWith("com"))
                        || cf.getName().startsWith("android")
                        || cf.getName().startsWith("butterknife"))
                {
                    filteredGroup.addClass(cf);
                }
            }
            JarUtil.saveJar(filteredGroup, new File(args[1]));
        }

        stopwatch.stop();
        logger.info("Done in {}", stopwatch);
    }

    public static boolean isObfuscated(String name)
    {
        if (name.length() <= OBFUSCATED_NAME_MAX_LEN)
        {
            return !name.equals("run") && !name.equals("add");
        }
        return name.startsWith("method")
                || name.startsWith("vmethod")
                || name.startsWith("field")
                || name.startsWith("class")
                || name.startsWith("__");
    }

    private static void runMath(ClassGroup group)
    {
        ModArith mod = new ModArith();
        mod.run(group);

        int last = -1, cur;
        while ((cur = mod.runOnce()) > 0)
        {
            new MultiplicationDeobfuscator().run(group);

            // do not remove 1 * field so that ModArith can detect
            // the change in guessDecreasesConstants()
            new MultiplyOneDeobfuscator(true).run(group);

            new MultiplyZeroDeobfuscator().run(group);

            if (last == cur)
            {
                break;
            }

            last = cur;
        }

        // now that modarith is done, remove field * 1
        new MultiplyOneDeobfuscator(false).run(group);

        mod.annotateEncryption();
    }

    private static void run(ClassGroup group, Deobfuscator deob)
    {
        Stopwatch stopwatch = Stopwatch.createStarted();
        deob.run(group);
        stopwatch.stop();

        logger.info("{} took {}", deob.getClass().getSimpleName(), stopwatch);

        // check code is still correct
        if (CHECK_EXEC)
        {
            Execution execution = new Execution(group);
            execution.populateInitialMethods();
            execution.run();
        }
    }
}
