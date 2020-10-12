import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class234 {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 710753405
	)
	static int field3100;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;Ljava/lang/String;I)Lls;",
		garbageValue = "246084812"
	)
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 142
		int var4 = var0.getFileId(var3, var2); // L: 143
		return WorldMapRegion.method611(var0, var3, var4); // L: 144
	}
}
