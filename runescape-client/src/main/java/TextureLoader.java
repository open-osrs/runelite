import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2000733187"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1891738146"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1637380669"
	)
	boolean vmethod4332(int var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1729121173"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
