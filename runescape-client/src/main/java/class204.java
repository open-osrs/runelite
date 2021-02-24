import java.applet.Applet;
import java.net.URL;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("gc")
public class class204 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lhr;"
   )
   @Export("musicTrack")
   public static MusicTrack musicTrack;

   static {
      new HashMap();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Lil;",
      garbageValue = "236947839"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
      garbageValue = "10"
   )
   static boolean method3888(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class60.field454.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var11.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var10 = class56.method923(class60.applet, var2, new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()});
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Applet var3 = class60.applet;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
            ;
         }

         try {
            class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(Lhz;Ljj;IIZI)V",
      garbageValue = "-151071260"
   )
   @Export("addWidgetItemMenuItem")
   static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         WorldMapEvent.insertMenuItem(var7, FileSystem.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
      }

   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(Lhz;IIII)V",
      garbageValue = "-1768391401"
   )
   @Export("drawMinimap")
   static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
      UserComparator5.playPcmPlayers();
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
         if (Client.minimapState != 2 && Client.minimapState != 5) {
            int var5 = Client.camAngleY & 2047;
            int var6 = UserComparator9.localPlayer.x / 32 + 48;
            int var7 = 464 - UserComparator9.localPlayer.y / 32;
            GrandExchangeOfferAgeComparator.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

            int var8;
            int var10;
            int var17;
            for(var8 = 0; var8 < Client.mapIconCount; ++var8) {
               var17 = Client.mapIconXs[var8] * 4 + 2 - UserComparator9.localPlayer.x / 32;
               var10 = Client.mapIconYs[var8] * 4 + 2 - UserComparator9.localPlayer.y / 32;
               AbstractArchive.drawSpriteOnMinimap(var1, var2, var17, var10, Client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var17 = 0; var17 < 104; ++var17) {
                  NodeDeque var15 = Client.groundItems[class90.Client_plane][var8][var17];
                  if (var15 != null) {
                     var11 = var8 * 4 + 2 - UserComparator9.localPlayer.x / 32;
                     var12 = var17 * 4 + 2 - UserComparator9.localPlayer.y / 32;
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var11, var12, ChatChannel.mapDotSprites[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < Client.npcCount; ++var8) {
               NPC var9 = Client.npcs[Client.npcIndices[var8]];
               if (var9 != null && var9.isVisible()) {
                  NPCComposition var19 = var9.definition;
                  if (var19 != null && var19.transforms != null) {
                     var19 = var19.transform();
                  }

                  if (var19 != null && var19.drawMapDot && var19.isInteractable) {
                     var11 = var9.x / 32 - UserComparator9.localPlayer.x / 32;
                     var12 = var9.y / 32 - UserComparator9.localPlayer.y / 32;
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var11, var12, ChatChannel.mapDotSprites[1], var4);
                  }
               }
            }

            var8 = Players.Players_count;
            int[] var18 = Players.Players_indices;

            for(var10 = 0; var10 < var8; ++var10) {
               Player var16 = Client.players[var18[var10]];
               if (var16 != null && var16.isVisible() && !var16.isHidden && var16 != UserComparator9.localPlayer) {
                  var12 = var16.x / 32 - UserComparator9.localPlayer.x / 32;
                  int var13 = var16.y / 32 - UserComparator9.localPlayer.y / 32;
                  boolean var14 = false;
                  if (UserComparator9.localPlayer.team != 0 && var16.team != 0 && var16.team == UserComparator9.localPlayer.team) {
                     var14 = true;
                  }

                  if (var16.isFriend()) {
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[3], var4);
                  } else if (var14) {
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[4], var4);
                  } else if (var16.isClanMember()) {
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[5], var4);
                  } else {
                     AbstractArchive.drawSpriteOnMinimap(var1, var2, var12, var13, ChatChannel.mapDotSprites[2], var4);
                  }
               }
            }

            if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
               if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
                  NPC var20 = Client.npcs[Client.hintArrowNpcIndex];
                  if (var20 != null) {
                     var11 = var20.x / 32 - UserComparator9.localPlayer.x / 32;
                     var12 = var20.y / 32 - UserComparator9.localPlayer.y / 32;
                     WorldMapDecoration.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4);
                  }
               }

               if (Client.hintArrowType == 2) {
                  var10 = Client.hintArrowX * 4 - GrandExchangeOfferNameComparator.baseX * 256 + 2 - UserComparator9.localPlayer.x / 32;
                  var11 = Client.hintArrowY * 4 - NetCache.baseY * 256 + 2 - UserComparator9.localPlayer.y / 32;
                  WorldMapDecoration.worldToMinimap(var1, var2, var10, var11, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4);
               }

               if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
                  Player var21 = Client.players[Client.hintArrowPlayerIndex];
                  if (var21 != null) {
                     var11 = var21.x / 32 - UserComparator9.localPlayer.x / 32;
                     var12 = var21.y / 32 - UserComparator9.localPlayer.y / 32;
                     WorldMapDecoration.worldToMinimap(var1, var2, var11, var12, GrandExchangeOfferWorldComparator.mapMarkerSprites[1], var4);
                  }
               }
            }

            if (Client.destinationX != 0) {
               var10 = Client.destinationX * 4 + 2 - UserComparator9.localPlayer.x / 32;
               var11 = Client.destinationY * 4 + 2 - UserComparator9.localPlayer.y / 32;
               AbstractArchive.drawSpriteOnMinimap(var1, var2, var10, var11, GrandExchangeOfferWorldComparator.mapMarkerSprites[0], var4);
            }

            if (!UserComparator9.localPlayer.isHidden) {
               Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

         Client.field827[var3] = true;
      }
   }
}
