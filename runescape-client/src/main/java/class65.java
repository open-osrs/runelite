import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class65 extends RouteStrategy {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lcz;"
	)
	@Export("pcmPlayerProvider")
	public static PcmPlayerProvider pcmPlayerProvider;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		signature = "Lem;"
	)
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIILfy;I)Z",
		garbageValue = "-519225044"
	)
	protected boolean vmethod3644(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "(Lbz;II)V",
		garbageValue = "406386718"
	)
	@Export("calculateActorPosition")
	static final void calculateActorPosition(Actor actor, int size) {
		if (actor.field19 > Client.cycle) {
			GraphicsDefaults.method5828(actor);
		} else {
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			if (actor.field20 >= Client.cycle) {
				if (actor.field20 == Client.cycle || actor.sequence == -1 || actor.sequenceDelay != 0 || actor.sequenceFrameCycle + 1 > WorldMapAreaData.getSequenceDefinition(actor.sequence).frameLengths[actor.sequenceFrame]) {
					var2 = actor.field20 - actor.field19;
					var3 = Client.cycle - actor.field19;
					var4 = actor.field15 * 128 + actor.size * 64;
					var5 = actor.field17 * 128 + actor.size * 64;
					int var7 = actor.field16 * 128 + actor.size * 64;
					var6 = actor.field18 * 128 + actor.size * 64;
					actor.x = (var3 * var7 + var4 * (var2 - var3)) / var2;
					actor.y = (var3 * var6 + var5 * (var2 - var3)) / var2;
				}

				actor.field24 = 0;
				actor.orientation = actor.field21;
				actor.field9 = actor.orientation;
			} else {
				actor.movementSequence = actor.readySequence;
				if (actor.pathLength == 0) {
					actor.field24 = 0;
				} else {
					label225: {
						if (actor.sequence != -1 && actor.sequenceDelay == 0) {
							SequenceDefinition var11 = WorldMapAreaData.getSequenceDefinition(actor.sequence);
							if (actor.field25 > 0 && var11.field781 == 0) {
								++actor.field24;
								break label225;
							}

							if (actor.field25 <= 0 && var11.field782 == 0) {
								++actor.field24;
								break label225;
							}
						}

						var2 = actor.x;
						var3 = actor.y;
						var4 = actor.pathX[actor.pathLength - 1] * 128 + actor.size * 64;
						var5 = actor.pathY[actor.pathLength - 1] * 128 + actor.size * 64;
						if (var2 < var4) {
							if (var3 < var5) {
								actor.orientation = 1280;
							} else if (var3 > var5) {
								actor.orientation = 1792;
							} else {
								actor.orientation = 1536;
							}
						} else if (var2 > var4) {
							if (var3 < var5) {
								actor.orientation = 768;
							} else if (var3 > var5) {
								actor.orientation = 256;
							} else {
								actor.orientation = 512;
							}
						} else if (var3 < var5) {
							actor.orientation = 1024;
						} else if (var3 > var5) {
							actor.orientation = 0;
						}

						byte var12 = actor.pathTraversed[actor.pathLength - 1];
						if (var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
							var6 = actor.orientation - actor.field9 & 2047;
							if (var6 > 1024) {
								var6 -= 2048;
							}

							int var8 = actor.walkBackSequence;
							if (var6 >= -256 && var6 <= 256) {
								var8 = actor.walkSequence;
							} else if (var6 >= 256 && var6 < 768) {
								var8 = actor.walkRightSequence;
							} else if (var6 >= -768 && var6 <= -256) {
								var8 = actor.walkLeftSequence;
							}

							if (var8 == -1) {
								var8 = actor.walkSequence;
							}

							actor.movementSequence = var8;
							int var9 = 4;
							boolean var10 = true;
							if (actor instanceof NPC) {
								var10 = ((NPC)actor).definition.isClickable;
							}

							if (var10) {
								if (actor.field9 != actor.orientation && actor.targetIndex == -1 && actor.field23 != 0) {
									var9 = 2;
								}

								if (actor.pathLength > 2) {
									var9 = 6;
								}

								if (actor.pathLength > 3) {
									var9 = 8;
								}

								if (actor.field24 > 0 && actor.pathLength > 1) {
									var9 = 8;
									--actor.field24;
								}
							} else {
								if (actor.pathLength > 1) {
									var9 = 6;
								}

								if (actor.pathLength > 2) {
									var9 = 8;
								}

								if (actor.field24 > 0 && actor.pathLength > 1) {
									var9 = 8;
									--actor.field24;
								}
							}

							if (var12 == 2) {
								var9 <<= 1;
							}

							if (var9 >= 8 && actor.movementSequence == actor.walkSequence && actor.runSequence != -1) {
								actor.movementSequence = actor.runSequence;
							}

							if (var2 != var4 || var5 != var3) {
								if (var2 < var4) {
									actor.x += var9;
									if (actor.x > var4) {
										actor.x = var4;
									}
								} else if (var2 > var4) {
									actor.x -= var9;
									if (actor.x < var4) {
										actor.x = var4;
									}
								}

								if (var3 < var5) {
									actor.y += var9;
									if (actor.y > var5) {
										actor.y = var5;
									}
								} else if (var3 > var5) {
									actor.y -= var9;
									if (actor.y < var5) {
										actor.y = var5;
									}
								}
							}

							if (var4 == actor.x && var5 == actor.y) {
								--actor.pathLength;
								if (actor.field25 > 0) {
									--actor.field25;
								}
							}
						} else {
							actor.x = var4;
							actor.y = var5;
							--actor.pathLength;
							if (actor.field25 > 0) {
								--actor.field25;
							}
						}
					}
				}
			}
		}

		if (actor.x < 128 || actor.y < 128 || actor.x >= 13184 || actor.y >= 13184) {
			actor.sequence = -1;
			actor.spotAnimation = -1;
			actor.field19 = 0;
			actor.field20 = 0;
			actor.x = actor.pathX[0] * 128 + actor.size * 64;
			actor.y = actor.pathY[0] * 128 + actor.size * 64;
			actor.method23();
		}

		if (Canvas.localPlayer == actor && (actor.x < 1536 || actor.y < 1536 || actor.x >= 11776 || actor.y >= 11776)) {
			actor.sequence = -1;
			actor.spotAnimation = -1;
			actor.field19 = 0;
			actor.field20 = 0;
			actor.x = actor.pathX[0] * 128 + actor.size * 64;
			actor.y = actor.pathY[0] * 128 + actor.size * 64;
			actor.method23();
		}

		ArchiveDiskAction.method4553(actor);
		ChatChannel.method2225(actor);
	}
}
