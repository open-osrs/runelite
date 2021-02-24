import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("GameBuild")
public class GameBuild {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Liu;"
   )
   @Export("LIVE")
   static final GameBuild LIVE = new GameBuild("LIVE", 0);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Liu;"
   )
   @Export("BUILDLIVE")
   static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Liu;"
   )
   @Export("RC")
   static final GameBuild RC = new GameBuild("RC", 1);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Liu;"
   )
   @Export("WIP")
   static final GameBuild WIP = new GameBuild("WIP", 2);
   @ObfuscatedName("y")
   @Export("name")
   public final String name;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 627083657
   )
   @Export("buildId")
   public final int buildId;

   GameBuild(String var1, int var2) {
      this.name = var1;
      this.buildId = var2;
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1767980909"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field938 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (BoundaryObject.getWindowedMode() == 1) {
         class1.client.setMaxCanvasSize(765, 503);
      } else {
         class1.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(BoundaryObject.getWindowedMode());
         var1.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
         var1.packetBuffer.writeShort(class25.canvasHeight);
         Client.packetWriter.addNode(var1);
      }

   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "44"
   )
   static boolean method4350() {
      return (Client.drawPlayerNames & 4) != 0;
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(Ljy;IIII)V",
      garbageValue = "2014518085"
   )
   @Export("addNpcToMenu")
   static final void addNpcToMenu(NPCComposition var0, int var1, int var2, int var3) {
      if (Client.menuOptionsCount < 400) {
         if (var0.transforms != null) {
            var0 = var0.transform();
         }

         if (var0 != null) {
            if (var0.isInteractable) {
               if (!var0.isFollower || Client.followerIndex == var1) {
                  String var4 = var0.name;
                  int var7;
                  int var8;
                  if (var0.combatLevel != 0) {
                     var7 = var0.combatLevel;
                     var8 = UserComparator9.localPlayer.combatLevel;
                     int var9 = var8 - var7;
                     String var6;
                     if (var9 < -9) {
                        var6 = FileSystem.colorStartTag(16711680);
                     } else if (var9 < -6) {
                        var6 = FileSystem.colorStartTag(16723968);
                     } else if (var9 < -3) {
                        var6 = FileSystem.colorStartTag(16740352);
                     } else if (var9 < 0) {
                        var6 = FileSystem.colorStartTag(16756736);
                     } else if (var9 > 9) {
                        var6 = FileSystem.colorStartTag(65280);
                     } else if (var9 > 6) {
                        var6 = FileSystem.colorStartTag(4259584);
                     } else if (var9 > 3) {
                        var6 = FileSystem.colorStartTag(8453888);
                     } else if (var9 > 0) {
                        var6 = FileSystem.colorStartTag(12648192);
                     } else {
                        var6 = FileSystem.colorStartTag(16776960);
                     }

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.combatLevel + ")";
                  }

                  if (var0.isFollower && Client.followerOpsLowPriority) {
                     WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if (Client.isItemSelected == 1) {
                     WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16776960) + var4, 7, var1, var2, var3);
                  } else if (Client.isSpellSelected) {
                     if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 2) == 2) {
                        WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
                     String[] var11 = var0.actions;
                     if (var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if (var7 == 0) {
                                 var8 = var10 + 9;
                              }

                              if (var7 == 1) {
                                 var8 = var10 + 10;
                              }

                              if (var7 == 2) {
                                 var8 = var10 + 11;
                              }

                              if (var7 == 3) {
                                 var8 = var10 + 12;
                              }

                              if (var7 == 4) {
                                 var8 = var10 + 13;
                              }

                              WorldMapManager.insertMenuItemNoShift(var11[var7], FileSystem.colorStartTag(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if (var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
                                 if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var0.combatLevel > UserComparator9.localPlayer.combatLevel) {
                                    var12 = 2000;
                                 }

                                 var8 = 0;
                                 if (var7 == 0) {
                                    var8 = var12 + 9;
                                 }

                                 if (var7 == 1) {
                                    var8 = var12 + 10;
                                 }

                                 if (var7 == 2) {
                                    var8 = var12 + 11;
                                 }

                                 if (var7 == 3) {
                                    var8 = var12 + 12;
                                 }

                                 if (var7 == 4) {
                                    var8 = var12 + 13;
                                 }

                                 WorldMapManager.insertMenuItemNoShift(var11[var7], FileSystem.colorStartTag(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var0.isFollower || !Client.followerOpsLowPriority) {
                        WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
