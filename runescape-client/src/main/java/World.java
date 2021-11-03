import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("World")
public class World {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -219608595
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1277834635
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("p")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("j")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 695076639
	)
	@Export("id")
	int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1588910771
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 284961543
	)
	@Export("population")
	int population;
	@ObfuscatedName("t")
	@Export("host")
	String host;
	@ObfuscatedName("l")
	@Export("activity")
	String activity;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1851136007
	)
	@Export("location")
	int location;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -942792527
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "62"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012442922"
	)
	boolean method1649() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1239609040"
	)
	boolean method1681() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1502884763"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1652() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-654094649"
	)
	static int method1668(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2062
			class14.Interpreter_intStackSize -= 2; // L: 2063
			var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2064
			var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2065
			EnumComposition var10 = FloorOverlayDefinition.getEnum(var3); // L: 2066
			if (var10.outputType != 's') { // L: 2067
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2068
				if (var9 == var10.keys[var6]) { // L: 2069
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2070
					var10 = null; // L: 2071
					break;
				}
			}

			if (var10 != null) { // L: 2075
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2076
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2078
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2104
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2105
				EnumComposition var4 = FloorOverlayDefinition.getEnum(var3); // L: 2106
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.size(); // L: 2107
				return 1; // L: 2108
			} else {
				return 2; // L: 2110
			}
		} else {
			class14.Interpreter_intStackSize -= 4; // L: 2079
			var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2080
			var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2081
			int var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 2082
			var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3]; // L: 2083
			EnumComposition var7 = FloorOverlayDefinition.getEnum(var5); // L: 2084
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2085
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2090
					if (var6 == var7.keys[var8]) { // L: 2091
						if (var9 == 115) { // L: 2092
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2093
						}

						var7 = null; // L: 2094
						break;
					}
				}

				if (var7 != null) { // L: 2098
					if (var9 == 115) { // L: 2099
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2100
					}
				}

				return 1; // L: 2102
			} else {
				if (var9 == 115) { // L: 2086
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2087
				}

				return 1; // L: 2088
			}
		}
	}
}
