/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package com.openosrs.injector.injectors;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.inject.Provider;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.ReturnInstruction;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.signature.Signature;

public class InjectHookMethod extends AbstractInjector
{
	private static final Type METHODHOOK = new Type("Lnet/runelite/api/mixins/MethodHook;");
	private final Map<Provider<ClassFile>, List<ClassFile>> mixinTargets;

	private int injected = 0;

	InjectHookMethod(final InjectData inject, final Map<Provider<ClassFile>, List<ClassFile>> mixinTargets)
	{
		super(inject);
		this.mixinTargets = mixinTargets;
	}

	@Override
	public void inject()
	{
		for (Map.Entry<Provider<ClassFile>, List<ClassFile>> entry : mixinTargets.entrySet())
		{
			injectMethods(entry.getKey(), entry.getValue());
		}

		log.info("[INFO] Injected {} method hooks", injected);
	}

	private void injectMethods(Provider<ClassFile> mixinProvider, List<ClassFile> targetClasses)
	{
		final ClassFile mixinClass = mixinProvider.get();

		for (ClassFile targetClass : targetClasses)
		{
			for (Method mixinMethod : mixinClass.getMethods())
			{
				final Annotation methodHook = mixinMethod.findAnnotation(METHODHOOK);
				if (methodHook == null)
				{
					continue;
				}

				if (!mixinMethod.getDescriptor().isVoid())
				{
					throw new InjectException("Method hook " + mixinMethod.getPoolMethod() + " doesn't have void return type");
				}

				final String hookName = methodHook.getValueString();
				final boolean end = isEnd(methodHook);

				final ClassFile deobTarget = inject.toDeob(targetClass.getName());
				final Signature deobSig = InjectUtil.apiToDeob(inject, mixinMethod.getDescriptor());
				final boolean notStatic = !mixinMethod.isStatic();
				final Method targetMethod = InjectUtil.findMethod(inject, hookName, deobTarget.getName(), sig -> InjectUtil.argsMatch(sig, deobSig), notStatic, false);

				final net.runelite.asm.pool.Method hookMethod = new net.runelite.asm.pool.Method(
					targetClass.getPoolClass(),
					mixinMethod.getName(),
					mixinMethod.getDescriptor()
				);

				inject(targetMethod, hookMethod, end);

				log.debug("[DEBUG] Injected method hook {} in {}", hookMethod, targetMethod);
				++injected;
			}
		}
	}

	private void inject(final Method method, final net.runelite.asm.pool.Method hookMethod, boolean end)
	{
		final Instructions ins = method.getCode().getInstructions();
		final ListIterator<Instruction> it;

		if (end)
		{
			it = ins.listIterator(ins.size());
			while (it.hasPrevious())
			{
				if (it.previous() instanceof ReturnInstruction)
				{
					insertVoke(method, hookMethod, it);
				}
			}

			return;
		}

		it = ins.listIterator();
		if (method.getName().equals("<init>"))
		{
			while (it.hasNext())
			{
				if (it.next() instanceof InvokeSpecial)
				{
					break;
				}
			}

			assert it.hasNext() : "Constructor without invokespecial";
		}

		insertVoke(method, hookMethod, it);
	}

	private void insertVoke(final Method method, final net.runelite.asm.pool.Method hookMethod, ListIterator<Instruction> iterator)
	{
		final Instructions instructions = method.getCode().getInstructions();
		int varIdx = 0;

		if (!method.isStatic())
		{
			iterator.add(new ALoad(instructions, varIdx++));
		}

		for (Type type : hookMethod.getType().getArguments())
		{
			iterator.add(
				InjectUtil.createLoadForTypeIndex(
					instructions,
					type,
					varIdx
				)
			);

			varIdx += type.getSize();
		}

		iterator.add(
			InjectUtil.createInvokeFor(
				instructions,
				hookMethod,
				method.isStatic()
			)
		);
	}

	private static boolean isEnd(Annotation annotation)
	{
		Object val = annotation.get("end");
		return val instanceof Boolean && (Boolean) val;
	}
}
