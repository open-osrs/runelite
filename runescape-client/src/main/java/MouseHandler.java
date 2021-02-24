import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("MouseHandler_instance")
   public static MouseHandler MouseHandler_instance = new MouseHandler();
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = -7050613403176353347L
   )
   @Export("MouseHandler_millis")
   public static long MouseHandler_millis = 0L;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1826122279
   )
   @Export("MouseHandler_idleCycles")
   public static volatile int MouseHandler_idleCycles = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1193500929
   )
   @Export("MouseHandler_currentButtonVolatile")
   static volatile int MouseHandler_currentButtonVolatile = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 69676803
   )
   @Export("MouseHandler_xVolatile")
   static volatile int MouseHandler_xVolatile = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1528729291
   )
   @Export("MouseHandler_yVolatile")
   static volatile int MouseHandler_yVolatile = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = -7426561845363356173L
   )
   @Export("MouseHandler_lastMovedVolatile")
   static volatile long MouseHandler_lastMovedVolatile = -1L;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 411605215
   )
   @Export("MouseHandler_currentButton")
   public static int MouseHandler_currentButton = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -414755305
   )
   @Export("MouseHandler_x")
   public static int MouseHandler_x = 0;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 586562237
   )
   @Export("MouseHandler_y")
   public static int MouseHandler_y = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 635740657
   )
   @Export("MouseHandler_lastButtonVolatile")
   static volatile int MouseHandler_lastButtonVolatile = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1027797435
   )
   @Export("MouseHandler_lastPressedXVolatile")
   static volatile int MouseHandler_lastPressedXVolatile = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1792893405
   )
   @Export("MouseHandler_lastPressedYVolatile")
   static volatile int MouseHandler_lastPressedYVolatile = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -8649203811003384729L
   )
   @Export("MouseHandler_lastPressedTimeMillisVolatile")
   static volatile long MouseHandler_lastPressedTimeMillisVolatile = 0L;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -266650857
   )
   @Export("MouseHandler_lastButton")
   public static int MouseHandler_lastButton = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -80903917
   )
   @Export("MouseHandler_lastPressedX")
   public static int MouseHandler_lastPressedX = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -199008981
   )
   @Export("MouseHandler_lastPressedY")
   public static int MouseHandler_lastPressedY = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      longValue = 3494656380039963363L
   )
   @Export("MouseHandler_lastPressedTimeMillis")
   public static long MouseHandler_lastPressedTimeMillis = 0L;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 47148611
   )
   static int field512;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-287252269"
   )
   @Export("getButton")
   final int getButton(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = var1.getX();
         MouseHandler_yVolatile = var1.getY();
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_lastPressedXVolatile = var1.getX();
         MouseHandler_lastPressedYVolatile = var1.getY();
         MouseHandler_lastPressedTimeMillisVolatile = Tiles.currentTimeMillis();
         MouseHandler_lastButtonVolatile = this.getButton(var1);
         if (MouseHandler_lastButtonVolatile != 0) {
            MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_currentButtonVolatile = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_idleCycles = 0;
         MouseHandler_xVolatile = -1;
         MouseHandler_yVolatile = -1;
         MouseHandler_lastMovedVolatile = var1.getWhen();
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (MouseHandler_instance != null) {
         MouseHandler_currentButtonVolatile = 0;
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;Lig;Lig;I)V",
      garbageValue = "1350296670"
   )
   public static void method1151(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      FontName.Widget_archive = var0;
      DirectByteArrayCopier.Widget_modelsArchive = var1;
      InterfaceParent.Widget_spritesArchive = var2;
      Widget.Widget_fontsArchive = var3;
      DefaultsGroup.Widget_interfaceComponents = new Widget[FontName.Widget_archive.getGroupCount()][];
      Widget.Widget_loadedInterfaces = new boolean[FontName.Widget_archive.getGroupCount()];
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1766193005"
   )
   public static int method1176(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "-67"
   )
   static int method1174(int var0, Script var1, boolean var2) {
      Widget var5;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var5 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var5 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         if (var5.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else {
         return 2;
      }
   }
}
