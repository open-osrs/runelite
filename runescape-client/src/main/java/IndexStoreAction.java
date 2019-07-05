import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("IndexStoreAction")
public class IndexStoreAction extends Node {
   @ObfuscatedName("rt")
   @ObfuscatedGetter(
      intValue = -1086790653
   )
   static int field410;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Ldy;"
   )
   @Export("idxFiles")
   public static BufferedFile[] idxFiles;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1753937079
   )
   public static int field411;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1942326733
   )
   @Export("type")
   int type;
   @ObfuscatedName("f")
   @Export("data")
   byte[] data;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   @Export("indexStore")
   IndexStore indexStore;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lit;"
   )
   @Export("indexCache")
   IndexCache indexCache;

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(Lbz;I)V",
      garbageValue = "483387730"
   )
   static final void method4553(Actor var0) {
      if (var0.field23 != 0) {
         if (var0.targetIndex != -1) {
            Object var1 = null;
            if (var0.targetIndex < 32768) {
               var1 = Client.npcs[var0.targetIndex];
            } else if (var0.targetIndex >= 32768) {
               var1 = Client.players[var0.targetIndex - 32768];
            }

            if (var1 != null) {
               int var2 = var0.x - ((Actor)var1).x;
               int var3 = var0.y - ((Actor)var1).y;
               if (var2 != 0 || var3 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if (var0.false0) {
               var0.targetIndex = -1;
               var0.false0 = false;
            }
         }

         if (var0.field12 != -1 && (var0.pathLength == 0 || var0.field24 > 0)) {
            var0.orientation = var0.field12;
            var0.field12 = -1;
         }

         int var4 = var0.orientation - var0.field9 & 2047;
         if (var4 == 0 && var0.false0) {
            var0.targetIndex = -1;
            var0.false0 = false;
         }

         if (var4 != 0) {
            ++var0.field22;
            boolean var5;
            if (var4 > 1024) {
               var0.field9 -= var0.field23;
               var5 = true;
               if (var4 < var0.field23 || var4 > 2048 - var0.field23) {
                  var0.field9 = var0.orientation;
                  var5 = false;
               }

               if (var0.movementSequence == var0.idleSequence && (var0.field22 > 25 || var5)) {
                  if (var0.turnLeftSequence != -1) {
                     var0.movementSequence = var0.turnLeftSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            } else {
               var0.field9 += var0.field23;
               var5 = true;
               if (var4 < var0.field23 || var4 > 2048 - var0.field23) {
                  var0.field9 = var0.orientation;
                  var5 = false;
               }

               if (var0.movementSequence == var0.idleSequence && (var0.field22 > 25 || var5)) {
                  if (var0.turnRightSequence != -1) {
                     var0.movementSequence = var0.turnRightSequence;
                  } else {
                     var0.movementSequence = var0.walkSequence;
                  }
               }
            }

            var0.field9 &= 2047;
         } else {
            var0.field22 = 0;
         }
      }

   }
}
