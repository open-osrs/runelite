import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "20"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1186181127"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-189956627"
	)
	boolean vmethod4428(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2053899531"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
