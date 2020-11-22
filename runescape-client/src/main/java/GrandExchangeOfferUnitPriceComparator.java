import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 2060435919
	)
	@Export("Client_plane")
	static int Client_plane;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ly;Ly;S)I",
		garbageValue = "-21475"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "2085161041"
	)
	public static int method219(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;B)V",
		garbageValue = "1"
	)
	public static void method211(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-56"
	)
	static String method218(String var0) {
		PlayerType[] var1 = WorldMapLabelSize.PlayerType_values(); // L: 11676

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11677
			PlayerType var3 = var1[var2]; // L: 11678
			if (var3.modIcon != -1 && var0.startsWith(PrivateChatMode.method6034(var3.modIcon))) { // L: 11680 11681
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11682
				break;
			}
		}

		return var0; // L: 11689
	}
}
