package net.runelite.deob.deobfuscators.transformers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.IfICmpEq;
import net.runelite.asm.attributes.code.instructions.IfICmpNe;
import net.runelite.asm.pool.Class;
import net.runelite.deob.Transformer;
import org.objectweb.asm.Opcodes;
import static org.objectweb.asm.Opcodes.ACC_FINAL;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class ScriptOpcodesTransformer implements Transformer // robots in disguise
{
	private static final String SCRIPT_OPCODES = "net/runelite/rs/ScriptOpcodes";
	private static final HashMap<Integer, String> OPCODE_MAP = new HashMap<>();

	static
	{
		for (java.lang.reflect.Field opcodeField : net.runelite.cache.script.Opcodes.class.getDeclaredFields())
		{
			if (opcodeField.getType() != int.class || !opcodeField.canAccess(null))
			{
				continue;
			}

			String opcodeName = opcodeField.getName();
			int opcode;

			try
			{
				opcode = opcodeField.getInt(null);
			}
			catch (IllegalAccessException e)
			{
				throw new RuntimeException(e);
			}

			OPCODE_MAP.put(opcode, opcodeName);
		}
	}

	@Override
	public void transform(ClassGroup group)
	{
		initializeOpcodesClassFile(group);

		for (ClassFile cf : group.getClasses())
		{
			if (cf.getName().startsWith("net/runelite/rs"))
			{
				continue;
			}

			for (Method m : cf.getMethods())
			{
				if (!m.isStatic())
				{
					continue;
				}

				if (!m.getDescriptor().getArguments().contains(new Type("LScript;")) && !m.getDescriptor().getArguments().contains(new Type("LScriptEvent;")))
				{
					continue;
				}

				boolean varIndexIsKnownAnd0 = m.getDescriptor().getArguments().contains(new Type("LScript;"));

				Code code = m.getCode();
				Instructions ins = code.getInstructions();
				ListIterator<Instruction> it = ins.getInstructions().listIterator();

				Instruction i;
				while (it.hasNext())
				{
					i = it.next();

					if (!(i instanceof ILoad) || (varIndexIsKnownAnd0 && ((ILoad) i).getVariableIndex() != 0))
					{
						continue;
					}

					i = it.next();

					if (!(i instanceof PushConstantInstruction) ||
						!(((PushConstantInstruction) i).getConstant() instanceof Number))
					{
						continue;
					}

					int val = ((Number) ((PushConstantInstruction) i).getConstant()).intValue();
					String name = OPCODE_MAP.get(val);

					i = it.next();

					if (name == null || !(i instanceof IfICmpNe || i instanceof IfICmpEq))
					{
						continue;
					}

					it.previous();
					it.previous();

					net.runelite.asm.pool.Field pool = new net.runelite.asm.pool.Field(
						new Class(SCRIPT_OPCODES),
						name,
						Type.INT
					);

					GetStatic getStatic = new GetStatic(ins, pool);
					it.set(getStatic);
				}
			}
		}
	}

	private static void initializeOpcodesClassFile(ClassGroup group)
	{
		ClassFile scriptOpcodes = group.findClass(SCRIPT_OPCODES);
		if (scriptOpcodes == null)
		{
			scriptOpcodes = new ClassFile(group);
			scriptOpcodes.setName(SCRIPT_OPCODES);
			scriptOpcodes.setSuperName(Type.OBJECT.getInternalName());
			scriptOpcodes.setAccess(Opcodes.ACC_PUBLIC);
			scriptOpcodes.setVersion(Opcodes.V1_8);
			group.addClass(scriptOpcodes);
		}
		else
		{
			scriptOpcodes.getFields().clear();
		}

		ClassFile finalScriptOpcodes = scriptOpcodes;
		OPCODE_MAP.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).forEach((entry) ->
		{
			Integer opcode = entry.getKey();
			String opcodeName = entry.getValue();

			Field field = new Field(finalScriptOpcodes, opcodeName, Type.INT);
			field.setAccessFlags(ACC_PUBLIC | ACC_STATIC | ACC_FINAL);
			field.setValue(opcode);
			finalScriptOpcodes.addField(field);
		});
	}
}
