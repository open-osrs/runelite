import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ja")
public class class278 {
	@ObfuscatedName("ae")
	static java.awt.Font fontHelvetica13;

	@ObfuscatedName("z")
	static double method5090(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4; // L: 10
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 12
		return var6 / var4; // L: 14
	}
}
