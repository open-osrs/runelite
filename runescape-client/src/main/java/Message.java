import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1616463731
	)
	@Export("count")
	int count;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -286699527
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1679180039
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@Export("sender")
	String sender;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("v")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("b")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-87"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1; // L: 25
		this.count = var5; // L: 27
		this.cycle = Client.cycle; // L: 28
		this.type = var1; // L: 29
		this.sender = var2; // L: 30
		this.fillSenderUsername(); // L: 31
		this.prefix = var3; // L: 32
		this.text = var4; // L: 33
		this.clearIsFromFriend(); // L: 34
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1516900151"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "87"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1886823274"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1274568020"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1898664175"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-349189555"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 69
			this.senderUsername = new Username(Canvas.method468(this.sender), ModeWhere.loginType);
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-108"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 513
			var1 /= 2;
		}

		if (var2 > 192) { // L: 514
			var1 /= 2;
		}

		if (var2 > 217) { // L: 515
			var1 /= 2;
		}

		if (var2 > 243) { // L: 516
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 517
		return var3; // L: 518
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-366902049"
	)
	public static final void method1166(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field401 = var0; // L: 50
			ApproximateRouteStrategy.PcmPlayer_stereo = var1; // L: 51
			PcmPlayer.field405 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2128922058"
	)
	@Export("sceneRenderLevel")
	static final int calculateMaxScenePlane() {
		if (class12.clientPreferences.roofsHidden) { // L: 4754
			return ParamComposition.Client_plane;
		} else {
			int var0 = 3; // L: 4755
			if (class1.cameraPitch < 310) { // L: 4756
				label166: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4759
						var1 = HorizontalAlignment.oculusOrbFocalPointX >> 7; // L: 4760
						var2 = class280.oculusOrbFocalPointY >> 7; // L: 4761
					} else {
						var1 = class35.localPlayer.x >> 7; // L: 4764
						var2 = class35.localPlayer.y >> 7; // L: 4765
					}

					int var3 = class20.cameraX >> 7; // L: 4767
					int var4 = WorldMapDecoration.cameraZ >> 7; // L: 4768
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4769
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4770
							if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) { // L: 4771
								var0 = ParamComposition.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4773
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4774
							}

							int var6;
							if (var2 > var4) { // L: 4776
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4777
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4778
								var7 = var6 * 65536 / var5; // L: 4779
								var8 = 32768; // L: 4780

								while (true) {
									if (var1 == var3) { // L: 4781
										break label166;
									}

									if (var3 < var1) { // L: 4782
										++var3;
									} else if (var3 > var1) { // L: 4783
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) { // L: 4784
										var0 = ParamComposition.Client_plane;
									}

									var8 += var7; // L: 4785
									if (var8 >= 65536) { // L: 4786
										var8 -= 65536; // L: 4787
										if (var4 < var2) { // L: 4788
											++var4;
										} else if (var4 > var2) { // L: 4789
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) { // L: 4790
											var0 = ParamComposition.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4794
									var7 = var5 * 65536 / var6; // L: 4795
									var8 = 32768; // L: 4796

									while (var4 != var2) { // L: 4797
										if (var4 < var2) { // L: 4798
											++var4;
										} else if (var4 > var2) { // L: 4799
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) { // L: 4800
											var0 = ParamComposition.Client_plane;
										}

										var8 += var7; // L: 4801
										if (var8 >= 65536) { // L: 4802
											var8 -= 65536; // L: 4803
											if (var3 < var1) { // L: 4804
												++var3;
											} else if (var3 > var1) { // L: 4805
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][var3][var4] & 4) != 0) { // L: 4806
												var0 = ParamComposition.Client_plane;
											}
										}
									}
								}
								break label166;
							}
						}

						return ParamComposition.Client_plane;
					}

					return ParamComposition.Client_plane;
				}
			}

			if (class35.localPlayer.x >= 0 && class35.localPlayer.y >= 0 && class35.localPlayer.x < 13312 && class35.localPlayer.y < 13312) { // L: 4811
				if ((Tiles.Tiles_renderFlags[ParamComposition.Client_plane][class35.localPlayer.x >> 7][class35.localPlayer.y >> 7] & 4) != 0) { // L: 4812
					var0 = ParamComposition.Client_plane;
				}

				return var0; // L: 4813
			} else {
				return ParamComposition.Client_plane;
			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1851837703"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7325
			if (Client.isLowDetail && var0 != ParamComposition.Client_plane) { // L: 7326
				return;
			}

			long var7 = 0L; // L: 7327
			boolean var9 = true; // L: 7328
			boolean var10 = false; // L: 7329
			boolean var11 = false; // L: 7330
			if (var1 == 0) { // L: 7331
				var7 = class5.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7332
				var7 = class5.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7333
				var7 = class5.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7334
				var7 = class5.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7335
				var12 = class5.scene.getObjectFlags(var0, var2, var3, var7); // L: 7336
				int var38 = class6.Entity_unpackID(var7); // L: 7337
				int var39 = var12 & 31; // L: 7338
				int var40 = var12 >> 6 & 3; // L: 7339
				ObjectComposition var13;
				if (var1 == 0) { // L: 7340
					class5.scene.removeBoundaryObject(var0, var2, var3); // L: 7341
					var13 = AttackOption.getObjectDefinition(var38); // L: 7342
					if (var13.interactType != 0) { // L: 7343
						Client.collisionMaps[var0].method3099(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7345
					class5.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7346
					class5.scene.removeGameObject(var0, var2, var3); // L: 7347
					var13 = AttackOption.getObjectDefinition(var38); // L: 7348
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7349
						return;
					}

					if (var13.interactType != 0) { // L: 7350
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7352
					class5.scene.removeFloorDecoration(var0, var2, var3); // L: 7353
					var13 = AttackOption.getObjectDefinition(var38); // L: 7354
					if (var13.interactType == 1) { // L: 7355
						Client.collisionMaps[var0].method3102(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7358
				var12 = var0; // L: 7359
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7360
					var12 = var0 + 1;
				}

				Scene var41 = class5.scene; // L: 7361
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7362
				ObjectComposition var15 = AttackOption.getObjectDefinition(var4); // L: 7364
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7367
					var16 = var15.sizeX; // L: 7372
					var17 = var15.sizeY; // L: 7373
				} else {
					var16 = var15.sizeY; // L: 7368
					var17 = var15.sizeX; // L: 7369
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7379
					var18 = (var16 >> 1) + var2; // L: 7380
					var19 = var2 + (var16 + 1 >> 1); // L: 7381
				} else {
					var18 = var2; // L: 7384
					var19 = var2 + 1; // L: 7385
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7387
					var20 = var3 + (var17 >> 1); // L: 7388
					var21 = var3 + (var17 + 1 >> 1); // L: 7389
				} else {
					var20 = var3; // L: 7392
					var21 = var3 + 1; // L: 7393
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7395
				int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2; // L: 7396
				int var24 = (var2 << 7) + (var16 << 6); // L: 7397
				int var25 = (var3 << 7) + (var17 << 6); // L: 7398
				long var26 = class17.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7399
				int var28 = (var5 << 6) + var6; // L: 7400
				if (var15.int3 == 1) { // L: 7401
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7402
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7404
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7405
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7406
					if (var15.interactType == 1) { // L: 7407
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7410
					if (var6 >= 12) { // L: 7418
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7420
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7421
						}

						var41.method4008(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7422
						if (var15.interactType != 0) { // L: 7423
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7426
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7428
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7429
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1085[var5], 0, var26, var28); // L: 7430
						if (var15.interactType != 0) { // L: 7431
							var14.method3094(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7434
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7436
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7437
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1095[var5], 0, var26, var28); // L: 7438
						if (var15.interactType != 0) { // L: 7439
							var14.method3094(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7442
							var29 = var5 + 1 & 3; // L: 7443
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7446
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7447
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7448
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7451
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7452
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field1085[var5], Tiles.field1085[var29], var26, var28); // L: 7454
							if (var15.interactType != 0) { // L: 7455
								var14.method3094(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7458
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7460
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7461
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1095[var5], 0, var26, var28); // L: 7462
							if (var15.interactType != 0) { // L: 7463
								var14.method3094(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7466
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7468
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7469
							}

							var41.method4008(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7470
							if (var15.interactType != 0) { // L: 7471
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7474
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7476
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7477
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field1085[var5], 0, 0, 0, var26, var28); // L: 7478
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7481
								var29 = 16; // L: 7482
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7483
								if (0L != var30) { // L: 7484
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7486
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7487
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field1085[var5], 0, var29 * Tiles.field1096[var5], var29 * Tiles.field1100[var5], var26, var28); // L: 7488
							} else if (var6 == 6) { // L: 7491
								var29 = 8; // L: 7492
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7493
								if (var30 != 0L) { // L: 7494
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7496
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7497
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1098[var5], var29 * Tiles.field1094[var5], var26, var28); // L: 7498
							} else if (var6 == 7) { // L: 7501
								int var35 = var5 + 2 & 3; // L: 7503
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7504
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7505
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7506
							} else if (var6 == 8) { // L: 7509
								var29 = 8; // L: 7510
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7511
								if (var30 != 0L) { // L: 7512
									var29 = AttackOption.getObjectDefinition(class6.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7515
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7516
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7517
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7518
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7521
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7522
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1098[var5], var29 * Tiles.field1094[var5], var26, var28); // L: 7524
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7412
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.field1761, (Renderable)null); // L: 7413
					}

					if (var36 != null) { // L: 7414
						var41.method4008(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7415
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7529
}
