import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ae")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -212739847
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1897982075
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1681555037
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1263884987
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;B)V",
		garbageValue = "-1"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field292.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method5851(); // L: 28
			super.fileId = var1.method5851(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field196 = new byte[super.planes][64][64]; // L: 36
		super.field187 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class39.field285.value) { // L: 40
			throw new IllegalStateException(""); // L: 41
		} else {
			int var3 = var1.readUnsignedByte(); // L: 43
			int var4 = var1.readUnsignedByte(); // L: 44
			int var5 = var1.readUnsignedByte(); // L: 45
			int var6 = var1.readUnsignedByte(); // L: 46
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 47
				for (int var7 = 0; var7 < 8; ++var7) { // L: 50
					for (int var8 = 0; var8 < 8; ++var8) { // L: 51
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 52
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 48
			}
		}
	} // L: 55

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-810889585"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "65"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "936777914"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 62
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-984950165"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 129
		var2.size = var0.readUnsignedByte(); // L: 130
		var2.id = var0.readInt(); // L: 131
		var2.operations = new int[var2.size]; // L: 132
		var2.creationErrors = new int[var2.size]; // L: 133
		var2.fields = new Field[var2.size]; // L: 134
		var2.intReplaceValues = new int[var2.size]; // L: 135
		var2.methods = new Method[var2.size]; // L: 136
		var2.arguments = new byte[var2.size][][]; // L: 137

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 138
			try {
				int var4 = var0.readUnsignedByte(); // L: 140
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 141
					if (var4 == 3 || var4 == 4) { // L: 151
						var5 = var0.readStringCp1252NullTerminated(); // L: 152
						var6 = var0.readStringCp1252NullTerminated(); // L: 153
						var7 = var0.readUnsignedByte(); // L: 154
						String[] var8 = new String[var7]; // L: 155

						for (int var9 = 0; var9 < var7; ++var9) { // L: 156
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 157
						byte[][] var10 = new byte[var7][]; // L: 158
						int var12;
						if (var4 == 3) { // L: 159
							for (int var11 = 0; var11 < var7; ++var11) { // L: 160
								var12 = var0.readInt(); // L: 161
								var10[var11] = new byte[var12]; // L: 162
								var0.readBytes(var10[var11], 0, var12); // L: 163
							}
						}

						var2.operations[var3] = var4; // L: 166
						Class[] var21 = new Class[var7]; // L: 167

						for (var12 = 0; var12 < var7; ++var12) { // L: 168
							var21[var12] = Archive.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = Archive.loadClassFromDescriptor(var20); // L: 169
						if (Archive.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 170
							throw new SecurityException();
						}

						Method[] var13 = Archive.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 171
						Method[] var14 = var13; // L: 173

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 174
							Method var16 = var14[var15]; // L: 175
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 177
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 178
								if (var17.length == var21.length) { // L: 179
									boolean var18 = true; // L: 180

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 181
										if (var21[var19] != var17[var19]) { // L: 182
											var18 = false; // L: 183
											break; // L: 184
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 187
										var2.methods[var3] = var16; // L: 188
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 195
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 142
					var6 = var0.readStringCp1252NullTerminated(); // L: 143
					var7 = 0; // L: 144
					if (var4 == 1) { // L: 145
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 146
					var2.intReplaceValues[var3] = var7; // L: 147
					if (Archive.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 148
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(Archive.loadClassFromDescriptor(var5), var6); // L: 149
				}
			} catch (ClassNotFoundException var24) { // L: 198
				var2.creationErrors[var3] = -1; // L: 199
			} catch (SecurityException var25) { // L: 201
				var2.creationErrors[var3] = -2; // L: 202
			} catch (NullPointerException var26) { // L: 204
				var2.creationErrors[var3] = -3; // L: 205
			} catch (Exception var27) { // L: 207
				var2.creationErrors[var3] = -4; // L: 208
			} catch (Throwable var28) { // L: 210
				var2.creationErrors[var3] = -5; // L: 211
			}
		}

		class105.reflectionChecks.addFirst(var2); // L: 214
	} // L: 215

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lks;IB)V",
		garbageValue = "0"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 362
		if (var2) { // L: 363
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 364
		Player var4 = Client.players[var1]; // L: 365
		if (var3 == 0) { // L: 366
			if (var2) { // L: 367
				var4.field664 = false; // L: 368
			} else if (Client.localPlayerIndex == var1) { // L: 371
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (FloorDecoration.baseX + var4.pathX[0] >> 13 << 14) + (WorldMapData_0.baseY + var4.pathY[0] >> 13); // L: 372
				if (var4.field1003 != -1) { // L: 373
					Players.Players_orientations[var1] = var4.field1003;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 374
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 375
				Client.players[var1] = null; // L: 376
				if (var0.readBits(1) != 0) { // L: 377
					class9.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 380
				var5 = var0.readBits(3); // L: 381
				var6 = var4.pathX[0]; // L: 382
				var7 = var4.pathY[0]; // L: 383
				if (var5 == 0) { // L: 384
					--var6; // L: 385
					--var7; // L: 386
				} else if (var5 == 1) { // L: 388
					--var7;
				} else if (var5 == 2) { // L: 389
					++var6; // L: 390
					--var7; // L: 391
				} else if (var5 == 3) { // L: 393
					--var6;
				} else if (var5 == 4) { // L: 394
					++var6;
				} else if (var5 == 5) { // L: 395
					--var6; // L: 396
					++var7; // L: 397
				} else if (var5 == 6) { // L: 399
					++var7;
				} else if (var5 == 7) { // L: 400
					++var6; // L: 401
					++var7; // L: 402
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 404
					var4.resetPath(var6, var7); // L: 405
					var4.field664 = false; // L: 406
				} else if (var2) { // L: 408
					var4.field664 = true; // L: 409
					var4.tileX = var6; // L: 410
					var4.tileY = var7; // L: 411
				} else {
					var4.field664 = false; // L: 414
					var4.method1335(var6, var7, Players.field1295[var1]); // L: 415
				}

			} else if (var3 == 2) { // L: 419
				var5 = var0.readBits(4); // L: 420
				var6 = var4.pathX[0]; // L: 421
				var7 = var4.pathY[0]; // L: 422
				if (var5 == 0) { // L: 423
					var6 -= 2; // L: 424
					var7 -= 2; // L: 425
				} else if (var5 == 1) { // L: 427
					--var6; // L: 428
					var7 -= 2; // L: 429
				} else if (var5 == 2) { // L: 431
					var7 -= 2;
				} else if (var5 == 3) { // L: 432
					++var6; // L: 433
					var7 -= 2; // L: 434
				} else if (var5 == 4) { // L: 436
					var6 += 2; // L: 437
					var7 -= 2; // L: 438
				} else if (var5 == 5) { // L: 440
					var6 -= 2; // L: 441
					--var7; // L: 442
				} else if (var5 == 6) { // L: 444
					var6 += 2; // L: 445
					--var7; // L: 446
				} else if (var5 == 7) { // L: 448
					var6 -= 2;
				} else if (var5 == 8) { // L: 449
					var6 += 2;
				} else if (var5 == 9) { // L: 450
					var6 -= 2; // L: 451
					++var7; // L: 452
				} else if (var5 == 10) { // L: 454
					var6 += 2; // L: 455
					++var7; // L: 456
				} else if (var5 == 11) { // L: 458
					var6 -= 2; // L: 459
					var7 += 2; // L: 460
				} else if (var5 == 12) { // L: 462
					--var6; // L: 463
					var7 += 2; // L: 464
				} else if (var5 == 13) { // L: 466
					var7 += 2;
				} else if (var5 == 14) { // L: 467
					++var6; // L: 468
					var7 += 2; // L: 469
				} else if (var5 == 15) { // L: 471
					var6 += 2; // L: 472
					var7 += 2; // L: 473
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 475
					if (var2) { // L: 479
						var4.field664 = true; // L: 480
						var4.tileX = var6; // L: 481
						var4.tileY = var7; // L: 482
					} else {
						var4.field664 = false; // L: 485
						var4.method1335(var6, var7, Players.field1295[var1]); // L: 486
					}
				} else {
					var4.resetPath(var6, var7); // L: 476
					var4.field664 = false; // L: 477
				}

			} else {
				var5 = var0.readBits(1); // L: 490
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 491
					var6 = var0.readBits(12); // L: 492
					var7 = var6 >> 10; // L: 493
					var8 = var6 >> 5 & 31; // L: 494
					if (var8 > 15) { // L: 495
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 496
					if (var9 > 15) { // L: 497
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 498
					var11 = var9 + var4.pathY[0]; // L: 499
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 500
						var4.resetPath(var10, var11); // L: 501
						var4.field664 = false; // L: 502
					} else if (var2) { // L: 504
						var4.field664 = true; // L: 505
						var4.tileX = var10; // L: 506
						var4.tileY = var11; // L: 507
					} else {
						var4.field664 = false; // L: 510
						var4.method1335(var10, var11, Players.field1295[var1]); // L: 511
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 513
					if (Client.localPlayerIndex == var1) { // L: 514
						GrandExchangeOfferUnitPriceComparator.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 517
					var7 = var6 >> 28; // L: 518
					var8 = var6 >> 14 & 16383; // L: 519
					var9 = var6 & 16383; // L: 520
					var10 = (var8 + FloorDecoration.baseX + var4.pathX[0] & 16383) - FloorDecoration.baseX; // L: 521
					var11 = (var9 + WorldMapData_0.baseY + var4.pathY[0] & 16383) - WorldMapData_0.baseY; // L: 522
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 523
						var4.resetPath(var10, var11); // L: 524
						var4.field664 = false; // L: 525
					} else if (var2) { // L: 527
						var4.field664 = true; // L: 528
						var4.tileX = var10; // L: 529
						var4.tileY = var11; // L: 530
					} else {
						var4.field664 = false; // L: 533
						var4.method1335(var10, var11, Players.field1295[var1]); // L: 534
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 536
					if (Client.localPlayerIndex == var1) { // L: 537
						GrandExchangeOfferUnitPriceComparator.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 369 378 417 488 515 538

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-218590717"
	)
	static void method817(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILhw;ZI)V",
		garbageValue = "2083872008"
	)
	static void method796(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = Canvas.getWorldMap().getMapArea(var0); // L: 3851
		int var4 = PlayerType.localPlayer.plane; // L: 3852
		int var5 = (PlayerType.localPlayer.x >> 7) + FloorDecoration.baseX; // L: 3853
		int var6 = (PlayerType.localPlayer.y >> 7) + WorldMapData_0.baseY; // L: 3854
		Coord var7 = new Coord(var4, var5, var6); // L: 3855
		Canvas.getWorldMap().method6470(var3, var7, var1, var2); // L: 3856
	} // L: 3857
}
