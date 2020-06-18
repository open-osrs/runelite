import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class206 {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 271631865
	)
	static int field2446;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -164621127
	)
	public static int field2439;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -897953079
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1138068073
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2058854379
	)
	public static int field2442;

	static {
		field2439 = 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IIIZIB)J",
		garbageValue = "1"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}
}
