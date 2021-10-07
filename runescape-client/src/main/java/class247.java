import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class247 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 3354000453036338827L
	)
	static long field2919;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 707697237
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -413440179
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1828900963
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("y")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "121"
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
