import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class273 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1398711083
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -164167737
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1426022031
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1631991279
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
