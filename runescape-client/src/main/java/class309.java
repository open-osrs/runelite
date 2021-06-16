import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class309 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "1818635453"
	)
	static final void method5671(Widget var0) {
		int var1 = var0.contentType; // L: 11205
		if (var1 == 324) { // L: 11206
			if (Client.field890 == -1) { // L: 11207
				Client.field890 = var0.spriteId2; // L: 11208
				Client.field902 = var0.spriteId; // L: 11209
			}

			if (Client.playerAppearance.isFemale) { // L: 11211
				var0.spriteId2 = Client.field890;
			} else {
				var0.spriteId2 = Client.field902; // L: 11212
			}

		} else if (var1 == 325) { // L: 11215
			if (Client.field890 == -1) { // L: 11216
				Client.field890 = var0.spriteId2; // L: 11217
				Client.field902 = var0.spriteId; // L: 11218
			}

			if (Client.playerAppearance.isFemale) { // L: 11220
				var0.spriteId2 = Client.field902;
			} else {
				var0.spriteId2 = Client.field890; // L: 11221
			}

		} else if (var1 == 327) { // L: 11224
			var0.modelAngleX = 150; // L: 11225
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11226
			var0.modelType = 5; // L: 11227
			var0.modelId = 0; // L: 11228
		} else if (var1 == 328) { // L: 11231
			var0.modelAngleX = 150; // L: 11232
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11233
			var0.modelType = 5; // L: 11234
			var0.modelId = 1; // L: 11235
		}
	} // L: 11213 11222 11229 11236 11238
}
