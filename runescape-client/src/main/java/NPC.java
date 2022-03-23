import java.io.IOException;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -1198609277
	)
	static int field1253;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILgv;I)V",
		garbageValue = "-1208741979"
	)
	final void method2357(int var1, class193 var2) {
		int var3 = super.pathX[0]; // L: 15
		int var4 = super.pathY[0]; // L: 16
		if (var1 == 0) { // L: 17
			--var3; // L: 18
			++var4; // L: 19
		}

		if (var1 == 1) { // L: 21
			++var4;
		}

		if (var1 == 2) { // L: 22
			++var3; // L: 23
			++var4; // L: 24
		}

		if (var1 == 3) { // L: 26
			--var3;
		}

		if (var1 == 4) { // L: 27
			++var3;
		}

		if (var1 == 5) { // L: 28
			--var3; // L: 29
			--var4; // L: 30
		}

		if (var1 == 6) { // L: 32
			--var4;
		}

		if (var1 == 7) { // L: 33
			++var3; // L: 34
			--var4; // L: 35
		}

		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2171 == 1) { // L: 37
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 38
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 42
		}

		super.pathX[0] = var3; // L: 44
		super.pathY[0] = var4; // L: 45
		super.pathTraversed[0] = var2; // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 77
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null; // L: 78
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? ItemContainer.SequenceDefinition_get(super.movementSequence) : null; // L: 79
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 80
			if (var3 == null) { // L: 81
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 82
				super.defaultHeight = var3.height; // L: 83
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 84
					Model var4 = class6.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 85
					if (var4 != null) { // L: 86
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 87
						Model[] var5 = new Model[]{var3, var4}; // L: 88
						var3 = new Model(var5, 2); // L: 89
					}
				}

				if (this.definition.size == 1) { // L: 92
					var3.isSingleTile = true;
				}

				if (super.field1189 != 0 && Client.cycle >= super.field1133 && Client.cycle < super.field1185) { // L: 93
					var3.overrideHue = super.field1146; // L: 94
					var3.overrideSaturation = super.field1187; // L: 95
					var3.overrideLuminance = super.field1188; // L: 96
					var3.overrideAmount = super.field1189; // L: 97
				} else {
					var3.overrideAmount = 0; // L: 100
				}

				return var3; // L: 102
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1745876062"
	)
	final void method2353(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2171 == 1) { // L: 50
			super.sequence = -1;
		}

		if (!var3) { // L: 51
			int var4 = var1 - super.pathX[0]; // L: 52
			int var5 = var2 - super.pathY[0]; // L: 53
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 54
				if (super.pathLength < 9) { // L: 55
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 56
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 57
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 58
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 59
				}

				super.pathX[0] = var1; // L: 61
				super.pathY[0] = var2; // L: 62
				super.pathTraversed[0] = class193.field2193; // L: 63
				return; // L: 64
			}
		}

		super.pathLength = 0; // L: 67
		super.field1134 = 0; // L: 68
		super.field1197 = 0; // L: 69
		super.pathX[0] = var1; // L: 70
		super.pathY[0] = var2; // L: 71
		super.x = super.field1145 * 64 + super.pathX[0] * 128; // L: 72
		super.y = super.field1145 * 64 + super.pathY[0] * 128; // L: 73
	} // L: 74

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-450224469"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 106
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-22"
	)
	public static void method2366(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 193
			try {
				Buffer var1 = new Buffer(4); // L: 195
				var1.writeByte(var0 ? 2 : 3); // L: 196
				var1.writeMedium(0); // L: 197
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 198
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 202
				} catch (Exception var3) { // L: 204
				}

				++NetCache.NetCache_ioExceptions; // L: 205
				NetCache.NetCache_socket = null; // L: 206
			}

		}
	} // L: 208

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1976233431"
	)
	static SecureRandom method2364() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1011545908"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4074
		class144.method3014(); // L: 4075
		VertexNormal.method4498(); // L: 4076
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4078
			class166.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4079
		}

		ItemContainer.addNpcsToScene(true); // L: 4082
		ItemComposition.method3751(); // L: 4083
		ItemContainer.addNpcsToScene(false); // L: 4084

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4086 4087 4104
			if (var4.plane == class160.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4088
				if (Client.cycle >= var4.cycleStart) { // L: 4089
					if (var4.targetIndex > 0) { // L: 4090
						NPC var18 = Client.npcs[var4.targetIndex - 1]; // L: 4091
						if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) { // L: 4092
							var4.setDestination(var18.x, var18.y, Archive.getTileHeight(var18.x, var18.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4094
						var6 = -var4.targetIndex - 1; // L: 4096
						Player var20;
						if (var6 == Client.localPlayerIndex) { // L: 4097
							var20 = class19.localPlayer;
						} else {
							var20 = Client.players[var6]; // L: 4098
						}

						if (var20 != null && var20.x >= 0 && var20.x < 13312 && var20.y >= 0 && var20.y < 13312) { // L: 4099
							var4.setDestination(var20.x, var20.y, Archive.getTileHeight(var20.x, var20.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field550); // L: 4101
					FriendSystem.scene.drawEntity(class160.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4102
				}
			} else {
				var4.remove();
			}
		}

		class160.method3238(); // L: 4107
		Language.setViewportShape(var0, var1, var2, var3, true); // L: 4108
		var0 = Client.viewportOffsetX; // L: 4109
		var1 = Client.viewportOffsetY; // L: 4110
		var2 = Client.viewportWidth; // L: 4111
		var3 = Client.viewportHeight; // L: 4112
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4113
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4114
		int var17 = Client.camAngleX; // L: 4115
		if (Client.field756 / 256 > var17) { // L: 4116
			var17 = Client.field756 / 256;
		}

		if (Client.field740[4] && Client.field549[4] + 128 > var17) { // L: 4117
			var17 = Client.field549[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4118
		class20.method324(Messages.oculusOrbFocalPointX, FloorOverlayDefinition.field2136, class115.oculusOrbFocalPointY, var17, var5, DevicePcmPlayerProvider.method385(var17), var3); // L: 4119
		if (!Client.isCameraLocked) { // L: 4121
			var6 = RouteStrategy.method3869();
		} else {
			var6 = GrandExchangeOfferOwnWorldComparator.method1133(); // L: 4122
		}

		int var7 = EnumComposition.cameraX; // L: 4123
		int var8 = FriendSystem.cameraY; // L: 4124
		int var9 = CollisionMap.cameraZ; // L: 4125
		int var10 = Language.cameraPitch; // L: 4126
		int var11 = MusicPatchNode2.cameraYaw; // L: 4127

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 4128
			if (Client.field740[var12]) { // L: 4129
				var13 = (int)(Math.random() * (double)(Client.field482[var12] * 2 + 1) - (double)Client.field482[var12] + Math.sin((double)Client.field766[var12] / 100.0D * (double)Client.field744[var12]) * (double)Client.field549[var12]); // L: 4130
				if (var12 == 0) { // L: 4131
					EnumComposition.cameraX += var13;
				}

				if (var12 == 1) { // L: 4132
					FriendSystem.cameraY += var13;
				}

				if (var12 == 2) { // L: 4133
					CollisionMap.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4134
					MusicPatchNode2.cameraYaw = var13 + MusicPatchNode2.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4135
					Language.cameraPitch += var13; // L: 4136
					if (Language.cameraPitch < 128) { // L: 4137
						Language.cameraPitch = 128;
					}

					if (Language.cameraPitch > 383) { // L: 4138
						Language.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4142
		var13 = MouseHandler.MouseHandler_y; // L: 4143
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4144
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4145
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4146
		}

		int var14;
		int var15;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4148
			var14 = var12 - var0; // L: 4149
			var15 = var13 - var1; // L: 4150
			ViewportMouse.ViewportMouse_x = var14; // L: 4152
			ViewportMouse.ViewportMouse_y = var15; // L: 4153
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4154
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4155
			ViewportMouse.ViewportMouse_false0 = false; // L: 4156
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4161
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4162
		}

		MouseHandler.playPcmPlayers(); // L: 4165
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4166
		MouseHandler.playPcmPlayers(); // L: 4167
		var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 4168
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4169
		FriendSystem.scene.draw(EnumComposition.cameraX, FriendSystem.cameraY, CollisionMap.cameraZ, Language.cameraPitch, MusicPatchNode2.cameraYaw, var6); // L: 4170
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 4171
		MouseHandler.playPcmPlayers(); // L: 4172
		FriendSystem.scene.clearTempGameObjects(); // L: 4173
		InterfaceParent.method2100(var0, var1, var2, var3); // L: 4174
		if (Client.hintArrowType == 2) { // L: 4176
			class10.worldToScreen((Client.hintArrowX - ApproximateRouteStrategy.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - class250.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 4177
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4178
				VarpDefinition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field550); // L: 4180
		Client.field603 = 0; // L: 4183
		var15 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX; // L: 4184
		int var16 = (class19.localPlayer.y >> 7) + class250.baseY; // L: 4185
		if (var15 >= 3053 && var15 <= 3156 && var16 >= 3056 && var16 <= 3136) { // L: 4186
			Client.field603 = 1;
		}

		if (var15 >= 3072 && var15 <= 3118 && var16 >= 9492 && var16 <= 9535) { // L: 4187
			Client.field603 = 1;
		}

		if (Client.field603 == 1 && var15 >= 3139 && var15 <= 3199 && var16 >= 3008 && var16 <= 3062) { // L: 4188
			Client.field603 = 0;
		}

		EnumComposition.cameraX = var7; // L: 4191
		FriendSystem.cameraY = var8; // L: 4192
		CollisionMap.cameraZ = var9; // L: 4193
		Language.cameraPitch = var10; // L: 4194
		MusicPatchNode2.cameraYaw = var11; // L: 4195
		if (Client.isLoading) { // L: 4196
			byte var19 = 0; // L: 4199
			var16 = var19 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 4200
			if (var16 == 0) { // L: 4204
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4206
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4207
			class119.drawLoadingMessage("Loading - please wait.", false); // L: 4208
		}

	} // L: 4210

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1005562855"
	)
	static final String method2367(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10270 10271
	}
}
