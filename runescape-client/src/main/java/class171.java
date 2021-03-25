import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class171 implements class170
{
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -853566565
	)
	@Export("js5Port")
	static int js5Port;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;IZI)Lel;",
		garbageValue = "-2064266261"
	)
	@Export("loadFrames")
	public static Frames loadFrames(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lcv;II)V",
		garbageValue = "478475301"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field999 >= Client.cycle) { // L: 3504
			GrandExchangeEvent.method147(var0);
		} else {
			int var3;
			int var4;
			int var5;
			int var7;
			int var11;
			if (var0.field1000 >= Client.cycle) { // L: 3505
				if (var0.field1000 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > InterfaceParent.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3506
					var11 = var0.field1000 - var0.field999; // L: 3507
					var3 = Client.cycle - var0.field999; // L: 3508
					var4 = var0.field1007 * 64 + var0.field992 * 128; // L: 3509
					var5 = var0.field1007 * 64 + var0.field952 * 128; // L: 3510
					int var6 = var0.field1007 * 64 + var0.field996 * 128; // L: 3511
					var7 = var0.field1007 * 64 + var0.field998 * 128; // L: 3512
					var0.x = (var3 * var6 + var4 * (var11 - var3)) / var11; // L: 3513
					var0.y = (var3 * var7 + var5 * (var11 - var3)) / var11; // L: 3514
				}

				var0.field989 = 0; // L: 3516
				var0.orientation = var0.field1001; // L: 3517
				var0.rotation = var0.orientation; // L: 3518
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3521
				if (var0.pathLength == 0) { // L: 3522
					var0.field989 = 0; // L: 3523
				} else {
					label280: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3526
							SequenceDefinition var2 = InterfaceParent.SequenceDefinition_get(var0.sequence); // L: 3527
							if (var0.field1012 > 0 && var2.field3564 == 0) { // L: 3528
								++var0.field989; // L: 3529
								break label280; // L: 3530
							}

							if (var0.field1012 <= 0 && var2.field3565 == 0) { // L: 3532
								++var0.field989; // L: 3533
								break label280; // L: 3534
							}
						}

						var11 = var0.x; // L: 3537
						var3 = var0.y; // L: 3538
						var4 = var0.field1007 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3539
						var5 = var0.field1007 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3540
						if (var11 < var4) { // L: 3541
							if (var3 < var5) { // L: 3542
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3543
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3544
							}
						} else if (var11 > var4) { // L: 3546
							if (var3 < var5) { // L: 3547
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3548
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3549
							}
						} else if (var3 < var5) { // L: 3551
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3552
							var0.orientation = 0;
						}

						byte var12 = var0.pathTraversed[var0.pathLength - 1]; // L: 3553
						if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3554
							var7 = var0.orientation - var0.rotation & 2047; // L: 3561
							if (var7 > 1024) { // L: 3562
								var7 -= 2048;
							}

							int var8 = var0.walkBackSequence; // L: 3563
							if (var7 >= -256 && var7 <= 256) { // L: 3564
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3565
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3566
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3567
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3568
							int var9 = 4; // L: 3569
							boolean var10 = true; // L: 3570
							if (var0 instanceof NPC) { // L: 3571
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 3572
								if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1006 != 0) { // L: 3573
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 3574
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 3575
									var9 = 8;
								}

								if (var0.field989 > 0 && var0.pathLength > 1) { // L: 3576
									var9 = 8; // L: 3577
									--var0.field989; // L: 3578
								}
							} else {
								if (var0.pathLength > 1) { // L: 3582
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 3583
									var9 = 8;
								}

								if (var0.field989 > 0 && var0.pathLength > 1) { // L: 3584
									var9 = 8; // L: 3585
									--var0.field989; // L: 3586
								}
							}

							if (var12 == 2) { // L: 3589
								var9 <<= 1;
							}

							if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3590
								var0.movementSequence = var0.runSequence;
							}

							if (var4 != var11 || var5 != var3) { // L: 3591
								if (var11 < var4) { // L: 3592
									var0.x += var9; // L: 3593
									if (var0.x > var4) { // L: 3594
										var0.x = var4;
									}
								} else if (var11 > var4) { // L: 3596
									var0.x -= var9; // L: 3597
									if (var0.x < var4) { // L: 3598
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 3600
									var0.y += var9; // L: 3601
									if (var0.y > var5) { // L: 3602
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 3604
									var0.y -= var9; // L: 3605
									if (var0.y < var5) { // L: 3606
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 3609
								--var0.pathLength; // L: 3610
								if (var0.field1012 > 0) {
									--var0.field1012; // L: 3611
								}
							}
						} else {
							var0.x = var4; // L: 3555
							var0.y = var5; // L: 3556
							--var0.pathLength; // L: 3557
							if (var0.field1012 > 0) { // L: 3558
								--var0.field1012;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3614
			var0.sequence = -1; // L: 3615
			var0.spotAnimation = -1; // L: 3616
			var0.field999 = 0; // L: 3617
			var0.field1000 = 0; // L: 3618
			var0.x = var0.pathX[0] * 128 + var0.field1007 * 64; // L: 3619
			var0.y = var0.field1007 * 64 + var0.pathY[0] * 128; // L: 3620
			var0.method1848(); // L: 3621
		}

		if (UserComparator9.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3623 3624
			var0.sequence = -1; // L: 3625
			var0.spotAnimation = -1; // L: 3626
			var0.field999 = 0; // L: 3627
			var0.field1000 = 0; // L: 3628
			var0.x = var0.field1007 * 64 + var0.pathX[0] * 128; // L: 3629
			var0.y = var0.pathY[0] * 128 + var0.field1007 * 64; // L: 3630
			var0.method1848(); // L: 3631
		}

		GameObject.method3453(var0); // L: 3634
		Players.method2286(var0); // L: 3635
	} // L: 3636

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-654550315"
	)
	static final int method3639() {
		if (WorldMapSectionType.clientPreferences.roofsHidden) { // L: 4411
			return class90.Client_plane;
		} else {
			int var0 = WorldMapRegion.getTileHeight(SecureRandomFuture.cameraX, ObjectSound.cameraZ, class90.Client_plane); // L: 4412
			return var0 - ArchiveLoader.cameraY < 800 && (Tiles.Tiles_renderFlags[class90.Client_plane][SecureRandomFuture.cameraX >> 7][ObjectSound.cameraZ >> 7] & 4) != 0 ? class90.Client_plane : 3; // L: 4413 4414
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11112
		WorldMapSectionType.clientPreferences.soundEffectsVolume = var0; // L: 11113
		class23.savePreferences(); // L: 11114
	} // L: 11115
}