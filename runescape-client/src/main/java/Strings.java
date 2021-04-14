import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bi")
	public static String field2966;
	@ObfuscatedName("cv")
	public static String field3005;
	@ObfuscatedName("jo")
	public static String field2961;
	@ObfuscatedName("ju")
	public static String field2955;
	@ObfuscatedName("jx")
	public static String field3183;

	static {
		field2966 = "Please visit the support page for assistance."; // L: 60
		field3005 = "Please visit the support page for assistance."; // L: 99
		field2961 = ""; // L: 275
		field2955 = "Page has opened in a new window."; // L: 276
		field3183 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1090221079"
	)
	static final void method4404() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7285
		var0.importIndex(); // L: 7286
		int var1 = var0.readBits(8); // L: 7287
		int var2;
		if (var1 < Client.npcCount) { // L: 7288
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7289
				Client.field724[++Client.field723 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7291
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7292

			for (var2 = 0; var2 < var1; ++var2) { // L: 7293
				int var3 = Client.npcIndices[var2]; // L: 7294
				NPC var4 = Client.npcs[var3]; // L: 7295
				int var5 = var0.readBits(1); // L: 7296
				if (var5 == 0) { // L: 7297
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7298
					var4.npcCycle = Client.cycle; // L: 7299
				} else {
					int var6 = var0.readBits(2); // L: 7302
					if (var6 == 0) { // L: 7303
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7304
						var4.npcCycle = Client.cycle; // L: 7305
						Client.field646[++Client.field645 - 1] = var3; // L: 7306
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7309
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7310
							var4.npcCycle = Client.cycle; // L: 7311
							var7 = var0.readBits(3); // L: 7312
							var4.method2235(var7, (byte)1); // L: 7313
							var8 = var0.readBits(1); // L: 7314
							if (var8 == 1) { // L: 7315
								Client.field646[++Client.field645 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7318
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7319
							var4.npcCycle = Client.cycle; // L: 7320
							var7 = var0.readBits(3); // L: 7321
							var4.method2235(var7, (byte)2); // L: 7322
							var8 = var0.readBits(3); // L: 7323
							var4.method2235(var8, (byte)2); // L: 7324
							int var9 = var0.readBits(1); // L: 7325
							if (var9 == 1) {
								Client.field646[++Client.field645 - 1] = var3; // L: 7326
							}
						} else if (var6 == 3) { // L: 7329
							Client.field724[++Client.field723 - 1] = var3; // L: 7330
						}
					}
				}
			}

		}
	} // L: 7334

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "54"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class231.getWidgetChild(var0, var1); // L: 8824
		if (var4 != null && var4.onTargetEnter != null) { // L: 8825
			ScriptEvent var5 = new ScriptEvent(); // L: 8826
			var5.widget = var4; // L: 8827
			var5.args = var4.onTargetEnter; // L: 8828
			class19.runScriptEvent(var5); // L: 8829
		}

		Client.field874 = var3; // L: 8831
		Client.isSpellSelected = true; // L: 8832
		class148.selectedSpellWidget = var0; // L: 8833
		Client.selectedSpellChildIndex = var1; // L: 8834
		UserComparator10.selectedSpellFlags = var2; // L: 8835
		class29.invalidateWidget(var4); // L: 8836
	} // L: 8837
}
