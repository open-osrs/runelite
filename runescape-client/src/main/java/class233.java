import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class233 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1830470507
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 737536913
	)
	@Export("musicTrackGroupId")
	static int musicTrackGroupId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2069397721
	)
	@Export("musicTrackFileId")
	static int musicTrackFileId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1994370717
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static void method4541() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 66

		while (var0.hasNext()) { // L: 71
			Message var1 = (Message)var0.next(); // L: 67
			var1.clearIsFromIgnored(); // L: 69
		}

	} // L: 72

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "850"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (UrlRequester.pcmPlayer1 != null) { // L: 3751
			UrlRequester.pcmPlayer1.run();
		}

		if (SoundCache.pcmPlayer0 != null) { // L: 3752
			SoundCache.pcmPlayer0.run();
		}

	} // L: 3753
}
