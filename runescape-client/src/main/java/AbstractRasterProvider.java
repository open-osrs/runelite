import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("u")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 256731231
	)
	@Export("width")
	public int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1327457593
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	} // L: 8

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2076883796"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-60"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104011211"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height); // L: 11
	} // L: 12

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = WorldMapArea.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5189
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) { // L: 5190
			var7 = WorldMapArea.scene.getObjectFlags(var0, var1, var2, var5); // L: 5191
			var8 = var7 >> 6 & 3; // L: 5192
			var9 = var7 & 31; // L: 5193
			var10 = var3; // L: 5194
			boolean var11 = 0L != var5 && !class10.method137(var5); // L: 5197
			if (var11) { // L: 5199
				var10 = var4;
			}

			int[] var12 = class19.sceneMinimapSprite.pixels; // L: 5200
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5201
			var14 = WorldMapSection1.Entity_unpackID(var5); // L: 5202
			ObjectComposition var15 = class19.getObjectDefinition(var14); // L: 5203
			if (var15.mapSceneId != -1) { // L: 5204
				IndexedSprite var16 = class18.mapSceneSprites[var15.mapSceneId]; // L: 5205
				if (var16 != null) { // L: 5206
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5207
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5208
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5209
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5213
					if (var8 == 0) { // L: 5214
						var12[var13] = var10; // L: 5215
						var12[var13 + 512] = var10; // L: 5216
						var12[var13 + 1024] = var10; // L: 5217
						var12[var13 + 1536] = var10; // L: 5218
					} else if (var8 == 1) { // L: 5220
						var12[var13] = var10; // L: 5221
						var12[var13 + 1] = var10; // L: 5222
						var12[var13 + 2] = var10; // L: 5223
						var12[var13 + 3] = var10; // L: 5224
					} else if (var8 == 2) { // L: 5226
						var12[var13 + 3] = var10; // L: 5227
						var12[var13 + 512 + 3] = var10; // L: 5228
						var12[var13 + 1024 + 3] = var10; // L: 5229
						var12[var13 + 1536 + 3] = var10; // L: 5230
					} else if (var8 == 3) { // L: 5232
						var12[var13 + 1536] = var10; // L: 5233
						var12[var13 + 1536 + 1] = var10; // L: 5234
						var12[var13 + 1536 + 2] = var10; // L: 5235
						var12[var13 + 1536 + 3] = var10; // L: 5236
					}
				}

				if (var9 == 3) { // L: 5239
					if (var8 == 0) { // L: 5240
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 5241
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 5242
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5243
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5245
					if (var8 == 3) { // L: 5246
						var12[var13] = var10; // L: 5247
						var12[var13 + 512] = var10; // L: 5248
						var12[var13 + 1024] = var10; // L: 5249
						var12[var13 + 1536] = var10; // L: 5250
					} else if (var8 == 0) { // L: 5252
						var12[var13] = var10; // L: 5253
						var12[var13 + 1] = var10; // L: 5254
						var12[var13 + 2] = var10; // L: 5255
						var12[var13 + 3] = var10; // L: 5256
					} else if (var8 == 1) { // L: 5258
						var12[var13 + 3] = var10; // L: 5259
						var12[var13 + 512 + 3] = var10; // L: 5260
						var12[var13 + 1024 + 3] = var10; // L: 5261
						var12[var13 + 1536 + 3] = var10; // L: 5262
					} else if (var8 == 2) { // L: 5264
						var12[var13 + 1536] = var10; // L: 5265
						var12[var13 + 1536 + 1] = var10; // L: 5266
						var12[var13 + 1536 + 2] = var10; // L: 5267
						var12[var13 + 1536 + 3] = var10; // L: 5268
					}
				}
			}
		}

		var5 = WorldMapArea.scene.getGameObjectTag(var0, var1, var2); // L: 5273
		if (var5 != 0L) { // L: 5274
			var7 = WorldMapArea.scene.getObjectFlags(var0, var1, var2, var5); // L: 5275
			var8 = var7 >> 6 & 3; // L: 5276
			var9 = var7 & 31; // L: 5277
			var10 = WorldMapSection1.Entity_unpackID(var5); // L: 5278
			ObjectComposition var19 = class19.getObjectDefinition(var10); // L: 5279
			if (var19.mapSceneId != -1) { // L: 5280
				IndexedSprite var26 = class18.mapSceneSprites[var19.mapSceneId]; // L: 5281
				if (var26 != null) { // L: 5282
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 5283
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2; // L: 5284
					var26.drawAt(var1 * 4 + var13 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48); // L: 5285
				}
			} else if (var9 == 9) { // L: 5288
				int var20 = 15658734; // L: 5289
				boolean var27 = 0L != var5 && !class10.method137(var5); // L: 5292
				if (var27) { // L: 5294
					var20 = 15597568;
				}

				int[] var21 = class19.sceneMinimapSprite.pixels; // L: 5295
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5296
				if (var8 != 0 && var8 != 2) { // L: 5297
					var21[var22] = var20; // L: 5304
					var21[var22 + 1 + 512] = var20; // L: 5305
					var21[var22 + 1024 + 2] = var20; // L: 5306
					var21[var22 + 1536 + 3] = var20; // L: 5307
				} else {
					var21[var22 + 1536] = var20; // L: 5298
					var21[var22 + 1 + 1024] = var20; // L: 5299
					var21[var22 + 512 + 2] = var20; // L: 5300
					var21[var22 + 3] = var20; // L: 5301
				}
			}
		}

		var5 = WorldMapArea.scene.getFloorDecorationTag(var0, var1, var2); // L: 5311
		if (var5 != 0L) { // L: 5312
			var7 = WorldMapSection1.Entity_unpackID(var5); // L: 5313
			ObjectComposition var23 = class19.getObjectDefinition(var7); // L: 5314
			if (var23.mapSceneId != -1) { // L: 5315
				IndexedSprite var24 = class18.mapSceneSprites[var23.mapSceneId]; // L: 5316
				if (var24 != null) { // L: 5317
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5318
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5319
					var24.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48); // L: 5320
				}
			}
		}

	} // L: 5324
}
