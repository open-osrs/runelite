import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class33 {
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = -395666535
	)
	static int field243;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1774695568"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4512
			if (class242.loadInterface(var0)) { // L: 4513
				Widget[] var1 = MouseRecorder.Widget_interfaceComponents[var0]; // L: 4514

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4515
					Widget var3 = var1[var2]; // L: 4516
					if (var3.onLoad != null) { // L: 4517
						ScriptEvent var4 = new ScriptEvent(); // L: 4518
						var4.widget = var3; // L: 4519
						var4.args = var3.onLoad; // L: 4520
						ScriptFrame.runScript(var4, 5000000, 0); // L: 4521
					}
				}

			}
		}
	} // L: 4524

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1059461480"
	)
	static final void method656() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5495 5496 5503
			if (var0.plane == class20.Client_plane && !var0.isFinished) { // L: 5497
				if (Client.cycle >= var0.cycleStart) { // L: 5498
					var0.advance(Client.field538); // L: 5499
					if (var0.isFinished) {
						var0.remove(); // L: 5500
					} else {
						class7.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false); // L: 5501
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5505

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "79"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class7.scene.getBoundaryObjectTag(var0, var1, var2); // L: 6341
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 6342
			var7 = class7.scene.getObjectFlags(var0, var1, var2, var5); // L: 6343
			var8 = var7 >> 6 & 3; // L: 6344
			var9 = var7 & 31; // L: 6345
			var10 = var3; // L: 6346
			if (class116.method2671(var5)) { // L: 6347
				var10 = var4;
			}

			int[] var11 = class29.sceneMinimapSprite.pixels; // L: 6348
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6349
			var13 = PacketWriter.Entity_unpackID(var5); // L: 6350
			ObjectComposition var14 = class148.getObjectDefinition(var13); // L: 6351
			if (var14.mapSceneId != -1) { // L: 6352
				IndexedSprite var15 = AbstractWorldMapData.mapSceneSprites[var14.mapSceneId]; // L: 6353
				if (var15 != null) { // L: 6354
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6355
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6356
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 6357
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6361
					if (var8 == 0) { // L: 6362
						var11[var12] = var10; // L: 6363
						var11[var12 + 512] = var10; // L: 6364
						var11[var12 + 1024] = var10; // L: 6365
						var11[var12 + 1536] = var10; // L: 6366
					} else if (var8 == 1) { // L: 6368
						var11[var12] = var10; // L: 6369
						var11[var12 + 1] = var10; // L: 6370
						var11[var12 + 2] = var10; // L: 6371
						var11[var12 + 3] = var10; // L: 6372
					} else if (var8 == 2) { // L: 6374
						var11[var12 + 3] = var10; // L: 6375
						var11[var12 + 512 + 3] = var10; // L: 6376
						var11[var12 + 1024 + 3] = var10; // L: 6377
						var11[var12 + 1536 + 3] = var10; // L: 6378
					} else if (var8 == 3) { // L: 6380
						var11[var12 + 1536] = var10; // L: 6381
						var11[var12 + 1536 + 1] = var10; // L: 6382
						var11[var12 + 1536 + 2] = var10; // L: 6383
						var11[var12 + 1536 + 3] = var10; // L: 6384
					}
				}

				if (var9 == 3) { // L: 6387
					if (var8 == 0) { // L: 6388
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6389
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6390
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6391
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6393
					if (var8 == 3) { // L: 6394
						var11[var12] = var10; // L: 6395
						var11[var12 + 512] = var10; // L: 6396
						var11[var12 + 1024] = var10; // L: 6397
						var11[var12 + 1536] = var10; // L: 6398
					} else if (var8 == 0) { // L: 6400
						var11[var12] = var10; // L: 6401
						var11[var12 + 1] = var10; // L: 6402
						var11[var12 + 2] = var10; // L: 6403
						var11[var12 + 3] = var10; // L: 6404
					} else if (var8 == 1) { // L: 6406
						var11[var12 + 3] = var10; // L: 6407
						var11[var12 + 512 + 3] = var10; // L: 6408
						var11[var12 + 1024 + 3] = var10; // L: 6409
						var11[var12 + 1536 + 3] = var10; // L: 6410
					} else if (var8 == 2) { // L: 6412
						var11[var12 + 1536] = var10; // L: 6413
						var11[var12 + 1536 + 1] = var10; // L: 6414
						var11[var12 + 1536 + 2] = var10; // L: 6415
						var11[var12 + 1536 + 3] = var10; // L: 6416
					}
				}
			}
		}

		var5 = class7.scene.getGameObjectTag(var0, var1, var2); // L: 6421
		if (var5 != 0L) { // L: 6422
			var7 = class7.scene.getObjectFlags(var0, var1, var2, var5); // L: 6423
			var8 = var7 >> 6 & 3; // L: 6424
			var9 = var7 & 31; // L: 6425
			var10 = PacketWriter.Entity_unpackID(var5); // L: 6426
			ObjectComposition var24 = class148.getObjectDefinition(var10); // L: 6427
			int var19;
			if (var24.mapSceneId != -1) { // L: 6428
				IndexedSprite var20 = AbstractWorldMapData.mapSceneSprites[var24.mapSceneId]; // L: 6429
				if (var20 != null) { // L: 6430
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6431
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6432
					var20.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 6433
				}
			} else if (var9 == 9) { // L: 6436
				var12 = 15658734; // L: 6437
				if (class116.method2671(var5)) { // L: 6438
					var12 = 15597568;
				}

				int[] var18 = class29.sceneMinimapSprite.pixels; // L: 6439
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6440
				if (var8 != 0 && var8 != 2) { // L: 6441
					var18[var19] = var12; // L: 6448
					var18[var19 + 1 + 512] = var12; // L: 6449
					var18[var19 + 1024 + 2] = var12; // L: 6450
					var18[var19 + 1536 + 3] = var12; // L: 6451
				} else {
					var18[var19 + 1536] = var12; // L: 6442
					var18[var19 + 1 + 1024] = var12; // L: 6443
					var18[var19 + 512 + 2] = var12; // L: 6444
					var18[var19 + 3] = var12; // L: 6445
				}
			}
		}

		var5 = class7.scene.getFloorDecorationTag(var0, var1, var2); // L: 6455
		if (0L != var5) { // L: 6456
			var7 = PacketWriter.Entity_unpackID(var5); // L: 6457
			ObjectComposition var21 = class148.getObjectDefinition(var7); // L: 6458
			if (var21.mapSceneId != -1) { // L: 6459
				IndexedSprite var22 = AbstractWorldMapData.mapSceneSprites[var21.mapSceneId]; // L: 6460
				if (var22 != null) { // L: 6461
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6462
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6463
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6464
				}
			}
		}

	} // L: 6468
}
