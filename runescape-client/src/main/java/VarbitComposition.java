import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("e")
	static final int[] field1998;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1904553397
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1678069445
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1905765043
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1998 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1998[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-2021831653"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "98"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.baseVar = var1.readUnsignedShort(); // L: 47
			this.startBit = var1.readUnsignedByte(); // L: 48
			this.endBit = var1.readUnsignedByte(); // L: 49
		}

	} // L: 52
}
