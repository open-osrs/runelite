import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("i")
	@Export("musicTrackBoolean")
	static boolean musicTrackBoolean;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 325641645
	)
	static int field1542;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 914989933
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-66"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1008966979"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38
}
