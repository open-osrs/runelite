import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 420940101
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1267423299
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "125"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "822246894"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43
}
