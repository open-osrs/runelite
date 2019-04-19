package net.runelite.client.mixins.transformers;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

public class DoNothingTransformer extends ClassVisitor
{
	public DoNothingTransformer(ClassVisitor parent, byte[] patch, ClassNode node)
	{
		super(Opcodes.ASM6, parent);
	}
}
