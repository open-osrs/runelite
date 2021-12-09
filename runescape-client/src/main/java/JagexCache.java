import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("l")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ldb;",
		garbageValue = "2123818799"
	)
	static class120 method3064(int var0) {
		class120 var1 = (class120)SequenceDefinition.field2086.get((long)var0); // L: 362
		if (var1 != null) { // L: 363
			return var1;
		} else {
			var1 = class112.method2571(SequenceDefinition.SequenceDefinition_animationsArchive, class118.SequenceDefinition_skeletonsArchive, var0, false); // L: 364
			if (var1 != null) { // L: 365
				SequenceDefinition.field2086.put(var1, (long)var0);
			}

			return var1; // L: 366
		}
	}
}
