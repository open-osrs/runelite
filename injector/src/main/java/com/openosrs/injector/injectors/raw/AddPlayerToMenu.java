/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * Copyright (c) 2020, ThatGamerBlue <https://github.com/ThatGamerBlue>
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.ComparisonInstruction;
import net.runelite.asm.attributes.code.instruction.types.JumpingInstruction;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.BiPush;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IAnd;
import net.runelite.asm.attributes.code.instructions.IfACmpEq;
import net.runelite.asm.attributes.code.instructions.IfACmpNe;
import net.runelite.asm.attributes.code.instructions.IfICmpNe;
import net.runelite.asm.attributes.code.instructions.IfNe;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.pool.Field;

public class AddPlayerToMenu extends AbstractInjector
{
	public AddPlayerToMenu(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		final Method addPlayerOptions = InjectUtil.findMethod(inject, "addPlayerToMenu");
		final net.runelite.asm.pool.Method shouldHideAttackOptionFor =
			inject.getVanilla().findClass("client").findMethod("shouldHideAttackOptionFor").getPoolMethod();
		final net.runelite.asm.pool.Method shouldDrawMethod =
			inject.getVanilla().findStaticMethod("shouldDraw").getPoolMethod();

		try
		{
			injectSameTileFix(addPlayerOptions, shouldDrawMethod);
			injectHideAttack(addPlayerOptions, shouldHideAttackOptionFor);
			injectHideCast(addPlayerOptions, shouldHideAttackOptionFor);
		}
		catch (InjectException | AssertionError e)
		{
			log.warn("[WARN] HidePlayerAttacks failed, but as this doesn't mess up anything other than that functionality, we're carrying on", e);
		}
	}

	private void injectSameTileFix(Method addPlayerOptions, net.runelite.asm.pool.Method shouldDrawMethod)
	{
		// ALOAD 0
		// ICONST_0
		// INVOKESTATIC Scene.shouldDraw
		// IFNE CONTINUE_LABEL                     if returned true then jump to continue
		// RETURN
		// CONTINUE_LABEL
		// REST OF METHOD GOES HERE
		Instructions insns = addPlayerOptions.getCode().getInstructions();
		Label CONTINUE_LABEL = new Label(insns);
		List<Instruction> prependList = new ArrayList<>()
		{{
			add(new ALoad(insns, 0));
			add(new LDC(insns, 0));
			add(new InvokeStatic(insns, shouldDrawMethod));
			add(new IfNe(insns, CONTINUE_LABEL));
			add(new Return(insns, InstructionType.RETURN));
			add(CONTINUE_LABEL);
		}};
		int i = 0;
		for (Instruction instruction : prependList)
		{
			insns.addInstruction(i++, instruction);
		}
	}

	private void injectHideAttack(Method addPlayerOptions, net.runelite.asm.pool.Method shouldHideAttackOptionFor)
	{
		final Field AttackOption_hidden =
			InjectUtil.findField(inject, "AttackOption_hidden", "AttackOption").getPoolField();
		final Field attackOption = InjectUtil.findField(inject, "playerAttackOption", "Client").getPoolField();

		// GETSTATIC					GETSTATIC
		// GETSTATIC					GETSTATIC
		// IFACMPEQ -> label continue	IFACMPNE -> label whatever lets carry on
		//								MORE OBFUSCATION

		int injectIdx = -1;
		Instruction labelIns = null;
		Label label = null;

		Instructions ins = addPlayerOptions.getCode().getInstructions();
		Iterator<Instruction> iterator = ins.getInstructions().iterator();
		while (iterator.hasNext())
		{
			Instruction i = iterator.next();
			if (!(i instanceof GetStatic))
			{
				continue;
			}

			Field field = ((GetStatic) i).getField();
			if (!field.equals(AttackOption_hidden) && !field.equals(attackOption))
			{
				continue;
			}

			i = iterator.next();
			if (!(i instanceof GetStatic))
			{
				continue;
			}

			field = ((GetStatic) i).getField();
			if (!field.equals(AttackOption_hidden) && !field.equals(attackOption))
			{
				continue;
			}

			i = iterator.next();
			if (!(i instanceof ComparisonInstruction && i instanceof JumpingInstruction))
			{
				log.info("[INFO] You're not supposed to see this lol");
				continue;
			}

			if (i instanceof IfACmpEq)
			{
				injectIdx = ins.getInstructions().indexOf(i) + 1;
				label = ((IfACmpEq) i).getJumps().get(0);
			}
			else if (i instanceof IfACmpNe)
			{
				injectIdx = ins.getInstructions().indexOf(((IfACmpNe) i).getJumps().get(0)) + 1;
				// We're gonna have to inject a extra label
				labelIns = iterator.next();
			}

			break;
		}

		if (injectIdx <= 0 || label == null && labelIns == null)
		{
			throw new InjectException("HidePlayerAttacks failed");
		}

		// Load the player
		ALoad i1 = new ALoad(ins, 0);
		// Get the boolean
		InvokeStatic i2 = new InvokeStatic(ins, shouldHideAttackOptionFor);

		ins.addInstruction(injectIdx, i1);
		ins.addInstruction(injectIdx + 1, i2);

		if (label == null)
		{
			label = ins.createLabelFor(labelIns);
			ins.rebuildLabels();
			injectIdx = ins.getInstructions().indexOf(i2) + 1;
		}

		// Compare n such
		IfNe i3 = new IfNe(ins, label);

		ins.addInstruction(injectIdx, i3);
	}

	private void injectHideCast(Method addPlayerOptions, net.runelite.asm.pool.Method shouldHideAttackOptionFor)
	{
		// LABEL before
		// BIPUSH 8
		// LDC (garbage)
		// GETSTATIC selectedSpellFlags
		// IMUL
		// BIPUSH 8
		// IAND
		// IF_ICMPNE -> skip adding option
		//
		// <--- Inject call here
		// <--- Inject comparison here (duh)
		//
		// add option n such
		final Field flags = InjectUtil.findField(inject, "selectedSpellFlags", "Client").getPoolField();
		Instructions ins = addPlayerOptions.getCode().getInstructions();
		ListIterator<Instruction> iterator = ins.getInstructions().listIterator();
		boolean b1, b2, iAnd, getstatic;
		b1 = b2 = iAnd = getstatic = false;
		while (iterator.hasNext())
		{
			Instruction i = iterator.next();

			if (i instanceof Label)
			{
				b1 = b2 = iAnd = getstatic = false;
				continue;
			}

			if ((i instanceof BiPush) && (byte) ((BiPush) i).getConstant() == 8)
			{
				if (!b1)
				{
					b1 = true;
				}
				else if (!b2)
				{
					b2 = true;
				}
				else
				{
					throw new InjectException("3 bipushes? fucking mental, Hide spells failed btw");
				}

				continue;
			}

			if (i instanceof IAnd)
			{
				iAnd = true;
				continue;
			}

			if (i instanceof GetStatic && ((GetStatic) i).getField().equals(flags))
			{
				getstatic = true;
				continue;
			}

			if (!(i instanceof JumpingInstruction))
			{
				if (b1 && b2 && iAnd && getstatic)
				{
					throw new InjectException("@ me in discord if this shit is broken lol, hide spells failed btw");
				}
				continue;
			}

			if (!(b1 && b2 && iAnd && getstatic))
			{
				continue;
			}

			Label target;
			if (i instanceof IfICmpNe)
			{
				target = ((IfICmpNe) i).getJumps().get(0);
			}
			else
			{
				throw new InjectException("@ me in discord if this shit is broken lol, hide spells failed btw");
			}

			// Load the player
			ALoad i1 = new ALoad(ins, 0);
			// Get the boolean
			InvokeStatic i2 = new InvokeStatic(ins, shouldHideAttackOptionFor);
			// Compare n such
			IfNe i3 = new IfNe(ins, target);

			iterator.add(i1);
			iterator.add(i2);
			iterator.add(i3);
			return;
		}
	}
}
