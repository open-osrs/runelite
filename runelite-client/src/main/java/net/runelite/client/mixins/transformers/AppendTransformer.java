package net.runelite.client.mixins.transformers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.util.RefUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

@Slf4j
public class AppendTransformer extends ClassVisitor implements Opcodes
{
	
	private final byte[] patch;
	private String className;
	private ClassNode classNode;
	
	public AppendTransformer(ClassVisitor classVisitor, byte[] patch, ClassNode node)
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
			if ((patchMethod.access == access && patchMethod.name.equals("append$" + name) &&
					     patchMethod.desc.equals(descriptor)) &&
					RefUtils.checkAnnotation(patchMethod, "Append"))
			{
				MethodVisitor mv =
						new MethodVisitor(Opcodes.ASM6, super.visitMethod(access, name, descriptor, signature,
								exceptions))
						{
						};
				mv.visitCode();
				
				for (Object obj2 : classNode.methods)
				{
					MethodNode classMethod = (MethodNode) obj2;
					if (classMethod.access == access && classMethod.name.equals(name) &&
							classMethod.desc.equals(descriptor))
					{
						AbstractInsnNode inode = classMethod.instructions.getLast();
						
						while(inode instanceof LabelNode || inode instanceof LineNumberNode)
						{
							inode = inode.getPrevious();
						}
						
						if(RefUtils.isReturn(inode.getOpcode(), true))
						{
							log.error("[Append] Can't append to {}.{}, requires typed return opcode", className, name);
							return super.visitMethod(access, name, descriptor, signature, exceptions);
						}
						
						classMethod.instructions.remove(inode);
						
						classMethod.accept(new MethodReflector(mv));
						break;
					}
				}
				
				patchMethod.accept(new MethodReflector(mv));
				
				mv.visitEnd();
				return mv;
			}
		}
		return super.visitMethod(access, name, descriptor, signature, exceptions);
	}
}
