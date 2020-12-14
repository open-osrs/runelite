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
		return World.parseIntCustomRadix(var0, 10, true); // L: 76
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "-625858082"
	)
	static final void method5006(Widget var0) {
		int var1 = var0.contentType; // L: 10749
		if (var1 == 324) { // L: 10750
			if (Client.field813 == -1) { // L: 10751
				Client.field813 = var0.spriteId2; // L: 10752
				Client.field911 = var0.spriteId; // L: 10753
			}

			if (Client.playerComposition.isFemale) { // L: 10755
				var0.spriteId2 = Client.field813;
			} else {
				var0.spriteId2 = Client.field911; // L: 10756
			}

		} else if (var1 == 325) { // L: 10759
			if (Client.field813 == -1) { // L: 10760
				Client.field813 = var0.spriteId2; // L: 10761
				Client.field911 = var0.spriteId; // L: 10762
			}

			if (Client.playerComposition.isFemale) { // L: 10764
				var0.spriteId2 = Client.field911;
			} else {
				var0.spriteId2 = Client.field813; // L: 10765
			}

		} else if (var1 == 327) { // L: 10768
			var0.modelAngleX = 150; // L: 10769
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 10770
			var0.modelType = 5; // L: 10771
			var0.modelId = 0; // L: 10772
		} else if (var1 == 328) { // L: 10775
			var0.modelAngleX = 150; // L: 10776
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 10777
			var0.modelType = 5; // L: 10778
			var0.modelId = 1; // L: 10779
		}
	} // L: 10757 10766 10773 10780 10782
}
