import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;I)I",
		garbageValue = "-875345693"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "453891314"
	)
	static void method228() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 119
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 120
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 121
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 122
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 123
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 124
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 125
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 126
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 127
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 128
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 129
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 130
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 131
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 140
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 141
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 145
		}

	} // L: 147

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-91260225"
	)
	static void method227() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 50
	} // L: 51

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-559149911"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1532
		Login.Login_response2 = var1; // L: 1533
		Login.Login_response3 = var2; // L: 1534
	} // L: 1535

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "16"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4859
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4860
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4861
				int var3 = var2.x >> 7; // L: 4862
				int var4 = var2.y >> 7; // L: 4863
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4864
					if (var2.field1011 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4865
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4866
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4867
					}

					long var5 = GrandExchangeOfferOwnWorldComparator.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4869
					var2.playerCycle = Client.cycle; // L: 4870
					ModeWhere.scene.drawEntity(GrandExchangeOfferUnitPriceComparator.Client_plane, var2.x, var2.y, GrandExchangeOfferWorldComparator.getTileHeight(var2.field1011 * 64 - 64 + var2.x, var2.field1011 * 64 - 64 + var2.y, GrandExchangeOfferUnitPriceComparator.Client_plane), var2.field1011 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4871
				}
			}
		}

	} // L: 4875
}
