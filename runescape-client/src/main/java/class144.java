import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public abstract class class144 extends Node {
	class144() {
	} // L: 49

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	abstract void vmethod3096(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	abstract void vmethod3093(ClanChannel var1);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-413374556"
	)
	static void method3022(Float var0, Float var1) {
		if (var0 + class114.field1396 < 1.3333334F) { // L: 283
			float var2 = var0 - 2.0F; // L: 284
			float var3 = var0 - 1.0F; // L: 285
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3)); // L: 286
			float var5 = (var4 + -var2) * 0.5F; // L: 287
			if (var1 + class114.field1396 > var5) { // L: 288
				var1 = var5 - class114.field1396; // L: 289
			} else {
				var5 = (-var2 - var4) * 0.5F; // L: 292
				if (var1 < var5 + class114.field1396) { // L: 293
					var1 = class114.field1396 + var5; // L: 294
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1396; // L: 299
			var1 = 0.33333334F - class114.field1396; // L: 300
		}

	} // L: 302

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1886110394"
	)
	static void method3014() {
		if (class19.localPlayer.x >> 7 == Client.destinationX && class19.localPlayer.y >> 7 == Client.destinationY) { // L: 4282
			Client.destinationX = 0; // L: 4283
		}

	} // L: 4285
}
