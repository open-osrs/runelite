import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class344 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FFFF[FB)V",
		garbageValue = "7"
	)
	static void method6252(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0; // L: 319
		float var6 = var2 - var1; // L: 320
		float var7 = var3 - var2; // L: 321
		float var8 = var6 - var5; // L: 322
		var4[3] = var7 - var6 - var8; // L: 323
		var4[2] = var8 + var8 + var8; // L: 324
		var4[1] = var5 + var5 + var5; // L: 325
		var4[0] = var0; // L: 326
	} // L: 327
}
