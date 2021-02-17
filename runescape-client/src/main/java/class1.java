import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
final class class1 implements class0 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkj;I)V",
		garbageValue = "781194334"
	)
	public void vmethod49(Object var1, Buffer var2) {
		this.method6((Integer)var1, var2); // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Ljava/lang/Object;",
		garbageValue = "12"
	)
	public Object vmethod48(Buffer var1) {
		return var1.readInt(); // L: 16
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lkj;I)V",
		garbageValue = "-1179776664"
	)
	void method6(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lio;",
		garbageValue = "0"
	)
	static GameBuild[] method11() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP, GameBuild.RC}; // L: 13
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "3"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = ArchiveLoader.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5489
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5490
			var7 = ArchiveLoader.scene.getObjectFlags(var0, var1, var2, var5); // L: 5491
			var8 = var7 >> 6 & 3; // L: 5492
			var9 = var7 & 31; // L: 5493
			var10 = var3; // L: 5494
			if (FriendSystem.method1943(var5)) { // L: 5495
				var10 = var4;
			}

			int[] var11 = class25.sceneMinimapSprite.pixels; // L: 5496
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5497
			var13 = Occluder.Entity_unpackID(var5); // L: 5498
			ObjectComposition var14 = WorldMapDecoration.getObjectDefinition(var13); // L: 5499
			if (var14.mapSceneId != -1) { // L: 5500
				IndexedSprite var15 = WorldMapRegion.mapSceneSprites[var14.mapSceneId]; // L: 5501
				if (var15 != null) { // L: 5502
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5503
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5504
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5505
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5509
					if (var8 == 0) { // L: 5510
						var11[var12] = var10; // L: 5511
						var11[var12 + 512] = var10; // L: 5512
						var11[var12 + 1024] = var10; // L: 5513
						var11[var12 + 1536] = var10; // L: 5514
					} else if (var8 == 1) { // L: 5516
						var11[var12] = var10; // L: 5517
						var11[var12 + 1] = var10; // L: 5518
						var11[var12 + 2] = var10; // L: 5519
						var11[var12 + 3] = var10; // L: 5520
					} else if (var8 == 2) { // L: 5522
						var11[var12 + 3] = var10; // L: 5523
						var11[var12 + 512 + 3] = var10; // L: 5524
						var11[var12 + 1024 + 3] = var10; // L: 5525
						var11[var12 + 1536 + 3] = var10; // L: 5526
					} else if (var8 == 3) { // L: 5528
						var11[var12 + 1536] = var10; // L: 5529
						var11[var12 + 1536 + 1] = var10; // L: 5530
						var11[var12 + 1536 + 2] = var10; // L: 5531
						var11[var12 + 1536 + 3] = var10; // L: 5532
					}
				}

				if (var9 == 3) { // L: 5535
					if (var8 == 0) { // L: 5536
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5537
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5538
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5539
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5541
					if (var8 == 3) { // L: 5542
						var11[var12] = var10; // L: 5543
						var11[var12 + 512] = var10; // L: 5544
						var11[var12 + 1024] = var10; // L: 5545
						var11[var12 + 1536] = var10; // L: 5546
					} else if (var8 == 0) { // L: 5548
						var11[var12] = var10; // L: 5549
						var11[var12 + 1] = var10; // L: 5550
						var11[var12 + 2] = var10; // L: 5551
						var11[var12 + 3] = var10; // L: 5552
					} else if (var8 == 1) { // L: 5554
						var11[var12 + 3] = var10; // L: 5555
						var11[var12 + 512 + 3] = var10; // L: 5556
						var11[var12 + 1024 + 3] = var10; // L: 5557
						var11[var12 + 1536 + 3] = var10; // L: 5558
					} else if (var8 == 2) { // L: 5560
						var11[var12 + 1536] = var10; // L: 5561
						var11[var12 + 1536 + 1] = var10; // L: 5562
						var11[var12 + 1536 + 2] = var10; // L: 5563
						var11[var12 + 1536 + 3] = var10; // L: 5564
					}
				}
			}
		}

		var5 = ArchiveLoader.scene.getGameObjectTag(var0, var1, var2); // L: 5569
		if (0L != var5) { // L: 5570
			var7 = ArchiveLoader.scene.getObjectFlags(var0, var1, var2, var5); // L: 5571
			var8 = var7 >> 6 & 3; // L: 5572
			var9 = var7 & 31; // L: 5573
			var10 = Occluder.Entity_unpackID(var5); // L: 5574
			ObjectComposition var24 = WorldMapDecoration.getObjectDefinition(var10); // L: 5575
			int var19;
			if (var24.mapSceneId != -1) { // L: 5576
				IndexedSprite var20 = WorldMapRegion.mapSceneSprites[var24.mapSceneId]; // L: 5577
				if (var20 != null) { // L: 5578
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5579
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5580
					var20.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 5581
				}
			} else if (var9 == 9) { // L: 5584
				var12 = 15658734; // L: 5585
				if (FriendSystem.method1943(var5)) { // L: 5586
					var12 = 15597568;
				}

				int[] var18 = class25.sceneMinimapSprite.pixels; // L: 5587
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5588
				if (var8 != 0 && var8 != 2) { // L: 5589
					var18[var19] = var12; // L: 5596
					var18[var19 + 1 + 512] = var12; // L: 5597
					var18[var19 + 1024 + 2] = var12; // L: 5598
					var18[var19 + 1536 + 3] = var12; // L: 5599
				} else {
					var18[var19 + 1536] = var12; // L: 5590
					var18[var19 + 1 + 1024] = var12; // L: 5591
					var18[var19 + 512 + 2] = var12; // L: 5592
					var18[var19 + 3] = var12; // L: 5593
				}
			}
		}

		var5 = ArchiveLoader.scene.getFloorDecorationTag(var0, var1, var2); // L: 5603
		if (0L != var5) { // L: 5604
			var7 = Occluder.Entity_unpackID(var5); // L: 5605
			ObjectComposition var21 = WorldMapDecoration.getObjectDefinition(var7); // L: 5606
			if (var21.mapSceneId != -1) { // L: 5607
				IndexedSprite var22 = WorldMapRegion.mapSceneSprites[var21.mapSceneId]; // L: 5608
				if (var22 != null) { // L: 5609
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5610
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5611
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 5612
				}
			}
		}

	} // L: 5616
}
