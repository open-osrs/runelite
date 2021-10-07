import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class87 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "284791287"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = UserComparator4.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class126.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lay;Llt;I)V",
		garbageValue = "-654214919"
	)
	static void method2196(GameEngine var0, Font var1) {
		if (Login.worldSelectOpen) {
			Decimator.method1014(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				WorldMapDecorationType.clientPreferences.titleMusicDisabled = !WorldMapDecorationType.clientPreferences.titleMusicDisabled;
				ScriptFrame.savePreferences();
				if (!WorldMapDecorationType.clientPreferences.titleMusicDisabled) {
					Archive var2 = Tiles.archive6;
					int var3 = var2.getGroupId("scape main");
					int var4 = var2.getFileId(var3, "");
					class67.method1886(var2, var3, var4, 255, false);
				} else {
					class247.midiPcmStream.clear();
					class247.musicPlayerStatus = 1;
					class113.musicTrackArchive = null;
				}
			}

			if (Client.gameState != 5) {
				if (Login.field885 == -1L) {
					Login.field885 = UserComparator4.method2406() + 1000L;
				}

				long var22 = UserComparator4.method2406();
				boolean var32;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var32 = true;
							break;
						}

						ArchiveLoader var5 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var5.isLoaded()) {
							var32 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var32 = true;
				}

				if (var32 && -1L == Login.field905) {
					Login.field905 = var22;
					if (Login.field905 > Login.field885) {
						Login.field885 = Login.field905;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var24;
					if (ReflectionCheck.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var24 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var24 && MouseHandler.MouseHandler_lastPressedX <= var7 + var24 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) {
								class6.method44();
								return;
							}
						}

						if (class4.World_request != null) {
							class6.method44();
						}
					}

					var24 = MouseHandler.MouseHandler_lastButton;
					int var33 = MouseHandler.MouseHandler_lastPressedX;
					int var34 = MouseHandler.MouseHandler_lastPressedY;
					if (var24 == 0) {
						var33 = MouseHandler.MouseHandler_x;
						var34 = MouseHandler.MouseHandler_y;
					}

					if (!VarbitComposition.mouseCam && var24 == 4) {
						var24 = 1;
					}

					short var39;
					int var40;
					if (Login.loginIndex == 0) {
						boolean var42 = false;

						while (CollisionMap.isKeyDown()) {
							if (class4.field13 == 84) {
								var42 = true;
							}
						}

						var40 = class78.loginBoxCenter - 80;
						var39 = 291;
						if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20) {
							LoginScreenAnimation.openURL(HitSplatDefinition.method3168("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var40 = class78.loginBoxCenter + 80;
						if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20 || var42) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class112.method2474(1);
								class14.method175();
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
								class112.method2474(1);
								class14.method175();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class112.method2474(1);
								class14.method175();
							} else {
								class20.Login_promptCredentials(false);
							}
						}
					} else {
						short var9;
						int var35;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!CollisionMap.isKeyDown()) {
									var35 = class78.loginBoxCenter - 80;
									var9 = 321;
									if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
										class20.Login_promptCredentials(false);
									}

									var35 = class78.loginBoxCenter + 80;
									if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
										class112.method2474(0);
									}
									break;
								}

								if (class4.field13 == 84) {
									class20.Login_promptCredentials(false);
								} else if (class4.field13 == 13) {
									class112.method2474(0);
								}
							}
						} else {
							short var36;
							if (Login.loginIndex == 2) {
								var36 = 201;
								var35 = var36 + 52;
								if (var24 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) {
									Login.currentLoginField = 0;
								}

								var35 += 15;
								if (var24 == 1 && var34 >= var35 - 12 && var34 < var35 + 2) {
									Login.currentLoginField = 1;
								}

								var35 += 15;
								var36 = 361;
								if (Ignored.field3969 != null) {
									var40 = Ignored.field3969.highX / 2;
									if (var24 == 1 && var33 >= Ignored.field3969.lowX - var40 && var33 <= var40 + Ignored.field3969.lowX && var34 >= var36 - 15 && var34 < var36) {
										switch(Login.field869) {
										case 1:
											class17.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											class112.method2474(5);
											return;
										case 2:
											LoginScreenAnimation.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var40 = class78.loginBoxCenter - 80;
								var39 = 321;
								if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										class17.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										class17.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									class17.setLoginResponseString("", "Connecting to server...", "");
									class7.method61(false);
									UserList.updateGameState(20);
									return;
								}

								var40 = Login.loginBoxX + 180 + 80;
								if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20) {
									class112.method2474(0);
									Login.Login_username = "";
									Login.Login_password = "";
									MouseHandler.field236 = 0;
									Ignored.otp = "";
									Login.field900 = true;
								}

								var40 = class78.loginBoxCenter + -117;
								var39 = 277;
								Login.field904 = var33 >= var40 && var33 < var40 + GrandExchangeOfferTotalQuantityComparator.field3741 && var34 >= var39 && var34 < var39 + class20.field103;
								if (var24 == 1 && Login.field904) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && WorldMapDecorationType.clientPreferences.rememberedUsername != null) {
										WorldMapDecorationType.clientPreferences.rememberedUsername = null;
										ScriptFrame.savePreferences();
									}
								}

								var40 = class78.loginBoxCenter + 24;
								var39 = 277;
								Login.field895 = var33 >= var40 && var33 < var40 + GrandExchangeOfferTotalQuantityComparator.field3741 && var34 >= var39 && var34 < var39 + class20.field103;
								if (var24 == 1 && Login.field895) {
									WorldMapDecorationType.clientPreferences.hideUsername = !WorldMapDecorationType.clientPreferences.hideUsername;
									if (!WorldMapDecorationType.clientPreferences.hideUsername) {
										Login.Login_username = "";
										WorldMapDecorationType.clientPreferences.rememberedUsername = null;
										class14.method175();
									}

									ScriptFrame.savePreferences();
								}

								while (true) {
									int var13;
									Transferable var41;
									do {
										while (true) {
											label1042:
											do {
												while (true) {
													while (CollisionMap.isKeyDown()) {
														if (class4.field13 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1042;
															}

															FileSystem.method2820(Skeleton.field2376);
															if (class4.field13 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (class4.field13 == 84 || class4.field13 == 80) {
																Login.currentLoginField = 1;
															}

															if (WorldMapIcon_1.method3461(Skeleton.field2376) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + Skeleton.field2376;
															}
														} else {
															class112.method2474(0);
															Login.Login_username = "";
															Login.Login_password = "";
															MouseHandler.field236 = 0;
															Ignored.otp = "";
															Login.field900 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (class4.field13 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (class4.field13 == 84 || class4.field13 == 80) {
												Login.currentLoginField = 0;
												if (class4.field13 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class17.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class17.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class17.setLoginResponseString("", "Connecting to server...", "");
													class7.method61(false);
													UserList.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && class4.field13 == 67) {
												Clipboard var38 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var41 = var38.getContents(class21.client);
												var13 = 20 - Login.Login_password.length();
												break;
											}

											if (ParamComposition.method3128(Skeleton.field2376) && WorldMapIcon_1.method3461(Skeleton.field2376) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + Skeleton.field2376;
											}
										}
									} while(var13 <= 0);

									try {
										String var14 = (String)var41.getTransferData(DataFlavor.stringFlavor);
										int var15 = Math.min(var13, var14.length());

										for (int var16 = 0; var16 < var15; ++var16) {
											char var18 = var14.charAt(var16);
											boolean var17;
											if (var18 >= ' ' && var18 < 127 || var18 > 127 && var18 < 160 || var18 > 160 && var18 <= 255) {
												var17 = true;
											} else {
												label1235: {
													if (var18 != 0) {
														char[] var19 = class316.cp1252AsciiExtension;

														for (int var20 = 0; var20 < var19.length; ++var20) {
															char var21 = var19[var20];
															if (var18 == var21) {
																var17 = true;
																break label1235;
															}
														}
													}

													var17 = false;
												}
											}

											if (!var17 || !WorldMapIcon_1.method3461(var14.charAt(var16))) {
												class112.method2474(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var14.substring(0, var15);
									} catch (UnsupportedFlavorException var30) {
									} catch (IOException var31) {
									}
								}
							} else {
								byte var10;
								if (Login.loginIndex == 3) {
									var35 = Login.loginBoxX + 180;
									var9 = 276;
									if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
										if (class21.client.method1338()) {
											var10 = 10;
										} else {
											var10 = 0;
										}

										class112.method2474(var10);
										Login.method1930();
										class14.method175();
									}

									var35 = Login.loginBoxX + 180;
									var9 = 326;
									if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
										class17.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
										class112.method2474(5);
										return;
									}
								} else {
									int var25;
									if (Login.loginIndex == 4) {
										var35 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
											Ignored.otp.trim();
											if (Ignored.otp.length() != 6) {
												class17.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												return;
											}

											MouseHandler.field236 = Integer.parseInt(Ignored.otp);
											Ignored.otp = "";
											class7.method61(true);
											class17.setLoginResponseString("", "Connecting to server...", "");
											UserList.updateGameState(20);
											return;
										}

										if (var24 == 1 && var33 >= Login.loginBoxX + 180 - 9 && var33 <= Login.loginBoxX + 180 + 130 && var34 >= 263 && var34 <= 296) {
											Login.field900 = !Login.field900;
										}

										if (var24 == 1 && var33 >= Login.loginBoxX + 180 - 34 && var33 <= Login.loginBoxX + 34 + 180 && var34 >= 351 && var34 <= 363) {
											LoginScreenAnimation.openURL(HitSplatDefinition.method3168("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
										}

										var35 = Login.loginBoxX + 180 + 80;
										if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
											class112.method2474(0);
											Login.Login_username = "";
											Login.Login_password = "";
											MouseHandler.field236 = 0;
											Ignored.otp = "";
										}

										while (CollisionMap.isKeyDown()) {
											boolean var37 = false;

											for (var25 = 0; var25 < "1234567890".length(); ++var25) {
												if (Skeleton.field2376 == "1234567890".charAt(var25)) {
													var37 = true;
													break;
												}
											}

											if (class4.field13 == 13) {
												class112.method2474(0);
												Login.Login_username = "";
												Login.Login_password = "";
												MouseHandler.field236 = 0;
												Ignored.otp = "";
											} else {
												if (class4.field13 == 85 && Ignored.otp.length() > 0) {
													Ignored.otp = Ignored.otp.substring(0, Ignored.otp.length() - 1);
												}

												if (class4.field13 == 84) {
													Ignored.otp.trim();
													if (Ignored.otp.length() != 6) {
														class17.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
														return;
													}

													MouseHandler.field236 = Integer.parseInt(Ignored.otp);
													Ignored.otp = "";
													class7.method61(true);
													class17.setLoginResponseString("", "Connecting to server...", "");
													UserList.updateGameState(20);
													return;
												}

												if (var37 && Ignored.otp.length() < 6) {
													Ignored.otp = Ignored.otp + Skeleton.field2376;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var35 = Login.loginBoxX + 180 - 80;
										var9 = 321;
										if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
											class1.method14();
											return;
										}

										var35 = Login.loginBoxX + 180 + 80;
										if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
											class20.Login_promptCredentials(true);
										}

										var39 = 361;
										if (class13.field76 != null) {
											var25 = class13.field76.highX / 2;
											if (var24 == 1 && var33 >= class13.field76.lowX - var25 && var33 <= var25 + class13.field76.lowX && var34 >= var39 - 15 && var34 < var39) {
												LoginScreenAnimation.openURL(HitSplatDefinition.method3168("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (CollisionMap.isKeyDown()) {
											boolean var43 = false;

											for (int var26 = 0; var26 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var26) {
												if (Skeleton.field2376 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var26)) {
													var43 = true;
													break;
												}
											}

											if (class4.field13 == 13) {
												class20.Login_promptCredentials(true);
											} else {
												if (class4.field13 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (class4.field13 == 84) {
													class1.method14();
													return;
												}

												if (var43 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + Skeleton.field2376;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											var35 = Login.loginBoxX + 180 - 80;
											var9 = 321;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												LoginScreenAnimation.openURL(HitSplatDefinition.method3168("secure", true) + "m=dob/set_dob.ws", true, false);
												class17.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class112.method2474(6);
												return;
											}

											var35 = Login.loginBoxX + 180 + 80;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												class20.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 8) {
											var35 = Login.loginBoxX + 180 - 80;
											var9 = 321;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												LoginScreenAnimation.openURL("https://www.jagex.com/terms/privacy", true, false);
												class17.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class112.method2474(6);
												return;
											}

											var35 = Login.loginBoxX + 180 + 80;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												class20.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var35 = Login.loginBoxX + 180;
											var9 = 311;
											if (class4.field13 == 84 || class4.field13 == 13 || var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												if (class21.client.method1338()) {
													var10 = 10;
												} else {
													var10 = 0;
												}

												class112.method2474(var10);
												Login.method1930();
												class14.method175();
											}
										} else if (Login.loginIndex == 10) {
											var35 = Login.loginBoxX + 180;
											var9 = 209;
											if (class4.field13 == 84 || var24 == 1 && var33 >= var35 - 109 && var33 <= var35 + 109 && var34 >= var9 && var34 <= var9 + 68) {
												class17.setLoginResponseString("", "Connecting to server...", "");
												Client.field520 = class404.field4348;
												class7.method61(false);
												UserList.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var35 = class78.loginBoxCenter;
											var9 = 233;
											Bounds var27 = var1.method5693(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var35, var9);
											Bounds var11 = var1.method5693(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var35, var9);
											Bounds var12 = var1.method5693(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var35, var9);
											var40 = var9 + 17;
											Bounds var28 = var1.method5693(0, 34, "<col=ffd200>agreement (EULA)</col>.", var35, var40);
											if (var24 == 1) {
												if (var27.method6252(var33, var34)) {
													LoginScreenAnimation.openURL("https://www.jagex.com/terms", true, false);
												} else if (var11.method6252(var33, var34)) {
													LoginScreenAnimation.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var12.method6252(var33, var34) || var28.method6252(var33, var34)) {
													LoginScreenAnimation.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var35 = class78.loginBoxCenter - 80;
											var9 = 311;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												KitDefinition.method2953();
												if (!class12.method159()) {
													Login.loginIndex = 12;
												} else {
													Login.loginIndex = 0;
												}
											}

											var35 = class78.loginBoxCenter + 80;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var35 = class78.loginBoxCenter;
											var9 = 321;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												if (!class12.method159()) {
													Login.loginIndex = 12;
												} else {
													Login.loginIndex = 0;
												}
											}
										} else if (Login.loginIndex == 14) {
											String var29 = "";
											switch(Login.field884) {
											case 0:
												var29 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1:
												var29 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											default:
												class20.Login_promptCredentials(false);
											}

											var40 = Login.loginBoxX + 180;
											var39 = 276;
											if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20) {
												LoginScreenAnimation.openURL(var29, true, false);
												class17.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
												class112.method2474(6);
												return;
											}

											var40 = Login.loginBoxX + 180;
											var39 = 326;
											if (var24 == 1 && var33 >= var40 - 75 && var33 <= var40 + 75 && var34 >= var39 - 20 && var34 <= var39 + 20) {
												class20.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var35 = Login.loginBoxX + 180;
											var9 = 301;
											if (var24 == 1 && var33 >= var35 - 75 && var33 <= var35 + 75 && var34 >= var9 - 20 && var34 <= var9 + 20) {
												if (class21.client.method1338()) {
													var10 = 10;
												} else {
													var10 = 0;
												}

												class112.method2474(var10);
												Login.method1930();
												class14.method175();
											}
										}
									} else {
										while (true) {
											do {
												if (!CollisionMap.isKeyDown()) {
													var36 = 321;
													if (var24 == 1 && var34 >= var36 - 20 && var34 <= var36 + 20) {
														class20.Login_promptCredentials(true);
													}

													return;
												}
											} while(class4.field13 != 84 && class4.field13 != 13);

											class20.Login_promptCredentials(true);
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

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "37"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (GrandExchangeOfferTotalQuantityComparator.loadInterface(var0)) {
			NetSocket.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
