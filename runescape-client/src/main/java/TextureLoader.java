import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "24"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-3917"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-52"
	)
	boolean vmethod4538(int var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1596996574"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
