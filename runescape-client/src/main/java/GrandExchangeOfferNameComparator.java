import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llj;Llj;I)I",
		garbageValue = "-2002809758"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-1233510501"
	)
	public static void method5979(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20
}
