import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1738406105
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("p")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1771326033"
	)
	public void method3198(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3197(var1, var2);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1864154623"
	)
	void method3197(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Lkz;",
		garbageValue = "-2019338802"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, ParamComposition.masterDisk, var0, var1, var2, var3);
	}
}
