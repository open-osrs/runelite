import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1057260959"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1770582594"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1262216131"
	)
	boolean vmethod4505(int var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "9"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
