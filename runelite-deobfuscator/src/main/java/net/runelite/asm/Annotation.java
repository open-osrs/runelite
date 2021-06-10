/*
 * Copyright (c) 2020, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.asm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Note: this class has a natural ordering that is inconsistent with equals.
 */
public class Annotation extends AnnotationVisitor implements Comparable<Annotation>
{
	/**
	 * Name:Value pairs in this annotation. Uses a tree map to make order reproducible.
	 *
	 * Data can be any of the following:
	 * - Primitive values
	 * - Strings
	 * - Class objects
	 * - Enum constants (not implemented)
	 * - Arrays of any of the above (use {@link ArrayList}
	 * - Other Annotations
	 */
	private final TreeMap<String, Object> data = new TreeMap<>();
	private final Type type;
	/**
	 * Unused for now but here for easy implementation later if anyone wants to
	 */
	private final boolean visible;

	public Annotation(Type type)
	{
		this(type, true);
	}

	public Annotation(Type type, Object val)
	{
		this(type);
		this.setElement(val);
	}

	public Annotation(Type type, boolean visible)
	{
		super(Opcodes.ASM5);
		this.type = type;
		this.visible = visible;
	}

	public Type getType()
	{
		return type;
	}

	public void addElement(String name, Object value)
	{
		if (data.put(name, value) != null)
			throw new IllegalStateException("The annotation already contains a value mapped to " + name);
	}

	public void addElement(Object value)
	{
		addElement("value", value);
	}

	public void setElement(String name, Object value)
	{
		data.put(name, value);
	}

	public void setElement(Object value)
	{
		setElement("value", value);
	}

	public Object remove(String name)
	{
		return data.remove(name);
	}

	public Object get(String name)
	{
		return data.get(name);
	}

	public Object getValue()
	{
		return get("value");
	}

	public String getValueString()
	{
		return (String) getValue();
	}

	public int size()
	{
		return data.size();
	}

	@Override
	public void visit(String name, Object value)
	{
		data.put(name, value);
	}

	@Override
	public AnnotationVisitor visitAnnotation(String name, String descriptor)
	{
		final var annotation = new Annotation(new Type(descriptor));
		data.put(name, annotation);
		return annotation;
	}

	@Override
	public AnnotationVisitor visitArray(String name)
	{
		final var lst = new ArrayList<>();
		data.put(name, lst);
		return new AnnotationVisitor(Opcodes.ASM5)
		{
			@Override
			public void visit(String name, Object value)
			{
				lst.add(value);
			}
			@Override
			public AnnotationVisitor visitAnnotation(String name, String descriptor)
			{
				Annotation annotation = new Annotation(new Type(descriptor));
				lst.add(annotation);
				return annotation;
			}
		};
	}

	public void accept(AnnotationVisitor visitor)
	{
		if (visitor == null)
			return;

		for (var entry : data.entrySet())
			accept(visitor, entry.getKey(), entry.getValue());

		visitor.visitEnd();
	}

	private static void accept(AnnotationVisitor visitor, final String name, final Object value)
	{
		if (visitor == null)
			return;

		if (value instanceof Annotation)
		{
			Annotation annotation = (Annotation) value;
			annotation.accept(visitor.visitAnnotation(name, annotation.getType().toString()));
		}
		else if (value instanceof List)
		{
			AnnotationVisitor arr = visitor.visitArray(name);
			List<?> arrayValue = (List<?>) value;

			for (Object o : arrayValue)
			{
				accept(arr, null, o);
			}

			arr.visitEnd();
		}
		else
		{
			visitor.visit(name, value);
		}
	}

	@Override
	public int compareTo(@NotNull Annotation that)
	{
		return this.type.toString().compareTo(that.type.toString());
	}

	@Override
	public String toString()
	{
		StringBuilder str = new StringBuilder('@' + type.toAsmString().replace('/', '.') + '(');
		for (Map.Entry<String, Object> e : data.entrySet())
			str.append(e.getKey()).append('=').append(e.getValue().toString());
		str.append(')');
		return str.toString();
	}
}
