import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class279 {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "7"
	)
	@Export("parseInt")
	public static int parseInt(CharSequence var0) {
		return World.parseIntCustomRadix(var0, 10, true);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "-625858082"
	)
	static final void method5006(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field813 == -1) {
				Client.field813 = var0.spriteId2;
				Client.field911 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field813;
			} else {
				var0.spriteId2 = Client.field911;
			}

		} else if (var1 == 325) {
			if (Client.field813 == -1) {
				Client.field813 = var0.spriteId2;
				Client.field911 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field911;
			} else {
				var0.spriteId2 = Client.field813;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
