import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class329 {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = 542004201
	)
	static int field3867;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lic;Ljava/lang/String;Ljava/lang/String;B)Llh;",
		garbageValue = "48"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return Buddy.method5355(var0, var3, var4);
	}
}
