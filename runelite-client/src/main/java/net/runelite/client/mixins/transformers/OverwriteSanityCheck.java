package net.runelite.client.mixins.transformers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.mixins.SanityChecker;
import net.runelite.client.util.RefUtils;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;

@Slf4j
public class OverwriteSanityCheck extends SanityChecker implements Opcodes
{
	
	private String className;
	private ClassNode patchNode;
	public static final ArrayList<String> methodsUsed = new ArrayList<>();
	
	public OverwriteSanityCheck(ClassVisitor classVisitor, ClassNode node)
	{
		super(ASM6, classVisitor);
		this.className = node.name;
		this.patchNode = node;
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions)
	{
		String check = String.format("%s %s %s %s", className, name,
				descriptor, access);
		
		MethodNode methodNode = null;
		for (Object obj2 : patchNode.methods)
		{
			MethodNode classMethod = (MethodNode) obj2;
			if (classMethod.access == access && classMethod.name.equals(name) &&
					classMethod.desc.equals(descriptor))
			{
				methodNode = classMethod;
			}
		}
		
		if(methodNode == null)
		{
			log.error("[OverwriteSanity] Failed to find original patch method for {}", check);
			return super.visitMethod(access, name, descriptor, signature, exceptions);
		}
		
		if (!RefUtils.checkAnnotation(methodNode, "Overwrite"))
		{
			return super.visitMethod(access, name, descriptor, signature, exceptions);
		}
		
		if (!methodsUsed.contains(check))
		{
			throw new RuntimeException("[OverwriteSanity] Overwrite target not found: " + check);
		}
		return super.visitMethod(access, name, descriptor, signature, exceptions);
	}
	
	@Override
	public void run()
	{
		/*for (Object obj : patchNode.methods)
		{
			MethodNode methodNode = (MethodNode) obj;
			String check = String.format("%s %s %s %s", className, methodNode.name,
					methodNode.desc, methodNode.access);
			log.info("Running sanity checker for {}", check);
			if (methodNode.visibleAnnotations != null)
			{
				for (Object obj2 : methodNode.visibleAnnotations)
				{
					AnnotationNode annot = (AnnotationNode) obj2;
					log.info(annot.desc);
				}
			}
			if (!RefUtils.checkAnnotation(methodNode, "Overwrite"))
			{
				return;
			}
			if (!methodsUsed.contains(check))
			{
				throw new RuntimeException("Overwrite target not found: " + check);
			}
		}*/
	}
}
