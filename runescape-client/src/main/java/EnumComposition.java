import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fg")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("m")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("k")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("o")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1569829239
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1117713649
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("a")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("u")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("e")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1678468441"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "3"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1327387533"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1485411533"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1969293465"
	)
	public static void method2940() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "2"
	)
	static int method2941(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++class240.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1392924736"
	)
	static int method2938(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}
}
