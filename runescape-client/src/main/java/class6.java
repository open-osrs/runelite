import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public enum class6 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	field16(0, 0);

	@ObfuscatedName("i")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2103814257
	)
	public final int field11;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 23593839
	)
	final int field15;

	class6(int var3, int var4) {
		this.field11 = var3; // L: 12
		this.field15 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15; // L: 18
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-918039654"
	)
	static int method45(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 164
		return WorldMapIcon_0.NetCache_currentResponse != null && var2 == WorldMapIcon_0.NetCache_currentResponse.key ? class357.NetCache_responseArchiveBuffer.offset * 99 / (class357.NetCache_responseArchiveBuffer.array.length - WorldMapIcon_0.NetCache_currentResponse.padding) + 1 : 0; // L: 165 166
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-55"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 187
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 188
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 189
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1816581663"
	)
	static int method47(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4484
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4489
				if (var0 == 6750) { // L: 4493
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4494
					return 1; // L: 4495
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4497
					if (var0 == 6754) { // L: 4501
						int var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 4502
						NPCComposition var4 = WorldMapSectionType.getNpcDefinition(var3); // L: 4503
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4504
						return 1; // L: 4505
					} else {
						return 2; // L: 4507
					}
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4498
					return 1; // L: 4499
				}
			} else {
				--class12.Interpreter_intStackSize; // L: 4490
				return 1; // L: 4491
			}
		} else {
			class12.Interpreter_intStackSize -= 2; // L: 4485
			--class9.Interpreter_stringStackSize; // L: 4486
			return 1; // L: 4487
		}
	}
}
