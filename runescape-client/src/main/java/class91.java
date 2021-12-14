import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class91 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = -1294615365
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	public static void method2336() {
		try {
			if (class260.musicPlayerStatus == 1) {
				int var0 = class260.midiPcmStream.method5073();
				if (var0 > 0 && class260.midiPcmStream.isReady()) {
					var0 -= class260.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class260.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class260.midiPcmStream.clear();
				class260.midiPcmStream.removeAll();
				if (class124.musicTrackArchive != null) {
					class260.musicPlayerStatus = 2;
				} else {
					class260.musicPlayerStatus = 0;
				}

				class21.musicTrack = null;
				class257.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class260.midiPcmStream.clear();
			class260.musicPlayerStatus = 0;
			class21.musicTrack = null;
			class257.soundCache = null;
			class124.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1433534225"
	)
	static final int method2332() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "848366237"
	)
	static final void method2337() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}
}
