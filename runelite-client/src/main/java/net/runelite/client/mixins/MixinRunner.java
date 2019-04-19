package net.runelite.client.mixins;

import lombok.RequiredArgsConstructor;
import net.runelite.client.mixins.transformers.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.Map;

@RequiredArgsConstructor
public class MixinRunner
{
	
	private final Map<String, byte[]> classes;
	private final File patchesFolder;
	
	public Map<String, byte[]> run()
	throws InstantiationException, IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException
	{
		runVisitor(OverwriteTransformer.class);
		runVisitor(InjectTransformer.class);
		runVisitor(AppendTransformer.class); // append has to come before prepend or append does nothing
		// (test method:    Projectile.rl$$init()V    )
		runVisitor(PrependTransformer.class);
		runRemapper(ProtectTransformer.class);
		
		recalcMaxes();
		return classes;
	}
	
	private void runRemapper(Class<? extends Remapper> clazz) throws IllegalAccessException, InstantiationException
	{
		for (Map.Entry<String, byte[]> entry : classes.entrySet())
		{
			if (entry.getKey().contains("META-INF"))
			{
				continue;
			}
			Remapper inst = clazz.newInstance();
			ClassReader cr = new ClassReader(entry.getValue());
			ClassWriter cw = new ClassWriter(cr, 1);
			cr.accept(new ClassRemapper(cw, inst), 0);
			
			entry.setValue(cw.toByteArray());
		}
	}
	
	private void runVisitor(Class<? extends ClassVisitor> clazz)
	throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, IOException
	{
		runVisitor(clazz, 1);
	}
	
	private void runVisitor(Class<? extends ClassVisitor> clazz, int flags)
	throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, IOException
	{
		for (Map.Entry<String, byte[]> entry : classes.entrySet())
		{
			if (entry.getKey().contains("META-INF"))
			{
				continue;
			}
			ClassReader cr = new ClassReader(entry.getValue());
			ClassWriter cw = new ClassWriter(cr, flags);
			File patchF = new File(patchesFolder, entry.getKey());
			byte[] patch;
			if (patchF.exists())
			{
				patch = Files.readAllBytes(patchF.toPath());
			}
			else
			{
				patch = null;
			}
			ClassNode node = new ClassNode();
			cr.accept(node, 0);
			ClassVisitor inst = clazz.getConstructor(ClassVisitor.class, byte[].class, ClassNode.class).newInstance(cw,
					patch, node);
			cr.accept(inst, 0);
			
			entry.setValue(cw.toByteArray());
		}
	}
	
	private void recalcMaxes()
	throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException
	{
		runVisitor(DoNothingTransformer.class, 3);
	}
	
}
