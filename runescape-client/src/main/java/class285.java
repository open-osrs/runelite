import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class285 {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static StudioGame field3313;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-739713756"
	)
	public static int method5516(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lcj;II)V",
		garbageValue = "-2146563022"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1184 >= Client.cycle) { // L: 4009
			GrandExchangeOfferTotalQuantityComparator.method5970(var0);
		} else if (var0.field1194 >= Client.cycle) { // L: 4010
			if (var0.field1194 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > ScriptFrame.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4011
				var2 = var0.field1194 - var0.field1184; // L: 4012
				var3 = Client.cycle - var0.field1184; // L: 4013
				var4 = var0.field1205 * 64 + var0.field1140 * 128; // L: 4014
				int var5 = var0.field1205 * 64 + var0.field1182 * 128; // L: 4015
				int var6 = var0.field1205 * 64 + var0.field1181 * 128; // L: 4016
				int var7 = var0.field1205 * 64 + var0.field1183 * 128; // L: 4017
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2; // L: 4018
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2; // L: 4019
			}

			var0.field1202 = 0; // L: 4021
			var0.orientation = var0.field1186; // L: 4022
			var0.rotation = var0.orientation; // L: 4023
		} else {
			KitDefinition.method3439(var0); // L: 4025
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4026
			var0.sequence = -1; // L: 4027
			var0.spotAnimation = -1; // L: 4028
			var0.field1184 = 0; // L: 4029
			var0.field1194 = 0; // L: 4030
			var0.x = var0.pathX[0] * 128 + var0.field1205 * 64; // L: 4031
			var0.y = var0.pathY[0] * 128 + var0.field1205 * 64; // L: 4032
			var0.method2182(); // L: 4033
		}

		if (class101.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4035 4036
			var0.sequence = -1; // L: 4037
			var0.spotAnimation = -1; // L: 4038
			var0.field1184 = 0; // L: 4039
			var0.field1194 = 0; // L: 4040
			var0.x = var0.field1205 * 64 + var0.pathX[0] * 128; // L: 4041
			var0.y = var0.field1205 * 64 + var0.pathY[0] * 128; // L: 4042
			var0.method2182(); // L: 4043
		}

		Script.method1977(var0); // L: 4046
		var0.isWalking = false; // L: 4048
		SequenceDefinition var8;
		if (var0.movementSequence != -1) { // L: 4049
			var8 = ScriptFrame.SequenceDefinition_get(var0.movementSequence); // L: 4050
			if (var8 != null) { // L: 4051
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4052
					++var0.movementFrameCycle; // L: 4053
					if (var0.movementFrame < var8.frameIds.length && var0.movementFrameCycle > var8.frameLengths[var0.movementFrame]) { // L: 4054
						var0.movementFrameCycle = 1; // L: 4055
						++var0.movementFrame; // L: 4056
						class120.method2761(var8, var0.movementFrame, var0.x, var0.y); // L: 4057
					}

					if (var0.movementFrame >= var8.frameIds.length) { // L: 4059
						var0.movementFrameCycle = 0; // L: 4060
						var0.movementFrame = 0; // L: 4061
						class120.method2761(var8, var0.movementFrame, var0.x, var0.y); // L: 4062
					}
				} else if (var8.isCachedModelIdSet()) { // L: 4065
					++var0.movementFrame; // L: 4066
					var3 = var8.method3835(); // L: 4067
					if (var0.movementFrame < var3) { // L: 4068
						GrandExchangeOfferWorldComparator.method5997(var8, var0.movementFrame, var0.x, var0.y); // L: 4069
					} else {
						var0.movementFrameCycle = 0; // L: 4072
						var0.movementFrame = 0; // L: 4073
						GrandExchangeOfferWorldComparator.method5997(var8, var0.movementFrame, var0.x, var0.y); // L: 4074
					}
				} else {
					var0.movementSequence = -1; // L: 4077
				}
			} else {
				var0.movementSequence = -1; // L: 4079
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1178) { // L: 4081
			if (var0.spotAnimationFrame < 0) { // L: 4082
				var0.spotAnimationFrame = 0;
			}

			var2 = ObjectSound.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4083
			if (var2 != -1) { // L: 4084
				SequenceDefinition var9 = ScriptFrame.SequenceDefinition_get(var2); // L: 4085
				if (var9 != null && var9.frameIds != null) { // L: 4086
					++var0.spotAnimationFrameCycle; // L: 4087
					if (var0.spotAnimationFrame < var9.frameIds.length && var0.spotAnimationFrameCycle > var9.frameLengths[var0.spotAnimationFrame]) { // L: 4088
						var0.spotAnimationFrameCycle = 1; // L: 4089
						++var0.spotAnimationFrame; // L: 4090
						class120.method2761(var9, var0.spotAnimationFrame, var0.x, var0.y); // L: 4091
					}

					if (var0.spotAnimationFrame >= var9.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var9.frameIds.length)) { // L: 4093 4094
						var0.spotAnimation = -1;
					}
				} else if (var9.isCachedModelIdSet()) { // L: 4097
					++var0.spotAnimationFrame; // L: 4098
					var4 = var9.method3835(); // L: 4099
					if (var0.spotAnimationFrame < var4) { // L: 4100
						GrandExchangeOfferWorldComparator.method5997(var9, var0.spotAnimationFrame, var0.x, var0.y); // L: 4101
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) { // L: 4104
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4107
				}
			} else {
				var0.spotAnimation = -1; // L: 4109
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4111
			var8 = ScriptFrame.SequenceDefinition_get(var0.sequence); // L: 4112
			if (var8.field2187 == 1 && var0.field1203 > 0 && var0.field1184 <= Client.cycle && var0.field1194 < Client.cycle) { // L: 4113 4114
				var0.sequenceDelay = 1; // L: 4115
				return; // L: 4159
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4120
			var8 = ScriptFrame.SequenceDefinition_get(var0.sequence); // L: 4121
			if (var8 == null) { // L: 4122
				var0.sequence = -1; // L: 4155
			} else if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4123
				++var0.sequenceFrameCycle; // L: 4124
				if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4125
					var0.sequenceFrameCycle = 1; // L: 4126
					++var0.sequenceFrame; // L: 4127
					class120.method2761(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4128
				}

				if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4130
					var0.sequenceFrame -= var8.frameCount; // L: 4131
					++var0.field1190; // L: 4132
					if (var0.field1190 >= var8.field2186) { // L: 4133
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4134
						class120.method2761(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4135
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var8.field2182; // L: 4137
			} else if (var8.isCachedModelIdSet()) { // L: 4139
				++var0.sequenceFrame; // L: 4140
				var3 = var8.method3836().method2767(); // L: 4141
				if (var0.sequenceFrame < var3) { // L: 4142
					GrandExchangeOfferWorldComparator.method5997(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4143
				} else {
					var0.sequenceFrame -= var8.frameCount; // L: 4146
					++var0.field1190; // L: 4147
					if (var0.field1190 >= var8.field2186) { // L: 4148
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4149
						GrandExchangeOfferWorldComparator.method5997(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4150
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1; // L: 4153
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4157
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1607228102"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7815
			if (Client.isLowDetail && var0 != PacketWriter.Client_plane) { // L: 7816
				return;
			}

			long var7 = 0L; // L: 7817
			boolean var9 = true; // L: 7818
			boolean var10 = false; // L: 7819
			boolean var11 = false; // L: 7820
			if (var1 == 0) { // L: 7821
				var7 = class356.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7822
				var7 = class356.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7823
				var7 = class356.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7824
				var7 = class356.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7825
				var12 = class356.scene.getObjectFlags(var0, var2, var3, var7); // L: 7826
				int var14 = Decimator.Entity_unpackID(var7); // L: 7827
				int var15 = var12 & 31; // L: 7828
				int var16 = var12 >> 6 & 3; // L: 7829
				ObjectComposition var13;
				if (var1 == 0) { // L: 7830
					class356.scene.removeBoundaryObject(var0, var2, var3); // L: 7831
					var13 = class162.getObjectDefinition(var14); // L: 7832
					if (var13.interactType != 0) { // L: 7833
						Client.collisionMaps[var0].method3883(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7835
					class356.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7836
					class356.scene.removeGameObject(var0, var2, var3); // L: 7837
					var13 = class162.getObjectDefinition(var14); // L: 7838
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7839
						return;
					}

					if (var13.interactType != 0) { // L: 7840
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7842
					class356.scene.removeFloorDecoration(var0, var2, var3); // L: 7843
					var13 = class162.getObjectDefinition(var14); // L: 7844
					if (var13.interactType == 1) { // L: 7845
						Client.collisionMaps[var0].method3886(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7848
				var12 = var0; // L: 7849
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7850
					var12 = var0 + 1;
				}

				class142.method3050(var0, var12, var2, var3, var4, var5, var6, class356.scene, Client.collisionMaps[var0]); // L: 7851
			}
		}

	} // L: 7854
}
