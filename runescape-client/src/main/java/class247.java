import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class247 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1167067929
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2050223797
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -609469797
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1859511667"
	)
	static final void method4751(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 63
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 64
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 65
					class54.field419[0][var5][var4] = 127; // L: 66
					if (var0 == var5 && var5 > 0) { // L: 67
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 68
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 69
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 70
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 74
}
