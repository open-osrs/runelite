/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.rsapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import net.runelite.asm.Annotation;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Method;
import net.runelite.asm.signature.Signature;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import static com.openosrs.injector.rsapi.RSApi.CONSTRUCT;
import static com.openosrs.injector.rsapi.RSApi.IMPORT;

@Getter
@Setter
public class RSApiClass extends ClassVisitor implements Iterable<RSApiMethod>
{
	private Class clazz;
	private final List<Class> interfaces = new ArrayList<>();
	private final List<RSApiMethod> methods = new ArrayList<>();
	private final List<RSApiClass> apiInterfaces = new ArrayList<>();

	private final Map<String, List<RSApiMethod>> imports = new HashMap<>();

	RSApiClass()
	{
		super(Opcodes.ASM5);
	}

	void init(List<RSApiMethod> constructList)
	{
		for (RSApiMethod method : this)
		{
			if (method.isSynthetic())
			{
				continue;
			}

			if (method.findAnnotation(CONSTRUCT) != null)
			{
				constructList.add(method);
				continue;
			}

			final Annotation imported = method.findAnnotation(IMPORT);
			if (imported != null)
			{
				imports.computeIfAbsent(
					imported.getValueString(),
					(str) -> new ArrayList<>()
				).add(method);
			}
		}
	}

	RSApiMethod addMethod(String name, Signature sig, int access)
	{
		final RSApiMethod method = new RSApiMethod(new Method(clazz, name, sig), access);
		methods.add(method);
		return method;
	}

	public String getName()
	{
		return clazz.getName();
	}

	public void fetchImported(List<RSApiMethod> to, String str)
	{
		List<RSApiMethod> imported = imports.get(str);
		if (imported == null)
		{
			return;
		}

		to.addAll(imported);
	}

	@NotNull
	public Iterator<RSApiMethod> iterator()
	{
		return this.methods.iterator();
	}

	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
	{
		clazz = new Class(name);

		for (String s : interfaces)
		{
			this.interfaces.add(new Class(s));
		}
	}

	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
	{
		return addMethod(name, new Signature(desc), access);
	}
}
