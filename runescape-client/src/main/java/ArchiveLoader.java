import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1464759987
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -722850475
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lil;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1844563500"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4305(var1) || this.archive.method4319(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)I",
		garbageValue = "-737934411"
	)
	static final int method1232(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4067) {
			case 2:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "919177129"
	)
	public static String method1229(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class300.field3695[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class300.field3695[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class300.field3695[(var6 & 15) << 2 | var7 >>> 6]).append(class300.field3695[var7 & 63]);
				} else {
					var3.append(class300.field3695[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class300.field3695[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "-12"
	)
	public static GameBuild method1225(int var0) {
		GameBuild[] var1 = class1.method11();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;Lku;I)V",
		garbageValue = "1414133310"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (IgnoreList.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Login.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var9;
		int var11;
		int var26;
		int var27;
		int var32;
		int var39;
		if (Login.worldSelectOpen) {
			if (class301.worldSelectBackSprites == null) {
				class301.worldSelectBackSprites = class280.method5008(Messages.archive8, "sl_back", "");
			}

			if (class90.worldSelectFlagSprites == null) {
				class90.worldSelectFlagSprites = class89.method2123(Messages.archive8, "sl_flags", "");
			}

			if (WorldMapSectionType.worldSelectArrows == null) {
				WorldMapSectionType.worldSelectArrows = class89.method2123(Messages.archive8, "sl_arrows", "");
			}

			if (class349.worldSelectStars == null) {
				class349.worldSelectStars = class89.method2123(Messages.archive8, "sl_stars", "");
			}

			if (VerticalAlignment.worldSelectLeftSprite == null) {
				VerticalAlignment.worldSelectLeftSprite = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "leftarrow", "");
			}

			if (class8.worldSelectRightSprite == null) {
				class8.worldSelectRightSprite = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class349.worldSelectStars != null) {
				class349.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class349.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var40;
			if (WorldMapSectionType.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					WorldMapSectionType.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					WorldMapSectionType.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					WorldMapSectionType.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					WorldMapSectionType.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var40 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					WorldMapSectionType.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var40, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					WorldMapSectionType.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var40 + 15, 4);
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1);
				var27 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					WorldMapSectionType.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var27, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					WorldMapSectionType.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var27 + 15, 4);
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class301.worldSelectBackSprites != null) {
				var3 = 88;
				byte var34 = 19;
				var40 = 765 / (var3 + 1) - 1;
				var27 = 480 / (var34 + 1);

				do {
					var39 = var27;
					var26 = var40;
					if (var27 * (var40 - 1) >= World.World_count) {
						--var40;
					}

					if (var40 * (var27 - 1) >= World.World_count) {
						--var27;
					}

					if (var40 * (var27 - 1) >= World.World_count) {
						--var27;
					}
				} while(var39 != var27 || var26 != var40);

				var39 = (765 - var3 * var40) / (var40 + 1);
				if (var39 > 5) {
					var39 = 5;
				}

				var26 = (480 - var34 * var27) / (var27 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var9 = (765 - var40 * var3 - var39 * (var40 - 1)) / 2;
				int var29 = (480 - var27 * var34 - var26 * (var27 - 1)) / 2;
				var11 = (var27 + World.World_count - 1) / var27;
				Login.worldSelectPagesCount = var11 - var40;
				if (VerticalAlignment.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					VerticalAlignment.worldSelectLeftSprite.drawAt(8, ModelData0.canvasHeight / 2 - VerticalAlignment.worldSelectLeftSprite.subHeight / 2);
				}

				if (class8.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class8.worldSelectRightSprite.drawAt(IgnoreList.canvasWidth - class8.worldSelectRightSprite.subWidth - 8, ModelData0.canvasHeight / 2 - class8.worldSelectRightSprite.subHeight / 2);
				}

				int var36 = var29 + 23;
				int var13 = var9 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var27; var17 < World.World_count && var16 - Login.worldSelectPage < var40; ++var17) {
					World var18 = World.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1845()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var36 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var34 + var36 && var19) {
						Login.hoveredWorldIndex = var17;
						class301.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var36, 128, 16777215);
						var15 = true;
					} else {
						class301.worldSelectBackSprites[var21].drawAt(var13, var36);
					}

					if (class90.worldSelectFlagSprites != null) {
						class90.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var36);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var34 / 2 + var36 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var34 / 2 + var36 + 5, 268435455, -1);
					var36 = var36 + var34 + var26;
					++var14;
					if (var14 >= var27) {
						var36 = var29 + 23;
						var13 = var13 + var39 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var37 + var30 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var30;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

			WorldMapIcon_0.rasterProvider.drawFull(0, 0);
		} else {
			class25.leftTitleSprite.drawAt(Login.xPadding, 0);
			class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var31;
			short var33;
			if (Client.gameState == 20) {
				WorldMapEvent.titleboxSprite.drawAt(Login.loginBoxX + 180 - WorldMapEvent.titleboxSprite.subWidth / 2, 271 - WorldMapEvent.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;
					var7 = Login.Login_password;
					var9 = var7.length();
					var10 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var10[var11] = '*';
					}

					var8 = new String(var10);

					for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				WorldMapEvent.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else {
					short var12;
					IndexedSprite var35;
					if (Login.loginIndex == 2) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var32, 16776960, 0);
						var32 += 15;
						var32 += 7;
						var0.draw("Login: ", Login.loginBoxCenter - 110, var32, 16777215, 0);
						var33 = 200;

						for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var32, 16777215, 0);
						var32 += 15;
						var7 = Login.Login_password;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);

						for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) {
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var32, 16777215, 0);
						var32 += 15;
						var31 = 277;
						var9 = Login.loginBoxCenter + -117;
						var35 = Strings.method4158(Client.Login_isUsernameRemembered, Login.field1192);
						var35.drawAt(var9, var31);
						var9 = var9 + var35.subWidth + 5;
						var1.draw("Remember username", var9, var31 + 13, 16776960, 0);
						var9 = Login.loginBoxCenter + 24;
						var35 = Strings.method4158(Timer.clientPreferences.hideUsername, Login.field1180);
						var35.drawAt(var9, var31);
						var9 = var9 + var35.subWidth + 5;
						var1.draw("Hide username", var9, var31 + 13, 16776960, 0);
						var32 = var31 + 15;
						var11 = Login.loginBoxCenter - 80;
						var12 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0);
						var11 = Login.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var31 = 357;
						switch(Login.field1190) {
						case 2:
							class22.field107 = "Having trouble logging in?";
							break;
						default:
							class22.field107 = "Can't login? Click here.";
						}

						GameShell.field481 = new Bounds(Login.loginBoxCenter, var31, var1.stringWidth(class22.field107), 11);
						GrandExchangeOfferOwnWorldComparator.field643 = new Bounds(Login.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class22.field107, Login.loginBoxCenter, var31, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var31 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var5 = "PIN: ";
						var7 = SecureRandomCallable.otp;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var32 - var0.ascent;
						if (Login.field1200) {
							var35 = ItemContainer.options_buttons_2Sprite;
						} else {
							var35 = DirectByteArrayCopier.options_buttons_0Sprite;
						}

						var35.drawAt(var26, var9);
						var32 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						var12 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;

						for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var27 = Login.loginBoxX + 180 - 80;
						short var25 = 321;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
						var27 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
						var25 = 356;
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var25, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 12) {
						var31 = 201;
						String var24 = "";
						var5 = "";
						String var6 = "";
						switch(Login.field1199) {
						case 0:
							var24 = "Your account has been disabled.";
							var5 = Strings.field3011;
							var6 = "";
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field2877;
							var6 = "";
							break;
						default:
							AbstractWorldMapIcon.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var39 = Login.loginBoxX + 180;
						short var41 = 276;
						Login.titlebuttonSprite.drawAt(var39 - 73, var41 - 20);
						var0.drawCentered("Support Page", var39, var41 + 5, 16777215, 0);
						var39 = Login.loginBoxX + 180;
						var41 = 326;
						Login.titlebuttonSprite.drawAt(var39 - 73, var41 - 20);
						var0.drawCentered("Back", var39, var41 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var28 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var28);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, ModelData0.canvasHeight);
				class1.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class1.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var28);
			}

			Login.title_muteSprite[Timer.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == WorldMapScaleHandler.clientLanguage) {
				if (class9.field42 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var38 = 100;
					byte var42 = 35;
					class9.field42.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var38 / 2 + var32, var42 / 2 + var33 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					class9.field42 = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-2003250230"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class7.method86(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field933 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "636889033"
	)
	static String method1230(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
