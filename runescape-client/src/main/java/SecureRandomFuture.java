import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 366779581
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("h")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("v")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1052169316"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "63706826"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1655382452"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "109574038"
	)
	public static void method2205(boolean var0) {
		if (var0 != ItemDefinition.ItemDefinition_inMembersWorld) {
			TileItem.method2187();
			ItemDefinition.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1070154541"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		AttackOption.method2138();
		class51.method832();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			ClientPreferences.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		Skeleton.addNpcsToScene(true);
		WorldMapRectangle.method332();
		Skeleton.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == GameObject.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var33 = Client.npcs[var4.targetIndex - 1];
						if (var33 != null && var33.x >= 0 && var33.x < 13312 && var33.y >= 0 && var33.y < 13312) {
							var4.setDestination(var33.x, var33.y, getTileHeight(var33.x, var33.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var36;
						if (var6 == Client.localPlayerIndex) {
							var36 = PlayerAppearance.localPlayer;
						} else {
							var36 = Client.players[var6];
						}

						if (var36 != null && var36.x >= 0 && var36.x < 13312 && var36.y >= 0 && var36.y < 13312) {
							var4.setDestination(var36.x, var36.y, getTileHeight(var36.x, var36.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field850);
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		WorldMapSprite.method467();
		class25.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var28;
		if (!Client.isCameraLocked) {
			var28 = Client.camAngleX;
			if (Client.field918 / 256 > var28) {
				var28 = Client.field918 / 256;
			}

			if (Client.field902[4] && Client.field893[4] + 128 > var28) {
				var28 = Client.field893[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			var6 = oculusOrbFocalPointX;
			var7 = PacketWriter.field1341;
			var8 = Decimator.oculusOrbFocalPointY;
			var9 = WorldMapManager.method704(var28);
			var9 = NetSocket.method3587(var9, var3);
			var10 = 2048 - var28 & 2047;
			var11 = 2048 - var5 & 2047;
			var12 = 0;
			var13 = 0;
			var14 = var9;
			int var17;
			if (var10 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var10];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
				var17 = var16 * var13 - var15 * var9 >> 16;
				var14 = var15 * var13 + var16 * var9 >> 16;
				var13 = var17;
			}

			if (var11 != 0) {
				var15 = Rasterizer3D.Rasterizer3D_sine[var11];
				var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
				var17 = var12 * var16 + var14 * var15 >> 16;
				var14 = var14 * var16 - var15 * var12 >> 16;
				var12 = var17;
			}

			Player.cameraX = var6 - var12;
			KeyHandler.cameraY = var7 - var13;
			class69.cameraZ = var8 - var14;
			Skeleton.cameraPitch = var28;
			AbstractArchive.cameraYaw = var5;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (oculusOrbFocalPointX >> 7 != PlayerAppearance.localPlayer.x >> 7 || Decimator.oculusOrbFocalPointY >> 7 != PlayerAppearance.localPlayer.y >> 7)) {
				var15 = PlayerAppearance.localPlayer.plane;
				var16 = NetFileRequest.baseX * 64 + (oculusOrbFocalPointX >> 7);
				var17 = class41.baseY * 64 + (Decimator.oculusOrbFocalPointY >> 7);
				PacketBufferNode var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher);
				var18.packetBuffer.method5578(var16);
				var18.packetBuffer.method5587(Client.field730);
				var18.packetBuffer.method5739(var17);
				var18.packetBuffer.writeByte(var15);
				Client.packetWriter.addNode(var18);
			}
		}

		if (!Client.isCameraLocked) {
			if (Timer.clientPreferences.roofsHidden) {
				var5 = GameObject.Client_plane;
			} else {
				label625: {
					var6 = 3;
					if (Skeleton.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var7 = oculusOrbFocalPointX >> 7;
							var8 = Decimator.oculusOrbFocalPointY >> 7;
						} else {
							var7 = PlayerAppearance.localPlayer.x >> 7;
							var8 = PlayerAppearance.localPlayer.y >> 7;
						}

						var9 = Player.cameraX >> 7;
						var10 = class69.cameraZ >> 7;
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
							var5 = GameObject.Client_plane;
							break label625;
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
							var5 = GameObject.Client_plane;
							break label625;
						}

						if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) {
							var6 = GameObject.Client_plane;
						}

						if (var7 > var9) {
							var11 = var7 - var9;
						} else {
							var11 = var9 - var7;
						}

						if (var8 > var10) {
							var12 = var8 - var10;
						} else {
							var12 = var10 - var8;
						}

						if (var11 > var12) {
							var13 = var12 * 65536 / var11;
							var14 = 32768;

							while (var7 != var9) {
								if (var9 < var7) {
									++var9;
								} else if (var9 > var7) {
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) {
									var6 = GameObject.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var10 < var8) {
										++var10;
									} else if (var10 > var8) {
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) {
										var6 = GameObject.Client_plane;
									}
								}
							}
						} else if (var12 > 0) {
							var13 = var11 * 65536 / var12;
							var14 = 32768;

							while (var10 != var8) {
								if (var10 < var8) {
									++var10;
								} else if (var10 > var8) {
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) {
									var6 = GameObject.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var9 < var7) {
										++var9;
									} else if (var9 > var7) {
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][var9][var10] & 4) != 0) {
										var6 = GameObject.Client_plane;
									}
								}
							}
						}
					}

					if (PlayerAppearance.localPlayer.x >= 0 && PlayerAppearance.localPlayer.y >= 0 && PlayerAppearance.localPlayer.x < 13312 && PlayerAppearance.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[GameObject.Client_plane][PlayerAppearance.localPlayer.x >> 7][PlayerAppearance.localPlayer.y >> 7] & 4) != 0) {
							var6 = GameObject.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = GameObject.Client_plane;
					}
				}
			}

			var28 = var5;
		} else {
			var28 = WorldMapManager.method712();
		}

		var5 = Player.cameraX;
		var6 = KeyHandler.cameraY;
		var7 = class69.cameraZ;
		var8 = Skeleton.cameraPitch;
		var9 = AbstractArchive.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field902[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field679[var10] * 2 + 1) - (double)Client.field679[var10] + Math.sin((double)Client.field705[var10] / 100.0D * (double)Client.field644[var10]) * (double)Client.field893[var10]);
				if (var10 == 0) {
					Player.cameraX += var11;
				}

				if (var10 == 1) {
					KeyHandler.cameraY += var11;
				}

				if (var10 == 2) {
					class69.cameraZ += var11;
				}

				if (var10 == 3) {
					AbstractArchive.cameraYaw = var11 + AbstractArchive.cameraYaw & 2047;
				}

				if (var10 == 4) {
					Skeleton.cameraPitch += var11;
					if (Skeleton.cameraPitch < 128) {
						Skeleton.cameraPitch = 128;
					}

					if (Skeleton.cameraPitch > 383) {
						Skeleton.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x;
		var11 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var10 = MouseHandler.MouseHandler_lastPressedX;
			var11 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			class3.method41(var10 - var0, var11 - var1);
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		FontName.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		FontName.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		ArchiveLoader.scene.draw(Player.cameraX, KeyHandler.cameraY, class69.cameraZ, Skeleton.cameraPitch, AbstractArchive.cameraYaw, var28);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		FontName.playPcmPlayers();
		ArchiveLoader.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var34 = false;
		var14 = -1;
		var15 = -1;
		var16 = Players.Players_count;
		int[] var29 = Players.Players_indices;

		int var30;
		for (var30 = 0; var30 < var16 + Client.npcCount; ++var30) {
			Object var32;
			if (var30 < var16) {
				var32 = Client.players[var29[var30]];
				if (var29[var30] == Client.combatTargetPlayerIndex) {
					var34 = true;
					var14 = var30;
					continue;
				}

				if (var32 == PlayerAppearance.localPlayer) {
					var15 = var30;
					continue;
				}
			} else {
				var32 = Client.npcs[Client.npcIndices[var30 - var16]];
			}

			AbstractWorldMapIcon.drawActor2d((Actor)var32, var30, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			AbstractWorldMapIcon.drawActor2d(PlayerAppearance.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var34) {
			AbstractWorldMapIcon.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var30 = 0; var30 < Client.overheadTextCount; ++var30) {
			int var19 = Client.overheadTextXs[var30];
			int var20 = Client.overheadTextYs[var30];
			int var21 = Client.overheadTextXOffsets[var30];
			int var22 = Client.overheadTextAscents[var30];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var31 = 0; var31 < var30; ++var31) {
					if (var20 + 2 > Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] && var20 - var22 < Client.overheadTextYs[var31] + 2 && var19 - var21 < Client.overheadTextXOffsets[var31] + Client.overheadTextXs[var31] && var19 + var21 > Client.overheadTextXs[var31] - Client.overheadTextXOffsets[var31] && Client.overheadTextYs[var31] - Client.overheadTextAscents[var31] < var20) {
						var20 = Client.overheadTextYs[var31] - Client.overheadTextAscents[var31];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var30];
			Client.viewportTempY = Client.overheadTextYs[var30] = var20;
			String var24 = Client.overheadText[var30];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var30] < 6) {
					var25 = Client.field863[Client.overheadTextColors[var30]];
				}

				if (Client.overheadTextColors[var30] == 6) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var30] == 7) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var30] == 8) {
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var30] == 9) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var30];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var30] == 10) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var30];
					if (var26 < 50) {
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) {
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var30] == 11) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var30];
					if (var26 < 50) {
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) {
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) {
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var30] == 0) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var30] == 1) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var30] == 2) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var30] == 3) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var30]);
				}

				if (Client.overheadTextEffects[var30] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var30]) * (GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var24) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					GrandExchangeOfferTotalQuantityComparator.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var30] == 5) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var30];
					int var27 = 0;
					if (var26 < 25) {
						var27 = var26 - 25;
					} else if (var26 > 125) {
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			GrandExchangeOffer.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - NetFileRequest.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class41.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				AbstractWorldMapIcon.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field850);
		class231.method4153();
		Player.cameraX = var5;
		KeyHandler.cameraY = var6;
		class69.cameraZ = var7;
		Skeleton.cameraPitch = var8;
		AbstractArchive.cameraYaw = var9;
		if (Client.isLoading) {
			byte var35 = 0;
			var14 = var35 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			Varps.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1783095333"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}
}
