import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)[I",
		garbageValue = "1948753683"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1038437362"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "54"
	)
	boolean vmethod3404(int var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "18"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
