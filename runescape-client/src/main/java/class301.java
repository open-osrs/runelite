import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class301 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbb;",
		garbageValue = "1"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class115.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = PcmPlayer.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2143337015"
	)
	static final String method5583(int var0) {
		if (var0 < 100000) { // L: 425
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 426 427
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-1751178883"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1191 >= Client.cycle) { // L: 3994
			var2 = Math.max(1, var0.field1191 - Client.cycle); // L: 3995
			var3 = var0.field1167 * 64 + var0.field1187 * 128; // L: 3996
			var4 = var0.field1167 * 64 + var0.field1189 * 128; // L: 3997
			var0.x += (var3 - var0.x) / var2; // L: 3998
			var0.y += (var4 - var0.y) / var2; // L: 3999
			var0.field1194 = 0; // L: 4000
			var0.orientation = var0.field1139; // L: 4001
		} else if (var0.field1192 >= Client.cycle) { // L: 4003
			if (var0.field1192 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class114.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4004
				var2 = var0.field1192 - var0.field1191; // L: 4005
				var3 = Client.cycle - var0.field1191; // L: 4006
				var4 = var0.field1167 * 64 + var0.field1187 * 128; // L: 4007
				int var5 = var0.field1167 * 64 + var0.field1189 * 128; // L: 4008
				int var6 = var0.field1167 * 64 + var0.field1188 * 128; // L: 4009
				int var7 = var0.field1167 * 64 + var0.field1190 * 128; // L: 4010
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2; // L: 4011
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2; // L: 4012
			}

			var0.field1194 = 0; // L: 4014
			var0.orientation = var0.field1139; // L: 4015
			var0.rotation = var0.orientation; // L: 4016
		} else {
			class115.method2680(var0); // L: 4018
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4019
			var0.sequence = -1; // L: 4020
			var0.spotAnimation = -1; // L: 4021
			var0.field1191 = 0; // L: 4022
			var0.field1192 = 0; // L: 4023
			var0.x = var0.field1167 * 64 + var0.pathX[0] * 128; // L: 4024
			var0.y = var0.pathY[0] * 128 + var0.field1167 * 64; // L: 4025
			var0.method2180(); // L: 4026
		}

		if (ModelData0.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4028 4029
			var0.sequence = -1; // L: 4030
			var0.spotAnimation = -1; // L: 4031
			var0.field1191 = 0; // L: 4032
			var0.field1192 = 0; // L: 4033
			var0.x = var0.field1167 * 64 + var0.pathX[0] * 128; // L: 4034
			var0.y = var0.pathY[0] * 128 + var0.field1167 * 64; // L: 4035
			var0.method2180(); // L: 4036
		}

		if (var0.field1204 != 0) { // L: 4040
			if (var0.targetIndex != -1) { // L: 4041
				Object var8 = null; // L: 4042
				if (var0.targetIndex < 32768) { // L: 4043
					var8 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4044
					var8 = Client.players[var0.targetIndex - 32768];
				}

				if (var8 != null) { // L: 4045
					var3 = var0.x - ((Actor)var8).x; // L: 4046
					var4 = var0.y - ((Actor)var8).y; // L: 4047
					if (var3 != 0 || var4 != 0) { // L: 4048
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4050
					var0.targetIndex = -1; // L: 4051
					var0.false0 = false; // L: 4052
				}
			}

			if (var0.field1172 != -1 && (var0.pathLength == 0 || var0.field1194 > 0)) { // L: 4055
				var0.orientation = var0.field1172; // L: 4056
				var0.field1172 = -1; // L: 4057
			}

			var2 = var0.orientation - var0.rotation & 2047; // L: 4059
			if (var2 == 0 && var0.false0) { // L: 4060
				var0.targetIndex = -1; // L: 4061
				var0.false0 = false; // L: 4062
			}

			if (var2 != 0) { // L: 4064
				++var0.field1203; // L: 4065
				boolean var10;
				if (var2 > 1024) { // L: 4066
					var0.rotation -= var0.field1173 ? var2 : var0.field1204 * 1818380337 * -1019211567; // L: 4067
					var10 = true; // L: 4068
					if (var2 < var0.field1204 || var2 > 2048 - var0.field1204) { // L: 4069
						var0.rotation = var0.orientation; // L: 4070
						var10 = false; // L: 4071
					}

					if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1203 > 25 || var10)) { // L: 4073
						if (var0.turnLeftSequence != -1) { // L: 4074
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4075
						}
					}
				} else {
					var0.rotation += var0.field1173 ? var2 : 1818380337 * var0.field1204 * -1019211567; // L: 4079
					var10 = true; // L: 4080
					if (var2 < var0.field1204 || var2 > 2048 - var0.field1204) { // L: 4081
						var0.rotation = var0.orientation; // L: 4082
						var10 = false; // L: 4083
					}

					if (!var0.field1173 && var0.idleSequence == var0.movementSequence && (var0.field1203 > 25 || var10)) { // L: 4085
						if (var0.turnRightSequence != -1) { // L: 4086
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4087
						}
					}
				}

				var0.rotation &= 2047; // L: 4091
				var0.field1173 = false; // L: 4092
			} else {
				var0.field1203 = 0; // L: 4094
			}
		}

		var0.isWalking = false; // L: 4097
		SequenceDefinition var11;
		if (var0.movementSequence != -1) { // L: 4098
			var11 = class114.SequenceDefinition_get(var0.movementSequence); // L: 4099
			if (var11 != null) { // L: 4100
				if (!var11.isCachedModelIdSet() && var11.frameIds != null) { // L: 4101
					++var0.movementFrameCycle; // L: 4102
					if (var0.movementFrame < var11.frameIds.length && var0.movementFrameCycle > var11.frameLengths[var0.movementFrame]) { // L: 4103
						var0.movementFrameCycle = 1; // L: 4104
						++var0.movementFrame; // L: 4105
						class16.method182(var11, var0.movementFrame, var0.x, var0.y); // L: 4106
					}

					if (var0.movementFrame >= var11.frameIds.length) { // L: 4108
						var0.movementFrameCycle = 0; // L: 4109
						var0.movementFrame = 0; // L: 4110
						class16.method182(var11, var0.movementFrame, var0.x, var0.y); // L: 4111
					}
				} else if (var11.isCachedModelIdSet()) { // L: 4114
					++var0.movementFrame; // L: 4115
					var3 = var11.method3729(); // L: 4116
					if (var0.movementFrame < var3) { // L: 4117
						TileItem.method2407(var11, var0.movementFrame, var0.x, var0.y); // L: 4118
					} else {
						var0.movementFrameCycle = 0; // L: 4121
						var0.movementFrame = 0; // L: 4122
						TileItem.method2407(var11, var0.movementFrame, var0.x, var0.y); // L: 4123
					}
				} else {
					var0.movementSequence = -1; // L: 4126
				}
			} else {
				var0.movementSequence = -1; // L: 4128
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1185) { // L: 4130
			if (var0.spotAnimationFrame < 0) { // L: 4131
				var0.spotAnimationFrame = 0;
			}

			var2 = class136.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4132
			if (var2 != -1) { // L: 4133
				SequenceDefinition var9 = class114.SequenceDefinition_get(var2); // L: 4134
				if (var9 != null && var9.frameIds != null) { // L: 4135
					++var0.spotAnimationFrameCycle; // L: 4136
					if (var0.spotAnimationFrame < var9.frameIds.length && var0.spotAnimationFrameCycle > var9.frameLengths[var0.spotAnimationFrame]) { // L: 4137
						var0.spotAnimationFrameCycle = 1; // L: 4138
						++var0.spotAnimationFrame; // L: 4139
						class16.method182(var9, var0.spotAnimationFrame, var0.x, var0.y); // L: 4140
					}

					if (var0.spotAnimationFrame >= var9.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var9.frameIds.length)) { // L: 4142 4143
						var0.spotAnimation = -1;
					}
				} else if (var9.isCachedModelIdSet()) { // L: 4146
					++var0.spotAnimationFrame; // L: 4147
					var4 = var9.method3729(); // L: 4148
					if (var0.spotAnimationFrame < var4) { // L: 4149
						TileItem.method2407(var9, var0.spotAnimationFrame, var0.x, var0.y); // L: 4150
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) { // L: 4153
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4156
				}
			} else {
				var0.spotAnimation = -1; // L: 4158
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4160
			var11 = class114.SequenceDefinition_get(var0.sequence); // L: 4161
			if (var11.field2224 == 1 && var0.field1200 > 0 && var0.field1191 <= Client.cycle && var0.field1192 < Client.cycle) { // L: 4162 4163
				var0.sequenceDelay = 1; // L: 4164
				return; // L: 4208
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4169
			var11 = class114.SequenceDefinition_get(var0.sequence); // L: 4170
			if (var11 == null) { // L: 4171
				var0.sequence = -1; // L: 4204
			} else if (!var11.isCachedModelIdSet() && var11.frameIds != null) { // L: 4172
				++var0.sequenceFrameCycle; // L: 4173
				if (var0.sequenceFrame < var11.frameIds.length && var0.sequenceFrameCycle > var11.frameLengths[var0.sequenceFrame]) { // L: 4174
					var0.sequenceFrameCycle = 1; // L: 4175
					++var0.sequenceFrame; // L: 4176
					class16.method182(var11, var0.sequenceFrame, var0.x, var0.y); // L: 4177
				}

				if (var0.sequenceFrame >= var11.frameIds.length) { // L: 4179
					var0.sequenceFrame -= var11.frameCount; // L: 4180
					++var0.field1186; // L: 4181
					if (var0.field1186 >= var11.field2223) { // L: 4182
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var11.frameIds.length) { // L: 4183
						class16.method182(var11, var0.sequenceFrame, var0.x, var0.y); // L: 4184
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var11.field2201; // L: 4186
			} else if (var11.isCachedModelIdSet()) { // L: 4188
				++var0.sequenceFrame; // L: 4189
				var3 = var11.method3735().method2754(); // L: 4190
				if (var0.sequenceFrame < var3) { // L: 4191
					TileItem.method2407(var11, var0.sequenceFrame, var0.x, var0.y); // L: 4192
				} else {
					var0.sequenceFrame -= var11.frameCount; // L: 4195
					++var0.field1186; // L: 4196
					if (var0.field1186 >= var11.field2223) { // L: 4197
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4198
						TileItem.method2407(var11, var0.sequenceFrame, var0.x, var0.y); // L: 4199
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1; // L: 4202
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4206
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1223845461"
	)
	static final void method5580() {
		InvDefinition.method3268(false); // L: 5753
		Client.field545 = 0; // L: 5754
		boolean var0 = true; // L: 5755

		int var1;
		for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) { // L: 5756
			if (class83.regionMapArchiveIds[var1] != -1 && InterfaceParent.regionLandArchives[var1] == null) { // L: 5757 5758
				InterfaceParent.regionLandArchives[var1] = Message.archive5.takeFile(class83.regionMapArchiveIds[var1], 0); // L: 5759
				if (InterfaceParent.regionLandArchives[var1] == null) { // L: 5760
					var0 = false; // L: 5761
					++Client.field545; // L: 5762
				}
			}

			if (class17.regionLandArchiveIds[var1] != -1 && FloorUnderlayDefinition.regionMapArchives[var1] == null) { // L: 5766 5767
				FloorUnderlayDefinition.regionMapArchives[var1] = Message.archive5.takeFileEncrypted(class17.regionLandArchiveIds[var1], 0, class138.xteaKeys[var1]); // L: 5768
				if (FloorUnderlayDefinition.regionMapArchives[var1] == null) { // L: 5769
					var0 = false; // L: 5770
					++Client.field545; // L: 5771
				}
			}
		}

		if (!var0) { // L: 5776
			Client.field597 = 1; // L: 5777
		} else {
			Client.field570 = 0; // L: 5780
			var0 = true; // L: 5781

			int var3;
			int var4;
			for (var1 = 0; var1 < InterfaceParent.regionLandArchives.length; ++var1) { // L: 5782
				byte[] var15 = FloorUnderlayDefinition.regionMapArchives[var1]; // L: 5783
				if (var15 != null) { // L: 5784
					var3 = (class241.regions[var1] >> 8) * 64 - SecureRandomCallable.baseX; // L: 5785
					var4 = (class241.regions[var1] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY; // L: 5786
					if (Client.isInInstance) { // L: 5787
						var3 = 10; // L: 5788
						var4 = 10; // L: 5789
					}

					var0 &= class132.method2834(var15, var3, var4); // L: 5791
				}
			}

			if (!var0) { // L: 5794
				Client.field597 = 2; // L: 5795
			} else {
				if (Client.field597 != 0) { // L: 5798
					class259.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				ArchiveLoader.playPcmPlayers(); // L: 5799
				class175.scene.clear(); // L: 5800

				for (var1 = 0; var1 < 4; ++var1) { // L: 5801
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5802
					for (var2 = 0; var2 < 104; ++var2) { // L: 5803
						for (var3 = 0; var3 < 104; ++var3) { // L: 5804
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5805
						}
					}
				}

				ArchiveLoader.playPcmPlayers(); // L: 5809
				class149.method3024(); // L: 5810
				var1 = InterfaceParent.regionLandArchives.length; // L: 5811
				Varcs.method2466(); // L: 5812
				InvDefinition.method3268(true); // L: 5813
				int var5;
				if (!Client.isInInstance) { // L: 5814
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5815
						var3 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX; // L: 5816
						var4 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY; // L: 5817
						var14 = InterfaceParent.regionLandArchives[var2]; // L: 5818
						if (var14 != null) { // L: 5819
							ArchiveLoader.playPcmPlayers(); // L: 5820
							PacketBufferNode.method5009(var14, var3, var4, WorldMapSectionType.field2828 * 8 - 48, class433.field4657 * 8 - 48, Client.collisionMaps); // L: 5821
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5824
						var3 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX; // L: 5825
						var4 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY; // L: 5826
						var14 = InterfaceParent.regionLandArchives[var2]; // L: 5827
						if (var14 == null && class433.field4657 < 800) { // L: 5828
							ArchiveLoader.playPcmPlayers(); // L: 5829
							PlayerComposition.method5408(var3, var4, 64, 64); // L: 5830
						}
					}

					InvDefinition.method3268(true); // L: 5833

					for (var2 = 0; var2 < var1; ++var2) { // L: 5834
						byte[] var13 = FloorUnderlayDefinition.regionMapArchives[var2]; // L: 5835
						if (var13 != null) { // L: 5836
							var4 = (class241.regions[var2] >> 8) * 64 - SecureRandomCallable.baseX; // L: 5837
							var5 = (class241.regions[var2] & 255) * 64 - GrandExchangeOfferOwnWorldComparator.baseY; // L: 5838
							ArchiveLoader.playPcmPlayers(); // L: 5839
							VertexNormal.method4376(var13, var4, var5, class175.scene, Client.collisionMaps); // L: 5840
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5844
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5845
						ArchiveLoader.playPcmPlayers(); // L: 5846

						for (var3 = 0; var3 < 13; ++var3) { // L: 5847
							for (var4 = 0; var4 < 13; ++var4) { // L: 5848
								boolean var16 = false; // L: 5849
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5850
								if (var6 != -1) { // L: 5851
									var7 = var6 >> 24 & 3; // L: 5852
									var8 = var6 >> 1 & 3; // L: 5853
									var9 = var6 >> 14 & 1023; // L: 5854
									var10 = var6 >> 3 & 2047; // L: 5855
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5856

									for (int var12 = 0; var12 < class241.regions.length; ++var12) { // L: 5857
										if (class241.regions[var12] == var11 && InterfaceParent.regionLandArchives[var12] != null) { // L: 5858
											class125.method2794(InterfaceParent.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5859
											var16 = true; // L: 5860
											break;
										}
									}
								}

								if (!var16) { // L: 5865
									World.method1661(var2, var3 * 8, var4 * 8); // L: 5866
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5871
						for (var3 = 0; var3 < 13; ++var3) { // L: 5872
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5873
							if (var4 == -1) { // L: 5874
								PlayerComposition.method5408(var2 * 8, var3 * 8, 8, 8); // L: 5875
							}
						}
					}

					InvDefinition.method3268(true); // L: 5879

					for (var2 = 0; var2 < 4; ++var2) { // L: 5880
						ArchiveLoader.playPcmPlayers(); // L: 5881

						for (var3 = 0; var3 < 13; ++var3) { // L: 5882
							for (var4 = 0; var4 < 13; ++var4) { // L: 5883
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5884
								if (var5 != -1) { // L: 5885
									var6 = var5 >> 24 & 3; // L: 5886
									var7 = var5 >> 1 & 3; // L: 5887
									var8 = var5 >> 14 & 1023; // L: 5888
									var9 = var5 >> 3 & 2047; // L: 5889
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5890

									for (var11 = 0; var11 < class241.regions.length; ++var11) { // L: 5891
										if (class241.regions[var11] == var10 && FloorUnderlayDefinition.regionMapArchives[var11] != null) { // L: 5892
											Tiles.method2033(FloorUnderlayDefinition.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class175.scene, Client.collisionMaps); // L: 5893
											break; // L: 5894
										}
									}
								}
							}
						}
					}
				}

				InvDefinition.method3268(true); // L: 5902
				ArchiveLoader.playPcmPlayers(); // L: 5903
				class268.method5029(class175.scene, Client.collisionMaps); // L: 5904
				InvDefinition.method3268(true); // L: 5905
				var2 = Tiles.Tiles_minPlane; // L: 5906
				if (var2 > class128.Client_plane) { // L: 5907
					var2 = class128.Client_plane;
				}

				if (var2 < class128.Client_plane - 1) { // L: 5908
					var2 = class128.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5909
					class175.scene.init(Tiles.Tiles_minPlane);
				} else {
					class175.scene.init(0); // L: 5910
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5911
					for (var4 = 0; var4 < 104; ++var4) { // L: 5912
						Frames.updateItemPile(var3, var4); // L: 5913
					}
				}

				ArchiveLoader.playPcmPlayers(); // L: 5916
				ReflectionCheck.method600(); // L: 5917
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5918
				PacketBufferNode var17;
				if (class82.client.hasFrame()) { // L: 5919
					var17 = WallDecoration.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher); // L: 5921
					var17.packetBuffer.writeInt(1057001181); // L: 5922
					Client.packetWriter.addNode(var17); // L: 5923
				}

				if (!Client.isInInstance) { // L: 5925
					var3 = (WorldMapSectionType.field2828 - 6) / 8; // L: 5926
					var4 = (WorldMapSectionType.field2828 + 6) / 8; // L: 5927
					var5 = (class433.field4657 - 6) / 8; // L: 5928
					var6 = (class433.field4657 + 6) / 8; // L: 5929

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5930
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5931
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5932
								Message.archive5.loadRegionFromName("m" + var7 + "_" + var8); // L: 5933
								Message.archive5.loadRegionFromName("l" + var7 + "_" + var8); // L: 5934
							}
						}
					}
				}

				PendingSpawn.updateGameState(30); // L: 5938
				ArchiveLoader.playPcmPlayers(); // L: 5939
				PcmPlayer.method753(); // L: 5940
				var17 = WallDecoration.getPacketBufferNode(ClientPacket.field3031, Client.packetWriter.isaacCipher); // L: 5941
				Client.packetWriter.addNode(var17); // L: 5942
				WorldMap.method7222(); // L: 5943
			}
		}
	} // L: 5778 5796 5944
}
