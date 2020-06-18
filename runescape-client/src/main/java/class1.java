import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
final class class1 implements class0 {
	@ObfuscatedName("go")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkn;B)V",
		garbageValue = "0"
	)
	public void vmethod59(Object var1, Buffer var2) {
		this.method8((Integer)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;B)Ljava/lang/Object;",
		garbageValue = "114"
	)
	public Object vmethod47(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Integer;Lkn;I)V",
		garbageValue = "554078910"
	)
	void method8(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmr;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-345681310"
	)
	static void method16(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field1103) {
					var5 += var1 - var4.field1103;
				} else if (var1 < var4.x) {
					var5 += var4.x - var1;
				}

				if (var2 > var4.field1104) {
					var5 += var2 - var4.field1104;
				} else if (var2 < var4.y) {
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field1105 && Client.areaSoundEffectVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field1105 - var5) * Client.areaSoundEffectVolume / var4.field1105;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(GrandExchangeOffer.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(class197.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								class60.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method2677(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field1111 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(GrandExchangeOffer.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(class197.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								class60.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field1111 = var4.field1108 + (int)(Math.random() * (double)(var4.field1115 - var4.field1108));
							}
						}
					} else {
						var4.stream2.method2677(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						class60.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						class60.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(CLgz;I)I",
		garbageValue = "393583355"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "25"
	)
	static final int method17() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		signature = "(Lhd;III)V",
		garbageValue = "45098661"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var8 * var4 + var7 * var5 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = var9 + class60.localPlayer.x >> 7;
					int var12 = class60.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = UserComparator4.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShort(var12 + SecureRandomFuture.baseY);
					var13.packetBuffer.writeShort(var11 + class182.baseX);
					var13.packetBuffer.method5744(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class60.localPlayer.x);
					var13.packetBuffer.writeShort(class60.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		signature = "(IIIIIIII)V",
		garbageValue = "1438850851"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != TileItemPile.Client_plane) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = UserComparator3.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = UserComparator3.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = UserComparator3.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = UserComparator3.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) {
				var12 = UserComparator3.scene.getObjectFlags(var0, var2, var3, var7);
				int var39 = Language.Entity_unpackID(var7);
				int var40 = var12 & 31;
				int var41 = var12 >> 6 & 3;
				ObjectDefinition var13;
				if (var1 == 0) {
					UserComparator3.scene.removeBoundaryObject(var0, var2, var3);
					var13 = Canvas.getObjectDefinition(var39);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3702(var2, var3, var40, var41, var13.boolean1);
					}
				}

				if (var1 == 1) {
					UserComparator3.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					UserComparator3.scene.removeGameObject(var0, var2, var3);
					var13 = Canvas.getObjectDefinition(var39);
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var41, var13.boolean1);
					}
				}

				if (var1 == 3) {
					UserComparator3.scene.removeFloorDecoration(var0, var2, var3);
					var13 = Canvas.getObjectDefinition(var39);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3689(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var12 = var0 + 1;
				}

				Scene var42 = UserComparator3.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectDefinition var15 = Canvas.getObjectDefinition(var4);
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + (var16 + 1 >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + (var17 + 1 >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = var22[var18][var21] + var22[var18][var20] + var22[var19][var20] + var22[var19][var21] >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = class206.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var29;
				if (var6 == 22) {
					if (var15.animationId == -1 && var15.transforms == null) {
						var29 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var29 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
					}

					var42.newFloorDecoration(var0, var2, var3, var23, (Entity)var29, var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
						}

						var42.method3356(var0, var2, var3, var23, 1, 1, (Entity)var29, 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
						}

						var42.newBoundaryObject(var0, var2, var3, var23, (Entity)var29, (Entity)null, Tiles.field527[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3680(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if (var15.animationId == -1 && var15.transforms == null) {
							var29 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var29 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
						}

						var42.newBoundaryObject(var0, var2, var3, var23, (Entity)var29, (Entity)null, Tiles.field528[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3680(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var35;
						if (var6 == 2) {
							var35 = var5 + 1 & 3;
							Object var30;
							Object var31;
							if (var15.animationId == -1 && var15.transforms == null) {
								var30 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var35, var22, var24, var23, var25);
							} else {
								var30 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
								var31 = new DynamicObject(var4, 2, var35, var12, var2, var3, var15.animationId, true, (Entity)null);
							}

							var42.newBoundaryObject(var0, var2, var3, var23, (Entity)var30, (Entity)var31, Tiles.field527[var5], Tiles.field527[var35], var26, var28);
							if (var15.interactType != 0) {
								var14.method3680(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
							}

							var42.newBoundaryObject(var0, var2, var3, var23, (Entity)var29, (Entity)null, Tiles.field528[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3680(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
							}

							var42.method3356(var0, var2, var3, var23, 1, 1, (Entity)var29, 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if (var15.animationId == -1 && var15.transforms == null) {
								var29 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var29 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
							}

							var42.newWallDecoration(var0, var2, var3, var23, (Entity)var29, (Entity)null, Tiles.field527[var5], 0, 0, 0, var26, var28);
						} else {
							Object var32;
							long var36;
							if (var6 == 5) {
								var35 = 16;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (var36 != 0L) {
									var35 = Canvas.getObjectDefinition(Language.Entity_unpackID(var36)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)null, Tiles.field527[var5], 0, var35 * Tiles.field523[var5], var35 * Tiles.field529[var5], var26, var28);
							} else if (var6 == 6) {
								var35 = 8;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (var36 != 0L) {
									var35 = Canvas.getObjectDefinition(Language.Entity_unpackID(var36)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)null, 256, var5, var35 * Tiles.field531[var5], var35 * Tiles.field533[var5], var26, var28);
							} else if (var6 == 7) {
								int var38 = var5 + 2 & 3;
								if (var15.animationId == -1 && var15.transforms == null) {
									var29 = var15.getModel(4, var38 + 4, var22, var24, var23, var25);
								} else {
									var29 = new DynamicObject(var4, 4, var38 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Entity)var29, (Entity)null, 256, var38, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var35 = 8;
								var36 = var42.getBoundaryObjectTag(var0, var2, var3);
								if (var36 != 0L) {
									var35 = Canvas.getObjectDefinition(Language.Entity_unpackID(var36)).int2 / 2;
								}

								int var34 = var5 + 2 & 3;
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
								}

								var42.newWallDecoration(var0, var2, var3, var23, (Entity)var32, (Entity)var33, 256, var5, var35 * Tiles.field531[var5], var35 * Tiles.field533[var5], var26, var28);
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) {
						var29 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var29 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
					}

					if (var29 != null) {
						var42.method3356(var0, var2, var3, var23, var16, var17, (Entity)var29, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-569208973"
	)
	static final void method7(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field813[var4] = true;
			}
		}

	}
}
