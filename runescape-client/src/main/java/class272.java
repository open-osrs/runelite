import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class272 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -759925957
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -551405229
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1837276653
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1550491905
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 208157847
	)
	public static int field3196;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	static {
		musicPlayerStatus = 0; // L: 11
	}
}
