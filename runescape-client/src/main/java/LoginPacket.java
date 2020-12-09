import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2332;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static final LoginPacket field2339;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2334;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2335;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final LoginPacket field2336;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static final LoginPacket field2337;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 2303606948216471517L
	)
	static long field2341;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 783182641
	)
	@Export("id")
	public final int id;

	static {
		field2332 = new LoginPacket(14, 0);
		field2339 = new LoginPacket(15, 4);
		field2334 = new LoginPacket(16, -2);
		field2335 = new LoginPacket(18, -2);
		field2336 = new LoginPacket(19, -2);
		field2337 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = ViewportMouse.method3062();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1922563005"
	)
	static String method3674() {
		String var0;
		if (Timer.clientPreferences.hideUsername) {
			String var2 = Login.Login_username;
			int var4 = var2.length();
			char[] var5 = new char[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var5[var6] = '*';
			}

			String var3 = new String(var5);
			var0 = var3;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leo;[Lfo;I)V",
		garbageValue = "1844671024"
	)
	static final void method3673(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}

						if (var5 >= 0) {
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field516 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field516 < -8) {
			Tiles.field516 = -8;
		}

		if (Tiles.field516 > 8) {
			Tiles.field516 = 8;
		}

		Tiles.field510 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field510 < -16) {
			Tiles.field510 = -16;
		}

		if (Tiles.field510 > 16) {
			Tiles.field510 = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var42 = Tiles.field511[var2];
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1);
					class92.field1173[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				VarbitDefinition.Tiles_hue[var11] = 0;
				ArchiveDiskActionHandler.Tiles_saturation[var11] = 0;
				class92.Tiles_lightness[var11] = 0;
				UserComparator7.Tiles_hueMultiplier[var11] = 0;
				Varcs.field1283[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.field514[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var44 = WorldMapElement.method4405(var14 - 1);
							var10000 = VarbitDefinition.Tiles_hue;
							var10000[var12] += var44.hue;
							var10000 = ArchiveDiskActionHandler.Tiles_saturation;
							var10000[var12] += var44.saturation;
							var10000 = class92.Tiles_lightness;
							var10000[var12] += var44.lightness;
							var10000 = UserComparator7.Tiles_hueMultiplier;
							var10000[var12] += var44.hueMultiplier;
							var10002 = Varcs.field1283[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.field514[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var45 = WorldMapElement.method4405(var15 - 1);
							var10000 = VarbitDefinition.Tiles_hue;
							var10000[var12] -= var45.hue;
							var10000 = ArchiveDiskActionHandler.Tiles_saturation;
							var10000[var12] -= var45.saturation;
							var10000 = class92.Tiles_lightness;
							var10000[var12] -= var45.lightness;
							var10000 = UserComparator7.Tiles_hueMultiplier;
							var10000[var12] -= var45.hueMultiplier;
							var10002 = Varcs.field1283[var12]--;
						}
					}
				}

				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += VarbitDefinition.Tiles_hue[var18];
							var13 += ArchiveDiskActionHandler.Tiles_saturation[var18];
							var14 += class92.Tiles_lightness[var18];
							var15 += UserComparator7.Tiles_hueMultiplier[var18];
							var16 += Varcs.field1283[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= VarbitDefinition.Tiles_hue[var19];
							var13 -= ArchiveDiskActionHandler.Tiles_saturation[var19];
							var14 -= class92.Tiles_lightness[var19];
							var15 -= UserComparator7.Tiles_hueMultiplier[var19];
							var16 -= Varcs.field1283[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field514[var2][var11][var17] & 255;
							int var21 = Tiles.field508[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = class92.field1173[var11][var17];
								int var27 = class92.field1173[var11 + 1][var17];
								int var28 = class92.field1173[var11 + 1][var17 + 1];
								int var29 = class92.field1173[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = WorldMapLabelSize.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.field516 & 255;
									var34 += Tiles.field510;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = WorldMapLabelSize.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var47 = true;
									if (var20 == 0 && class9.field40[var2][var11][var17] != 0) {
										var47 = false;
									}

									if (var21 > 0 && !RouteStrategy.method3648(var21 - 1).hideUnderlay) {
										var47 = false;
									}

									if (var47 && var23 == var22 && var22 == var24 && var25 == var22) {
										var10000 = GrandExchangeOfferWorldComparator.field52[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[Tile.method2946(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, Tile.method2946(var30, var26), Tile.method2946(var30, var27), Tile.method2946(var30, var28), Tile.method2946(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = class9.field40[var2][var11][var17] + 1;
									byte var48 = Username.field3663[var2][var11][var17];
									FloorOverlayDefinition var35 = RouteStrategy.method3648(var21 - 1);
									int var36 = var35.texture;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36);
										var37 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var37 = -2;
										var36 = -1;
										var38 = -2;
									} else {
										var37 = WorldMapLabelSize.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.field516 & 255;
										var40 = var35.lightness + Tiles.field510;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = WorldMapLabelSize.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class9.method101(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.field516 & 255;
										int var41 = var35.secondaryLightness + Tiles.field510;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = WorldMapLabelSize.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class9.method101(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, Tile.method2946(var30, var26), Tile.method2946(var30, var27), Tile.method2946(var30, var28), Tile.method2946(var30, var29), class9.method101(var37, var26), class9.method101(var37, var27), class9.method101(var37, var28), class9.method101(var37, var29), var32, var39);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
						var17 = 0;
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			Tiles.field514[var2] = null;
			Tiles.field508[var2] = null;
			class9.field40[var2] = null;
			Username.field3663[var2] = null;
			Tiles.field511[var2] = null;
		}

		var0.method3190(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var6 = 0; var6 <= var5; ++var6) {
				for (int var7 = 0; var7 <= 104; ++var7) {
					for (int var8 = 0; var8 <= 104; ++var8) {
						short var46;
						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var10 + 1] & var2) != 0) {
								++var10;
							}

							label437:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var11 - 1][var8][var13] & var2) == 0) {
										break label437;
									}
								}

								--var11;
							}

							label426:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var12 + 1][var8][var13] & var2) == 0) {
										break label426;
									}
								}

								++var12;
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46;
								var16 = Tiles.Tiles_heights[var11][var8][var9];
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = GrandExchangeOfferWorldComparator.field52[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var9 - 1][var7] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var10 + 1][var7] & var3) != 0) {
								++var10;
							}

							label490:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var11 - 1][var13][var7] & var3) == 0) {
										break label490;
									}
								}

								--var11;
							}

							label479:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var12 + 1][var13][var7] & var3) == 0) {
										break label479;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46;
								var16 = Tiles.Tiles_heights[var11][var9][var7];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = GrandExchangeOfferWorldComparator.field52[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((GrandExchangeOfferWorldComparator.field52[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; var11 > 0 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (GrandExchangeOfferWorldComparator.field52[var6][var8][var12 + 1] & var4) != 0) {
								++var12;
							}

							label543:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var6][var9 - 1][var13] & var4) == 0) {
										break label543;
									}
								}

								--var9;
							}

							label532:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((GrandExchangeOfferWorldComparator.field52[var6][var10 + 1][var13] & var4) == 0) {
										break label532;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = GrandExchangeOfferWorldComparator.field52[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "58"
	)
	static void method3672(int var0, int var1) {
		if (Timer.clientPreferences.musicVolume != 0 && var0 != -1) {
			Interpreter.method2082(ItemContainer.archive11, var0, 0, Timer.clientPreferences.musicVolume, false);
			Client.field883 = true;
		}

	}
}
