/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
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
package com.openosrs.injector.injectors.rsapi;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.rsapi.RSApiMethod;
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.signature.Signature;

public class InjectGetter
{
	public static void inject(ClassFile targetClass, RSApiMethod apiMethod, Field field, Number getter)
	{
		if (targetClass.findMethod(apiMethod.getName(), apiMethod.getSignature()) != null)
		{
			throw new InjectException("Duplicate getter method " + apiMethod.getMethod().toString());
		}

		final String name = apiMethod.getName();
		final Signature sig = apiMethod.getSignature();

		final Method method = new Method(targetClass, name, sig);
		method.setPublic();

		final Code code = new Code(method);
		method.setCode(code);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		if (field.isStatic())
		{
			ins.add(new GetStatic(instructions, field.getPoolField()));
		}
		else
		{
			ins.add(new ALoad(instructions, 0));
			ins.add(new GetField(instructions, field.getPoolField()));
		}

		if (getter != null)
		{
			InjectUtil.injectObfuscatedGetter(getter, instructions, ins::add);
		}

		ins.add(InjectUtil.createReturnForType(instructions, field.getType()));

		targetClass.addMethod(method);
	}
}
