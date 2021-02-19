/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.openosrs.injector.InjectException;
import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.inject.Provider;
import lombok.Value;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Annotated;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.FieldInstruction;
import net.runelite.asm.attributes.code.instruction.types.GetFieldInstruction;
import net.runelite.asm.attributes.code.instruction.types.InvokeInstruction;
import net.runelite.asm.attributes.code.instruction.types.LVTInstruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instruction.types.ReturnInstruction;
import net.runelite.asm.attributes.code.instruction.types.SetFieldInstruction;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.ANewArray;
import net.runelite.asm.attributes.code.instructions.CheckCast;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.InvokeDynamic;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.Pop;
import net.runelite.asm.attributes.code.instructions.PutField;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.util.JarUtil;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

public class MixinInjector extends AbstractInjector
{
	private static final Type COPY = new Type("Lnet/runelite/api/mixins/Copy;");
	private static final Type INJECT = new Type("Lnet/runelite/api/mixins/Inject;");
	private static final Type MIXIN = new Type("Lnet/runelite/api/mixins/Mixin;");
	private static final Type MIXINS = new Type("Lnet/runelite/api/mixins/Mixins;");
	private static final Type REPLACE = new Type("Lnet/runelite/api/mixins/Replace;");
	private static final Type SHADOW = new Type("Lnet/runelite/api/mixins/Shadow;");
	private static final String ASSERTION_FIELD = "$assertionsDisabled";
	private static final String MIXIN_BASE = "net/runelite/mixins/";

	private int injectedInterfaces = 0;
	private final Map<String, Field> injectedFields = new HashMap<>();
	private final Map<net.runelite.asm.pool.Field, ShadowField> shadowFields = new HashMap<>();
	private int copied = 0, replaced = 0, injected = 0;

	public MixinInjector(InjectData inject)
	{
		super(inject);
	}

	@Override
	public void inject()
	{
		final Map<Provider<ClassFile>, List<ClassFile>> mixinTargets = initTargets();
		inject(mixinTargets);
	}

	@VisibleForTesting
	void inject(Map<Provider<ClassFile>, List<ClassFile>> mixinTargets)
	{
		for (Map.Entry<Provider<ClassFile>, List<ClassFile>> entry : mixinTargets.entrySet())
		{
			injectInterfaces(entry.getKey(), entry.getValue());
		}

		log.info("[INFO] Injected {} interfaces", injectedInterfaces);

		for (Map.Entry<Provider<ClassFile>, List<ClassFile>> entry : mixinTargets.entrySet())
		{
			System.out.println(entry.getKey().get().getName());
			injectFields(entry.getKey(), entry.getValue());
		}

		log.info("[INFO] Injected {} fields", injectedFields.size());

		for (Map.Entry<Provider<ClassFile>, List<ClassFile>> entry : mixinTargets.entrySet())
		{
			findShadowFields(entry.getKey());
		}

		log.info("[INFO] Shadowed {} fields", shadowFields.size());

		for (Map.Entry<Provider<ClassFile>, List<ClassFile>> entry : mixinTargets.entrySet())
		{
			injectMethods(entry.getKey(), entry.getValue());
		}

		log.info("[INFO] Injected {}, copied {}, replaced {} methods", injected, copied, replaced);

		inject.runChildInjector(new InjectHook(inject, mixinTargets));

		inject.runChildInjector(new InjectHookMethod(inject, mixinTargets));
	}

	private Map<Provider<ClassFile>, List<ClassFile>> initTargets()
	{
		ImmutableMap.Builder<Provider<ClassFile>, List<ClassFile>> builder = ImmutableMap.builder();

		try
		{
			for (ClassFile mixinClass : inject.getMixins())
			{
				System.out.println(mixinClass.getName());
				final List<ClassFile> ret = getMixins(mixinClass);
				builder.put(
					(ret.size() > 1 ? mixinProvider(mixinClass) : () -> mixinClass),
					ret
				);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return builder.build();
	}

	private void injectInterfaces(Provider<ClassFile> mixinProvider, List<ClassFile> targetClasses)
	{
		try
		{
			final ClassFile mixinClass = mixinProvider.get();

			for (final ClassFile targetClass : targetClasses)
			{
				mixinClass.getInterfaces().getInterfaces().forEach((itf) ->
				{
					if (targetClass.getInterfaces().addInterface(itf))
					{
						injectedInterfaces++;
					}
				});
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void injectFields(Provider<ClassFile> mixinProvider, List<ClassFile> targetClasses)
	{
		try
		{
			final ClassFile mixinClass = mixinProvider.get();

			for (final ClassFile targetClass : targetClasses)
			{
				for (Field field : mixinClass.getFields())
				{
					if (field.findAnnotation(INJECT) == null &&
						(!ASSERTION_FIELD.equals(field.getName()) || targetClass.findField(ASSERTION_FIELD, Type.BOOLEAN) != null))
					{
						continue;
					}

					Field copy = new Field(targetClass, field.getName(), field.getType());
					copy.setAccessFlags(field.getAccessFlags());
					copy.setPublic();
					copy.setValue(field.getValue());

					for (Map.Entry<Type, Annotation> e : field.getAnnotations().entrySet())
					{
						if (!e.getKey().toString().startsWith("Lnet/runelite/api/mixins"))
						{
							copy.addAnnotation(e.getValue());
						}
					}

					targetClass.addField(copy);

					if (injectedFields.containsKey(field.getName()) && !ASSERTION_FIELD.equals(field.getName()))
					{
						throw new InjectException("Duplicate field: " + field.getName());
					}

					injectedFields.put(field.getName(), copy);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private void findShadowFields(Provider<ClassFile> mixinProvider)
	{
		final ClassFile mixinClass = mixinProvider.get();

		for (final Field field : mixinClass.getFields())
		{
			Annotation shadow = field.findAnnotation(SHADOW);

			if (shadow == null)
			{
				continue;
			}

			if (!field.isStatic())
			{
				throw new InjectException("Shadowed fields must be static");
			}

			String shadowed = shadow.getValueString();

			Field targetField = injectedFields.get(shadowed);
			Number getter = null;

			if (targetField == null)
			{
				final Field deobTargetField = InjectUtil.findStaticField(inject, shadowed, null, InjectUtil.apiToDeob(inject, field.getType()));
				targetField = inject.toVanilla(deobTargetField);

				getter = DeobAnnotations.getObfuscatedGetter(deobTargetField);
			}

			if ((targetField.getAccessFlags() & Opcodes.ACC_PRIVATE) != 0)
			{
				throw new InjectException("Shadowed fields can't be private");
			}

			shadowFields.put(
				field.getPoolField(),
				new ShadowField(targetField, getter)
			);
		}
	}

	private void injectMethods(Provider<ClassFile> mixinProvider, List<ClassFile> targetClasses)
	{
		for (ClassFile targetClass : targetClasses)
		{
			final ClassFile mixinClass = mixinProvider.get();

			// Keeps mappings between methods annotated with @Copy -> the copied method within the vanilla pack
			Map<net.runelite.asm.pool.Method, CopiedMethod> copiedMethods = new HashMap<>();

			// Handle the copy mixins first, so all other mixins know of the copies
			for (Method mixinMethod : mixinClass.getMethods())
			{
				Annotation copyA = mixinMethod.findAnnotation(COPY);
				if (copyA == null)
				{
					continue;
				}
				String copiedName = copyA.getValueString();

				Signature deobSig = InjectUtil.apiToDeob(inject, mixinMethod.getDescriptor());
				boolean notStat = !mixinMethod.isStatic();

				Method deobSourceMethod = InjectUtil.findMethod(inject, copiedName, inject.toDeob(targetClass.getName()).getName(), deobSig::equals, notStat, true);

				if (mixinMethod.isStatic() != deobSourceMethod.isStatic())
				{
					throw new InjectException("Mixin method " + mixinMethod + " should be " + (deobSourceMethod.isStatic() ? "static" : "non-static"));
				}

				// The actual method we're copying, including code etc
				Method sourceMethod = inject.toVanilla(deobSourceMethod);

				if (mixinMethod.getDescriptor().size() > sourceMethod.getDescriptor().size())
				{
					throw new InjectException("Mixin methods cannot have more parameters than their corresponding ob method");
				}

				Method copy = new Method(targetClass, "copy$" + copiedName, sourceMethod.getDescriptor());
				moveCode(copy, sourceMethod.getCode());
				copy.setAccessFlags(sourceMethod.getAccessFlags());
				copy.setPublic();
				copy.getExceptions().getExceptions().addAll(sourceMethod.getExceptions().getExceptions());
				for (var a : sourceMethod.getAnnotations().values())
				{
					copy.addAnnotation(a);
				}
				targetClass.addMethod(copy);
				++copied;

				/*
				 * If the desc for the mixin method and the desc for the ob method
				 * are the same in length, assume that the mixin method is taking
				 * care of the garbage parameter itself.
				 */
				boolean hasGarbageValue = mixinMethod.getDescriptor().size() != sourceMethod.getDescriptor().size()
					&& deobSourceMethod.getDescriptor().size() < copy.getDescriptor().size();

				copiedMethods.put(mixinMethod.getPoolMethod(), new CopiedMethod(copy, !hasGarbageValue ? null : Integer.valueOf(DeobAnnotations.getDecoder(deobSourceMethod))));
			}

			// Handle the rest of the mixin types
			for (Method mixinMethod : mixinClass.getMethods())
			{
				boolean isClinit = "<clinit>".equals(mixinMethod.getName());
				boolean isInit = "<init>".equals(mixinMethod.getName());
				boolean hasInject = mixinMethod.findAnnotation(INJECT) != null;

				// You can't annotate clinit, so its always injected
				if ((hasInject && isInit) || isClinit)
				{
					if (!"()V".equals(mixinMethod.getDescriptor().toString()))
					{
						throw new InjectException("Injected constructors cannot have arguments");
					}

					Method[] originalMethods = targetClass.getMethods().stream()
						.filter(m -> m.getName().equals(mixinMethod.getName()))
						.toArray(Method[]::new);

					String name = mixinMethod.getName();

					// If there isn't a <clinit> already just inject ours, otherwise rename it
					// This is always true for <init>
					if (originalMethods.length > 0)
					{
						name = "rl$$" + (isInit ? "init" : "clinit");
					}

					String numberlessName = name;
					for (int i = 1; targetClass.findMethod(name, mixinMethod.getDescriptor()) != null; i++)
					{
						name = numberlessName + i;
					}

					Method copy = new Method(targetClass, name, mixinMethod.getDescriptor());
					moveCode(copy, mixinMethod.getCode());
					copy.setAccessFlags(mixinMethod.getAccessFlags());
					copy.setPrivate();
					assert mixinMethod.getExceptions().getExceptions().isEmpty();

					// Remove the call to the superclass's ctor
					if (isInit)
					{
						Instructions instructions = copy.getCode().getInstructions();
						ListIterator<Instruction> listIter = instructions.listIterator();
						while (listIter.hasNext())
						{
							Instruction instr = listIter.next();
							if (instr instanceof InvokeSpecial)
							{
								InvokeSpecial invoke = (InvokeSpecial) instr;
								assert invoke.getMethod().getName().equals("<init>");
								listIter.remove();
								int pops = invoke.getMethod().getType().getArguments().size() + 1;

								for (int i = 0; i < pops; i++)
								{
									listIter.add(new Pop(instructions));
								}

								break;
							}
						}
					}

					setOwnersToTargetClass(mixinClass, targetClass, copy, copiedMethods);
					targetClass.addMethod(copy);

					// Call our method at the return point of the matching method(s)
					for (Method om : originalMethods)
					{
						Instructions instructions = om.getCode().getInstructions();
						ListIterator<Instruction> listIter = instructions.listIterator();

						while (listIter.hasNext())
						{
							Instruction instr = listIter.next();
							if (instr instanceof ReturnInstruction)
							{
								listIter.previous();
								if (isInit)
								{
									listIter.add(new ALoad(instructions, 0));
									listIter.add(new InvokeSpecial(instructions, copy.getPoolMethod()));
								}
								else if (isClinit)
								{
									listIter.add(new InvokeStatic(instructions, copy.getPoolMethod()));
								}
								listIter.next();
							}
						}
					}

					log.debug("[DEBUG] Injected mixin method {} to {}", copy, targetClass);
					++injected;
				}
				else if (hasInject)
				{
					// Make sure the method doesn't invoke copied methods
					/*for (Instruction i : mixinMethod.getCode().getInstructions())
					{
						if (i instanceof InvokeInstruction)
						{
							InvokeInstruction ii = (InvokeInstruction) i;

							if (copiedMethods.containsKey(ii.getMethod()))
							{
								throw new InjectException("Injected methods cannot invoke copied methods " + ii.toString());
							}
						}
					}*/

					Method copy = new Method(targetClass, mixinMethod.getName(), mixinMethod.getDescriptor());
					moveCode(copy, mixinMethod.getCode());
					copy.setAccessFlags(mixinMethod.getAccessFlags());
					copy.setPublic();
					assert mixinMethod.getExceptions().getExceptions().isEmpty();

					setOwnersToTargetClass(mixinClass, targetClass, copy, copiedMethods);

					targetClass.addMethod(copy);

					log.debug("[DEBUG] Injected mixin method {} to {}", copy, targetClass);
					++injected;
				}
				else if (mixinMethod.findAnnotation(REPLACE) != null)
				{
					Annotation replaceAnnotation = mixinMethod.findAnnotation(REPLACE);
					String replacedName = replaceAnnotation.getValueString();

					ClassFile deobClass = inject.toDeob(targetClass.getName());
					Method deobMethod = findDeobMatching(deobClass, mixinMethod, replacedName);

					if (deobMethod == null)
					{
						throw new InjectException("Failed to find the deob method " + replacedName + " for mixin " + mixinClass);
					}

					if (mixinMethod.isStatic() != deobMethod.isStatic())
					{
						throw new InjectException("Mixin method " + mixinMethod + " should be "
							+ (deobMethod.isStatic() ? "static" : "non-static"));
					}

					String obReplacedName = InjectUtil.getObfuscatedName(deobMethod);
					Signature obMethodSignature = deobMethod.getObfuscatedSignature();

					// Find the vanilla class where the method to copy is in
					ClassFile obCf = inject.toVanilla(deobMethod.getClassFile());

					Method obMethod = obCf.findMethod(obReplacedName, obMethodSignature);
					assert obMethod != null : "obfuscated method " + obReplacedName + obMethodSignature + " does not exist";

					if (mixinMethod.getDescriptor().size() > obMethod.getDescriptor().size())
					{
						throw new InjectException("Mixin methods cannot have more parameters than their corresponding ob method");
					}

					Type returnType = mixinMethod.getDescriptor().getReturnValue();
					Type deobReturnType = InjectUtil.apiToDeob(inject, returnType);
					if (!returnType.equals(deobReturnType))
					{
						ClassFile deobReturnTypeClassFile = inject.getDeobfuscated()
							.findClass(deobReturnType.getInternalName());
						if (deobReturnTypeClassFile != null)
						{
							ClassFile obReturnTypeClass = inject.toVanilla(deobReturnTypeClassFile);

							Instructions instructions = mixinMethod.getCode().getInstructions();
							ListIterator<Instruction> listIter = instructions.listIterator();
							while (listIter.hasNext())
							{
								Instruction instr = listIter.next();
								if (instr instanceof ReturnInstruction)
								{
									listIter.previous();
									CheckCast checkCast = new CheckCast(instructions);
									checkCast.setType(new Type(obReturnTypeClass.getName()));
									listIter.add(checkCast);
									listIter.next();
								}
							}
						}
					}

					moveCode(obMethod, mixinMethod.getCode());

					boolean hasGarbageValue = mixinMethod.getDescriptor().size() != obMethod.getDescriptor().size()
						&& deobMethod.getDescriptor().size() < obMethodSignature.size();

					if (hasGarbageValue)
					{
						int garbageIndex = obMethod.isStatic()
							? obMethod.getDescriptor().size() - 1
							: obMethod.getDescriptor().size();

					/*
						If the mixin method doesn't have the garbage parameter,
						the compiler will have produced code that uses the garbage
						parameter's local variable index for other things,
						so we'll have to add 1 to all loads/stores to indices
						that are >= garbageIndex.
					 */
						shiftLocalIndices(obMethod.getCode().getInstructions(), garbageIndex);
					}

					setOwnersToTargetClass(mixinClass, targetClass, obMethod, copiedMethods);

					log.debug("[DEBUG] Replaced method {} with mixin method {}", obMethod, mixinMethod);
					replaced++;
				}
			}
		}
	}

	private void moveCode(Method targetMethod, Code sourceCode)
	{
		Code newCode = new Code(targetMethod);
		newCode.setMaxStack(sourceCode.getMaxStack());
		newCode.getInstructions().getInstructions().addAll(sourceCode.getInstructions().getInstructions());

		// Update instructions for each instruction
		for (Instruction i : newCode.getInstructions())
		{
			i.setInstructions(newCode.getInstructions());
		}

		newCode.getExceptions().getExceptions().addAll(sourceCode.getExceptions().getExceptions());
		for (net.runelite.asm.attributes.code.Exception e : newCode.getExceptions().getExceptions())
		{
			e.setExceptions(newCode.getExceptions());
		}

		targetMethod.setCode(newCode);
	}

	private void setOwnersToTargetClass(ClassFile mixinCf, ClassFile cf, Method method, Map<net.runelite.asm.pool.Method, CopiedMethod> copiedMethods)
	{
		ListIterator<Instruction> iterator = method.getCode().getInstructions().listIterator();

		while (iterator.hasNext())
		{
			Instruction i = iterator.next();

			if (i instanceof ANewArray)
			{
				Type type = ((ANewArray) i).getType_();
				ClassFile deobTypeClass = inject.toDeob(type.getInternalName());

				if (deobTypeClass != null)
				{
					Type newType = new Type("L" + inject.toVanilla(deobTypeClass).getName() + ";");

					((ANewArray) i).setType(newType);
					log.debug("[DEBUG] Replaced {} type {} with type {}", i, type, newType);
				}
			}
			else if (i instanceof InvokeInstruction)
			{
				InvokeInstruction ii = (InvokeInstruction) i;

				CopiedMethod copiedMethod = copiedMethods.get(ii.getMethod());
				if (copiedMethod != null)
				{
					ii.setMethod(copiedMethod.copy.getPoolMethod());

					// Pass through garbage value if the method has one
					if (copiedMethod.garbage != null)
					{
						iterator.previous();
						iterator.add(new LDC(method.getCode().getInstructions(), copiedMethod.garbage));
						iterator.next();
					}
				}
				else if (ii.getMethod().getClazz().getName().equals(mixinCf.getName()))
				{
					ii.setMethod(new net.runelite.asm.pool.Method(
						new net.runelite.asm.pool.Class(cf.getName()),
						ii.getMethod().getName(),
						ii.getMethod().getType()
					));
				}
			}
			else if (i instanceof FieldInstruction)
			{
				FieldInstruction fi = (FieldInstruction) i;

				ShadowField shadowField = shadowFields.get(fi.getField());

				if (shadowField != null)
				{
					Field shadowed = shadowField.targetField;
					if (shadowField.obfuscatedGetter != null)
					{
						if (i instanceof SetFieldInstruction)
						{
							iterator.previous();
							InjectUtil.injectObfuscatedSetter(shadowField.obfuscatedGetter, i.getInstructions(), iterator::add);
							iterator.next();
						}
						else if (i instanceof GetFieldInstruction)
						{
							InjectUtil.injectObfuscatedGetter(shadowField.obfuscatedGetter, i.getInstructions(), iterator::add);
						}
					}

					fi.setField(shadowed.getPoolField());
				}
				else if (fi.getField().getClazz().getName().equals(mixinCf.getName()))
				{
					fi.setField(new net.runelite.asm.pool.Field(
						new net.runelite.asm.pool.Class(cf.getName()),
						fi.getField().getName(),
						fi.getField().getType()
					));
				}
			}
			else if (i instanceof PushConstantInstruction)
			{
				PushConstantInstruction pi = (PushConstantInstruction) i;

				if (mixinCf.getPoolClass().equals(pi.getConstant()))
				{
					pi.setConstant(cf.getPoolClass());
				}
			}

			verify(mixinCf, i);
		}
	}

	private void verify(ClassFile mixinCf, Instruction i)
	{
		if (i instanceof FieldInstruction)
		{
			FieldInstruction fi = (FieldInstruction) i;

			if (fi.getField().getClazz().getName().equals(mixinCf.getName()))
			{
				if (i instanceof PutField || i instanceof GetField)
				{
					throw new InjectException("Access to non static member field of mixin");
				}

				Field field = fi.getMyField();
				if (field != null && !field.isPublic())
				{
					throw new InjectException("Static access to non public field " + field);
				}
			}
		}
		else if (i instanceof InvokeStatic)
		{
			InvokeStatic is = (InvokeStatic) i;

			if (is.getMethod().getClazz() != mixinCf.getPoolClass()
				&& is.getMethod().getClazz().getName().startsWith(MIXIN_BASE))
			{
				throw new InjectException("Invoking static methods of other mixins is not supported");
			}
		}
		else if (i instanceof InvokeDynamic)
		// RS classes don't verify under java 7+ due to the
		// super() invokespecial being inside of a try{}
		{
			throw new InjectException("Injected bytecode must be Java 6 compatible");
		}
	}

	private Method findDeobMatching(ClassFile deobClass, Method mixinMethod, String deobName)
	{
		List<Method> matching = new ArrayList<>();

		for (Method method : deobClass.getMethods())
		{
			if (!deobName.equals(method.getName()))
			{
				continue;
			}

			if (InjectUtil.apiToDeobSigEquals(inject, method.getDescriptor(), mixinMethod.getDescriptor()))
			{
				matching.add(method);
			}
		}

		if (matching.size() > 1)
		// this happens when it has found several deob methods for some mixin method,
		// to get rid of the error, refine your search by making your mixin method have more parameters
		{
			throw new InjectException("There are several matching methods when there should only be one");
		}
		else if (matching.size() == 1)
		{
			return matching.get(0);
		}

		return inject.getDeobfuscated().findStaticMethod(deobName);
	}

	private void shiftLocalIndices(Instructions instructions, int startIdx)
	{
		for (Instruction i : instructions)
		{
			if (i instanceof LVTInstruction)
			{
				LVTInstruction lvti = (LVTInstruction) i;

				if (lvti.getVariableIndex() >= startIdx)
				{
					lvti.setVariableIndex(lvti.getVariableIndex() + 1);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private List<ClassFile> getMixins(Annotated from)
	{
		final Annotation mixin = from.findAnnotation(MIXIN);
		if (mixin != null)
		{
			return List.of(InjectUtil.getVanillaClassFromAnnotationString(inject, mixin));
		}
		final Annotation mixins = from.findAnnotation(MIXINS);
		if (mixins != null)
		{
			return ((List<Annotation>) mixins.getValue()).stream()
				.map(mix -> InjectUtil.getVanillaClassFromAnnotationString(inject, mix))
				.collect(Collectors.toUnmodifiableList());
		}
		throw new IllegalArgumentException("No MIXIN or MIXINS found on " + from.toString());
	}

	@Value
	private static class CopiedMethod
	{
		@Nonnull
		Method copy;
		@Nullable Integer garbage;
	}

	@Value
	private static class ShadowField
	{
		@Nonnull
		Field targetField;
		@Nullable Number obfuscatedGetter;
	}

	private static Provider<ClassFile> mixinProvider(ClassFile mixin)
	{
		return new Provider<>()
		{
			byte[] bytes = null;

			@Override
			public ClassFile get()
			{
				if (bytes != null)
				{
					return JarUtil.loadClass(bytes);
				}

				bytes = JarUtil.writeClass(mixin.getGroup(), mixin);
				return mixin;
			}
		};
	}
}
