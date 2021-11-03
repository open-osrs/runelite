import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1224332246"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1611848046"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2069406256"
	)
	boolean vmethod4636(int var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-40"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
