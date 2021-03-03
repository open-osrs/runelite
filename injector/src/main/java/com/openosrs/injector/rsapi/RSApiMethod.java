/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.rsapi;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import net.runelite.asm.Annotation;
import net.runelite.asm.Named;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Annotated;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Method;
import net.runelite.asm.signature.Signature;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

@Getter
@Setter
public class RSApiMethod extends MethodVisitor implements Annotated, Named
{
	private final Method method;
	private final int accessFlags;
	private final Map<Type, Annotation> annotations = new HashMap<>();
	private boolean injected;

	RSApiMethod(Method method, int accesFlags)
	{
		super(Opcodes.ASM5);
		this.method = method;
		this.accessFlags = accesFlags;
	}

	public Class getClazz()
	{
		return method.getClazz();
	}

	public String getName()
	{
		return method.getName();
	}

	public Signature getSignature()
	{
		return method.getType();
	}

	public boolean isSynthetic()
	{
		return (accessFlags & Opcodes.ACC_SYNTHETIC) != 0;
	}

	public boolean isDefault()
	{
		return (accessFlags & (Opcodes.ACC_ABSTRACT | Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC)) == 1;
	}

	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible)
	{
		final var annotation = new Annotation(new Type(descriptor), visible);
		this.addAnnotation(annotation);
		return annotation;
	}
}
