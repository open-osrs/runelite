import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -490207969
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static AbstractSocket field1378;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I",
		garbageValue = "-554483430"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lco;II)V",
		garbageValue = "-1008327534"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var11;
		if (var0.field1179 >= Client.cycle) { // L: 3573
			ModeWhere.method6145(var0);
		} else if (var0.field1180 >= Client.cycle) { // L: 3574
			class16.method215(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 3576
			if (var0.pathLength == 0) { // L: 3577
				var0.field1197 = 0; // L: 3578
			} else {
				label409: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3581
						SequenceDefinition var2 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 3582
						if (var0.field1134 > 0 && var2.field2162 == 0) { // L: 3583
							++var0.field1197; // L: 3584
							break label409; // L: 3585
						}

						if (var0.field1134 <= 0 && var2.field2171 == 0) { // L: 3587
							++var0.field1197; // L: 3588
							break label409; // L: 3589
						}
					}

					var11 = var0.x; // L: 3592
					var3 = var0.y; // L: 3593
					var4 = var0.field1145 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3594
					int var5 = var0.field1145 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3595
					if (var11 < var4) { // L: 3596
						if (var3 < var5) { // L: 3597
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 3598
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 3599
						}
					} else if (var11 > var4) { // L: 3601
						if (var3 < var5) { // L: 3602
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 3603
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 3604
						}
					} else if (var3 < var5) { // L: 3606
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 3607
						var0.orientation = 0;
					}

					class193 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3608
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3609
						int var7 = var0.orientation - var0.rotation & 2047; // L: 3616
						if (var7 > 1024) { // L: 3617
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 3618
						if (var7 >= -256 && var7 <= 256) { // L: 3619
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 3620
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 3621
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 3622
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 3623
						int var9 = 4; // L: 3624
						boolean var10 = true; // L: 3625
						if (var0 instanceof NPC) { // L: 3626
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 3627
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1192 != 0) { // L: 3628
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 3629
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 3630
								var9 = 8;
							}

							if (var0.field1197 > 0 && var0.pathLength > 1) { // L: 3631
								var9 = 8; // L: 3632
								--var0.field1197; // L: 3633
							}
						} else {
							if (var0.pathLength > 1) { // L: 3637
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 3638
								var9 = 8;
							}

							if (var0.field1197 > 0 && var0.pathLength > 1) { // L: 3639
								var9 = 8; // L: 3640
								--var0.field1197; // L: 3641
							}
						}

						if (var6 == class193.field2191) { // L: 3644
							var9 <<= 1;
						} else if (var6 == class193.field2195) { // L: 3645
							var9 >>= 1;
						}

						if (var9 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 3646
							var0.movementSequence = var0.runSequence;
						}

						if (var4 != var11 || var5 != var3) { // L: 3647
							if (var11 < var4) { // L: 3648
								var0.x += var9; // L: 3649
								if (var0.x > var4) { // L: 3650
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 3652
								var0.x -= var9; // L: 3653
								if (var0.x < var4) { // L: 3654
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 3656
								var0.y += var9; // L: 3657
								if (var0.y > var5) { // L: 3658
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 3660
								var0.y -= var9; // L: 3661
								if (var0.y < var5) { // L: 3662
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 3665
							--var0.pathLength; // L: 3666
							if (var0.field1134 > 0) { // L: 3667
								--var0.field1134;
							}
						}
					} else {
						var0.x = var4; // L: 3610
						var0.y = var5; // L: 3611
						--var0.pathLength; // L: 3612
						if (var0.field1134 > 0) { // L: 3613
							--var0.field1134;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3670
			var0.sequence = -1; // L: 3671
			var0.spotAnimation = -1; // L: 3672
			var0.field1179 = 0; // L: 3673
			var0.field1180 = 0; // L: 3674
			var0.x = var0.pathX[0] * 128 + var0.field1145 * 64; // L: 3675
			var0.y = var0.field1145 * 64 + var0.pathY[0] * 128; // L: 3676
			var0.method2205(); // L: 3677
		}

		if (class19.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3679 3680
			var0.sequence = -1; // L: 3681
			var0.spotAnimation = -1; // L: 3682
			var0.field1179 = 0; // L: 3683
			var0.field1180 = 0; // L: 3684
			var0.x = var0.pathX[0] * 128 + var0.field1145 * 64; // L: 3685
			var0.y = var0.pathY[0] * 128 + var0.field1145 * 64; // L: 3686
			var0.method2205(); // L: 3687
		}

		if (var0.field1192 != 0) { // L: 3691
			if (var0.targetIndex != -1) { // L: 3692
				Object var13 = null; // L: 3693
				if (var0.targetIndex < 32768) { // L: 3694
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3695
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) { // L: 3696
					var3 = var0.x - ((Actor)var13).x; // L: 3697
					var4 = var0.y - ((Actor)var13).y; // L: 3698
					if (var3 != 0 || var4 != 0) { // L: 3699
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3701
					var0.targetIndex = -1; // L: 3702
					var0.false0 = false; // L: 3703
				}
			}

			if (var0.field1160 != -1 && (var0.pathLength == 0 || var0.field1197 > 0)) { // L: 3706
				var0.orientation = var0.field1160; // L: 3707
				var0.field1160 = -1; // L: 3708
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 3710
			if (var11 == 0 && var0.false0) { // L: 3711
				var0.targetIndex = -1; // L: 3712
				var0.false0 = false; // L: 3713
			}

			if (var11 != 0) { // L: 3715
				++var0.field1131; // L: 3716
				boolean var14;
				if (var11 > 1024) { // L: 3717
					var0.rotation -= var0.field1183 ? var11 : var0.field1192 * 763690023 * -1413434473; // L: 3718
					var14 = true; // L: 3719
					if (var11 < var0.field1192 || var11 > 2048 - var0.field1192) { // L: 3720
						var0.rotation = var0.orientation; // L: 3721
						var14 = false; // L: 3722
					}

					if (!var0.field1183 && var0.movementSequence == var0.idleSequence && (var0.field1131 > 25 || var14)) { // L: 3724
						if (var0.turnLeftSequence != -1) { // L: 3725
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3726
						}
					}
				} else {
					var0.rotation += var0.field1183 ? var11 : var0.field1192 * 763690023 * -1413434473; // L: 3730
					var14 = true; // L: 3731
					if (var11 < var0.field1192 || var11 > 2048 - var0.field1192) { // L: 3732
						var0.rotation = var0.orientation; // L: 3733
						var14 = false; // L: 3734
					}

					if (!var0.field1183 && var0.idleSequence == var0.movementSequence && (var0.field1131 > 25 || var14)) { // L: 3736
						if (var0.turnRightSequence != -1) { // L: 3737
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3738
						}
					}
				}

				var0.rotation &= 2047; // L: 3742
				var0.field1183 = false; // L: 3743
			} else {
				var0.field1131 = 0; // L: 3745
			}
		}

		WorldMapSectionType.method4950(var0); // L: 3747
	} // L: 3748

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIIIIIB)V",
		garbageValue = "32"
	)
	static final void method2624(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field556) { // L: 10220
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10221
		}

		Client.field556 = false; // L: 10222
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator5.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10223
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10224
				var0.scrollY -= 4; // L: 10225
				class290.invalidateWidget(var0); // L: 10226
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10228
				var0.scrollY += 4; // L: 10229
				class290.invalidateWidget(var0); // L: 10230
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10232
				var7 = var3 * (var3 - 32) / var4; // L: 10233
				if (var7 < 8) { // L: 10234
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10235
				int var9 = var3 - 32 - var7; // L: 10236
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10237
				class290.invalidateWidget(var0); // L: 10238
				Client.field556 = true; // L: 10239
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10242
			var7 = var0.width; // L: 10243
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10244
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10245
				class290.invalidateWidget(var0); // L: 10246
			}
		}

	} // L: 10249
}
