import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class8 extends class14 {
	@ObfuscatedName("o")
	public static boolean field75;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 5988895091532737889L
	)
	long field77;
	@ObfuscatedName("n")
	String field71;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field77 = -1L; // L: 74
		this.field71 = null; // L: 75
	} // L: 77

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field77 = var1.readLong(); // L: 82
		}

		this.field71 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method103(this.field77, this.field71, 0); // L: 88
	} // L: 89

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-51"
	)
	static int method82(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4262
			++class44.Interpreter_intStackSize; // L: 4263
			return 1; // L: 4264
		} else if (var0 == 7101) { // L: 4266
			Interpreter.Interpreter_stringStackSize += 2; // L: 4267
			return 1; // L: 4268
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4270
			if (var0 == 7106) { // L: 4274
				++class44.Interpreter_intStackSize; // L: 4275
				return 1; // L: 4276
			} else if (var0 == 7107) { // L: 4278
				++class44.Interpreter_intStackSize; // L: 4279
				return 1; // L: 4280
			} else if (var0 == 7108) { // L: 4282
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapIcon_1.method3235() ? 1 : 0; // L: 4283
				return 1; // L: 4284
			} else {
				return 2; // L: 4286
			}
		} else {
			++class44.Interpreter_intStackSize; // L: 4271
			return 1; // L: 4272
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1387423967"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10176
	}
}
