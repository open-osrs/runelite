/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.asm.signature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import net.runelite.asm.Type;

public class Signature
{
	private static final Pattern RLAPITORSAPI = Pattern.compile("net/runelite/(rs/)?api/(RS)?");

	private final List<Type> arguments;
	private final Type rv;

	public Signature(List<Type> arguments, Type rv)
	{
		this.arguments = new ArrayList<>(arguments);
		this.rv = rv;
	}

	public Signature(String str)
	{
		final int rvStart = str.indexOf(')');
		if (rvStart == -1)
			throw new IllegalArgumentException("Descriptor has no return value!");

		rv = new Type(str.substring(rvStart + 1));
		arguments = findArgs(str, new ArrayList<>(), str.indexOf('(') + 1, rvStart);
	}

	public Signature(Signature other)
	{
		arguments = new ArrayList<>(other.arguments);
		rv = other.rv;
	}

	private static List<Type> findArgs(final String str, final List<Type> ret, final int from, final int to)
	{
		if (from >= to) return ret;

		int i = from;
		while (str.charAt(i) == '[') ++i;

		if (str.charAt(i) == 'L')
			i = str.indexOf(';', i);

		ret.add(new Type(str.substring(from, ++i)));

		return findArgs(str, ret, i, to);
	}

	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof Signature))
		{
			return false;
		}

		return this.toString().equals(other.toString());
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		for (Type a : arguments)
		{
			sb.append(a);
		}
		sb.append(')');
		sb.append(rv);
		return sb.toString();
	}

	public int size()
	{
		return arguments.size();
	}

	public void remove(int i)
	{
		arguments.remove(i);
	}

	public Type getTypeOfArg(int i)
	{
		return arguments.get(i);
	}

	public Type getReturnValue()
	{
		return rv;
	}

	public List<Type> getArguments()
	{
		return Collections.unmodifiableList(arguments);
	}

	public boolean isVoid()
	{
		return rv.equals(Type.VOID);
	}

	public static class Builder
	{
		private final List<Type> arguments = new ArrayList<>();
		private Type rv;

		public Builder setReturnType(Type type)
		{
			rv = type;
			return this;
		}

		public Builder addArgument(Type type)
		{
			arguments.add(type);
			return this;
		}

		public Builder addArgument(int idx, Type type)
		{
			arguments.add(idx, type);
			return this;
		}

		public Builder addArguments(Collection<Type> types)
		{
			arguments.addAll(types);
			return this;
		}

		public Signature build()
		{
			return new Signature(arguments, rv);
		}
	}

	public Signature rsApiToRsClient()
	{
		return new Signature(RLAPITORSAPI.matcher(this.toString()).replaceAll(""));
	}
}
