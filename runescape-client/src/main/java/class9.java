import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class9 {
   @ObfuscatedName("sc")
   @ObfuscatedGetter(
      longValue = 3250818225276468935L
   )
   static long field57;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lcb;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("n")
   ExecutorService field56 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("v")
   Future field53;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lkx;"
   )
   final Buffer field58;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "La;"
   )
   final class12 field55;

   @ObfuscatedSignature(
      descriptor = "(Lkx;La;)V"
   )
   public class9(Buffer var1, class12 var2) {
      this.field58 = var1;
      this.field55 = var2;
      this.method92();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-807097054"
   )
   public boolean method108() {
      return this.field53.isDone();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1213783874"
   )
   public void method93() {
      this.field56.shutdown();
      this.field56 = null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Lkx;",
      garbageValue = "808914251"
   )
   public Buffer method94() {
      try {
         return (Buffer)this.field53.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2058592191"
   )
   void method92() {
      this.field53 = this.field56.submit(new class8(this, this.field58, this.field55));
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lbt;I)V",
      garbageValue = "-1405869501"
   )
   @Export("doCycleTitle")
   static void doCycleTitle(GameEngine var0) {
      if (Login.worldSelectOpen) {
         WorldMapID.method646(var0);
      } else {
         int var3;
         if ((MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
            WorldMapSectionType.clientPreferences.titleMusicDisabled = !WorldMapSectionType.clientPreferences.titleMusicDisabled;
            class23.savePreferences();
            if (!WorldMapSectionType.clientPreferences.titleMusicDisabled) {
               Archive var1 = UrlRequester.archive6;
               int var2 = var1.getGroupId("scape main");
               var3 = var1.getFileId(var2, "");
               ReflectionCheck.method2450(var1, var2, var3, 255, false);
            } else {
               ScriptEvent.method1272();
            }
         }

         if (Client.gameState != 5) {
            if (-1L == Login.field1213) {
               Login.field1213 = Tiles.currentTimeMillis() + 1000L;
            }

            long var20 = Tiles.currentTimeMillis();
            if (VarpDefinition.method4552() && -1L == Login.field1226) {
               Login.field1226 = var20;
               if (Login.field1226 > Login.field1213) {
                  Login.field1213 = Login.field1226;
               }
            }

            if (Client.gameState == 10 || Client.gameState == 11) {
               if (Language.Language_EN == NPCComposition.clientLanguage) {
                  if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
                     var3 = Login.xPadding + 5;
                     short var4 = 463;
                     byte var5 = 100;
                     byte var6 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + var5 && MouseHandler.MouseHandler_lastPressedY >= var4 && MouseHandler.MouseHandler_lastPressedY <= var6 + var4) {
                        Decimator.method2704();
                        return;
                     }
                  }

                  if (UserComparator9.World_request != null) {
                     Decimator.method2704();
                  }
               }

               var3 = MouseHandler.MouseHandler_lastButton;
               int var30 = MouseHandler.MouseHandler_lastPressedX;
               int var31 = MouseHandler.MouseHandler_lastPressedY;
               if (var3 == 0) {
                  var30 = MouseHandler.MouseHandler_x;
                  var31 = MouseHandler.MouseHandler_y;
               }

               if (!class8.mouseCam && var3 == 4) {
                  var3 = 1;
               }

               short var34;
               int var35;
               if (Login.loginIndex == 0) {
                  boolean var39 = false;

                  while(Varcs.isKeyDown()) {
                     if (ModeWhere.field2417 == 84) {
                        var39 = true;
                     }
                  }

                  var35 = GraphicsObject.loginBoxCenter - 80;
                  var34 = 291;
                  if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) {
                     WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var35 = GraphicsObject.loginBoxCenter + 80;
                  if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20 || var39) {
                     if ((Client.worldProperties & 33554432) != 0) {
                        Login.Login_response0 = "";
                        Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        Login.Login_response2 = "Your normal account will not be affected.";
                        Login.Login_response3 = "";
                        Login.loginIndex = 1;
                        class8.method88();
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
                        class8.method88();
                     } else if ((Client.worldProperties & 1024) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        Login.Login_response2 = "The Protect Item prayer will";
                        Login.Login_response3 = "not work on this world.";
                        Login.Login_response0 = "Warning!";
                        Login.loginIndex = 1;
                        class8.method88();
                     } else {
                        GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                     }
                  }
               } else {
                  short var7;
                  int var32;
                  if (Login.loginIndex == 1) {
                     while(true) {
                        if (!Varcs.isKeyDown()) {
                           var32 = GraphicsObject.loginBoxCenter - 80;
                           var7 = 321;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                           }

                           var32 = GraphicsObject.loginBoxCenter + 80;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              Login.loginIndex = 0;
                           }
                           break;
                        }

                        if (ModeWhere.field2417 == 84) {
                           GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                        } else if (ModeWhere.field2417 == 13) {
                           Login.loginIndex = 0;
                        }
                     }
                  } else {
                     short var33;
                     boolean var36;
                     if (Login.loginIndex == 2) {
                        var33 = 201;
                        var32 = var33 + 52;
                        if (var3 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) {
                           Login.currentLoginField = 0;
                        }

                        var32 += 15;
                        if (var3 == 1 && var31 >= var32 - 12 && var31 < var32 + 2) {
                           Login.currentLoginField = 1;
                        }

                        var32 += 15;
                        var33 = 361;
                        if (AttackOption.field1190 != null) {
                           var35 = AttackOption.field1190.highX / 2;
                           if (var3 == 1 && var30 >= AttackOption.field1190.lowX - var35 && var30 <= var35 + AttackOption.field1190.lowX && var31 >= var33 - 15 && var31 < var33) {
                              switch(Login.field1207) {
                              case 1:
                                 InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 Login.loginIndex = 5;
                                 return;
                              case 2:
                                 WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var35 = GraphicsObject.loginBoxCenter - 80;
                        var34 = 321;
                        if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) {
                           Login.Login_username = Login.Login_username.trim();
                           if (Login.Login_username.length() == 0) {
                              InvDefinition.setLoginResponseString("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (Login.Login_password.length() == 0) {
                              InvDefinition.setLoginResponseString("", "Please enter your password.", "");
                              return;
                           }

                           InvDefinition.setLoginResponseString("", "Connecting to server...", "");
                           class23.method234(false);
                           ItemContainer.updateGameState(20);
                           return;
                        }

                        var35 = Login.loginBoxX + 180 + 80;
                        if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) {
                           Login.loginIndex = 0;
                           Login.Login_username = "";
                           Login.Login_password = "";
                           Canvas.field439 = 0;
                           class1.otp = "";
                           Login.field1217 = true;
                        }

                        var35 = GraphicsObject.loginBoxCenter + -117;
                        var34 = 277;
                        Login.field1222 = var30 >= var35 && var30 < var35 + WorldMapDecoration.field235 && var31 >= var34 && var31 < var34 + MouseHandler.field512;
                        if (var3 == 1 && Login.field1222) {
                           Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                           if (!Client.Login_isUsernameRemembered && WorldMapSectionType.clientPreferences.rememberedUsername != null) {
                              WorldMapSectionType.clientPreferences.rememberedUsername = null;
                              class23.savePreferences();
                           }
                        }

                        var35 = GraphicsObject.loginBoxCenter + 24;
                        var34 = 277;
                        Login.field1216 = var30 >= var35 && var30 < var35 + WorldMapDecoration.field235 && var31 >= var34 && var31 < var34 + MouseHandler.field512;
                        if (var3 == 1 && Login.field1216) {
                           WorldMapSectionType.clientPreferences.hideUsername = !WorldMapSectionType.clientPreferences.hideUsername;
                           if (!WorldMapSectionType.clientPreferences.hideUsername) {
                              Login.Login_username = "";
                              WorldMapSectionType.clientPreferences.rememberedUsername = null;
                              class8.method88();
                           }

                           class23.savePreferences();
                        }

                        label1002:
                        while(true) {
                           Transferable var23;
                           int var38;
                           do {
                              while(true) {
                                 char var37;
                                 label918:
                                 do {
                                    while(true) {
                                       while(Varcs.isKeyDown()) {
                                          if (ModeWhere.field2417 != 13) {
                                             if (Login.currentLoginField != 0) {
                                                continue label918;
                                             }

                                             WorldMapSection1.method657(WorldMapID.field299);
                                             if (ModeWhere.field2417 == 85 && Login.Login_username.length() > 0) {
                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                             }

                                             if (ModeWhere.field2417 == 84 || ModeWhere.field2417 == 80) {
                                                Login.currentLoginField = 1;
                                             }

                                             var37 = WorldMapID.field299;
                                             var36 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var37) != -1;
                                             if (var36 && Login.Login_username.length() < 320) {
                                                Login.Login_username = Login.Login_username + WorldMapID.field299;
                                             }
                                          } else {
                                             Login.loginIndex = 0;
                                             Login.Login_username = "";
                                             Login.Login_password = "";
                                             Canvas.field439 = 0;
                                             class1.otp = "";
                                             Login.field1217 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(Login.currentLoginField != 1);

                                 if (ModeWhere.field2417 == 85 && Login.Login_password.length() > 0) {
                                    Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                 } else if (ModeWhere.field2417 == 84 || ModeWhere.field2417 == 80) {
                                    Login.currentLoginField = 0;
                                    if (ModeWhere.field2417 == 84) {
                                       Login.Login_username = Login.Login_username.trim();
                                       if (Login.Login_username.length() == 0) {
                                          InvDefinition.setLoginResponseString("", "Please enter your username/email address.", "");
                                          return;
                                       }

                                       if (Login.Login_password.length() == 0) {
                                          InvDefinition.setLoginResponseString("", "Please enter your password.", "");
                                          return;
                                       }

                                       InvDefinition.setLoginResponseString("", "Connecting to server...", "");
                                       class23.method234(false);
                                       ItemContainer.updateGameState(20);
                                       return;
                                    }
                                 }

                                 if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && ModeWhere.field2417 == 67) {
                                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var23 = var22.getContents(class1.client);
                                    var38 = 20 - Login.Login_password.length();
                                    break;
                                 }

                                 var37 = WorldMapID.field299;
                                 if ((var37 < ' ' || var37 >= 127) && (var37 <= 127 || var37 >= 160) && (var37 <= 160 || var37 > 255)) {
                                    label1113: {
                                       if (var37 != 0) {
                                          char[] var25 = class298.cp1252AsciiExtension;

                                          for(int var26 = 0; var26 < var25.length; ++var26) {
                                             char var13 = var25[var26];
                                             if (var37 == var13) {
                                                var36 = true;
                                                break label1113;
                                             }
                                          }
                                       }

                                       var36 = false;
                                    }
                                 } else {
                                    var36 = true;
                                 }

                                 if (var36) {
                                    char var42 = WorldMapID.field299;
                                    boolean var11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var42) != -1;
                                    if (var11 && Login.Login_password.length() < 20) {
                                       Login.Login_password = Login.Login_password + WorldMapID.field299;
                                    }
                                 }
                              }
                           } while(var38 <= 0);

                           try {
                              String var12 = (String)var23.getTransferData(DataFlavor.stringFlavor);
                              int var40 = Math.min(var38, var12.length());
                              int var14 = 0;

                              while(true) {
                                 if (var14 >= var40) {
                                    Login.Login_password = Login.Login_password + var12.substring(0, var40);
                                    continue label1002;
                                 }

                                 char var16 = var12.charAt(var14);
                                 boolean var15;
                                 if (var16 >= ' ' && var16 < 127 || var16 > 127 && var16 < 160 || var16 > 160 && var16 <= 255) {
                                    var15 = true;
                                 } else {
                                    label1126: {
                                       if (var16 != 0) {
                                          char[] var17 = class298.cp1252AsciiExtension;

                                          for(int var18 = 0; var18 < var17.length; ++var18) {
                                             char var19 = var17[var18];
                                             if (var19 == var16) {
                                                var15 = true;
                                                break label1126;
                                             }
                                          }
                                       }

                                       var15 = false;
                                    }
                                 }

                                 if (!var15) {
                                    break;
                                 }

                                 char var41 = var12.charAt(var14);
                                 boolean var24 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1;
                                 if (!var24) {
                                    break;
                                 }

                                 ++var14;
                              }

                              Login.loginIndex = 3;
                              return;
                           } catch (UnsupportedFlavorException var28) {
                              ;
                           } catch (IOException var29) {
                              ;
                           }
                        }
                     } else if (Login.loginIndex == 3) {
                        var32 = Login.loginBoxX + 180;
                        var7 = 276;
                        if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                           GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                        }

                        var32 = Login.loginBoxX + 180;
                        var7 = 326;
                        if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                           InvDefinition.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           Login.loginIndex = 5;
                           return;
                        }
                     } else {
                        int var9;
                        if (Login.loginIndex == 4) {
                           var32 = Login.loginBoxX + 180 - 80;
                           var7 = 321;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              class1.otp.trim();
                              if (class1.otp.length() != 6) {
                                 InvDefinition.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              Canvas.field439 = Integer.parseInt(class1.otp);
                              class1.otp = "";
                              class23.method234(true);
                              InvDefinition.setLoginResponseString("", "Connecting to server...", "");
                              ItemContainer.updateGameState(20);
                              return;
                           }

                           if (var3 == 1 && var30 >= Login.loginBoxX + 180 - 9 && var30 <= Login.loginBoxX + 180 + 130 && var31 >= 263 && var31 <= 296) {
                              Login.field1217 = !Login.field1217;
                           }

                           if (var3 == 1 && var30 >= Login.loginBoxX + 180 - 34 && var30 <= Login.loginBoxX + 34 + 180 && var31 >= 351 && var31 <= 363) {
                              WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var32 = Login.loginBoxX + 180 + 80;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              Login.loginIndex = 0;
                              Login.Login_username = "";
                              Login.Login_password = "";
                              Canvas.field439 = 0;
                              class1.otp = "";
                           }

                           while(Varcs.isKeyDown()) {
                              boolean var8 = false;

                              for(var9 = 0; var9 < "1234567890".length(); ++var9) {
                                 if (WorldMapID.field299 == "1234567890".charAt(var9)) {
                                    var8 = true;
                                    break;
                                 }
                              }

                              if (ModeWhere.field2417 == 13) {
                                 Login.loginIndex = 0;
                                 Login.Login_username = "";
                                 Login.Login_password = "";
                                 Canvas.field439 = 0;
                                 class1.otp = "";
                              } else {
                                 if (ModeWhere.field2417 == 85 && class1.otp.length() > 0) {
                                    class1.otp = class1.otp.substring(0, class1.otp.length() - 1);
                                 }

                                 if (ModeWhere.field2417 == 84) {
                                    class1.otp.trim();
                                    if (class1.otp.length() != 6) {
                                       InvDefinition.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    Canvas.field439 = Integer.parseInt(class1.otp);
                                    class1.otp = "";
                                    class23.method234(true);
                                    InvDefinition.setLoginResponseString("", "Connecting to server...", "");
                                    ItemContainer.updateGameState(20);
                                    return;
                                 }

                                 if (var8 && class1.otp.length() < 6) {
                                    class1.otp = class1.otp + WorldMapID.field299;
                                 }
                              }
                           }
                        } else if (Login.loginIndex == 5) {
                           var32 = Login.loginBoxX + 180 - 80;
                           var7 = 321;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              WorldMapManager.method738();
                              return;
                           }

                           var32 = Login.loginBoxX + 180 + 80;
                           if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                              GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                           }

                           var34 = 361;
                           if (KeyHandler.field409 != null) {
                              var9 = KeyHandler.field409.highX / 2;
                              if (var3 == 1 && var30 >= KeyHandler.field409.lowX - var9 && var30 <= var9 + KeyHandler.field409.lowX && var31 >= var34 - 15 && var31 < var34) {
                                 WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                              }
                           }

                           while(Varcs.isKeyDown()) {
                              var36 = false;

                              for(int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var10) {
                                 if (WorldMapID.field299 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var10)) {
                                    var36 = true;
                                    break;
                                 }
                              }

                              if (ModeWhere.field2417 == 13) {
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                              } else {
                                 if (ModeWhere.field2417 == 85 && Login.Login_username.length() > 0) {
                                    Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                 }

                                 if (ModeWhere.field2417 == 84) {
                                    WorldMapManager.method738();
                                    return;
                                 }

                                 if (var36 && Login.Login_username.length() < 320) {
                                    Login.Login_username = Login.Login_username + WorldMapID.field299;
                                 }
                              }
                           }
                        } else if (Login.loginIndex != 6) {
                           if (Login.loginIndex == 7) {
                              var32 = Login.loginBoxX + 180 - 80;
                              var7 = 321;
                              if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                                 WorldMapRectangle.openURL(GrandExchangeOfferNameComparator.method209("secure", true) + "m=dob/set_dob.ws", true, false);
                                 InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 Login.loginIndex = 6;
                                 return;
                              }

                              var32 = Login.loginBoxX + 180 + 80;
                              if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                              }
                           } else if (Login.loginIndex == 8) {
                              var32 = Login.loginBoxX + 180 - 80;
                              var7 = 321;
                              if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                                 WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false);
                                 InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 Login.loginIndex = 6;
                                 return;
                              }

                              var32 = Login.loginBoxX + 180 + 80;
                              if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                              }
                           } else if (Login.loginIndex == 12) {
                              String var27 = "";
                              switch(Login.field1206) {
                              case 0:
                                 var27 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                 break;
                              case 1:
                                 var27 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                 break;
                              default:
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                              }

                              var35 = Login.loginBoxX + 180;
                              var34 = 276;
                              if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) {
                                 WorldMapRectangle.openURL(var27, true, false);
                                 InvDefinition.setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                 Login.loginIndex = 6;
                                 return;
                              }

                              var35 = Login.loginBoxX + 180;
                              var34 = 326;
                              if (var3 == 1 && var30 >= var35 - 75 && var30 <= var35 + 75 && var31 >= var34 - 20 && var31 <= var34 + 20) {
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                              }
                           } else if (Login.loginIndex == 24) {
                              var32 = Login.loginBoxX + 180;
                              var7 = 301;
                              if (var3 == 1 && var30 >= var32 - 75 && var30 <= var32 + 75 && var31 >= var7 - 20 && var31 <= var7 + 20) {
                                 GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false);
                              }
                           }
                        } else {
                           while(true) {
                              do {
                                 if (!Varcs.isKeyDown()) {
                                    var33 = 321;
                                    if (var3 == 1 && var31 >= var33 - 20 && var31 <= var33 + 20) {
                                       GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                                    }

                                    return;
                                 }
                              } while(ModeWhere.field2417 != 84 && ModeWhere.field2417 != 13);

                              GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(true);
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-1465568490"
   )
   static int method98(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETTEXT) {
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETFILLMODE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lhz;I)Ljava/lang/String;",
      garbageValue = "16711935"
   )
   static String method95(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               var0 = var0.substring(0, var3) + GrandExchangeOffer.method187(HealthBar.method2168(var1, var2 - 1)) + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
