import java.util.Comparator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("z")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 10950

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;I)I",
		garbageValue = "960814637"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 10953
			return 0;
		} else {
			if (this.filterWorlds) { // L: 10954
				if (Client.worldId == var1.world) { // L: 10955
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 10956
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 10958
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 10966
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 10962
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1772140785"
	)
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 68
		if (var1 == null) { // L: 69
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 70 71
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "27"
	)
	static final int method1334(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 856
		var2 ^= var2 << 13; // L: 857
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 858
		return var3 >> 19 & 255; // L: 859
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "18134"
	)
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 3990
		if (WorldMapLabelSize.localPlayer.x >> 7 == Client.destinationX && WorldMapLabelSize.localPlayer.y >> 7 == Client.destinationY) { // L: 3992
			Client.destinationX = 0; // L: 3993
		}

		GrandExchangeOffer.method206(); // L: 3996
		Tiles.method1177(); // L: 3997
		CollisionMap.addNpcsToScene(true); // L: 3998
		int var4 = Players.Players_count; // L: 4000
		int[] var5 = Players.Players_indices; // L: 4001

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4002
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4003
				VarpDefinition.addPlayerToScene(Client.players[var5[var6]], true); // L: 4004
			}
		}

		CollisionMap.addNpcsToScene(false); // L: 4007
		Login.method2160(); // L: 4008

		for (GraphicsObject var21 = (GraphicsObject)Client.graphicsObjects.last(); var21 != null; var21 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4010 4011 4018
			if (var21.plane == Huffman.Client_plane && !var21.isFinished) { // L: 4012
				if (Client.cycle >= var21.cycleStart) { // L: 4013
					var21.advance(Client.field737); // L: 4014
					if (var21.isFinished) { // L: 4015
						var21.remove();
					} else {
						ScriptEvent.scene.drawEntity(var21.plane, var21.x, var21.y, var21.height, 60, var21, 0, -1L, false); // L: 4016
					}
				}
			} else {
				var21.remove();
			}
		}

		class231.setViewportShape(var0, var1, var2, var3, true); // L: 4021
		var0 = Client.viewportOffsetX; // L: 4022
		var1 = Client.viewportOffsetY; // L: 4023
		var2 = Client.viewportWidth; // L: 4024
		var3 = Client.viewportHeight; // L: 4025
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4026
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4027
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		int var13;
		int var14;
		int var22;
		if (!Client.isCameraLocked) { // L: 4028
			var4 = Client.camAngleX; // L: 4029
			if (Client.field762 / 256 > var4) { // L: 4030
				var4 = Client.field762 / 256;
			}

			if (Client.field922[4] && Client.field740[4] + 128 > var4) { // L: 4031
				var4 = Client.field740[4] + 128;
			}

			var22 = Client.camAngleY & 2047; // L: 4032
			var6 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX; // L: 4033
			var7 = class7.field40; // L: 4034
			var8 = MouseHandler.oculusOrbFocalPointY; // L: 4035
			var9 = var4 * 3 + 600; // L: 4038
			var12 = var3 - 334; // L: 4044
			if (var12 < 0) { // L: 4045
				var12 = 0;
			} else if (var12 > 100) { // L: 4046
				var12 = 100;
			}

			var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight; // L: 4047
			var11 = var9 * var13 / 256; // L: 4048
			var12 = 2048 - var4 & 2047; // L: 4051
			var13 = 2048 - var22 & 2047; // L: 4052
			var14 = 0; // L: 4053
			int var15 = 0; // L: 4054
			int var16 = var11; // L: 4055
			int var17;
			int var18;
			int var19;
			if (var12 != 0) { // L: 4056
				var17 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4057
				var18 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4058
				var19 = var18 * var15 - var11 * var17 >> 16; // L: 4059
				var16 = var11 * var18 + var15 * var17 >> 16; // L: 4060
				var15 = var19; // L: 4061
			}

			if (var13 != 0) { // L: 4063
				var17 = Rasterizer3D.Rasterizer3D_sine[var13]; // L: 4064
				var18 = Rasterizer3D.Rasterizer3D_cosine[var13]; // L: 4065
				var19 = var14 * var18 + var17 * var16 >> 16; // L: 4066
				var16 = var16 * var18 - var17 * var14 >> 16; // L: 4067
				var14 = var19; // L: 4068
			}

			VertexNormal.cameraX = var6 - var14; // L: 4070
			FaceNormal.cameraY = var7 - var15; // L: 4071
			AbstractWorldMapData.cameraZ = var8 - var16; // L: 4072
			PacketBuffer.cameraPitch = var4; // L: 4073
			ServerPacket.cameraYaw = var22; // L: 4074
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7 != WorldMapLabelSize.localPlayer.x >> 7 || MouseHandler.oculusOrbFocalPointY >> 7 != WorldMapLabelSize.localPlayer.y >> 7)) { // L: 4075 4076
				var17 = WorldMapLabelSize.localPlayer.plane; // L: 4077
				var18 = (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7) + WorldMapManager.baseX; // L: 4078
				var19 = (MouseHandler.oculusOrbFocalPointY >> 7) + WorldMapLabel.baseY; // L: 4079
				PacketBufferNode var20 = Client.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher); // L: 4082
				var20.packetBuffer.writeShort(var19); // L: 4083
				var20.packetBuffer.method5662(Client.field758); // L: 4084
				var20.packetBuffer.writeShort(var18); // L: 4085
				var20.packetBuffer.method5644(var17); // L: 4086
				Client.packetWriter.addNode(var20); // L: 4087
			}
		}

		if (!Client.isCameraLocked) { // L: 4094
			var4 = class9.method111();
		} else {
			var4 = class22.method244(); // L: 4095
		}

		var22 = VertexNormal.cameraX; // L: 4096
		var6 = FaceNormal.cameraY; // L: 4097
		var7 = AbstractWorldMapData.cameraZ; // L: 4098
		var8 = PacketBuffer.cameraPitch; // L: 4099
		var9 = ServerPacket.cameraYaw; // L: 4100

		int var10;
		for (var10 = 0; var10 < 5; ++var10) { // L: 4101
			if (Client.field922[var10]) { // L: 4102
				var11 = (int)(Math.random() * (double)(Client.field678[var10] * 2 + 1) - (double)Client.field678[var10] + Math.sin((double)Client.field926[var10] * ((double)Client.field925[var10] / 100.0D)) * (double)Client.field740[var10]); // L: 4103
				if (var10 == 0) { // L: 4104
					VertexNormal.cameraX += var11;
				}

				if (var10 == 1) { // L: 4105
					FaceNormal.cameraY += var11;
				}

				if (var10 == 2) { // L: 4106
					AbstractWorldMapData.cameraZ += var11;
				}

				if (var10 == 3) { // L: 4107
					ServerPacket.cameraYaw = var11 + ServerPacket.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 4108
					PacketBuffer.cameraPitch += var11; // L: 4109
					if (PacketBuffer.cameraPitch < 128) { // L: 4110
						PacketBuffer.cameraPitch = 128;
					}

					if (PacketBuffer.cameraPitch > 383) { // L: 4111
						PacketBuffer.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 4115
		var11 = MouseHandler.MouseHandler_y; // L: 4116
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4117
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 4118
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 4119
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 4121
			class299.method5393(var10 - var0, var11 - var1); // L: 4122
		} else {
			class92.method2142(); // L: 4125
		}

		RouteStrategy.playPcmPlayers(); // L: 4127
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4128
		RouteStrategy.playPcmPlayers(); // L: 4129
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 4130
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4131
		ScriptEvent.scene.draw(VertexNormal.cameraX, FaceNormal.cameraY, AbstractWorldMapData.cameraZ, PacketBuffer.cameraPitch, ServerPacket.cameraYaw, var4); // L: 4132
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 4133
		RouteStrategy.playPcmPlayers(); // L: 4134
		ScriptEvent.scene.clearTempGameObjects(); // L: 4135
		WorldMapID.method616(var0, var1, var2, var3); // L: 4136
		if (Client.hintArrowType == 2) { // L: 4138
			class89.worldToScreen((Client.hintArrowX - WorldMapManager.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - WorldMapLabel.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4139
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4140
				Varcs.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field737); // L: 4142
		Client.field790 = 0; // L: 4145
		var13 = (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX; // L: 4146
		var14 = (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY; // L: 4147
		if (var13 >= 3053 && var13 <= 3156 && var14 >= 3056 && var14 <= 3136) { // L: 4148
			Client.field790 = 1;
		}

		if (var13 >= 3072 && var13 <= 3118 && var14 >= 9492 && var14 <= 9535) { // L: 4149
			Client.field790 = 1;
		}

		if (Client.field790 == 1 && var13 >= 3139 && var13 <= 3199 && var14 >= 3008 && var14 <= 3062) { // L: 4150
			Client.field790 = 0;
		}

		VertexNormal.cameraX = var22; // L: 4153
		FaceNormal.cameraY = var6; // L: 4154
		AbstractWorldMapData.cameraZ = var7; // L: 4155
		PacketBuffer.cameraPitch = var8; // L: 4156
		ServerPacket.cameraYaw = var9; // L: 4157
		if (Client.isLoading) { // L: 4158
			byte var23 = 0; // L: 4161
			var14 = var23 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 4162
			if (var14 == 0) { // L: 4166
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4168
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4169
			Actor.drawLoadingMessage("Loading - please wait.", false); // L: 4170
		}

	} // L: 4172
}
