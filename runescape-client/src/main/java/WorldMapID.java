import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("WorldMapID")
public class WorldMapID {
   @ObfuscatedName("pv")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("clanChat")
   static ClanChat clanChat;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Laz;"
   )
   static final WorldMapID field301 = new WorldMapID(0);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Laz;"
   )
   static final WorldMapID field290 = new WorldMapID(1);
   @ObfuscatedName("w")
   static int[] field292;
   @ObfuscatedName("ab")
   @Export("garbageCollector")
   static GarbageCollectorMXBean garbageCollector;
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("worldSelectBackSprites")
   static SpritePixels[] worldSelectBackSprites;
   @ObfuscatedName("ca")
   public static char field299;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -842814977
   )
   @Export("value")
   final int value;

   WorldMapID(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "893410164"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-283946785"
   )
   static String method645() {
      return WorldMapSectionType.clientPreferences.hideUsername ? HitSplatDefinition.method4768(Login.Login_username) : Login.Login_username;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1525294724"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;S)[Llm;",
      garbageValue = "26517"
   )
   public static SpritePixels[] method648(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      return WorldMapLabelSize.method268(var0, var3, var4);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lbt;I)V",
      garbageValue = "1647051153"
   )
   static void method646(GameEngine var0) {
      while(Varcs.isKeyDown()) {
         if (ModeWhere.field2417 == 13) {
            UserComparator10.method3573();
            return;
         }

         if (ModeWhere.field2417 == 96) {
            if (Login.worldSelectPage > 0 && class7.worldSelectLeftSprite != null) {
               --Login.worldSelectPage;
            }
         } else if (ModeWhere.field2417 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class2.worldSelectRightSprite != null) {
            ++Login.worldSelectPage;
         }
      }

      if (MouseHandler.MouseHandler_lastButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
         int var1 = Login.xPadding + 280;
         if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(0, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(0, 1);
            return;
         }

         int var2 = Login.xPadding + 390;
         if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(1, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(1, 1);
            return;
         }

         int var3 = Login.xPadding + 500;
         if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(2, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(2, 1);
            return;
         }

         int var4 = Login.xPadding + 610;
         if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(3, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class1.changeWorldSelectSorting(3, 1);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
            UserComparator10.method3573();
            return;
         }

         if (Login.hoveredWorldIndex != -1) {
            World var5 = World.World_worlds[Login.hoveredWorldIndex];
            ChatChannel.changeWorld(var5);
            UserComparator10.method3573();
            return;
         }

         if (Login.worldSelectPage > 0 && class7.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class7.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class25.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class25.canvasHeight / 2 + 50) {
            --Login.worldSelectPage;
         }

         if (Login.worldSelectPage < Login.worldSelectPagesCount && class2.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GrandExchangeOfferTotalQuantityComparator.canvasWidth - class2.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GrandExchangeOfferTotalQuantityComparator.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class25.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class25.canvasHeight / 2 + 50) {
            ++Login.worldSelectPage;
         }
      }

   }
}
