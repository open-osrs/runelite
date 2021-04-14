import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1381184627
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1440962611
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "923214413"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "1336556891"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "47"
	)
	static int method4898(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4212
			++class16.Interpreter_intStackSize; // L: 4213
			return 1; // L: 4214
		} else if (var0 == 7101) { // L: 4216
			Interpreter.Interpreter_stringStackSize += 2; // L: 4217
			return 1; // L: 4218
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4220
			if (var0 == 7106) { // L: 4224
				++class16.Interpreter_intStackSize; // L: 4225
				return 1; // L: 4226
			} else if (var0 == 7107) { // L: 4228
				++class16.Interpreter_intStackSize; // L: 4229
				return 1; // L: 4230
			} else if (var0 == 7108) { // L: 4232
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Huffman.method4311() ? 1 : 0; // L: 4233
				return 1; // L: 4234
			} else {
				return 2; // L: 4236
			}
		} else {
			++class16.Interpreter_intStackSize; // L: 4221
			return 1; // L: 4222
		}
	}
}
