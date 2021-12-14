import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1331844199
	)
	@Export("id")
	int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -256285215
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("n")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class194 field2290;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2290 = new class194(var3, var4);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2086831010"
	)
	public int method3949() {
		return this.count;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgq;",
		garbageValue = "1597567435"
	)
	public class194 method3943() {
		return this.field2290;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbn;",
		garbageValue = "1"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapSection2.method4414(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = TaskHandler.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label59: {
					byte[] var8 = TaskHandler.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label59;
						}

						var5 = class145.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label59;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			int var12 = (-3 - var2 << 8) + var0;
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16));
			Script var13;
			if (var14 != null) {
				var13 = var14;
			} else {
				String var9 = String.valueOf(var12);
				int var10 = TaskHandler.archive12.getGroupId(var9);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = TaskHandler.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var14 = class145.newScript(var11);
						if (var14 != null) {
							Script.Script_cached.put(var14, (long)(var12 << 16));
							var13 = var14;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Loz;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method3948(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "211610749"
	)
	static String method3944(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lam;Llx;I)V",
		garbageValue = "1471521185"
	)
	static void method3947(GameEngine var0, Font var1) {
		int var5;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!NPCComposition.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class150.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var2 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(0, 1);
						break;
					}

					int var3 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(1, 1);
						break;
					}

					int var35 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(2, 1);
						break;
					}

					var5 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						UserComparator3.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0);
						NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var6 = class334.World_worlds[Login.hoveredWorldIndex];
						BoundaryObject.changeWorld(var6);
						Login.worldSelectOpen = false;
						WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0);
						NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
					} else {
						if (Login.worldSelectPage > 0 && class11.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class11.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= BoundaryObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= BoundaryObject.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && UrlRequest.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class186.canvasWidth - UrlRequest.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class186.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= BoundaryObject.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= BoundaryObject.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (Players.field1247 == 13) {
					Login.worldSelectOpen = false;
					WorldMapCacheName.leftTitleSprite.drawAt(Login.xPadding, 0);
					NPC.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
					break;
				}

				if (Players.field1247 == 96) {
					if (Login.worldSelectPage > 0 && class11.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (Players.field1247 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && UrlRequest.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				SecureRandomFuture.clientPreferences.titleMusicDisabled = !SecureRandomFuture.clientPreferences.titleMusicDisabled;
				class127.savePreferences();
				if (!SecureRandomFuture.clientPreferences.titleMusicDisabled) {
					Players.method2382(WorldMapScaleHandler.archive6, "scape main", "", 255, false);
				} else {
					StructComposition.method3444();
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field890) {
					Login.field890 = Ignored.method6459() + 1000L;
				}

				long var22 = Ignored.method6459();
				boolean var4;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var4 = true;
							break;
						}

						ArchiveLoader var24 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var24.isLoaded()) {
							var4 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var4 = true;
				}

				if (var4 && -1L == Login.field869) {
					Login.field869 = var22;
					if (Login.field869 > Login.field890) {
						Login.field890 = Login.field869;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == ScriptFrame.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var25 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var25 && MouseHandler.MouseHandler_lastPressedY <= var8 + var25) {
								if (PlayerComposition.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (HorizontalAlignment.World_request != null && PlayerComposition.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var50 = MouseHandler.MouseHandler_lastPressedX;
					int var36 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var50 = MouseHandler.MouseHandler_x;
						var36 = MouseHandler.MouseHandler_y;
					}

					if (!class150.mouseCam && var5 == 4) {
						var5 = 1;
					}

					short var39;
					int var41;
					if (Login.loginIndex == 0) {
						boolean var48 = false;

						while (NPCComposition.isKeyDown()) {
							if (Players.field1247 == 84) {
								var48 = true;
							}
						}

						var41 = class138.loginBoxCenter - 80;
						var39 = 291;
						if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
							WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var41 = class138.loginBoxCenter + 80;
						if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20 || var48) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								PlayerType.method5521(1);
								WorldMapID.method4805();
							} else if ((Client.worldProperties & 4) != 0) {
								if ((Client.worldProperties & 1024) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								PlayerType.method5521(1);
								WorldMapID.method4805();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								PlayerType.method5521(1);
								WorldMapID.method4805();
							} else {
								class67.Login_promptCredentials(false);
							}
						}
					} else {
						short var9;
						int var37;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!NPCComposition.isKeyDown()) {
									var37 = class138.loginBoxCenter - 80;
									var9 = 321;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										class67.Login_promptCredentials(false);
									}

									var37 = class138.loginBoxCenter + 80;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										PlayerType.method5521(0);
									}
									break;
								}

								if (Players.field1247 == 84) {
									class67.Login_promptCredentials(false);
								} else if (Players.field1247 == 13) {
									PlayerType.method5521(0);
								}
							}
						} else {
							int var12;
							short var38;
							boolean var40;
							if (Login.loginIndex == 2) {
								var38 = 201;
								var37 = var38 + 52;
								if (var5 == 1 && var36 >= var37 - 12 && var36 < var37 + 2) {
									Login.currentLoginField = 0;
								}

								var37 += 15;
								if (var5 == 1 && var36 >= var37 - 12 && var36 < var37 + 2) {
									Login.currentLoginField = 1;
								}

								var37 += 15;
								var38 = 361;
								if (WorldMapData_1.field2652 != null) {
									var41 = WorldMapData_1.field2652.highX / 2;
									if (var5 == 1 && var50 >= WorldMapData_1.field2652.lowX - var41 && var50 <= var41 + WorldMapData_1.field2652.lowX && var36 >= var38 - 15 && var36 < var38) {
										switch(Login.field872) {
										case 1:
											class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											PlayerType.method5521(5);
											return;
										case 2:
											WorldMapSprite.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var41 = class138.loginBoxCenter - 80;
								var39 = 321;
								if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class19.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class19.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class19.setLoginResponseString("", "Connecting to server...", "");
									FriendSystem.method1791(false);
									VertexNormal.updateGameState(20);
									return;
								}

								var41 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
									PlayerType.method5521(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class148.field1651 = 0;
									BufferedSource.otp = "";
									Login.field882 = true;
								}

								var41 = class138.loginBoxCenter + -117;
								var39 = 277;
								Login.field880 = var50 >= var41 && var50 < var41 + class315.field3918 && var36 >= var39 && var36 < var39 + Huffman.field3152;
								if (var5 == 1 && Login.field880) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && SecureRandomFuture.clientPreferences.rememberedUsername != null) {
										SecureRandomFuture.clientPreferences.rememberedUsername = null;
										class127.savePreferences();
									}
								}

								var41 = class138.loginBoxCenter + 24;
								var39 = 277;
								Login.field881 = var50 >= var41 && var50 < var41 + class315.field3918 && var36 >= var39 && var36 < var39 + Huffman.field3152;
								if (var5 == 1 && Login.field881) {
									SecureRandomFuture.clientPreferences.hideUsername = !SecureRandomFuture.clientPreferences.hideUsername;
									if (!SecureRandomFuture.clientPreferences.hideUsername) {
										Login.Login_username = "";
										SecureRandomFuture.clientPreferences.rememberedUsername = null;
										WorldMapID.method4805();
									}

									class127.savePreferences();
								}

								label1390:
								while (true) {
									int var45;
									Transferable var52;
									do {
										while (true) {
											label1306:
											do {
												while (true) {
													while (NPCComposition.isKeyDown()) {
														if (Players.field1247 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1306;
															}

															char var42 = ModeWhere.field3954;

															for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12); ++var12) {
															}

															if (Players.field1247 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (Players.field1247 == 84 || Players.field1247 == 80) {
																Login.currentLoginField = 1;
															}

															char var13 = ModeWhere.field3954;
															boolean var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var13) != -1;
															if (var43 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + ModeWhere.field3954;
															}
														} else {
															PlayerType.method5521(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class148.field1651 = 0;
															BufferedSource.otp = "";
															Login.field882 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (Players.field1247 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (Players.field1247 == 84 || Players.field1247 == 80) {
												Login.currentLoginField = 0;
												if (Players.field1247 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class19.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class19.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class19.setLoginResponseString("", "Connecting to server...", "");
													FriendSystem.method1791(false);
													VertexNormal.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && Players.field1247 == 67) {
												Clipboard var51 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var52 = var51.getContents(class295.client);
												var45 = 20 - Login.Login_password.length();
												break;
											}

											char var46 = ModeWhere.field3954;
											if ((var46 < ' ' || var46 >= 127) && (var46 <= 127 || var46 >= 160) && (var46 <= 160 || var46 > 255)) {
												label1524: {
													if (var46 != 0) {
														char[] var53 = class328.cp1252AsciiExtension;

														for (int var30 = 0; var30 < var53.length; ++var30) {
															char var15 = var53[var30];
															if (var15 == var46) {
																var40 = true;
																break label1524;
															}
														}
													}

													var40 = false;
												}
											} else {
												var40 = true;
											}

											if (var40) {
												char var54 = ModeWhere.field3954;
												boolean var44 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var54) != -1;
												if (var44 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + ModeWhere.field3954;
												}
											}
										}
									} while(var45 <= 0);

									try {
										String var14 = (String)var52.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var45, var14.length());
										int var16 = 0;

										while (true) {
											if (var16 >= var47) {
												Login.Login_password = Login.Login_password + var14.substring(0, var47);
												continue label1390;
											}

											char var18 = var14.charAt(var16);
											boolean var17;
											if (var18 >= ' ' && var18 < 127 || var18 > 127 && var18 < 160 || var18 > 160 && var18 <= 255) {
												var17 = true;
											} else {
												label1538: {
													if (var18 != 0) {
														char[] var19 = class328.cp1252AsciiExtension;

														for (int var20 = 0; var20 < var19.length; ++var20) {
															char var21 = var19[var20];
															if (var18 == var21) {
																var17 = true;
																break label1538;
															}
														}
													}

													var17 = false;
												}
											}

											if (!var17) {
												break;
											}

											char var49 = var14.charAt(var16);
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var49) != -1;
											if (!var28) {
												break;
											}

											++var16;
										}

										PlayerType.method5521(3);
										return;
									} catch (UnsupportedFlavorException var33) {
									} catch (IOException var34) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var37 = Login.loginBoxX + 180;
								var9 = 276;
								if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
									class185.method3731(false);
								}

								var37 = Login.loginBoxX + 180;
								var9 = 326;
								if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
									class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									PlayerType.method5521(5);
									return;
								}
							} else {
								int var11;
								if (Login.loginIndex == 4) {
									var37 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										BufferedSource.otp.trim();
										if (BufferedSource.otp.length() != 6) {
											class19.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class148.field1651 = Integer.parseInt(BufferedSource.otp);
										BufferedSource.otp = "";
										FriendSystem.method1791(true);
										class19.setLoginResponseString("", "Connecting to server...", "");
										VertexNormal.updateGameState(20);
										return;
									}

									if (var5 == 1 && var50 >= Login.loginBoxX + 180 - 9 && var50 <= Login.loginBoxX + 180 + 130 && var36 >= 263 && var36 <= 296) {
										Login.field882 = !Login.field882;
									}

									if (var5 == 1 && var50 >= Login.loginBoxX + 180 - 34 && var50 <= Login.loginBoxX + 34 + 180 && var36 >= 351 && var36 <= 363) {
										WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var37 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										PlayerType.method5521(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class148.field1651 = 0;
										BufferedSource.otp = "";
									}

									while (NPCComposition.isKeyDown()) {
										boolean var10 = false;

										for (var11 = 0; var11 < "1234567890".length(); ++var11) {
											if (ModeWhere.field3954 == "1234567890".charAt(var11)) {
												var10 = true;
												break;
											}
										}

										if (Players.field1247 == 13) {
											PlayerType.method5521(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class148.field1651 = 0;
											BufferedSource.otp = "";
										} else {
											if (Players.field1247 == 85 && BufferedSource.otp.length() > 0) {
												BufferedSource.otp = BufferedSource.otp.substring(0, BufferedSource.otp.length() - 1);
											}

											if (Players.field1247 == 84) {
												BufferedSource.otp.trim();
												if (BufferedSource.otp.length() != 6) {
													class19.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class148.field1651 = Integer.parseInt(BufferedSource.otp);
												BufferedSource.otp = "";
												FriendSystem.method1791(true);
												class19.setLoginResponseString("", "Connecting to server...", "");
												VertexNormal.updateGameState(20);
												return;
											}

											if (var10 && BufferedSource.otp.length() < 6) {
												BufferedSource.otp = BufferedSource.otp + ModeWhere.field3954;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var37 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										WorldMapRectangle.method4793();
										return;
									}

									var37 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
										class67.Login_promptCredentials(true);
									}

									var39 = 361;
									if (MouseRecorder.field1044 != null) {
										var11 = MouseRecorder.field1044.highX / 2;
										if (var5 == 1 && var50 >= MouseRecorder.field1044.lowX - var11 && var50 <= var11 + MouseRecorder.field1044.lowX && var36 >= var39 - 15 && var36 < var39) {
											WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (NPCComposition.isKeyDown()) {
										var40 = false;

										for (var12 = 0; var12 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var12) {
											if (ModeWhere.field3954 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var12)) {
												var40 = true;
												break;
											}
										}

										if (Players.field1247 == 13) {
											class67.Login_promptCredentials(true);
										} else {
											if (Players.field1247 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (Players.field1247 == 84) {
												WorldMapRectangle.method4793();
												return;
											}

											if (var40 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + ModeWhere.field3954;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var37 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											WorldMapSprite.openURL(InterfaceParent.method2146("secure", true) + "m=dob/set_dob.ws", true, false);
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											PlayerType.method5521(6);
											return;
										}

										var37 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											class67.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var37 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											WorldMapSprite.openURL("https://www.jagex.com/terms/privacy", true, false);
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											PlayerType.method5521(6);
											return;
										}

										var37 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											class67.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var37 = Login.loginBoxX + 180;
										var9 = 311;
										if (Players.field1247 == 84 || Players.field1247 == 13 || var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											class185.method3731(false);
										}
									} else if (Login.loginIndex == 10) {
										var37 = Login.loginBoxX + 180;
										var9 = 209;
										if (Players.field1247 == 84 || var5 == 1 && var50 >= var37 - 109 && var50 <= var37 + 109 && var36 >= var9 && var36 <= var9 + 68) {
											class19.setLoginResponseString("", "Connecting to server...", "");
											Client.field508 = class422.field4524;
											FriendSystem.method1791(false);
											VertexNormal.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var37 = class138.loginBoxCenter;
										var9 = 233;
										Bounds var31 = var1.method6091(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9);
										Bounds var26 = var1.method6091(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9);
										Bounds var27 = var1.method6091(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var37, var9);
										var41 = var9 + 17;
										Bounds var29 = var1.method6091(0, 34, "<col=ffd200>agreement (EULA)</col>.", var37, var41);
										if (var5 == 1) {
											if (var31.method6577(var50, var36)) {
												WorldMapSprite.openURL("https://www.jagex.com/terms", true, false);
											} else if (var26.method6577(var50, var36)) {
												WorldMapSprite.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var27.method6577(var50, var36) || var29.method6577(var50, var36)) {
												WorldMapSprite.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var37 = class138.loginBoxCenter - 80;
										var9 = 311;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											UserComparator6.method2549();
											class185.method3731(true);
										}

										var37 = class138.loginBoxCenter + 80;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var37 = class138.loginBoxCenter;
										var9 = 321;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											class185.method3731(true);
										}
									} else if (Login.loginIndex == 14) {
										String var32 = "";
										switch(Login.field871) {
										case 0:
											var32 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var32 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											class67.Login_promptCredentials(false);
										}

										var41 = Login.loginBoxX + 180;
										var39 = 276;
										if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
											WorldMapSprite.openURL(var32, true, false);
											class19.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											PlayerType.method5521(6);
											return;
										}

										var41 = Login.loginBoxX + 180;
										var39 = 326;
										if (var5 == 1 && var50 >= var41 - 75 && var50 <= var41 + 75 && var36 >= var39 - 20 && var36 <= var39 + 20) {
											class67.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var37 = Login.loginBoxX + 180;
										var9 = 301;
										if (var5 == 1 && var50 >= var37 - 75 && var50 <= var37 + 75 && var36 >= var9 - 20 && var36 <= var9 + 20) {
											class185.method3731(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!NPCComposition.isKeyDown()) {
												var38 = 321;
												if (var5 == 1 && var36 >= var38 - 20 && var36 <= var38 + 20) {
													class67.Login_promptCredentials(true);
												}

												return;
											}
										} while(Players.field1247 != 84 && Players.field1247 != 13);

										class67.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		BufferedSource.method6516();
		if (Players.friendsChat != null) {
			Players.friendsChat.invalidateIgnoreds();
		}

	}
}
