import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class23 {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1074751797"
	)
	static void method230(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = var4 * 3 + 600;
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4];
			int var9 = var1 - 334;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 100) {
				var9 = 100;
			}

			int var10 = (Client.zoomWidth - Client.zoomHeight) * var9 / 100 + Client.zoomHeight;
			int var8 = var10 * var5 / 256;
			var2[var3] = var8 * var7 >> 16;
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693964297"
	)
	static final void method229() {
		class303.method5528(false);
		Client.field822 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class90.regionLandArchives.length; ++var1) {
			if (StudioGame.regionMapArchiveIds[var1] != -1 && class90.regionLandArchives[var1] == null) {
				class90.regionLandArchives[var1] = WorldMapRectangle.archive5.takeFile(StudioGame.regionMapArchiveIds[var1], 0);
				if (class90.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field822;
				}
			}

			if (class52.regionLandArchiveIds[var1] != -1 && class1.regionMapArchives[var1] == null) {
				class1.regionMapArchives[var1] = WorldMapRectangle.archive5.takeFileEncrypted(class52.regionLandArchiveIds[var1], 0, WorldMapData_1.xteaKeys[var1]);
				if (class1.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field822;
				}
			}
		}

		if (!var0) {
			Client.field809 = 1;
		} else {
			Client.field690 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class90.regionLandArchives.length; ++var1) {
				byte[] var2 = class1.regionMapArchives[var1];
				if (var2 != null) {
					var3 = (class41.regions[var1] >> 8) * 64 - class182.baseX;
					var4 = (class41.regions[var1] & 255) * 64 - SecureRandomFuture.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class235.method4281(var2, var3, var4);
				}
			}

			if (!var0) {
				Client.field809 = 2;
			} else {
				if (Client.field809 != 0) {
					ArchiveDiskActionHandler.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				Timer.playPcmPlayers();
				UserComparator3.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var46;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var46 = 0; var46 < 104; ++var46) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var46][var3] = 0;
						}
					}
				}

				Timer.playPcmPlayers();
				Tiles.Tiles_minPlane = 99;
				Tiles.field530 = new byte[4][104][104];
				Tiles.field524 = new byte[4][104][104];
				Tiles.field525 = new byte[4][104][104];
				WorldMapLabel.field269 = new byte[4][104][104];
				HealthBarUpdate.field1031 = new int[4][105][105];
				class171.field2036 = new byte[4][105][105];
				Tiles.field526 = new int[105][105];
				BuddyRankComparator.Tiles_hue = new int[104];
				GrandExchangeOfferAgeComparator.Tiles_saturation = new int[104];
				TextureProvider.Tiles_lightness = new int[104];
				class237.Tiles_hueMultiplier = new int[104];
				WorldMapRectangle.field198 = new int[104];
				var1 = class90.regionLandArchives.length;

				for (ObjectSound var60 = (ObjectSound)ObjectSound.objectSounds.last(); var60 != null; var60 = (ObjectSound)ObjectSound.objectSounds.previous()) {
					if (var60.stream1 != null) {
						class60.pcmStreamMixer.removeSubStream(var60.stream1);
						var60.stream1 = null;
					}

					if (var60.stream2 != null) {
						class60.pcmStreamMixer.removeSubStream(var60.stream2);
						var60.stream2 = null;
					}
				}

				ObjectSound.objectSounds.clear();
				class303.method5528(true);
				int var6;
				int var7;
				int var9;
				int var10;
				int var11;
				int var12;
				int[] var10000;
				int var48;
				if (!Client.isInInstance) {
					byte[] var5;
					for (var46 = 0; var46 < var1; ++var46) {
						var3 = (class41.regions[var46] >> 8) * 64 - class182.baseX;
						var4 = (class41.regions[var46] & 255) * 64 - SecureRandomFuture.baseY;
						var5 = class90.regionLandArchives[var46];
						if (var5 != null) {
							Timer.playPcmPlayers();
							var6 = WorldMapCacheName.field328 * 8 - 48;
							var7 = class22.field104 * 8 - 48;
							CollisionMap[] var8 = Client.collisionMaps;

							for (var9 = 0; var9 < 4; ++var9) {
								for (var10 = 0; var10 < 64; ++var10) {
									for (var11 = 0; var11 < 64; ++var11) {
										if (var10 + var3 > 0 && var3 + var10 < 103 && var11 + var4 > 0 && var4 + var11 < 103) {
											var10000 = var8[var9].flags[var10 + var3];
											var10000[var4 + var11] &= -16777217;
										}
									}
								}
							}

							Buffer var47 = new Buffer(var5);

							for (var10 = 0; var10 < 4; ++var10) {
								for (var11 = 0; var11 < 64; ++var11) {
									for (var12 = 0; var12 < 64; ++var12) {
										AbstractArchive.loadTerrain(var47, var10, var3 + var11, var4 + var12, var6, var7, 0);
									}
								}
							}
						}
					}

					for (var46 = 0; var46 < var1; ++var46) {
						var3 = (class41.regions[var46] >> 8) * 64 - class182.baseX;
						var4 = (class41.regions[var46] & 255) * 64 - SecureRandomFuture.baseY;
						var5 = class90.regionLandArchives[var46];
						if (var5 == null && class22.field104 < 800) {
							Timer.playPcmPlayers();
							GrandExchangeEvent.method153(var3, var4, 64, 64);
						}
					}

					class303.method5528(true);

					for (var46 = 0; var46 < var1; ++var46) {
						byte[] var50 = class1.regionMapArchives[var46];
						if (var50 != null) {
							var4 = (class41.regions[var46] >> 8) * 64 - class182.baseX;
							var48 = (class41.regions[var46] & 255) * 64 - SecureRandomFuture.baseY;
							Timer.playPcmPlayers();
							WorldMapRegion.method520(var50, var4, var48, UserComparator3.scene, Client.collisionMaps);
						}
					}
				}

				int var49;
				if (Client.isInInstance) {
					for (var46 = 0; var46 < 4; ++var46) {
						Timer.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var68 = false;
								var6 = Client.instanceChunkTemplates[var46][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var49 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class41.regions.length; ++var12) {
										if (class41.regions[var12] == var11 && class90.regionLandArchives[var12] != null) {
											LoginScreenAnimation.method1879(class90.regionLandArchives[var12], var46, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var49, Client.collisionMaps);
											var68 = true;
											break;
										}
									}
								}

								if (!var68) {
									var7 = var46;
									var49 = var3 * 8;
									var9 = var4 * 8;

									for (var10 = 0; var10 < 8; ++var10) {
										for (var11 = 0; var11 < 8; ++var11) {
											Tiles.Tiles_heights[var7][var49 + var10][var11 + var9] = 0;
										}
									}

									if (var49 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var7][var49][var10 + var9] = Tiles.Tiles_heights[var7][var49 - 1][var10 + var9];
										}
									}

									if (var9 > 0) {
										for (var10 = 1; var10 < 8; ++var10) {
											Tiles.Tiles_heights[var7][var49 + var10][var9] = Tiles.Tiles_heights[var7][var10 + var49][var9 - 1];
										}
									}

									if (var49 > 0 && Tiles.Tiles_heights[var7][var49 - 1][var9] != 0) {
										Tiles.Tiles_heights[var7][var49][var9] = Tiles.Tiles_heights[var7][var49 - 1][var9];
									} else if (var9 > 0 && Tiles.Tiles_heights[var7][var49][var9 - 1] != 0) {
										Tiles.Tiles_heights[var7][var49][var9] = Tiles.Tiles_heights[var7][var49][var9 - 1];
									} else if (var49 > 0 && var9 > 0 && Tiles.Tiles_heights[var7][var49 - 1][var9 - 1] != 0) {
										Tiles.Tiles_heights[var7][var49][var9] = Tiles.Tiles_heights[var7][var49 - 1][var9 - 1];
									}
								}
							}
						}
					}

					for (var46 = 0; var46 < 13; ++var46) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var46][var3];
							if (var4 == -1) {
								GrandExchangeEvent.method153(var46 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class303.method5528(true);

					for (var46 = 0; var46 < 4; ++var46) {
						Timer.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var48 = Client.instanceChunkTemplates[var46][var3][var4];
								if (var48 != -1) {
									var6 = var48 >> 24 & 3;
									var7 = var48 >> 1 & 3;
									var49 = var48 >> 14 & 1023;
									var9 = var48 >> 3 & 2047;
									var10 = (var49 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class41.regions.length; ++var11) {
										if (class41.regions[var11] == var10 && class1.regionMapArchives[var11] != null) {
											WorldMapIcon_1.method365(class1.regionMapArchives[var11], var46, var3 * 8, var4 * 8, var6, (var49 & 7) * 8, (var9 & 7) * 8, var7, UserComparator3.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class303.method5528(true);
				Timer.playPcmPlayers();
				Scene var61 = UserComparator3.scene;
				CollisionMap[] var69 = Client.collisionMaps;

				for (var4 = 0; var4 < 4; ++var4) {
					for (var48 = 0; var48 < 104; ++var48) {
						for (var6 = 0; var6 < 104; ++var6) {
							if ((Tiles.Tiles_renderFlags[var4][var48][var6] & 1) == 1) {
								var7 = var4;
								if ((Tiles.Tiles_renderFlags[1][var48][var6] & 2) == 2) {
									var7 = var4 - 1;
								}

								if (var7 >= 0) {
									var69[var7].setBlockedByFloor(var48, var6);
								}
							}
						}
					}
				}

				Tiles.field535 += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.field535 < -8) {
					Tiles.field535 = -8;
				}

				if (Tiles.field535 > 8) {
					Tiles.field535 = 8;
				}

				Tiles.field520 += (int)(Math.random() * 5.0D) - 2;
				if (Tiles.field520 < -16) {
					Tiles.field520 = -16;
				}

				if (Tiles.field520 > 16) {
					Tiles.field520 = 16;
				}

				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				for (var4 = 0; var4 < 4; ++var4) {
					byte[][] var62 = class171.field2036[var4];
					var11 = (int)Math.sqrt(5100.0D);
					var12 = var11 * 768 >> 8;

					int var21;
					int var22;
					for (var13 = 1; var13 < 103; ++var13) {
						for (var14 = 1; var14 < 103; ++var14) {
							var15 = Tiles.Tiles_heights[var4][var14 + 1][var13] - Tiles.Tiles_heights[var4][var14 - 1][var13];
							var16 = Tiles.Tiles_heights[var4][var14][var13 + 1] - Tiles.Tiles_heights[var4][var14][var13 - 1];
							var17 = (int)Math.sqrt((double)(var15 * var15 + var16 * var16 + 65536));
							var18 = (var15 << 8) / var17;
							var19 = 65536 / var17;
							var20 = (var16 << 8) / var17;
							var21 = (var18 * -50 + var20 * -50 + var19 * -10) / var12 + 96;
							var22 = (var62[var14 - 1][var13] >> 2) + (var62[var14][var13 - 1] >> 2) + (var62[var14 + 1][var13] >> 3) + (var62[var14][var13 + 1] >> 3) + (var62[var14][var13] >> 1);
							Tiles.field526[var14][var13] = var21 - var22;
						}
					}

					for (var13 = 0; var13 < 104; ++var13) {
						BuddyRankComparator.Tiles_hue[var13] = 0;
						GrandExchangeOfferAgeComparator.Tiles_saturation[var13] = 0;
						TextureProvider.Tiles_lightness[var13] = 0;
						class237.Tiles_hueMultiplier[var13] = 0;
						WorldMapRectangle.field198[var13] = 0;
					}

					for (var13 = -5; var13 < 109; ++var13) {
						for (var14 = 0; var14 < 104; ++var14) {
							var15 = var13 + 5;
							int var10002;
							if (var15 >= 0 && var15 < 104) {
								var16 = Tiles.field530[var4][var15][var14] & 255;
								if (var16 > 0) {
									var18 = var16 - 1;
									FloorUnderlayDefinition var51 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18);
									FloorUnderlayDefinition var52;
									if (var51 != null) {
										var52 = var51;
									} else {
										byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var18);
										var51 = new FloorUnderlayDefinition();
										if (var53 != null) {
											var51.decode(new Buffer(var53), var18);
										}

										var51.postDecode();
										FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var51, (long)var18);
										var52 = var51;
									}

									var10000 = BuddyRankComparator.Tiles_hue;
									var10000[var14] += var52.hue;
									var10000 = GrandExchangeOfferAgeComparator.Tiles_saturation;
									var10000[var14] += var52.saturation;
									var10000 = TextureProvider.Tiles_lightness;
									var10000[var14] += var52.lightness;
									var10000 = class237.Tiles_hueMultiplier;
									var10000[var14] += var52.hueMultiplier;
									var10002 = WorldMapRectangle.field198[var14]++;
								}
							}

							var16 = var13 - 5;
							if (var16 >= 0 && var16 < 104) {
								var17 = Tiles.field530[var4][var16][var14] & 255;
								if (var17 > 0) {
									var19 = var17 - 1;
									FloorUnderlayDefinition var70 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19);
									FloorUnderlayDefinition var54;
									if (var70 != null) {
										var54 = var70;
									} else {
										byte[] var59 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var19);
										var70 = new FloorUnderlayDefinition();
										if (var59 != null) {
											var70.decode(new Buffer(var59), var19);
										}

										var70.postDecode();
										FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var70, (long)var19);
										var54 = var70;
									}

									var10000 = BuddyRankComparator.Tiles_hue;
									var10000[var14] -= var54.hue;
									var10000 = GrandExchangeOfferAgeComparator.Tiles_saturation;
									var10000[var14] -= var54.saturation;
									var10000 = TextureProvider.Tiles_lightness;
									var10000[var14] -= var54.lightness;
									var10000 = class237.Tiles_hueMultiplier;
									var10000[var14] -= var54.hueMultiplier;
									var10002 = WorldMapRectangle.field198[var14]--;
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
									var14 += BuddyRankComparator.Tiles_hue[var20];
									var15 += GrandExchangeOfferAgeComparator.Tiles_saturation[var20];
									var16 += TextureProvider.Tiles_lightness[var20];
									var17 += class237.Tiles_hueMultiplier[var20];
									var18 += WorldMapRectangle.field198[var20];
								}

								var21 = var19 - 5;
								if (var21 >= 0 && var21 < 104) {
									var14 -= BuddyRankComparator.Tiles_hue[var21];
									var15 -= GrandExchangeOfferAgeComparator.Tiles_saturation[var21];
									var16 -= TextureProvider.Tiles_lightness[var21];
									var17 -= class237.Tiles_hueMultiplier[var21];
									var18 -= WorldMapRectangle.field198[var21];
								}

								if (var19 >= 1 && var19 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var13][var19] & 2) != 0 || (Tiles.Tiles_renderFlags[var4][var13][var19] & 16) == 0)) {
									if (var4 < Tiles.Tiles_minPlane) {
										Tiles.Tiles_minPlane = var4;
									}

									var22 = Tiles.field530[var4][var13][var19] & 255;
									int var23 = Tiles.field524[var4][var13][var19] & 255;
									if (var22 > 0 || var23 > 0) {
										int var24 = Tiles.Tiles_heights[var4][var13][var19];
										int var25 = Tiles.Tiles_heights[var4][var13 + 1][var19];
										int var26 = Tiles.Tiles_heights[var4][var13 + 1][var19 + 1];
										int var27 = Tiles.Tiles_heights[var4][var13][var19 + 1];
										int var28 = Tiles.field526[var13][var19];
										int var29 = Tiles.field526[var13 + 1][var19];
										int var30 = Tiles.field526[var13 + 1][var19 + 1];
										int var31 = Tiles.field526[var13][var19 + 1];
										int var32 = -1;
										int var33 = -1;
										int var34;
										int var35;
										int var36;
										if (var22 > 0) {
											var34 = var14 * 256 / var17;
											var35 = var15 / var18;
											var36 = var16 / var18;
											var32 = DevicePcmPlayerProvider.hslToRgb(var34, var35, var36);
											var34 = var34 + Tiles.field535 & 255;
											var36 += Tiles.field520;
											if (var36 < 0) {
												var36 = 0;
											} else if (var36 > 255) {
												var36 = 255;
											}

											var33 = DevicePcmPlayerProvider.hslToRgb(var34, var35, var36);
										}

										FloorOverlayDefinition var37;
										if (var4 > 0) {
											boolean var66 = true;
											if (var22 == 0 && Tiles.field525[var4][var13][var19] != 0) {
												var66 = false;
											}

											if (var23 > 0) {
												var36 = var23 - 1;
												var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var36);
												FloorOverlayDefinition var55;
												if (var37 != null) {
													var55 = var37;
												} else {
													byte[] var56 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var36);
													var37 = new FloorOverlayDefinition();
													if (var56 != null) {
														var37.decode(new Buffer(var56), var36);
													}

													var37.postDecode();
													FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var36);
													var55 = var37;
												}

												if (!var55.hideUnderlay) {
													var66 = false;
												}
											}

											if (var66 && var25 == var24 && var26 == var24 && var24 == var27) {
												var10000 = HealthBarUpdate.field1031[var4][var13];
												var10000[var19] |= 2340;
											}
										}

										var34 = 0;
										if (var33 != -1) {
											var34 = Rasterizer3D.Rasterizer3D_colorPalette[class236.method4282(var33, 96)];
										}

										if (var23 == 0) {
											var61.addTile(var4, var13, var19, 0, 0, -1, var24, var25, var26, var27, class236.method4282(var32, var28), class236.method4282(var32, var29), class236.method4282(var32, var30), class236.method4282(var32, var31), 0, 0, 0, 0, var34, 0);
										} else {
											var35 = Tiles.field525[var4][var13][var19] + 1;
											byte var67 = WorldMapLabel.field269[var4][var13][var19];
											int var38 = var23 - 1;
											FloorOverlayDefinition var39 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var38);
											if (var39 != null) {
												var37 = var39;
											} else {
												byte[] var57 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var38);
												var39 = new FloorOverlayDefinition();
												if (var57 != null) {
													var39.decode(new Buffer(var57), var38);
												}

												var39.postDecode();
												FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var39, (long)var38);
												var37 = var39;
											}

											int var40 = var37.texture;
											int var41;
											int var42;
											int var43;
											int var44;
											if (var40 >= 0) {
												var42 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var40);
												var41 = -1;
											} else if (var37.primaryRgb == 16711935) {
												var41 = -2;
												var40 = -1;
												var42 = -2;
											} else {
												var41 = DevicePcmPlayerProvider.hslToRgb(var37.hue, var37.saturation, var37.lightness);
												var43 = var37.hue + Tiles.field535 & 255;
												var44 = var37.lightness + Tiles.field520;
												if (var44 < 0) {
													var44 = 0;
												} else if (var44 > 255) {
													var44 = 255;
												}

												var42 = DevicePcmPlayerProvider.hslToRgb(var43, var37.saturation, var44);
											}

											var43 = 0;
											if (var42 != -2) {
												var43 = Rasterizer3D.Rasterizer3D_colorPalette[class105.method2414(var42, 96)];
											}

											if (var37.secondaryRgb != -1) {
												var44 = var37.secondaryHue + Tiles.field535 & 255;
												int var45 = var37.secondaryLightness + Tiles.field520;
												if (var45 < 0) {
													var45 = 0;
												} else if (var45 > 255) {
													var45 = 255;
												}

												var42 = DevicePcmPlayerProvider.hslToRgb(var44, var37.secondarySaturation, var45);
												var43 = Rasterizer3D.Rasterizer3D_colorPalette[class105.method2414(var42, 96)];
											}

											var61.addTile(var4, var13, var19, var35, var67, var40, var24, var25, var26, var27, class236.method4282(var32, var28), class236.method4282(var32, var29), class236.method4282(var32, var30), class236.method4282(var32, var31), class105.method2414(var41, var28), class105.method2414(var41, var29), class105.method2414(var41, var30), class105.method2414(var41, var31), var34, var43);
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

							var61.setTileMinPlane(var4, var14, var13, var19);
						}
					}

					Tiles.field530[var4] = null;
					Tiles.field524[var4] = null;
					Tiles.field525[var4] = null;
					WorldMapLabel.field269[var4] = null;
					class171.field2036[var4] = null;
				}

				var61.method3222(-50, -10, -50);

				for (var4 = 0; var4 < 104; ++var4) {
					for (var48 = 0; var48 < 104; ++var48) {
						if ((Tiles.Tiles_renderFlags[1][var4][var48] & 2) == 2) {
							var61.setLinkBelow(var4, var48);
						}
					}
				}

				var4 = 1;
				var48 = 2;
				var6 = 4;

				for (var7 = 0; var7 < 4; ++var7) {
					if (var7 > 0) {
						var4 <<= 3;
						var48 <<= 3;
						var6 <<= 3;
					}

					for (var49 = 0; var49 <= var7; ++var49) {
						for (var9 = 0; var9 <= 104; ++var9) {
							for (var10 = 0; var10 <= 104; ++var10) {
								short var65;
								if ((HealthBarUpdate.field1031[var49][var10][var9] & var4) != 0) {
									var11 = var9;
									var12 = var9;
									var13 = var49;

									for (var14 = var49; var11 > 0 && (HealthBarUpdate.field1031[var49][var10][var11 - 1] & var4) != 0; --var11) {
									}

									while (var12 < 104 && (HealthBarUpdate.field1031[var49][var10][var12 + 1] & var4) != 0) {
										++var12;
									}

									label863:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((HealthBarUpdate.field1031[var13 - 1][var10][var15] & var4) == 0) {
												break label863;
											}
										}

										--var13;
									}

									label852:
									while (var14 < var7) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((HealthBarUpdate.field1031[var14 + 1][var10][var15] & var4) == 0) {
												break label852;
											}
										}

										++var14;
									}

									var15 = (var12 - var11 + 1) * (var14 + 1 - var13);
									if (var15 >= 8) {
										var65 = 240;
										var17 = Tiles.Tiles_heights[var14][var10][var11] - var65;
										var18 = Tiles.Tiles_heights[var13][var10][var11];
										Scene.Scene_addOccluder(var7, 1, var10 * 128, var10 * 128, var11 * 128, var12 * 128 + 128, var17, var18);

										for (var19 = var13; var19 <= var14; ++var19) {
											for (var20 = var11; var20 <= var12; ++var20) {
												var10000 = HealthBarUpdate.field1031[var19][var10];
												var10000[var20] &= ~var4;
											}
										}
									}
								}

								if ((HealthBarUpdate.field1031[var49][var10][var9] & var48) != 0) {
									var11 = var10;
									var12 = var10;
									var13 = var49;

									for (var14 = var49; var11 > 0 && (HealthBarUpdate.field1031[var49][var11 - 1][var9] & var48) != 0; --var11) {
									}

									while (var12 < 104 && (HealthBarUpdate.field1031[var49][var12 + 1][var9] & var48) != 0) {
										++var12;
									}

									label916:
									while (var13 > 0) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((HealthBarUpdate.field1031[var13 - 1][var15][var9] & var48) == 0) {
												break label916;
											}
										}

										--var13;
									}

									label905:
									while (var14 < var7) {
										for (var15 = var11; var15 <= var12; ++var15) {
											if ((HealthBarUpdate.field1031[var14 + 1][var15][var9] & var48) == 0) {
												break label905;
											}
										}

										++var14;
									}

									var15 = (var14 + 1 - var13) * (var12 - var11 + 1);
									if (var15 >= 8) {
										var65 = 240;
										var17 = Tiles.Tiles_heights[var14][var11][var9] - var65;
										var18 = Tiles.Tiles_heights[var13][var11][var9];
										Scene.Scene_addOccluder(var7, 2, var11 * 128, var12 * 128 + 128, var9 * 128, var9 * 128, var17, var18);

										for (var19 = var13; var19 <= var14; ++var19) {
											for (var20 = var11; var20 <= var12; ++var20) {
												var10000 = HealthBarUpdate.field1031[var19][var20];
												var10000[var9] &= ~var48;
											}
										}
									}
								}

								if ((HealthBarUpdate.field1031[var49][var10][var9] & var6) != 0) {
									var11 = var10;
									var12 = var10;
									var13 = var9;

									for (var14 = var9; var13 > 0 && (HealthBarUpdate.field1031[var49][var10][var13 - 1] & var6) != 0; --var13) {
									}

									while (var14 < 104 && (HealthBarUpdate.field1031[var49][var10][var14 + 1] & var6) != 0) {
										++var14;
									}

									label969:
									while (var11 > 0) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((HealthBarUpdate.field1031[var49][var11 - 1][var15] & var6) == 0) {
												break label969;
											}
										}

										--var11;
									}

									label958:
									while (var12 < 104) {
										for (var15 = var13; var15 <= var14; ++var15) {
											if ((HealthBarUpdate.field1031[var49][var12 + 1][var15] & var6) == 0) {
												break label958;
											}
										}

										++var12;
									}

									if ((var14 - var13 + 1) * (var12 - var11 + 1) >= 4) {
										var15 = Tiles.Tiles_heights[var49][var11][var13];
										Scene.Scene_addOccluder(var7, 4, var11 * 128, var12 * 128 + 128, var13 * 128, var14 * 128 + 128, var15, var15);

										for (var16 = var11; var16 <= var12; ++var16) {
											for (var17 = var13; var17 <= var14; ++var17) {
												var10000 = HealthBarUpdate.field1031[var49][var16];
												var10000[var17] &= ~var6;
											}
										}
									}
								}
							}
						}
					}
				}

				class303.method5528(true);
				var4 = Tiles.Tiles_minPlane;
				if (var4 > TileItemPile.Client_plane) {
					var4 = TileItemPile.Client_plane;
				}

				if (var4 < TileItemPile.Client_plane - 1) {
					var4 = TileItemPile.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					UserComparator3.scene.init(Tiles.Tiles_minPlane);
				} else {
					UserComparator3.scene.init(0);
				}

				for (var48 = 0; var48 < 104; ++var48) {
					for (var6 = 0; var6 < 104; ++var6) {
						class41.updateItemPile(var48, var6);
					}
				}

				Timer.playPcmPlayers();

				for (PendingSpawn var63 = (PendingSpawn)Client.pendingSpawns.last(); var63 != null; var63 = (PendingSpawn)Client.pendingSpawns.previous()) {
					if (var63.hitpoints == -1) {
						var63.delay = 0;
						MusicPatchNode2.method3819(var63);
					} else {
						var63.remove();
					}
				}

				ObjectDefinition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var64;
				if (WorldMapSectionType.client.hasFrame()) {
					var64 = UserComparator4.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher);
					var64.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var64);
				}

				if (!Client.isInInstance) {
					var48 = (WorldMapCacheName.field328 - 6) / 8;
					var6 = (WorldMapCacheName.field328 + 6) / 8;
					var7 = (class22.field104 - 6) / 8;
					var49 = (class22.field104 + 6) / 8;

					for (var9 = var48 - 1; var9 <= var6 + 1; ++var9) {
						for (var10 = var7 - 1; var10 <= var49 + 1; ++var10) {
							if (var9 < var48 || var9 > var6 || var10 < var7 || var10 > var49) {
								WorldMapRectangle.archive5.loadRegionFromName("m" + var9 + "_" + var10);
								WorldMapRectangle.archive5.loadRegionFromName("l" + var9 + "_" + var10);
							}
						}
					}
				}

				ClientPreferences.updateGameState(30);
				Timer.playPcmPlayers();
				BoundaryObject.method3390();
				var64 = UserComparator4.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var64);
				MidiPcmStream.method3905();
			}
		}
	}
}
