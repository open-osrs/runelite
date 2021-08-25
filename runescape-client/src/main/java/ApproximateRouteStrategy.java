import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -301087245
	)
	static int field466;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 2002085165
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 132174869
	)
	@Export("menuY")
	static int menuY;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILfk;S)Z",
		garbageValue = "13398"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1224455590"
	)
	static String method1122(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llu;Llu;Llu;I)V",
		garbageValue = "-369767487"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (InvDefinition.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class11.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) {
			if (DevicePcmPlayerProvider.worldSelectBackSprites == null) {
				DevicePcmPlayerProvider.worldSelectBackSprites = Messages.method2332(World.archive8, "sl_back", "");
			}

			if (WorldMapSection1.worldSelectFlagSprites == null) {
				WorldMapSection1.worldSelectFlagSprites = PacketBuffer.method6764(World.archive8, "sl_flags", "");
			}

			if (World.worldSelectArrows == null) {
				World.worldSelectArrows = PacketBuffer.method6764(World.archive8, "sl_arrows", "");
			}

			if (class7.worldSelectStars == null) {
				class7.worldSelectStars = PacketBuffer.method6764(World.archive8, "sl_stars", "");
			}

			if (class184.worldSelectLeftSprite == null) {
				class184.worldSelectLeftSprite = class196.SpriteBuffer_getIndexedSpriteByName(World.archive8, "leftarrow", "");
			}

			if (FriendsChat.worldSelectRightSprite == null) {
				FriendsChat.worldSelectRightSprite = class196.SpriteBuffer_getIndexedSpriteByName(World.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class7.worldSelectStars != null) {
				class7.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class7.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (World.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var45 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var45, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var45 + 15, 4);
				}

				var0.draw("Location", var45 + 32, 17, 16777215, -1);
				var25 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var25, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (DevicePcmPlayerProvider.worldSelectBackSprites != null) {
				var3 = 88;
				byte var39 = 19;
				var45 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var39 + 1);

				int var35;
				do {
					var7 = var25;
					var35 = var45;
					if (var25 * (var45 - 1) >= World.World_count) {
						--var45;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while(var7 != var25 || var35 != var45);

				var7 = (765 - var45 * var3) / (var45 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var35 = (480 - var25 * var39) / (var25 + 1);
				if (var35 > 5) {
					var35 = 5;
				}

				int var37 = (765 - var45 * var3 - var7 * (var45 - 1)) / 2;
				int var38 = (480 - var39 * var25 - var35 * (var25 - 1)) / 2;
				int var28 = (var25 + World.World_count - 1) / var25;
				Login.worldSelectPagesCount = var28 - var45;
				if (class184.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class184.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - class184.worldSelectLeftSprite.subHeight / 2);
				}

				if (FriendsChat.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					FriendsChat.worldSelectRightSprite.drawAt(InvDefinition.canvasWidth - FriendsChat.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - FriendsChat.worldSelectRightSprite.subHeight / 2);
				}

				int var29 = var38 + 23;
				int var40 = var37 + Login.xPadding;
				int var41 = 0;
				boolean var42 = false;
				int var43 = Login.worldSelectPage;

				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) {
					World var18 = class393.World_worlds[var17];
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
					} else if (var18.method1616()) {
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

					if (MouseHandler.MouseHandler_x >= var40 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var40 + var3 && MouseHandler.MouseHandler_y < var29 + var39 && var19) {
						Login.hoveredWorldIndex = var17;
						DevicePcmPlayerProvider.worldSelectBackSprites[var21].drawTransOverlayAt(var40, var29, 128, 16777215);
						var42 = true;
					} else {
						DevicePcmPlayerProvider.worldSelectBackSprites[var21].drawAt(var40, var29);
					}

					if (WorldMapSection1.worldSelectFlagSprites != null) {
						WorldMapSection1.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var40 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var40 + 15, var39 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var40 + 60, var39 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var35 + var39;
					++var41;
					if (var41 >= var25) {
						var29 = var38 + 23;
						var40 = var40 + var7 + var3;
						var41 = 0;
						++var43;
					}
				}

				if (var42) {
					var17 = var1.stringWidth(class393.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var44 = MouseHandler.MouseHandler_y + 25;
					if (var44 + var30 > 480) {
						var44 = MouseHandler.MouseHandler_y - 25 - var30;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0);
					var1.drawCentered(class393.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1);
				}
			}

			class11.rasterProvider.drawFull(0, 0);
		} else {
			class318.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class394.logoSprite.drawAt(Login.xPadding + 382 - class394.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = AbstractWorldMapData.method3800(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = GraphicsObject.method1866(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
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
				} else if (Login.loginIndex == 2) {
					var31 = 201;
					var0.drawCentered(Login.Login_response1, class11.loginBoxCenter, var31, 16776960, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, class11.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, class11.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var32 += 7;
					var0.draw("Login: ", class11.loginBoxCenter - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = AbstractWorldMapData.method3800(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class54.colorStartTag(16776960) + "|" : ""), class11.loginBoxCenter - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = GraphicsObject.method1866(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class54.colorStartTag(16776960) + "|" : ""), class11.loginBoxCenter - 108, var32, 16777215, 0);
					var32 += 15;
					var31 = 277;
					var7 = class11.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var10 = Login.field891;
					IndexedSprite var26 = var9 ? (var10 ? PlayerComposition.field3019 : Client.options_buttons_2Sprite) : (var10 ? class21.field107 : ModelData0.options_buttons_0Sprite);
					var26.drawAt(var7, var31);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0);
					var7 = class11.loginBoxCenter + 24;
					boolean var13 = VarbitComposition.clientPreferences.hideUsername;
					boolean var14 = Login.field904;
					IndexedSprite var12 = var13 ? (var14 ? PlayerComposition.field3019 : Client.options_buttons_2Sprite) : (var14 ? class21.field107 : ModelData0.options_buttons_0Sprite);
					var12.drawAt(var7, var31);
					var7 = var7 + var12.subWidth + 5;
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0);
					var32 = var31 + 15;
					int var15 = class11.loginBoxCenter - 80;
					short var16 = 321;
					Login.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
					var15 = class11.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
					var31 = 357;
					switch(Login.field883) {
					case 2:
						LoginScreenAnimation.field1167 = "Having trouble logging in?";
						break;
					default:
						LoginScreenAnimation.field1167 = "Can't login? Click here.";
					}

					WorldMapSectionType.field2125 = new Bounds(class11.loginBoxCenter, var31, var1.stringWidth(LoginScreenAnimation.field1167), 11);
					PcmPlayer.field287 = new Bounds(class11.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(LoginScreenAnimation.field1167, class11.loginBoxCenter, var31, 16777215, 0);
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
				} else {
					short var8;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.draw("PIN: " + GraphicsObject.method1866(AbstractWorldMapIcon.otp) + (Client.cycle % 40 < 20 ? class54.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var45 = var32 - var0.ascent;
						IndexedSprite var34;
						if (Login.field893) {
							var34 = Client.options_buttons_2Sprite;
						} else {
							var34 = ModelData0.options_buttons_0Sprite;
						}

						var34.drawAt(var4, var45);
						var32 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var8 = 321;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
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

						for (var5 = AbstractWorldMapData.method3800(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class54.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						short var36 = 321;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", class11.loginBoxCenter, var36, 268435455, 0);
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
					} else if (Login.loginIndex == 9) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var32 = Login.loginBoxX + 180;
						var33 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = var33 + 20;
						UserComparator8.field1312.drawAt(var32 - 109, var4);
						class14.field69.drawAt(var32 - 48, var4 + 18);
					} else if (Login.loginIndex == 12) {
						var32 = class11.loginBoxCenter;
						var33 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0);
						var4 = var33 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0);
						var32 = class11.loginBoxCenter - 80;
						var33 = 311;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0);
						var32 = class11.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var31 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var31 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var31 - 20);
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var31 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.field874) {
						case 0:
							var24 = "Your account has been disabled.";
							var5 = Strings.field3400;
							var6 = "";
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3439;
							var6 = "";
							break;
						default:
							SecureRandomFuture.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var7 = Login.loginBoxX + 180;
						var8 = 276;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180;
						var8 = 326;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
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
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			class92.title_muteSprite[VarbitComposition.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == class323.clientLanguage) {
				if (class275.field3281 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var47 = 100;
					byte var46 = 35;
					class275.field3281.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var47 / 2 + var32, var46 / 2 + var33 - 2, 16777215, 0);
					if (WorldMapArchiveLoader.World_request != null) {
						var1.drawCentered("Loading...", var47 / 2 + var32, var46 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var47 / 2 + var32, var46 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					class275.field3281 = class196.SpriteBuffer_getIndexedSpriteByName(World.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "71"
	)
	static int method1123(int var0, Script var1, boolean var2) {
		Widget var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
