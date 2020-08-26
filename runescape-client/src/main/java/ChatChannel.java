import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1406179309
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1207472641
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 83
	} // L: 86

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;",
		garbageValue = "-1549087177"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 89

		for (int var6 = this.count; var6 > 0; --var6) { // L: 90
			if (var6 != 100) { // L: 91
				this.messages[var6] = this.messages[var6 - 1]; // L: 92
			}
		}

		if (var5 == null) { // L: 94
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 96
			var5.removeDual(); // L: 97
			var5.set(var1, var2, var4, var3); // L: 98
		}

		this.messages[0] = var5; // L: 100
		if (this.count < 100) { // L: 101
			++this.count;
		}

		return var5; // L: 102
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lbk;",
		garbageValue = "1867589012"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 106 107
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1452572127"
	)
	@Export("size")
	int size() {
		return this.count; // L: 111
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Llp;",
		garbageValue = "-1593670187"
	)
	@Export("getItemSprite")
	public static final Sprite getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 353
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 354
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42); // L: 355
		Sprite var8;
		if (!var5) { // L: 357
			var8 = (Sprite)ItemDefinition.ItemDefinition_cachedSprites.get(var6); // L: 358
			if (var8 != null) { // L: 359
				return var8;
			}
		}

		ItemDefinition var9 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var0); // L: 361
		if (var1 > 1 && var9.countobj != null) { // L: 362
			int var10 = -1; // L: 363

			for (int var11 = 0; var11 < 10; ++var11) { // L: 364
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 365
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 367
				var9 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 369
		if (var19 == null) { // L: 370
			return null;
		} else {
			Sprite var20 = null; // L: 371
			if (var9.noteTemplate != -1) { // L: 372
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 373
				if (var20 == null) { // L: 374
					return null;
				}
			} else if (var9.notedId != -1) { // L: 376
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 377
				if (var20 == null) { // L: 378
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 380
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 381
				if (var20 == null) { // L: 382
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 384
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 385
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 386
			int[] var15 = new int[4]; // L: 387
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 388
			var8 = new Sprite(36, 32); // L: 389
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 390
			Rasterizer2D.Rasterizer2D_clear(); // L: 391
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 392
			Rasterizer3D.method3181(16, 16); // L: 393
			Rasterizer3D.field1788 = false; // L: 394
			if (var9.placeholderTemplate != -1) { // L: 395
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 396
			if (var5) { // L: 397
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 398
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 399
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 400
			var19.calculateBoundsCylinder(); // L: 401
			var19.method3003(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 402
			if (var9.notedId != -1) { // L: 403
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 404
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 405
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 406
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 407
			if (var9.noteTemplate != -1) { // L: 408
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 409
				ScriptEvent.ItemDefinition_fontPlain11.draw(class194.method3712(var1), 0, 9, 16776960, 1); // L: 410
			}

			if (!var5) { // L: 412
				ItemDefinition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 413
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 414
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 415
			Rasterizer3D.field1788 = true; // L: 416
			return var8; // L: 417
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2146534087"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ScriptEvent.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5182
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5183
			var7 = ScriptEvent.scene.getObjectFlags(var0, var1, var2, var5); // L: 5184
			var8 = var7 >> 6 & 3; // L: 5185
			var9 = var7 & 31; // L: 5186
			var10 = var3; // L: 5187
			if (GrandExchangeOfferTotalQuantityComparator.method173(var5)) { // L: 5188
				var10 = var4;
			}

			int[] var11 = ApproximateRouteStrategy.sceneMinimapSprite.pixels; // L: 5189
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5190
			var13 = UserComparator9.Entity_unpackID(var5); // L: 5191
			ObjectDefinition var14 = MidiPcmStream.getObjectDefinition(var13); // L: 5192
			if (var14.mapSceneId != -1) { // L: 5193
				IndexedSprite var15 = ReflectionCheck.mapSceneSprites[var14.mapSceneId]; // L: 5194
				if (var15 != null) { // L: 5195
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5196
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5197
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5198
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5202
					if (var8 == 0) { // L: 5203
						var11[var12] = var10; // L: 5204
						var11[var12 + 512] = var10; // L: 5205
						var11[var12 + 1024] = var10; // L: 5206
						var11[var12 + 1536] = var10; // L: 5207
					} else if (var8 == 1) { // L: 5209
						var11[var12] = var10; // L: 5210
						var11[var12 + 1] = var10; // L: 5211
						var11[var12 + 2] = var10; // L: 5212
						var11[var12 + 3] = var10; // L: 5213
					} else if (var8 == 2) { // L: 5215
						var11[var12 + 3] = var10; // L: 5216
						var11[var12 + 512 + 3] = var10; // L: 5217
						var11[var12 + 1024 + 3] = var10; // L: 5218
						var11[var12 + 1536 + 3] = var10; // L: 5219
					} else if (var8 == 3) { // L: 5221
						var11[var12 + 1536] = var10; // L: 5222
						var11[var12 + 1536 + 1] = var10; // L: 5223
						var11[var12 + 1536 + 2] = var10; // L: 5224
						var11[var12 + 1536 + 3] = var10; // L: 5225
					}
				}

				if (var9 == 3) { // L: 5228
					if (var8 == 0) { // L: 5229
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5230
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5231
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5232
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5234
					if (var8 == 3) { // L: 5235
						var11[var12] = var10; // L: 5236
						var11[var12 + 512] = var10; // L: 5237
						var11[var12 + 1024] = var10; // L: 5238
						var11[var12 + 1536] = var10; // L: 5239
					} else if (var8 == 0) { // L: 5241
						var11[var12] = var10; // L: 5242
						var11[var12 + 1] = var10; // L: 5243
						var11[var12 + 2] = var10; // L: 5244
						var11[var12 + 3] = var10; // L: 5245
					} else if (var8 == 1) { // L: 5247
						var11[var12 + 3] = var10; // L: 5248
						var11[var12 + 512 + 3] = var10; // L: 5249
						var11[var12 + 1024 + 3] = var10; // L: 5250
						var11[var12 + 1536 + 3] = var10; // L: 5251
					} else if (var8 == 2) { // L: 5253
						var11[var12 + 1536] = var10; // L: 5254
						var11[var12 + 1536 + 1] = var10; // L: 5255
						var11[var12 + 1536 + 2] = var10; // L: 5256
						var11[var12 + 1536 + 3] = var10; // L: 5257
					}
				}
			}
		}

		var5 = ScriptEvent.scene.getGameObjectTag(var0, var1, var2); // L: 5262
		if (0L != var5) { // L: 5263
			var7 = ScriptEvent.scene.getObjectFlags(var0, var1, var2, var5); // L: 5264
			var8 = var7 >> 6 & 3; // L: 5265
			var9 = var7 & 31; // L: 5266
			var10 = UserComparator9.Entity_unpackID(var5); // L: 5267
			ObjectDefinition var24 = MidiPcmStream.getObjectDefinition(var10); // L: 5268
			int var19;
			if (var24.mapSceneId != -1) { // L: 5269
				IndexedSprite var20 = ReflectionCheck.mapSceneSprites[var24.mapSceneId]; // L: 5270
				if (var20 != null) { // L: 5271
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5272
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5273
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 5274
				}
			} else if (var9 == 9) { // L: 5277
				var12 = 15658734; // L: 5278
				if (GrandExchangeOfferTotalQuantityComparator.method173(var5)) { // L: 5279
					var12 = 15597568;
				}

				int[] var18 = ApproximateRouteStrategy.sceneMinimapSprite.pixels; // L: 5280
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5281
				if (var8 != 0 && var8 != 2) { // L: 5282
					var18[var19] = var12; // L: 5289
					var18[var19 + 1 + 512] = var12; // L: 5290
					var18[var19 + 1024 + 2] = var12; // L: 5291
					var18[var19 + 1536 + 3] = var12; // L: 5292
				} else {
					var18[var19 + 1536] = var12; // L: 5283
					var18[var19 + 1 + 1024] = var12; // L: 5284
					var18[var19 + 512 + 2] = var12; // L: 5285
					var18[var19 + 3] = var12; // L: 5286
				}
			}
		}

		var5 = ScriptEvent.scene.getFloorDecorationTag(var0, var1, var2); // L: 5296
		if (0L != var5) { // L: 5297
			var7 = UserComparator9.Entity_unpackID(var5); // L: 5298
			ObjectDefinition var21 = MidiPcmStream.getObjectDefinition(var7); // L: 5299
			if (var21.mapSceneId != -1) { // L: 5300
				IndexedSprite var22 = ReflectionCheck.mapSceneSprites[var21.mapSceneId]; // L: 5301
				if (var22 != null) { // L: 5302
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5303
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5304
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 5305
				}
			}
		}

	} // L: 5309
}
