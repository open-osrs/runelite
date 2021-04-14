import java.awt.Image;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ap")
	static Image field3318;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;B)I",
		garbageValue = "30"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1074102228"
	)
	static final int method4609(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 948
		int var4 = var0 & var2 - 1; // L: 949
		int var5 = var1 / var2; // L: 950
		int var6 = var1 & var2 - 1; // L: 951
		int var7 = class5.method83(var3, var5); // L: 952
		int var8 = class5.method83(var3 + 1, var5); // L: 953
		int var9 = class5.method83(var3, var5 + 1); // L: 954
		int var10 = class5.method83(var3 + 1, var5 + 1); // L: 955
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 958
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 959
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 964
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16); // L: 965
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 970
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16); // L: 971
		return var15; // L: 973
	}
}
