import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
   @ObfuscatedName("ae")
   @Export("fontHelvetica13")
   static java.awt.Font fontHelvetica13;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 309353729
   )
   @Export("element")
   final int element;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Laa;"
   )
   @Export("label")
   final WorldMapLabel label;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1945919631
   )
   @Export("subWidth")
   final int subWidth;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1219873699
   )
   @Export("subHeight")
   final int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lhd;Lhd;ILaa;)V"
   )
   WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.element = var3;
      this.label = var4;
      WorldMapElement var5 = InvDefinition.WorldMapElement_get(this.getElement());
      SpritePixels var6 = var5.getSpriteBool(false);
      if (var6 != null) {
         this.subWidth = var6.subWidth;
         this.subHeight = var6.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   @Export("getElement")
   public int getElement() {
      return this.element;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)Laa;",
      garbageValue = "31041"
   )
   @Export("getLabel")
   WorldMapLabel getLabel() {
      return this.label;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-413607837"
   )
   @Export("getSubWidth")
   int getSubWidth() {
      return this.subWidth;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1875187157"
   )
   @Export("getSubHeight")
   int getSubHeight() {
      return this.subHeight;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-344987914"
   )
   static int method286() {
      return 12;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lhz;II)V",
      garbageValue = "18479210"
   )
   @Export("Widget_setKeyIgnoreHeld")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
      if (var0.field2668 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field2660 == null) {
            var0.field2660 = new int[var0.field2668.length];
         }

         var0.field2660[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "1727285517"
   )
   static int method285(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
         Interpreter.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (!Client.isCameraLocked) {
            Client.camAngleX = var3;
            Client.camAngleY = var4;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var3 < 0) {
            var3 = 0;
         }

         Client.camFollowHeight = var3;
         return 1;
      } else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
