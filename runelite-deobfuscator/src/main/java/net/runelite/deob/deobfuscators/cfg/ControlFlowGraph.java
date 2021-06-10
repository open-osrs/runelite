/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.deob.deobfuscators.cfg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.JumpingInstruction;

public class ControlFlowGraph
{
	private final Map<Label, Block> blocks = new HashMap<>();
	private final List<Block> allBlocks = new ArrayList<>();
	private final Block head;

	public ControlFlowGraph(Code code)
	{
		int id = 0;
		this.head = new Block();
		for (Instruction i : code.getInstructions())
			if (i instanceof Label)
				blocks.computeIfAbsent((Label) i, lbl -> {
					var b = new Block();
					allBlocks.add(b);
					return b;
				});

		allBlocks.add(0, head);
		Block cur = head;
		for (Instruction i : code.getInstructions())
		{
			if (i instanceof Label)
			{
				Block next = blocks.get(i);
				if (next.getId() == -1)
				{
					next.setId(id++);
				}
				if (next != cur)
				{
					Instruction last = cur.getInstructions().isEmpty()
						? null
						: cur.getInstructions().get(cur.getInstructions().size() - 1);
					if (last == null || !last.isTerminal())
					{
						assert next.getPred() == null;
						assert cur.getSucc() == null;
						// previous block flows directly into next
						next.setPred(cur);
						cur.setSucc(next);
					}
					cur = next;
				}
			}
			cur.addInstruction(i);
			if (i instanceof JumpingInstruction)
			{
				JumpingInstruction ji = (JumpingInstruction) i;
				for (Label l : ji.getJumps())
				{
					Block next = blocks.get(l);
					if (next.getId() == -1)
					{
						next.setId(id++);
					}
					cur.addNext(next);
					next.addPrev(cur);
				}
			}
		}

		assert head.getPred() == null;
	}

	List<Block> topologicalSort()
	{
		final List<Block> ret = new ArrayList<>();
		walk(head, ret, new HashSet<>());
		Collections.reverse(ret);
		return ret;
	}

	private static void walk(Block cur, List<Block> order, Set<Block> done)
	{
		Block dirsucc = cur.getSucc();
		if (dirsucc != null && done.add(dirsucc))
			walk(cur.getSucc(), order, done);
		List<Block> succs = cur.getSuccs();
		succs.sort(Block::compare);
		for (Block succ : succs)
			if (done.add(succ))
				walk(succ, order, done);
		order.add(cur);
	}

	public ControlFlowGraph(Block head)
	{
		this.head = head;
	}

	public Block getBlock(Label label)
	{
		return blocks.get(label);
	}

	public Collection<Block> getBlocks()
	{
		return allBlocks;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (Block b : allBlocks)
		{
			sb.append(b.toString());
		}
		return sb.toString();
	}

	public Block getHead()
	{
		return head;
	}
}
