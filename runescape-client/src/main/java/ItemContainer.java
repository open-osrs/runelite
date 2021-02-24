import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ItemContainer")
public class ItemContainer extends Node {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("itemContainers")
   static NodeHashTable itemContainers = new NodeHashTable(32);
   @ObfuscatedName("v")
   @Export("ids")
   int[] ids = new int[]{-1};
   @ObfuscatedName("d")
   @Export("quantities")
   int[] quantities = new int[]{0};

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CLgp;S)C",
      garbageValue = "-10976"
   )
   @Export("standardizeChar")
   static char standardizeChar(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != Language.Language_ES) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != Language.Language_ES) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (var0 == 376) {
         return 'Y';
      } else {
         return var0;
      }
   }

   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "752478045"
   )
   @Export("updateGameState")
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 0) {
            class1.client.method1078();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45) {
            Client.loginState = 0;
            Client.field696 = 0;
            Client.field786 = 0;
            Client.timer.method5211(var0);
            if (var0 != 20) {
               class23.method234(false);
            }
         }

         if (var0 != 20 && var0 != 40 && UserComparator6.field2008 != null) {
            UserComparator6.field2008.close();
            UserComparator6.field2008 = null;
         }

         if (Client.gameState == 25) {
            Client.field720 = 0;
            Client.field785 = 0;
            Client.field717 = 1;
            Client.field718 = 0;
            Client.field719 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, true, Client.gameState == 11 ? 4 : 0);
            } else if (var0 == 11) {
               class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, false, 4);
            } else {
               WorldMapLabel.method499();
            }
         } else {
            class69.method1255(LoginScreenAnimation.archive10, ModeWhere.archive8, true, 0);
         }

         Client.gameState = var0;
      }
   }
}
