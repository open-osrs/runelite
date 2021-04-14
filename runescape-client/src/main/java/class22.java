import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class22 extends class14 {
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -406476963
	)
	int field173;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field173 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field173 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method147(this.field173); // L: 123
	} // L: 124

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-500170582"
	)
	static int method328(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 258
		return class208.NetCache_currentResponse != null && class208.NetCache_currentResponse.key == var2 ? InterfaceParent.NetCache_responseArchiveBuffer.offset * 99 / (InterfaceParent.NetCache_responseArchiveBuffer.array.length - class208.NetCache_currentResponse.padding) + 1 : 0; // L: 259 260
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public static void method320() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 189
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 190
	} // L: 191

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "543264748"
	)
	static final void method330(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 3477
		if (var0.pathLength == 0) { // L: 3478
			var0.field1267 = 0; // L: 3479
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3482
				SequenceDefinition var1 = class225.SequenceDefinition_get(var0.sequence); // L: 3483
				if (var0.field1224 > 0 && var1.field3722 == 0) { // L: 3484
					++var0.field1267; // L: 3485
					return; // L: 3486
				}

				if (var0.field1224 <= 0 && var1.field3723 == 0) { // L: 3488
					++var0.field1267; // L: 3489
					return; // L: 3490
				}
			}

			int var10 = var0.x; // L: 3493
			int var2 = var0.y; // L: 3494
			int var3 = var0.field1258 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3495
			int var4 = var0.field1258 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3496
			if (var10 < var3) { // L: 3497
				if (var2 < var4) { // L: 3498
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 3499
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 3500
				}
			} else if (var10 > var3) { // L: 3502
				if (var2 < var4) { // L: 3503
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 3504
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 3505
				}
			} else if (var2 < var4) { // L: 3507
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 3508
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 3509
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 3510
				int var6 = var0.orientation - var0.rotation & 2047; // L: 3517
				if (var6 > 1024) { // L: 3518
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 3519
				if (var6 >= -256 && var6 <= 256) { // L: 3520
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 3521
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 3522
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 3523
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 3524
				int var8 = 4; // L: 3525
				boolean var9 = true; // L: 3526
				if (var0 instanceof NPC) { // L: 3527
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 3528
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1262 != 0) { // L: 3529
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 3530
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 3531
						var8 = 8;
					}

					if (var0.field1267 > 0 && var0.pathLength > 1) { // L: 3532
						var8 = 8; // L: 3533
						--var0.field1267; // L: 3534
					}
				} else {
					if (var0.pathLength > 1) { // L: 3538
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 3539
						var8 = 8;
					}

					if (var0.field1267 > 0 && var0.pathLength > 1) { // L: 3540
						var8 = 8; // L: 3541
						--var0.field1267; // L: 3542
					}
				}

				if (var5 == 2) { // L: 3545
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3546
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) { // L: 3547
					if (var10 < var3) { // L: 3548
						var0.x += var8; // L: 3549
						if (var0.x > var3) { // L: 3550
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 3552
						var0.x -= var8; // L: 3553
						if (var0.x < var3) { // L: 3554
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 3556
						var0.y += var8; // L: 3557
						if (var0.y > var4) { // L: 3558
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 3560
						var0.y -= var8; // L: 3561
						if (var0.y < var4) { // L: 3562
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 3565
					--var0.pathLength; // L: 3566
					if (var0.field1224 > 0) { // L: 3567
						--var0.field1224;
					}
				}

			} else {
				var0.x = var3; // L: 3511
				var0.y = var4; // L: 3512
				--var0.pathLength; // L: 3513
				if (var0.field1224 > 0) {
					--var0.field1224; // L: 3514
				}

			}
		}
	} // L: 3480 3515 3569

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "40"
	)
	static final void method329(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 4653
		if (var8 < 0) { // L: 4654
			var8 = 0;
		} else if (var8 > 100) { // L: 4655
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 4656
		int var7 = var5 * var9 / 256; // L: 4657
		var8 = 2048 - var3 & 2047; // L: 4660
		var9 = 2048 - var4 & 2047; // L: 4661
		int var10 = 0; // L: 4662
		int var11 = 0; // L: 4663
		int var12 = var7; // L: 4664
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 4665
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 4666
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 4667
			var15 = var14 * var11 - var13 * var7 >> 16; // L: 4668
			var12 = var13 * var11 + var14 * var7 >> 16; // L: 4669
			var11 = var15; // L: 4670
		}

		if (var9 != 0) { // L: 4672
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 4673
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 4674
			var15 = var13 * var12 + var10 * var14 >> 16; // L: 4675
			var12 = var14 * var12 - var10 * var13 >> 16; // L: 4676
			var10 = var15; // L: 4677
		}

		ModeWhere.cameraX = var0 - var10; // L: 4679
		WorldMapRectangle.cameraY = var1 - var11; // L: 4680
		ReflectionCheck.cameraZ = var2 - var12; // L: 4681
		WorldMapArea.cameraPitch = var3; // L: 4682
		class69.cameraYaw = var4; // L: 4683
		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class6.oculusOrbFocalPointX >> 7 != Varcs.localPlayer.x >> 7 || Players.oculusOrbFocalPointY >> 7 != Varcs.localPlayer.y >> 7)) { // L: 4684 4685
			var13 = Varcs.localPlayer.plane; // L: 4686
			var14 = (class6.oculusOrbFocalPointX >> 7) + ItemLayer.baseX; // L: 4687
			var15 = (Players.oculusOrbFocalPointY >> 7) + Tile.baseY; // L: 4688
			class9.method123(var14, var15, var13, true); // L: 4689
		}

	} // L: 4692
}
