import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class232 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1481365935
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -528081795
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 974163603
	)
	@Export("pcmSampleLength")
	static int pcmSampleLength;
	@ObfuscatedName("u")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
