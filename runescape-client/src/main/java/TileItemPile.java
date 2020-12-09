import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dz")
@Implements("TileItemPile")
public final class TileItemPile {
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
	Entity first;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("second")
	Entity second;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("third")
	Entity third;
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

	TileItemPile() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "716540213"
	)
	static int method2850(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			VarcInt.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			EnumDefinition var10 = MusicPatchNode.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				EnumDefinition var4 = MusicPatchNode.getEnum(var3);
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			VarcInt.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
			EnumDefinition var7 = MusicPatchNode.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
