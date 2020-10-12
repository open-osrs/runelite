import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class206 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1660292459
	)
	public static int musicPlayerStatus;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1418179019
	)
	public static int musicTrackFileId;
	@ObfuscatedName("n")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	static MusicTrack musicTrack;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
