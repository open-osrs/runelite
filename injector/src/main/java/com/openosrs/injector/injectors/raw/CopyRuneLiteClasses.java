/*
 * Copyright (c) 2021, Owain van Brakel <https://github.com/Owain94>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.InjectUtil;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import java.util.List;
import java.util.ListIterator;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.CheckCast;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.PutField;
import net.runelite.asm.attributes.code.instructions.PutStatic;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;
import org.objectweb.asm.Opcodes;

public class CopyRuneLiteClasses extends AbstractInjector
{
	private static final List<String> RUNELITE_OBJECTS = List.of(
		"RuneLiteClanMember",
		"RuneLiteIterableLinkDeque",
		"RuneLiteIterableNodeDeque",
		"RuneLiteIterableNodeHashTable",
		"RuneLiteMenuEntry",
		"RuneLiteObject"
	);

	public CopyRuneLiteClasses(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		for (String className : RUNELITE_OBJECTS)
		{
			ClassFile runeliteObjectVanilla = inject.vanilla.findClass(className);

			final ClassFile runeLiteDeob = inject.getDeobfuscated()
				.findClass(className);

			if (runeliteObjectVanilla == null)
			{
				runeliteObjectVanilla = new ClassFile(inject.vanilla);
				runeliteObjectVanilla.setVersion(Opcodes.V1_8);
				runeliteObjectVanilla.setName(className);
				runeliteObjectVanilla.setAccess(runeLiteDeob.getAccess());

				if (runeLiteDeob.getParentClass() != null)
				{
					ClassFile deobClass = inject.getDeobfuscated().findClass(runeLiteDeob.getParentClass().getName());

					if (deobClass != null)
					{
						runeliteObjectVanilla.setParentClass(inject.toVanilla(deobClass).getPoolClass());
					}
					else
					{
						runeliteObjectVanilla.setParentClass(runeLiteDeob.getParentClass());
					}
				}

				inject.toVanilla.put(runeLiteDeob, runeliteObjectVanilla);

				for (Class interfaze : runeLiteDeob.getInterfaces())
				{
					runeliteObjectVanilla.getInterfaces().addInterface(interfaze);
				}

				for (Field field : runeLiteDeob.getFields())
				{
					field.setType(InjectUtil.deobToVanilla(inject, field.getType()));
					runeliteObjectVanilla.addField(field);
				}

				for (Method method : runeLiteDeob.getMethods())
				{
					if (className.equals("RuneLiteMenuEntry") && (method.getName().equals("getItemId") || method.getName().equals("getWidget")))
					{
						continue;
					}

					transformMethod(method);
					runeliteObjectVanilla.addMethod(method);
				}

				inject.vanilla.addClass(runeliteObjectVanilla);
			}
		}
	}

	private void transformMethod(Method method)
	{
		method.setDescriptor(getObfuscatedSignature(method.getDescriptor()));

		Code code = method.getCode();

		if (code != null)
		{
			Instructions ins = code.getInstructions();
			for (ListIterator<Instruction> iterator = ins.listIterator(); iterator.hasNext(); )
			{
				Instruction i = iterator.next();

				if (i instanceof PutField)
				{
					net.runelite.asm.pool.Field field = ((PutField) i).getField();
					Field vanilla = findField(field);

					if (vanilla != null)
					{
						iterator.set(new PutField(ins, vanilla));
					}
					else
					{
						field.setType(getObfuscatedSignature(field.getType()));
						iterator.set(new PutField(ins, field));
					}
				}
				else if (i instanceof GetField)
				{
					net.runelite.asm.pool.Field field = ((GetField) i).getField();
					Field vanilla = findField(field);

					if (vanilla != null)
					{
						iterator.set(new GetField(ins, vanilla));
					}
					else
					{
						field.setType(getObfuscatedSignature(field.getType()));
						iterator.set(new GetField(ins, field));
					}
				}
				else if (i instanceof PutStatic)
				{
					net.runelite.asm.pool.Field field = ((PutStatic) i).getField();
					Field vanilla = findField(field);

					if (vanilla != null)
					{
						iterator.set(new PutStatic(ins, vanilla));
					}
					else
					{
						field.setType(getObfuscatedSignature(field.getType()));
						iterator.set(new PutStatic(ins, field));
					}
				}
				else if (i instanceof GetStatic)
				{
					net.runelite.asm.pool.Field field = ((GetStatic) i).getField();
					Field vanilla = findField(field);

					if (vanilla != null)
					{
						iterator.set(new GetStatic(ins, vanilla));
					}
					else
					{
						field.setType(getObfuscatedSignature(field.getType()));
						iterator.set(new GetStatic(ins, field));
					}
				}
				else if (i instanceof InvokeSpecial)
				{
					net.runelite.asm.pool.Method meth = ((InvokeSpecial) i).getMethod();
					Method vanilla = findMethod(meth, true);

					if (vanilla != null)
					{
						iterator.set(new InvokeSpecial(ins, vanilla));
					}
					else
					{
						meth.setType(getObfuscatedSignature(meth.getType()));
						iterator.set(new InvokeSpecial(ins, meth));
					}
				}
				else if (i instanceof InvokeStatic)
				{
					net.runelite.asm.pool.Method meth = ((InvokeStatic) i).getMethod();
					Method vanilla = findMethod(meth, false);

					if (vanilla != null)
					{
						iterator.set(new InvokeStatic(ins, vanilla));
					}
					else
					{
						meth.setType(getObfuscatedSignature(meth.getType()));
						iterator.set(new InvokeStatic(ins, meth));
					}
				}
				else if (i instanceof InvokeVirtual)
				{
					net.runelite.asm.pool.Method meth = ((InvokeVirtual) i).getMethod();
					Method vanilla = findMethod(meth, true);

					if (vanilla != null)
					{
						iterator.set(new InvokeVirtual(ins, vanilla));
					}
					else
					{
						meth.setType(getObfuscatedSignature(meth.getType()));
						iterator.set(new InvokeVirtual(ins, meth));
					}
				}
				else if (i instanceof New)
				{

					Class clazz = ((New) i).getNewClass();
					ClassFile deobClass = inject.getDeobfuscated().findClass(clazz.getName());

					if (deobClass != null)
					{
						iterator.set(new New(ins, inject.toVanilla(deobClass)));
					}
				}
				else if (i instanceof CheckCast)
				{
					CheckCast clazz = ((CheckCast) i);
					iterator.set(new CheckCast(ins, getObfuscatedSignature(clazz.getType_())));
				}
			}
		}
	}

	private Signature getObfuscatedSignature(Signature signature)
	{
		Signature.Builder builder = new Signature.Builder();

		for (int j = 0; j < signature.size(); ++j)
		{
			Type type = signature.getTypeOfArg(j);
			builder.addArgument(InjectUtil.deobToVanilla(inject, type));
		}

		builder.setReturnType(InjectUtil.deobToVanilla(inject, signature.getReturnValue()));

		return builder.build();
	}

	private Type getObfuscatedSignature(Type type)
	{
		return InjectUtil.deobToVanilla(inject, type);
	}

	private Method findMethod(net.runelite.asm.pool.Method meth, boolean notStatic)
	{
		try
		{
			return InjectUtil.findMethod(inject, meth.getName(), meth.getClazz().getName(), meth.getType()::equals, notStatic, false);
		}
		catch (Exception e)
		{
			return null;
		}
	}

	private Field findField(net.runelite.asm.pool.Field field)
	{
		try
		{
			return InjectUtil.findField(inject, field.getName(), field.getClazz().getName());
		}
		catch (Exception e)
		{
			return null;
		}
	}
}
