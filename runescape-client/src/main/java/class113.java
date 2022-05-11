import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class113 {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1838363621
	)
	static int field1421;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static Widget field1422;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 1983455525
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -272617605
	)
	int field1430;
	@ObfuscatedName("q")
	float field1428;
	@ObfuscatedName("l")
	float field1423;
	@ObfuscatedName("k")
	float field1424;
	@ObfuscatedName("a")
	float field1425;
	@ObfuscatedName("m")
	float field1426;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	class113 field1427;

	class113() {
		this.field1423 = Float.MAX_VALUE; // L: 8
		this.field1424 = Float.MAX_VALUE; // L: 9
		this.field1425 = Float.MAX_VALUE; // L: 10
		this.field1426 = Float.MAX_VALUE; // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1602426305"
	)
	void method2621(Buffer var1, int var2) {
		this.field1430 = var1.readShort(); // L: 17
		this.field1428 = var1.method7570();
		this.field1423 = var1.method7570();
		this.field1424 = var1.method7570(); // L: 20
		this.field1425 = var1.method7570(); // L: 21
		this.field1426 = var1.method7570(); // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1202809250"
	)
	public static final synchronized long method2624() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class269.field3215) { // L: 15
			class269.field3217 += class269.field3215 - var0; // L: 16
		}

		class269.field3215 = var0; // L: 18
		return class269.field3217 + var0; // L: 19
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-530991411"
	)
	public static void method2625(String[] var0, int[] var1) {
		InterfaceParent.method2072(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldz;[F[FB)V",
		garbageValue = "-37"
	)
	static void method2623(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 295
			var0.field1478 = var1[0]; // L: 298
			float var3 = var1[3] - var1[0]; // L: 299
			float var4 = var2[3] - var2[0]; // L: 300
			float var5 = var1[1] - var1[0]; // L: 301
			float var6 = 0.0F; // L: 302
			float var7 = 0.0F; // L: 303
			if (0.0D != (double)var5) { // L: 304
				var6 = (var2[1] - var2[0]) / var5; // L: 305
			}

			var5 = var1[3] - var1[2]; // L: 307
			if ((double)var5 != 0.0D) { // L: 308
				var7 = (var2[3] - var2[2]) / var5; // L: 309
			}

			float var8 = 1.0F / (var3 * var3); // L: 311
			float var9 = var6 * var3; // L: 312
			float var10 = var3 * var7; // L: 313
			var0.field1473[0] = (var9 + var10 - var4 - var4) * var8 / var3; // L: 314
			var0.field1473[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8; // L: 315
			var0.field1473[2] = var6; // L: 316
			var0.field1473[3] = var2[0]; // L: 317
		}
	} // L: 296 318
}
