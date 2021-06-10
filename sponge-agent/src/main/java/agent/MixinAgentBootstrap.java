/*
 * This file is part of Mixin, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package agent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.transformer.MixinTransformer;
import org.spongepowered.asm.service.ILegacyClassTransformer;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class MixinAgentBootstrap {
    public static final Logger LOGGER = LogManager.getLogger("mixin-agent");

    public static final ClassLoader CLASS_LOADER = ClassLoader.getSystemClassLoader();

    private static final Set<String> LOADED_CLASSES = new HashSet<>();

    private static Transformer transformer;

    public static void premain(String ops, Instrumentation instrumentation) {

        System.out.println("---SpongeOSRS Agent---");
        MixinBootstrap.getPlatform().inject();
        MixinBootstrap.init();

        Mixins.addConfiguration("mixins.json");
        gotoPhase(MixinEnvironment.Phase.DEFAULT);
        System.out.println("SpongeOSRS Agent Started");

        Transformer transformer = getTransformer();
        instrumentation.addTransformer(transformer);
    }


    public static Transformer getTransformer() {
        if (transformer == null) {
            transformer = new Transformer();
        }
        return transformer;
    }

    public static boolean isClassLoaded(String name) {
        return LOADED_CLASSES.contains(name);
    }

    private static void gotoPhase(MixinEnvironment.Phase phase) {
        try {

            Method gotoPhase = MixinEnvironment.class.getDeclaredMethod("gotoPhase", MixinEnvironment.Phase.class);
            gotoPhase.setAccessible(true);
            gotoPhase.invoke(null, phase);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static final class Transformer implements ClassFileTransformer, ILegacyClassTransformer {
        private static final ILegacyClassTransformer MIXIN = constructTransformer();

        private static ILegacyClassTransformer constructTransformer() {
            try {
                Constructor<MixinTransformer> constructor = MixinTransformer.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                return constructor.newInstance();
            } catch (Throwable t) {
                t.printStackTrace();
            }
            return new VoidLegacyTransformer();
        }

        @Override
        public String getName() {
            return this.getClass().getName();
        }

        @Override
        public boolean isDelegationExcluded() {
            return true;
        }

        @Override
        public byte[] transform(ClassLoader loader, String name, Class<?> clazz, ProtectionDomain domain, byte[] bytes) {
            LOADED_CLASSES.add(name);

            return MIXIN.transformClassBytes(name, name.replace("/", "."), bytes);


        }

        @Override
        public byte[] transformClassBytes(String name, String transformedName, byte[] bytes) {
            return MIXIN.transformClassBytes(name, transformedName, bytes);
        }
    }
}
