import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class351 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("a")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "-49"
	)
	public static void method6285(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1301102242"
	)
	static String method6286(String var0) {
		PlayerType[] var1 = class19.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(ReflectionCheck.method1064(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
