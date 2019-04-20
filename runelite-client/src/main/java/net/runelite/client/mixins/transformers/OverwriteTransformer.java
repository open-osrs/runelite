package net.runelite.client.mixins.transformers;

import net.runelite.client.util.RefUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class OverwriteTransformer extends ClassVisitor
{
	
	private final byte[] patch;
	private ClassNode node;
	private String className;
	
	public OverwriteTransformer(ClassVisitor classVisitor, byte[] patch, ClassNode node)
	{
		super(Opcodes.ASM6, classVisitor);
		this.patch = patch;
		this.node = node;
	}
	
	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
	{
		className = name;
		super.visit(version, access, name, signature, superName, interfaces);
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions)
	{
		if (patch == null || name.startsWith("1protect$"))
		{
			return super.visitMethod(access, name, descriptor, signature, exceptions);
		}
		
		if (name.startsWith("prepend$") || name.startsWith("append$"))
		{
			return null;
		}
		
		ClassReader cr = new ClassReader(patch);
		ClassNode patchNode = new ClassNode(Opcodes.ASM6);
		cr.accept(patchNode, 0);
		
		for (Object obj : patchNode.methods)
		{
			MethodNode patchMethod = (MethodNode) obj;
			
			if (patchMethod.access == access && patchMethod.name.equals(name) && patchMethod.desc.equals(descriptor))
			{
				if (RefUtils.checkAnnotation(patchMethod, "Overwrite"))
				{
					MethodVisitor mv =
							new MethodVisitor(Opcodes.ASM6, super.visitMethod(access, name, descriptor, signature,
									exceptions))
							{
							};
					mv.visitCode();
					patchMethod.accept(new MethodReflector(mv));
					mv.visitEnd();
					return mv;
				}
			}
		}
		return super.visitMethod(access, name, descriptor, signature, exceptions);
	}
}
