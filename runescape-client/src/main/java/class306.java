import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class306 {
	@ObfuscatedName("gv")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lci;IILgn;I)V",
		garbageValue = "-1866135565"
	)
	static final void method5765(Player var0, int var1, int var2, class192 var3) {
		int var4 = var0.pathX[0]; // L: 8214
		int var5 = var0.pathY[0]; // L: 8215
		int var6 = var0.transformedSize(); // L: 8216
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8217
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8218
				int var8 = var0.transformedSize(); // L: 8220
				RouteStrategy var9 = VerticalAlignment.method3533(var1, var2); // L: 8221
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 8222
				int[] var11 = Client.field674; // L: 8223
				int[] var12 = Client.field776; // L: 8224

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) { // L: 8226
					for (var14 = 0; var14 < 128; ++var14) { // L: 8227
						class193.directions[var13][var14] = 0; // L: 8228
						class193.distances[var13][var14] = 99999999; // L: 8229
					}
				}

				int var15;
				int var16;
				byte var18;
				int var19;
				int var20;
				int var22;
				int var24;
				int var25;
				int var26;
				boolean var33;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) { // L: 8233
					var15 = var4; // L: 8236
					var16 = var5; // L: 8237
					byte var17 = 64; // L: 8238
					var18 = 64; // L: 8239
					var19 = var4 - var17; // L: 8240
					var20 = var5 - var18; // L: 8241
					class193.directions[var17][var18] = 99; // L: 8242
					class193.distances[var17][var18] = 0; // L: 8243
					byte var21 = 0; // L: 8244
					var22 = 0; // L: 8245
					class193.bufferX[var21] = var4; // L: 8246
					var38 = var21 + 1;
					class193.bufferY[var21] = var5; // L: 8247
					int[][] var23 = var10.flags; // L: 8248

					boolean var34;
					while (true) {
						if (var38 == var22) { // L: 8251
							class193.field2219 = var15; // L: 8323
							class394.field4429 = var16; // L: 8324
							var34 = false; // L: 8325
							break;
						}

						var15 = class193.bufferX[var22]; // L: 8252
						var16 = class193.bufferY[var22]; // L: 8253
						var22 = var22 + 1 & 4095; // L: 8254
						var35 = var15 - var19; // L: 8255
						var36 = var16 - var20; // L: 8256
						var24 = var15 - var10.xInset; // L: 8257
						var25 = var16 - var10.yInset; // L: 8258
						if (var9.hasArrived(1, var15, var16, var10)) { // L: 8259
							class193.field2219 = var15; // L: 8260
							class394.field4429 = var16; // L: 8261
							var34 = true; // L: 8262
							break;
						}

						var26 = class193.distances[var35][var36] + 1; // L: 8265
						if (var35 > 0 && class193.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) { // L: 8266
							class193.bufferX[var38] = var15 - 1; // L: 8267
							class193.bufferY[var38] = var16; // L: 8268
							var38 = var38 + 1 & 4095; // L: 8269
							class193.directions[var35 - 1][var36] = 2; // L: 8270
							class193.distances[var35 - 1][var36] = var26; // L: 8271
						}

						if (var35 < 127 && class193.directions[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) { // L: 8273
							class193.bufferX[var38] = var15 + 1; // L: 8274
							class193.bufferY[var38] = var16; // L: 8275
							var38 = var38 + 1 & 4095; // L: 8276
							class193.directions[var35 + 1][var36] = 8; // L: 8277
							class193.distances[var35 + 1][var36] = var26; // L: 8278
						}

						if (var36 > 0 && class193.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 8280
							class193.bufferX[var38] = var15; // L: 8281
							class193.bufferY[var38] = var16 - 1; // L: 8282
							var38 = var38 + 1 & 4095; // L: 8283
							class193.directions[var35][var36 - 1] = 1; // L: 8284
							class193.distances[var35][var36 - 1] = var26; // L: 8285
						}

						if (var36 < 127 && class193.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 8287
							class193.bufferX[var38] = var15; // L: 8288
							class193.bufferY[var38] = var16 + 1; // L: 8289
							var38 = var38 + 1 & 4095; // L: 8290
							class193.directions[var35][var36 + 1] = 4; // L: 8291
							class193.distances[var35][var36 + 1] = var26; // L: 8292
						}

						if (var35 > 0 && var36 > 0 && class193.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 8294
							class193.bufferX[var38] = var15 - 1; // L: 8295
							class193.bufferY[var38] = var16 - 1; // L: 8296
							var38 = var38 + 1 & 4095; // L: 8297
							class193.directions[var35 - 1][var36 - 1] = 3; // L: 8298
							class193.distances[var35 - 1][var36 - 1] = var26; // L: 8299
						}

						if (var35 < 127 && var36 > 0 && class193.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) { // L: 8301
							class193.bufferX[var38] = var15 + 1; // L: 8302
							class193.bufferY[var38] = var16 - 1; // L: 8303
							var38 = var38 + 1 & 4095; // L: 8304
							class193.directions[var35 + 1][var36 - 1] = 9; // L: 8305
							class193.distances[var35 + 1][var36 - 1] = var26; // L: 8306
						}

						if (var35 > 0 && var36 < 127 && class193.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 8308
							class193.bufferX[var38] = var15 - 1; // L: 8309
							class193.bufferY[var38] = var16 + 1; // L: 8310
							var38 = var38 + 1 & 4095; // L: 8311
							class193.directions[var35 - 1][var36 + 1] = 6; // L: 8312
							class193.distances[var35 - 1][var36 + 1] = var26; // L: 8313
						}

						if (var35 < 127 && var36 < 127 && class193.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) { // L: 8315
							class193.bufferX[var38] = var15 + 1; // L: 8316
							class193.bufferY[var38] = var16 + 1; // L: 8317
							var38 = var38 + 1 & 4095; // L: 8318
							class193.directions[var35 + 1][var36 + 1] = 12; // L: 8319
							class193.distances[var35 + 1][var36 + 1] = var26; // L: 8320
						}
					}

					var33 = var34; // L: 8327
				} else if (var8 == 2) { // L: 8329
					var33 = WorldMapIcon_1.method4592(var4, var5, var9, var10);
				} else {
					var33 = class127.method2844(var4, var5, var8, var9, var10); // L: 8330
				}

				int var7;
				label346: {
					var14 = var4 - 64; // L: 8331
					var15 = var5 - 64; // L: 8332
					var16 = class193.field2219; // L: 8333
					var35 = class394.field4429; // L: 8334
					if (!var33) { // L: 8335
						var36 = Integer.MAX_VALUE; // L: 8337
						var19 = Integer.MAX_VALUE; // L: 8338
						byte var37 = 10; // L: 8339
						var38 = var9.approxDestinationX; // L: 8340
						var22 = var9.approxDestinationY; // L: 8341
						int var32 = var9.approxDestinationSizeX; // L: 8342
						var24 = var9.approxDestinationSizeY; // L: 8343

						for (var25 = var38 - var37; var25 <= var37 + var38; ++var25) { // L: 8344
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) { // L: 8345
								int var27 = var25 - var14; // L: 8346
								int var28 = var26 - var15; // L: 8347
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class193.distances[var27][var28] < 100) { // L: 8348 8349
									int var29 = 0; // L: 8350
									if (var25 < var38) { // L: 8351
										var29 = var38 - var25;
									} else if (var25 > var32 + var38 - 1) { // L: 8352
										var29 = var25 - (var38 + var32 - 1);
									}

									int var30 = 0; // L: 8353
									if (var26 < var22) { // L: 8354
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) { // L: 8355
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var30 * var30 + var29 * var29; // L: 8356
									if (var31 < var36 || var36 == var31 && class193.distances[var27][var28] < var19) { // L: 8357
										var36 = var31; // L: 8358
										var19 = class193.distances[var27][var28]; // L: 8359
										var16 = var25; // L: 8360
										var35 = var26; // L: 8361
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) { // L: 8367
							var7 = -1; // L: 8368
							break label346;
						}
					}

					if (var16 == var4 && var5 == var35) { // L: 8377
						var11[0] = var16; // L: 8378
						var12[0] = var35; // L: 8379
						var7 = 0; // L: 8380
					} else {
						var18 = 0; // L: 8383
						class193.bufferX[var18] = var16; // L: 8386
						var36 = var18 + 1;
						class193.bufferY[var18] = var35; // L: 8387

						for (var19 = var20 = class193.directions[var16 - var14][var35 - var15]; var4 != var16 || var35 != var5; var19 = class193.directions[var16 - var14][var35 - var15]) { // L: 8388 8389 8399
							if (var19 != var20) { // L: 8390
								var20 = var19; // L: 8391
								class193.bufferX[var36] = var16; // L: 8392
								class193.bufferY[var36++] = var35; // L: 8393
							}

							if ((var19 & 2) != 0) { // L: 8395
								++var16;
							} else if ((var19 & 8) != 0) { // L: 8396
								--var16;
							}

							if ((var19 & 1) != 0) { // L: 8397
								++var35;
							} else if ((var19 & 4) != 0) { // L: 8398
								--var35;
							}
						}

						var38 = 0; // L: 8401

						while (var36-- > 0) { // L: 8402
							var11[var38] = class193.bufferX[var36]; // L: 8403
							var12[var38++] = class193.bufferY[var36]; // L: 8404
							if (var38 >= var11.length) { // L: 8405
								break;
							}
						}

						var7 = var38; // L: 8407
					}
				}

				var13 = var7; // L: 8409
				if (var7 >= 1) { // L: 8410
					for (var14 = 0; var14 < var13 - 1; ++var14) { // L: 8411
						var0.method2141(Client.field674[var14], Client.field776[var14], var3);
					}

				}
			}
		}
	} // L: 8412

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "171777159"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		GraphicsObject.method1870(); // L: 11866

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 11868
			if (var1.obj != null) { // L: 11869
				var1.set();
			}
		}

		int var3 = FloorUnderlayDefinition.VarpDefinition_get(var0).type; // L: 11872
		if (var3 != 0) { // L: 11873
			int var2 = Varps.Varps_main[var0]; // L: 11874
			if (var3 == 1) { // L: 11875
				if (var2 == 1) { // L: 11876
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 11877
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 11878
					Projectile.method1959(); // L: 11879
					class19.clientPreferences.method2255(0.9D); // L: 11880
				}

				if (var2 == 2) { // L: 11882
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 11883
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 11884
					Projectile.method1959(); // L: 11885
					class19.clientPreferences.method2255(0.8D); // L: 11886
				}

				if (var2 == 3) { // L: 11888
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 11889
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 11890
					Projectile.method1959(); // L: 11891
					class19.clientPreferences.method2255(0.7D); // L: 11892
				}

				if (var2 == 4) { // L: 11894
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 11895
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 11896
					Projectile.method1959(); // L: 11897
					class19.clientPreferences.method2255(0.6D); // L: 11898
				}
			}

			if (var3 == 3) { // L: 11901
				if (var2 == 0) { // L: 11902
					PacketBufferNode.method5196(255);
				}

				if (var2 == 1) { // L: 11903
					PacketBufferNode.method5196(192);
				}

				if (var2 == 2) { // L: 11904
					PacketBufferNode.method5196(128);
				}

				if (var2 == 3) {
					PacketBufferNode.method5196(64); // L: 11905
				}

				if (var2 == 4) { // L: 11906
					PacketBufferNode.method5196(0);
				}
			}

			if (var3 == 4) { // L: 11908
				if (var2 == 0) { // L: 11909
					WorldMapData_0.method4563(127);
				}

				if (var2 == 1) { // L: 11910
					WorldMapData_0.method4563(96);
				}

				if (var2 == 2) { // L: 11911
					WorldMapData_0.method4563(64);
				}

				if (var2 == 3) { // L: 11912
					WorldMapData_0.method4563(32);
				}

				if (var2 == 4) { // L: 11913
					WorldMapData_0.method4563(0);
				}
			}

			if (var3 == 5) { // L: 11915
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) { // L: 11916
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 11917
				Client.field676 = var2;
			}

			if (var3 == 10) { // L: 11918
				if (var2 == 0) { // L: 11919
					WorldMapEvent.method5121(127);
				}

				if (var2 == 1) { // L: 11920
					WorldMapEvent.method5121(96);
				}

				if (var2 == 2) { // L: 11921
					WorldMapEvent.method5121(64);
				}

				if (var2 == 3) { // L: 11922
					WorldMapEvent.method5121(32);
				}

				if (var2 == 4) { // L: 11923
					WorldMapEvent.method5121(0);
				}
			}

			if (var3 == 17) { // L: 11925
				Client.followerIndex = var2 & 65535; // L: 11926
			}

			if (var3 == 18) { // L: 11928
				Client.playerAttackOption = (AttackOption)Actor.findEnumerated(class7.method52(), var2); // L: 11929
				if (Client.playerAttackOption == null) { // L: 11930
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 11932
				if (var2 == -1) { // L: 11933
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11934
				}
			}

			if (var3 == 22) { // L: 11936
				Client.npcAttackOption = (AttackOption)Actor.findEnumerated(class7.method52(), var2); // L: 11937
				if (Client.npcAttackOption == null) { // L: 11938
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11940
}
