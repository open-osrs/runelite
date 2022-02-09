import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 448976703
	)
	static int field1938;
	@ObfuscatedName("s")
	@Export("type")
	char type;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -223058499
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("r")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("o")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1681074183"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1518510708"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			byte var4 = var1.readByte(); // L: 44
			int var5 = var4 & 255; // L: 46
			if (var5 == 0) { // L: 47
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 48
				char var6 = class333.cp1252AsciiExtension[var5 - 128]; // L: 49
				if (var6 == 0) { // L: 50
					var6 = '?';
				}

				var5 = var6; // L: 51
			}

			char var3 = (char)var5; // L: 53
			this.type = var3; // L: 55
		} else if (var2 == 2) { // L: 57
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 58
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 59
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 61

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1954682272"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 64
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1598733625"
	)
	static long method3381(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfg;",
		garbageValue = "21"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = class12.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "98"
	)
	static int method3370(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2066
			Interpreter.Interpreter_intStackSize -= 2; // L: 2067
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2068
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2069
			EnumComposition var10 = UserList.getEnum(var3); // L: 2070
			if (var10.outputType != 's') { // L: 2071
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2072
				if (var9 == var10.keys[var6]) { // L: 2073
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2074
					var10 = null; // L: 2075
					break;
				}
			}

			if (var10 != null) { // L: 2079
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2080
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2082
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2108
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2109
				EnumComposition var4 = UserList.getEnum(var3); // L: 2110
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2111
				return 1; // L: 2112
			} else {
				return 2; // L: 2114
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2083
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2084
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2085
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2086
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2087
			EnumComposition var7 = UserList.getEnum(var5); // L: 2088
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2089
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2094
					if (var6 == var7.keys[var8]) { // L: 2095
						if (var9 == 115) { // L: 2096
							Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2097
						}

						var7 = null; // L: 2098
						break;
					}
				}

				if (var7 != null) { // L: 2102
					if (var9 == 115) { // L: 2103
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2104
					}
				}

				return 1; // L: 2106
			} else {
				if (var9 == 115) { // L: 2090
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2091
				}

				return 1; // L: 2092
			}
		}
	}
}
