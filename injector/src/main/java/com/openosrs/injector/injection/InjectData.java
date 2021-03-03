/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injection;

import com.google.common.collect.ImmutableMap;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injectors.Injector;
import com.openosrs.injector.rsapi.RSApi;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import lombok.Getter;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.signature.Signature;

/**
 * Abstract class meant as the interface of {@link com.openosrs.injector.Injector injection} for injectors
 */
public abstract class InjectData
{
	public static final String HOOKS = "net/runelite/client/callback/Hooks";
	public static final String CALLBACKS = "net/runelite/api/hooks/Callbacks";

	@Getter
	public ClassGroup vanilla;

	@Getter
	public ClassGroup deobfuscated;

	@Getter
	public ClassGroup mixins;

	@Getter
	public RSApi rsApi;

	/**
	 * Deobfuscated ClassFiles -> Vanilla ClassFiles
	 */
	public Map<ClassFile, ClassFile> toVanilla;

	/**
	 * Strings -> Deobfuscated ClassFiles
	 * keys:
	 * - Obfuscated name
	 * - RSApi implementing name
	 */
	private final Map<String, ClassFile> toDeob = new HashMap<>();

	public abstract void runChildInjector(Injector injector);

	public void initToVanilla()
	{
		ImmutableMap.Builder<ClassFile, ClassFile> toVanillaB = ImmutableMap.builder();

		for (final ClassFile deobClass : deobfuscated)
		{
			if (deobClass.getName().startsWith("net/runelite/"))
			{
				continue;
			}

			final String obName = InjectUtil.getObfuscatedName(deobClass);
			if (obName != null)
			{
				toDeob.put(obName, deobClass);

				// Can't be null
				final ClassFile obClass = this.vanilla.findClass(obName);
				toVanillaB.put(deobClass, obClass);
			}
		}

		this.toVanilla = toVanillaB.build();
	}

	/**
	 * Deobfuscated ClassFile -> Vanilla ClassFile
	 */
	public ClassFile toVanilla(ClassFile deobClass)
	{

		return toVanilla.get(deobClass);
	}

	/**
	 * Deobfuscated Method -> Vanilla Method
	 */
	public Method toVanilla(Method deobMeth)
	{
		final ClassFile obC = toVanilla(deobMeth.getClassFile());

		String name = InjectUtil.getObfuscatedName(deobMeth);

		Signature sig = deobMeth.getObfuscatedSignature();
		if (sig == null)
		{
			sig = deobMeth.getDescriptor();
		}

		return obC.findMethod(name, sig);
	}

	/**
	 * Deobfuscated Field -> Vanilla Field
	 */
	public Field toVanilla(Field deobField)
	{
		final ClassFile obC = toVanilla(deobField.getClassFile());

		String name = InjectUtil.getObfuscatedName(deobField);

		Type type = deobField.getObfuscatedType();

		return obC.findField(name, type);
	}

	/**
	 * Vanilla ClassFile -> Deobfuscated ClassFile
	 */
	public ClassFile toDeob(String str)
	{
		return this.toDeob.get(str);
	}

	/**
	 * Adds a string mapping for a deobfuscated class
	 */
	public void addToDeob(String key, ClassFile value)
	{
		toDeob.put(key, value);
	}

	/**
	 * Do something with all paired classes.
	 * <p>
	 * Key = deobfuscated, Value = vanilla
	 */
	public void forEachPair(BiConsumer<ClassFile, ClassFile> action)
	{
		for (Map.Entry<ClassFile, ClassFile> pair : toVanilla.entrySet())
		{
			action.accept(pair.getKey(), pair.getValue());
		}
	}
}
