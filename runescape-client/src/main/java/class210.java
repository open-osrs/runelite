import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class210 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1536562355
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("l")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
