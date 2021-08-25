import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static IndexedSprite field1312;
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;B)I",
		garbageValue = "-77"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("c")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class320.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "739349389"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1021871509"
	)
	static int method2398(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				Interpreter.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + EnumComposition.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					long var13 = 86400000L * ((long)var10 + 11745L);
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Interpreter.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = WorldMapEvent.method3949(class122.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class323.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class240.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var11 = class391.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class240.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var11 = class391.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var9;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Players.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class29.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = FaceNormal.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class240.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
					if (class129.localPlayer.appearance != null && class129.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-37"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class129.localPlayer.x >> 7 == Client.destinationX && class129.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		WorldMapLabelSize.method3387();
		GrandExchangeOfferOwnWorldComparator.method1134();
		ClanMate.addNpcsToScene(true);
		DynamicObject.method1955();
		ClanMate.addNpcsToScene(false);

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) {
			if (var4.plane == class391.Client_plane && Client.cycle <= var4.cycleEnd) {
				if (Client.cycle >= var4.cycleStart) {
					if (var4.targetIndex > 0) {
						NPC var31 = Client.npcs[var4.targetIndex - 1];
						if (var31 != null && var31.x >= 0 && var31.x < 13312 && var31.y >= 0 && var31.y < 13312) {
							var4.setDestination(var31.x, var31.y, GraphicsObject.getTileHeight(var31.x, var31.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) {
						var6 = -var4.targetIndex - 1;
						Player var34;
						if (var6 == Client.localPlayerIndex) {
							var34 = class129.localPlayer;
						} else {
							var34 = Client.players[var6];
						}

						if (var34 != null && var34.x >= 0 && var34.x < 13312 && var34.y >= 0 && var34.y < 13312) {
							var4.setDestination(var34.x, var34.y, GraphicsObject.getTileHeight(var34.x, var34.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field764);
					CollisionMap.scene.drawEntity(class391.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false);
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var32 = (GraphicsObject)Client.graphicsObjects.last(); var32 != null; var32 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var32.plane == class391.Client_plane && !var32.isFinished) {
				if (Client.cycle >= var32.cycleStart) {
					var32.advance(Client.field764);
					if (var32.isFinished) {
						var32.remove();
					} else {
						CollisionMap.scene.drawEntity(var32.plane, var32.x, var32.y, var32.height, 60, var32, 0, -1L, false);
					}
				}
			} else {
				var32.remove();
			}
		}

		class9.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var5;
		int var28;
		if (!Client.isCameraLocked) {
			var28 = Client.camAngleX;
			if (Client.field483 / 256 > var28) {
				var28 = Client.field483 / 256;
			}

			if (Client.field736[4] && Client.field738[4] + 128 > var28) {
				var28 = Client.field738[4] + 128;
			}

			var5 = Client.camAngleY & 2047;
			class1.method14(WorldMapID.oculusOrbFocalPointX, ClanSettings.field1473, WorldMapRectangle.oculusOrbFocalPointY, var28, var5, AccessFile.method6644(var28), var3);
		}

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) {
			if (VarbitComposition.clientPreferences.roofsHidden) {
				var5 = class391.Client_plane;
			} else {
				label650: {
					var6 = 3;
					if (ApproximateRouteStrategy.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var7 = WorldMapID.oculusOrbFocalPointX >> 7;
							var8 = WorldMapRectangle.oculusOrbFocalPointY >> 7;
						} else {
							var7 = class129.localPlayer.x >> 7;
							var8 = class129.localPlayer.y >> 7;
						}

						var9 = WorldMapSection2.cameraX >> 7;
						var10 = DevicePcmPlayerProvider.cameraZ >> 7;
						if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
							var5 = class391.Client_plane;
							break label650;
						}

						if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
							var5 = class391.Client_plane;
							break label650;
						}

						if ((Tiles.Tiles_renderFlags[class391.Client_plane][var9][var10] & 4) != 0) {
							var6 = class391.Client_plane;
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

								if ((Tiles.Tiles_renderFlags[class391.Client_plane][var9][var10] & 4) != 0) {
									var6 = class391.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var10 < var8) {
										++var10;
									} else if (var10 > var8) {
										--var10;
									}

									if ((Tiles.Tiles_renderFlags[class391.Client_plane][var9][var10] & 4) != 0) {
										var6 = class391.Client_plane;
									}
								}
							}
						} else if (var12 > 0) {
							var13 = var11 * 65536 / var12;
							var14 = 32768;

							while (var8 != var10) {
								if (var10 < var8) {
									++var10;
								} else if (var10 > var8) {
									--var10;
								}

								if ((Tiles.Tiles_renderFlags[class391.Client_plane][var9][var10] & 4) != 0) {
									var6 = class391.Client_plane;
								}

								var14 += var13;
								if (var14 >= 65536) {
									var14 -= 65536;
									if (var9 < var7) {
										++var9;
									} else if (var9 > var7) {
										--var9;
									}

									if ((Tiles.Tiles_renderFlags[class391.Client_plane][var9][var10] & 4) != 0) {
										var6 = class391.Client_plane;
									}
								}
							}
						}
					}

					if (class129.localPlayer.x >= 0 && class129.localPlayer.y >= 0 && class129.localPlayer.x < 13312 && class129.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[class391.Client_plane][class129.localPlayer.x >> 7][class129.localPlayer.y >> 7] & 4) != 0) {
							var6 = class391.Client_plane;
						}

						var5 = var6;
					} else {
						var5 = class391.Client_plane;
					}
				}
			}

			var28 = var5;
		} else {
			if (VarbitComposition.clientPreferences.roofsHidden) {
				var5 = class391.Client_plane;
			} else {
				var6 = GraphicsObject.getTileHeight(WorldMapSection2.cameraX, DevicePcmPlayerProvider.cameraZ, class391.Client_plane);
				if (var6 - SpotAnimationDefinition.cameraY < 800 && (Tiles.Tiles_renderFlags[class391.Client_plane][WorldMapSection2.cameraX >> 7][DevicePcmPlayerProvider.cameraZ >> 7] & 4) != 0) {
					var5 = class391.Client_plane;
				} else {
					var5 = 3;
				}
			}

			var28 = var5;
		}

		var5 = WorldMapSection2.cameraX;
		var6 = SpotAnimationDefinition.cameraY;
		var7 = DevicePcmPlayerProvider.cameraZ;
		var8 = ApproximateRouteStrategy.cameraPitch;
		var9 = Fonts.cameraYaw;

		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field736[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field484[var10] * 2 + 1) - (double)Client.field484[var10] + Math.sin((double)Client.field686[var10] / 100.0D * (double)Client.field740[var10]) * (double)Client.field738[var10]);
				if (var10 == 0) {
					WorldMapSection2.cameraX += var11;
				}

				if (var10 == 1) {
					SpotAnimationDefinition.cameraY += var11;
				}

				if (var10 == 2) {
					DevicePcmPlayerProvider.cameraZ += var11;
				}

				if (var10 == 3) {
					Fonts.cameraYaw = var11 + Fonts.cameraYaw & 2047;
				}

				if (var10 == 4) {
					ApproximateRouteStrategy.cameraPitch += var11;
					if (ApproximateRouteStrategy.cameraPitch < 128) {
						ApproximateRouteStrategy.cameraPitch = 128;
					}

					if (ApproximateRouteStrategy.cameraPitch > 383) {
						ApproximateRouteStrategy.cameraPitch = 383;
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
			class133.method2654();
		}

		class1.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class1.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		CollisionMap.scene.draw(WorldMapSection2.cameraX, SpotAnimationDefinition.cameraY, DevicePcmPlayerProvider.cameraZ, ApproximateRouteStrategy.cameraPitch, Fonts.cameraYaw, var28);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		class1.playPcmPlayers();
		CollisionMap.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var33 = false;
		var14 = -1;
		int var15 = -1;
		int var16 = Players.Players_count;
		int[] var17 = Players.Players_indices;

		int var18;
		for (var18 = 0; var18 < var16 + Client.npcCount; ++var18) {
			Object var30;
			if (var18 < var16) {
				var30 = Client.players[var17[var18]];
				if (var17[var18] == Client.combatTargetPlayerIndex) {
					var33 = true;
					var14 = var18;
					continue;
				}

				if (var30 == class129.localPlayer) {
					var15 = var18;
					continue;
				}
			} else {
				var30 = Client.npcs[Client.npcIndices[var18 - var16]];
			}

			class17.drawActor2d((Actor)var30, var18, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var15 != -1) {
			class17.drawActor2d(class129.localPlayer, var15, var0, var1, var2, var3);
		}

		if (var33) {
			class17.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var14, var0, var1, var2, var3);
		}

		for (var18 = 0; var18 < Client.overheadTextCount; ++var18) {
			int var19 = Client.overheadTextXs[var18];
			int var20 = Client.overheadTextYs[var18];
			int var21 = Client.overheadTextXOffsets[var18];
			int var22 = Client.overheadTextAscents[var18];
			boolean var23 = true;

			while (var23) {
				var23 = false;

				for (int var29 = 0; var29 < var18; ++var29) {
					if (var20 + 2 > Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] && var20 - var22 < Client.overheadTextYs[var29] + 2 && var19 - var21 < Client.overheadTextXs[var29] + Client.overheadTextXOffsets[var29] && var21 + var19 > Client.overheadTextXs[var29] - Client.overheadTextXOffsets[var29] && Client.overheadTextYs[var29] - Client.overheadTextAscents[var29] < var20) {
						var20 = Client.overheadTextYs[var29] - Client.overheadTextAscents[var29];
						var23 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var18];
			Client.viewportTempY = Client.overheadTextYs[var18] = var20;
			String var24 = Client.overheadText[var18];
			if (Client.chatEffects == 0) {
				int var25 = 16776960;
				if (Client.overheadTextColors[var18] < 6) {
					var25 = Client.field707[Client.overheadTextColors[var18]];
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
					class11.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0);
				}

				if (Client.overheadTextEffects[var18] == 1) {
					class11.fontBold12.drawCenteredWave(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 2) {
					class11.fontBold12.drawCenteredWave2(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var18] == 3) {
					class11.fontBold12.drawCenteredShake(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, var25, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var18]);
				}

				if (Client.overheadTextEffects[var18] == 4) {
					var26 = (150 - Client.overheadTextCyclesRemaining[var18]) * (class11.fontBold12.stringWidth(var24) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class11.fontBold12.draw(var24, var0 + Client.viewportTempX + 50 - var26, Client.viewportTempY + var1, var25, 0);
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

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class11.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class11.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, var27 + Client.viewportTempY + var1, var25, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class11.fontBold12.drawCentered(var24, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			Login.worldToScreen((Client.hintArrowX - FloorOverlayDefinition.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - class320.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class7.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field764);
		GameBuild.method5073(var0, var1, var2, var3);
		WorldMapSection2.cameraX = var5;
		SpotAnimationDefinition.cameraY = var6;
		DevicePcmPlayerProvider.cameraZ = var7;
		ApproximateRouteStrategy.cameraPitch = var8;
		Fonts.cameraYaw = var9;
		if (Client.isLoading && Strings.method5088(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			WorldMapData_1.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
