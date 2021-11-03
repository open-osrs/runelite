package net.runelite.deob.deobfuscators.transformers;

import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.VReturn;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.Transformer;

public class GraphicsObjectTransformer implements Transformer // robots in disguise
{
	private static final String GRAPHICS_OBJECT = "GraphicsObject";
	private static final String RENDERABLE = "Renderable";

	@Override
	public void transform(ClassGroup group)
	{
		ClassFile graphicsObject = group.findClass(GRAPHICS_OBJECT);
		ClassFile renderable = group.findClass(RENDERABLE);

		graphicsObject.clearFinal();

		Method initGraphicsObject = new Method(graphicsObject, "<init>", new Signature("()V"));
		initGraphicsObject.setPublic();

		final Code code = new Code(initGraphicsObject);
		code.setMaxStack(1);
		initGraphicsObject.setCode(code);
		graphicsObject.addMethod(initGraphicsObject);

		Instructions ins = code.getInstructions();

		ins.addInstruction(new ALoad(ins, 0));
		ins.addInstruction(new InvokeSpecial(ins, new net.runelite.asm.pool.Method(renderable.getPoolClass(), "<init>", new Signature("()V"))));
		ins.addInstruction(new VReturn(ins));
	}
}
