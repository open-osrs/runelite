import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;I)I",
		garbageValue = "698282162"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-33"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 37
		boolean var3 = false; // L: 38
		int var4 = 0; // L: 39
		int var5 = var0.length(); // L: 40
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 70
				break;
			}

			label84: {
				char var7 = var0.charAt(var6); // L: 42
				if (var6 == 0) { // L: 43
					if (var7 == '-') { // L: 44
						var2 = true; // L: 45
						break label84;
					}

					if (var7 == '+') { // L: 48
						break label84;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 50
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 51
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 52
						var1 = false; // L: 54
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 57
					var1 = false; // L: 58
					break; // L: 59
				}

				if (var2) { // L: 61
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9; // L: 62
				if (var4 != var8 / 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				var4 = var8; // L: 67
				var3 = true; // L: 68
			}

			++var6; // L: 41
		}

		return var1; // L: 72
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "0"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return NetSocket.worldMap; // L: 686
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1853647691"
	)
	static void method4989(int var0) {
		class9.tempMenuAction = new MenuAction(); // L: 11060
		class9.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11061
		class9.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11062
		class9.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11063
		class9.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11064
		class9.tempMenuAction.action = Client.menuActions[var0]; // L: 11065
	} // L: 11066
}
