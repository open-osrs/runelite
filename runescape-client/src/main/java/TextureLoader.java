import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1265290789"
	)
	int[] getTexturePixels(int var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260599249"
	)
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "168595235"
	)
	boolean vmethod3396(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "14506"
	)
	boolean isLowDetail(int var1);
}
