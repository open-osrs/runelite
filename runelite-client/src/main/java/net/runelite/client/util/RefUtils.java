package net.runelite.client.util;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class RefUtils implements Opcodes
{
	
	private static final String TYPE_PREFIX = "xyz/pklite/patchcreator/annotations/";
	
	public static boolean isReturn(int opcode, boolean checkType)
	{
		return (opcode == RETURN && !checkType) || opcode == IRETURN || opcode == LRETURN || opcode == DRETURN ||
				opcode == ARETURN || opcode == FRETURN;
	}
	
	public static boolean isReturn(int opcode)
	{
		return isReturn(opcode, false);
	}
	
	public static boolean checkAnnotation(MethodNode method, String annotation)
	{
		if (method.visibleAnnotations != null)
		{
			for (Object obj : method.visibleAnnotations)
			{
				AnnotationNode annot = (AnnotationNode) obj;
				if (((AnnotationNode) obj).desc.equals(makeAnnotationDesc(annotation)))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkAnnotation(FieldNode field, String annotation)
	{
		if (field.visibleAnnotations != null)
		{
			for (Object obj : field.visibleAnnotations)
			{
				if (((AnnotationNode) obj).desc.equals(makeAnnotationDesc(annotation)))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static String makeAnnotationDesc(String annot)
	{
		return "L" + TYPE_PREFIX + annot + ";";
	}
	
}
