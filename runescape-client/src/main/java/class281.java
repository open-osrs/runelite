import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class281 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;

	static {
		int var0 = 0;
		int var1 = 0;
		class276[] var2 = new class276[]{class276.field3288, class276.field3284};
		class276[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class276 var5 = var3[var4];
			if (var5.field3285 > var0) {
				var0 = var5.field3285;
			}

			if (var5.field3286 > var1) {
				var1 = var5.field3286;
			}
		}

	}
}
