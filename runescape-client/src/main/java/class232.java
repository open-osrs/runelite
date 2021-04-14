import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public enum class232 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	field2809(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	field2805(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	field2807(2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	field2808(3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	field2811(4);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1140153863
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1125471863
	)
	final int field2810;

	class232(int var3) {
		this.field2810 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2810; // L: 18
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-692759541"
	)
	public static void method4360() {
		class210.midiPcmStream.clear(); // L: 36
		class210.musicPlayerStatus = 1; // L: 37
		class210.musicTrackArchive = null; // L: 38
	} // L: 39

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIII)V",
		garbageValue = "393437031"
	)
	static void method4364(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Login.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3064
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3065
				int var4 = var0.soundEffects[var1]; // L: 3066
				if (var4 != 0) { // L: 3067
					int var5 = var4 >> 8; // L: 3068
					int var6 = var4 >> 4 & 7; // L: 3069
					int var7 = var4 & 15; // L: 3070
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3071
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3072
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3073
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3074
					int var8 = (var2 - 64) / 128; // L: 3075
					int var9 = (var3 - 64) / 128; // L: 3076
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3077
					++Client.soundEffectCount; // L: 3078
				}
			}
		}
	} // L: 3079

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lhu;I)Ljava/lang/String;",
		garbageValue = "-2066634190"
	)
	static String method4363(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9917
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9918
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9920
					if (var3 == -1) { // L: 9921
						break;
					}

					var0 = var0.substring(0, var3) + WorldMapSection2.method2726(WorldMapSection0.method3036(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 9922
				}
			}
		}

		return var0; // L: 9926
	}
}
