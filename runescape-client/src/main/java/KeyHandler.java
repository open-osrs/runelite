import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("KeyHandler_instance")
	static KeyHandler KeyHandler_instance;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static Widget field407;
	@ObfuscatedName("ck")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ci")
	static int[] field409;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1257927323
	)
	static int field414;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 535895155
	)
	static int field411;
	@ObfuscatedName("co")
	static char[] field415;
	@ObfuscatedName("ca")
	static int[] field413;
	@ObfuscatedName("cm")
	public static int[] field429;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 244616371
	)
	public static int field425;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -564210989
	)
	static int field416;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1367616829
	)
	static int field417;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1700039391
	)
	static int field421;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 448116129
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("cs")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	@Export("headIconPrayerSprites")
	static Sprite[] headIconPrayerSprites;
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field409 = new int[128];
		field414 = 0;
		field411 = 0;
		field415 = new char[128];
		field413 = new int[128];
		field429 = new int[128];
		field425 = 0;
		field416 = 0;
		field417 = 0;
		field421 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field411 >= 0 && var2 >= 0) {
				field409[field411] = ~var2;
				field411 = field411 + 1 & 127;
				if (field414 == field411) {
					field411 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && GrandExchangeEvents.method148(var2)) {
				int var3 = field417 + 1 & 127;
				if (var3 != field416) {
					field413[field417] = -1;
					field415[field417] = var2;
					field417 = var3;
				}
			}
		}

		var1.consume();
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field411 = -1;
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field411 >= 0 && var2 >= 0) {
				field409[field411] = var2;
				field411 = field411 + 1 & 127;
				if (field411 == field414) {
					field411 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field417 + 1 & 127;
				if (var3 != field416) {
					field413[field417] = var2;
					field415[field417] = 0;
					field417 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "98"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		Canvas.method925();
		UserComparator6.method3564();
		WorldMapScaleHandler.method812();
		WorldMapIcon_0.addNpcsToScene(true);
		ScriptFrame.method1201();
		WorldMapIcon_0.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == TileItemPile.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var29 = Client.npcs[var4.targetIndex - 1];
						if (var29 != null && var29.x >= 0 && var29.x < 13312 && var29.y >= 0 && var29.y < 13312) {
							var4.setDestination(var29.x, var29.y, Language.getTileHeight(var29.x, var29.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var34;
						if (var6 == Client.localPlayerIndex) {
							var34 = class60.localPlayer;
						} else {
							var34 = Client.players[var6];
						}

						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) {
							var4.setDestination(var34.x, var34.y, Language.getTileHeight(var34.x, var34.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field747);
					UserComparator3.scene.drawEntity(TileItemPile.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var32 = (GraphicsObject)Client.graphicsObjects.last(); var32 != null; var32 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var32.plane == TileItemPile.Client_plane && !var32.isFinished) {
				if (Client.cycle >= var32.cycleStart) {
					var32.advance(Client.field747);
					if (var32.isFinished) {
						var32.remove();
					} else {
						UserComparator3.scene.drawEntity(var32.plane, var32.x, var32.y, var32.height, 60, var32, 0, -1L, false);
					}
				}
			} else {
				var32.remove();
			}
		}

		WorldMapID.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var5;
		int var7;
		int var8;
		int var11;
		int var28;
		if (!Client.isCameraLocked) {
			var28 = Client.camAngleX;
			if (Client.field881 / 256 > var28) {
				var28 = Client.field881 / 256;
			}

			if (Client.field918[4] && Client.field775[4] + 128 > var28) {
				var28 = Client.field775[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			var6 = class225.oculusOrbFocalPointX;
			var7 = WorldMapDecoration.field234;
			var8 = HealthBarDefinition.oculusOrbFocalPointY;
			var11 = var28 * 3 + 600;
			GrandExchangeOfferAgeComparator.method224(var6, var7, var8, var28, var5, var11, var3);
		}

		int var9;
		int var10;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) {
			if (NetSocket.clientPreferences.roofsHidden) {
				var5 = TileItemPile.Client_plane;
			} else {
				label668: {
					var6 = 3;
					if (TilePaint.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var7 = class225.oculusOrbFocalPointX >> 7;
							var8 = HealthBarDefinition.oculusOrbFocalPointY >> 7;
						} else {
							var7 = class60.localPlayer.x >> 7;
							var8 = class60.localPlayer.y >> 7;
						}

						var9 = MouseHandler.cameraX >> 7;
						var10 = ObjectSound.cameraZ >> 7;
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
							var5 = TileItemPile.Client_plane;
							break label668;
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
							var5 = TileItemPile.Client_plane;
							break label668;
						}

						if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][var9][var10] & 4) != 0) {
							var6 = TileItemPile.Client_plane;
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

							while (var9 != var7) {
								if (var9 < var7) {
									++var9;
								} else if (var9 > var7) {
									--var9;
								}

								if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][var9][var10] & 4) != 0) {
									var6 = TileItemPile.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var10 < var8) {
										++var10;
									} else if (var10 > var8) {
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][var9][var10] & 4) != 0) {
										var6 = TileItemPile.Client_plane;
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

								if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][var9][var10] & 4) != 0) {
									var6 = TileItemPile.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var9 < var7) {
										++var9;
									} else if (var9 > var7) {
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][var9][var10] & 4) != 0) {
										var6 = TileItemPile.Client_plane;
									}
								}
							}
						}
					}

					if (class60.localPlayer.x >= 0 && class60.localPlayer.y >= 0 && class60.localPlayer.x < 13312 && class60.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[TileItemPile.Client_plane][class60.localPlayer.x >> 7][class60.localPlayer.y >> 7] & 4) != 0) {
							var6 = TileItemPile.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = TileItemPile.Client_plane;
					}
				}
			}

			var28 = var5;
		} else {
			var28 = AbstractArchive.method4411();
		}

		var5 = MouseHandler.cameraX;
		var6 = WorldMapSection3.cameraY;
		var7 = ObjectSound.cameraZ;
		var8 = TilePaint.cameraPitch;
		var9 = Canvas.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field918[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field919[var10] * 2 + 1) - (double)Client.field919[var10] + Math.sin((double)Client.field922[var10] * ((double)Client.field778[var10] / 100.0D)) * (double)Client.field775[var10]);
				if (var10 == 0) {
					MouseHandler.cameraX += var11;
				}

				if (var10 == 1) {
					WorldMapSection3.cameraY += var11;
				}

				if (var10 == 2) {
					ObjectSound.cameraZ += var11;
				}

				if (var10 == 3) {
					Canvas.cameraYaw = var11 + Canvas.cameraYaw & 2047;
				}

				if (var10 == 4) {
					TilePaint.cameraPitch += var11;
					if (TilePaint.cameraPitch < 128) {
						TilePaint.cameraPitch = 128;
					}

					if (TilePaint.cameraPitch > 383) {
						TilePaint.cameraPitch = 383;
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
			var12 = var10 - var0;
			var13 = var11 - var1;
			ViewportMouse.ViewportMouse_x = var12;
			ViewportMouse.ViewportMouse_y = var13;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			WorldMapSection0.method299();
		}

		Timer.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		Timer.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		UserComparator3.scene.draw(MouseHandler.cameraX, WorldMapSection3.cameraY, ObjectSound.cameraZ, TilePaint.cameraPitch, Canvas.cameraYaw, var28);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		Timer.playPcmPlayers();
		UserComparator3.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var33 = false;
		var14 = -1;
		int var15 = -1;
		int var16 = Players.Players_count;
		int[] var17 = Players.Players_indices;

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var19;
			if (var18 < var16) {
				var19 = Client.players[var17[var18]];
				if (var17[var18] == Client.combatTargetPlayerIndex) {
					var33 = true;
					var14 = var18;
					continue;
				}

				if (var19 == class60.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var19 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			Timer.drawActor2d((Actor)var19, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			Timer.drawActor2d(class60.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var33) {
			Timer.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			int var30 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var24 = 0; var24 < var18; ++var24) {
					if (var20 + 2 > Client.overheadTextYs[var24] - Client.overheadTextAscents[var24] && var20 - var22 < Client.overheadTextYs[var24] + 2 && var30 - var21 < Client.overheadTextXOffsets[var24] + Client.overheadTextXs[var24] && var30 + var21 > Client.overheadTextXs[var24] - Client.overheadTextXOffsets[var24] && Client.overheadTextYs[var24] - Client.overheadTextAscents[var24] < var20) {
						var20 = Client.overheadTextYs[var24] - Client.overheadTextAscents[var24];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var31 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field888[Client.overheadTextColors[var18]];
				}

				if (Client.overheadTextColors[var18] == 6) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var18] == 7) {
					var25 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var18] == 8) {
					var25 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var26;
				if (Client.overheadTextColors[var18] == 9) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16776960 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var18] == 10) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = var26 * 5 + 16711680;
					} else if (var26 < 100) {
						var25 = 16711935 - (var26 - 50) * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var18] == 11) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					if (var26 < 50) {
						var25 = 16777215 - var26 * 327685;
					} else if (var26 < 100) {
						var25 = (var26 - 50) * 327685 + 65280;
					} else if (var26 < 150) {
						var25 = 16777215 - (var26 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var18] == 0) {
					GrandExchangeOfferNameComparator.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					GrandExchangeOfferNameComparator.fontBold12.drawCenteredWave(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					GrandExchangeOfferNameComparator.fontBold12.drawCenteredWave2(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					GrandExchangeOfferNameComparator.fontBold12.drawCenteredShake(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (GrandExchangeOfferNameComparator.fontBold12.stringWidth(var31) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					GrandExchangeOfferNameComparator.fontBold12.draw(var31, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var18] == 5) {
					var26 = 150 - Client.overheadTextCyclesRemaining[var18];
					int var27 = 0;
					if (var26 < 25) {
						var27 = var26 - 25;
					} else if (var26 > 125) {
						var27 = var26 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - GrandExchangeOfferNameComparator.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					GrandExchangeOfferNameComparator.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				GrandExchangeOfferNameComparator.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			HealthBar.worldToScreen((Client.hintArrowX - class182.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - SecureRandomFuture.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				SoundSystem.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field747);
		UrlRequest.method3432(var0, var1, var2, var3);
		MouseHandler.cameraX = var5;
		WorldMapSection3.cameraY = var6;
		ObjectSound.cameraZ = var7;
		TilePaint.cameraPitch = var8;
		Canvas.cameraYaw = var9;
		if (Client.isLoading && ModeWhere.method3809(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lhd;I)I",
		garbageValue = "-1756984804"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
