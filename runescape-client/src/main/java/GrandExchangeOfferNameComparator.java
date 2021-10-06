import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;I)I",
		garbageValue = "-1248352964"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
