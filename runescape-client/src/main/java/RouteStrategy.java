import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1174607755
	)
	static int field1919;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2064726811
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -801377261
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1579448573
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1110365195
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILfl;B)Z",
		garbageValue = "11"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	public static boolean method3252() {
		try {
			if (class233.musicPlayerStatus == 2) { // L: 104
				if (ArchiveLoader.musicTrack == null) { // L: 105
					ArchiveLoader.musicTrack = MusicTrack.readTrack(InvDefinition.musicTrackArchive, class233.musicTrackGroupId, class233.musicTrackFileId); // L: 106
					if (ArchiveLoader.musicTrack == null) { // L: 107
						return false;
					}
				}

				if (class215.soundCache == null) { // L: 109
					class215.soundCache = new SoundCache(class230.soundEffectsArchive, class233.musicSamplesArchive);
				}

				if (class233.midiPcmStream.loadMusicTrack(ArchiveLoader.musicTrack, class233.musicPatchesArchive, class215.soundCache, 22050)) { // L: 110
					class233.midiPcmStream.clearAll(); // L: 111
					class233.midiPcmStream.setPcmStreamVolume(class233.musicTrackVolume); // L: 112
					class233.midiPcmStream.setMusicTrack(ArchiveLoader.musicTrack, GrandExchangeOfferUnitPriceComparator.musicTrackBoolean); // L: 113
					class233.musicPlayerStatus = 0; // L: 114
					ArchiveLoader.musicTrack = null; // L: 115
					class215.soundCache = null; // L: 116
					InvDefinition.musicTrackArchive = null; // L: 117
					return true; // L: 118
				}
			}
		} catch (Exception var1) { // L: 122
			var1.printStackTrace(); // L: 123
			class233.midiPcmStream.clear(); // L: 124
			class233.musicPlayerStatus = 0; // L: 125
			ArchiveLoader.musicTrack = null; // L: 126
			class215.soundCache = null; // L: 127
			InvDefinition.musicTrackArchive = null; // L: 128
		}

		return false; // L: 130
	}
}
