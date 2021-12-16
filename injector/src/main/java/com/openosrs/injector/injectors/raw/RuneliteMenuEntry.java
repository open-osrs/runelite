/*
 * Copyright (c) 2021, Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.List;
import java.util.ListIterator;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.BAStore;
import net.runelite.asm.attributes.code.instructions.Dup;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.signature.Signature;

public class RuneliteMenuEntry extends AbstractInjector
{
	private static final String RUNELITE_MENU_ENTRY = "RuneLiteMenuEntry";

	public RuneliteMenuEntry(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		addInvoke();
		addSwap(InjectUtil.findMethod(inject, "incrementMenuEntries"));
		addSwap(InjectUtil.findMethod(inject, "decrementMenuEntries"));
	}

	private void addInvoke()
	{
		ClassFile runeliteMenuEntryVanilla = inject.vanilla.findClass(RUNELITE_MENU_ENTRY);

		final ClassFile clientVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass("Client")
		);

		Method copy = clientVanilla.findMethod("newRuneliteMenuEntry");
		copy.setPublic();

		final Code code = new Code(copy);
		code.setMaxStack(3);
		copy.setCode(code);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		ins.add(new New(instructions, runeliteMenuEntryVanilla.getPoolClass()));
		ins.add(new Dup(instructions));
		ins.add(new ILoad(instructions, 0));
		ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(runeliteMenuEntryVanilla.getPoolClass(), "<init>", new Signature("(I)V"))));
		ins.add(new Return(instructions, InstructionType.ARETURN));
	}

	private void addSwap(Method method)
	{
		final ClassFile clientVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass("Client")
		);

		Instructions ins = method.getCode().getInstructions();
		ListIterator<Instruction> iterator = ins.getInstructions().listIterator();
		while (iterator.hasNext())
		{
			Instruction i = iterator.next();

			if (!(i instanceof BAStore))
			{
				continue;
			}

			ILoad i1 = new ILoad(ins, 2);
			InvokeStatic i2 = new InvokeStatic(ins, new net.runelite.asm.pool.Method(clientVanilla.getPoolClass(), "swapMenuEntries", new Signature("(I)V")));

			iterator.add(i1);
			iterator.add(i2);

			return;
		}
	}
}
