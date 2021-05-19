import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2099;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2100;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1258140299
	)
	@Export("value")
	final int value;

	static {
		field2099 = new WorldMapID(0); // L: 4
		field2100 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "490999200"
	)
	public static boolean method3587() {
		try {
			if (class232.musicPlayerStatus == 2) { // L: 110
				if (NPC.musicTrack == null) { // L: 111
					NPC.musicTrack = MusicTrack.readTrack(JagexCache.musicTrackArchive, class232.musicTrackGroupId, class232.musicTrackFileId); // L: 112
					if (NPC.musicTrack == null) { // L: 113
						return false;
					}
				}

				if (class268.soundCache == null) { // L: 115
					class268.soundCache = new SoundCache(UserComparator10.soundEffectsArchive, class232.musicSamplesArchive);
				}

				if (class232.midiPcmStream.loadMusicTrack(NPC.musicTrack, class232.musicPatchesArchive, class268.soundCache, 22050)) { // L: 116
					class232.midiPcmStream.clearAll(); // L: 117
					class232.midiPcmStream.setPcmStreamVolume(LoginPacket.musicTrackVolume); // L: 118
					class232.midiPcmStream.setMusicTrack(NPC.musicTrack, VarpDefinition.musicTrackBoolean); // L: 119
					class232.musicPlayerStatus = 0; // L: 120
					NPC.musicTrack = null; // L: 121
					class268.soundCache = null; // L: 122
					JagexCache.musicTrackArchive = null; // L: 123
					return true; // L: 124
				}
			}
		} catch (Exception var1) { // L: 128
			var1.printStackTrace(); // L: 129
			class232.midiPcmStream.clear(); // L: 130
			class232.musicPlayerStatus = 0; // L: 131
			NPC.musicTrack = null; // L: 132
			class268.soundCache = null; // L: 133
			JagexCache.musicTrackArchive = null; // L: 134
		}

		return false; // L: 136
	}
}
