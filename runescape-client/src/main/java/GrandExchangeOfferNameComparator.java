import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1171095583
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lld;Lld;I)I",
		garbageValue = "-164807231"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "-1546163468"
	)
	public static class370 method5704() {
		synchronized(class370.field4235) { // L: 28
			if (class370.field4231 == 0) { // L: 29
				return new class370();
			} else {
				class370.field4235[--class370.field4231].method6643(); // L: 31
				return class370.field4235[class370.field4231]; // L: 32
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1328476898"
	)
	public static int method5702(int var0) {
		--var0; // L: 50
		var0 |= var0 >>> 1; // L: 51
		var0 |= var0 >>> 2; // L: 52
		var0 |= var0 >>> 4; // L: 53
		var0 |= var0 >>> 8; // L: 54
		var0 |= var0 >>> 16; // L: 55
		return var0 + 1; // L: 56
	}
}
