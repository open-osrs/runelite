/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IfEq;
import net.runelite.asm.attributes.code.instructions.IfNe;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Field;
import net.runelite.asm.signature.Signature;
import static com.openosrs.injector.injection.InjectData.HOOKS;

public class DrawMenu extends AbstractInjector
{
	private static final net.runelite.asm.pool.Method DRAWMENU = new net.runelite.asm.pool.Method(
		new Class(HOOKS),
		"drawMenu",
		new Signature("()Z")
	);

	public DrawMenu(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		/*
		 * The drawMenu method can be inlined, so we need this raw injector to find where to inject.
		 *
		 * Originally I wanted to make sure we don't skip the method where client gets told not to draw
		 * the widgets behind the menu. This would be useless though, as the client redraws the widgets
		 * no matter what. It would also be such a insignificant performance boost it doesn't seem worth
		 * the extra headache to me.
		 *
		 * --- what the code looks like completely uninlined ---
		 * if (!isMenuOpen) {
		 *    if (viewportX != -1) {
		 *       drawTopLeftText(viewportX, viewportY);
		 *    }
		 * } else {
		 *    drawMenu();
		 * }
		 *
		 * if (gameDrawingMode == 3) {
		 *    ...
		 * --------
		 */

		final Method drawLoggedIn = InjectUtil.findMethod(inject, "drawLoggedIn", "Client", null, true, false);
		final Field gameDrawMode = InjectUtil.findField(inject, "gameDrawingMode", "Client").getPoolField();
		final Field isMenuOpen = InjectUtil.findField(inject, "isMenuOpen", "Client").getPoolField();

		final Execution execution = new Execution(inject.getVanilla());
		execution.noInvoke = true;
		execution.addMethod(drawLoggedIn);

		AtomicReference<MethodContext> mcRef = new AtomicReference<>(null);

		execution.addMethodContextVisitor(mcRef::set);
		execution.run();

		Instruction injectInvokeAfter = null;
		Label labelToJumpTo = null;

		MethodContext mc = mcRef.get();
		for (InstructionContext ic : mc.getInstructionContexts())
		{
			Instruction instruction = ic.getInstruction();
			if (!(instruction instanceof GetStatic))
			{
				continue;
			}

			if (((GetStatic) instruction).getField().equals(isMenuOpen))
			{
				InstructionContext isMenuOpenPopper = ic.getPushes().get(0).getPopped().get(0);
				Instruction isMenuOpenPopI = isMenuOpenPopper.getInstruction();

				// Unless there's a isMenuOpen in drawLoggedIn I missed (or something new got inlined (and I missed that)) this should never happen
				assert isMenuOpenPopI instanceof IfEq || isMenuOpenPopI instanceof IfNe : "isMenuOpen was popped by a " + isMenuOpenPopI + "?";

				// If the popper is a IfNe the label it's pointing to is the drawMenu one and topLeft is directly after it
				// else it's the other way around, obviously
				if (isMenuOpenPopI instanceof IfNe)
				{
					injectInvokeAfter = ((IfNe) isMenuOpenPopI).getTo();
				}
				else
				{
					injectInvokeAfter = isMenuOpenPopI;
				}
			}
			else if (((GetStatic) instruction).getField().equals(gameDrawMode))
			{
				List<Instruction> instrL = instruction.getInstructions().getInstructions();
				for (int i = instrL.indexOf(instruction); !(instruction instanceof Label); i--)
				{
					instruction = instrL.get(i);
				}

				labelToJumpTo = (Label) instruction;
			}

			if (injectInvokeAfter != null && labelToJumpTo != null)
			{
				break;
			}
		}

		if (injectInvokeAfter == null || labelToJumpTo == null)
		{
			throw new InjectException("Couldn't find the right location for DrawMenu to inject");
		}

		final Instructions instrs = mc.getMethod().getCode().getInstructions();
		int idx = instrs.getInstructions().indexOf(injectInvokeAfter);

		instrs.addInstruction(++idx, new InvokeStatic(instrs, DRAWMENU));
		instrs.addInstruction(++idx, new IfNe(instrs, labelToJumpTo));

		log.info("[INFO] DrawMenu injected a method call at index {} in method {}. With a comparison jumping to {}", idx, drawLoggedIn, labelToJumpTo);
	}
}
