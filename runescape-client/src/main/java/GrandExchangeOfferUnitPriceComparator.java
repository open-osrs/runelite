import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)I",
		garbageValue = "-2004855128"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-118"
	)
	static boolean method6031() {
		Date var0;
		try {
			var0 = GameObject.method4552(); // L: 1077
		} catch (ParseException var9) { // L: 1079
			GraphicsObject.method1877("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1080
			return false; // L: 1081
		}

		if (var0 == null) { // L: 1083
			return false; // L: 1084
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance(); // L: 1088
			var2.set(1, var2.get(1) - 13); // L: 1089
			var2.set(5, var2.get(5) + 1); // L: 1090
			var2.set(11, 0); // L: 1091
			var2.set(12, 0); // L: 1092
			var2.set(13, 0); // L: 1093
			var2.set(14, 0); // L: 1094
			Date var3 = var2.getTime(); // L: 1095
			boolean var5 = var0.before(var3); // L: 1096
			Date var4 = BufferedNetSocket.method6835(); // L: 1101
			boolean var7 = var0.after(var4); // L: 1102
			if (!var7) { // L: 1105
				GraphicsObject.method1877("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1106
				return false; // L: 1107
			} else {
				if (!var5) { // L: 1109
					class174.field1891 = 8388607; // L: 1110
				} else {
					class174.field1891 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1113
				}

				return true; // L: 1115
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1960096370"
	)
	static final void method6024() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 8009
		var0.importIndex(); // L: 8010
		int var1 = var0.readBits(8); // L: 8011
		int var2;
		if (var1 < Client.npcCount) { // L: 8012
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8013
				Client.field616[++Client.field615 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8015
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8016

			for (var2 = 0; var2 < var1; ++var2) { // L: 8017
				int var3 = Client.npcIndices[var2]; // L: 8018
				NPC var4 = Client.npcs[var3]; // L: 8019
				int var5 = var0.readBits(1); // L: 8020
				if (var5 == 0) { // L: 8021
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8022
					var4.npcCycle = Client.cycle; // L: 8023
				} else {
					int var6 = var0.readBits(2); // L: 8026
					if (var6 == 0) { // L: 8027
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8028
						var4.npcCycle = Client.cycle; // L: 8029
						Client.field539[++Client.field538 - 1] = var3; // L: 8030
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8033
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8034
							var4.npcCycle = Client.cycle; // L: 8035
							var7 = var0.readBits(3); // L: 8036
							var4.method2361(var7, class192.field2212); // L: 8037
							var8 = var0.readBits(1); // L: 8038
							if (var8 == 1) { // L: 8039
								Client.field539[++Client.field538 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8042
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8043
							var4.npcCycle = Client.cycle; // L: 8044
							if (var0.readBits(1) == 1) { // L: 8045
								var7 = var0.readBits(3); // L: 8046
								var4.method2361(var7, class192.field2211); // L: 8047
								var8 = var0.readBits(3); // L: 8048
								var4.method2361(var8, class192.field2211); // L: 8049
							} else {
								var7 = var0.readBits(3); // L: 8052
								var4.method2361(var7, class192.field2209); // L: 8053
							}

							var7 = var0.readBits(1); // L: 8055
							if (var7 == 1) { // L: 8056
								Client.field539[++Client.field538 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8059
							Client.field616[++Client.field615 - 1] = var3; // L: 8060
						}
					}
				}
			}

		}
	} // L: 8064
}
