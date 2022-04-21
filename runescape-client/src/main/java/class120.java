import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class120 implements class112 {
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "524916497"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9060
			Widget var0 = class143.getWidgetChild(class92.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9061
			if (var0 != null && var0.onTargetLeave != null) { // L: 9062
				ScriptEvent var1 = new ScriptEvent(); // L: 9063
				var1.widget = var0; // L: 9064
				var1.args = var0.onTargetLeave; // L: 9065
				class1.runScriptEvent(var1); // L: 9066
			}

			Client.selectedSpellItemId = -1; // L: 9068
			Client.isSpellSelected = false; // L: 9069
			class290.invalidateWidget(var0); // L: 9070
		}
	} // L: 9071

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "2110046023"
	)
	static final void method2755(Widget var0) {
		int var1 = var0.contentType; // L: 11449
		if (var1 == 324) { // L: 11450
			if (Client.field759 == -1) { // L: 11451
				Client.field759 = var0.spriteId2; // L: 11452
				Client.field738 = var0.spriteId; // L: 11453
			}

			if (Client.playerAppearance.isFemale) { // L: 11455
				var0.spriteId2 = Client.field759;
			} else {
				var0.spriteId2 = Client.field738; // L: 11456
			}

		} else if (var1 == 325) { // L: 11459
			if (Client.field759 == -1) { // L: 11460
				Client.field759 = var0.spriteId2; // L: 11461
				Client.field738 = var0.spriteId; // L: 11462
			}

			if (Client.playerAppearance.isFemale) { // L: 11464
				var0.spriteId2 = Client.field738;
			} else {
				var0.spriteId2 = Client.field759; // L: 11465
			}

		} else if (var1 == 327) { // L: 11468
			var0.modelAngleX = 150; // L: 11469
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11470
			var0.modelType = 5; // L: 11471
			var0.modelId = 0; // L: 11472
		} else if (var1 == 328) { // L: 11475
			var0.modelAngleX = 150; // L: 11476
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11477
			var0.modelType = 5; // L: 11478
			var0.modelId = 1; // L: 11479
		}
	} // L: 11457 11466 11473 11480 11482
}
