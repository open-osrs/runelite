import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -493270791
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -153786259
	)
	final int field2012;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1953042663
	)
	final int field2014;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -635469781
	)
	final int field2010;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2012 = var1;
		this.field2014 = var2;
		this.field2010 = var3;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1395291796"
	)
	boolean method3447(float var1) {
		return var1 >= (float)this.field2010;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lem;",
		garbageValue = "1099508444"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	public static void method3446() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1948532333"
	)
	static final void method3448() {
		MouseRecorder.method2075(false);
		Client.field764 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class28.regionLandArchives.length; ++var1) {
			if (Canvas.regionMapArchiveIds[var1] != -1 && class28.regionLandArchives[var1] == null) {
				class28.regionLandArchives[var1] = ApproximateRouteStrategy.archive5.takeFile(Canvas.regionMapArchiveIds[var1], 0);
				if (class28.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field764;
				}
			}

			if (GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var1] != -1 && Client.regionMapArchives[var1] == null) {
				Client.regionMapArchives[var1] = ApproximateRouteStrategy.archive5.takeFileEncrypted(GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var1], 0, ModeWhere.xteaKeys[var1]);
				if (Client.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field764;
				}
			}
		}

		if (!var0) {
			Client.field534 = 1;
		} else {
			Client.field545 = 0;
			var0 = true;

			int var4;
			int var57;
			for (var1 = 0; var1 < class28.regionLandArchives.length; ++var1) {
				byte[] var2 = Client.regionMapArchives[var1];
				if (var2 != null) {
					var57 = (class129.regions[var1] >> 8) * 64 - WorldMapSectionType.baseX;
					var4 = (class129.regions[var1] & 255) * 64 - PlayerComposition.baseY;
					if (Client.isInInstance) {
						var57 = 10;
						var4 = 10;
					}

					var0 &= class130.method2682(var2, var57, var4);
				}
			}

			if (!var0) {
				Client.field534 = 2;
			} else {
				if (Client.field534 != 0) {
					ScriptFrame.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class356.playPcmPlayers();
				PlayerComposition.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var49;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var49 = 0; var49 < 104; ++var49) {
						for (var57 = 0; var57 < 104; ++var57) {
							Tiles.Tiles_renderFlags[var1][var49][var57] = 0;
						}
					}
				}

				class356.playPcmPlayers();
				Tiles.Tiles_minPlane = 99;
				Tiles.Tiles_underlays = new byte[4][104][104];
				Tiles.Tiles_overlays = new byte[4][104][104];
				class14.Tiles_shapes = new byte[4][104][104];
				GrandExchangeEvent.field3760 = new byte[4][104][104];
				Huffman.field3203 = new int[4][105][105];
				class281.field3323 = new byte[4][105][105];
				Tiles.field981 = new int[105][105];
				class11.Tiles_hue = new int[104];
				Tiles.Tiles_saturation = new int[104];
				Tiles.Tiles_lightness = new int[104];
				Client.Tiles_hueMultiplier = new int[104];
				Tiles.field984 = new int[104];
				var1 = class28.regionLandArchives.length;

				for (ObjectSound var68 = (ObjectSound)ObjectSound.objectSounds.last(); var68 != null; var68 = (ObjectSound)ObjectSound.objectSounds.previous()) {
					if (var68.stream1 != null) {
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var68.stream1);
						var68.stream1 = null;
					}

					if (var68.stream2 != null) {
						ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var68.stream2);
						var68.stream2 = null;
					}
				}

				ObjectSound.objectSounds.clear();
				MouseRecorder.method2075(true);
				int var5;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (!Client.isInInstance) {
					byte[] var50;
					for (var49 = 0; var49 < var1; ++var49) {
						var57 = (class129.regions[var49] >> 8) * 64 - WorldMapSectionType.baseX;
						var4 = (class129.regions[var49] & 255) * 64 - PlayerComposition.baseY;
						var50 = class28.regionLandArchives[var49];
						if (var50 != null) {
							class356.playPcmPlayers();
							WorldMapEvent.method4018(var50, var57, var4, HealthBarDefinition.field1671 * 8 - 48, WorldMapArea.field2053 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var49 = 0; var49 < var1; ++var49) {
						var57 = (class129.regions[var49] >> 8) * 64 - WorldMapSectionType.baseX;
						var4 = (class129.regions[var49] & 255) * 64 - PlayerComposition.baseY;
						var50 = class28.regionLandArchives[var49];
						if (var50 == null && WorldMapArea.field2053 < 800) {
							class356.playPcmPlayers();
							MouseHandler.method586(var57, var4, 64, 64);
						}
					}

					MouseRecorder.method2075(true);

					for (var49 = 0; var49 < var1; ++var49) {
						byte[] var3 = Client.regionMapArchives[var49];
						if (var3 != null) {
							var4 = (class129.regions[var49] >> 8) * 64 - WorldMapSectionType.baseX;
							var5 = (class129.regions[var49] & 255) * 64 - PlayerComposition.baseY;
							class356.playPcmPlayers();
							Scene var64 = PlayerComposition.scene;
							CollisionMap[] var65 = Client.collisionMaps;
							Buffer var66 = new Buffer(var3);
							var9 = -1;

							while (true) {
								var10 = var66.method7037();
								if (var10 == 0) {
									break;
								}

								var9 += var10;
								var11 = 0;

								while (true) {
									var12 = var66.readUShortSmart();
									if (var12 == 0) {
										break;
									}

									var11 += var12 - 1;
									var13 = var11 & 63;
									var14 = var11 >> 6 & 63;
									var15 = var11 >> 12;
									var16 = var66.readUnsignedByte();
									var17 = var16 >> 2;
									var18 = var16 & 3;
									var19 = var14 + var4;
									var20 = var13 + var5;
									if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
										var21 = var15;
										if ((Tiles.Tiles_renderFlags[1][var19][var20] & 2) == 2) {
											var21 = var15 - 1;
										}

										CollisionMap var67 = null;
										if (var21 >= 0) {
											var67 = var65[var21];
										}

										class7.method64(var15, var19, var20, var9, var18, var17, var64, var67);
									}
								}
							}
						}
					}
				}

				int var6;
				int var7;
				int var8;
				int[] var10000;
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				int var27;
				int var28;
				int var29;
				int var32;
				int var33;
				int var34;
				int var35;
				int var36;
				int var41;
				int var42;
				int var43;
				int var44;
				int var45;
				int var53;
				int var54;
				if (Client.isInInstance) {
					CollisionMap[] var56;
					Buffer var59;
					for (var49 = 0; var49 < 4; ++var49) {
						class356.playPcmPlayers();

						for (var57 = 0; var57 < 13; ++var57) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var71 = false;
								var6 = Client.instanceChunkTemplates[var49][var57][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class129.regions.length; ++var12) {
										if (class129.regions[var12] == var11 && class28.regionLandArchives[var12] != null) {
											byte[] var63 = class28.regionLandArchives[var12];
											var14 = var57 * 8;
											var15 = var4 * 8;
											var16 = (var9 & 7) * 8;
											var17 = (var10 & 7) * 8;
											var56 = Client.collisionMaps;

											for (var19 = 0; var19 < 8; ++var19) {
												for (var20 = 0; var20 < 8; ++var20) {
													if (var14 + var19 > 0 && var14 + var19 < 103 && var15 + var20 > 0 && var20 + var15 < 103) {
														var10000 = var56[var49].flags[var19 + var14];
														var10000[var20 + var15] &= -16777217;
													}
												}
											}

											var59 = new Buffer(var63);

											for (var20 = 0; var20 < 4; ++var20) {
												for (var21 = 0; var21 < 64; ++var21) {
													for (var22 = 0; var22 < 64; ++var22) {
														if (var20 == var7 && var21 >= var16 && var21 < var16 + 8 && var22 >= var17 && var22 < var17 + 8) {
															VarpDefinition.loadTerrain(var59, var49, var14 + EnumComposition.method2998(var21 & 7, var22 & 7, var8), var15 + Canvas.method374(var21 & 7, var22 & 7, var8), 0, 0, var8);
														} else {
															VarpDefinition.loadTerrain(var59, 0, -1, -1, 0, 0, 0);
														}
													}
												}
											}

											var71 = true;
											break;
										}
									}
								}

								if (!var71) {
									var7 = var49;
									var8 = var57 * 8;
									var9 = var4 * 8;

									for (var10 = 0; var10 < 8; ++var10) {
										for (var11 = 0; var11 < 8; ++var11) {
											Tiles.Tiles_heights[var7][var8 + var10][var9 + var11] = 0;
										}
									}

									if (var8 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var7][var8][var10 + var9] = Tiles.Tiles_heights[var7][var8 - 1][var9 + var10];
										}
									}

									if (var9 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var7][var10 + var8][var9] = Tiles.Tiles_heights[var7][var8 + var10][var9 - 1];
										}
									}

									if (var8 > 0 && Tiles.Tiles_heights[var7][var8 - 1][var9] != 0) {
										Tiles.Tiles_heights[var7][var8][var9] = Tiles.Tiles_heights[var7][var8 - 1][var9];
									} else if (var9 > 0 && Tiles.Tiles_heights[var7][var8][var9 - 1] != 0) {
										Tiles.Tiles_heights[var7][var8][var9] = Tiles.Tiles_heights[var7][var8][var9 - 1];
									} else if (var8 > 0 && var9 > 0 && Tiles.Tiles_heights[var7][var8 - 1][var9 - 1] != 0) {
										Tiles.Tiles_heights[var7][var8][var9] = Tiles.Tiles_heights[var7][var8 - 1][var9 - 1];
									}
								}
							}
						}
					}

					for (var49 = 0; var49 < 13; ++var49) {
						for (var57 = 0; var57 < 13; ++var57) {
							var4 = Client.instanceChunkTemplates[0][var49][var57];
							if (var4 == -1) {
								MouseHandler.method586(var49 * 8, var57 * 8, 8, 8);
							}
						}
					}

					MouseRecorder.method2075(true);

					for (var49 = 0; var49 < 4; ++var49) {
						class356.playPcmPlayers();

						for (var57 = 0; var57 < 13; ++var57) {
							label1200:
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var49][var57][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class129.regions.length; ++var11) {
										if (class129.regions[var11] == var10 && Client.regionMapArchives[var11] != null) {
											byte[] var58 = Client.regionMapArchives[var11];
											var13 = var57 * 8;
											var14 = var4 * 8;
											var15 = (var8 & 7) * 8;
											var16 = (var9 & 7) * 8;
											Scene var55 = PlayerComposition.scene;
											var56 = Client.collisionMaps;
											var59 = new Buffer(var58);
											var20 = -1;

											while (true) {
												var21 = var59.method7037();
												if (var21 == 0) {
													continue label1200;
												}

												var20 += var21;
												var22 = 0;

												while (true) {
													var23 = var59.readUShortSmart();
													if (var23 == 0) {
														break;
													}

													var22 += var23 - 1;
													var24 = var22 & 63;
													var25 = var22 >> 6 & 63;
													var26 = var22 >> 12;
													var27 = var59.readUnsignedByte();
													var28 = var27 >> 2;
													var29 = var27 & 3;
													if (var26 == var6 && var25 >= var15 && var25 < var15 + 8 && var24 >= var16 && var24 < var16 + 8) {
														ObjectComposition var60 = class245.getObjectDefinition(var20);
														var33 = var25 & 7;
														var34 = var24 & 7;
														var36 = var60.sizeX;
														int var61 = var60.sizeY;
														if ((var29 & 1) == 1) {
															var53 = var36;
															var36 = var61;
															var61 = var53;
														}

														var35 = var7 & 3;
														if (var35 == 0) {
															var32 = var33;
														} else if (var35 == 1) {
															var32 = var34;
														} else if (var35 == 2) {
															var32 = 7 - var33 - (var36 - 1);
														} else {
															var32 = 7 - var34 - (var61 - 1);
														}

														var53 = var13 + var32;
														var41 = var25 & 7;
														var42 = var24 & 7;
														var44 = var60.sizeX;
														var45 = var60.sizeY;
														int var46;
														if ((var29 & 1) == 1) {
															var46 = var44;
															var44 = var45;
															var45 = var46;
														}

														var43 = var7 & 3;
														if (var43 == 0) {
															var54 = var42;
														} else if (var43 == 1) {
															var54 = 7 - var41 - (var44 - 1);
														} else if (var43 == 2) {
															var54 = 7 - var42 - (var45 - 1);
														} else {
															var54 = var41;
														}

														var46 = var54 + var14;
														if (var53 > 0 && var46 > 0 && var53 < 103 && var46 < 103) {
															int var47 = var49;
															if ((Tiles.Tiles_renderFlags[1][var53][var46] & 2) == 2) {
																var47 = var49 - 1;
															}

															CollisionMap var48 = null;
															if (var47 >= 0) {
																var48 = var56[var47];
															}

															class7.method64(var49, var53, var46, var20, var29 + var7 & 3, var28, var55, var48);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

				MouseRecorder.method2075(true);
				class356.playPcmPlayers();
				Scene var69 = PlayerComposition.scene;
				CollisionMap[] var70 = Client.collisionMaps;

				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						for (var6 = 0; var6 < 104; ++var6) {
							if ((Tiles.Tiles_renderFlags[var4][var5][var6] & 1) == 1) {
								var7 = var4;
								if ((Tiles.Tiles_renderFlags[1][var5][var6] & 2) == 2) {
									var7 = var4 - 1;
								}

								if (var7 >= 0) {
									var70[var7].setBlockedByFloor(var5, var6);
								}
							}
						}
					}
				}

				Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.rndHue < -8) {
					Tiles.rndHue = -8;
				}

				if (Tiles.rndHue > 8) {
					Tiles.rndHue = 8;
				}

				Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.rndLightness < -16) {
					Tiles.rndLightness = -16;
				}

				if (Tiles.rndLightness > 16) {
					Tiles.rndLightness = 16;
				}

				for (var4 = 0; var4 < 4; ++var4) {
					byte[][] var75 = class281.field3323[var4];
					var11 = (int)Math.sqrt(5100.0D);
					var12 = var11 * 768 >> 8;

					for (var13 = 1; var13 < 103; ++var13) {
						for (var14 = 1; var14 < 103; ++var14) {
							var15 = Tiles.Tiles_heights[var4][var14 + 1][var13] - Tiles.Tiles_heights[var4][var14 - 1][var13];
							var16 = Tiles.Tiles_heights[var4][var14][var13 + 1] - Tiles.Tiles_heights[var4][var14][var13 - 1];
							var17 = (int)Math.sqrt((double)(var15 * var15 + var16 * var16 + 65536));
							var18 = (var15 << 8) / var17;
							var19 = 65536 / var17;
							var20 = (var16 << 8) / var17;
							var21 = (var20 * -50 + var18 * -50 + var19 * -10) / var12 + 96;
							var22 = (var75[var14][var13 + 1] >> 3) + (var75[var14 - 1][var13] >> 2) + (var75[var14][var13 - 1] >> 2) + (var75[var14 + 1][var13] >> 3) + (var75[var14][var13] >> 1);
							Tiles.field981[var14][var13] = var21 - var22;
						}
					}

					for (var13 = 0; var13 < 104; ++var13) {
						class11.Tiles_hue[var13] = 0;
						Tiles.Tiles_saturation[var13] = 0;
						Tiles.Tiles_lightness[var13] = 0;
						Client.Tiles_hueMultiplier[var13] = 0;
						Tiles.field984[var13] = 0;
					}

					for (var13 = -5; var13 < 109; ++var13) {
						for (var14 = 0; var14 < 104; ++var14) {
							var15 = var13 + 5;
							int var10002;
							if (var15 >= 0 && var15 < 104) {
								var16 = Tiles.Tiles_underlays[var4][var15][var14] & 255;
								if (var16 > 0) {
									FloorUnderlayDefinition var78 = HealthBar.method2214(var16 - 1);
									var10000 = class11.Tiles_hue;
									var10000[var14] += var78.hue;
									var10000 = Tiles.Tiles_saturation;
									var10000[var14] += var78.saturation;
									var10000 = Tiles.Tiles_lightness;
									var10000[var14] += var78.lightness;
									var10000 = Client.Tiles_hueMultiplier;
									var10000[var14] += var78.hueMultiplier;
									var10002 = Tiles.field984[var14]++;
								}
							}

							var16 = var13 - 5;
							if (var16 >= 0 && var16 < 104) {
								var17 = Tiles.Tiles_underlays[var4][var16][var14] & 255;
								if (var17 > 0) {
									FloorUnderlayDefinition var79 = HealthBar.method2214(var17 - 1);
									var10000 = class11.Tiles_hue;
									var10000[var14] -= var79.hue;
									var10000 = Tiles.Tiles_saturation;
									var10000[var14] -= var79.saturation;
									var10000 = Tiles.Tiles_lightness;
									var10000[var14] -= var79.lightness;
									var10000 = Client.Tiles_hueMultiplier;
									var10000[var14] -= var79.hueMultiplier;
									var10002 = Tiles.field984[var14]--;
								}
							}
						}

						if (var13 >= 1 && var13 < 103) {
							var14 = 0;
							var15 = 0;
							var16 = 0;
							var17 = 0;
							var18 = 0;

							for (var19 = -5; var19 < 109; ++var19) {
								var20 = var19 + 5;
								if (var20 >= 0 && var20 < 104) {
									var14 += class11.Tiles_hue[var20];
									var15 += Tiles.Tiles_saturation[var20];
									var16 += Tiles.Tiles_lightness[var20];
									var17 += Client.Tiles_hueMultiplier[var20];
									var18 += Tiles.field984[var20];
								}

								var21 = var19 - 5;
								if (var21 >= 0 && var21 < 104) {
									var14 -= class11.Tiles_hue[var21];
									var15 -= Tiles.Tiles_saturation[var21];
									var16 -= Tiles.Tiles_lightness[var21];
									var17 -= Client.Tiles_hueMultiplier[var21];
									var18 -= Tiles.field984[var21];
								}

								if (var19 >= 1 && var19 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var13][var19] & 2) != 0 || (Tiles.Tiles_renderFlags[var4][var13][var19] & 16) == 0)) {
									if (var4 < Tiles.Tiles_minPlane) {
										Tiles.Tiles_minPlane = var4;
									}

									var22 = Tiles.Tiles_underlays[var4][var13][var19] & 255;
									var23 = Tiles.Tiles_overlays[var4][var13][var19] & 255;
									if (var22 > 0 || var23 > 0) {
										var24 = Tiles.Tiles_heights[var4][var13][var19];
										var25 = Tiles.Tiles_heights[var4][var13 + 1][var19];
										var26 = Tiles.Tiles_heights[var4][var13 + 1][var19 + 1];
										var27 = Tiles.Tiles_heights[var4][var13][var19 + 1];
										var28 = Tiles.field981[var13][var19];
										var29 = Tiles.field981[var13 + 1][var19];
										int var30 = Tiles.field981[var13 + 1][var19 + 1];
										int var31 = Tiles.field981[var13][var19 + 1];
										var32 = -1;
										var33 = -1;
										if (var22 > 0) {
											var34 = var14 * 256 / var17;
											var35 = var15 / var18;
											var36 = var16 / var18;
											var32 = NPCComposition.hslToRgb(var34, var35, var36);
											var34 = var34 + Tiles.rndHue & 255;
											var36 += Tiles.rndLightness;
											if (var36 < 0) {
												var36 = 0;
											} else if (var36 > 255) {
												var36 = 255;
											}

											var33 = NPCComposition.hslToRgb(var34, var35, var36);
										}

										FloorOverlayDefinition var37;
										if (var4 > 0) {
											boolean var73 = true;
											if (var22 == 0 && class14.Tiles_shapes[var4][var13][var19] != 0) {
												var73 = false;
											}

											if (var23 > 0) {
												var36 = var23 - 1;
												var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var36);
												FloorOverlayDefinition var52;
												if (var37 != null) {
													var52 = var37;
												} else {
													byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var36);
													var37 = new FloorOverlayDefinition();
													if (var38 != null) {
														var37.decode(new Buffer(var38), var36);
													}

													var37.postDecode();
													FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var36);
													var52 = var37;
												}

												if (!var52.hideUnderlay) {
													var73 = false;
												}
											}

											if (var73 && var25 == var24 && var26 == var24 && var27 == var24) {
												var10000 = Huffman.field3203[var4][var13];
												var10000[var19] |= 2340;
											}
										}

										var34 = 0;
										if (var33 != -1) {
											var34 = Rasterizer3D.Rasterizer3D_colorPalette[class128.method2663(var33, 96)];
										}

										if (var23 == 0) {
											var69.addTile(var4, var13, var19, 0, 0, -1, var24, var25, var26, var27, class128.method2663(var32, var28), class128.method2663(var32, var29), class128.method2663(var32, var30), class128.method2663(var32, var31), 0, 0, 0, 0, var34, 0);
										} else {
											var35 = class14.Tiles_shapes[var4][var13][var19] + 1;
											byte var74 = GrandExchangeEvent.field3760[var4][var13][var19];
											var53 = var23 - 1;
											FloorOverlayDefinition var39 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var53);
											if (var39 != null) {
												var37 = var39;
											} else {
												byte[] var40 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var53);
												var39 = new FloorOverlayDefinition();
												if (var40 != null) {
													var39.decode(new Buffer(var40), var53);
												}

												var39.postDecode();
												FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var39, (long)var53);
												var37 = var39;
											}

											var54 = var37.texture;
											if (var54 >= 0) {
												var42 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var54);
												var41 = -1;
											} else if (var37.primaryRgb == 16711935) {
												var41 = -2;
												var54 = -1;
												var42 = -2;
											} else {
												var41 = NPCComposition.hslToRgb(var37.hue, var37.saturation, var37.lightness);
												var43 = var37.hue + Tiles.rndHue & 255;
												var44 = var37.lightness + Tiles.rndLightness;
												if (var44 < 0) {
													var44 = 0;
												} else if (var44 > 255) {
													var44 = 255;
												}

												var42 = NPCComposition.hslToRgb(var43, var37.saturation, var44);
											}

											var43 = 0;
											if (var42 != -2) {
												var43 = Rasterizer3D.Rasterizer3D_colorPalette[MouseHandler.method612(var42, 96)];
											}

											if (var37.secondaryRgb != -1) {
												var44 = var37.secondaryHue + Tiles.rndHue & 255;
												var45 = var37.secondaryLightness + Tiles.rndLightness;
												if (var45 < 0) {
													var45 = 0;
												} else if (var45 > 255) {
													var45 = 255;
												}

												var42 = NPCComposition.hslToRgb(var44, var37.secondarySaturation, var45);
												var43 = Rasterizer3D.Rasterizer3D_colorPalette[MouseHandler.method612(var42, 96)];
											}

											var69.addTile(var4, var13, var19, var35, var74, var54, var24, var25, var26, var27, class128.method2663(var32, var28), class128.method2663(var32, var29), class128.method2663(var32, var30), class128.method2663(var32, var31), MouseHandler.method612(var41, var28), MouseHandler.method612(var41, var29), MouseHandler.method612(var41, var30), MouseHandler.method612(var41, var31), var34, var43);
										}
									}
								}
							}
						}
					}

					for (var13 = 1; var13 < 103; ++var13) {
						for (var14 = 1; var14 < 103; ++var14) {
							if ((Tiles.Tiles_renderFlags[var4][var14][var13] & 8) != 0) {
								var19 = 0;
							} else if (var4 > 0 && (Tiles.Tiles_renderFlags[1][var14][var13] & 2) != 0) {
								var19 = var4 - 1;
							} else {
								var19 = var4;
							}

							var69.setTileMinPlane(var4, var14, var13, var19);
						}
					}

					Tiles.Tiles_underlays[var4] = null;
					Tiles.Tiles_overlays[var4] = null;
					class14.Tiles_shapes[var4] = null;
					GrandExchangeEvent.field3760[var4] = null;
					class281.field3323[var4] = null;
				}

				var69.method4228(-50, -10, -50);

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						if ((Tiles.Tiles_renderFlags[1][var4][var5] & 2) == 2) {
							var69.setLinkBelow(var4, var5);
						}
					}
				}

				var4 = 1;
				var5 = 2;
				var6 = 4;

				for (var7 = 0; var7 < 4; ++var7) {
					if (var7 > 0) {
						var4 <<= 3;
						var5 <<= 3;
						var6 <<= 3;
					}

					for (var8 = 0; var8 <= var7; ++var8) {
						for (var9 = 0; var9 <= 104; ++var9) {
							for (var10 = 0; var10 <= 104; ++var10) {
								short var72;
								if ((Huffman.field3203[var8][var10][var9] & var4) != 0) {
									var11 = var9;
									var12 = var9;
									var13 = var8;

									for (var14 = var8; var11 > 0 && (Huffman.field3203[var8][var10][var11 - 1] & var4) != 0; --var11) {
									}

									while (var12 < 104 && (Huffman.field3203[var8][var10][var12 + 1] & var4) != 0) {
										++var12;
									}

									label928:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((Huffman.field3203[var13 - 1][var10][var15] & var4) == 0) {
												break label928;
											}
										}

										--var13;
									}

									label917:
									while (var14 < var7) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((Huffman.field3203[var14 + 1][var10][var15] & var4) == 0) {
												break label917;
											}
										}

										++var14;
									}

									var15 = (var12 - var11 + 1) * (var14 + 1 - var13);
									if (var15 >= 8) {
										var72 = 240;
										var17 = Tiles.Tiles_heights[var14][var10][var11] - var72;
										var18 = Tiles.Tiles_heights[var13][var10][var11];
										Scene.Scene_addOccluder(var7, 1, var10 * 128, var10 * 128, var11 * 128, var12 * 128 + 128, var17, var18);

										for (var19 = var13; var19 <= var14; ++var19) {
											for (var20 = var11; var20 <= var12; ++var20) {
												var10000 = Huffman.field3203[var19][var10];
												var10000[var20] &= ~var4;
											}
										}
									}
								}

								if ((Huffman.field3203[var8][var10][var9] & var5) != 0) {
									var11 = var10;
									var12 = var10;
									var13 = var8;

									for (var14 = var8; var11 > 0 && (Huffman.field3203[var8][var11 - 1][var9] & var5) != 0; --var11) {
									}

									while (var12 < 104 && (Huffman.field3203[var8][var12 + 1][var9] & var5) != 0) {
										++var12;
									}

									label981:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((Huffman.field3203[var13 - 1][var15][var9] & var5) == 0) {
												break label981;
											}
										}

										--var13;
									}

									label970:
									while (var14 < var7) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((Huffman.field3203[var14 + 1][var15][var9] & var5) == 0) {
												break label970;
											}
										}

										++var14;
									}

									var15 = (var12 - var11 + 1) * (var14 + 1 - var13);
									if (var15 >= 8) {
										var72 = 240;
										var17 = Tiles.Tiles_heights[var14][var11][var9] - var72;
										var18 = Tiles.Tiles_heights[var13][var11][var9];
										Scene.Scene_addOccluder(var7, 2, var11 * 128, var12 * 128 + 128, var9 * 128, var9 * 128, var17, var18);

										for (var19 = var13; var19 <= var14; ++var19) {
											for (var20 = var11; var20 <= var12; ++var20) {
												var10000 = Huffman.field3203[var19][var20];
												var10000[var9] &= ~var5;
											}
										}
									}
								}

								if ((Huffman.field3203[var8][var10][var9] & var6) != 0) {
									var11 = var10;
									var12 = var10;
									var13 = var9;

									for (var14 = var9; var13 > 0 && (Huffman.field3203[var8][var10][var13 - 1] & var6) != 0; --var13) {
									}

									while (var14 < 104 && (Huffman.field3203[var8][var10][var14 + 1] & var6) != 0) {
										++var14;
									}

									label1034:
									while (var11 > 0) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((Huffman.field3203[var8][var11 - 1][var15] & var6) == 0) {
												break label1034;
											}
										}

										--var11;
									}

									label1023:
									while (var12 < 104) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((Huffman.field3203[var8][var12 + 1][var15] & var6) == 0) {
												break label1023;
											}
										}

										++var12;
									}

									if ((var14 - var13 + 1) * (var12 - var11 + 1) >= 4) {
										var15 = Tiles.Tiles_heights[var8][var11][var13];
										Scene.Scene_addOccluder(var7, 4, var11 * 128, var12 * 128 + 128, var13 * 128, var14 * 128 + 128, var15, var15);

										for (var16 = var11; var16 <= var12; ++var16) {
											for (var17 = var13; var17 <= var14; ++var17) {
												var10000 = Huffman.field3203[var8][var16];
												var10000[var17] &= ~var6;
											}
										}
									}
								}
							}
						}
					}
				}

				MouseRecorder.method2075(true);
				var4 = Tiles.Tiles_minPlane;
				if (var4 > VertexNormal.Client_plane) {
					var4 = VertexNormal.Client_plane;
				}

				if (var4 < VertexNormal.Client_plane - 1) {
					var4 = VertexNormal.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					PlayerComposition.scene.init(Tiles.Tiles_minPlane);
				} else {
					PlayerComposition.scene.init(0);
				}

				for (var5 = 0; var5 < 104; ++var5) {
					for (var6 = 0; var6 < 104; ++var6) {
						HealthBarUpdate.updateItemPile(var5, var6);
					}
				}

				class356.playPcmPlayers();

				for (PendingSpawn var76 = (PendingSpawn)Client.pendingSpawns.last(); var76 != null; var76 = (PendingSpawn)Client.pendingSpawns.previous()) {
					if (var76.hitpoints == -1) {
						var76.delay = 0;
						Script.method1969(var76);
					} else {
						var76.remove();
					}
				}

				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var77;
				if (class21.client.hasFrame()) {
					var77 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2723, Client.packetWriter.isaacCipher);
					var77.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var77);
				}

				if (!Client.isInInstance) {
					var5 = (HealthBarDefinition.field1671 - 6) / 8;
					var6 = (HealthBarDefinition.field1671 + 6) / 8;
					var7 = (WorldMapArea.field2053 - 6) / 8;
					var8 = (WorldMapArea.field2053 + 6) / 8;

					for (var9 = var5 - 1; var9 <= var6 + 1; ++var9) {
						for (var10 = var7 - 1; var10 <= var8 + 1; ++var10) {
							if (var9 < var5 || var9 > var6 || var10 < var7 || var10 > var8) {
								ApproximateRouteStrategy.archive5.loadRegionFromName("m" + var9 + "_" + var10);
								ApproximateRouteStrategy.archive5.loadRegionFromName("l" + var9 + "_" + var10);
							}
						}
					}
				}

				UserList.updateGameState(30);
				class356.playPcmPlayers();
				SecureRandomCallable.method2036();
				var77 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2680, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var77);
				LoginPacket.clock.mark();

				for (var6 = 0; var6 < 32; ++var6) {
					GameEngine.graphicsTickTimes[var6] = 0L;
				}

				for (var6 = 0; var6 < 32; ++var6) {
					GameEngine.clientTickTimes[var6] = 0L;
				}

				GameEngine.gameCyclesToDo = 0;
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-220787387"
	)
	static final void method3445() {
		PacketBufferNode var0 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2669, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class16.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lct;ZS)V",
		garbageValue = "-12050"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && class157.Widget_loadedInterfaces[var2]) {
			Widget.Widget_archive.clearFilesGroup(var2);
			if (Widget.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;

				for (int var5 = 0; var5 < Widget.Widget_interfaceComponents[var2].length; ++var5) {
					if (Widget.Widget_interfaceComponents[var2][var5] != null) {
						if (Widget.Widget_interfaceComponents[var2][var5].type != 2) {
							Widget.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}

				if (var4) {
					Widget.Widget_interfaceComponents[var2] = null;
				}

				class157.Widget_loadedInterfaces[var2] = false;
			}
		}

		for (IntegerNode var6 = (IntegerNode)Client.widgetFlags.first(); var6 != null; var6 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var6.key >> 48 & 65535L)) {
				var6.remove();
			}
		}

		Widget var7 = HealthBarUpdate.getWidget(var3);
		if (var7 != null) {
			class16.invalidateWidget(var7);
		}

		class132.method2699();
		if (Client.rootInterface != -1) {
			ItemContainer.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
