import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public final class class13 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("u")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	public static void method150() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 177
	} // L: 178

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lfl;III)Ldh;",
		garbageValue = "474300455"
	)
	public static final PcmPlayer method146(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1442 == 0) { // L: 45
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class69.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 50
				var3.field1441 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (FontName.field3694 > 0 && WorldMapDecoration.soundSystem == null) { // L: 56
					WorldMapDecoration.soundSystem = new SoundSystem(); // L: 57
					RunException.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					RunException.soundSystemExecutor.scheduleAtFixedRate(WorldMapDecoration.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (WorldMapDecoration.soundSystem != null) { // L: 61
					if (WorldMapDecoration.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					WorldMapDecoration.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IB)V",
		garbageValue = "-27"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var11;
		if (var0.field1009 >= Client.cycle) { // L: 3904
			class236.method4265(var0);
		} else if (var0.field1024 >= Client.cycle) { // L: 3905
			WorldMapID.method666(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 3907
			if (var0.pathLength == 0) { // L: 3908
				var0.field978 = 0; // L: 3909
			} else {
				label398: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3912
						var2 = class105.SequenceDefinition_get(var0.sequence); // L: 3913
						if (var0.field1034 > 0 && var2.field3549 == 0) { // L: 3914
							++var0.field978; // L: 3915
							break label398; // L: 3916
						}

						if (var0.field1034 <= 0 && var2.field3550 == 0) { // L: 3918
							++var0.field978; // L: 3919
							break label398; // L: 3920
						}
					}

					var11 = var0.x; // L: 3923
					int var3 = var0.y; // L: 3924
					int var4 = var0.field1011 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3925
					int var5 = var0.field1011 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3926
					if (var11 < var4) { // L: 3927
						if (var3 < var5) { // L: 3928
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 3929
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 3930
						}
					} else if (var11 > var4) { // L: 3932
						if (var3 < var5) { // L: 3933
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 3934
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 3935
						}
					} else if (var3 < var5) { // L: 3937
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 3938
						var0.orientation = 0;
					}

					byte var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3939
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3940
						int var7 = var0.orientation - var0.rotation & 2047; // L: 3947
						if (var7 > 1024) { // L: 3948
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 3949
						if (var7 >= -256 && var7 <= 256) { // L: 3950
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 3951
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 3952
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 3953
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 3954
						int var9 = 4; // L: 3955
						boolean var10 = true; // L: 3956
						if (var0 instanceof NPC) { // L: 3957
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 3958
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1028 != 0) { // L: 3959
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 3960
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 3961
								var9 = 8;
							}

							if (var0.field978 > 0 && var0.pathLength > 1) { // L: 3962
								var9 = 8; // L: 3963
								--var0.field978; // L: 3964
							}
						} else {
							if (var0.pathLength > 1) { // L: 3968
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 3969
								var9 = 8;
							}

							if (var0.field978 > 0 && var0.pathLength > 1) { // L: 3970
								var9 = 8; // L: 3971
								--var0.field978; // L: 3972
							}
						}

						if (var6 == 2) { // L: 3975
							var9 <<= 1;
						}

						if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3976
							var0.movementSequence = var0.runSequence;
						}

						if (var4 != var11 || var3 != var5) { // L: 3977
							if (var11 < var4) { // L: 3978
								var0.x += var9; // L: 3979
								if (var0.x > var4) { // L: 3980
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 3982
								var0.x -= var9; // L: 3983
								if (var0.x < var4) { // L: 3984
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 3986
								var0.y += var9; // L: 3987
								if (var0.y > var5) { // L: 3988
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 3990
								var0.y -= var9; // L: 3991
								if (var0.y < var5) { // L: 3992
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 3995
							--var0.pathLength; // L: 3996
							if (var0.field1034 > 0) { // L: 3997
								--var0.field1034;
							}
						}
					} else {
						var0.x = var4; // L: 3941
						var0.y = var5; // L: 3942
						--var0.pathLength; // L: 3943
						if (var0.field1034 > 0) { // L: 3944
							--var0.field1034;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4000
			var0.sequence = -1; // L: 4001
			var0.spotAnimation = -1; // L: 4002
			var0.field1009 = 0; // L: 4003
			var0.field1024 = 0; // L: 4004
			var0.x = var0.pathX[0] * 128 + var0.field1011 * 64; // L: 4005
			var0.y = var0.field1011 * 64 + var0.pathY[0] * 128; // L: 4006
			var0.method1845(); // L: 4007
		}

		if (PlayerType.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4009 4010
			var0.sequence = -1; // L: 4011
			var0.spotAnimation = -1; // L: 4012
			var0.field1009 = 0; // L: 4013
			var0.field1024 = 0; // L: 4014
			var0.x = var0.pathX[0] * 128 + var0.field1011 * 64; // L: 4015
			var0.y = var0.pathY[0] * 128 + var0.field1011 * 64; // L: 4016
			var0.method1845(); // L: 4017
		}

		GameObject.method3415(var0); // L: 4020
		var0.isWalking = false; // L: 4022
		if (var0.movementSequence != -1) { // L: 4023
			var2 = class105.SequenceDefinition_get(var0.movementSequence); // L: 4024
			if (var2 != null && var2.frameIds != null) { // L: 4025
				++var0.movementFrameCycle; // L: 4026
				if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) { // L: 4027
					var0.movementFrameCycle = 1; // L: 4028
					++var0.movementFrame; // L: 4029
					UserComparator6.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y); // L: 4030
				}

				if (var0.movementFrame >= var2.frameIds.length) { // L: 4032
					var0.movementFrameCycle = 0; // L: 4033
					var0.movementFrame = 0; // L: 4034
					UserComparator6.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y); // L: 4035
				}
			} else {
				var0.movementSequence = -1; // L: 4038
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1015) { // L: 4040
			if (var0.spotAnimationFrame < 0) { // L: 4041
				var0.spotAnimationFrame = 0;
			}

			var11 = HealthBarUpdate.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4042
			if (var11 != -1) { // L: 4043
				SequenceDefinition var12 = class105.SequenceDefinition_get(var11); // L: 4044
				if (var12 != null && var12.frameIds != null) { // L: 4045
					++var0.spotAnimationFrameCycle; // L: 4046
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) { // L: 4047
						var0.spotAnimationFrameCycle = 1; // L: 4048
						++var0.spotAnimationFrame; // L: 4049
						UserComparator6.addSequenceSoundEffect(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4050
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) { // L: 4052 4053
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4056
				}
			} else {
				var0.spotAnimation = -1; // L: 4058
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4060
			var2 = class105.SequenceDefinition_get(var0.sequence); // L: 4061
			if (var2.field3549 == 1 && var0.field1034 > 0 && var0.field1009 <= Client.cycle && var0.field1024 < Client.cycle) { // L: 4062 4063
				var0.sequenceDelay = 1; // L: 4064
				return; // L: 4091
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4069
			var2 = class105.SequenceDefinition_get(var0.sequence); // L: 4070
			if (var2 != null && var2.frameIds != null) { // L: 4071
				++var0.sequenceFrameCycle; // L: 4072
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) { // L: 4073
					var0.sequenceFrameCycle = 1; // L: 4074
					++var0.sequenceFrame; // L: 4075
					UserComparator6.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4076
				}

				if (var0.sequenceFrame >= var2.frameIds.length) { // L: 4078
					var0.sequenceFrame -= var2.frameCount; // L: 4079
					++var0.field1022; // L: 4080
					if (var0.field1022 >= var2.field3547) { // L: 4081
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) { // L: 4082
						UserComparator6.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4083
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var2.field3544; // L: 4085
			} else {
				var0.sequence = -1; // L: 4087
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay; // L: 4089
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "966303255"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5393
			int var3 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - var2; // L: 5398
			var0 -= ItemContainer.cameraX; // L: 5399
			var3 -= ChatChannel.cameraY; // L: 5400
			var1 -= WorldMapManager.cameraZ; // L: 5401
			int var4 = Rasterizer3D.Rasterizer3D_sine[World.cameraPitch]; // L: 5402
			int var5 = Rasterizer3D.Rasterizer3D_cosine[World.cameraPitch]; // L: 5403
			int var6 = Rasterizer3D.Rasterizer3D_sine[ViewportMouse.cameraYaw]; // L: 5404
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ViewportMouse.cameraYaw]; // L: 5405
			int var8 = var0 * var7 + var6 * var1 >> 16; // L: 5406
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5407
			var0 = var8; // L: 5408
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5409
			var1 = var3 * var4 + var5 * var1 >> 16; // L: 5410
			if (var1 >= 50) { // L: 5412
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5413
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5414
			} else {
				Client.viewportTempX = -1; // L: 5417
				Client.viewportTempY = -1; // L: 5418
			}

		} else {
			Client.viewportTempX = -1; // L: 5394
			Client.viewportTempY = -1; // L: 5395
		}
	} // L: 5396 5420
}
