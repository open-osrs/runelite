import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -921079377
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1864493120"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IB)V",
		garbageValue = "54"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "498467917"
	)
	static boolean method4552() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1389
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1390
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1391
				if (!var0.isLoaded()) {
					return false; // L: 1392
				}

				++Client.archiveLoadersDone; // L: 1393
			}

			return true; // L: 1395
		} else {
			return true;
		}
	}
}
