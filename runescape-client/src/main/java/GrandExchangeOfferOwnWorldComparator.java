import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -2144247307
	)
	static int field607;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972437249
	)
	public static int field608;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[[Liv;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 11744

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;B)I",
		garbageValue = "16"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 11747
			return 0;
		} else {
			if (this.filterWorlds) { // L: 11748
				if (Client.worldId == var1.world) { // L: 11749
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 11750
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 11752
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 11756
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 11760
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "287723584"
	)
	static SecureRandom method1271() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}
}
