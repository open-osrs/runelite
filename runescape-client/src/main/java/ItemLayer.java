import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dz")
@Implements("ItemLayer")
public final class ItemLayer
{
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("s")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("k")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1833908179
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1901902743
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1891717785
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 7869520931752751385L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -423863603
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "716540213"
	)
	static int method2850(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 1919
			VarcInt.Interpreter_intStackSize -= 2; // L: 1920
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1921
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1922
			EnumComposition var10 = MusicPatchNode.getEnum(var3); // L: 1923
			if (var10.outputType != 's') { // L: 1924
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 1925
				if (var9 == var10.keys[var6]) { // L: 1926
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 1927
					var10 = null; // L: 1928
					break;
				}
			}

			if (var10 != null) { // L: 1932
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 1933
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 1935
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 1961
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1962
				EnumComposition var4 = MusicPatchNode.getEnum(var3); // L: 1963
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.size(); // L: 1964
				return 1; // L: 1965
			} else {
				return 2; // L: 1967
			}
		} else {
			VarcInt.Interpreter_intStackSize -= 4; // L: 1936
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1937
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1938
			int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 1939
			var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 1940
			EnumComposition var7 = MusicPatchNode.getEnum(var5); // L: 1941
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 1942
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 1947
					if (var6 == var7.keys[var8]) { // L: 1948
						if (var9 == 115) { // L: 1949
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 1950
						}

						var7 = null; // L: 1951
						break;
					}
				}

				if (var7 != null) { // L: 1955
					if (var9 == 115) { // L: 1956
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 1957
					}
				}

				return 1; // L: 1959
			} else {
				if (var9 == 115) { // L: 1943
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1944
				}

				return 1; // L: 1945
			}
		}
	}
}
