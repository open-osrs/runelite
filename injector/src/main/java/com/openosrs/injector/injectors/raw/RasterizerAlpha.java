/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.google.common.collect.Lists;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.GetFieldInstruction;
import net.runelite.asm.attributes.code.instruction.types.LVTInstruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IALoad;
import net.runelite.asm.attributes.code.instructions.IAStore;
import net.runelite.asm.attributes.code.instructions.IAdd;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.IOr;
import net.runelite.asm.attributes.code.instructions.IShR;
import net.runelite.asm.attributes.code.instructions.ISub;
import net.runelite.asm.attributes.code.instructions.IUShR;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.SiPush;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.execution.StackContext;
import net.runelite.asm.execution.VariableContext;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;

public class RasterizerAlpha extends AbstractInjector
{
	private static final net.runelite.asm.pool.Method DRAWALPHA = new net.runelite.asm.pool.Method(
		new Class("client"),
		"drawAlpha",
		new Signature("([IIII)V")
	);
	private static final int ALPHA = 0xff000000;

	public RasterizerAlpha(InjectData inject)
	{
		super(inject);
	}

	/*
	 * This class exists to allow transparency in overlays
	 */
	public void inject()
	{
		final Field r2dPx = InjectUtil.findField(inject, "Rasterizer2D_pixels", "Rasterizer2D");
		final Method draw = InjectUtil.findMethod(inject, "drawLoggedIn", "Client");
		final ClassFile rasterizer2D = r2dPx.getClassFile();
		final Execution ex = new Execution(rasterizer2D.getGroup());
		ex.staticStep = false;
		ex.step = false;
		ex.addMethod(draw);

		int[] counts = new int[2];

		ex.addMethodContextVisitor((MethodContext mc) ->
		{
			Instructions instrs = getInstrs(mc);
			if (instrs == null)
			{
				return;
			}

			int count = 0;
			int orCount = 0;

			outer:
			for (InstructionContext ic : mc.getInstructionContexts())
			{
				Instruction instruction = ic.getInstruction();
				if (!(instruction instanceof IAStore))
				{
					continue;
				}

				// Field field = astore.getMyField(ic);
				// doesn't track into methods so doing it here
				StackContext array = ic.getPops().get(2);

				if (!isSameField(r2dPx, array))
				{
					continue;
				}

				// This is the colour that's being set
				StackContext colour = ic.getPops().get(0);

				// resolve gets the original value pusher
				InstructionContext colPusher = colour.getPushed().resolve(colour);
				Instruction colPushI = colPusher.getInstruction();

				// If it's not a >> or a >>> or a + it's not alpha
				if (colPushI instanceof IShR ||
					colPushI instanceof IUShR ||
					colPushI instanceof IAdd)
				{
					// So we know we may be dealing with alpha here, now we need the alpha value
					// earlier on in the method there's been a 256 - XXX, where xxx is alpha.
					// if that SiPush 256 doesn't exist, we should just | 0xff000000 instead
					for (InstructionContext ins : mc.getInstructionContexts())
					{
						if (!(ins.getInstruction() instanceof SiPush))
						{
							continue;
						}

						SiPush pci = (SiPush) ins.getInstruction();
						if ((short) pci.getConstant() != (short) 256)
						{
							continue;
						}

						InstructionContext isub = ins.getPushes().get(0).getPopped().get(0);
						if (!(isub.getInstruction() instanceof ISub))
						{
							continue;
						}

						StackContext alphaPop = isub.getPops().get(0);
						InstructionContext alphaPusher = alphaPop.getPushed();
						InstructionContext isubResult = isub.getPushes().get(0).getPopped().get(0);
						boolean shouldSubtractLocal = false;

						if (pushesToSameVar(isubResult, alphaPusher))
						{
							shouldSubtractLocal = true;
							alphaPusher = isubResult;
							/*alphaPusher = resolveFieldThroughInvokes(alphaPop);

							if (alphaPusher == null)
								throw new RuntimeException("Alpha var is overwritten and we don't know what pushed it"); // cheeky unchecked*/
						}

						int storeIdx = instrs.getInstructions().indexOf(instruction);

						Instruction alphaPushI = alphaPusher.getInstruction();
						if (alphaPushI instanceof GetStatic)
						{
							instrs.addInstruction(storeIdx++, new LDC(instrs, 255));
							instrs.addInstruction(storeIdx++, new GetStatic(instrs, ((GetStatic) alphaPushI).getField()));
							instrs.addInstruction(storeIdx++, new ISub(instrs, InstructionType.ISUB));
						}
						else if (alphaPushI instanceof LVTInstruction)
						{
							if (shouldSubtractLocal)
							{
								instrs.addInstruction(storeIdx++, new LDC(instrs, 255));
								instrs.addInstruction(storeIdx++, new ILoad(instrs, ((LVTInstruction) alphaPushI).getVariableIndex()));
								instrs.addInstruction(storeIdx++, new ISub(instrs, InstructionType.ISUB));
							}
							else
							{
								instrs.addInstruction(storeIdx++, new ILoad(instrs, ((LVTInstruction) alphaPushI).getVariableIndex()));
							}
						}

						instrs.getInstructions().set(storeIdx, new InvokeStatic(instrs, DRAWALPHA));
						++count;
						continue outer;
					}
				}

				// If we're copying from the same field we don't have to apply extra alpha again
				if (colPushI instanceof IALoad
					&& isSameField(r2dPx, colPusher.getPops().get(1)))
				{
					continue;
				}

				// If the value is 0, it's supposed to be transparent, not black
				if (colPushI instanceof PushConstantInstruction
					&& ((PushConstantInstruction) colPushI).getConstant().equals(0))
				{
					continue;
				}

				// rasterPx[idx] = color | 0xff000000 (the | 0xff000000 is what's added)
				int storeIdx = instrs.getInstructions().indexOf(instruction);

				instrs.addInstruction(storeIdx++, new LDC(instrs, ALPHA));
				instrs.addInstruction(storeIdx, new IOr(instrs, InstructionType.IOR));
				++orCount;
			}

			if (orCount != 0)
			{
				counts[0] += orCount;
				log.info("[INFO] Added {} OR's into {}", orCount, mc.getMethod());
			}
			if (count != 0)
			{
				counts[1] += count;
				log.info("[INFO] Injected {} DrawAlpha invokes into {}", count, mc.getMethod());
			}
		});

		ex.run();
		log.info("[INFO] Injected {} DrawAlpha invokes and {} ors", counts[1], counts[0]);
	}

	private static boolean pushesToSameVar(InstructionContext cA, InstructionContext cB)
	{
		Instruction iA = cA.getInstruction(), iB = cB.getInstruction();
		if (iA instanceof LVTInstruction && iB instanceof LVTInstruction)
		{
			int a = ((LVTInstruction) iA).getVariableIndex();
			int b = ((LVTInstruction) iB).getVariableIndex();

			return a == b;
		}

		return false;
	}

	private static Instructions getInstrs(MethodContext mc)
	{
		Code c = mc.getMethod().getCode();
		if (c == null)
		{
			return null;
		}

		return c.getInstructions();
	}

	private static InstructionContext resolveFieldThroughInvokes(StackContext stackContext)
	{
		InstructionContext pusher = stackContext.getPushed().resolve(stackContext);
		if (pusher.getInstruction() instanceof GetFieldInstruction)
		{
			return pusher;
		}

		// No field I wanna trace, rn at least
		if (!(pusher.getInstruction() instanceof LVTInstruction))
		{
			return null;
		}

		int vidx = ((LVTInstruction) pusher.getInstruction()).getVariableIndex();

		VariableContext vc = pusher.getVariables().get(vidx);
		stackContext = Lists.reverse(vc.getInstructionWhichStored().getPops()).get(vidx);

		return resolveFieldThroughInvokes(stackContext);
	}

	private static boolean isSameField(Field f, StackContext array)
	{
		InstructionContext ic = resolveFieldThroughInvokes(array);

		if (ic == null)
		{
			return false;
		}

		return ((GetFieldInstruction) ic.getInstruction()).getMyField() == f;
	}
}
