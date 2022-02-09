import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -485692107
	)
	static int field2761;
	@ObfuscatedName("hw")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("c")
	@Export("text")
	String text;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -941943719
	)
	@Export("width")
	int width;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 238298517
	)
	@Export("height")
	int height;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhh;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Ljava/lang/String;I)V",
		garbageValue = "-1399246639"
	)
	static void method4762(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1457
		Client.archiveLoaders.add(var2); // L: 1458
		Client.field698 += var2.groupCount; // L: 1459
	} // L: 1460

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1943247102"
	)
	static final void method4763(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10219
		int var7 = var3 - var1; // L: 10220
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10221
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10222
		int var10 = var8; // L: 10223
		if (var8 < var9) { // L: 10224
			var10 = var9;
		}

		if (var10 != 0) { // L: 10225
			int var11 = (var6 << 16) / var10; // L: 10226
			int var12 = (var7 << 16) / var10; // L: 10227
			if (var12 <= var11) { // L: 10228
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10229
			}

			int var13 = var5 * var12 >> 17; // L: 10230
			int var14 = var5 * var12 + 1 >> 17; // L: 10231
			int var15 = var5 * var11 >> 17; // L: 10232
			int var16 = var5 * var11 + 1 >> 17; // L: 10233
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10234
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10235
			int var17 = var0 + var13; // L: 10236
			int var18 = var0 - var14; // L: 10237
			int var19 = var0 + var6 - var14; // L: 10238
			int var20 = var0 + var6 + var13; // L: 10239
			int var21 = var15 + var1; // L: 10240
			int var22 = var1 - var16; // L: 10241
			int var23 = var7 + var1 - var16; // L: 10242
			int var24 = var15 + var7 + var1; // L: 10243
			Rasterizer3D.method3792(var17, var18, var19); // L: 10244
			Rasterizer3D.method3797(var21, var22, var23, var17, var18, var19, var4); // L: 10245
			Rasterizer3D.method3792(var17, var19, var20); // L: 10246
			Rasterizer3D.method3797(var21, var23, var24, var17, var19, var20, var4); // L: 10247
		}
	} // L: 10248
}
