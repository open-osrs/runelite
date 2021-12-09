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
			if (class260.musicPlayerStatus == 1) { // L: 68
				int var0 = class260.midiPcmStream.method5073(); // L: 69
				if (var0 > 0 && class260.midiPcmStream.isReady()) { // L: 70
					var0 -= class260.pcmSampleLength; // L: 71
					if (var0 < 0) { // L: 72
						var0 = 0;
					}

					class260.midiPcmStream.setPcmStreamVolume(var0); // L: 73
					return; // L: 74
				}

				class260.midiPcmStream.clear(); // L: 76
				class260.midiPcmStream.removeAll(); // L: 77
				if (class124.musicTrackArchive != null) { // L: 78
					class260.musicPlayerStatus = 2;
				} else {
					class260.musicPlayerStatus = 0; // L: 79
				}

				class21.musicTrack = null; // L: 80
				class257.soundCache = null; // L: 81
			}
		} catch (Exception var2) { // L: 84
			var2.printStackTrace(); // L: 85
			class260.midiPcmStream.clear(); // L: 86
			class260.musicPlayerStatus = 0; // L: 87
			class21.musicTrack = null; // L: 88
			class257.soundCache = null; // L: 89
			class124.musicTrackArchive = null; // L: 90
		}

	} // L: 92

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1433534225"
	)
	static final int method2332() {
		return ViewportMouse.ViewportMouse_x; // L: 104
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "848366237"
	)
	static final void method2337() {
		int[] var0 = Players.Players_indices; // L: 4484

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 4485
			Player var4 = Client.players[var0[var1]]; // L: 4486
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 4487
				--var4.overheadTextCyclesRemaining; // L: 4488
				if (var4.overheadTextCyclesRemaining == 0) { // L: 4489
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4492
			int var2 = Client.npcIndices[var1]; // L: 4493
			NPC var3 = Client.npcs[var2]; // L: 4494
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 4495
				--var3.overheadTextCyclesRemaining; // L: 4496
				if (var3.overheadTextCyclesRemaining == 0) { // L: 4497
					var3.overheadText = null;
				}
			}
		}

	} // L: 4500
}
