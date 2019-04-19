package net.runelite.client.mixins.transformers;

import net.runelite.client.util.RefUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;

public class PrependTransformer extends ClassVisitor
{
	
	private final byte[] patch;
	private String className;
	private ClassNode classNode;
	
	public PrependTransformer(ClassVisitor classVisitor, byte[] patch, ClassNode node)
	{
		super(Opcodes.ASM6, classVisitor);
		this.patch = patch;
		this.classNode = node;
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
		if (patch == null)
		{
			return super.visitMethod(access, name, descriptor, signature, exceptions);
		}
		ClassReader cr = new ClassReader(patch);
		ClassNode patchNode = new ClassNode(Opcodes.ASM6);
		cr.accept(patchNode, 0);
		for (Object obj : patchNode.methods)
		{
			MethodNode patchMethod = (MethodNode) obj;
			if ((patchMethod.access == access && patchMethod.name.equals("prepend$" + name) &&
					     patchMethod.desc.equals(descriptor)) &&
					RefUtils.checkAnnotation(patchMethod, "Prepend"))
			{
				MethodVisitor mv =
						new MethodVisitor(Opcodes.ASM6, super.visitMethod(access, name, descriptor, signature,
								exceptions))
						{
						};
				mv.visitCode();
				
				AbstractInsnNode node = patchMethod.instructions.getLast();
				while (!(node instanceof InsnNode))
				{
					node = node.getPrevious();
				}
				
				if (RefUtils.isReturn(node.getOpcode()))
				{
					patchMethod.instructions.remove(node);
				}
				
				patchMethod.accept(new MethodReflector(mv));
				
				for (Object obj2 : classNode.methods)
				{
					MethodNode classMethod = (MethodNode) obj2;
					if (classMethod.access == access && classMethod.name.equals(name) &&
							classMethod.desc.equals(descriptor))
					{
						classMethod.accept(new MethodReflector(mv));
						break;
					}
				}
				
				mv.visitEnd();
				return mv;
			}
		}
		return super.visitMethod(access, name, descriptor, signature, exceptions);
	}
	
	@Override
	public void visitEnd()
	{
		if (patch == null)
		{
			super.visitEnd();
			return;
		}
		super.visitEnd();
	}
	
}
