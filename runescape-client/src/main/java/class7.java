import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class7 {
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	static Widget field31;
	@ObfuscatedName("l")
	ExecutorService field28;
	@ObfuscatedName("q")
	Future field25;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	final Buffer field30;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class3 field27;

	@ObfuscatedSignature(
		descriptor = "(Lot;Lj;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field28 = Executors.newSingleThreadExecutor();
		this.field30 = var1;
		this.field27 = var2;
		this.method50();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1905557215"
	)
	public boolean method47() {
		return this.field25.isDone();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	public void method48() {
		this.field28.shutdown();
		this.field28 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "572795942"
	)
	public Buffer method49() {
		try {
			return (Buffer)this.field25.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method50() {
		this.field25 = this.field28.submit(new class1(this, this.field30, this.field27));
	}

	@ObfuscatedName("f")
	public static boolean method60(long var0) {
		return 0L != var0 && !class133.method2702(var0);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2027400606"
	)
	static void method63() {
		if (Login.clearLoginScreen) {
			SoundCache.titleboxSprite = null;
			class132.titlebuttonSprite = null;
			Login.runesSprite = null;
			Login.leftTitleSprite = null;
			Login.rightTitleSprite = null;
			ClanChannelMember.logoSprite = null;
			class16.title_muteSprite = null;
			class397.options_buttons_0Sprite = null;
			FileSystem.options_buttons_2Sprite = null;
			BoundaryObject.worldSelectBackSprites = null;
			NetFileRequest.worldSelectFlagSprites = null;
			EnumComposition.worldSelectArrows = null;
			class320.worldSelectStars = null;
			Client.field563 = null;
			Login.loginScreenRunesAnimation.method2164();
			CollisionMap.method3417(2);
			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var0 = new Buffer(4);
					var0.writeByte(2);
					var0.writeMedium(0);
					NetCache.NetCache_socket.write(var0.array, 0, 4);
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var2) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhy;Lfy;B)V",
		garbageValue = "71"
	)
	static final void method64(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class245.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = class247.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class300.method5457(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method4208(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = Huffman.field3203[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field985[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class281.field3323[var0][var1][var2] = 50;
								class281.field3323[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Huffman.field3203[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class281.field3323[var0][var1][var2 + 1] = 50;
								class281.field3323[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Huffman.field3203[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class281.field3323[var0][var1 + 1][var2] = 50;
								class281.field3323[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Huffman.field3203[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class281.field3323[var0][var1][var2] = 50;
								class281.field3323[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Huffman.field3203[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3416(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4214(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field986[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class281.field3323[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class281.field3323[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class281.field3323[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class281.field3323[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3416(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = var4 + 1 & 3;
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field985[var4], Tiles.field985[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = Huffman.field3203[var0][var1];
									var10000[var2] |= 585;
									var10000 = Huffman.field3203[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = Huffman.field3203[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = Huffman.field3203[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = Huffman.field3203[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = Huffman.field3203[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = Huffman.field3203[var0][var1];
									var10000[var2] |= 1170;
									var10000 = Huffman.field3203[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3416(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4214(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field986[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class281.field3323[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class281.field3323[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class281.field3323[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class281.field3323[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method3416(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.method4208(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4214(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field985[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field985[var4], 0, var22 * Tiles.field987[var4], var22 * Tiles.field988[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field980[var4], var22 * Tiles.field979[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class245.getObjectDefinition(InterfaceParent.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field980[var4], var22 * Tiles.field979[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var29 != null && var6.method4208(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method4468() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > class281.field3323[var0][var31 + var1][var32 + var2]) {
									class281.field3323[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1000073039"
	)
	static int method56() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field521;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1977764791"
	)
	static final void method61(boolean var0) {
		if (var0) {
			Client.field519 = Login.field900 ? class112.field1358 : class112.field1362;
		} else {
			Client.field519 = WorldMapDecorationType.clientPreferences.parameters.containsKey(SoundCache.method771(Login.Login_username)) ? class112.field1363 : class112.field1359;
		}

	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	static void method46() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
