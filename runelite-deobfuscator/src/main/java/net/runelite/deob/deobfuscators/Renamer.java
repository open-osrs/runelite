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
package net.runelite.deob.deobfuscators;

import com.google.common.base.Strings;
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Interfaces;
import net.runelite.asm.Method;
import net.runelite.asm.Named;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Annotated;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Exceptions;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.LocalVariable;
import net.runelite.asm.attributes.code.Parameter;
import net.runelite.asm.signature.Signature;
import net.runelite.asm.signature.util.VirtualMethods;
import net.runelite.deob.DeobAnnotations;
import static net.runelite.deob.DeobAnnotations.*;
import net.runelite.deob.Deobfuscator;
import net.runelite.deob.util.NameMappings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Renamer implements Deobfuscator
{
	private static final Logger logger = LoggerFactory.getLogger(Renamer.class);

	private final NameMappings mappings;

	public Renamer(NameMappings mappings)
	{
		this.mappings = mappings;
	}

	private void renameClass(ClassFile on, ClassFile old, String name)
	{
		if (on.getParentClass().getName().equals(old.getName()))
		{
			on.setParentClass(new net.runelite.asm.pool.Class(name));
		}

		Interfaces interfaces = on.getInterfaces();
		List<net.runelite.asm.pool.Class> interfaceList = interfaces.getInterfaces();
		for (net.runelite.asm.pool.Class inter : interfaceList)
		{
			if (inter.getName().equals(old.getName()))
			{
				int idx = interfaceList.indexOf(inter);
				interfaceList.remove(idx);
				interfaceList.add(idx, new net.runelite.asm.pool.Class(name));
				break;
			}
		}
	}

	private void renameClass(ClassGroup group, ClassFile cf, String name)
	{
		for (ClassFile c : group.getClasses())
		{
			// rename on child interfaces and classes
			renameClass(c, cf, name);

			for (Method method : c.getMethods())
			{
				// rename on instructions. this includes method calls and field accesses.
				if (method.getCode() != null)
				{
					Code code = method.getCode();

					// rename on instructions
					for (Instruction i : code.getInstructions().getInstructions())
					{
						i.renameClass(cf.getName(), name);
					}

					// rename on exception handlers
					Exceptions exceptions = code.getExceptions();
					exceptions.renameClass(cf, name);
				}

				// rename on parameters
				Signature.Builder builder = new Signature.Builder();
				Signature signature = method.getDescriptor();
				for (int i = 0; i < signature.size(); ++i)
				{
					Type type = signature.getTypeOfArg(i);

					if (type.getInternalName().equals(cf.getName()))
					{
						builder.addArgument(Type.getType("L" + name + ";", type.getDimensions()));
					}
					else
					{
						builder.addArgument(type);
					}
				}

				// rename return type
				if (signature.getReturnValue().getInternalName().equals(cf.getName()))
				{
					builder.setReturnType(Type.getType("L" + name + ";", signature.getReturnValue().getDimensions()));
				}
				else
				{
					builder.setReturnType(signature.getReturnValue());
				}

				Signature newSignature = builder.build();

				if (!method.getDescriptor().equals(newSignature))
				{
					if (method.findAnnotation(OBFUSCATED_SIGNATURE) == null)
					{
						method.findAnnotation(OBFUSCATED_SIGNATURE, true).setElement("descriptor", method.getDescriptor().toString());
					}
				}

				method.setDescriptor(newSignature);

				// rename on exceptions thrown
				if (method.getExceptions() != null)
				{
					method.getExceptions().renameClass(cf, name);
				}
			}

			// rename on fields
			for (Field field : c.getFields())
			{
				if (field.getType().getInternalName().equals(cf.getName()))
				{
					if (field.findAnnotation(OBFUSCATED_SIGNATURE) == null)
					{
						field.findAnnotation(OBFUSCATED_SIGNATURE, true).setElement("descriptor", field.getType().toString());
					}
					field.setType(Type.getType("L" + name + ";", field.getType().getDimensions()));
				}
			}
		}

		addObfuscatedName(cf);

		group.renameClass(cf, name);
	}

	private void regeneratePool(ClassGroup group)
	{
		for (ClassFile cf : group.getClasses())
		{
			for (Method m : cf.getMethods())
			{
				if (m.getCode() != null)
				{
					m.getCode().getInstructions()
						.regeneratePool();
				}
			}
		}
	}

	@Override
	public void run(ClassGroup group)
	{
		group.buildClassGraph();
		group.lookup();

		int classes = 0, fields = 0, methods = 0, parameters = 0;

		// rename fields
		for (ClassFile cf : group.getClasses())
		{
			for (Field field : cf.getFields())
			{
				String newName = mappings.get(field.getPoolField());
				if (newName == null)
				{
					continue;
				}

				addObfuscatedName(field);

				assert DeobAnnotations.getExportedName(field) == null || newName.equals(DeobAnnotations.getExportedName(field)) : "Tried changing field name to something other than the exported name!";

				field.setName(newName);
				++fields;
			}
		}

		// rename methods
		for (ClassFile cf : group.getClasses())
		{
			for (Method method : cf.getMethods())
			{
				String newName = mappings.get(method.getPoolMethod());
				String[] newParams = mappings.getP(method.getPoolMethod());

				if (newName == null)
				{
					continue;
				}

				List<Method> virtualMethods = VirtualMethods.getVirtualMethods(method);
				assert !virtualMethods.isEmpty();

				for (Method m : virtualMethods)
				{
					List<Parameter> oldParams = method.getParameters();
					for (Parameter p : oldParams)
					{
						int index = oldParams.indexOf(p);
						if (newParams == null)
						{
							break;
						}
						else if (newParams.length < 1 || index > newParams.length - 1 || Strings.isNullOrEmpty(newParams[index]))
						{
							break;
						}

						LocalVariable oldVar = p.getLocalVariable();
						LocalVariable newVar = new LocalVariable(
							newParams[index],
							oldVar.getDesc(),
							oldVar.getSignature(),
							oldVar.getStart(),
							oldVar.getEnd(),
							oldVar.getIndex()
						);

						p.setLocalVariable(newVar);

						++parameters;
					}

					addObfuscatedName(m);

					m.setName(newName);
				}

				methods += virtualMethods.size();
			}
		}

		for (ClassFile cf : group.getClasses())
		{
			String newName = mappings.get(cf.getPoolClass());
			if (newName == null)
			{
				continue;
			}

			renameClass(group, cf, newName);
			++classes;
		}

		this.regeneratePool(group);

		logger.info("Renamed {} classes, {} fields, {} methods, and {} parameters", classes, fields, methods, parameters);
	}

	private static <T extends Annotated & Named> void addObfuscatedName(T object)
	{
		if (object.findAnnotation(OBFUSCATED_NAME) == null)
		{
			object.findAnnotation(OBFUSCATED_NAME, true).setElement(object.getName());
		}
	}
}
