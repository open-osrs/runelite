import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("f")
public class class0 extends class14 {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = 1748086525
	)
	static int field6;
	@ObfuscatedName("p")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("bp")
	static String field4;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -962316939
	)
	int field0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 1307131140437744357L
	)
	long field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field0 = var1.readInt(); // L: 310
		this.field2 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method157(this.field0, this.field2); // L: 315
	} // L: 316

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1322537982"
	)
	public static void method12(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			UserComparator3.ByteArrayPool_alternativeSizes = var0; // L: 25
			class221.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 26
			ScriptFrame.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 27

			for (int var2 = 0; var2 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 28
				ScriptFrame.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 29
			}

		} else {
			UserComparator3.ByteArrayPool_alternativeSizes = null;
			class221.ByteArrayPool_altSizeArrayCounts = null; // L: 21
			ScriptFrame.ByteArrayPool_arrays = null; // L: 22
		}
	} // L: 23 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "69"
	)
	public static byte[] method11(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? ScriptFrame.method1175(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;I)V",
		garbageValue = "1509718075"
	)
	public static void method13(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-2075885468"
	)
	static int method10(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2000
			class16.Interpreter_intStackSize -= 2; // L: 2001
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2002
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2003
			EnumComposition var10 = class159.getEnum(var3); // L: 2004
			if (var10.outputType != 's') { // L: 2005
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2006
				if (var9 == var10.keys[var6]) { // L: 2007
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2008
					var10 = null; // L: 2009
					break;
				}
			}

			if (var10 != null) { // L: 2013
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2014
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2016
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2042
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2043
				EnumComposition var4 = class159.getEnum(var3); // L: 2044
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.size(); // L: 2045
				return 1; // L: 2046
			} else {
				return 2; // L: 2048
			}
		} else {
			class16.Interpreter_intStackSize -= 4; // L: 2017
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2018
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2019
			int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 2020
			var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3]; // L: 2021
			EnumComposition var7 = class159.getEnum(var5); // L: 2022
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2023
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2028
					if (var6 == var7.keys[var8]) { // L: 2029
						if (var9 == 115) { // L: 2030
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2031
						}

						var7 = null; // L: 2032
						break;
					}
				}

				if (var7 != null) { // L: 2036
					if (var9 == 115) { // L: 2037
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2038
					}
				}

				return 1; // L: 2040
			} else {
				if (var9 == 115) { // L: 2024
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2025
				}

				return 1; // L: 2026
			}
		}
	}
}
