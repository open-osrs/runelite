/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.rsapi.RSApiClass;
import com.openosrs.injector.rsapi.RSApiMethod;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Named;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Annotated;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.DLoad;
import net.runelite.asm.attributes.code.instructions.FLoad;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.LLoad;
import net.runelite.asm.attributes.code.instructions.LMul;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.attributes.code.instructions.VReturn;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.deobfuscators.arithmetic.DMath;
import org.jetbrains.annotations.Nullable;
import static com.openosrs.injector.rsapi.RSApi.API_BASE;
import static com.openosrs.injector.rsapi.RSApi.RL_API_BASE;

public interface InjectUtil
{
	/**
	 * Finds a static method in deob and converts it to ob
	 *
	 * @param data InjectData instance
	 * @param name The name of the method you want to find
	 * @return The obfuscated version of the found method
	 */
	static Method findMethod(InjectData data, String name)
	{
		return findMethod(data, name, null, null);
	}

	/**
	 * Finds a static method in deob and converts it to ob
	 *
	 * @param data      InjectData instance
	 * @param name      The name of the method you want to find
	 * @param classHint The name of the class you expect the method to be in, or null
	 * @param sig       The signature the method has in deob, or null
	 * @return The obfuscated version of the found method
	 */
	static Method findMethod(
		InjectData data,
		String name,
		String classHint,
		@Nullable Predicate<Signature> sig)
	{
		return findMethod(data, name, classHint, sig, false, false);
	}

	/**
	 * Finds a method in injectData's deobfuscated classes.
	 *
	 * @param data      InjectData instance
	 * @param name      (Exported) method name
	 * @param classHint The (exported) name of a class you expect (or know) the method to be in, or null, if you're not sure
	 * @throws InjectException If the hint class couldn't be found, or no method matching the settings was found
	 */
	static Method findMethod(
		InjectData data,
		String name,
		@Nullable String classHint)
		throws InjectException
	{
		return findMethod(data, name, classHint, null, false, false);
	}

	/**
	 * Finds a method in injectData's deobfuscated classes.
	 *
	 * @param data       InjectData instance
	 * @param name       (Exported) method name
	 * @param classHint  The (exported) name of a class you expect (or know) the method to be in, or null, if you're not sure
	 * @param sig        The deobfuscated methods' signature, or null, if you're unsure
	 * @param notStatic  If this is true, only check non-static methods. If classHint isn't null, check only subclasses
	 * @param returnDeob If this is true, this method will return the deobfuscated method, instead of turning it into vanilla first
	 * @throws InjectException If the hint class couldn't be found, or no method matching the settings was found
	 */
	static Method findMethod(
		InjectData data,
		String name,
		@Nullable String classHint,
		@Nullable Predicate<Signature> sig,
		boolean notStatic,
		boolean returnDeob)
		throws InjectException
	{
		final ClassGroup deob = data.getDeobfuscated();
		if (classHint != null)
		{
			ClassFile cf;
			Method m;
			cf = findClassOrThrow(deob, classHint);
			if (notStatic)
			{
				if (sig == null)
				{
					m = InjectUtil.findMethodDeep(cf, name, s -> true);
				}
				else
				{
					m = InjectUtil.findMethodDeep(cf, name, sig);
				}
			}
			else
			{
				m = cf.findMethod(name);
			}

			if (m != null)
			{
				return returnDeob ? m : data.toVanilla(m);
			}
		}

		for (ClassFile cf : deob)
		{
			for (Method m : cf.getMethods())
			{
				if (m.getName().equals(name))
				{
					if (!notStatic || !m.isStatic())
					{
						if (sig == null || sig.test(m.getDescriptor()))
						{
							return returnDeob ? m : data.toVanilla(m);
						}
					}
				}
			}
		}

		throw new InjectException(String.format("Couldn't find %s", name));
	}

	static ClassFile findClassOrThrow(ClassGroup group, String name)
	{
		ClassFile clazz = group.findClass(name);
		if (clazz == null)
		{
			throw new InjectException("Hint class " + name + " doesn't exist");
		}

		return clazz;
	}

	/**
	 * Fail-fast implementation of ClassFile.findMethodDeep, using a predicate for signature
	 */
	static Method findMethodDeep(ClassFile clazz, String name, Predicate<Signature> type)
	{
		do
		{
			for (Method method : clazz.getMethods())
			{
				if (method.getName().equals(name))
				{
					if (type.test(method.getDescriptor()))
					{
						return method;
					}
				}
			}
		}
		while ((clazz = clazz.getParent()) != null);

		throw new InjectException(String.format("Method %s couldn't be found", name + type.toString()));
	}

	/**
	 * Fail-fast implementation of ClassGroup.findStaticField
	 * <p>
	 * well...
	 */
	static Field findStaticField(ClassGroup group, String name)
	{
		for (ClassFile clazz : group)
		{
			Field f = clazz.findField(name);
			if (f != null && f.isStatic())
			{
				return f;
			}
		}

		throw new InjectException("Couldn't find static field " + name);
	}

	/**
	 * Finds a static field in deob and converts it to ob
	 *
	 * @param data      InjectData instance
	 * @param name      The name of the field you want to find
	 * @param classHint The name of the class you expect the field to be in, or null
	 * @param type      The type the method has in deob, or null
	 * @return The obfuscated version of the found field
	 */
	static Field findStaticField(InjectData data, String name, String classHint, Type type)
	{
		final ClassGroup deob = data.getDeobfuscated();
		Field field;

		if (classHint != null)
		{
			ClassFile clazz = findClassOrThrow(deob, classHint);

			if (type == null)
			{
				field = clazz.findField(name);
			}
			else
			{
				field = clazz.findField(name, type);
			}

			if (field != null)
			{
				return field;
			}
		}

		for (ClassFile clazz : deob)
		{
			if (type == null)
			{
				field = clazz.findField(name);
			}
			else
			{
				field = clazz.findField(name, type);
			}

			if (field != null)
			{
				return field;
			}
		}

		throw new InjectException(String.format("Static field %s doesn't exist", (type != null ? type + " " : "") + name));
	}

	/**
	 * Fail-fast implementation of ClassGroup.findFieldDeep
	 */
	static Field findFieldDeep(ClassFile clazz, String name)
	{
		Field f;

		do
		{
			if ((f = clazz.findField(name)) != null)
			{
				return f;
			}
		}
		while ((clazz = clazz.getParent()) != null);

		throw new InjectException("Couldn't find field " + name);
	}

	static Field findField(InjectData data, String name, String hintClass)
	{
		final ClassGroup deob = data.getDeobfuscated();
		return data.toVanilla(findField(deob, name, hintClass));
	}

	static Field findField(ClassGroup group, String name, String hintClass)
	{
		Field field;
		if (hintClass != null)
		{
			ClassFile clazz = findClassOrThrow(group, hintClass);

			field = clazz.findField(name);
			if (field != null)
			{
				return field;
			}
		}

		for (ClassFile clazz : group)
		{
			if ((field = clazz.findField(name)) != null)
			{
				return field;
			}
		}

		throw new InjectException("Field " + name + " doesn't exist");
	}

	static ClassFile deobFromApiMethod(InjectData data, RSApiMethod apiMethod)
	{
		return data.toDeob(apiMethod.getClazz().getName());
	}

	static ClassFile vanillaFromApiMethod(InjectData data, RSApiMethod apiMethod)
	{
		return data.toVanilla(deobFromApiMethod(data, apiMethod));
	}

	static Signature apiToDeob(InjectData data, Signature api)
	{
		return new Signature.Builder()
			.setReturnType(apiToDeob(data, api.getReturnValue()))
			.addArguments(
				api.getArguments().stream()
					.map(type -> apiToDeob(data, type))
					.collect(Collectors.toList())
			).build();
	}

	static Type apiToDeob(InjectData data, Type api)
	{
		if (api.isPrimitive())
		{
			return api;
		}

		final String internalName = api.getInternalName();
		if (internalName.startsWith(API_BASE))
		{
			return Type.getType("L" + api.getInternalName().substring(API_BASE.length()) + ";", api.getDimensions());
		}
		else if (internalName.startsWith(RL_API_BASE))
		{
			Class rlApiC = new Class(internalName);
			RSApiClass highestKnown = data.getRsApi().withInterface(rlApiC);

			// Cheeky unchecked exception
			assert highestKnown != null : "No rs api class implements rl api class " + rlApiC.toString();

			boolean changed;
			do
			{
				changed = false;

				for (RSApiClass interf : highestKnown.getApiInterfaces())
				{
					if (interf.getInterfaces().contains(rlApiC))
					{
						highestKnown = interf;
						changed = true;
						break;
					}
				}
			}
			while (changed);

			return apiToDeob(data, Type.getType(highestKnown.getName(), api.getDimensions()));
		}

		return api;
	}

	static Type deobToVanilla(InjectData data, Type deobT)
	{
		if (deobT.isPrimitive())
		{
			return deobT;
		}

		final ClassFile deobClass = data.getDeobfuscated().findClass(deobT.getInternalName());
		if (deobClass == null)
		{
			return deobT;
		}

		return Type.getType("L" + data.toVanilla(deobClass).getName() + ";", deobT.getDimensions());
	}

	static boolean apiToDeobSigEquals(InjectData data, Signature deobSig, Signature apiSig)
	{
		return deobSig.equals(apiToDeob(data, apiSig));
	}

	static boolean argsMatch(Signature a, Signature b)
	{
		List<Type> aa = a.getArguments();
		List<Type> bb = b.getArguments();

		if (aa.size() != bb.size())
		{
			return false;
		}

		for (int i = 0; i < aa.size(); i++)
		{
			if (!aa.get(i).equals(bb.get(i)))
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Gets the obfuscated name from something's annotations.
	 * <p>
	 * If the annotation doesn't exist return the current name instead.
	 */
	static <T extends Annotated & Named> String getObfuscatedName(T from)
	{
		Annotation name = from.findAnnotation(DeobAnnotations.OBFUSCATED_NAME);
		return name == null ? from.getName() : name.getValueString();
	}

	/**
	 * Gets the value of the @Export annotation on the object.
	 */
	static String getExportedName(Annotated from)
	{
		Annotation export = from.findAnnotation(DeobAnnotations.EXPORT);
		return export == null ? null : export.getValueString();
	}

	/**
	 * Creates the correct load instruction for the variable with Type type and var index index.
	 */
	static Instruction createLoadForTypeIndex(Instructions instructions, Type type, int index)
	{
		if (type.getDimensions() > 0 || !type.isPrimitive())
		{
			return new ALoad(instructions, index);
		}

		switch (type.toString())
		{
			case "B":
			case "C":
			case "I":
			case "S":
			case "Z":
				return new ILoad(instructions, index);
			case "D":
				return new DLoad(instructions, index);
			case "F":
				return new FLoad(instructions, index);
			case "J":
				return new LLoad(instructions, index);
			default:
				throw new IllegalStateException("Unknown type");
		}
	}

	/**
	 * Creates the right return instruction for an object with Type type
	 */
	static Instruction createReturnForType(Instructions instructions, Type type)
	{
		if (!type.isPrimitive())
		{
			return new Return(instructions, InstructionType.ARETURN);
		}

		switch (type.toString())
		{
			case "B":
			case "C":
			case "I":
			case "S":
			case "Z":
				return new Return(instructions, InstructionType.IRETURN);
			case "D":
				return new Return(instructions, InstructionType.DRETURN);
			case "F":
				return new Return(instructions, InstructionType.FRETURN);
			case "J":
				return new Return(instructions, InstructionType.LRETURN);
			case "V":
				return new VReturn(instructions);
			default:
				throw new IllegalStateException("Unknown type");
		}
	}

	static Instruction createInvokeFor(Instructions instructions, net.runelite.asm.pool.Method method, boolean isStatic)
	{
		if (isStatic)
		{
			return new InvokeStatic(instructions, method);
		}
		else
		{
			return new InvokeVirtual(instructions, method);
		}
	}

	/**
	 * Legit fuck annotations
	 */
	static ClassFile getVanillaClassFromAnnotationString(InjectData data, Annotation annotation)
	{
		Object v = annotation.getValue();
		String str = ((org.objectweb.asm.Type) v).getInternalName();
		return data.toVanilla(data.toDeob(str));
	}

	/**
	 * Add after the get
	 */
	static void injectObfuscatedGetter(Number getter, Instructions instrs, Consumer<Instruction> into)
	{
		into.accept(new LDC(instrs, getter));

		if (getter instanceof Integer)
		{
			into.accept(new IMul(instrs));
		}
		else if (getter instanceof Long)
		{
			into.accept(new LMul(instrs));
		}
	}

	/**
	 * Add IN FRONT of the put
	 *
	 * @param getter should be the same value as for the getter (straight from ObfuscatedGetter)
	 */
	static void injectObfuscatedSetter(Number getter, Instructions instrs, Consumer<Instruction> into)
	{
		injectObfuscatedGetter(DMath.modInverse(getter), instrs, into);
	}
}
