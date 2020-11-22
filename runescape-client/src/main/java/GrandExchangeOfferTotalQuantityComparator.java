import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -343674237
	)
	static int field81;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;I)I",
		garbageValue = "-2113100809"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "280235874"
	)
	static int method183(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "43"
	)
	public static boolean method174() {
		try {
			if (class206.musicPlayerStatus == 2) { // L: 71
				if (InterfaceParent.musicTrack == null) { // L: 72
					InterfaceParent.musicTrack = MusicTrack.readTrack(class23.musicTrackArchive, TileItem.musicTrackGroupId, class206.musicTrackFileId); // L: 73
					if (InterfaceParent.musicTrack == null) { // L: 74
						return false;
					}
				}

				if (LoginType.soundCache == null) { // L: 76
					LoginType.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
				}

				if (class13.midiPcmStream.loadMusicTrack(InterfaceParent.musicTrack, class206.musicPatchesArchive, LoginType.soundCache, 22050)) { // L: 77
					class13.midiPcmStream.clearAll(); // L: 78
					class13.midiPcmStream.setPcmStreamVolume(class206.musicTrackVolume); // L: 79
					class13.midiPcmStream.setMusicTrack(InterfaceParent.musicTrack, class195.musicTrackBoolean); // L: 80
					class206.musicPlayerStatus = 0; // L: 81
					InterfaceParent.musicTrack = null; // L: 82
					LoginType.soundCache = null; // L: 83
					class23.musicTrackArchive = null; // L: 84
					return true; // L: 85
				}
			}
		} catch (Exception var1) { // L: 89
			var1.printStackTrace(); // L: 90
			class13.midiPcmStream.clear(); // L: 91
			class206.musicPlayerStatus = 0; // L: 92
			InterfaceParent.musicTrack = null; // L: 93
			LoginType.soundCache = null; // L: 94
			class23.musicTrackArchive = null; // L: 95
		}

		return false; // L: 97
	}
}
