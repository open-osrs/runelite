import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class206 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1660292459
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1418179019
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("n")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
