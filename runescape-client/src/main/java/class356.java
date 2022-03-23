import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class356 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "33344244"
	)
	public static boolean method6621() {
		try {
			if (class273.musicPlayerStatus == 2) { // L: 70
				if (class273.musicTrack == null) { // L: 71
					class273.musicTrack = MusicTrack.readTrack(class147.musicTrackArchive, ArchiveLoader.musicTrackGroupId, class273.musicTrackFileId); // L: 72
					if (class273.musicTrack == null) { // L: 73
						return false;
					}
				}

				if (class273.soundCache == null) { // L: 75
					class273.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
				}

				if (WorldMapEvent.midiPcmStream.loadMusicTrack(class273.musicTrack, class273.musicPatchesArchive, class273.soundCache, 22050)) { // L: 76
					WorldMapEvent.midiPcmStream.clearAll(); // L: 77
					WorldMapEvent.midiPcmStream.setPcmStreamVolume(DevicePcmPlayerProvider.musicTrackVolume); // L: 78
					WorldMapEvent.midiPcmStream.setMusicTrack(class273.musicTrack, class260.musicTrackBoolean); // L: 79
					class273.musicPlayerStatus = 0; // L: 80
					class273.musicTrack = null; // L: 81
					class273.soundCache = null; // L: 82
					class147.musicTrackArchive = null; // L: 83
					return true; // L: 84
				}
			}
		} catch (Exception var1) { // L: 88
			var1.printStackTrace(); // L: 89
			WorldMapEvent.midiPcmStream.clear(); // L: 90
			class273.musicPlayerStatus = 0; // L: 91
			class273.musicTrack = null; // L: 92
			class273.soundCache = null; // L: 93
			class147.musicTrackArchive = null; // L: 94
		}

		return false; // L: 96
	}
}
