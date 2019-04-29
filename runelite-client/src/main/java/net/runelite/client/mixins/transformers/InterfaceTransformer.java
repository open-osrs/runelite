package net.runelite.client.mixins.transformers;

import lombok.extern.slf4j.Slf4j;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class InterfaceTransformer extends ClassVisitor implements Opcodes
{
	
	private final byte[] patch;
	private ClassNode node;
	private String className;
	
	public InterfaceTransformer(ClassVisitor classVisitor, byte[] patch, ClassNode node)
	{
		super(Opcodes.ASM6, classVisitor);
		this.patch = patch;
		this.node = node;
	}
	
	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
	{
		className = name;
		if(patch != null)
		{
			ClassReader reader = new ClassReader(patch);
			ClassNode pNode = new ClassNode();
			reader.accept(pNode, 0);
			if(pNode.interfaces != null && pNode.interfaces.size() != 0)
			{
				if(interfaces == null)
				{
					interfaces = (String[]) pNode.interfaces.toArray(new String[0]);
				}
				else
				{
					ArrayList<String> list = new ArrayList<>(Arrays.asList(interfaces));
					pNode.interfaces.forEach((s) -> list.add((String) s));
					interfaces = list.toArray(new String[0]);
				}
			}
		}
		super.visit(version, access, name, signature, superName, interfaces);
	}
	
}
