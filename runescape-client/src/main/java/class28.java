import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class28 {
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -2075417739
	)
	static int field170;
	@ObfuscatedName("u")
	static int[][] field169;
	@ObfuscatedName("l")
	public static short[] field167;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive20")
	static Archive archive20;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;I)I",
		garbageValue = "535006753"
	)
	static int method408(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field869;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field892;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1137494946"
	)
	public static boolean method402(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("l")
	static final void method401(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-85"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class413.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class413.SpriteBuffer_xOffsets = new int[class413.SpriteBuffer_spriteCount];
		class413.SpriteBuffer_yOffsets = new int[class413.SpriteBuffer_spriteCount];
		InvDefinition.SpriteBuffer_spriteWidths = new int[class413.SpriteBuffer_spriteCount];
		class413.SpriteBuffer_spriteHeights = new int[class413.SpriteBuffer_spriteCount];
		class283.SpriteBuffer_pixels = new byte[class413.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class413.SpriteBuffer_spriteCount * 8;
		class413.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class413.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class413.SpriteBuffer_spriteCount; ++var3) {
			class413.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class413.SpriteBuffer_spriteCount; ++var3) {
			class413.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class413.SpriteBuffer_spriteCount; ++var3) {
			InvDefinition.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class413.SpriteBuffer_spriteCount; ++var3) {
			class413.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class413.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		ItemContainer.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			ItemContainer.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (ItemContainer.SpriteBuffer_spritePalette[var3] == 0) {
				ItemContainer.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class413.SpriteBuffer_spriteCount; ++var3) {
			int var4 = InvDefinition.SpriteBuffer_spriteWidths[var3];
			int var5 = class413.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class283.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935126444"
	)
	static final int method410() {
		return Client.menuOptionsCount - 1;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "972424034"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			ModelData0.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = class275.method5066(var4);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					ArchiveLoader.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
				}

				return;
			}

			long var24 = class123.method2536(var8);
			if (var24 != var6) {
				label327: {
					var6 = var24;
					int var13 = class87.method2183(var8);
					int var14 = WorldMapIcon_0.method3732(var8);
					long var17 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var16 = (int)(var17 >>> 14 & 3L);
					int var26 = Tile.method4043(var8);
					if (var16 == 2 && CollisionMap.scene.getObjectFlags(class391.Client_plane, var13, var14, var24) >= 0) {
						ObjectComposition var18 = HitSplatDefinition.getObjectDefinition(var26);
						if (var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 == null) {
							break label327;
						}

						if (Client.isItemSelected == 1) {
							ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class54.colorStartTag(65535) + var18.name, 1, var26, var13, var14);
						} else if (Client.isSpellSelected) {
							if ((ScriptFrame.selectedSpellFlags & 4) == 4) {
								ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class54.colorStartTag(65535) + var18.name, 2, var26, var13, var14);
							}
						} else {
							String[] var19 = var18.actions;
							if (var19 != null) {
								for (int var20 = 4; var20 >= 0; --var20) {
									if (var19[var20] != null) {
										short var21 = 0;
										if (var20 == 0) {
											var21 = 3;
										}

										if (var20 == 1) {
											var21 = 4;
										}

										if (var20 == 2) {
											var21 = 5;
										}

										if (var20 == 3) {
											var21 = 6;
										}

										if (var20 == 4) {
											var21 = 1001;
										}

										ModelData0.insertMenuItemNoShift(var19[var20], class54.colorStartTag(65535) + var18.name, var21, var26, var13, var14);
									}
								}
							}

							ModelData0.insertMenuItemNoShift("Examine", class54.colorStartTag(65535) + var18.name, 1002, var18.id, var13, var14);
						}
					}

					Player var22;
					int var27;
					NPC var28;
					int var35;
					int[] var36;
					if (var16 == 1) {
						NPC var31 = Client.npcs[var26];
						if (var31 == null) {
							break label327;
						}

						if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var28 = Client.npcs[Client.npcIndices[var27]];
								if (var28 != null && var31 != var28 && var28.definition.size == 1 && var31.x == var28.x && var31.y == var28.y) {
									ArchiveLoader.addNpcToMenu(var28.definition, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var35 = 0; var35 < var27; ++var35) {
								var22 = Client.players[var36[var35]];
								if (var22 != null && var31.x == var22.x && var22.y == var31.y) {
									ArchiveLoader.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						ArchiveLoader.addNpcToMenu(var31.definition, var26, var13, var14);
					}

					if (var16 == 0) {
						Player var32 = Client.players[var26];
						if (var32 == null) {
							break label327;
						}

						if ((var32.x & 127) == 64 && (var32.y & 127) == 64) {
							for (var27 = 0; var27 < Client.npcCount; ++var27) {
								var28 = Client.npcs[Client.npcIndices[var27]];
								if (var28 != null && var28.definition.size == 1 && var28.x == var32.x && var32.y == var28.y) {
									ArchiveLoader.addNpcToMenu(var28.definition, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count;
							var36 = Players.Players_indices;

							for (var35 = 0; var35 < var27; ++var35) {
								var22 = Client.players[var36[var35]];
								if (var22 != null && var32 != var22 && var22.x == var32.x && var22.y == var32.y) {
									ArchiveLoader.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						if (var26 != Client.combatTargetPlayerIndex) {
							ArchiveLoader.addPlayerToMenu(var32, var26, var13, var14);
						} else {
							var4 = var24;
						}
					}

					if (var16 == 3) {
						NodeDeque var34 = Client.groundItems[class391.Client_plane][var13][var14];
						if (var34 != null) {
							for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) {
								ItemComposition var37 = class65.ItemDefinition_get(var33.id);
								if (Client.isItemSelected == 1) {
									ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class54.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14);
								} else if (Client.isSpellSelected) {
									if ((ScriptFrame.selectedSpellFlags & 1) == 1) {
										ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class54.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14);
									}
								} else {
									String[] var29 = var37.groundActions;

									for (int var30 = 4; var30 >= 0; --var30) {
										if (var29 != null && var29[var30] != null) {
											byte var23 = 0;
											if (var30 == 0) {
												var23 = 18;
											}

											if (var30 == 1) {
												var23 = 19;
											}

											if (var30 == 2) {
												var23 = 20;
											}

											if (var30 == 3) {
												var23 = 21;
											}

											if (var30 == 4) {
												var23 = 22;
											}

											ModelData0.insertMenuItemNoShift(var29[var30], class54.colorStartTag(16748608) + var37.name, var23, var33.id, var13, var14);
										} else if (var30 == 2) {
											ModelData0.insertMenuItemNoShift("Take", class54.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14);
										}
									}

									ModelData0.insertMenuItemNoShift("Examine", class54.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "61"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class317.loadInterface(var0)) {
			PcmPlayer.field280 = null;
			class396.drawInterface(class139.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (PcmPlayer.field280 != null) {
				class396.drawInterface(PcmPlayer.field280, -1412584499, var1, var2, var3, var4, TextureProvider.field2464, class29.field177, var7);
				PcmPlayer.field280 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field697[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field697[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IB)Ljava/lang/String;",
		garbageValue = "-37"
	)
	static String method405(Widget var0, int var1) {
		if (!Decimator.method1050(Decimator.getWidgetFlags(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
