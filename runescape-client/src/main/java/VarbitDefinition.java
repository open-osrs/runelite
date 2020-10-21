import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("VarbitDefinition")
public class VarbitDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1810404981
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -581436309
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1763957303
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "7"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 18
			if (var2 == 0) { // L: 19
				return; // L: 22
			}

			this.decodeNext(var1, var2); // L: 20
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "37"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 25
			this.baseVar = var1.readUnsignedShort(); // L: 26
			this.startBit = var1.readUnsignedByte(); // L: 27
			this.endBit = var1.readUnsignedByte(); // L: 28
		}

	} // L: 31

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-943155680"
	)
	static char method4663(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}
}
