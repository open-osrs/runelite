import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class137 {
	@ObfuscatedName("b")
	public static short[][] field1519;

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "644093212"
	)
	static final void method2826(Widget var0) {
		int var1 = var0.contentType; // L: 11468
		if (var1 == 324) { // L: 11469
			if (Client.field737 == -1) { // L: 11470
				Client.field737 = var0.spriteId2; // L: 11471
				Client.field581 = var0.spriteId; // L: 11472
			}

			if (Client.playerAppearance.isFemale) { // L: 11474
				var0.spriteId2 = Client.field737;
			} else {
				var0.spriteId2 = Client.field581; // L: 11475
			}

		} else if (var1 == 325) { // L: 11478
			if (Client.field737 == -1) { // L: 11479
				Client.field737 = var0.spriteId2; // L: 11480
				Client.field581 = var0.spriteId; // L: 11481
			}

			if (Client.playerAppearance.isFemale) { // L: 11483
				var0.spriteId2 = Client.field581;
			} else {
				var0.spriteId2 = Client.field737; // L: 11484
			}

		} else if (var1 == 327) { // L: 11487
			var0.modelAngleX = 150; // L: 11488
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11489
			var0.modelType = 5; // L: 11490
			var0.modelId = 0; // L: 11491
		} else if (var1 == 328) { // L: 11494
			var0.modelAngleX = 150; // L: 11495
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11496
			var0.modelType = 5; // L: 11497
			var0.modelId = 1; // L: 11498
		}
	} // L: 11476 11485 11492 11499 11501
}
