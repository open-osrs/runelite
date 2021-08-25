import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 345312141
	)
	static int field447;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 222177301
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1290618837
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("m")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("k")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1508115242"
	)
	static void method1085() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			PlatformInfo.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(WorldMapManager.method3679("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var20 = var7.readLong();
						var1 = var20;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var28) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var29 = Login.Login_username;
				Random var30 = new Random();
				Buffer var24 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var30.nextInt(), var30.nextInt(), (int)(var1 >> 32), (int)var1};
				var24.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var24.writeInt(var30.nextInt());
				}

				var24.writeInt(var10[0]);
				var24.writeInt(var10[1]);
				var24.writeLong(var1);
				var24.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var24.writeInt(var30.nextInt());
				}

				var24.encryptRsa(class65.field849, class65.field853);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var30.nextInt());
				}

				var9.writeLong(var30.nextLong());
				var9.writeLongMedium(var30.nextLong());
				ClientPreferences.method2195(var9);
				var9.writeLong(var30.nextLong());
				var9.encryptRsa(class65.field849, class65.field853);
				var11 = BufferedSink.stringCp1252NullTerminatedByteSize(var29);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var29);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var12.offset + var24.offset + var9.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var24.offset);
				var13.writeBytes(var24.array, 0, var24.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				String var14 = Message.method1104(var13.array);

				byte var25;
				try {
					URL var15 = new URL(WorldMapManager.method3679("services", false) + "m=accountappeal/login.ws");
					URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write("data2=" + VertexNormal.method4478(var14) + "&dest=" + VertexNormal.method4478("passwordchoice.ws"));
					var17.flush();
					InputStream var18 = var16.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var19 = var18.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var26 = new String(var13.array);
							if (var26.startsWith("OFFLINE")) {
								var25 = 4;
							} else if (var26.startsWith("WRONG")) {
								var25 = 7;
							} else if (var26.startsWith("RELOAD")) {
								var25 = 3;
							} else if (var26.startsWith("Not permitted for social network accounts.")) {
								var25 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var26 = new String(var13.array, 0, var13.offset);
								if (WorldMapScaleHandler.method3907(var26)) {
									Interpreter.openURL(var26, true, false);
									var25 = 2;
								} else {
									var25 = 5;
								}
							}
							break;
						}

						var13.offset += var19;
						if (var13.offset >= 1000) {
							var25 = 5;
							break;
						}
					}
				} catch (Throwable var27) {
					var27.printStackTrace();
					var25 = 5;
				}

				var0 = var25;
			}

			switch(var0) {
			case 2:
				PlatformInfo.setLoginResponseString(Strings.field3609, Strings.field3610, Strings.field3611);
				Message.method1113(6);
				break;
			case 3:
				PlatformInfo.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				PlatformInfo.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				PlatformInfo.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				PlatformInfo.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				PlatformInfo.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lbh;S)V",
		garbageValue = "28449"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != Huffman.ItemDefinition_inMembersWorld) {
				Client.method1330();
				Huffman.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = World.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else {
				class394.logoSprite = class196.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		class279.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		GameBuild.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		AbstractWorldMapIcon.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		ClientPreferences.currentPort = GameBuild.worldPort;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lip;I)V",
		garbageValue = "1826318148"
	)
	static final void method1086(class240 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class240.field2749 == var0) {
			var2 = var1.method7007();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field549[var3];
			var6 = var1.readUnsignedByte();
			var7 = (var6 >> 4 & 7) + JagexCache.field1559;
			var8 = (var6 & 7) + WorldMapEvent.field2216;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				ParamComposition.updatePendingSpawn(class391.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
			}

		} else {
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			byte var37;
			if (class240.field2758 == var0) {
				var37 = var1.readByte();
				var3 = var1.method6856();
				var4 = var1.method6844();
				var5 = var1.readUnsignedByte();
				var6 = (var5 >> 4 & 7) + JagexCache.field1559;
				var7 = (var5 & 7) + WorldMapEvent.field2216;
				var8 = var1.method6844() * 4;
				var9 = var1.method7007();
				var10 = var1.method6940();
				var11 = var1.method6940();
				byte var40 = var1.method6899();
				var13 = var1.method6844() * 4;
				int var41 = var1.method6940();
				var2 = var37 + var6;
				var12 = var40 + var7;
				if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var2 >= 0 && var12 >= 0 && var2 < 104 && var12 < 104 && var11 != 65535) {
					var6 = var6 * 128 + 64;
					var7 = var7 * 128 + 64;
					var2 = var2 * 128 + 64;
					var12 = var12 * 128 + 64;
					Projectile var36 = new Projectile(var11, class391.Client_plane, var6, var7, GraphicsObject.getTileHeight(var6, var7, class391.Client_plane) - var13, var41 + Client.cycle, var10 + Client.cycle, var4, var9, var3, var8);
					var36.setDestination(var2, var12, GraphicsObject.getTileHeight(var2, var12, class391.Client_plane) - var8, var41 + Client.cycle);
					Client.projectiles.addFirst(var36);
				}

			} else {
				if (class240.field2755 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByte();
					var4 = var3 >> 4 & 15;
					var5 = var3 & 7;
					var6 = var1.method7007();
					var7 = (var6 >> 4 & 7) + JagexCache.field1559;
					var8 = (var6 & 7) + WorldMapEvent.field2216;
					var9 = var1.method7007();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var10 = var4 + 1;
						if (class129.localPlayer.pathX[0] >= var7 - var10 && class129.localPlayer.pathX[0] <= var7 + var10 && class129.localPlayer.pathY[0] >= var8 - var10 && class129.localPlayer.pathY[0] <= var10 + var8 && VarbitComposition.clientPreferences.areaSoundEffectsVolume != 0 && var5 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var2;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var4 + (var8 << 8) + (var7 << 16);
							++Client.soundEffectCount;
						}
					}
				}

				TileItem var35;
				if (class240.field2752 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedShort();
					var4 = var1.method6844();
					var5 = (var4 >> 4 & 7) + JagexCache.field1559;
					var6 = (var4 & 7) + WorldMapEvent.field2216;
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var35 = new TileItem();
						var35.id = var3;
						var35.quantity = var2;
						if (Client.groundItems[class391.Client_plane][var5][var6] == null) {
							Client.groundItems[class391.Client_plane][var5][var6] = new NodeDeque();
						}

						Client.groundItems[class391.Client_plane][var5][var6].addFirst(var35);
						SoundSystem.updateItemPile(var5, var6);
					}

				} else if (class240.field2751 == var0) {
					var2 = var1.method6940();
					var3 = var1.readUnsignedByte();
					var4 = (var3 >> 4 & 7) + JagexCache.field1559;
					var5 = (var3 & 7) + WorldMapEvent.field2216;
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						NodeDeque var34 = Client.groundItems[class391.Client_plane][var4][var5];
						if (var34 != null) {
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
								if ((var2 & 32767) == var35.id) {
									var35.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[class391.Client_plane][var4][var5] = null;
							}

							SoundSystem.updateItemPile(var4, var5);
						}
					}

				} else if (class240.field2750 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method7007();
					var4 = (var3 >> 4 & 7) + JagexCache.field1559;
					var5 = (var3 & 7) + WorldMapEvent.field2216;
					var6 = var1.readUnsignedByte();
					var7 = var6 >> 2;
					var8 = var6 & 3;
					var9 = Client.field549[var7];
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						ParamComposition.updatePendingSpawn(class391.Client_plane, var4, var5, var9, var2, var7, var8, 0, -1);
					}

				} else if (class240.field2756 == var0) {
					var2 = var1.method7007();
					var3 = (var2 >> 4 & 7) + JagexCache.field1559;
					var4 = (var2 & 7) + WorldMapEvent.field2216;
					var5 = var1.method6853();
					var6 = var1.method6844();
					var7 = var6 >> 2;
					var8 = var6 & 3;
					var9 = Client.field549[var7];
					if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
						if (var9 == 0) {
							BoundaryObject var33 = CollisionMap.scene.method4155(class391.Client_plane, var3, var4);
							if (var33 != null) {
								var11 = HealthBarDefinition.Entity_unpackID(var33.tag);
								if (var7 == 2) {
									var33.renderable1 = new DynamicObject(var11, 2, var8 + 4, class391.Client_plane, var3, var4, var5, false, var33.renderable1);
									var33.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class391.Client_plane, var3, var4, var5, false, var33.renderable2);
								} else {
									var33.renderable1 = new DynamicObject(var11, var7, var8, class391.Client_plane, var3, var4, var5, false, var33.renderable1);
								}
							}
						}

						if (var9 == 1) {
							WallDecoration var43 = CollisionMap.scene.method4156(class391.Client_plane, var3, var4);
							if (var43 != null) {
								var11 = HealthBarDefinition.Entity_unpackID(var43.tag);
								if (var7 != 4 && var7 != 5) {
									if (var7 == 6) {
										var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class391.Client_plane, var3, var4, var5, false, var43.renderable1);
									} else if (var7 == 7) {
										var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class391.Client_plane, var3, var4, var5, false, var43.renderable1);
									} else if (var7 == 8) {
										var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, class391.Client_plane, var3, var4, var5, false, var43.renderable1);
										var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class391.Client_plane, var3, var4, var5, false, var43.renderable2);
									}
								} else {
									var43.renderable1 = new DynamicObject(var11, 4, var8, class391.Client_plane, var3, var4, var5, false, var43.renderable1);
								}
							}
						}

						if (var9 == 2) {
							GameObject var44 = CollisionMap.scene.method4180(class391.Client_plane, var3, var4);
							if (var7 == 11) {
								var7 = 10;
							}

							if (var44 != null) {
								var44.renderable = new DynamicObject(HealthBarDefinition.Entity_unpackID(var44.tag), var7, var8, class391.Client_plane, var3, var4, var5, false, var44.renderable);
							}
						}

						if (var9 == 3) {
							FloorDecoration var45 = CollisionMap.scene.getFloorDecoration(class391.Client_plane, var3, var4);
							if (var45 != null) {
								var45.renderable = new DynamicObject(HealthBarDefinition.Entity_unpackID(var45.tag), 22, var8, class391.Client_plane, var3, var4, var5, false, var45.renderable);
							}
						}
					}

				} else if (class240.field2760 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method6940();
					var4 = var1.method6844();
					var5 = (var4 >> 4 & 7) + JagexCache.field1559;
					var6 = (var4 & 7) + WorldMapEvent.field2216;
					var7 = var1.readUnsignedByte();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var5 = var5 * 128 + 64;
						var6 = var6 * 128 + 64;
						GraphicsObject var42 = new GraphicsObject(var3, class391.Client_plane, var5, var6, GraphicsObject.getTileHeight(var5, var6, class391.Client_plane) - var7, var2, Client.cycle);
						Client.graphicsObjects.addFirst(var42);
					}

				} else {
					if (class240.field2753 == var0) {
						var37 = var1.method6901();
						var3 = var1.readUnsignedByte();
						var4 = (var3 >> 4 & 7) + JagexCache.field1559;
						var5 = (var3 & 7) + WorldMapEvent.field2216;
						var6 = var1.method6940();
						byte var38 = var1.readByte();
						var8 = var1.readUnsignedShort();
						byte var39 = var1.method6848();
						var10 = var1.method7007();
						var11 = var10 >> 2;
						var12 = var10 & 3;
						var13 = Client.field549[var11];
						byte var14 = var1.readByte();
						int var15 = var1.method6855();
						int var16 = var1.readUnsignedShort();
						Player var17;
						if (var15 == Client.localPlayerIndex) {
							var17 = class129.localPlayer;
						} else {
							var17 = Client.players[var15];
						}

						if (var17 != null) {
							ObjectComposition var18 = HitSplatDefinition.getObjectDefinition(var8);
							int var19;
							int var20;
							if (var12 != 1 && var12 != 3) {
								var19 = var18.sizeX;
								var20 = var18.sizeY;
							} else {
								var19 = var18.sizeY;
								var20 = var18.sizeX;
							}

							int var21 = var4 + (var19 >> 1);
							int var22 = var4 + (var19 + 1 >> 1);
							int var23 = var5 + (var20 >> 1);
							int var24 = var5 + (var20 + 1 >> 1);
							int[][] var25 = Tiles.Tiles_heights[class391.Client_plane];
							int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
							int var27 = (var4 << 7) + (var19 << 6);
							int var28 = (var5 << 7) + (var20 << 6);
							Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28);
							if (var29 != null) {
								ParamComposition.updatePendingSpawn(class391.Client_plane, var4, var5, var13, -1, 0, 0, var6 + 1, var16 + 1);
								var17.animationCycleStart = var6 + Client.cycle;
								var17.animationCycleEnd = var16 + Client.cycle;
								var17.model0 = var29;
								var17.field1058 = var19 * 64 + var4 * 128;
								var17.field1060 = var20 * 64 + var5 * 128;
								var17.tileHeight2 = var26;
								byte var30;
								if (var38 > var37) {
									var30 = var38;
									var38 = var37;
									var37 = var30;
								}

								if (var14 > var39) {
									var30 = var14;
									var14 = var39;
									var39 = var30;
								}

								var17.minX = var4 + var38;
								var17.maxX = var4 + var37;
								var17.minY = var5 + var14;
								var17.maxY = var5 + var39;
							}
						}
					}

					if (class240.field2757 == var0) {
						var2 = var1.method6940();
						var3 = var1.method6940();
						var4 = var1.method6940();
						var5 = var1.method6849();
						var6 = (var5 >> 4 & 7) + JagexCache.field1559;
						var7 = (var5 & 7) + WorldMapEvent.field2216;
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							NodeDeque var31 = Client.groundItems[class391.Client_plane][var6][var7];
							if (var31 != null) {
								for (TileItem var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
									if ((var4 & 32767) == var32.id && var3 == var32.quantity) {
										var32.quantity = var2;
										break;
									}
								}

								SoundSystem.updateItemPile(var6, var7);
							}
						}

					}
				}
			}
		}
	}
}
