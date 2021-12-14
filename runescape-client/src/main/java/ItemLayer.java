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
	}

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
		if (var0.field1136 >= Client.cycle) {
			var11 = Math.max(1, var0.field1136 - Client.cycle);
			var3 = var0.field1120 * 64 + var0.field1132 * 128;
			var4 = var0.field1120 * 64 + var0.field1134 * 128;
			var0.x += (var3 - var0.x) / var11;
			var0.y += (var4 - var0.y) / var11;
			var0.field1117 = 0;
			var0.orientation = var0.field1138;
		} else if (var0.field1157 >= Client.cycle) {
			class18.method293(var0);
		} else {
			var0.movementSequence = var0.idleSequence;
			if (var0.pathLength == 0) {
				var0.field1117 = 0;
			} else {
				label410: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) {
						SequenceDefinition var2 = UserComparator5.SequenceDefinition_get(var0.sequence);
						if (var0.field1098 > 0 && var2.field2096 == 0) {
							++var0.field1117;
							break label410;
						}

						if (var0.field1098 <= 0 && var2.field2097 == 0) {
							++var0.field1117;
							break label410;
						}
					}

					var11 = var0.x;
					var3 = var0.y;
					var4 = var0.field1120 * 64 + var0.pathX[var0.pathLength - 1] * 128;
					int var5 = var0.field1120 * 64 + var0.pathY[var0.pathLength - 1] * 128;
					if (var11 < var4) {
						if (var3 < var5) {
							var0.orientation = 1280;
						} else if (var3 > var5) {
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536;
						}
					} else if (var11 > var4) {
						if (var3 < var5) {
							var0.orientation = 768;
						} else if (var3 > var5) {
							var0.orientation = 256;
						} else {
							var0.orientation = 512;
						}
					} else if (var3 < var5) {
						var0.orientation = 1024;
					} else if (var3 > var5) {
						var0.orientation = 0;
					}

					class185 var6 = var0.pathTraversed[var0.pathLength - 1];
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
						int var7 = var0.orientation - var0.rotation & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence;
						if (var7 >= -256 && var7 <= 256) {
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) {
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) {
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) {
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8;
						int var9 = 4;
						boolean var10 = true;
						if (var0 instanceof NPC) {
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) {
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1149 != 0) {
								var9 = 2;
							}

							if (var0.pathLength > 2) {
								var9 = 6;
							}

							if (var0.pathLength > 3) {
								var9 = 8;
							}

							if (var0.field1117 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1117;
							}
						} else {
							if (var0.pathLength > 1) {
								var9 = 6;
							}

							if (var0.pathLength > 2) {
								var9 = 8;
							}

							if (var0.field1117 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1117;
							}
						}

						if (var6 == class185.field2122) {
							var9 <<= 1;
						} else if (var6 == class185.field2120) {
							var9 >>= 1;
						}

						if (var9 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
							var0.movementSequence = var0.runSequence;
						}

						if (var11 != var4 || var3 != var5) {
							if (var11 < var4) {
								var0.x += var9;
								if (var0.x > var4) {
									var0.x = var4;
								}
							} else if (var11 > var4) {
								var0.x -= var9;
								if (var0.x < var4) {
									var0.x = var4;
								}
							}

							if (var3 < var5) {
								var0.y += var9;
								if (var0.y > var5) {
									var0.y = var5;
								}
							} else if (var3 > var5) {
								var0.y -= var9;
								if (var0.y < var5) {
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) {
							--var0.pathLength;
							if (var0.field1098 > 0) {
								--var0.field1098;
							}
						}
					} else {
						var0.x = var4;
						var0.y = var5;
						--var0.pathLength;
						if (var0.field1098 > 0) {
							--var0.field1098;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1136 = 0;
			var0.field1157 = 0;
			var0.x = var0.field1120 * 64 + var0.pathX[0] * 128;
			var0.y = var0.pathY[0] * 128 + var0.field1120 * 64;
			var0.method2228();
		}

		if (class340.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1136 = 0;
			var0.field1157 = 0;
			var0.x = var0.field1120 * 64 + var0.pathX[0] * 128;
			var0.y = var0.pathY[0] * 128 + var0.field1120 * 64;
			var0.method2228();
		}

		if (var0.field1149 != 0) {
			if (var0.targetIndex != -1) {
				Object var13 = null;
				if (var0.targetIndex < 32768) {
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var13 = Client.players[var0.targetIndex - 32768];
				}

				if (var13 != null) {
					var3 = var0.x - ((Actor)var13).x;
					var4 = var0.y - ((Actor)var13).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1122 != -1 && (var0.pathLength == 0 || var0.field1117 > 0)) {
				var0.orientation = var0.field1122;
				var0.field1122 = -1;
			}

			var11 = var0.orientation - var0.rotation & 2047;
			if (var11 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var11 != 0) {
				++var0.field1148;
				boolean var14;
				if (var11 > 1024) {
					var0.rotation -= var0.field1118 ? var11 : var0.field1149 * -771997279 * 1637605985;
					var14 = true;
					if (var11 < var0.field1149 || var11 > 2048 - var0.field1149) {
						var0.rotation = var0.orientation;
						var14 = false;
					}

					if (!var0.field1118 && var0.idleSequence == var0.movementSequence && (var0.field1148 > 25 || var14)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1118 ? var11 : -771997279 * var0.field1149 * 1637605985;
					var14 = true;
					if (var11 < var0.field1149 || var11 > 2048 - var0.field1149) {
						var0.rotation = var0.orientation;
						var14 = false;
					}

					if (!var0.field1118 && var0.movementSequence == var0.idleSequence && (var0.field1148 > 25 || var14)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
				var0.field1118 = false;
			} else {
				var0.field1148 = 0;
			}
		}

		class363.method6612(var0);
	}
}
