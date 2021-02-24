import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("mapSceneSprites")
   static IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1101754891
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 112760039
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1255981351
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 282137725
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -2048603637
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2025477005
   )
   @Export("regionEndY")
   int regionEndY;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lar;B)V",
      garbageValue = "112"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.regionEndX) {
         var1.regionLowX = this.regionEndX;
      }

      if (var1.regionHighX < this.regionEndX) {
         var1.regionHighX = this.regionEndX;
      }

      if (var1.regionLowY > this.regionEndY) {
         var1.regionLowY = this.regionEndY;
      }

      if (var1.regionHighY < this.regionEndY) {
         var1.regionHighY = this.regionEndY;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "-90"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-5"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "-76"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(III)Lhd;",
      garbageValue = "-1841969392"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
         int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-489268143"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "12"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "103"
   )
   public static void method671() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "4"
   )
   static boolean method657(char var0) {
      for(int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
         if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-1029416071"
   )
   static int method679(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
      }

      String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         } else {
            var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         }
      }

      var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
      if (var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if (var0 == ScriptOpcodes.CC_SETONCLICK) {
         var3.onClick = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
         var3.onHold = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
         var3.onRelease = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
         var3.onMouseOver = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
         var3.onMouseLeave = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
         var3.onDrag = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
         var3.onTargetLeave = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
         var3.onVarTransmit = var8;
         var3.varTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
         var3.onTimer = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONOP) {
         var3.onOp = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
         var3.onDragComplete = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
         var3.onClickRepeat = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
         var3.onMouseRepeat = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
         var3.onInvTransmit = var8;
         var3.invTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
         var3.onStatTransmit = var8;
         var3.statTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
         var3.onTargetEnter = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
         var3.onScroll = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
         var3.onChatTransmit = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONKEY) {
         var3.onKey = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
         var3.onFriendTransmit = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
         var3.onClanTransmit = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
         var3.onMiscTransmit = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
         var3.onDialogAbort = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
         var3.onSubChange = var8;
      } else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
         var3.onStockTransmit = var8;
      } else if (var0 == 1426) {
         var3.field2678 = var8;
      } else {
         if (var0 != ScriptOpcodes.CC_SETONRESIZE) {
            return 2;
         }

         var3.onResize = var8;
      }

      var3.hasListener = true;
      return 1;
   }
}
