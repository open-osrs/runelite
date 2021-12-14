import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class147 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)Z",
		garbageValue = "-1711899825"
	)
	public static boolean method3009(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			WorldMapSection0.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
