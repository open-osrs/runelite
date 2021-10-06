import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1743192270"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-100"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "172178592"
	)
	boolean vmethod4565(int var1);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "894427577"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
