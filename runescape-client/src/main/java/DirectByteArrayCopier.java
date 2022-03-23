import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("p")
	static int[][][] field3277;
	@ObfuscatedName("v")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-16"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-308662955"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llq;Ljava/lang/String;Ljava/lang/String;I)[Lql;",
		garbageValue = "-177825093"
	)
	public static SpritePixels[] method5541(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 88
		int var4 = var0.getFileId(var3, var2); // L: 89
		return UserList.method6853(var0, var3, var4); // L: 90
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "1953861280"
	)
	static int method5540(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1882
			class295.Interpreter_intStackSize -= 3; // L: 1883
			KitDefinition.queueSoundEffect(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]); // L: 1884
			return 1; // L: 1885
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1887
			class401.playSong(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1888
			return 1; // L: 1889
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1891
			class295.Interpreter_intStackSize -= 2; // L: 1892
			class145.method3032(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 1893
			return 1; // L: 1894
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1896
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2008
					return var0 == 3211 ? 1 : 2; // L: 2117 2118 2120
				} else {
					var3 = class83.field1081; // L: 2009
					var4 = class82.field1072; // L: 2010
					boolean var8 = false; // L: 2011
					if (var0 == 3214) { // L: 2012
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2013
						var3 = (class83)ChatChannel.findEnumerated(GraphicsObject.method1866(), var6); // L: 2014
						if (var3 == null) { // L: 2015
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2016
						}
					}

					if (var0 == 3215) { // L: 2019
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2020
						var4 = (class82)ChatChannel.findEnumerated(AbstractArchive.method5972(), var6); // L: 2021
						if (var4 == null) { // L: 2022
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2023
						}
					}

					if (var0 == 3210) { // L: 2026
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2027
						var3 = (class83)ChatChannel.findEnumerated(GraphicsObject.method1866(), var6); // L: 2028
						if (var3 == null) { // L: 2029
							var4 = (class82)ChatChannel.findEnumerated(AbstractArchive.method5972(), var6); // L: 2030
							if (var4 == null) { // L: 2031
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2032
							}
						}
					} else if (var0 == 3182) { // L: 2036
						var3 = class83.field1078; // L: 2037
					} else if (var0 == 3204) { // L: 2039
						var4 = class82.field1065; // L: 2040
					} else if (var0 == 3206) { // L: 2042
						var4 = class82.field1069; // L: 2043
					} else if (var0 == 3208) { // L: 2045
						var4 = class82.field1067; // L: 2046
					}

					if (var4 == class82.field1072) { // L: 2048
						switch(var3.field1079) { // L: 2049
						case 1:
							var5 = Interpreter.clientPreferences.method2257() ? 1 : 0; // L: 2067
							break; // L: 2068
						case 2:
							var5 = Interpreter.clientPreferences.method2259() ? 1 : 0; // L: 2062
							break; // L: 2063
						case 3:
							var5 = Interpreter.clientPreferences.method2251() ? 1 : 0; // L: 2057
							break; // L: 2058
						case 4:
							var5 = Interpreter.clientPreferences.method2275(); // L: 2072
							break; // L: 2073
						case 5:
							var5 = ViewportMouse.method4492(); // L: 2052
							break;
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2077
							throw new RuntimeException(var7); // L: 2078
						}
					} else {
						switch(var4.field1068) { // L: 2083
						case 1:
							var5 = Interpreter.clientPreferences.method2255() ? 1 : 0; // L: 2104
							break; // L: 2105
						case 2:
							var6 = Interpreter.clientPreferences.method2288(); // L: 2092
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2093
							break; // L: 2094
						case 3:
							var6 = Interpreter.clientPreferences.method2269(); // L: 2098
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2099
							break; // L: 2100
						case 4:
							var6 = Interpreter.clientPreferences.method2286(); // L: 2086
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2087
							break; // L: 2088
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2109
							throw new RuntimeException(var7); // L: 2110
						}
					}

					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5; // L: 2114
					return 1; // L: 2115
				}
			} else {
				var3 = class83.field1081; // L: 1897
				var4 = class82.field1072; // L: 1898
				var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1899
				if (var0 == 3212) { // L: 1900
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1901
					var3 = (class83)ChatChannel.findEnumerated(GraphicsObject.method1866(), var6); // L: 1902
					if (var3 == null) { // L: 1903
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1904
					}
				}

				if (var0 == 3213) { // L: 1907
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1908
					var4 = (class82)ChatChannel.findEnumerated(AbstractArchive.method5972(), var6); // L: 1909
					if (var4 == null) { // L: 1910
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1911
					}
				}

				if (var0 == 3209) { // L: 1914
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 1915
					var3 = (class83)ChatChannel.findEnumerated(GraphicsObject.method1866(), var6); // L: 1916
					if (var3 == null) { // L: 1917
						var4 = (class82)ChatChannel.findEnumerated(AbstractArchive.method5972(), var6); // L: 1918
						if (var4 == null) { // L: 1919
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1920
						}
					}
				} else if (var0 == 3181) { // L: 1924
					var3 = class83.field1078; // L: 1925
				} else if (var0 == 3203) { // L: 1927
					var4 = class82.field1065; // L: 1928
				} else if (var0 == 3205) { // L: 1930
					var4 = class82.field1069; // L: 1931
				} else if (var0 == 3207) { // L: 1933
					var4 = class82.field1067; // L: 1934
				}

				if (var4 == class82.field1072) { // L: 1936
					switch(var3.field1079) { // L: 1937
					case 1:
						Interpreter.clientPreferences.method2256(var5 == 1); // L: 1961
						break; // L: 1962
					case 2:
						Interpreter.clientPreferences.method2258(var5 == 1); // L: 1966
						break; // L: 1967
					case 3:
						Interpreter.clientPreferences.method2265(var5 == 1); // L: 1956
						break; // L: 1957
					case 4:
						if (var5 < 0) { // L: 1945
							var5 = 0;
						}

						Interpreter.clientPreferences.method2263(var5); // L: 1946
						break; // L: 1947
					case 5:
						WorldMapSection0.method4940(var5); // L: 1940
						break;
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1951
						throw new RuntimeException(var7); // L: 1952
					}
				} else {
					switch(var4.field1068) { // L: 1972
					case 1:
						Interpreter.clientPreferences.method2254(var5 == 1); // L: 1989
						break; // L: 1990
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1982
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 1983
						Tiles.method2040(var6); // L: 1984
						break; // L: 1985
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1975
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1976
						class28.method424(var6); // L: 1977
						break; // L: 1978
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1994
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1995
						class21.method334(var6); // L: 1996
						break; // L: 1997
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2001
						throw new RuntimeException(var7); // L: 2002
					}
				}

				return 1; // L: 2006
			}
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-874180383"
	)
	static final void method5546() {
		class286.method5548(false); // L: 5273
		Client.field541 = 0; // L: 5274
		boolean var0 = true; // L: 5275

		int var1;
		for (var1 = 0; var1 < WorldMapSectionType.regionLandArchives.length; ++var1) { // L: 5276
			if (ObjectComposition.regionMapArchiveIds[var1] != -1 && WorldMapSectionType.regionLandArchives[var1] == null) { // L: 5277 5278
				WorldMapSectionType.regionLandArchives[var1] = class302.archive5.takeFile(ObjectComposition.regionMapArchiveIds[var1], 0); // L: 5279
				if (WorldMapSectionType.regionLandArchives[var1] == null) { // L: 5280
					var0 = false; // L: 5281
					++Client.field541; // L: 5282
				}
			}

			if (Message.regionLandArchiveIds[var1] != -1 && Occluder.regionMapArchives[var1] == null) { // L: 5286 5287
				Occluder.regionMapArchives[var1] = class302.archive5.takeFileEncrypted(Message.regionLandArchiveIds[var1], 0, Message.xteaKeys[var1]); // L: 5288
				if (Occluder.regionMapArchives[var1] == null) { // L: 5289
					var0 = false; // L: 5290
					++Client.field541; // L: 5291
				}
			}
		}

		if (!var0) { // L: 5296
			Client.field545 = 1; // L: 5297
		} else {
			Client.field543 = 0; // L: 5300
			var0 = true; // L: 5301

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapSectionType.regionLandArchives.length; ++var1) { // L: 5302
				byte[] var15 = Occluder.regionMapArchives[var1]; // L: 5303
				if (var15 != null) { // L: 5304
					var3 = (class123.regions[var1] >> 8) * 64 - ApproximateRouteStrategy.baseX; // L: 5305
					var4 = (class123.regions[var1] & 255) * 64 - class250.baseY; // L: 5306
					if (Client.isInInstance) { // L: 5307
						var3 = 10; // L: 5308
						var4 = 10; // L: 5309
					}

					var0 &= class67.method1879(var15, var3, var4); // L: 5311
				}
			}

			if (!var0) { // L: 5314
				Client.field545 = 2; // L: 5315
			} else {
				if (Client.field545 != 0) { // L: 5318
					class119.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				MouseHandler.playPcmPlayers(); // L: 5319
				FriendSystem.scene.clear(); // L: 5320

				for (var1 = 0; var1 < 4; ++var1) { // L: 5321
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5322
					for (var2 = 0; var2 < 104; ++var2) { // L: 5323
						for (var3 = 0; var3 < 104; ++var3) { // L: 5324
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5325
						}
					}
				}

				MouseHandler.playPcmPlayers(); // L: 5329
				Tile.method3992(); // L: 5330
				var1 = WorldMapSectionType.regionLandArchives.length; // L: 5331
				Players.method2419(); // L: 5332
				class286.method5548(true); // L: 5333
				int var5;
				if (!Client.isInInstance) { // L: 5334
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5335
						var3 = (class123.regions[var2] >> 8) * 64 - ApproximateRouteStrategy.baseX; // L: 5336
						var4 = (class123.regions[var2] & 255) * 64 - class250.baseY; // L: 5337
						var14 = WorldMapSectionType.regionLandArchives[var2]; // L: 5338
						if (var14 != null) { // L: 5339
							MouseHandler.playPcmPlayers(); // L: 5340
							ChatChannel.method1991(var14, var3, var4, class193.field2197 * 8 - 48, class221.field2647 * 8 - 48, Client.collisionMaps); // L: 5341
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5344
						var3 = (class123.regions[var2] >> 8) * 64 - ApproximateRouteStrategy.baseX; // L: 5345
						var4 = (class123.regions[var2] & 255) * 64 - class250.baseY; // L: 5346
						var14 = WorldMapSectionType.regionLandArchives[var2]; // L: 5347
						if (var14 == null && class221.field2647 < 800) { // L: 5348
							MouseHandler.playPcmPlayers(); // L: 5349
							WorldMapEvent.method5136(var3, var4, 64, 64); // L: 5350
						}
					}

					class286.method5548(true); // L: 5353

					for (var2 = 0; var2 < var1; ++var2) { // L: 5354
						byte[] var13 = Occluder.regionMapArchives[var2]; // L: 5355
						if (var13 != null) { // L: 5356
							var4 = (class123.regions[var2] >> 8) * 64 - ApproximateRouteStrategy.baseX; // L: 5357
							var5 = (class123.regions[var2] & 255) * 64 - class250.baseY; // L: 5358
							MouseHandler.playPcmPlayers(); // L: 5359
							Canvas.method388(var13, var4, var5, FriendSystem.scene, Client.collisionMaps); // L: 5360
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5364
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5365
						MouseHandler.playPcmPlayers(); // L: 5366

						for (var3 = 0; var3 < 13; ++var3) { // L: 5367
							for (var4 = 0; var4 < 13; ++var4) { // L: 5368
								boolean var16 = false; // L: 5369
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5370
								if (var6 != -1) { // L: 5371
									var7 = var6 >> 24 & 3; // L: 5372
									var8 = var6 >> 1 & 3; // L: 5373
									var9 = var6 >> 14 & 1023; // L: 5374
									var10 = var6 >> 3 & 2047; // L: 5375
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5376

									for (int var12 = 0; var12 < class123.regions.length; ++var12) { // L: 5377
										if (class123.regions[var12] == var11 && WorldMapSectionType.regionLandArchives[var12] != null) { // L: 5378
											WorldMapScaleHandler.method5135(WorldMapSectionType.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5379
											var16 = true; // L: 5380
											break;
										}
									}
								}

								if (!var16) { // L: 5385
									class126.method2820(var2, var3 * 8, var4 * 8); // L: 5386
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5391
						for (var3 = 0; var3 < 13; ++var3) { // L: 5392
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5393
							if (var4 == -1) { // L: 5394
								WorldMapEvent.method5136(var2 * 8, var3 * 8, 8, 8); // L: 5395
							}
						}
					}

					class286.method5548(true); // L: 5399

					for (var2 = 0; var2 < 4; ++var2) { // L: 5400
						MouseHandler.playPcmPlayers(); // L: 5401

						for (var3 = 0; var3 < 13; ++var3) { // L: 5402
							for (var4 = 0; var4 < 13; ++var4) { // L: 5403
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5404
								if (var5 != -1) { // L: 5405
									var6 = var5 >> 24 & 3; // L: 5406
									var7 = var5 >> 1 & 3; // L: 5407
									var8 = var5 >> 14 & 1023; // L: 5408
									var9 = var5 >> 3 & 2047; // L: 5409
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5410

									for (var11 = 0; var11 < class123.regions.length; ++var11) { // L: 5411
										if (class123.regions[var11] == var10 && Occluder.regionMapArchives[var11] != null) { // L: 5412
											Tiles.method2006(Occluder.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, FriendSystem.scene, Client.collisionMaps); // L: 5413
											break; // L: 5414
										}
									}
								}
							}
						}
					}
				}

				class286.method5548(true); // L: 5422
				MouseHandler.playPcmPlayers(); // L: 5423
				Renderable.method4310(FriendSystem.scene, Client.collisionMaps); // L: 5424
				class286.method5548(true); // L: 5425
				var2 = Tiles.Tiles_minPlane; // L: 5426
				if (var2 > class160.Client_plane) { // L: 5427
					var2 = class160.Client_plane;
				}

				if (var2 < class160.Client_plane - 1) { // L: 5428
					var2 = class160.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5429
					FriendSystem.scene.init(Tiles.Tiles_minPlane);
				} else {
					FriendSystem.scene.init(0); // L: 5430
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5431
					for (var4 = 0; var4 < 104; ++var4) { // L: 5432
						class162.updateItemPile(var3, var4); // L: 5433
					}
				}

				MouseHandler.playPcmPlayers(); // L: 5436
				Projectile.method1957(); // L: 5437
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5438
				PacketBufferNode var17;
				if (UserComparator10.client.hasFrame()) { // L: 5439
					var17 = ItemContainer.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher); // L: 5441
					var17.packetBuffer.writeInt(1057001181); // L: 5442
					Client.packetWriter.addNode(var17); // L: 5443
				}

				if (!Client.isInInstance) { // L: 5445
					var3 = (class193.field2197 - 6) / 8; // L: 5446
					var4 = (class193.field2197 + 6) / 8; // L: 5447
					var5 = (class221.field2647 - 6) / 8; // L: 5448
					var6 = (class221.field2647 + 6) / 8; // L: 5449

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5450
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5451
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5452
								class302.archive5.loadRegionFromName("m" + var7 + "_" + var8); // L: 5453
								class302.archive5.loadRegionFromName("l" + var7 + "_" + var8); // L: 5454
							}
						}
					}
				}

				InterfaceParent.updateGameState(30); // L: 5458
				MouseHandler.playPcmPlayers(); // L: 5459
				ScriptEvent.method2111(); // L: 5460
				var17 = ItemContainer.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 5461
				Client.packetWriter.addNode(var17); // L: 5462
				class78.method2098(); // L: 5463
			}
		}
	} // L: 5298 5316 5464

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "465119855"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7442
			if (Client.isLowDetail && var0 != class160.Client_plane) { // L: 7443
				return;
			}

			long var7 = 0L; // L: 7444
			boolean var9 = true; // L: 7445
			boolean var10 = false; // L: 7446
			boolean var11 = false; // L: 7447
			if (var1 == 0) { // L: 7448
				var7 = FriendSystem.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7449
				var7 = FriendSystem.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7450
				var7 = FriendSystem.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7451
				var7 = FriendSystem.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7452
				var12 = FriendSystem.scene.getObjectFlags(var0, var2, var3, var7); // L: 7453
				int var38 = class121.Entity_unpackID(var7); // L: 7454
				int var39 = var12 & 31; // L: 7455
				int var40 = var12 >> 6 & 3; // L: 7456
				ObjectComposition var13;
				if (var1 == 0) { // L: 7457
					FriendSystem.scene.removeBoundaryObject(var0, var2, var3); // L: 7458
					var13 = class116.getObjectDefinition(var38); // L: 7459
					if (var13.interactType != 0) { // L: 7460
						Client.collisionMaps[var0].method3843(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7462
					FriendSystem.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7463
					FriendSystem.scene.removeGameObject(var0, var2, var3); // L: 7464
					var13 = class116.getObjectDefinition(var38); // L: 7465
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7466
						return;
					}

					if (var13.interactType != 0) { // L: 7467
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7469
					FriendSystem.scene.removeFloorDecoration(var0, var2, var3); // L: 7470
					var13 = class116.getObjectDefinition(var38); // L: 7471
					if (var13.interactType == 1) { // L: 7472
						Client.collisionMaps[var0].method3846(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7475
				var12 = var0; // L: 7476
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7477
					var12 = var0 + 1;
				}

				Scene var41 = FriendSystem.scene; // L: 7478
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7479
				ObjectComposition var15 = class116.getObjectDefinition(var4); // L: 7481
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7484
					var16 = var15.sizeX; // L: 7489
					var17 = var15.sizeY; // L: 7490
				} else {
					var16 = var15.sizeY; // L: 7485
					var17 = var15.sizeX; // L: 7486
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7496
					var18 = (var16 >> 1) + var2; // L: 7497
					var19 = var2 + (var16 + 1 >> 1); // L: 7498
				} else {
					var18 = var2; // L: 7501
					var19 = var2 + 1; // L: 7502
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7504
					var20 = var3 + (var17 >> 1); // L: 7505
					var21 = var3 + (var17 + 1 >> 1); // L: 7506
				} else {
					var20 = var3; // L: 7509
					var21 = var3 + 1; // L: 7510
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7512
				int var23 = var22[var18][var21] + var22[var19][var20] + var22[var18][var20] + var22[var19][var21] >> 2; // L: 7513
				int var24 = (var2 << 7) + (var16 << 6); // L: 7514
				int var25 = (var3 << 7) + (var17 << 6); // L: 7515
				long var26 = MilliClock.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7516
				int var28 = (var5 << 6) + var6; // L: 7517
				if (var15.int3 == 1) { // L: 7518
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7519
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7521
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7522
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7523
					if (var15.interactType == 1) { // L: 7524
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7527
					if (var6 >= 12) { // L: 7535
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7537
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7538
						}

						var41.method4138(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7539
						if (var15.interactType != 0) { // L: 7540
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7543
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7545
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7546
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field988[var5], 0, var26, var28); // L: 7547
						if (var15.interactType != 0) { // L: 7548
							var14.method3838(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7551
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7553
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7554
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field989[var5], 0, var26, var28); // L: 7555
						if (var15.interactType != 0) { // L: 7556
							var14.method3838(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7559
							var29 = var5 + 1 & 3; // L: 7560
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7563
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7564
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7565
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7568
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7569
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field988[var5], Tiles.field988[var29], var26, var28); // L: 7571
							if (var15.interactType != 0) { // L: 7572
								var14.method3838(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7575
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7577
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7578
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field989[var5], 0, var26, var28); // L: 7579
							if (var15.interactType != 0) { // L: 7580
								var14.method3838(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7583
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7585
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7586
							}

							var41.method4138(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7587
							if (var15.interactType != 0) { // L: 7588
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7591
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7593
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7594
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field988[var5], 0, 0, 0, var26, var28); // L: 7595
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7598
								var29 = 16; // L: 7599
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7600
								if (0L != var30) { // L: 7601
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7603
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7604
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field988[var5], 0, var29 * Tiles.field990[var5], var29 * Tiles.field991[var5], var26, var28); // L: 7605
							} else if (var6 == 6) { // L: 7608
								var29 = 8; // L: 7609
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7610
								if (0L != var30) { // L: 7611
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7613
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7614
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field1000[var5], var29 * Tiles.field993[var5], var26, var28); // L: 7615
							} else if (var6 == 7) { // L: 7618
								int var35 = var5 + 2 & 3; // L: 7620
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7621
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7622
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7623
							} else if (var6 == 8) { // L: 7626
								var29 = 8; // L: 7627
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7628
								if (0L != var30) { // L: 7629
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7632
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7633
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7634
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7635
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7638
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7639
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field1000[var5], var29 * Tiles.field993[var5], var26, var28); // L: 7641
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7529
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7530
					}

					if (var36 != null) { // L: 7531
						var41.method4138(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7532
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 7646

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lkn;Lgz;IIZI)V",
		garbageValue = "-1597453701"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10374
		byte var6 = -1; // L: 10375
		String var7 = null; // L: 10376
		if (var5 != null && var5[var3] != null) { // L: 10377
			if (var3 == 0) { // L: 10378
				var6 = 33;
			} else if (var3 == 1) { // L: 10379
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10380
			} else if (var3 == 3) { // L: 10381
				var6 = 36;
			} else {
				var6 = 37; // L: 10382
			}

			var7 = var5[var3]; // L: 10383
		} else if (var3 == 4) { // L: 10386
			var6 = 37; // L: 10387
			var7 = "Drop"; // L: 10388
		}

		if (var6 != -1 && var7 != null) { // L: 10391
			DynamicObject.insertMenuItem(var7, ChatChannel.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10392
		}

	} // L: 10394
}
