import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class392 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4276;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4270;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4271;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 309429929
	)
	final int field4269;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -489911481
	)
	public final int field4273;
	@ObfuscatedName("g")
	public final Class field4274;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public final class388 field4275;

	static {
		field4276 = new class392(2, 0, Integer.class, new class389()); // L: 10
		field4270 = new class392(1, 1, Long.class, new class391()); // L: 23
		field4271 = new class392(0, 2, String.class, new class393()); // L: 36
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnd;)V"
	)
	class392(int var1, int var2, Class var3, class388 var4) {
		this.field4269 = var1; // L: 59
		this.field4273 = var2; // L: 60
		this.field4274 = var3; // L: 61
		this.field4275 = var4; // L: 62
	} // L: 63

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4273; // L: 79
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Ljava/lang/Object;",
		garbageValue = "254534065"
	)
	public Object method6858(Buffer var1) {
		return this.field4275.vmethod6883(var1); // L: 83
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)[Log;",
		garbageValue = "-11950"
	)
	public static class392[] method6855() {
		return new class392[]{field4276, field4270, field4271}; // L: 55
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Log;",
		garbageValue = "1132071847"
	)
	public static class392 method6856(Class var0) {
		class392[] var1 = method6855(); // L: 67

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 68
			class392 var3 = var1[var2]; // L: 69
			if (var3.field4274 == var0) {
				return var3; // L: 71
			}
		}

		return null; // L: 75
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5643
		int var4 = var1 >> 7; // L: 5644
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5645
			int var5 = var2; // L: 5646
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5647
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5648
			int var7 = var1 & 127; // L: 5649
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5650
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5651
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5652
		} else {
			return 0;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "106"
	)
	static void method6871(int var0, int var1) {
		int var2 = Login.fontBold12.stringWidth("Choose Option"); // L: 8231

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8232
			var4 = Login.fontBold12.stringWidth(method6873(var3)); // L: 8233
			if (var4 > var2) { // L: 8234
				var2 = var4;
			}
		}

		var2 += 8; // L: 8236
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8237
		var4 = var0 - var2 / 2; // L: 8238
		if (var2 + var4 > GameEngine.canvasWidth) { // L: 8239
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8240
			var4 = 0;
		}

		int var5 = var1; // L: 8241
		if (var3 + var1 > KeyHandler.canvasHeight) { // L: 8242
			var5 = KeyHandler.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8243
			var5 = 0;
		}

		SecureRandomCallable.menuX = var4; // L: 8244
		Frames.menuY = var5; // L: 8245
		ObjectComposition.menuWidth = var2; // L: 8246
		StudioGame.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8247
	} // L: 8248

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2087598232"
	)
	static String method6873(int var0) {
		if (var0 < 0) { // L: 9316
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9317 9318
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2121670407"
	)
	static final void method6872(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10154
		int var7 = var3 - var1; // L: 10155
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10156
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10157
		int var10 = var8; // L: 10158
		if (var8 < var9) { // L: 10159
			var10 = var9;
		}

		if (var10 != 0) { // L: 10160
			int var11 = (var6 << 16) / var10; // L: 10161
			int var12 = (var7 << 16) / var10; // L: 10162
			if (var12 <= var11) { // L: 10163
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10164
			}

			int var13 = var5 * var12 >> 17; // L: 10165
			int var14 = var5 * var12 + 1 >> 17; // L: 10166
			int var15 = var5 * var11 >> 17; // L: 10167
			int var16 = var5 * var11 + 1 >> 17; // L: 10168
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10169
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10170
			int var17 = var0 + var13; // L: 10171
			int var18 = var0 - var14; // L: 10172
			int var19 = var0 + var6 - var14; // L: 10173
			int var20 = var0 + var6 + var13; // L: 10174
			int var21 = var15 + var1; // L: 10175
			int var22 = var1 - var16; // L: 10176
			int var23 = var7 + var1 - var16; // L: 10177
			int var24 = var15 + var7 + var1; // L: 10178
			Rasterizer3D.method4210(var17, var18, var19); // L: 10179
			Rasterizer3D.method4213(var21, var22, var23, var17, var18, var19, var4); // L: 10180
			Rasterizer3D.method4210(var17, var19, var20); // L: 10181
			Rasterizer3D.method4213(var21, var23, var24, var17, var19, var20, var4); // L: 10182
		}
	} // L: 10183
}
