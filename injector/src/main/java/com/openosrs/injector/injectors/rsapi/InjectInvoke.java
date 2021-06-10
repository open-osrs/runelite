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
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.BiPush;
import net.runelite.asm.attributes.code.instructions.CheckCast;
import net.runelite.asm.attributes.code.instructions.InvokeInterface;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.SiPush;
import net.runelite.asm.signature.Signature;

public class InjectInvoke
{
	public static void inject(ClassFile targetClass, RSApiMethod apiMethod, Method vanillaMethod, String garbage)
	{
		if (targetClass.findMethod(apiMethod.getName(), apiMethod.getSignature()) != null)
		{
			throw new InjectException("Duplicate invoker method " + apiMethod.getMethod().toString());
		}

		final Method method = new Method(targetClass, apiMethod.getName(), apiMethod.getSignature());
		method.setPublic();

		final Code code = new Code(method);
		method.setCode(code);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		int varIdx = 0;
		if (!vanillaMethod.isStatic())
		{
			ins.add(new ALoad(instructions, varIdx));
		}
		++varIdx;

		final Signature apiSig = apiMethod.getSignature();
		final Signature vanSig = vanillaMethod.getDescriptor();
		for (int i = 0; i < apiSig.size(); i++)
		{
			final Type type = apiSig.getTypeOfArg(i);
			final Instruction loadInstruction = InjectUtil.createLoadForTypeIndex(instructions, type, varIdx);
			ins.add(loadInstruction);

			final Type obType = vanSig.getTypeOfArg(i);
			if (!type.equals(obType))
			{
				final CheckCast checkCast = new CheckCast(instructions);
				checkCast.setType(obType);
				ins.add(checkCast);
			}

			varIdx += type.getSize();
		}

		if (apiSig.size() != vanSig.size())
		{
			if (garbage == null)
			{
				garbage = "0";
			}

			switch (vanSig.getTypeOfArg(vanSig.size() - 1).toString())
			{
				case "Z":
				case "B":
				case "C":
					ins.add(new BiPush(instructions, Byte.parseByte(garbage)));
					break;
				case "S":
					ins.add(new SiPush(instructions, Short.parseShort(garbage)));
					break;
				case "I":
					ins.add(new LDC(instructions, Integer.parseInt(garbage)));
					break;
				case "D":
					ins.add(new LDC(instructions, Double.parseDouble(garbage)));
					break;
				case "F":
					ins.add(new LDC(instructions, Float.parseFloat(garbage)));
					break;
				case "J":
					ins.add(new LDC(instructions, Long.parseLong(garbage)));
					break;
				default:
					throw new RuntimeException("Unknown type");
			}
		}

		if (vanillaMethod.isStatic())
		{
			ins.add(new InvokeStatic(instructions, vanillaMethod.getPoolMethod()));
		}
		else if (vanillaMethod.getClassFile().isInterface())
		{
			ins.add(new InvokeInterface(instructions, vanillaMethod.getPoolMethod()));
		}
		else
		{
			ins.add(new InvokeVirtual(instructions, vanillaMethod.getPoolMethod()));
		}

		ins.add(InjectUtil.createReturnForType(instructions, vanSig.getReturnValue()));

		targetClass.addMethod(method);
	}
}
