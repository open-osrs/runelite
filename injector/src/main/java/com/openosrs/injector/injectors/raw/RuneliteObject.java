/*
 * Copyright (c) 2021, Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.Dup;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.attributes.code.instructions.VReturn;
import net.runelite.asm.signature.Signature;
import org.objectweb.asm.Opcodes;

public class RuneliteObject extends AbstractInjector
{
	private static final String RUNELITE_OBJECT = "RuneLiteObject";

	public RuneliteObject(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		ClassFile runeliteObjectVanilla = inject.vanilla.findClass(RUNELITE_OBJECT);

		final ClassFile graphicsObjectVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass("GraphicsObject")
		);

		graphicsObjectVanilla.clearFinal();

		final ClassFile clientVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass("Client")
		);

		final ClassFile runeLiteObjectDeob = inject.getDeobfuscated()
			.findClass(RUNELITE_OBJECT);

		if (runeliteObjectVanilla == null)
		{
			runeliteObjectVanilla = new ClassFile(inject.vanilla);
			runeliteObjectVanilla.setName(RUNELITE_OBJECT);
			runeliteObjectVanilla.setParentClass(graphicsObjectVanilla.getPoolClass());
			runeliteObjectVanilla.setAccess(Opcodes.ACC_PUBLIC);
			runeliteObjectVanilla.setVersion(Opcodes.V1_8);
			inject.vanilla.addClass(runeliteObjectVanilla);

			inject.toVanilla.put(runeLiteObjectDeob, runeliteObjectVanilla);
		}

		{
			Method initRuneliteObject = new Method(runeliteObjectVanilla, "<init>", new Signature("()V"));
			initRuneliteObject.setPublic();

			final Code code = new Code(initRuneliteObject);
			code.setMaxStack(1);
			initRuneliteObject.setCode(code);
			runeliteObjectVanilla.addMethod(initRuneliteObject);

			final Instructions instructions = code.getInstructions();
			final List<Instruction> ins = instructions.getInstructions();

			ins.add(new ALoad(instructions, 0));
			ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(graphicsObjectVanilla.getPoolClass(), "<init>", new Signature("()V"))));
			ins.add(new VReturn(instructions));
		}

		{
			Method copy = new Method(clientVanilla, "createRuneLiteObject", new Signature("()Lnet/runelite/api/RuneLiteObject;"));
			copy.setPublic();

			final Code code = new Code(copy);
			code.setMaxStack(2);
			copy.setCode(code);
			clientVanilla.addMethod(copy);

			final Instructions instructions = code.getInstructions();
			final List<Instruction> ins = instructions.getInstructions();

			ins.add(new New(instructions, runeliteObjectVanilla.getPoolClass()));
			ins.add(new Dup(instructions));
			ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(runeliteObjectVanilla.getPoolClass(), "<init>", new Signature("()V"))));
			ins.add(new Return(instructions, InstructionType.ARETURN));
		}
	}
}
