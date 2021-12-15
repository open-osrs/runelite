/*
 * Copyright (c) 2021, Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.Dup;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.signature.Signature;

public class RuneLiteIterables extends AbstractInjector
{
	private static final String RUNELITE_ITERABLE_HASHTABLE = "RuneLiteIterableNodeHashTable";
	private static final String RUNELITE_ITERABLE_NODE_DEQUE = "RuneLiteIterableNodeDeque";
	private static final String RUNELITE_ITERABLE_LINK_DEQUE = "RuneLiteIterableLinkDeque";

	public RuneLiteIterables(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		injectHashTable();
		injectNodeDeque();
		injectLinkDeque();
	}

	public void injectHashTable()
	{
		ClassFile runeliteIterableHashTableVanilla = inject.vanilla.findClass(RUNELITE_ITERABLE_HASHTABLE);

		final ClassFile nodeHashTableVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass(RUNELITE_ITERABLE_HASHTABLE.replace("RuneLiteIterable", ""))
		);

		Method copy = new Method(nodeHashTableVanilla, "iterator", new Signature("()Ljava/util/Iterator;"));
		copy.setPublic();

		final Code code = new Code(copy);
		code.setMaxStack(3);
		copy.setCode(code);
		nodeHashTableVanilla.addMethod(copy);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		ins.add(new New(instructions, runeliteIterableHashTableVanilla.getPoolClass()));
		ins.add(new Dup(instructions));
		ins.add(new ALoad(instructions, 0));
		ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(runeliteIterableHashTableVanilla.getPoolClass(), "<init>", new Signature("(L" + nodeHashTableVanilla.getName() + ";)V"))));
		ins.add(new Return(instructions, InstructionType.ARETURN));
	}

	public void injectNodeDeque()
	{
		ClassFile runeliteIterableNodeDequeVanilla = inject.vanilla.findClass(RUNELITE_ITERABLE_NODE_DEQUE);

		final ClassFile nodeDequeVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass(RUNELITE_ITERABLE_NODE_DEQUE.replace("RuneLiteIterable", ""))
		);

		Method copy = new Method(nodeDequeVanilla, "iterator", new Signature("()Ljava/util/Iterator;"));
		copy.setPublic();

		final Code code = new Code(copy);
		code.setMaxStack(3);
		copy.setCode(code);
		nodeDequeVanilla.addMethod(copy);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		ins.add(new New(instructions, runeliteIterableNodeDequeVanilla.getPoolClass()));
		ins.add(new Dup(instructions));
		ins.add(new ALoad(instructions, 0));
		ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(runeliteIterableNodeDequeVanilla.getPoolClass(), "<init>", new Signature("(L" + nodeDequeVanilla.getName() + ";)V"))));
		ins.add(new Return(instructions, InstructionType.ARETURN));
	}

	public void injectLinkDeque()
	{
		ClassFile runeliteIterableLinkDequeVanilla = inject.vanilla.findClass(RUNELITE_ITERABLE_LINK_DEQUE);

		final ClassFile linkDequeVanilla = inject.toVanilla(
			inject.getDeobfuscated()
				.findClass(RUNELITE_ITERABLE_LINK_DEQUE.replace("RuneLiteIterable", ""))
		);

		Method copy = new Method(linkDequeVanilla, "iterator", new Signature("()Ljava/util/Iterator;"));
		copy.setPublic();

		final Code code = new Code(copy);
		code.setMaxStack(3);
		copy.setCode(code);
		linkDequeVanilla.addMethod(copy);

		final Instructions instructions = code.getInstructions();
		final List<Instruction> ins = instructions.getInstructions();

		ins.add(new New(instructions, runeliteIterableLinkDequeVanilla.getPoolClass()));
		ins.add(new Dup(instructions));
		ins.add(new ALoad(instructions, 0));
		ins.add(new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(runeliteIterableLinkDequeVanilla.getPoolClass(), "<init>", new Signature("(L" + linkDequeVanilla.getName() + ";)V"))));
		ins.add(new Return(instructions, InstructionType.ARETURN));
	}
}
