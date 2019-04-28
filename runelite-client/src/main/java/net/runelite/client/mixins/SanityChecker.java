package net.runelite.client.mixins;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public abstract class SanityChecker extends ClassVisitor implements Opcodes
{
	protected SanityChecker(int i, ClassVisitor classVisitor)
	{
		super(i, classVisitor);
	}
	
	public abstract void run();
	
}
