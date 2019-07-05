import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("IndexCacheLoader")
public class IndexCacheLoader {
   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      signature = "Lko;"
   )
   static class310 field512;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Llq;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;
   @ObfuscatedName("x")
   public static short[][] field406;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = 636454135
   )
   static int field407;
   @ObfuscatedName("gw")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   @Export("indexCache")
   final IndexCache indexCache;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1459455501
   )
   final int field408;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 782003089
   )
   int field409;

   @ObfuscatedSignature(
      signature = "(Lit;Ljava/lang/String;)V"
   )
   IndexCacheLoader(IndexCache var1, String var2) {
      this.field409 = 0;
      this.indexCache = var1;
      this.field408 = var1.method5();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1352221725"
   )
   boolean method134() {
      this.field409 = 0;

      for (int var1 = 0; var1 < this.field408; ++var1) {
         if (!this.indexCache.method133(var1) || this.indexCache.method132(var1)) {
            ++this.field409;
         }
      }

      return this.field409 >= this.field408;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lkk;Lkk;Lkk;I)V",
      garbageValue = "839403460"
   )
   @Export("drawTitle")
   static void drawTitle(Font var0, Font var1, Font var2) {
      Login.xPadding = (SoundCache.canvasWidth - 765) / 2;
      Login.loginBoxX = Login.xPadding + 202;
      Varps.loginBoxCenter = Login.loginBoxX + 180;
      int var3;
      int var4;
      int var5;
      byte var6;
      int var7;
      int var8;
      int var9;
      int var10;
      boolean var20;
      if (Login.worldSelectOpen) {
         if (class30.worldSelectBackSprites == null) {
            class30.worldSelectBackSprites = class2.method20(WorldMapSection3.indexCache8, "sl_back", "");
         }

         IndexCache var11;
         int var12;
         int var13;
         IndexedSprite[] var14;
         if (Frames.worldSelectFlagSprites == null) {
            var11 = WorldMapSection3.indexCache8;
            var13 = var11.getArchiveId("sl_flags");
            var12 = var11.getRecordId(var13, "");
            if (!SpriteMask.loadSprite(var11, var13, var12)) {
               var14 = null;
            } else {
               var14 = WorldMapLabel.createIndexedSpriteArray();
            }

            Frames.worldSelectFlagSprites = var14;
         }

         if (AttackOption.worldSelectArrows == null) {
            var11 = WorldMapSection3.indexCache8;
            var13 = var11.getArchiveId("sl_arrows");
            var12 = var11.getRecordId(var13, "");
            if (!SpriteMask.loadSprite(var11, var13, var12)) {
               var14 = null;
            } else {
               var14 = WorldMapLabel.createIndexedSpriteArray();
            }

            AttackOption.worldSelectArrows = var14;
         }

         if (UrlRequest.worldSelectStars == null) {
            var11 = WorldMapSection3.indexCache8;
            var13 = var11.getArchiveId("sl_stars");
            var12 = var11.getRecordId(var13, "");
            if (!SpriteMask.loadSprite(var11, var13, var12)) {
               var14 = null;
            } else {
               var14 = WorldMapLabel.createIndexedSpriteArray();
            }

            UrlRequest.worldSelectStars = var14;
         }

         if (SecureRandomFuture.worldSelectLeftSprite == null) {
            SecureRandomFuture.worldSelectLeftSprite = MenuAction.loadIndexedSpriteByName(WorldMapSection3.indexCache8, "leftarrow", "");
         }

         if (NetSocket.worldSelectRightSprite == null) {
            NetSocket.worldSelectRightSprite = MenuAction.loadIndexedSpriteByName(WorldMapSection3.indexCache8, "rightarrow", "");
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
         Rasterizer2D.drawGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.drawGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
         var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
         if (UrlRequest.worldSelectStars != null) {
            UrlRequest.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
            var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
            UrlRequest.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
            var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
         }

         if (AttackOption.worldSelectArrows != null) {
            var10 = Login.xPadding + 280;
            if (World.sortOption1[0] == 0 && World.sortOption2[0] == 0) {
               AttackOption.worldSelectArrows[2].drawAt(var10, 4);
            } else {
               AttackOption.worldSelectArrows[0].drawAt(var10, 4);
            }

            if (World.sortOption1[0] == 0 && World.sortOption2[0] == 1) {
               AttackOption.worldSelectArrows[3].drawAt(var10 + 15, 4);
            } else {
               AttackOption.worldSelectArrows[1].drawAt(var10 + 15, 4);
            }

            var0.draw("World", var10 + 32, 17, 16777215, -1);
            var7 = Login.xPadding + 390;
            if (World.sortOption1[0] == 1 && World.sortOption2[0] == 0) {
               AttackOption.worldSelectArrows[2].drawAt(var7, 4);
            } else {
               AttackOption.worldSelectArrows[0].drawAt(var7, 4);
            }

            if (World.sortOption1[0] == 1 && World.sortOption2[0] == 1) {
               AttackOption.worldSelectArrows[3].drawAt(var7 + 15, 4);
            } else {
               AttackOption.worldSelectArrows[1].drawAt(var7 + 15, 4);
            }

            var0.draw("Players", var7 + 32, 17, 16777215, -1);
            var13 = Login.xPadding + 500;
            if (World.sortOption1[0] == 2 && World.sortOption2[0] == 0) {
               AttackOption.worldSelectArrows[2].drawAt(var13, 4);
            } else {
               AttackOption.worldSelectArrows[0].drawAt(var13, 4);
            }

            if (World.sortOption1[0] == 2 && World.sortOption2[0] == 1) {
               AttackOption.worldSelectArrows[3].drawAt(var13 + 15, 4);
            } else {
               AttackOption.worldSelectArrows[1].drawAt(var13 + 15, 4);
            }

            var0.draw("Location", var13 + 32, 17, 16777215, -1);
            var12 = Login.xPadding + 610;
            if (World.sortOption1[0] == 3 && World.sortOption2[0] == 0) {
               AttackOption.worldSelectArrows[2].drawAt(var12, 4);
            } else {
               AttackOption.worldSelectArrows[0].drawAt(var12, 4);
            }

            if (World.sortOption1[0] == 3 && World.sortOption2[0] == 1) {
               AttackOption.worldSelectArrows[3].drawAt(var12 + 15, 4);
            } else {
               AttackOption.worldSelectArrows[1].drawAt(var12 + 15, 4);
            }

            var0.draw("Type", var12 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
         var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
         Login.hoveredWorldIndex = -1;
         if (class30.worldSelectBackSprites != null) {
            var6 = 88;
            byte var15 = 19;
            var13 = 765 / (var6 + 1) - 1;
            var12 = 480 / (var15 + 1);

            while (true) {
               var8 = var12;
               var9 = var13;
               if (var12 * (var13 - 1) >= World.worldsCount) {
                  --var13;
               }

               if (var13 * (var12 - 1) >= World.worldsCount) {
                  --var12;
               }

               if (var13 * (var12 - 1) >= World.worldsCount) {
                  --var12;
               }

               if (var12 == var8 && var13 == var9) {
                  var8 = (765 - var6 * var13) / (var13 + 1);
                  if (var8 > 5) {
                     var8 = 5;
                  }

                  var9 = (480 - var15 * var12) / (var12 + 1);
                  if (var9 > 5) {
                     var9 = 5;
                  }

                  var3 = (765 - var13 * var6 - var8 * (var13 - 1)) / 2;
                  int var16 = (480 - var12 * var15 - var9 * (var12 - 1)) / 2;
                  var4 = (var12 + World.worldsCount - 1) / var12;
                  Login.worldSelectPagesCount = var4 - var13;
                  if (SecureRandomFuture.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
                     SecureRandomFuture.worldSelectLeftSprite.drawAt(8, Huffman.canvasHeight / 2 - SecureRandomFuture.worldSelectLeftSprite.subHeight / 2);
                  }

                  if (NetSocket.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
                     NetSocket.worldSelectRightSprite.drawAt(SoundCache.canvasWidth - NetSocket.worldSelectRightSprite.subWidth - 8, Huffman.canvasHeight / 2 - NetSocket.worldSelectRightSprite.subHeight / 2);
                  }

                  int var17 = var16 + 23;
                  int var18 = var3 + Login.xPadding;
                  int var19 = 0;
                  var20 = false;
                  int var21 = Login.worldSelectPage;

                  int var22;
                  for (var22 = var12 * var21; var22 < World.worldsCount && var21 - Login.worldSelectPage < var13; ++var22) {
                     World var23 = ItemContainer.worlds[var22];
                     boolean var24 = true;
                     String var25 = Integer.toString(var23.population);
                     if (var23.population == -1) {
                        var25 = "OFF";
                        var24 = false;
                     } else if (var23.population > 1980) {
                        var25 = "FULL";
                        var24 = false;
                     }

                     int var26 = 0;
                     byte var27;
                     if (var23.isBeta()) {
                        if (var23.isMembersOnly()) {
                           var27 = 7;
                        } else {
                           var27 = 6;
                        }
                     } else if (var23.isDeadman()) {
                        var26 = 16711680;
                        if (var23.isMembersOnly()) {
                           var27 = 5;
                        } else {
                           var27 = 4;
                        }
                     } else if (var23.isPvp()) {
                        if (var23.isMembersOnly()) {
                           var27 = 3;
                        } else {
                           var27 = 2;
                        }
                     } else if (var23.isMembersOnly()) {
                        var27 = 1;
                     } else {
                        var27 = 0;
                     }

                     if (MouseHandler.MouseHandler_x >= var18 && MouseHandler.MouseHandler_y >= var17 && MouseHandler.MouseHandler_x < var18 + var6 && MouseHandler.MouseHandler_y < var15 + var17 && var24) {
                        Login.hoveredWorldIndex = var22;
                        class30.worldSelectBackSprites[var27].drawAtTransOverlay(var18, var17, 128, 16777215);
                        var20 = true;
                     } else {
                        class30.worldSelectBackSprites[var27].drawAt(var18, var17);
                     }

                     if (Frames.worldSelectFlagSprites != null) {
                        Frames.worldSelectFlagSprites[(var23.isMembersOnly() ? 8 : 0) + var23.location].drawAt(var18 + 29, var17);
                     }

                     var0.drawCentered(Integer.toString(var23.id), var18 + 15, var15 / 2 + var17 + 5, var26, -1);
                     var1.drawCentered(var25, var18 + 60, var15 / 2 + var17 + 5, 268435455, -1);
                     var17 = var17 + var9 + var15;
                     ++var19;
                     if (var19 >= var12) {
                        var17 = var16 + 23;
                        var18 = var18 + var6 + var8;
                        var19 = 0;
                        ++var21;
                     }
                  }

                  if (var20) {
                     var22 = var1.stringWidth(ItemContainer.worlds[Login.hoveredWorldIndex].activity) + 6;
                     int var47 = var1.ascent + 8;
                     var5 = MouseHandler.MouseHandler_y + 25;
                     if (var47 + var5 > 480) {
                        var5 = MouseHandler.MouseHandler_y - 25 - var47;
                     }

                     Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var22 / 2, var5, var22, var47, 16777120);
                     Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var22 / 2, var5, var22, var47, 0);
                     var1.drawCentered(ItemContainer.worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var5 + var1.ascent + 4, 0, -1);
                  }
                  break;
               }
            }
         }

         class197.rasterProvider.drawFull(0, 0);
      } else {
         Login.leftTitleSprite.drawAt(Login.xPadding, 0);
         Fonts.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         WorldMapSectionType.logoSprite.drawAt(Login.xPadding + 382 - WorldMapSectionType.logoSprite.subWidth / 2, 18);
         if (Client.gameState == 0 || Client.gameState == 5) {
            var6 = 20;
            var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var6, 16777215, -1);
            var7 = 253 - var6;
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var7, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var7 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var7 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var7 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
            var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var6, 16777215, -1);
         }

         String var28;
         String var29;
         String var30;
         String var31;
         short var32;
         String var33;
         short var34;
         if (Client.gameState == 20) {
            Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
            var32 = 201;
            var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
            var10 = var32 + 15;
            var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var10, 16776960, 0);
            var10 += 15;
            var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var10, 16776960, 0);
            var10 += 15;
            var10 += 7;
            if (Login.loginIndex != 4) {
               var0.draw("Login: ", Login.loginBoxX + 180 - 110, var10, 16777215, 0);
               var34 = 200;
               if (ReflectionCheck.clientPreferences.hideUsername) {
                  var29 = Login.Login_username;
                  var28 = class168.method3450('*', var29.length());
                  var30 = var28;
               } else {
                  var30 = Login.Login_username;
               }

               for (var30 = var30; var0.stringWidth(var30) > var34; var30 = var30.substring(0, var30.length() - 1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var30), Login.loginBoxX + 180 - 70, var10, 16777215, 0);
               var10 += 15;
               var29 = "Password: ";
               var33 = Login.Login_password;
               var31 = class168.method3450('*', var33.length());
               var0.draw(var29 + var31, Login.loginBoxX + 180 - 108, var10, 16777215, 0);
               var10 += 15;
            }
         }

         if (Client.gameState == 10 || Client.gameState == 11) {
            Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
            short var35;
            if (Login.loginIndex == 0) {
               var32 = 251;
               var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
               var10 = var32 + 30;
               var7 = Login.loginBoxX + 180 - 80;
               var35 = 291;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var0.drawLines("New User", var7 - 73, var35 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var7 = Login.loginBoxX + 180 + 80;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var0.drawLines("Existing User", var7 - 73, var35 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (Login.loginIndex == 1) {
               var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
               var32 = 236;
               var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
               var10 = var32 + 15;
               var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var10, 16777215, 0);
               var10 += 15;
               var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var10, 16777215, 0);
               var10 += 15;
               var7 = Login.loginBoxX + 180 - 80;
               var35 = 321;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var0.drawCentered("Continue", var7, var35 + 5, 16777215, 0);
               var7 = Login.loginBoxX + 180 + 80;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var0.drawCentered("Cancel", var7, var35 + 5, 16777215, 0);
            } else if (Login.loginIndex == 2) {
               var32 = 201;
               var0.drawCentered(Login.Login_response1, Varps.loginBoxCenter, var32, 16776960, 0);
               var10 = var32 + 15;
               var0.drawCentered(Login.Login_response2, Varps.loginBoxCenter, var10, 16776960, 0);
               var10 += 15;
               var0.drawCentered(Login.Login_response3, Varps.loginBoxCenter, var10, 16776960, 0);
               var10 += 15;
               var10 += 7;
               var0.draw("Login: ", Varps.loginBoxCenter - 110, var10, 16777215, 0);
               var34 = 200;
               if (ReflectionCheck.clientPreferences.hideUsername) {
                  var29 = Login.Login_username;
                  var28 = class168.method3450('*', var29.length());
                  var30 = var28;
               } else {
                  var30 = Login.Login_username;
               }

               for (var30 = var30; var0.stringWidth(var30) > var34; var30 = var30.substring(1)) {
               }

               var0.draw(AbstractFont.escapeBrackets(var30) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? BufferedFile.colorStartTag(16776960) + "|" : ""), Varps.loginBoxCenter - 70, var10, 16777215, 0);
               var10 += 15;
               var29 = "Password: ";
               var33 = Login.Login_password;
               var31 = class168.method3450('*', var33.length());
               var0.draw(var29 + var31 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? BufferedFile.colorStartTag(16776960) + "|" : ""), Varps.loginBoxCenter - 108, var10, 16777215, 0);
               var10 += 15;
               var32 = 277;
               var4 = Varps.loginBoxCenter + -117;
               boolean var40 = Client.Login_isUsernameRemembered;
               var20 = Login.field468;
               IndexedSprite var46 = var40 ? (var20 ? KeyHandler.options_buttons_6Sprite : class308.options_buttons_2Sprite) : (var20 ? GraphicsObject.options_buttons_4Sprite : Login.options_buttons_0Sprite);
               var46.drawAt(var4, var32);
               var4 = var4 + var46.subWidth + 5;
               var1.draw("Remember username", var4, var32 + 13, 16776960, 0);
               var4 = Varps.loginBoxCenter + 24;
               boolean var44 = ReflectionCheck.clientPreferences.hideUsername;
               boolean var48 = Login.field469;
               IndexedSprite var49 = var44 ? (var48 ? KeyHandler.options_buttons_6Sprite : class308.options_buttons_2Sprite) : (var48 ? GraphicsObject.options_buttons_4Sprite : Login.options_buttons_0Sprite);
               var49.drawAt(var4, var32);
               var4 = var4 + var49.subWidth + 5;
               var1.draw("Hide username", var4, var32 + 13, 16776960, 0);
               var10 = var32 + 15;
               var5 = Varps.loginBoxCenter - 80;
               short var50 = 321;
               titlebuttonSprite.drawAt(var5 - 73, var50 - 20);
               var0.drawCentered("Login", var5, var50 + 5, 16777215, 0);
               var5 = Varps.loginBoxCenter + 80;
               titlebuttonSprite.drawAt(var5 - 73, var50 - 20);
               var0.drawCentered("Cancel", var5, var50 + 5, 16777215, 0);
               var32 = 357;
               switch(Login.field467) {
               case 2:
                  AttackOption.field31 = "Having trouble logging in?";
                  break;
               default:
                  AttackOption.field31 = "Can't login? Click here.";
               }

               TilePaint.field907 = new Bounds(Varps.loginBoxCenter, var32, var1.stringWidth(AttackOption.field31), 11);
               UrlRequester.field930 = new Bounds(Varps.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
               var1.drawCentered(AttackOption.field31, Varps.loginBoxCenter, var32, 16777215, 0);
            } else if (Login.loginIndex == 3) {
               var32 = 201;
               var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0);
               var10 = var32 + 20;
               var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var10, 16776960, 0);
               var10 += 15;
               var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var10, 16776960, 0);
               var10 += 15;
               var7 = Login.loginBoxX + 180;
               var35 = 276;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var2.drawCentered("Try again", var7, var35 + 5, 16777215, 0);
               var7 = Login.loginBoxX + 180;
               var35 = 326;
               titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
               var2.drawCentered("Forgotten password?", var7, var35 + 5, 16777215, 0);
            } else {
               String var36;
               if (Login.loginIndex == 4) {
                  var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                  var32 = 236;
                  var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
                  var10 = var32 + 15;
                  var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var10, 16777215, 0);
                  var10 += 15;
                  var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var10, 16777215, 0);
                  var10 += 15;
                  var36 = "PIN: ";
                  var28 = Login.otp;
                  var30 = class168.method3450('*', var28.length());
                  var0.draw(var36 + var30 + (Client.cycle % 40 < 20 ? BufferedFile.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var10, 16777215, 0);
                  var10 -= 8;
                  var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var10, 16776960, 0);
                  var10 += 15;
                  var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var10, 16776960, 0);
                  var9 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
                  var3 = var10 - var0.ascent;
                  IndexedSprite var43;
                  if (Login.field470) {
                     var43 = class308.options_buttons_2Sprite;
                  } else {
                     var43 = Login.options_buttons_0Sprite;
                  }

                  var43.drawAt(var9, var3);
                  var10 += 15;
                  var4 = Login.loginBoxX + 180 - 80;
                  short var45 = 321;
                  titlebuttonSprite.drawAt(var4 - 73, var45 - 20);
                  var0.drawCentered("Continue", var4, var45 + 5, 16777215, 0);
                  var4 = Login.loginBoxX + 180 + 80;
                  titlebuttonSprite.drawAt(var4 - 73, var45 - 20);
                  var0.drawCentered("Cancel", var4, var45 + 5, 16777215, 0);
                  var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var45 + 36, 255, 0);
               } else {
                  short var37;
                  if (Login.loginIndex != 5) {
                     if (Login.loginIndex == 6) {
                        var32 = 201;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                        var10 = var32 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var7 = Login.loginBoxX + 180;
                        var35 = 321;
                        titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
                        var0.drawCentered("Back", var7, var35 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 7) {
                        var32 = 216;
                        var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
                        var10 = var32 + 15;
                        var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var7 = Login.loginBoxX + 180 - 80;
                        var35 = 321;
                        titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
                        var0.drawCentered("Set Date of Birth", var7, var35 + 5, 16777215, 0);
                        var7 = Login.loginBoxX + 180 + 80;
                        titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
                        var0.drawCentered("Back", var7, var35 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 8) {
                        var32 = 216;
                        var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0);
                        var10 = var32 + 15;
                        var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var7 = Login.loginBoxX + 180 - 80;
                        var35 = 321;
                        titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
                        var0.drawCentered("Privacy Policy", var7, var35 + 5, 16777215, 0);
                        var7 = Login.loginBoxX + 180 + 80;
                        titlebuttonSprite.drawAt(var7 - 73, var35 - 20);
                        var0.drawCentered("Back", var7, var35 + 5, 16777215, 0);
                     } else if (Login.loginIndex == 12) {
                        var32 = 201;
                        String var41 = "";
                        var36 = "";
                        var30 = "";
                        switch(Login.field466) {
                        case 0:
                           var41 = "Your account has been disabled.";
                           var36 = Strings.field880;
                           var30 = "";
                           break;
                        case 1:
                           var41 = "Account locked as we suspect it has been stolen.";
                           var36 = Strings.field881;
                           var30 = "";
                           break;
                        default:
                           MouseHandler.method1084(false);
                        }

                        var0.drawCentered(var41, Login.loginBoxX + 180, var32, 16776960, 0);
                        var10 = var32 + 15;
                        var2.drawCentered(var36, Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var2.drawCentered(var30, Login.loginBoxX + 180, var10, 16776960, 0);
                        var10 += 15;
                        var8 = Login.loginBoxX + 180;
                        var37 = 276;
                        titlebuttonSprite.drawAt(var8 - 73, var37 - 20);
                        var0.drawCentered("Support Page", var8, var37 + 5, 16777215, 0);
                        var8 = Login.loginBoxX + 180;
                        var37 = 326;
                        titlebuttonSprite.drawAt(var8 - 73, var37 - 20);
                        var0.drawCentered("Back", var8, var37 + 5, 16777215, 0);
                     }
                  } else {
                     var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                     var32 = 221;
                     var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                     var10 = var32 + 15;
                     var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var10, 16776960, 0);
                     var10 += 15;
                     var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var10, 16776960, 0);
                     var10 += 15;
                     var10 += 14;
                     var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var10, 16777215, 0);
                     var34 = 174;
                     if (ReflectionCheck.clientPreferences.hideUsername) {
                        var29 = Login.Login_username;
                        var28 = class168.method3450('*', var29.length());
                        var30 = var28;
                     } else {
                        var30 = Login.Login_username;
                     }

                     for (var30 = var30; var0.stringWidth(var30) > var34; var30 = var30.substring(1)) {
                     }

                     var0.draw(AbstractFont.escapeBrackets(var30) + (Client.cycle % 40 < 20 ? BufferedFile.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var10, 16777215, 0);
                     var10 += 15;
                     var8 = Login.loginBoxX + 180 - 80;
                     var37 = 321;
                     titlebuttonSprite.drawAt(var8 - 73, var37 - 20);
                     var0.drawCentered("Recover", var8, var37 + 5, 16777215, 0);
                     var8 = Login.loginBoxX + 180 + 80;
                     titlebuttonSprite.drawAt(var8 - 73, var37 - 20);
                     var0.drawCentered("Back", var8, var37 + 5, 16777215, 0);
                     var37 = 356;
                     var1.drawCentered("Still having trouble logging in?", Varps.loginBoxCenter, var37, 268435455, 0);
                  }
               }
            }
         }

         if (Client.gameState >= 10) {
            int[] var38 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var38);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Huffman.canvasHeight);
            class16.loginScreenRunesAnimation.method1782(Login.xPadding - 22, Client.cycle);
            class16.loginScreenRunesAnimation.method1782(Login.xPadding + 22 + 765 - 128, Client.cycle);
            Rasterizer2D.Rasterizer2D_setClipArray(var38);
         }

         KeyHandler.title_muteSprite[ReflectionCheck.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
         if (Client.gameState > 5 && Client.language == 0) {
            if (class277.field1144 != null) {
               var10 = Login.xPadding + 5;
               var34 = 463;
               byte var39 = 100;
               byte var42 = 35;
               class277.field1144.drawAt(var10, var34);
               var0.drawCentered("World " + Client.worldId, var39 / 2 + var10, var42 / 2 + var34 - 2, 16777215, 0);
               if (FriendLoginUpdate.field356 != null) {
                  var1.drawCentered("Loading...", var39 / 2 + var10, var42 / 2 + var34 + 12, 16777215, 0);
               } else {
                  var1.drawCentered("Click to switch", var39 / 2 + var10, var42 / 2 + var34 + 12, 16777215, 0);
               }
            } else {
               class277.field1144 = MenuAction.loadIndexedSpriteByName(WorldMapSection3.indexCache8, "sl_button", "");
            }
         }
      }

   }
}
