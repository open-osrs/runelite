import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1529017761"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1590086448"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "476826726"
	)
	boolean vmethod4224(int var1);

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "68842111"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
