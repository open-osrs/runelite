import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public abstract class class116 extends Node {
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	class116() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	abstract void vmethod2767(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	abstract void vmethod2766(ClanSettings var1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "1969424851"
	)
	public static int method2510(CharSequence var0, int var1) {
		return Language.method5477(var0, var1, true);
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lcd;II)V",
		garbageValue = "-855242752"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var11;
		if (var0.field1145 >= Client.cycle) {
			var11 = Math.max(1, var0.field1145 - Client.cycle);
			var3 = var0.field1109 * 64 + var0.field1148 * 128;
			var4 = var0.field1109 * 64 + var0.field1126 * 128;
			var0.x += (var3 - var0.x) / var11;
			var0.y += (var4 - var0.y) / var11;
			var0.field1164 = 0;
			var0.orientation = var0.field1151;
		} else if (var0.field1165 >= Client.cycle) {
			Client.method1589(var0);
		} else {
			var0.movementSequence = var0.idleSequence;
			if (var0.pathLength == 0) {
				var0.field1164 = 0;
			} else {
				label399: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) {
						var2 = KitDefinition.SequenceDefinition_get(var0.sequence);
						if (var0.field1129 > 0 && var2.field1959 == 0) {
							++var0.field1164;
							break label399;
						}

						if (var0.field1129 <= 0 && var2.field1960 == 0) {
							++var0.field1164;
							break label399;
						}
					}

					var11 = var0.x;
					var3 = var0.y;
					var4 = var0.field1109 * 64 + var0.pathX[var0.pathLength - 1] * 128;
					int var5 = var0.field1109 * 64 + var0.pathY[var0.pathLength - 1] * 128;
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

					byte var6 = var0.pathTraversed[var0.pathLength - 1];
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
							if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1146 != 0) {
								var9 = 2;
							}

							if (var0.pathLength > 2) {
								var9 = 6;
							}

							if (var0.pathLength > 3) {
								var9 = 8;
							}

							if (var0.field1164 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1164;
							}
						} else {
							if (var0.pathLength > 1) {
								var9 = 6;
							}

							if (var0.pathLength > 2) {
								var9 = 8;
							}

							if (var0.field1164 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field1164;
							}
						}

						if (var6 == 2) {
							var9 <<= 1;
						}

						if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
							var0.movementSequence = var0.runSequence;
						}

						if (var4 != var11 || var5 != var3) {
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
							if (var0.field1129 > 0) {
								--var0.field1129;
							}
						}
					} else {
						var0.x = var4;
						var0.y = var5;
						--var0.pathLength;
						if (var0.field1129 > 0) {
							--var0.field1129;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1145 = 0;
			var0.field1165 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1109 * 64;
			var0.y = var0.field1109 * 64 + var0.pathY[0] * 128;
			var0.method2137();
		}

		if (class67.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1145 = 0;
			var0.field1165 = 0;
			var0.x = var0.field1109 * 64 + var0.pathX[0] * 128;
			var0.y = var0.pathY[0] * 128 + var0.field1109 * 64;
			var0.method2137();
		}

		class328.method5930(var0);
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			var2 = KitDefinition.SequenceDefinition_get(var0.movementSequence);
			if (var2 != null && var2.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					class134.method2716(var2, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var2.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					class134.method2716(var2, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1105) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var11 = class21.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var11 != -1) {
				SequenceDefinition var12 = KitDefinition.SequenceDefinition_get(var11);
				if (var12 != null && var12.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class134.method2716(var12, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var2 = KitDefinition.SequenceDefinition_get(var0.sequence);
			if (var2.field1959 == 1 && var0.field1129 > 0 && var0.field1145 <= Client.cycle && var0.field1165 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var2 = KitDefinition.SequenceDefinition_get(var0.sequence);
			if (var2 != null && var2.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					class134.method2716(var2, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var2.frameIds.length) {
					var0.sequenceFrame -= var2.frameCount;
					++var0.field1142;
					if (var0.field1142 >= var2.field1952) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) {
						class134.method2716(var2, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var2.field1945;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
