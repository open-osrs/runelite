import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("t")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("i")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lmz;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("r")
	public static String field2094;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1010534169"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 8289
			StructDefinition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 8290
		}

		long var4 = -1L; // L: 8293
		long var6 = -1L; // L: 8294
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 8299
			if (var8 >= var10) { // L: 8301
				if (var4 != -1L) { // L: 8444
					var8 = TileItem.Entity_unpackSceneX(var4); // L: 8445
					int var9 = (int)(var4 >>> 7 & 127L); // L: 8448
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 8451
					VarpDefinition.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 8452
				}

				return; // L: 8454
			}

			long var27 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8304
			if (var6 != var27) { // L: 8307
				label326: {
					var6 = var27; // L: 8308
					int var15 = WorldMapIcon_1.getSceneXForObjectUnderMouse(var8); // L: 8309
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8313
					int var17 = (int)(var18 >>> 7 & 127L); // L: 8315
					var17 = var17; // L: 8319
					long var20 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 8323
					int var19 = (int)(var20 >>> 14 & 3L); // L: 8325
					int var30 = Frames.getEntityIdUnderMouse(var8); // L: 8330
					if (var19 == 2 && ScriptEvent.scene.getObjectFlags(Huffman.Client_plane, var15, var17, var27) >= 0) { // L: 8331 8332
						ObjectDefinition var21 = MidiPcmStream.getObjectDefinition(var30); // L: 8333
						if (var21.transforms != null) { // L: 8334
							var21 = var21.transform();
						}

						if (var21 == null) { // L: 8335
							break label326;
						}

						if (Client.isItemSelected == 1) { // L: 8336
							StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(65535) + var21.name, 1, var30, var15, var17); // L: 8337
						} else if (Client.isSpellSelected) { // L: 8340
							if ((UserComparator8.selectedSpellFlags & 4) == 4) { // L: 8341
								StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(65535) + var21.name, 2, var30, var15, var17); // L: 8342
							}
						} else {
							String[] var22 = var21.actions; // L: 8347
							if (var22 != null) { // L: 8348
								for (int var23 = 4; var23 >= 0; --var23) { // L: 8349
									if (var22[var23] != null) { // L: 8350
										short var24 = 0; // L: 8351
										if (var23 == 0) { // L: 8352
											var24 = 3;
										}

										if (var23 == 1) { // L: 8353
											var24 = 4;
										}

										if (var23 == 2) { // L: 8354
											var24 = 5;
										}

										if (var23 == 3) { // L: 8355
											var24 = 6;
										}

										if (var23 == 4) { // L: 8356
											var24 = 1001;
										}

										StructDefinition.insertMenuItemNoShift(var22[var23], WorldMapAreaData.colorStartTag(65535) + var21.name, var24, var30, var15, var17); // L: 8357
									}
								}
							}

							StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(65535) + var21.name, 1002, var21.id, var15, var17); // L: 8362
						}
					}

					Player var25;
					int var31;
					NPC var32;
					int var39;
					int[] var40;
					if (var19 == 1) { // L: 8367
						NPC var35 = Client.npcs[var30]; // L: 8368
						if (var35 == null) { // L: 8369
							break label326;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) { // L: 8370
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 8371
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 8372
								if (var32 != null && var35 != var32 && var32.definition.size == 1 && var35.x == var32.x && var35.y == var32.y) { // L: 8373
									GrandExchangeEvents.addNpcToMenu(var32.definition, Client.npcIndices[var31], var15, var17);
								}
							}

							var31 = Players.Players_count; // L: 8375
							var40 = Players.Players_indices; // L: 8376

							for (var39 = 0; var39 < var31; ++var39) { // L: 8377
								var25 = Client.players[var40[var39]]; // L: 8378
								if (var25 != null && var35.x == var25.x && var25.y == var35.y) { // L: 8379
									VarpDefinition.addPlayerToMenu(var25, var40[var39], var15, var17);
								}
							}
						}

						GrandExchangeEvents.addNpcToMenu(var35.definition, var30, var15, var17); // L: 8382
					}

					if (var19 == 0) { // L: 8384
						Player var36 = Client.players[var30]; // L: 8385
						if (var36 == null) { // L: 8386
							break label326;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) { // L: 8387
							for (var31 = 0; var31 < Client.npcCount; ++var31) { // L: 8388
								var32 = Client.npcs[Client.npcIndices[var31]]; // L: 8389
								if (var32 != null && var32.definition.size == 1 && var32.x == var36.x && var36.y == var32.y) { // L: 8390
									GrandExchangeEvents.addNpcToMenu(var32.definition, Client.npcIndices[var31], var15, var17);
								}
							}

							var31 = Players.Players_count; // L: 8392
							var40 = Players.Players_indices; // L: 8393

							for (var39 = 0; var39 < var31; ++var39) { // L: 8394
								var25 = Client.players[var40[var39]]; // L: 8395
								if (var25 != null && var36 != var25 && var25.x == var36.x && var36.y == var25.y) { // L: 8396
									VarpDefinition.addPlayerToMenu(var25, var40[var39], var15, var17);
								}
							}
						}

						if (var30 != Client.combatTargetPlayerIndex) { // L: 8399
							VarpDefinition.addPlayerToMenu(var36, var30, var15, var17);
						} else {
							var4 = var27; // L: 8400
						}
					}

					if (var19 == 3) { // L: 8402
						NodeDeque var38 = Client.groundItems[Huffman.Client_plane][var15][var17]; // L: 8403
						if (var38 != null) { // L: 8404
							for (TileItem var37 = (TileItem)var38.first(); var37 != null; var37 = (TileItem)var38.next()) { // L: 8405 8406 8439
								ItemDefinition var41 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var37.id); // L: 8407
								if (Client.isItemSelected == 1) { // L: 8408
									StructDefinition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var41.name, 16, var37.id, var15, var17); // L: 8409
								} else if (Client.isSpellSelected) { // L: 8412
									if ((UserComparator8.selectedSpellFlags & 1) == 1) { // L: 8413
										StructDefinition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldMapAreaData.colorStartTag(16748608) + var41.name, 17, var37.id, var15, var17); // L: 8414
									}
								} else {
									String[] var33 = var41.groundActions; // L: 8419

									for (int var34 = 4; var34 >= 0; --var34) { // L: 8420
										if (var33 != null && var33[var34] != null) { // L: 8421
											byte var26 = 0; // L: 8422
											if (var34 == 0) { // L: 8423
												var26 = 18;
											}

											if (var34 == 1) { // L: 8424
												var26 = 19;
											}

											if (var34 == 2) { // L: 8425
												var26 = 20;
											}

											if (var34 == 3) { // L: 8426
												var26 = 21;
											}

											if (var34 == 4) { // L: 8427
												var26 = 22;
											}

											StructDefinition.insertMenuItemNoShift(var33[var34], WorldMapAreaData.colorStartTag(16748608) + var41.name, var26, var37.id, var15, var17); // L: 8428
										} else if (var34 == 2) { // L: 8431
											StructDefinition.insertMenuItemNoShift("Take", WorldMapAreaData.colorStartTag(16748608) + var41.name, 20, var37.id, var15, var17); // L: 8432
										}
									}

									StructDefinition.insertMenuItemNoShift("Examine", WorldMapAreaData.colorStartTag(16748608) + var41.name, 1004, var37.id, var15, var17); // L: 8436
								}
							}
						}
					}
				}
			}

			++var8; // L: 8295
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "68"
	)
	public static boolean method3576() {
		return Client.staffModLevel >= 2; // L: 10872
	}
}
