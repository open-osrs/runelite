import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2108404385
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 729522117
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1162640969
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 6218752588747903787L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 516323665
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lcy;II)V",
		garbageValue = "1978432610"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var11;
		if (var0.field1136 >= Client.cycle) { // L: 4624
			var11 = Math.max(1, var0.field1136 - Client.cycle); // L: 4625
			var3 = var0.field1120 * 64 + var0.field1132 * 128; // L: 4626
			var4 = var0.field1120 * 64 + var0.field1134 * 128; // L: 4627
			var0.x += (var3 - var0.x) / var11; // L: 4628
			var0.y += (var4 - var0.y) / var11; // L: 4629
			var0.field1117 = 0; // L: 4630
			var0.orientation = var0.field1138; // L: 4631
		} else if (var0.field1157 >= Client.cycle) { // L: 4633
			class18.method293(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 4635
			if (var0.pathLength == 0) { // L: 4636
				var0.field1117 = 0; // L: 4637
			} else {
				label410: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4640
						SequenceDefinition var2 = UserComparator5.SequenceDefinition_get(var0.sequence); // L: 4641
						if (var0.field1098 > 0 && var2.field2096 == 0) { // L: 4642
							++var0.field1117; // L: 4643
							break label410; // L: 4644
						}

						if (var0.field1098 <= 0 && var2.field2097 == 0) { // L: 4646
							++var0.field1117; // L: 4647
							break label410; // L: 4648
						}
					}

					var11 = var0.x; // L: 4651
					var3 = var0.y; // L: 4652
					var4 = var0.field1120 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4653
					int var5 = var0.field1120 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4654
					if (var11 < var4) { // L: 4655
						if (var3 < var5) { // L: 4656
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 4657
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 4658
						}
					} else if (var11 > var4) { // L: 4660
						if (var3 < var5) { // L: 4661
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 4662
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 4663
						}
					} else if (var3 < var5) { // L: 4665
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 4666
						var0.orientation = 0;
					}

					class185 var6 = var0.field1153[var0.pathLength - 1]; // L: 4667
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4668
						int var7 = var0.orientation - var0.rotation & 2047; // L: 4675
						if (var7 > 1024) { // L: 4676
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 4677
						if (var7 >= -256 && var7 <= 256) { // L: 4678
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 4679
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 4680
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 4681
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 4682
						int var9 = 4; // L: 4683
						boolean var10 = true; // L: 4684
						if (var0 instanceof NPC) { // L: 4685
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 4686
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1149 != 0) { // L: 4687
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 4688
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 4689
								var9 = 8;
							}

							if (var0.field1117 > 0 && var0.pathLength > 1) { // L: 4690
								var9 = 8; // L: 4691
								--var0.field1117; // L: 4692
							}
						} else {
							if (var0.pathLength > 1) { // L: 4696
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 4697
								var9 = 8;
							}

							if (var0.field1117 > 0 && var0.pathLength > 1) { // L: 4698
								var9 = 8; // L: 4699
								--var0.field1117; // L: 4700
							}
						}

						if (var6 == class185.field2122) { // L: 4703
							var9 <<= 1;
						} else if (var6 == class185.field2120) { // L: 4704
							var9 >>= 1;
						}

						if (var9 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4705
							var0.movementSequence = var0.runSequence;
						}

						if (var11 != var4 || var3 != var5) { // L: 4706
							if (var11 < var4) { // L: 4707
								var0.x += var9; // L: 4708
								if (var0.x > var4) { // L: 4709
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 4711
								var0.x -= var9; // L: 4712
								if (var0.x < var4) { // L: 4713
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 4715
								var0.y += var9; // L: 4716
								if (var0.y > var5) { // L: 4717
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 4719
								var0.y -= var9; // L: 4720
								if (var0.y < var5) { // L: 4721
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 4724
							--var0.pathLength; // L: 4725
							if (var0.field1098 > 0) { // L: 4726
								--var0.field1098;
							}
						}
					} else {
						var0.x = var4; // L: 4669
						var0.y = var5; // L: 4670
						--var0.pathLength; // L: 4671
						if (var0.field1098 > 0) { // L: 4672
							--var0.field1098;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4729
			var0.sequence = -1; // L: 4730
			var0.spotAnimation = -1; // L: 4731
			var0.field1136 = 0; // L: 4732
			var0.field1157 = 0; // L: 4733
			var0.x = var0.field1120 * 64 + var0.pathX[0] * 128; // L: 4734
			var0.y = var0.pathY[0] * 128 + var0.field1120 * 64; // L: 4735
			var0.method2228(); // L: 4736
		}

		if (class340.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4738 4739
			var0.sequence = -1; // L: 4740
			var0.spotAnimation = -1; // L: 4741
			var0.field1136 = 0; // L: 4742
			var0.field1157 = 0; // L: 4743
			var0.x = var0.field1120 * 64 + var0.pathX[0] * 128; // L: 4744
			var0.y = var0.pathY[0] * 128 + var0.field1120 * 64; // L: 4745
			var0.method2228(); // L: 4746
		}

		if (var0.field1149 != 0) { // L: 4750
			if (var0.targetIndex != -1) { // L: 4751
				Object var13 = null; // L: 4752
				if (var0.targetIndex < 32768) { // L: 4753
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4754
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) { // L: 4755
					var3 = var0.x - ((Actor)var13).x; // L: 4756
					var4 = var0.y - ((Actor)var13).y; // L: 4757
					if (var3 != 0 || var4 != 0) { // L: 4758
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4760
					var0.targetIndex = -1; // L: 4761
					var0.false0 = false; // L: 4762
				}
			}

			if (var0.field1122 != -1 && (var0.pathLength == 0 || var0.field1117 > 0)) { // L: 4765
				var0.orientation = var0.field1122; // L: 4766
				var0.field1122 = -1; // L: 4767
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 4769
			if (var11 == 0 && var0.false0) { // L: 4770
				var0.targetIndex = -1; // L: 4771
				var0.false0 = false; // L: 4772
			}

			if (var11 != 0) { // L: 4774
				++var0.field1148; // L: 4775
				boolean var14;
				if (var11 > 1024) { // L: 4776
					var0.rotation -= var0.field1118 ? var11 : var0.field1149 * -771997279 * 1637605985; // L: 4777
					var14 = true; // L: 4778
					if (var11 < var0.field1149 || var11 > 2048 - var0.field1149) { // L: 4779
						var0.rotation = var0.orientation; // L: 4780
						var14 = false; // L: 4781
					}

					if (!var0.field1118 && var0.idleSequence == var0.movementSequence && (var0.field1148 > 25 || var14)) { // L: 4783
						if (var0.turnLeftSequence != -1) { // L: 4784
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4785
						}
					}
				} else {
					var0.rotation += var0.field1118 ? var11 : -771997279 * var0.field1149 * 1637605985; // L: 4789
					var14 = true; // L: 4790
					if (var11 < var0.field1149 || var11 > 2048 - var0.field1149) { // L: 4791
						var0.rotation = var0.orientation; // L: 4792
						var14 = false; // L: 4793
					}

					if (!var0.field1118 && var0.movementSequence == var0.idleSequence && (var0.field1148 > 25 || var14)) { // L: 4795
						if (var0.turnRightSequence != -1) { // L: 4796
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4797
						}
					}
				}

				var0.rotation &= 2047; // L: 4801
				var0.field1118 = false; // L: 4802
			} else {
				var0.field1148 = 0; // L: 4804
			}
		}

		class363.method6612(var0); // L: 4806
	} // L: 4807
}
