import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1311269963"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-897876205"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1352590845"
	)
	boolean vmethod3790(int var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "306645378"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
