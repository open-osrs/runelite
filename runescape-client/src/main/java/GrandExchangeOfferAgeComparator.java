import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1278349979
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1870973391
	)
	public static int field3633;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Ljj;I)I",
		garbageValue = "-1896317478"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-113649637"
	)
	static final int method5126(int var0, int var1) {
		int var2 = ParamComposition.method2925(var0 - 1, var1 - 1) + ParamComposition.method2925(1 + var0, var1 - 1) + ParamComposition.method2925(var0 - 1, var1 + 1) + ParamComposition.method2925(1 + var0, var1 + 1);
		int var3 = ParamComposition.method2925(var0 - 1, var1) + ParamComposition.method2925(var0 + 1, var1) + ParamComposition.method2925(var0, var1 - 1) + ParamComposition.method2925(var0, 1 + var1);
		int var4 = ParamComposition.method2925(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-189475512"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-439805198"
	)
	static int method5132(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1957941774"
	)
	public static int method5131(String var0) {
		return var0.length() + 2;
	}
}
