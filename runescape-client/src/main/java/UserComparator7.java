import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -528381057
   )
   static int field1999;
   @ObfuscatedName("n")
   @Export("reversed")
   final boolean reversed;

   public UserComparator7(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;B)I",
      garbageValue = "0"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)Z",
      garbageValue = "126"
   )
   static final boolean method3592(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = ViewportMouse.ViewportMouse_y + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ViewportMouse.ViewportMouse_y - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = ViewportMouse.ViewportMouse_x + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = ViewportMouse.ViewportMouse_x - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(Lbk;IIB)V",
      garbageValue = "-26"
   )
   @Export("performPlayerAnimation")
   static void performPlayerAnimation(Player var0, int var1, int var2) {
      if (var0.sequence == var1 && var1 != -1) {
         int var3 = InterfaceParent.SequenceDefinition_get(var1).field3548;
         if (var3 == 1) {
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field973 = 0;
         }

         if (var3 == 2) {
            var0.field973 = 0;
         }
      } else if (var1 == -1 || var0.sequence == -1 || InterfaceParent.SequenceDefinition_get(var1).field3560 >= InterfaceParent.SequenceDefinition_get(var0.sequence).field3560) {
         var0.sequence = var1;
         var0.sequenceFrame = 0;
         var0.sequenceFrameCycle = 0;
         var0.sequenceDelay = var2;
         var0.field973 = 0;
         var0.field1012 = var0.pathLength;
      }

   }
}
