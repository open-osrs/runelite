import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -3156287025995646729L
	)
	static long field3625;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 770071241
	)
	static int field3628;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 964659383
	)
	@Export("baseX")
	static int baseX;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Ljj;B)I",
		garbageValue = "14"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-671560252"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
