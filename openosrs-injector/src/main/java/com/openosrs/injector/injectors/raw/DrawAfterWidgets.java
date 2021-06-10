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
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import static com.openosrs.injector.injection.InjectData.CALLBACKS;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.JumpingInstruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.InvokeInterface;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.signature.Signature;

public class DrawAfterWidgets extends AbstractInjector
{
	public DrawAfterWidgets(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		/*
		 * This call has to be injected using raw injection because the
		 * drawWidgets method gets inlined in some revisions. If it wouldn't be,
		 * mixins would be used to add the call to the end of drawWidgets.

		 * --> This hook depends on the positions of "if (535573958 * kl != -1)" and "jz.db();".


		 * Revision 180 - client.gs():
		 * ______________________________________________________

		 * @Export("drawLoggedIn")
		 * final void drawLoggedIn() {
		 *    if(rootInterface != -1) {
		 *       ClientPreferences.method1809(rootInterface);
		 *    }

		 *    int var1;
		 *    for(var1 = 0; var1 < rootWidgetCount; ++var1) {
		 *       if(__client_od[var1]) {
		 *          __client_ot[var1] = true;
		 *       }

		 *       __client_oq[var1] = __client_od[var1];
		 *       __client_od[var1] = false;
		 *    }

		 *    __client_oo = cycle;
		 *    __client_lq = -1;
		 *    __client_ln = -1;
		 *    UserComparator6.__fg_jh = null;
		 *    if(rootInterface != -1) {
		 *       rootWidgetCount = 0;
		 *       Interpreter.drawWidgets(rootInterface, 0, 0, SoundCache.canvasWidth, Huffman.canvasHeight, 0, 0, -1);
		 *    }

		 *    <--  here

		 * Rasterizer2D.Rasterizer2D_resetClip();
		 * ______________________________________________________
		 */

		boolean injected = false;

		Field client = getVanillaStaticFieldFromDeob("client");
		Field callbacks = getObfuscatedField("callbacks");
		Method noClip = InjectUtil.findMethod(inject, "Rasterizer2D_resetClip", "Rasterizer2D", null); // !!!!!

		if (noClip == null)
		{
			throw new InjectException("Mapped method \"Rasterizer2D_resetClip\" could not be found.");
		}

		net.runelite.asm.pool.Method poolNoClip = noClip.getPoolMethod();

		for (ClassFile c : inject.getVanilla())
		{
			for (Method m : c.getMethods())
			{
				if (m.getCode() == null)
				{
					continue;
				}

				Instructions instructions = m.getCode().getInstructions();

				Set<Label> labels = new HashSet<>();

				// Let's find "invokestatic <some class>.noClip()" and its label
				ListIterator<Instruction> labelIterator = instructions.listIterator();
				while (labelIterator.hasNext())
				{
					Instruction i = labelIterator.next();

					if (!(i instanceof InvokeStatic))
					{
						continue;
					}

					InvokeStatic is = (InvokeStatic) i;

					if (!is.getMethod().equals(poolNoClip))
					{
						continue;
					}

					labelIterator.previous();
					Instruction i2 = labelIterator.previous();
					labelIterator.next();
					labelIterator.next();

					// Find the label that marks the code path for the instruction
					if (!(i2 instanceof Label))
					{
						continue;
					}

					// There can be several noClip invocations in a method, so let's catch them all
					labels.add((Label) i2);
				}

				if (labels.isEmpty())
				{
					// If we get here, we're either in the wrong method
					// or Jagex has removed the "if (535573958 * kl != -1)"
					//	log.debug("[DEBUG] Could not find the label for jumping to the " + noClip + " call in " + m);
					continue;
				}

				Set<Label> labelsToInjectAfter = new HashSet<>();

				ListIterator<Instruction> jumpIterator = instructions.listIterator();
				while (jumpIterator.hasNext())
				{
					Instruction i = jumpIterator.next();

					if (!(i instanceof JumpingInstruction))
					{
						continue;
					}

					JumpingInstruction ji = (JumpingInstruction) i;

					Label label = null;

					for (Label l : labels)
					{
						if (ji.getJumps().contains(l))
						{
							label = l;
							break;
						}
					}

					if (label == null)
					{
						continue;
					}

					jumpIterator.previous();

					Set<Instruction> insns = new HashSet<>();
					insns.add(jumpIterator.previous());
					insns.add(jumpIterator.previous());
					insns.add(jumpIterator.previous());
					insns.add(jumpIterator.previous());

					// Get the iterator back to i's position
					jumpIterator.next();
					jumpIterator.next();
					jumpIterator.next();
					jumpIterator.next();
					jumpIterator.next();

					/*
						Check that these instruction types are passed into the if-statement:

						ICONST_M1
						GETSTATIC client.kr : I
						LDC 634425425
						IMUL

						We cannot depend on the order of these because of the obfuscation,
						so let's make it easier by just checking that they are there.
					 */
					if (insns.stream().filter(i2 -> i2 instanceof PushConstantInstruction).count() != 2
						|| insns.stream().filter(i2 -> i2 instanceof IMul).count() != 1
						|| insns.stream().filter(i2 -> i2 instanceof GetStatic).count() != 1)
					{
						continue;
					}

					// At this point, we have found the real injection point
					labelsToInjectAfter.add(label);
				}

				for (Label l : labelsToInjectAfter)
				{
					InvokeInterface invoke = new InvokeInterface(instructions,
						new net.runelite.asm.pool.Method(
							new net.runelite.asm.pool.Class(CALLBACKS),
							"drawAfterWidgets",
							new Signature("()V")
						)
					);

					instructions.addInstruction(instructions.getInstructions().indexOf(l) + 1, invoke);
					instructions.addInstruction(instructions.getInstructions().indexOf(l) + 1, new GetField(instructions, callbacks.getPoolField()));
					instructions.addInstruction(instructions.getInstructions().indexOf(l) + 1, new GetStatic(instructions, client.getPoolField()));
					log.debug("[DEBUG] injectDrawAfterWidgets injected a call after " + l);

					injected = true;
				}
			}
		}

		if (!injected)
		{
			throw new InjectException("injectDrawAfterWidgets failed to inject!");
		}
	}

	public Field getVanillaStaticFieldFromDeob(String s)
	{
		for (ClassFile c : inject.getDeobfuscated())
		{
			for (Field f : c.getFields())
			{
				if (f.isStatic())
				{
					if (f.getName().equals(s))
					{
						return inject.toVanilla(f);
					}
				}
			}
		}
		return null;
	}

	public Field getObfuscatedField(String s)
	{
		for (ClassFile c : inject.getVanilla())
		{
			for (Field f : c.getFields())
			{
				if (!f.isStatic())
				{
					if (f.getName().equals(s))
					{
						return f;
					}
				}
			}
		}
		return null;
	}
}
