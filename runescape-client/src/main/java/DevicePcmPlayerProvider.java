import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
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

@ObfuscatedName("w")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class45 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1460804085
	)
	@Export("cameraZ")
	static int cameraZ;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lab;",
		garbageValue = "286200074"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lbc;",
		garbageValue = "32017"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-127022477"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = class4.getPreferencesFile("", class16.field83.name, true);
			Buffer var1 = VarbitComposition.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lat;Llu;I)V",
		garbageValue = "139853738"
	)
	static void method366(GameEngine var0, Font var1) {
		int var3;
		int var4;
		int var5;
		if (Login.worldSelectOpen) {
			while (true) {
				if (!KitDefinition.isKeyDown()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (Script.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var2 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(0, 1);
						break;
					}

					var3 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(1, 1);
						break;
					}

					var4 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(2, 1);
						break;
					}

					var5 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						StructComposition.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						class318.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class394.logoSprite.drawAt(Login.xPadding + 382 - class394.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var6 = class393.World_worlds[Login.hoveredWorldIndex];
						ScriptFrame.changeWorld(var6);
						Login.worldSelectOpen = false;
						class318.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						class394.logoSprite.drawAt(Login.xPadding + 382 - class394.logoSprite.subWidth / 2, 18);
					} else {
						if (Login.worldSelectPage > 0 && class184.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class184.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && FriendsChat.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= InvDefinition.canvasWidth - FriendsChat.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= InvDefinition.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (SpriteMask.field2994 == 13) {
					Login.worldSelectOpen = false;
					class318.leftTitleSprite.drawAt(Login.xPadding, 0);
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					class394.logoSprite.drawAt(Login.xPadding + 382 - class394.logoSprite.subWidth / 2, 18);
					break;
				}

				if (SpriteMask.field2994 == 96) {
					if (Login.worldSelectPage > 0 && class184.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (SpriteMask.field2994 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && FriendsChat.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				VarbitComposition.clientPreferences.titleMusicDisabled = !VarbitComposition.clientPreferences.titleMusicDisabled;
				savePreferences();
				if (!VarbitComposition.clientPreferences.titleMusicDisabled) {
					Archive var30 = class276.archive6;
					var3 = var30.getGroupId("scape main");
					var4 = var30.getFileId(var3, "");
					Decimator.method1051(var30, var3, var4, 255, false);
				} else {
					Canvas.method371();
				}
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field902) {
					Login.field902 = Occluder.method4335() + 1000L;
				}

				long var31 = Occluder.method4335();
				boolean var54;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var54 = true;
							break;
						}

						ArchiveLoader var33 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var33.isLoaded()) {
							var54 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var54 = true;
				}

				if (var54 && Login.field875 == -1L) {
					Login.field875 = var31;
					if (Login.field875 > Login.field902) {
						Login.field902 = Login.field875;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class323.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Script.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var34 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var34 && MouseHandler.MouseHandler_lastPressedY <= var34 + var8) {
								if (ObjectComposition.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (WorldMapArchiveLoader.World_request != null && ObjectComposition.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var67 = MouseHandler.MouseHandler_lastPressedX;
					int var55 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var67 = MouseHandler.MouseHandler_x;
						var55 = MouseHandler.MouseHandler_y;
					}

					if (!Script.mouseCam && var5 == 4) {
						var5 = 1;
					}

					short var58;
					int var61;
					if (Login.loginIndex == 0) {
						boolean var64 = false;

						while (KitDefinition.isKeyDown()) {
							if (SpriteMask.field2994 == 84) {
								var64 = true;
							}
						}

						var61 = class11.loginBoxCenter - 80;
						var58 = 291;
						if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
							Interpreter.openURL(WorldMapManager.method3679("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var61 = class11.loginBoxCenter + 80;
						if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20 || var64) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Message.method1113(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
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
								Message.method1113(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Message.method1113(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								SecureRandomFuture.Login_promptCredentials(false);
							}
						}
					} else {
						short var9;
						int var56;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!KitDefinition.isKeyDown()) {
									var56 = class11.loginBoxCenter - 80;
									var9 = 321;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										SecureRandomFuture.Login_promptCredentials(false);
									}

									var56 = class11.loginBoxCenter + 80;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										Message.method1113(0);
									}
									break;
								}

								if (SpriteMask.field2994 == 84) {
									SecureRandomFuture.Login_promptCredentials(false);
								} else if (SpriteMask.field2994 == 13) {
									Message.method1113(0);
								}
							}
						} else {
							short var57;
							if (Login.loginIndex == 2) {
								var57 = 201;
								var56 = var57 + 52;
								if (var5 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) {
									Login.currentLoginField = 0;
								}

								var56 += 15;
								if (var5 == 1 && var55 >= var56 - 12 && var55 < var56 + 2) {
									Login.currentLoginField = 1;
								}

								var56 += 15;
								var57 = 361;
								if (WorldMapSectionType.field2125 != null) {
									var61 = WorldMapSectionType.field2125.highX / 2;
									if (var5 == 1 && var67 >= WorldMapSectionType.field2125.lowX - var61 && var67 <= var61 + WorldMapSectionType.field2125.lowX && var55 >= var57 - 15 && var55 < var57) {
										switch(Login.field883) {
										case 1:
											PlatformInfo.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Message.method1113(5);
											return;
										case 2:
											Interpreter.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var61 = class11.loginBoxCenter - 80;
								var58 = 321;
								if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										PlatformInfo.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										PlatformInfo.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									PlatformInfo.setLoginResponseString("", "Connecting to server...", "");
									Varcs.method2303(false);
									HealthBarUpdate.updateGameState(20);
									return;
								}

								var61 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
									Message.method1113(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class274.field3274 = 0;
									AbstractWorldMapIcon.otp = "";
									Login.field893 = true;
								}

								var61 = class11.loginBoxCenter + -117;
								var58 = 277;
								Login.field891 = var67 >= var61 && var67 < var61 + class1.field3 && var55 >= var58 && var55 < var58 + class280.field3323;
								if (var5 == 1 && Login.field891) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && VarbitComposition.clientPreferences.rememberedUsername != null) {
										VarbitComposition.clientPreferences.rememberedUsername = null;
										savePreferences();
									}
								}

								var61 = class11.loginBoxCenter + 24;
								var58 = 277;
								Login.field904 = var67 >= var61 && var67 < var61 + class1.field3 && var55 >= var58 && var55 < var58 + class280.field3323;
								if (var5 == 1 && Login.field904) {
									VarbitComposition.clientPreferences.hideUsername = !VarbitComposition.clientPreferences.hideUsername;
									if (!VarbitComposition.clientPreferences.hideUsername) {
										Login.Login_username = "";
										VarbitComposition.clientPreferences.rememberedUsername = null;
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}

									savePreferences();
								}

								while (true) {
									int var13;
									Transferable var62;
									do {
										while (true) {
											label1433:
											do {
												while (true) {
													while (KitDefinition.isKeyDown()) {
														if (SpriteMask.field2994 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1433;
															}

															HitSplatDefinition.method3108(class78.field1010);
															if (SpriteMask.field2994 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SpriteMask.field2994 == 84 || SpriteMask.field2994 == 80) {
																Login.currentLoginField = 1;
															}

															if (PendingSpawn.method2118(class78.field1010) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class78.field1010;
															}
														} else {
															Message.method1113(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class274.field3274 = 0;
															AbstractWorldMapIcon.otp = "";
															Login.field893 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (SpriteMask.field2994 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (SpriteMask.field2994 == 84 || SpriteMask.field2994 == 80) {
												Login.currentLoginField = 0;
												if (SpriteMask.field2994 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														PlatformInfo.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														PlatformInfo.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													PlatformInfo.setLoginResponseString("", "Connecting to server...", "");
													Varcs.method2303(false);
													HealthBarUpdate.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SpriteMask.field2994 == 67) {
												Clipboard var60 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var62 = var60.getContents(ArchiveDiskActionHandler.client);
												var13 = 20 - Login.Login_password.length();
												break;
											}

											if (class391.method6716(class78.field1010) && PendingSpawn.method2118(class78.field1010) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + class78.field1010;
											}
										}
									} while(var13 <= 0);

									try {
										String var63 = (String)var62.getTransferData(DataFlavor.stringFlavor);
										int var66 = Math.min(var13, var63.length());

										for (int var16 = 0; var16 < var66; ++var16) {
											if (!class391.method6716(var63.charAt(var16)) || !PendingSpawn.method2118(var63.charAt(var16))) {
												Message.method1113(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var63.substring(0, var66);
									} catch (UnsupportedFlavorException var52) {
									} catch (IOException var53) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var56 = Login.loginBoxX + 180;
								var9 = 276;
								if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
									MenuAction.method1876(false);
								}

								var56 = Login.loginBoxX + 180;
								var9 = 326;
								if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
									PlatformInfo.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Message.method1113(5);
									return;
								}
							} else {
								int var35;
								if (Login.loginIndex == 4) {
									var56 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										AbstractWorldMapIcon.otp.trim();
										if (AbstractWorldMapIcon.otp.length() != 6) {
											PlatformInfo.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										class274.field3274 = Integer.parseInt(AbstractWorldMapIcon.otp);
										AbstractWorldMapIcon.otp = "";
										Varcs.method2303(true);
										PlatformInfo.setLoginResponseString("", "Connecting to server...", "");
										HealthBarUpdate.updateGameState(20);
										return;
									}

									if (var5 == 1 && var67 >= Login.loginBoxX + 180 - 9 && var67 <= Login.loginBoxX + 180 + 130 && var55 >= 263 && var55 <= 296) {
										Login.field893 = !Login.field893;
									}

									if (var5 == 1 && var67 >= Login.loginBoxX + 180 - 34 && var67 <= Login.loginBoxX + 34 + 180 && var55 >= 351 && var55 <= 363) {
										Interpreter.openURL(WorldMapManager.method3679("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var56 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										Message.method1113(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class274.field3274 = 0;
										AbstractWorldMapIcon.otp = "";
									}

									while (KitDefinition.isKeyDown()) {
										boolean var10 = false;

										for (var35 = 0; var35 < "1234567890".length(); ++var35) {
											if (class78.field1010 == "1234567890".charAt(var35)) {
												var10 = true;
												break;
											}
										}

										if (SpriteMask.field2994 == 13) {
											Message.method1113(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class274.field3274 = 0;
											AbstractWorldMapIcon.otp = "";
										} else {
											if (SpriteMask.field2994 == 85 && AbstractWorldMapIcon.otp.length() > 0) {
												AbstractWorldMapIcon.otp = AbstractWorldMapIcon.otp.substring(0, AbstractWorldMapIcon.otp.length() - 1);
											}

											if (SpriteMask.field2994 == 84) {
												AbstractWorldMapIcon.otp.trim();
												if (AbstractWorldMapIcon.otp.length() != 6) {
													PlatformInfo.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												class274.field3274 = Integer.parseInt(AbstractWorldMapIcon.otp);
												AbstractWorldMapIcon.otp = "";
												Varcs.method2303(true);
												PlatformInfo.setLoginResponseString("", "Connecting to server...", "");
												HealthBarUpdate.updateGameState(20);
												return;
											}

											if (var10 && AbstractWorldMapIcon.otp.length() < 6) {
												AbstractWorldMapIcon.otp = AbstractWorldMapIcon.otp + class78.field1010;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var56 = Login.loginBoxX + 180 - 80;
									var9 = 321;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										Login.Login_username = Login.Login_username.trim();
										if (Login.Login_username.length() == 0) {
											PlatformInfo.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										} else {
											long var39;
											try {
												URL var36 = new URL(WorldMapManager.method3679("services", false) + "m=accountappeal/login.ws");
												URLConnection var14 = var36.openConnection();
												var14.setRequestProperty("connection", "close");
												var14.setDoInput(true);
												var14.setDoOutput(true);
												var14.setConnectTimeout(5000);
												OutputStreamWriter var37 = new OutputStreamWriter(var14.getOutputStream());
												var37.write("data1=req");
												var37.flush();
												InputStream var38 = var14.getInputStream();
												Buffer var17 = new Buffer(new byte[1000]);

												while (true) {
													int var18 = var38.read(var17.array, var17.offset, 1000 - var17.offset);
													if (var18 == -1) {
														var17.offset = 0;
														long var41 = var17.readLong();
														var39 = var41;
														break;
													}

													var17.offset += var18;
													if (var17.offset >= 1000) {
														var39 = 0L;
														break;
													}
												}
											} catch (Exception var51) {
												var39 = 0L;
											}

											byte var59;
											if (0L == var39) {
												var59 = 5;
											} else {
												String var70 = Login.Login_username;
												Random var65 = new Random();
												Buffer var45 = new Buffer(128);
												Buffer var19 = new Buffer(128);
												int[] var20 = new int[]{var65.nextInt(), var65.nextInt(), (int)(var39 >> 32), (int)var39};
												var45.writeByte(10);

												int var21;
												for (var21 = 0; var21 < 4; ++var21) {
													var45.writeInt(var65.nextInt());
												}

												var45.writeInt(var20[0]);
												var45.writeInt(var20[1]);
												var45.writeLong(var39);
												var45.writeLong(0L);

												for (var21 = 0; var21 < 4; ++var21) {
													var45.writeInt(var65.nextInt());
												}

												var45.encryptRsa(class65.field849, class65.field853);
												var19.writeByte(10);

												for (var21 = 0; var21 < 3; ++var21) {
													var19.writeInt(var65.nextInt());
												}

												var19.writeLong(var65.nextLong());
												var19.writeLongMedium(var65.nextLong());
												ClientPreferences.method2195(var19);
												var19.writeLong(var65.nextLong());
												var19.encryptRsa(class65.field849, class65.field853);
												var21 = BufferedSink.stringCp1252NullTerminatedByteSize(var70);
												if (var21 % 8 != 0) {
													var21 += 8 - var21 % 8;
												}

												Buffer var22 = new Buffer(var21);
												var22.writeStringCp1252NullTerminated(var70);
												var22.offset = var21;
												var22.xteaEncryptAll(var20);
												Buffer var23 = new Buffer(var45.offset + var19.offset + var22.offset + 5);
												var23.writeByte(2);
												var23.writeByte(var45.offset);
												var23.writeBytes(var45.array, 0, var45.offset);
												var23.writeByte(var19.offset);
												var23.writeBytes(var19.array, 0, var19.offset);
												var23.writeShort(var22.offset);
												var23.writeBytes(var22.array, 0, var22.offset);
												String var24 = Message.method1104(var23.array);

												byte var15;
												try {
													URL var25 = new URL(WorldMapManager.method3679("services", false) + "m=accountappeal/login.ws");
													URLConnection var26 = var25.openConnection();
													var26.setDoInput(true);
													var26.setDoOutput(true);
													var26.setConnectTimeout(5000);
													OutputStreamWriter var27 = new OutputStreamWriter(var26.getOutputStream());
													var27.write("data2=" + VertexNormal.method4478(var24) + "&dest=" + VertexNormal.method4478("passwordchoice.ws"));
													var27.flush();
													InputStream var28 = var26.getInputStream();
													var23 = new Buffer(new byte[1000]);

													while (true) {
														int var29 = var28.read(var23.array, var23.offset, 1000 - var23.offset);
														if (var29 == -1) {
															var27.close();
															var28.close();
															String var46 = new String(var23.array);
															if (var46.startsWith("OFFLINE")) {
																var15 = 4;
															} else if (var46.startsWith("WRONG")) {
																var15 = 7;
															} else if (var46.startsWith("RELOAD")) {
																var15 = 3;
															} else if (var46.startsWith("Not permitted for social network accounts.")) {
																var15 = 6;
															} else {
																var23.xteaDecryptAll(var20);

																while (var23.offset > 0 && var23.array[var23.offset - 1] == 0) {
																	--var23.offset;
																}

																var46 = new String(var23.array, 0, var23.offset);
																if (WorldMapScaleHandler.method3907(var46)) {
																	Interpreter.openURL(var46, true, false);
																	var15 = 2;
																} else {
																	var15 = 5;
																}
															}
															break;
														}

														var23.offset += var29;
														if (var23.offset >= 1000) {
															var15 = 5;
															break;
														}
													}
												} catch (Throwable var50) {
													var50.printStackTrace();
													var15 = 5;
												}

												var59 = var15;
											}

											switch(var59) {
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

										return;
									}

									var56 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
										SecureRandomFuture.Login_promptCredentials(true);
									}

									var58 = 361;
									if (PcmPlayer.field287 != null) {
										var35 = PcmPlayer.field287.highX / 2;
										if (var5 == 1 && var67 >= PcmPlayer.field287.lowX - var35 && var67 <= var35 + PcmPlayer.field287.lowX && var55 >= var58 - 15 && var55 < var58) {
											Interpreter.openURL(WorldMapManager.method3679("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (KitDefinition.isKeyDown()) {
										boolean var68 = false;

										for (int var47 = 0; var47 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var47) {
											if (class78.field1010 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var47)) {
												var68 = true;
												break;
											}
										}

										if (SpriteMask.field2994 == 13) {
											SecureRandomFuture.Login_promptCredentials(true);
										} else {
											if (SpriteMask.field2994 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SpriteMask.field2994 == 84) {
												ScriptFrame.method1085();
												return;
											}

											if (var68 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class78.field1010;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var56 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											Interpreter.openURL(WorldMapManager.method3679("secure", true) + "m=dob/set_dob.ws", true, false);
											PlatformInfo.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Message.method1113(6);
											return;
										}

										var56 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											SecureRandomFuture.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var56 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											Interpreter.openURL("https://www.jagex.com/terms/privacy", true, false);
											PlatformInfo.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Message.method1113(6);
											return;
										}

										var56 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											SecureRandomFuture.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var56 = Login.loginBoxX + 180;
										var9 = 311;
										if (SpriteMask.field2994 == 84 || SpriteMask.field2994 == 13 || var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											MenuAction.method1876(false);
										}
									} else if (Login.loginIndex == 10) {
										var56 = Login.loginBoxX + 180;
										var9 = 209;
										if (SpriteMask.field2994 == 84 || var5 == 1 && var67 >= var56 - 109 && var67 <= var56 + 109 && var55 >= var9 && var55 <= var9 + 68) {
											PlatformInfo.setLoginResponseString("", "Connecting to server...", "");
											Client.field519 = class403.field4323;
											Varcs.method2303(false);
											HealthBarUpdate.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var56 = class11.loginBoxCenter;
										var9 = 233;
										Bounds var48 = var1.method5657(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var56, var9);
										Bounds var11 = var1.method5657(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var56, var9);
										Bounds var12 = var1.method5657(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var56, var9);
										var61 = var9 + 17;
										Bounds var69 = var1.method5657(0, 34, "<col=ffd200>agreement (EULA)</col>.", var56, var61);
										if (var5 == 1) {
											if (var48.method6186(var67, var55)) {
												Interpreter.openURL("https://www.jagex.com/terms", true, false);
											} else if (var11.method6186(var67, var55)) {
												Interpreter.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var12.method6186(var67, var55) || var69.method6186(var67, var55)) {
												Interpreter.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var56 = class11.loginBoxCenter - 80;
										var9 = 311;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											class123.method2534();
											if (!WorldMapAreaData.method3903()) {
												Login.loginIndex = 12;
											} else {
												Login.loginIndex = 0;
											}
										}

										var56 = class11.loginBoxCenter + 80;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var56 = class11.loginBoxCenter;
										var9 = 321;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											if (!WorldMapAreaData.method3903()) {
												Login.loginIndex = 12;
											} else {
												Login.loginIndex = 0;
											}
										}
									} else if (Login.loginIndex == 14) {
										String var49 = "";
										switch(Login.field874) {
										case 0:
											var49 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var49 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											SecureRandomFuture.Login_promptCredentials(false);
										}

										var61 = Login.loginBoxX + 180;
										var58 = 276;
										if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
											Interpreter.openURL(var49, true, false);
											PlatformInfo.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Message.method1113(6);
											return;
										}

										var61 = Login.loginBoxX + 180;
										var58 = 326;
										if (var5 == 1 && var67 >= var61 - 75 && var67 <= var61 + 75 && var55 >= var58 - 20 && var55 <= var58 + 20) {
											SecureRandomFuture.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var56 = Login.loginBoxX + 180;
										var9 = 301;
										if (var5 == 1 && var67 >= var56 - 75 && var67 <= var56 + 75 && var55 >= var9 - 20 && var55 <= var9 + 20) {
											MenuAction.method1876(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!KitDefinition.isKeyDown()) {
												var57 = 321;
												if (var5 == 1 && var55 >= var57 - 20 && var55 <= var57 + 20) {
													SecureRandomFuture.Login_promptCredentials(true);
												}

												return;
											}
										} while(SpriteMask.field2994 != 84 && SpriteMask.field2994 != 13);

										SecureRandomFuture.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1081213203"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = FriendSystem.getPacketBufferNode(ClientPacket.field2690, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6951(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
