import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "717336896"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1504240934"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2072812202"
	)
	boolean vmethod4485(int var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-618137712"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
