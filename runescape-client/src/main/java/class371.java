import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
final class class371 implements class370 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnk;I)V",
		garbageValue = "-2099055755"
	)
	public void vmethod6366(Object var1, Buffer var2) {
		this.method6323((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Ljava/lang/Object;",
		garbageValue = "-559339148"
	)
	public Object vmethod6362(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnk;I)V",
		garbageValue = "-121075266"
	)
	void method6323(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1443919706"
	)
	public static void method6333() {
		try {
			if (class232.musicPlayerStatus == 1) { // L: 82
				int var0 = class232.midiPcmStream.method4370(); // L: 83
				if (var0 > 0 && class232.midiPcmStream.isReady()) { // L: 84
					var0 -= class232.pcmSampleLength; // L: 85
					if (var0 < 0) { // L: 86
						var0 = 0;
					}

					class232.midiPcmStream.setPcmStreamVolume(var0); // L: 87
					return; // L: 88
				}

				class232.midiPcmStream.clear(); // L: 90
				class232.midiPcmStream.removeAll(); // L: 91
				if (JagexCache.musicTrackArchive != null) { // L: 92
					class232.musicPlayerStatus = 2;
				} else {
					class232.musicPlayerStatus = 0; // L: 93
				}

				NPC.musicTrack = null; // L: 94
				class268.soundCache = null; // L: 95
			}
		} catch (Exception var2) { // L: 98
			var2.printStackTrace(); // L: 99
			class232.midiPcmStream.clear(); // L: 100
			class232.musicPlayerStatus = 0; // L: 101
			NPC.musicTrack = null; // L: 102
			class268.soundCache = null; // L: 103
			JagexCache.musicTrackArchive = null; // L: 104
		}

	} // L: 106
}
