package net.runelite.injector.raw;

import com.google.common.base.Stopwatch;
import java.util.Iterator;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.ComparisonInstruction;
import net.runelite.asm.attributes.code.instruction.types.JumpingInstruction;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IfACmpEq;
import net.runelite.asm.attributes.code.instructions.IfACmpNe;
import net.runelite.asm.attributes.code.instructions.IfNe;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.pool.Field;
import net.runelite.injector.Inject;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.InjectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HidePlayerAttacks
{
	private final Logger log = LoggerFactory.getLogger(HidePlayerAttacks.class);
	private final Inject inject;

	public HidePlayerAttacks(Inject inject)
	{
		this.inject = inject;
	}

	public void inject() throws InjectionException
	{
		Stopwatch stopwatch = Stopwatch.createStarted();

		final Method addPlayerOptions = InjectUtil.findStaticMethod(inject, "addPlayerToMenu");
		final Field AttackOption_hidden = InjectUtil.findDeobField(inject, "AttackOption_hidden", "AttackOption").getPoolField();
		final Field attackOption = InjectUtil.findDeobField(inject, "playerAttackOption", "Client").getPoolField();
		final net.runelite.asm.pool.Method shouldHideAttackOptionFor = inject.getVanilla().findClass("client").findMethod("shouldHideAttackOptionFor").getPoolMethod();

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
				log.info("You're not supposed to see this lol");
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
			throw new InjectionException("HidePlayerAttacks failed");
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

		stopwatch.stop();

		log.info("HidePlayerAttacks took {}", stopwatch.toString());
	}
}
