import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -251371719
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1811324103
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -601207927
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1611852145
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -7858163560617167859L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 339444929
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-66389342"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					Throwable var4 = var1; // L: 36
					String var5;
					if (var1 instanceof RunException) { // L: 39
						RunException var6 = (RunException)var1; // L: 40
						var5 = var6.message + " | "; // L: 41
						var4 = var6.throwable; // L: 42
					} else {
						var5 = ""; // L: 44
					}

					StringWriter var18 = new StringWriter(); // L: 45
					PrintWriter var7 = new PrintWriter(var18); // L: 46
					var4.printStackTrace(var7); // L: 47
					var7.close(); // L: 48
					String var8 = var18.toString(); // L: 49
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 50
					String var10 = var9.readLine(); // L: 51

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 53
							if (var11 == null) { // L: 54
								var5 = var5 + "| " + var10; // L: 72
								var2 = var5; // L: 75
								break label63;
							}

							int var12 = var11.indexOf(40); // L: 55
							int var13 = var11.indexOf(41, var12 + 1); // L: 56
							if (var12 >= 0 && var13 >= 0) { // L: 57
								String var14 = var11.substring(var12 + 1, var13); // L: 58
								int var15 = var14.indexOf(".java:"); // L: 59
								if (var15 >= 0) { // L: 60
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 61
									var5 = var5 + var14 + ' '; // L: 62
									continue; // L: 63
								}

								var11 = var11.substring(0, var12); // L: 65
							}

							var11 = var11.trim(); // L: 67
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 68
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 69
							var5 = var5 + var11 + ' '; // L: 70
						}
					}
				}

				if (var0 != null) { // L: 77
					if (var1 != null) { // L: 78
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 79
				}

				System.out.println("Error: " + var2); // L: 81
				var2 = var2.replace(':', '.'); // L: 82
				var2 = var2.replace('@', '_'); // L: 83
				var2 = var2.replace('&', '_'); // L: 84
				var2 = var2.replace('#', '_'); // L: 85
				if (RunException.RunException_applet == null) { // L: 86
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + class1.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + class134.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2); // L: 87
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 88
				var17.read(); // L: 89
				var17.close(); // L: 90
			} catch (Exception var16) { // L: 92
			}

		}
	} // L: 93

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1835518500"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7316
			if (Client.isLowDetail && var0 != SoundSystem.Client_plane) { // L: 7317
				return;
			}

			long var7 = 0L; // L: 7318
			boolean var9 = true; // L: 7319
			boolean var10 = false; // L: 7320
			boolean var11 = false; // L: 7321
			if (var1 == 0) { // L: 7322
				var7 = Decimator.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7323
				var7 = Decimator.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7324
				var7 = Decimator.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7325
				var7 = Decimator.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7326
				var12 = Decimator.scene.getObjectFlags(var0, var2, var3, var7); // L: 7327
				int var38 = Skeleton.Entity_unpackID(var7); // L: 7328
				int var39 = var12 & 31; // L: 7329
				int var40 = var12 >> 6 & 3; // L: 7330
				ObjectComposition var13;
				if (var1 == 0) { // L: 7331
					Decimator.scene.removeBoundaryObject(var0, var2, var3); // L: 7332
					var13 = ParamComposition.getObjectDefinition(var38); // L: 7333
					if (var13.interactType != 0) { // L: 7334
						Client.collisionMaps[var0].method3653(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7336
					Decimator.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7337
					Decimator.scene.removeGameObject(var0, var2, var3); // L: 7338
					var13 = ParamComposition.getObjectDefinition(var38); // L: 7339
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7340
						return;
					}

					if (var13.interactType != 0) { // L: 7341
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7343
					Decimator.scene.removeFloorDecoration(var0, var2, var3); // L: 7344
					var13 = ParamComposition.getObjectDefinition(var38); // L: 7345
					if (var13.interactType == 1) { // L: 7346
						Client.collisionMaps[var0].method3656(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7349
				var12 = var0; // L: 7350
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7351
					var12 = var0 + 1;
				}

				Scene var41 = Decimator.scene; // L: 7352
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7353
				ObjectComposition var15 = ParamComposition.getObjectDefinition(var4); // L: 7355
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7358
					var16 = var15.sizeX; // L: 7363
					var17 = var15.sizeY; // L: 7364
				} else {
					var16 = var15.sizeY; // L: 7359
					var17 = var15.sizeX; // L: 7360
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7370
					var18 = (var16 >> 1) + var2; // L: 7371
					var19 = var2 + (var16 + 1 >> 1); // L: 7372
				} else {
					var18 = var2; // L: 7375
					var19 = var2 + 1; // L: 7376
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7378
					var20 = var3 + (var17 >> 1); // L: 7379
					var21 = var3 + (var17 + 1 >> 1); // L: 7380
				} else {
					var20 = var3; // L: 7383
					var21 = var3 + 1; // L: 7384
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7386
				int var23 = var22[var19][var21] + var22[var19][var20] + var22[var18][var20] + var22[var18][var21] >> 2; // L: 7387
				int var24 = (var2 << 7) + (var16 << 6); // L: 7388
				int var25 = (var3 << 7) + (var17 << 6); // L: 7389
				long var26 = ScriptEvent.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7390
				int var28 = (var5 << 6) + var6; // L: 7391
				if (var15.int3 == 1) { // L: 7392
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7393
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7395
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7396
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7397
					if (var15.interactType == 1) { // L: 7398
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7401
					if (var6 >= 12) { // L: 7409
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7411
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7412
						}

						var41.method4027(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7413
						if (var15.interactType != 0) { // L: 7414
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7417
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7419
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7420
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field999[var5], 0, var26, var28); // L: 7421
						if (var15.interactType != 0) { // L: 7422
							var14.method3651(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7425
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7427
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7428
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1000[var5], 0, var26, var28); // L: 7429
						if (var15.interactType != 0) { // L: 7430
							var14.method3651(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7433
							var29 = var5 + 1 & 3; // L: 7434
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7437
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7438
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7439
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7442
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7443
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field999[var5], Tiles.field999[var29], var26, var28); // L: 7445
							if (var15.interactType != 0) { // L: 7446
								var14.method3651(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7449
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7451
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7452
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1000[var5], 0, var26, var28); // L: 7453
							if (var15.interactType != 0) { // L: 7454
								var14.method3651(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7457
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7459
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7460
							}

							var41.method4027(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7461
							if (var15.interactType != 0) { // L: 7462
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7465
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7467
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7468
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field999[var5], 0, 0, 0, var26, var28); // L: 7469
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7472
								var29 = 16; // L: 7473
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7474
								if (0L != var30) { // L: 7475
									var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7477
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7478
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field999[var5], 0, var29 * Tiles.field1001[var5], var29 * Tiles.field1002[var5], var26, var28); // L: 7479
							} else if (var6 == 6) { // L: 7482
								var29 = 8; // L: 7483
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7484
								if (0L != var30) { // L: 7485
									var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7487
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7488
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1003[var5], var29 * Tiles.field1005[var5], var26, var28); // L: 7489
							} else if (var6 == 7) { // L: 7492
								int var35 = var5 + 2 & 3; // L: 7494
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7495
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7496
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7497
							} else if (var6 == 8) { // L: 7500
								var29 = 8; // L: 7501
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7502
								if (0L != var30) { // L: 7503
									var29 = ParamComposition.getObjectDefinition(Skeleton.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7506
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7507
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7508
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7509
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7512
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7513
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1003[var5], var29 * Tiles.field1005[var5], var26, var28); // L: 7515
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7403
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7404
					}

					if (var36 != null) { // L: 7405
						var41.method4027(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7406
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7520
}
