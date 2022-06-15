import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("c")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12530

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;B)I",
		garbageValue = "-46"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12533
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12534
				if (Client.worldId == var1.world) { // L: 12535
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12536
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12538
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12546
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12542
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1404651697"
	)
	public static String method1097(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class295.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	static final void method1095() {
		Object var10000 = null; // L: 187
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		class290.addGameMessage(30, "", var0); // L: 189
	} // L: 191

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	public static void method1096(boolean var0) {
		if (var0 != DevicePcmPlayerProvider.ItemDefinition_inMembersWorld) { // L: 573
			ObjectSound.method1702(); // L: 574
			DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var0; // L: 575
		}

	} // L: 577
}
