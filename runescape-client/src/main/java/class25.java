import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class25 {
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("sceneMinimapSprite")
	static Sprite sceneMinimapSprite;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 487407289
	)
	static int field128;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("leftTitleSprite")
	static Sprite leftTitleSprite;
	@ObfuscatedName("al")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static GameBuild field125;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-842045049"
	)
	static String method248(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "123621684"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 57
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1262042728"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = World.World_worlds[var9]; // L: 185
				int var12 = MouseRecorder.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = MouseRecorder.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = World.World_worlds[var9]; // L: 207
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 208
					World.World_worlds[var7++] = var14; // L: 209
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 213
			World.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "473576557"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4651
			var2 = 1;
		}

		if (var3 < 1) { // L: 4652
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4653
		int var6;
		if (var5 < 0) { // L: 4655
			var6 = Client.field896;
		} else if (var5 >= 100) { // L: 4656
			var6 = Client.field897;
		} else {
			var6 = (Client.field897 - Client.field896) * var5 / 100 + Client.field896; // L: 4657
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4658
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field828) { // L: 4659
			var10 = Client.field828; // L: 4660
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4661
			if (var6 > Client.field731) { // L: 4662
				var6 = Client.field731; // L: 4663
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4664
				var9 = (var2 - var8) / 2; // L: 4665
				if (var4) { // L: 4666
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4667
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4668
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4669
				}

				var0 += var9; // L: 4671
				var2 -= var9 * 2; // L: 4672
			}
		} else if (var7 > Client.field903) { // L: 4675
			var10 = Client.field903; // L: 4676
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4677
			if (var6 < Client.field900) { // L: 4678
				var6 = Client.field900; // L: 4679
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4680
				var9 = (var3 - var8) / 2; // L: 4681
				if (var4) { // L: 4682
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4683
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4684
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4685
				}

				var1 += var9; // L: 4687
				var3 -= var9 * 2; // L: 4688
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4691
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4692
			class39.method593(var2, var3); // L: 4693
		}

		Client.viewportOffsetX = var0; // L: 4695
		Client.viewportOffsetY = var1; // L: 4696
		Client.viewportWidth = var2; // L: 4697
		Client.viewportHeight = var3; // L: 4698
	} // L: 4699

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-67"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 9892
	} // L: 9893

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIILlm;Lho;I)V",
		garbageValue = "-1541467427"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		if (var4 != null) { // L: 10982
			int var6 = Client.camAngleY & 2047; // L: 10983
			int var7 = var3 * var3 + var2 * var2; // L: 10984
			if (var7 <= 6400) { // L: 10985
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 10986
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 10987
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 10988
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 10989
				if (var7 > 2500) {
					var4.method6236(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 10990
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 10991
				}

			}
		}
	} // L: 10992
}
