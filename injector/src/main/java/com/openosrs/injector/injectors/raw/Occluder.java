/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.ListIterator;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.BiPush;

public class Occluder extends AbstractInjector
{
	private static final byte OLDVALUE = 25;
	private static final byte NEWVALUE = 90;

	public Occluder(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		/*
		 * This class the max view distance length, higher than this is useless though
		 */
		final Method occlude = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass("Scene")
				.findMethod("occlude")
		);

		int replaced = 0;

		final Code code = occlude.getCode();
		final Instructions ins = code.getInstructions();
		final ListIterator<Instruction> it = ins.listIterator();

		while (it.hasNext())
		{
			Instruction i = it.next();

			if (!(i instanceof BiPush))
			{
				continue;
			}

			boolean shouldChange = (byte) ((BiPush) i).getConstant() == OLDVALUE;

			if (!shouldChange)
			{
				continue;
			}

			replaced++;

			Instruction biPush = new BiPush(ins, NEWVALUE);

			it.set(biPush);
		}

		if (replaced != 10)
		{
			throw new InjectException("Only found " + replaced + " 25's to replace in occlude instead of expected 10");
		}
	}
}
