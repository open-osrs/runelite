import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
public enum class169 implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	field2045(3, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	field2046(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	field2043(2, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	field2044(0, 3);

	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1066802481
	)
	public final int field2042;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1306076667
	)
	final int id;

	class169(int var3, int var4) {
		this.field2042 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-306559930"
	)
	static int method3542(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 1861
			Interpreter.Interpreter_intStackSize -= 2; // L: 1862
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1863
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1864
			EnumDefinition var10 = GrandExchangeOfferNameComparator.getEnum(var3); // L: 1865
			if (var10.outputType != 's') { // L: 1866
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 1867
				if (var9 == var10.keys[var6]) { // L: 1868
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 1869
					var10 = null; // L: 1870
					break;
				}
			}

			if (var10 != null) { // L: 1874
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 1875
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 1877
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 1903
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1904
				EnumDefinition var4 = GrandExchangeOfferNameComparator.getEnum(var3); // L: 1905
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 1906
				return 1; // L: 1907
			} else {
				return 2; // L: 1909
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 1878
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1879
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1880
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1881
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 1882
			EnumDefinition var7 = GrandExchangeOfferNameComparator.getEnum(var5); // L: 1883
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 1884
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 1889
					if (var6 == var7.keys[var8]) { // L: 1890
						if (var9 == 115) { // L: 1891
							Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 1892
						}

						var7 = null; // L: 1893
						break;
					}
				}

				if (var7 != null) { // L: 1897
					if (var9 == 115) { // L: 1898
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 1899
					}
				}

				return 1; // L: 1901
			} else {
				if (var9 == 115) { // L: 1885
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1886
				}

				return 1; // L: 1887
			}
		}
	}
}
