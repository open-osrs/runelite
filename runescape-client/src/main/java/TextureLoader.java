import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1291576532"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-200927796"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1510277471"
	)
	boolean vmethod5096(int var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1828440657"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
