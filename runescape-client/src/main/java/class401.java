import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class401 {
	@ObfuscatedName("r")
	static final int[] field4398;
	@ObfuscatedName("k")
	static final int[] field4393;

	static {
		field4398 = new int[2048];
		field4393 = new int[2048]; // L: 14
		double var0 = 0.0030679615757712823D; // L: 17

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 18
			field4398[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 19
			field4393[var2] = (int)(65536.0D * Math.cos((double)var2 * var0)); // L: 20
		}

	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "298301940"
	)
	public static int method7247(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145917637"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field731) { // L: 3341
			WorldMapEvent.midiPcmStream.clear(); // L: 3343
			class273.musicPlayerStatus = 1; // L: 3344
			class147.musicTrackArchive = null; // L: 3345
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Interpreter.clientPreferences.method2288() != 0 && !Client.field731) { // L: 3348
			Archive var1 = ArchiveLoader.archive6; // L: 3349
			int var2 = Interpreter.clientPreferences.method2288(); // L: 3350
			class273.musicPlayerStatus = 1; // L: 3352
			class147.musicTrackArchive = var1; // L: 3353
			ArchiveLoader.musicTrackGroupId = var0; // L: 3354
			class273.musicTrackFileId = 0; // L: 3355
			DevicePcmPlayerProvider.musicTrackVolume = var2; // L: 3356
			class260.musicTrackBoolean = false; // L: 3357
			class273.pcmSampleLength = 2; // L: 3358
		}

		Client.currentTrackGroupId = var0; // L: 3361
	} // L: 3362
}
