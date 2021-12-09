import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "38"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1608258076"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1579340371"
	)
	boolean vmethod4324(int var1);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1722756795"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
