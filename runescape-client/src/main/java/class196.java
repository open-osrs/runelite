import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class196 {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1476626857
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Ljava/lang/String;Ljava/lang/String;I)Loi;",
		garbageValue = "-224990659"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class279.method5080(var0, var3, var4);
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "79555324"
	)
	static void method3819(int var0, int var1) {
		if (VarbitComposition.clientPreferences.musicVolume != 0 && var0 != -1) {
			Decimator.method1051(class318.archive11, var0, 0, VarbitComposition.clientPreferences.musicVolume, false);
			Client.field728 = true;
		}

	}
}
