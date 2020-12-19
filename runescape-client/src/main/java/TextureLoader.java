import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "883759945"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1799220931"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1523659518"
	)
	boolean vmethod3359(int var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-562229865"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
