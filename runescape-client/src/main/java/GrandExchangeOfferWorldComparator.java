import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)I",
		garbageValue = "1939073970"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;Ljava/lang/String;Ljava/lang/String;I)Lmx;",
		garbageValue = "2088711199"
	)
	public static Font method5808(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 124
		int var5 = var0.getFileId(var4, var3); // L: 125
		return class387.method6781(var0, var1, var4, var5); // L: 126
	}
}
