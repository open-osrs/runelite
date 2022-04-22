import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class149 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-55422083"
	)
	static final void method3138(String var0) {
		Actor.addGameMessage(30, "", var0); // L: 102
	} // L: 103

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lcb;IB)V",
		garbageValue = "-21"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1143 >= Client.cycle) { // L: 3919
			UserComparator8.method2578(var0);
		} else {
			int var3;
			int var4;
			int var5;
			int var7;
			int var11;
			if (var0.field1163 >= Client.cycle) { // L: 3920
				if (var0.field1163 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class163.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3921
					var11 = var0.field1163 - var0.field1143; // L: 3922
					var3 = Client.cycle - var0.field1143; // L: 3923
					var4 = var0.field1150 * 64 + var0.field1129 * 128; // L: 3924
					var5 = var0.field1150 * 64 + var0.field1160 * 128; // L: 3925
					int var12 = var0.field1150 * 64 + var0.field1132 * 128; // L: 3926
					var7 = var0.field1150 * 64 + var0.field1161 * 128; // L: 3927
					var0.x = (var12 * var3 + var4 * (var11 - var3)) / var11; // L: 3928
					var0.y = (var3 * var7 + var5 * (var11 - var3)) / var11; // L: 3929
				}

				var0.field1179 = 0; // L: 3931
				var0.orientation = var0.field1135; // L: 3932
				var0.rotation = var0.orientation; // L: 3933
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3936
				if (var0.pathLength == 0) { // L: 3937
					var0.field1179 = 0; // L: 3938
				} else {
					label286: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3941
							SequenceDefinition var2 = class163.SequenceDefinition_get(var0.sequence); // L: 3942
							if (var0.field1170 > 0 && var2.field2159 == 0) { // L: 3943
								++var0.field1179; // L: 3944
								break label286; // L: 3945
							}

							if (var0.field1170 <= 0 && var2.field2158 == 0) { // L: 3947
								++var0.field1179; // L: 3948
								break label286; // L: 3949
							}
						}

						var11 = var0.x; // L: 3952
						var3 = var0.y; // L: 3953
						var4 = var0.field1150 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3954
						var5 = var0.field1150 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3955
						if (var11 < var4) { // L: 3956
							if (var3 < var5) { // L: 3957
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3958
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3959
							}
						} else if (var11 > var4) { // L: 3961
							if (var3 < var5) { // L: 3962
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3963
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3964
							}
						} else if (var3 < var5) { // L: 3966
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3967
							var0.orientation = 0;
						}

						class193 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3968
						if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3969
							var7 = var0.orientation - var0.rotation & 2047; // L: 3976
							if (var7 > 1024) { // L: 3977
								var7 -= 2048;
							}

							int var8 = var0.walkBackSequence; // L: 3978
							if (var7 >= -256 && var7 <= 256) { // L: 3979
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3980
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3981
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3982
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3983
							int var9 = 4; // L: 3984
							boolean var10 = true; // L: 3985
							if (var0 instanceof NPC) { // L: 3986
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 3987
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1175 != 0) { // L: 3988
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 3989
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 3990
									var9 = 8;
								}

								if (var0.field1179 > 0 && var0.pathLength > 1) { // L: 3991
									var9 = 8; // L: 3992
									--var0.field1179; // L: 3993
								}
							} else {
								if (var0.pathLength > 1) { // L: 3997
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 3998
									var9 = 8;
								}

								if (var0.field1179 > 0 && var0.pathLength > 1) { // L: 3999
									var9 = 8; // L: 4000
									--var0.field1179; // L: 4001
								}
							}

							if (var6 == class193.field2187) { // L: 4004
								var9 <<= 1;
							} else if (var6 == class193.field2184) { // L: 4005
								var9 >>= 1;
							}

							if (var9 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4006
								var0.movementSequence = var0.runSequence;
							}

							if (var11 != var4 || var5 != var3) { // L: 4007
								if (var11 < var4) { // L: 4008
									var0.x += var9; // L: 4009
									if (var0.x > var4) { // L: 4010
										var0.x = var4;
									}
								} else if (var11 > var4) { // L: 4012
									var0.x -= var9; // L: 4013
									if (var0.x < var4) { // L: 4014
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 4016
									var0.y += var9; // L: 4017
									if (var0.y > var5) { // L: 4018
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 4020
									var0.y -= var9; // L: 4021
									if (var0.y < var5) { // L: 4022
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 4025
								--var0.pathLength; // L: 4026
								if (var0.field1170 > 0) { // L: 4027
									--var0.field1170;
								}
							}
						} else {
							var0.x = var4; // L: 3970
							var0.y = var5; // L: 3971
							--var0.pathLength; // L: 3972
							if (var0.field1170 > 0) { // L: 3973
								--var0.field1170;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4030
			var0.sequence = -1; // L: 4031
			var0.spotAnimation = -1; // L: 4032
			var0.field1143 = 0; // L: 4033
			var0.field1163 = 0; // L: 4034
			var0.x = var0.pathX[0] * 128 + var0.field1150 * 64; // L: 4035
			var0.y = var0.field1150 * 64 + var0.pathY[0] * 128; // L: 4036
			var0.method2179(); // L: 4037
		}

		if (GrandExchangeEvents.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4039 4040
			var0.sequence = -1; // L: 4041
			var0.spotAnimation = -1; // L: 4042
			var0.field1143 = 0; // L: 4043
			var0.field1163 = 0; // L: 4044
			var0.x = var0.field1150 * 64 + var0.pathX[0] * 128; // L: 4045
			var0.y = var0.pathY[0] * 128 + var0.field1150 * 64; // L: 4046
			var0.method2179(); // L: 4047
		}

		Skeleton.method4730(var0); // L: 4050
		GrandExchangeOfferWorldComparator.method6006(var0); // L: 4051
	} // L: 4052
}
