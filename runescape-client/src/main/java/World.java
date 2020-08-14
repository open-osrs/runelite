import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("World")
public class World {
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1441971191
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1186159091
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("u")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("a")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1957394053
	)
	@Export("id")
	int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 698149195
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 291989859
	)
	@Export("population")
	int population;
	@ObfuscatedName("h")
	@Export("host")
	String host;
	@ObfuscatedName("k")
	@Export("activity")
	String activity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1891315591
	)
	@Export("location")
	int location;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 198131919
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1952948484"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-964696384"
	)
	boolean method1874() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1522011023"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1974803313"
	)
	boolean method1841() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "607891956"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1312079731"
	)
	boolean method1835() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIILga;Lfz;I)Z",
		garbageValue = "1323151453"
	)
	static final boolean method1856(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class182.directions[var7][var8] = 99;
		class182.distances[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class182.bufferX[var11] = var0;
		int var20 = var11 + 1;
		class182.bufferY[var11] = var1;
		int[][] var13 = var4.flags;

		while (true) {
			label309:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label286:
							do {
								if (var12 == var20) {
									class182.field2132 = var5;
									GrandExchangeOfferOwnWorldComparator.field666 = var6;
									return false;
								}

								var5 = class182.bufferX[var12];
								var6 = class182.bufferY[var12];
								var12 = var12 + 1 & 4095;
								var18 = var5 - var9;
								var19 = var6 - var10;
								var14 = var5 - var4.xInset;
								var15 = var6 - var4.yInset;
								if (var3.hasArrived(var2, var5, var6, var4)) {
									class182.field2132 = var5;
									GrandExchangeOfferOwnWorldComparator.field666 = var6;
									return true;
								}

								var16 = class182.distances[var18][var19] + 1;
								if (var18 > 0 && class182.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 - 1;
											class182.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 - 1][var19] = 2;
											class182.distances[var18 - 1][var19] = var16;
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && class182.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 + 1;
											class182.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 + 1][var19] = 8;
											class182.distances[var18 + 1][var19] = var16;
											break;
										}

										if ((var13[var14 + var2][var15 + var17] & 19136995) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 > 0 && class182.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18][var19 - 1] = 1;
											class182.distances[var18][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 < 128 - var2 && class182.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5;
											class182.bufferY[var20] = var6 + 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18][var19 + 1] = 4;
											class182.distances[var18][var19 + 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 > 0 && class182.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 - 1;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 - 1][var19 - 1] = 3;
											class182.distances[var18 - 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class182.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 + 1;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 + 1][var19 - 1] = 9;
											class182.distances[var18 + 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class182.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
									for (var17 = 1; var17 < var2; ++var17) {
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
											continue label286;
										}
									}

									class182.bufferX[var20] = var5 - 1;
									class182.bufferY[var20] = var6 + 1;
									var20 = var20 + 1 & 4095;
									class182.directions[var18 - 1][var19 + 1] = 6;
									class182.distances[var18 - 1][var19 + 1] = var16;
								}
							} while(var18 >= 128 - var2);
						} while(var19 >= 128 - var2);
					} while(class182.directions[var18 + 1][var19 + 1] != 0);
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

				for (var17 = 1; var17 < var2; ++var17) {
					if ((var13[var14 + var17][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) {
						continue label309;
					}
				}

				class182.bufferX[var20] = var5 + 1;
				class182.bufferY[var20] = var6 + 1;
				var20 = var20 + 1 & 4095;
				class182.directions[var18 + 1][var19 + 1] = 12;
				class182.distances[var18 + 1][var19 + 1] = var16;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;Lko;B)V",
		garbageValue = "-14"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Varcs.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Login.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			Language.method3786(var0, var1);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			ItemContainer.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var19;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) {
				HealthBar.titleboxSprite.drawAt(Login.loginBoxX + 180 - HealthBar.titleboxSprite.subWidth / 2, 271 - HealthBar.titleboxSprite.subHeight / 2);
				var22 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
				var23 = var22 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var23 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var23, 16777215, 0);
					var24 = 200;

					for (var5 = FaceNormal.method3392(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var23, 16777215, 0);
					var23 += 15;

					for (var19 = WorldMapRegion.method613(Login.Login_password); var0.stringWidth(var19) > var24; var19 = var19.substring(1)) {
					}

					var0.draw("Password: " + var19, Login.loginBoxX + 180 - 108, var23, 16777215, 0);
					var23 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				HealthBar.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var17;
				if (Login.loginIndex == 0) {
					var22 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0);
					var23 = var22 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 291;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var22 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
					var23 = var22 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 321;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var22 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var22, 16776960, 0);
						var23 = var22 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var23 += 7;
						var0.draw("Login: ", Login.loginBoxCenter - 110, var23, 16777215, 0);
						var24 = 200;

						for (var5 = FaceNormal.method3392(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? ItemContainer.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var23, 16777215, 0);
						var23 += 15;

						for (var19 = WorldMapRegion.method613(Login.Login_password); var0.stringWidth(var19) > var24; var19 = var19.substring(1)) {
						}

						var0.draw("Password: " + var19 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? ItemContainer.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var23, 16777215, 0);
						var23 += 15;
						var22 = 277;
						var7 = Login.loginBoxCenter + -117;
						boolean var9 = Client.Login_isUsernameRemembered;
						boolean var10 = Login.field1209;
						IndexedSprite var8 = var9 ? (var10 ? ScriptEvent.field597 : GameShell.options_buttons_2Sprite) : (var10 ? class336.field3912 : Login.options_buttons_0Sprite);
						var8.drawAt(var7, var22);
						var7 = var7 + var8.subWidth + 5;
						var1.draw("Remember username", var7, var22 + 13, 16776960, 0);
						var7 = Login.loginBoxCenter + 24;
						boolean var13 = NetSocket.clientPreferences.hideUsername;
						boolean var14 = Login.field1231;
						IndexedSprite var12 = var13 ? (var14 ? ScriptEvent.field597 : GameShell.options_buttons_2Sprite) : (var14 ? class336.field3912 : Login.options_buttons_0Sprite);
						var12.drawAt(var7, var22);
						var7 = var7 + var12.subWidth + 5;
						var1.draw("Hide username", var7, var22 + 13, 16776960, 0);
						var23 = var22 + 15;
						int var15 = Login.loginBoxCenter - 80;
						short var16 = 321;
						Fonts.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
						var15 = Login.loginBoxCenter + 80;
						Fonts.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
						var22 = 357;
						switch(Login.field1213) {
						case 2:
							WorldMapID.field300 = "Having trouble logging in?";
							break;
						default:
							WorldMapID.field300 = "Can't login? Click here.";
						}

						ItemContainer.field567 = new Bounds(Login.loginBoxCenter, var22, var1.stringWidth(WorldMapID.field300), 11);
						GrandExchangeOffer.field87 = new Bounds(Login.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(WorldMapID.field300, Login.loginBoxCenter, var22, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var22 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var22, 16776960, 0);
						var23 = var22 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 276;
						Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 326;
						Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0);
					} else {
						short var20;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var22 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.draw("PIN: " + WorldMapRegion.method613(ClanMate.otp) + (Client.cycle % 40 < 20 ? ItemContainer.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var23, 16777215, 0);
							var23 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var23, 16776960, 0);
							var23 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var23, 16776960, 0);
							var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
							int var27 = var23 - var0.ascent;
							IndexedSprite var29;
							if (Login.field1223) {
								var29 = GameShell.options_buttons_2Sprite;
							} else {
								var29 = Login.options_buttons_0Sprite;
							}

							var29.drawAt(var4, var27);
							var23 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var20 = 321;
							Fonts.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Continue", var7, var20 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Cancel", var7, var20 + 5, 16777215, 0);
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var20 + 36, 255, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var22 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var23 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var23, 16777215, 0);
							var24 = 174;

							for (var5 = FaceNormal.method3392(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? ItemContainer.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var23, 16777215, 0);
							var23 += 15;
							int var6 = Login.loginBoxX + 180 - 80;
							short var26 = 321;
							Fonts.titlebuttonSprite.drawAt(var6 - 73, var26 - 20);
							var0.drawCentered("Recover", var6, var26 + 5, 16777215, 0);
							var6 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var6 - 73, var26 - 20);
							var0.drawCentered("Back", var6, var26 + 5, 16777215, 0);
							var26 = 356;
							var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var26, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var22 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var17 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							var22 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var17 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 8) {
							var22 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var17 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Privacy Policy", var4, var17 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						} else if (Login.loginIndex == 12) {
							var22 = 201;
							String var21 = "";
							var5 = "";
							var19 = "";
							switch(Login.field1212) {
							case 0:
								var21 = "Your account has been disabled.";
								var5 = Strings.field2845;
								var19 = "";
								break;
							case 1:
								var21 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field2856;
								var19 = "";
								break;
							default:
								WorldMapRectangle.Login_promptCredentials(false);
							}

							var0.drawCentered(var21, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var7 = Login.loginBoxX + 180;
							var20 = 276;
							Fonts.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Support Page", var7, var20 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180;
							var20 = 326;
							Fonts.titlebuttonSprite.drawAt(var7 - 73, var20 - 20);
							var0.drawCentered("Back", var7, var20 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var22 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var17 = 301;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Ok", var4, var17 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var18 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var18);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class52.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var18);
			}

			Decimator.title_muteSprite[NetSocket.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && UserComparator9.clientLanguage == Language.Language_EN) {
				if (WorldMapIcon_1.field206 != null) {
					var23 = Login.xPadding + 5;
					var24 = 463;
					byte var28 = 100;
					byte var25 = 35;
					WorldMapIcon_1.field206.drawAt(var23, var24);
					var0.drawCentered("World" + " " + Client.worldId, var28 / 2 + var23, var25 / 2 + var24 - 2, 16777215, 0);
					if (VertexNormal.World_request != null) {
						var1.drawCentered("Loading...", var28 / 2 + var23, var25 / 2 + var24 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var28 / 2 + var23, var25 / 2 + var24 + 12, 16777215, 0);
					}
				} else {
					WorldMapIcon_1.field206 = class329.SpriteBuffer_getIndexedSpriteByName(GrandExchangeEvent.archive8, "sl_button", "");
				}
			}

		}
	}
}
