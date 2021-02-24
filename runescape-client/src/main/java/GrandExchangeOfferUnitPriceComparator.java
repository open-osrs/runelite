import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
   @ObfuscatedName("rq")
   @ObfuscatedGetter(
      intValue = 2014068736
   )
   static int field102;
   @ObfuscatedName("sh")
   @ObfuscatedSignature(
      descriptor = "Lmn;"
   )
   @Export("platformInfo")
   static PlatformInfo platformInfo;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = -927718985
   )
   static int field103;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lx;Lx;B)I",
      garbageValue = "57"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(Lbk;IIII)V",
      garbageValue = "1420045659"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (UserComparator9.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            int var7;
            if (var0.skillLevel == 0) {
               String var5 = var0.actions[0] + var0.username + var0.actions[1];
               var7 = var0.combatLevel;
               int var8 = UserComparator9.localPlayer.combatLevel;
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

               var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var10;
            if (Client.isItemSelected == 1) {
               WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 8) == 8) {
                  WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if (Client.playerMenuActions[var10] != null) {
                     short var11 = 0;
                     if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
                        if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
                           continue;
                        }

                        if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > UserComparator9.localPlayer.combatLevel) {
                           var11 = 2000;
                        }

                        if (UserComparator9.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == UserComparator9.localPlayer.team) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        }
                     } else if (Client.playerOptionsPriorities[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = Client.playerMenuOpcodes[var10] + var11;
                     WorldMapManager.insertMenuItemNoShift(Client.playerMenuActions[var10], FileSystem.colorStartTag(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
               if (Client.menuOpcodes[var10] == 23) {
                  Client.menuTargets[var10] = FileSystem.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
