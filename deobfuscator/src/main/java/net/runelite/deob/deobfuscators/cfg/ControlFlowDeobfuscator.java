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

import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.Goto;
import net.runelite.deob.Deobfuscator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControlFlowDeobfuscator implements Deobfuscator
{
	private static final Logger logger = LoggerFactory.getLogger(ControlFlowDeobfuscator.class);

	private int insertedJump;
	private int placedBlocks;
	private int removedJumps;

	@Override
	public void run(ClassGroup group)
	{
		for (ClassFile cf : group.getClasses())
		{
			for (Method m : cf.getMethods())
			{
				Code code = m.getCode();

				if (code == null || !code.getExceptions().getExceptions().isEmpty())
				{
					continue;
				}

				run(code);
				runJumpLabel(code);
			}
		}

		logger.info("Inserted {} jumps, reordered {} blocks, and removed {} jumps. jump delta {}",
			insertedJump, placedBlocks, removedJumps, insertedJump - removedJumps);
	}

	private void run(Code code)
	{
		Instructions ins = code.getInstructions();

		ControlFlowGraph graph = new ControlFlowGraph(code);

		if (logger.isDebugEnabled()) // graph.toString() is expensive
		{
			logger.debug(graph.toString());
		}

		// Clear existing instructions as we are going to rebuild them
		ins.clear();
		final List<Block> sorted = graph.topologicalSort();
		for (Block b : sorted)
		{
			++placedBlocks;
			for (Instruction i : b.getInstructions())
			{
				ins.addInstruction(i);
				i.setInstructions(ins);
			}
			if (b.getSucc() != null && b.getInstructions().size() > 0)
			{
				final var i = b.getInstructions().get(b.getInstructions().size() - 1);
				if (!i.isTerminal())
				{
					final var next = b.getSucc();
					var maybeLabel = next.getInstructions().get(0);
					if (!(maybeLabel instanceof Label))
					{
						maybeLabel = new Label(ins);
						next.getInstructions().add(0, maybeLabel);
					}
					ins.addInstruction(new Goto(ins, (Label) maybeLabel));
					++insertedJump;
				}
			}
		}
	}

	/**
	 * remove jumps followed immediately by the label they are jumping to
	 */
	private void runJumpLabel(Code code)
	{
		Instructions ins = code.getInstructions();
		List<Instruction> instructions = ins.getInstructions();

		for (int i = 0; i < instructions.size() - 1; ++i)
		{
			Instruction i1 = instructions.get(i),
				i2 = instructions.get(i + 1);

			if (!(i1 instanceof Goto))
			{
				continue;
			}

			Goto g = (Goto) i1;
			assert g.getJumps().size() == 1;
			if (g.getJumps().get(0) != i2)
			{
				continue;
			}

			ins.remove(i1); // remove jump
			++removedJumps;

			// i now points to i2, so next loop we go to next instruction
		}
	}
}
