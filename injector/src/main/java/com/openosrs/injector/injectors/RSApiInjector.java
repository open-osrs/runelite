/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
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
package com.openosrs.injector.injectors;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.rsapi.InjectGetter;
import com.openosrs.injector.injectors.rsapi.InjectInvoke;
import com.openosrs.injector.injectors.rsapi.InjectSetter;
import com.openosrs.injector.rsapi.RSApiClass;
import com.openosrs.injector.rsapi.RSApiMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Annotated;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.DeobAnnotations;
import static com.openosrs.injector.rsapi.RSApi.API_BASE;

public class RSApiInjector extends AbstractInjector
{
	private final Map<Field, List<RSApiMethod>> retryFields = new HashMap<>();
	private int get = 0, set = 0, voke = 0;

	public RSApiInjector(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		for (final ClassFile deobClass : inject.getDeobfuscated())
		{
			final RSApiClass implementingClass = inject.getRsApi().findClass(API_BASE + deobClass.getName());

			injectFields(deobClass, implementingClass);
			injectMethods(deobClass, implementingClass);
		}

		retryFailures();

		log.info("[INFO] Injected {} getters, {} setters, and {} invokers", get, set, voke);
	}

	private void injectFields(ClassFile deobClass, RSApiClass implementingClass)
	{
		for (Field deobField : deobClass.getFields())
		{
			final List<RSApiMethod> matching = findImportsFor(deobField, deobField.isStatic(), implementingClass);

			if (matching == null)
			{
				continue;
			}

			final Type deobType = deobField.getType();

			// We're dealing with a field here, so only getter/setter methods match
			ListIterator<RSApiMethod> it = matching.listIterator();
			while (it.hasNext())
			{
				RSApiMethod apiMethod = it.next();

				if (apiMethod.isInjected())
				{
					it.remove();
					continue;
				}

				// Check if there's a field with the same exported name on the api target class itself,
				// as that should come before random static fields.
				if (deobField.isStatic())
				{
					ClassFile deobApiTarget = InjectUtil.deobFromApiMethod(inject, apiMethod);

					if (deobApiTarget != deobClass &&
						deobApiTarget.findField(deobField.getName()) != null)
					{
						it.remove();
						continue;
					}
				}

				final Signature sig = apiMethod.getSignature();

				if (sig.size() == 1)
				{
					if (sig.isVoid() || sig.getReturnValue().equals(Type.fromAsmString(apiMethod.getClazz().getName())))
					{
						Type type = InjectUtil.apiToDeob(inject, sig.getTypeOfArg(0));
						if (deobType.equals(type))
						{
							continue;
						}
					}
				}
				else if (sig.size() == 0)
				{
					Type type = InjectUtil.apiToDeob(inject, sig.getReturnValue());
					if (deobType.equals(type))
					{
						continue;
					}
				}

				it.remove();
			}

			if (matching.size() == 0)
			{
				continue;
			}
			else if (matching.size() > 2)
			{
				retryFields.put(deobField, new ArrayList<>(matching));
				continue;
			}

			final Field vanillaField = inject.toVanilla(deobField);
			final Number getter = DeobAnnotations.getObfuscatedGetter(deobField);

			if (deobField.isStatic() != vanillaField.isStatic()) // Can this even happen
			{
				throw new InjectException("Something went horribly wrong, and this should honestly never happen, but you never know. Btw it's the static-ness");
			}

			inject(matching, deobField, vanillaField, getter);
		}
	}

	private void injectMethods(ClassFile deobClass, RSApiClass implementingClass)
	{
		for (Method deobMethod : deobClass.getMethods())
		{
			final List<RSApiMethod> matching = findImportsFor(deobMethod, deobMethod.isStatic(), implementingClass);

			if (matching == null)
			{
				continue;
			}

			final Signature deobSig = deobMethod.getDescriptor();

			ListIterator<RSApiMethod> it = matching.listIterator();
			while (it.hasNext())
			{
				final RSApiMethod apiMethod = it.next();

				// Check if there's a method with the same exported name on the api target class itself,
				// as that should come before random static methods.
				if (deobMethod.isStatic())
				{
					ClassFile deobApiTarget = InjectUtil.deobFromApiMethod(inject, apiMethod);

					if (deobApiTarget != deobClass &&
						deobApiTarget.findMethod(deobMethod.getName()) != null)
					{
						it.remove();
						continue;
					}
				}

				final Signature apiSig = apiMethod.getSignature();

				if (apiMethod.isInjected()
					|| !InjectUtil.apiToDeobSigEquals(inject, deobSig, apiSig))
				{
					it.remove();
				}
			}

			if (matching.size() == 1)
			{
				final RSApiMethod apiMethod = matching.get(0);

				final ClassFile targetClass = InjectUtil.vanillaFromApiMethod(inject, apiMethod);
				final Method vanillaMethod = inject.toVanilla(deobMethod);
				final String garbage = DeobAnnotations.getDecoder(deobMethod);
				log.debug("[DEBUG] Injecting invoker {} for {} into {}", apiMethod.getMethod(), vanillaMethod.getPoolMethod(), targetClass.getPoolClass());
				InjectInvoke.inject(targetClass, apiMethod, vanillaMethod, garbage);
				++voke;
				apiMethod.setInjected(true);
			}
			else if (matching.size() != 0)
			{
				throw new InjectException("Multiple api imports matching method " + deobMethod.getPoolMethod());
			}
		}
	}

	private void retryFailures()
	{
		for (Map.Entry<Field, List<RSApiMethod>> entry : retryFields.entrySet())
		{
			final List<RSApiMethod> matched = entry.getValue();
			final Field deobField = entry.getKey();

			matched.removeIf(RSApiMethod::isInjected);

			/*if (matched.size() > 2)
			{
				throw new InjectException("More than 2 imported api methods for field " + deobField.getPoolField());
			}*/

			final Field vanillaField = inject.toVanilla(deobField);
			final Number getter = DeobAnnotations.getObfuscatedGetter(deobField);

			inject(matched, deobField, vanillaField, getter);
		}
	}

	private List<RSApiMethod> findImportsFor(Annotated object, boolean statik, RSApiClass implemented)
	{
		final String exportedName = InjectUtil.getExportedName(object);
		if (exportedName == null)
		{
			return null;
		}

		final List<RSApiMethod> matching = new ArrayList<>();

		if (statik)
		{
			for (RSApiClass api : inject.getRsApi())
			{
				api.fetchImported(matching, exportedName);
			}
		}
		else if (implemented != null)
		{
			implemented.fetchImported(matching, exportedName);
		}

		return matching;
	}

	private void inject(List<RSApiMethod> matched, Field field, Field targetField, Number getter)
	{
		for (RSApiMethod apiMethod : matched)
		{
			final ClassFile targetClass = InjectUtil.vanillaFromApiMethod(inject, apiMethod);
			apiMethod.setInjected(true);

			if (apiMethod.getSignature().getArguments().size() == 1)
			{
				++set;
				log.debug("[DEBUG] Injecting setter {} for {} into {}", apiMethod.getMethod(), field.getPoolField(), targetClass.getPoolClass());
				InjectSetter.inject(
					targetClass,
					apiMethod,
					targetField,
					getter
				);
			}
			else
			{
				++get;
				log.debug("[DEBUG] Injecting getter {} for {} into {}", apiMethod.getMethod(), field.getPoolField(), targetClass.getPoolClass());
				InjectGetter.inject(
					targetClass,
					apiMethod,
					targetField,
					getter
				);
			}
		}
	}
}
