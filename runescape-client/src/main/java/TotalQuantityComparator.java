import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
@Implements("TotalQuantityComparator")
final class TotalQuantityComparator implements Comparator {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ll;Ll;I)I",
      garbageValue = "-573736433"
   )
   int method335(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
   }

   @Export("compare")
   @ObfuscatedName("compare")
   public int compare(Object var1, Object var2) {
      return this.method335((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("equals")
   public boolean method336(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lgr;IIIIIIB)V",
      garbageValue = "46"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while (true) {
            var7 = var0.readUnsignedByte();
            if (var7 == 0) {
               if (var1 == 0) {
                  int[] var12 = Tiles.Tiles_heights[0][var2];
                  int var9 = var2 + var4 + 932731;
                  int var10 = var3 + var5 + 556238;
                  int var11 = Script.method2204(var9 + 45365, var10 + 91923, 4) - 128 + (Script.method2204(10294 + var9, 37821 + var10, 2) - 128 >> 1) + (Script.method2204(var9, var10, 1) - 128 >> 2);
                  var11 = (int)((double)var11 * 0.3D) + 35;
                  if (var11 < 10) {
                     var11 = 10;
                  } else if (var11 > 60) {
                     var11 = 60;
                  }

                  var12[var3] = -var11 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var7 == 1) {
               int var8 = var0.readUnsignedByte();
               if (var8 == 1) {
                  var8 = 0;
               }

               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if (var7 <= 49) {
               Fonts.field350[var1][var2][var3] = var0.readByte();
               class32.field1157[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class307.field1155[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               Tiles.field908[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while (true) {
            var7 = var0.readUnsignedByte();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var7 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(ILhu;ZI)V",
      garbageValue = "466862614"
   )
   static void method96(int var0, TileLocation var1, boolean var2) {
      WorldMapArea var3 = BufferedFile.worldMap().getMapArea(var0);
      int var4 = Canvas.localPlayer.plane;
      int var5 = (Canvas.localPlayer.x >> 7) + class50.baseX;
      int var6 = (Canvas.localPlayer.y >> 7) + GraphicsObject.baseY;
      TileLocation var7 = new TileLocation(var4, var5, var6);
      BufferedFile.worldMap().method367(var3, var7, var1, var2);
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(Lbr;IIII)V",
      garbageValue = "835715563"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (Canvas.localPlayer != var0 && Client.menuOptionsCount < 400) {
         String var4;
         int var5;
         if (var0.skillLevel == 0) {
            String var6 = var0.actions[0] + var0.username + var0.actions[1];
            var5 = var0.combatLevel;
            int var7 = Canvas.localPlayer.combatLevel;
            int var8 = var7 - var5;
            String var9;
            if (var8 < -9) {
               var9 = BufferedFile.colorStartTag(16711680);
            } else if (var8 < -6) {
               var9 = BufferedFile.colorStartTag(16723968);
            } else if (var8 < -3) {
               var9 = BufferedFile.colorStartTag(16740352);
            } else if (var8 < 0) {
               var9 = BufferedFile.colorStartTag(16756736);
            } else if (var8 > 9) {
               var9 = BufferedFile.colorStartTag(65280);
            } else if (var8 > 6) {
               var9 = BufferedFile.colorStartTag(4259584);
            } else if (var8 > 3) {
               var9 = BufferedFile.colorStartTag(8453888);
            } else if (var8 > 0) {
               var9 = BufferedFile.colorStartTag(12648192);
            } else {
               var9 = BufferedFile.colorStartTag(16776960);
            }

            var4 = var6 + var9 + "  (level-" + var0.combatLevel + ")" + var0.actions[2];
         } else {
            var4 = var0.actions[0] + var0.username + var0.actions[1] + "  (skill-" + var0.skillLevel + ")" + var0.actions[2];
         }

         int var10;
         if (Client.isItemSelected == 1) {
            Tiles.insertMenuItemNoShift("Use", Client.selectedItemName + " -> " + BufferedFile.colorStartTag(16777215) + var4, 14, var1, var2, var3);
         } else if (Client.isSpellSelected) {
            if ((FloorDecoration.selectedSpellFlags & 8) == 8) {
               Tiles.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " -> " + BufferedFile.colorStartTag(16777215) + var4, 15, var1, var2, var3);
            }
         } else {
            for (var10 = 7; var10 >= 0; --var10) {
               if (Client.playerMenuActions[var10] != null) {
                  short var11 = 0;
                  if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
                     if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
                        continue;
                     }

                     if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > Canvas.localPlayer.combatLevel) {
                        var11 = 2000;
                     }

                     if (Canvas.localPlayer.team != 0 && var0.team != 0) {
                        if (var0.team == Canvas.localPlayer.team) {
                           var11 = 2000;
                        } else {
                           var11 = 0;
                        }
                     }
                  } else if (Client.playerOptionsPriorities[var10]) {
                     var11 = 2000;
                  }

                  boolean var12 = false;
                  var5 = Client.playerMenuOpcodes[var10] + var11;
                  Tiles.insertMenuItemNoShift(Client.playerMenuActions[var10], BufferedFile.colorStartTag(16777215) + var4, var5, var1, var2, var3);
               }
            }
         }

         for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
            if (Client.menuOpcodes[var10] == 23) {
               Client.menuTargetNames[var10] = BufferedFile.colorStartTag(16777215) + var4;
               break;
            }
         }
      }

   }
}
