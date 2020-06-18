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

@ObfuscatedName("s")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "[Llh;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1238776823
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 2851107082298663307L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ld;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("j")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("p")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		signature = "(Lkn;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method172(2);
		this.grandExchangeOffer.method173(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1910615045"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-966567999"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "144078284"
	)
	static final void method153(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class171.field2036[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lbn;I)V",
		garbageValue = "-1052517513"
	)
	@Export("doCycleTitle")
	static void doCycleTitle(GameShell var0) {
		if (Login.worldSelectOpen) {
			Client.method1522(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				NetSocket.clientPreferences.titleMusicDisabled = !NetSocket.clientPreferences.titleMusicDisabled;
				SpriteMask.savePreferences();
				if (!NetSocket.clientPreferences.titleMusicDisabled) {
					WorldMapSection1.method656(UserComparator7.archive6, "scape main", "", 255, false);
				} else {
					class89.method2161();
				}
			}

			if (Client.gameState != 5) {
				if (Login.field1204 == -1L) {
					Login.field1204 = MilliClock.currentTimeMillis() + 1000L;
				}

				long var1 = MilliClock.currentTimeMillis();
				boolean var3;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var3 = true;
							break;
						}

						ArchiveLoader var4 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var4.isLoaded()) {
							var3 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var3 = true;
				}

				if (var3 && -1L == Login.field1211) {
					Login.field1211 = var1;
					if (Login.field1211 > Login.field1204) {
						Login.field1204 = Login.field1211;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var16;
					if (UserComparator9.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !ArchiveLoader.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var16 = Login.xPadding + 5;
							short var5 = 463;
							byte var6 = 100;
							byte var7 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var16 && MouseHandler.MouseHandler_lastPressedX <= var6 + var16 && MouseHandler.MouseHandler_lastPressedY >= var5 && MouseHandler.MouseHandler_lastPressedY <= var5 + var7) {
								WorldMapRegion.method591();
								return;
							}
						}

						if (VertexNormal.World_request != null) {
							WorldMapRegion.method591();
						}
					}

					var16 = MouseHandler.MouseHandler_lastButton;
					int var22 = MouseHandler.MouseHandler_lastPressedX;
					int var23 = MouseHandler.MouseHandler_lastPressedY;
					if (var16 == 0) {
						var22 = MouseHandler.MouseHandler_x;
						var23 = MouseHandler.MouseHandler_y;
					}

					if (!ArchiveLoader.mouseCam && var16 == 4) {
						var16 = 1;
					}

					short var26;
					int var27;
					if (Login.loginIndex == 0) {
						boolean var28 = false;

						while (WorldMapManager.isKeyDown()) {
							if (SecureRandomCallable.field546 == 84) {
								var28 = true;
							}
						}

						var27 = Login.loginBoxCenter - 80;
						var26 = 291;
						if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
							WorldMapSectionType.openURL(HealthBarDefinition.method4669("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var27 = Login.loginBoxCenter + 80;
						if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20 || var28) {
							if ((Client.worldProperties & 33554432) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Login.loginIndex = 1;
								class22.method225();
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
								Login.loginIndex = 1;
								class22.method225();
							} else if ((Client.worldProperties & 1024) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Login.loginIndex = 1;
								class22.method225();
							} else {
								WorldMapRectangle.Login_promptCredentials(false);
							}
						}
					} else {
						short var8;
						int var24;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!WorldMapManager.isKeyDown()) {
									var24 = Login.loginBoxCenter - 80;
									var8 = 321;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										WorldMapRectangle.Login_promptCredentials(false);
									}

									var24 = Login.loginBoxCenter + 80;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										Login.loginIndex = 0;
									}
									break;
								}

								if (SecureRandomCallable.field546 == 84) {
									WorldMapRectangle.Login_promptCredentials(false);
								} else if (SecureRandomCallable.field546 == 13) {
									Login.loginIndex = 0;
								}
							}
						} else {
							short var25;
							if (Login.loginIndex == 2) {
								var25 = 201;
								var24 = var25 + 52;
								if (var16 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) {
									Login.currentLoginField = 0;
								}

								var24 += 15;
								if (var16 == 1 && var23 >= var24 - 12 && var23 < var24 + 2) {
									Login.currentLoginField = 1;
								}

								var24 += 15;
								var25 = 361;
								if (ItemContainer.field567 != null) {
									var27 = ItemContainer.field567.highX / 2;
									if (var16 == 1 && var22 >= ItemContainer.field567.lowX - var27 && var22 <= var27 + ItemContainer.field567.lowX && var23 >= var25 - 15 && var23 < var25) {
										switch(Login.field1213) {
										case 1:
											MusicPatchPcmStream.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											Login.loginIndex = 5;
											return;
										case 2:
											WorldMapSectionType.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var27 = Login.loginBoxCenter - 80;
								var26 = 321;
								if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.length() == 0) {
										MusicPatchPcmStream.setLoginResponseString("", "Please enter your username/email address.", "");
										return;
									}

									if (Login.Login_password.length() == 0) {
										MusicPatchPcmStream.setLoginResponseString("", "Please enter your password.", "");
										return;
									}

									MusicPatchPcmStream.setLoginResponseString("", "Connecting to server...", "");
									SequenceDefinition.method4973(false);
									ClientPreferences.updateGameState(20);
									return;
								}

								var27 = Login.loginBoxX + 180 + 80;
								if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
									Login.loginIndex = 0;
									Login.Login_username = "";
									Login.Login_password = "";
									WorldMapSprite.field264 = 0;
									ClanMate.otp = "";
									Login.field1223 = true;
								}

								var27 = Login.loginBoxCenter + -117;
								var26 = 277;
								Login.field1209 = var22 >= var27 && var22 < var27 + ScriptEvent.field606 && var23 >= var26 && var23 < var26 + Skeleton.field1826;
								if (var16 == 1 && Login.field1209) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && NetSocket.clientPreferences.rememberedUsername != null) {
										NetSocket.clientPreferences.rememberedUsername = null;
										SpriteMask.savePreferences();
									}
								}

								var27 = Login.loginBoxCenter + 24;
								var26 = 277;
								Login.field1231 = var22 >= var27 && var22 < var27 + ScriptEvent.field606 && var23 >= var26 && var23 < var26 + Skeleton.field1826;
								if (var16 == 1 && Login.field1231) {
									NetSocket.clientPreferences.hideUsername = !NetSocket.clientPreferences.hideUsername;
									if (!NetSocket.clientPreferences.hideUsername) {
										Login.Login_username = "";
										NetSocket.clientPreferences.rememberedUsername = null;
										class22.method225();
									}

									SpriteMask.savePreferences();
								}

								while (true) {
									Transferable var11;
									int var12;
									do {
										while (true) {
											label875:
											do {
												while (true) {
													while (WorldMapManager.isKeyDown()) {
														if (SecureRandomCallable.field546 != 13) {
															if (Login.currentLoginField != 0) {
																continue label875;
															}

															NetFileRequest.method4304(class58.field442);
															if (SecureRandomCallable.field546 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (SecureRandomCallable.field546 == 84 || SecureRandomCallable.field546 == 80) {
																Login.currentLoginField = 1;
															}

															if (ModeWhere.method3810(class58.field442) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + class58.field442;
															}
														} else {
															Login.loginIndex = 0;
															Login.Login_username = "";
															Login.Login_password = "";
															WorldMapSprite.field264 = 0;
															ClanMate.otp = "";
															Login.field1223 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (SecureRandomCallable.field546 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (SecureRandomCallable.field546 == 84 || SecureRandomCallable.field546 == 80) {
												Login.currentLoginField = 0;
												if (SecureRandomCallable.field546 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														MusicPatchPcmStream.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														MusicPatchPcmStream.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													MusicPatchPcmStream.setLoginResponseString("", "Connecting to server...", "");
													SequenceDefinition.method4973(false);
													ClientPreferences.updateGameState(20);
													return;
												}
											}

											if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && SecureRandomCallable.field546 == 67) {
												Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var11 = var10.getContents(WorldMapSectionType.client);
												var12 = 20 - Login.Login_password.length();
												break;
											}

											if (ViewportMouse.method3071(class58.field442) && ModeWhere.method3810(class58.field442) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + class58.field442;
											}
										}
									} while(var12 <= 0);

									try {
										String var13 = (String)var11.getTransferData(DataFlavor.stringFlavor);
										int var14 = Math.min(var12, var13.length());

										for (int var15 = 0; var15 < var14; ++var15) {
											if (!ViewportMouse.method3071(var13.charAt(var15)) || !ModeWhere.method3810(var13.charAt(var15))) {
												Login.loginIndex = 3;
												return;
											}
										}

										Login.Login_password = Login.Login_password + var13.substring(0, var14);
									} catch (UnsupportedFlavorException var20) {
									} catch (IOException var21) {
									}
								}
							} else if (Login.loginIndex == 3) {
								var24 = Login.loginBoxX + 180;
								var8 = 276;
								if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
									WorldMapRectangle.Login_promptCredentials(false);
								}

								var24 = Login.loginBoxX + 180;
								var8 = 326;
								if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
									MusicPatchPcmStream.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
									Login.loginIndex = 5;
									return;
								}
							} else {
								int var17;
								if (Login.loginIndex == 4) {
									var24 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										ClanMate.otp.trim();
										if (ClanMate.otp.length() != 6) {
											MusicPatchPcmStream.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
											return;
										}

										WorldMapSprite.field264 = Integer.parseInt(ClanMate.otp);
										ClanMate.otp = "";
										SequenceDefinition.method4973(true);
										MusicPatchPcmStream.setLoginResponseString("", "Connecting to server...", "");
										ClientPreferences.updateGameState(20);
										return;
									}

									if (var16 == 1 && var22 >= Login.loginBoxX + 180 - 9 && var22 <= Login.loginBoxX + 180 + 130 && var23 >= 263 && var23 <= 296) {
										Login.field1223 = !Login.field1223;
									}

									if (var16 == 1 && var22 >= Login.loginBoxX + 180 - 34 && var22 <= Login.loginBoxX + 34 + 180 && var23 >= 351 && var23 <= 363) {
										WorldMapSectionType.openURL(HealthBarDefinition.method4669("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var24 = Login.loginBoxX + 180 + 80;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										Login.loginIndex = 0;
										Login.Login_username = "";
										Login.Login_password = "";
										WorldMapSprite.field264 = 0;
										ClanMate.otp = "";
									}

									while (WorldMapManager.isKeyDown()) {
										boolean var9 = false;

										for (var17 = 0; var17 < "1234567890".length(); ++var17) {
											if (class58.field442 == "1234567890".charAt(var17)) {
												var9 = true;
												break;
											}
										}

										if (SecureRandomCallable.field546 == 13) {
											Login.loginIndex = 0;
											Login.Login_username = "";
											Login.Login_password = "";
											WorldMapSprite.field264 = 0;
											ClanMate.otp = "";
										} else {
											if (SecureRandomCallable.field546 == 85 && ClanMate.otp.length() > 0) {
												ClanMate.otp = ClanMate.otp.substring(0, ClanMate.otp.length() - 1);
											}

											if (SecureRandomCallable.field546 == 84) {
												ClanMate.otp.trim();
												if (ClanMate.otp.length() != 6) {
													MusicPatchPcmStream.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
													return;
												}

												WorldMapSprite.field264 = Integer.parseInt(ClanMate.otp);
												ClanMate.otp = "";
												SequenceDefinition.method4973(true);
												MusicPatchPcmStream.setLoginResponseString("", "Connecting to server...", "");
												ClientPreferences.updateGameState(20);
												return;
											}

											if (var9 && ClanMate.otp.length() < 6) {
												ClanMate.otp = ClanMate.otp + class58.field442;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var24 = Login.loginBoxX + 180 - 80;
									var8 = 321;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										class89.method2159();
										return;
									}

									var24 = Login.loginBoxX + 180 + 80;
									if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
										WorldMapRectangle.Login_promptCredentials(true);
									}

									var26 = 361;
									if (GrandExchangeOffer.field87 != null) {
										var17 = GrandExchangeOffer.field87.highX / 2;
										if (var16 == 1 && var22 >= GrandExchangeOffer.field87.lowX - var17 && var22 <= var17 + GrandExchangeOffer.field87.lowX && var23 >= var26 - 15 && var23 < var26) {
											WorldMapSectionType.openURL(HealthBarDefinition.method4669("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (WorldMapManager.isKeyDown()) {
										boolean var29 = false;

										for (int var18 = 0; var18 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var18) {
											if (class58.field442 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var18)) {
												var29 = true;
												break;
											}
										}

										if (SecureRandomCallable.field546 == 13) {
											WorldMapRectangle.Login_promptCredentials(true);
										} else {
											if (SecureRandomCallable.field546 == 85 && Login.Login_username.length() > 0) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (SecureRandomCallable.field546 == 84) {
												class89.method2159();
												return;
											}

											if (var29 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + class58.field442;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										var24 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
											WorldMapSectionType.openURL(HealthBarDefinition.method4669("secure", true) + "m=dob/set_dob.ws", true, false);
											MusicPatchPcmStream.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var24 = Login.loginBoxX + 180 + 80;
										if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
											WorldMapRectangle.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 8) {
										var24 = Login.loginBoxX + 180 - 80;
										var8 = 321;
										if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
											WorldMapSectionType.openURL("https://www.jagex.com/terms/privacy", true, false);
											MusicPatchPcmStream.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var24 = Login.loginBoxX + 180 + 80;
										if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
											WorldMapRectangle.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 12) {
										String var19 = "";
										switch(Login.field1212) {
										case 0:
											var19 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
											break;
										case 1:
											var19 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
											break;
										default:
											WorldMapRectangle.Login_promptCredentials(false);
										}

										var27 = Login.loginBoxX + 180;
										var26 = 276;
										if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
											WorldMapSectionType.openURL(var19, true, false);
											MusicPatchPcmStream.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
											Login.loginIndex = 6;
											return;
										}

										var27 = Login.loginBoxX + 180;
										var26 = 326;
										if (var16 == 1 && var22 >= var27 - 75 && var22 <= var27 + 75 && var23 >= var26 - 20 && var23 <= var26 + 20) {
											WorldMapRectangle.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var24 = Login.loginBoxX + 180;
										var8 = 301;
										if (var16 == 1 && var22 >= var24 - 75 && var22 <= var24 + 75 && var23 >= var8 - 20 && var23 <= var8 + 20) {
											WorldMapRectangle.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!WorldMapManager.isKeyDown()) {
												var25 = 321;
												if (var16 == 1 && var23 >= var25 - 20 && var23 <= var25 + 20) {
													WorldMapRectangle.Login_promptCredentials(true);
												}

												return;
											}
										} while(SecureRandomCallable.field546 != 84 && SecureRandomCallable.field546 != 13);

										WorldMapRectangle.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "-55"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1823027767"
	)
	static void method158() {
		class335.SpriteBuffer_xOffsets = null;
		NPC.SpriteBuffer_yOffsets = null;
		class335.SpriteBuffer_spriteWidths = null;
		class335.SpriteBuffer_spriteHeights = null;
		class335.SpriteBuffer_spritePalette = null;
		ItemDefinition.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1963470031"
	)
	static final void method155(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuTargets[var0];
			WorldMapSection0.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		signature = "(Lhd;I)Lhd;",
		garbageValue = "-1293330124"
	)
	static Widget method157(Widget var0) {
		Widget var1 = FriendSystem.method1994(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}
