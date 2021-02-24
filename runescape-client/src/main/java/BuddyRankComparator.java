import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fy")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
   @ObfuscatedName("n")
   @Export("reversed")
   final boolean reversed;

   public BuddyRankComparator(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lky;Lky;B)I",
      garbageValue = "-42"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.rank != var1.rank) {
         return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "1"
   )
   static int method3622(int var0, Script var1, boolean var2) {
      Widget var6;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == 1928) {
            var6 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               ApproximateRouteStrategy.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, "");
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            Interpreter.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               ApproximateRouteStrategy.widgetDefaultMenuAction(var5, var3, var4, class237.getWidget(var3).itemId, "");
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field1123 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var6 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         } else {
            var6 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
         }

         if (var6.onResize == null) {
            return 0;
         } else {
            ScriptEvent var7 = new ScriptEvent();
            var7.widget = var6;
            var7.args = var6.onResize;
            var7.field593 = Interpreter.field1123 + 1;
            Client.scriptEvents.addFirst(var7);
            return 1;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-866624945"
   )
   static int method3621(int var0, Script var1, boolean var2) {
      Widget var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHIDE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETLAYER) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }
}
