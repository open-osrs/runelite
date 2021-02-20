/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.rsapi;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.openosrs.injector.InjectException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.runelite.asm.Type;
import net.runelite.asm.pool.Class;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassReader;

@NoArgsConstructor
public class RSApi implements Iterable<RSApiClass>
{
	public static final String API_BASE = "net/runelite/rs/api/RS";
	public static final String RL_API_BASE = "net/runelite/api";
	public static final Type CONSTRUCT = new Type("Lnet/runelite/mapping/Construct;");
	public static final Type IMPORT = new Type("Lnet/runelite/mapping/Import;");

	private final List<RSApiClass> classes = new ArrayList<>();

	@Getter
	private final List<RSApiMethod> constructs = new ArrayList<>();

	private ImmutableMap<String, RSApiClass> map;

	public RSApi(File[] classes)
	{
		for (File file : classes)
		{
			if (!file.getName().startsWith("RS"))
			{
				continue;
			}

			try (InputStream is = new FileInputStream(file))
			{
				final ClassReader reader = new ClassReader(is);

				final RSApiClass apiClass = new RSApiClass();

				reader.accept(apiClass, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

				this.classes.add(apiClass);
			}
			catch (IOException e)
			{
				throw new InjectException(e);
			}
		}

		init();
	}

	@VisibleForTesting
	private void init()
	{
		final ImmutableMap.Builder<String, RSApiClass> builder = ImmutableMap.builder();

		for (RSApiClass clazz : this)
		{
			builder.put(clazz.getName(), clazz);
		}

		this.map = builder.build();

		for (RSApiClass clazz : this)
		{
			final List<RSApiClass> intfs = clazz.getApiInterfaces();
			for (Class intfPool : clazz.getInterfaces())
			{
				final RSApiClass intfApi = map.get(intfPool.getName());
				if (intfApi != null)
				{
					intfs.add(intfApi);
				}
			}

			// Collect all @Constructs, and build @Import maps
			clazz.init(constructs);
		}
	}

	public int size()
	{
		return classes.size();
	}

	public RSApiClass findClass(String name)
	{
		return map.get(name);
	}

	public boolean hasClass(String name)
	{
		return findClass(name) != null;
	}

	public RSApiClass withInterface(Class interf)
	{
		RSApiClass clazz = findClass(interf.getName());
		if (clazz != null)
		{
			return clazz;
		}

		for (RSApiClass apiC : this)
		{
			if (apiC.getInterfaces().contains(interf))
			{
				return apiC;
			}
		}

		return null;
	}

	@NotNull
	public Iterator<RSApiClass> iterator()
	{
		return classes.iterator();
	}

	@VisibleForTesting
	public List<RSApiClass> getClasses()
	{
		return classes;
	}

}
