import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class45 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)Lak;",
		garbageValue = "6712"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lnv;",
		garbageValue = "1795857888"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 219
		if (var3.exists()) { // L: 220
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 222
				return var10; // L: 223
			} catch (IOException var9) { // L: 225
			}
		}

		String var4 = ""; // L: 227
		if (JagexCache.cacheGamebuild == 33) { // L: 228
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 229
			var4 = "_wip";
		}

		File var5 = new File(TriBool.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 230
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 231
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 233
				return var6; // L: 234
			} catch (IOException var8) { // L: 236
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 239
			return var6; // L: 240
		} catch (IOException var7) { // L: 242
			throw new RuntimeException(); // L: 243
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "1000"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9322
			EnumComposition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9323
		}

		long var4 = -1L; // L: 9326
		long var6 = -1L; // L: 9327
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 9332
			if (var8 >= var10) { // L: 9334
				if (-1L != var4) { // L: 9464
					var8 = class138.method2827(var4); // L: 9465
					int var9 = (int)(var4 >>> 7 & 127L); // L: 9468
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9471
					GraphicsObject.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 9472
				}

				return; // L: 9474
			}

			long var24 = Player.method2159(var8); // L: 9335
			if (var6 != var24) { // L: 9336
				label330: {
					var6 = var24; // L: 9337
					int var13 = class54.method1111(var8); // L: 9338
					int var14 = TextureProvider.method4518(var8); // L: 9339
					long var17 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9343
					int var16 = (int)(var17 >>> 14 & 3L); // L: 9345
					int var26 = SoundSystem.method787(var8); // L: 9350
					if (var16 == 2 && GameBuild.scene.getObjectFlags(GrandExchangeOfferTotalQuantityComparator.Client_plane, var13, var14, var24) >= 0) { // L: 9351 9352
						ObjectComposition var18 = KitDefinition.getObjectDefinition(var26); // L: 9353
						if (var18.transforms != null) { // L: 9354
							var18 = var18.transform();
						}

						if (var18 == null) { // L: 9355
							break label330;
						}

						if (Client.isItemSelected == 1) { // L: 9356
							EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(65535) + var18.name, 1, var26, var13, var14); // L: 9357
						} else if (Client.isSpellSelected) { // L: 9360
							if ((class116.selectedSpellFlags & 4) == 4) { // L: 9361
								EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(65535) + var18.name, 2, var26, var13, var14); // L: 9362
							}
						} else {
							String[] var19 = var18.actions; // L: 9367
							if (var19 != null) { // L: 9368
								for (int var20 = 4; var20 >= 0; --var20) { // L: 9369
									if (var19[var20] != null) { // L: 9370
										short var21 = 0; // L: 9371
										if (var20 == 0) { // L: 9372
											var21 = 3;
										}

										if (var20 == 1) { // L: 9373
											var21 = 4;
										}

										if (var20 == 2) { // L: 9374
											var21 = 5;
										}

										if (var20 == 3) { // L: 9375
											var21 = 6;
										}

										if (var20 == 4) { // L: 9376
											var21 = 1001;
										}

										EnumComposition.insertMenuItemNoShift(var19[var20], MouseHandler.colorStartTag(65535) + var18.name, var21, var26, var13, var14); // L: 9377
									}
								}
							}

							EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(65535) + var18.name, 1002, var18.id, var13, var14); // L: 9382
						}
					}

					Player var22;
					int var27;
					NPC var28;
					int var35;
					int[] var36;
					if (var16 == 1) { // L: 9387
						NPC var31 = Client.npcs[var26]; // L: 9388
						if (var31 == null) { // L: 9389
							break label330;
						}

						if (var31.definition.size == 1 && (var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 9390
							for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9391
								var28 = Client.npcs[Client.npcIndices[var27]]; // L: 9392
								if (var28 != null && var31 != var28 && var28.definition.size == 1 && var28.x == var31.x && var31.y == var28.y) { // L: 9393
									WorldMapScaleHandler.addNpcToMenu(var28, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count; // L: 9395
							var36 = Players.Players_indices; // L: 9396

							for (var35 = 0; var35 < var27; ++var35) { // L: 9397
								var22 = Client.players[var36[var35]]; // L: 9398
								if (var22 != null && var31.x == var22.x && var22.y == var31.y) { // L: 9399
									GraphicsObject.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						WorldMapScaleHandler.addNpcToMenu(var31, var26, var13, var14); // L: 9402
					}

					if (var16 == 0) { // L: 9404
						Player var32 = Client.players[var26]; // L: 9405
						if (var32 == null) { // L: 9406
							break label330;
						}

						if ((var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 9407
							for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9408
								var28 = Client.npcs[Client.npcIndices[var27]]; // L: 9409
								if (var28 != null && var28.definition.size == 1 && var32.x == var28.x && var32.y == var28.y) { // L: 9410
									WorldMapScaleHandler.addNpcToMenu(var28, Client.npcIndices[var27], var13, var14);
								}
							}

							var27 = Players.Players_count; // L: 9412
							var36 = Players.Players_indices; // L: 9413

							for (var35 = 0; var35 < var27; ++var35) { // L: 9414
								var22 = Client.players[var36[var35]]; // L: 9415
								if (var22 != null && var22 != var32 && var32.x == var22.x && var32.y == var22.y) { // L: 9416
									GraphicsObject.addPlayerToMenu(var22, var36[var35], var13, var14);
								}
							}
						}

						if (var26 != Client.combatTargetPlayerIndex) { // L: 9419
							GraphicsObject.addPlayerToMenu(var32, var26, var13, var14);
						} else {
							var4 = var24; // L: 9420
						}
					}

					if (var16 == 3) { // L: 9422
						NodeDeque var34 = Client.groundItems[GrandExchangeOfferTotalQuantityComparator.Client_plane][var13][var14]; // L: 9423
						if (var34 != null) { // L: 9424
							for (TileItem var33 = (TileItem)var34.first(); var33 != null; var33 = (TileItem)var34.next()) { // L: 9425 9426 9459
								ItemComposition var37 = TaskHandler.ItemDefinition_get(var33.id); // L: 9427
								if (Client.isItemSelected == 1) { // L: 9428
									EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var37.name, 16, var33.id, var13, var14); // L: 9429
								} else if (Client.isSpellSelected) { // L: 9432
									if ((class116.selectedSpellFlags & 1) == 1) { // L: 9433
										EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var37.name, 17, var33.id, var13, var14); // L: 9434
									}
								} else {
									String[] var29 = var37.groundActions; // L: 9439

									for (int var30 = 4; var30 >= 0; --var30) { // L: 9440
										if (var29 != null && var29[var30] != null) { // L: 9441
											byte var23 = 0; // L: 9442
											if (var30 == 0) { // L: 9443
												var23 = 18;
											}

											if (var30 == 1) { // L: 9444
												var23 = 19;
											}

											if (var30 == 2) { // L: 9445
												var23 = 20;
											}

											if (var30 == 3) { // L: 9446
												var23 = 21;
											}

											if (var30 == 4) { // L: 9447
												var23 = 22;
											}

											EnumComposition.insertMenuItemNoShift(var29[var30], MouseHandler.colorStartTag(16748608) + var37.name, var23, var33.id, var13, var14); // L: 9448
										} else if (var30 == 2) { // L: 9451
											EnumComposition.insertMenuItemNoShift("Take", MouseHandler.colorStartTag(16748608) + var37.name, 20, var33.id, var13, var14); // L: 9452
										}
									}

									EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16748608) + var37.name, 1004, var33.id, var13, var14); // L: 9456
								}
							}
						}
					}
				}
			}

			++var8; // L: 9328
		}
	}
}
