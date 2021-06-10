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
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Label;

@Getter
@Setter
public class Block
{
	private int id = -1;
	private boolean jumptarget; // block is unconditionally jumped to

	/**
	 * blocks which jump here
	 */
	private final List<Block> preds = new ArrayList<>();

	/**
	 * blocks which this jumps to
	 */
	private final List<Block> succs = new ArrayList<>();

	/**
	 * block which flows directly into this block
	 */
	private Block pred;

	/**
	 * block which this directly flows into
	 */
	private Block succ;

	/**
	 * instructions in this block
	 */
	private final List<Instruction> instructions = new ArrayList<>();

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Block ID ").append(id).append("\n");
		if (pred != null)
		{
			sb.append(" flows from ").append(pred.id).append("\n");
		}
		for (Instruction i : instructions)
		{
			sb.append("  ").append(i.toString()).append("\n");
		}
		if (succ != null)
		{
			sb.append(" flows into ").append(succ.id).append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}

	public void addInstruction(int idx, Instruction i)
	{
		assert !instructions.contains(i);
		instructions.add(idx, i);
	}

	public void addInstruction(Instruction i)
	{
		assert !instructions.contains(i);
		instructions.add(i);
	}

	public void addPrev(Block block)
	{
		if (!preds.contains(block))
		{
			preds.add(block);
		}
	}

	public void addNext(Block block)
	{
		if (!succs.contains(block))
		{
			succs.add(block);
		}
	}

	static int compare(Block a, Block b)
	{
		final int l1 = a.getLineNumber();
		final int l2 = b.getLineNumber();
		if (l1 == l2 || l1 == -1 || l2 == -1)
			return 0;
		return Integer.compare(l1, l2);
	}

	private int getLineNumber()
	{
		for (Instruction i : instructions)
			if (i instanceof Label)
				if (((Label) i).getLineNumber() != null)
					return ((Label) i).getLineNumber();
		return -1;
	}
}
