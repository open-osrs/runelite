import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class228 {
   @ObfuscatedName("ri")
   @ObfuscatedGetter(
      intValue = 335336935
   )
   static int field2740;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;B)V",
      garbageValue = "-43"
   )
   public static void method4310(AbstractArchive var0) {
      FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-1439463638"
   )
   static int method4309(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         Interpreter.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = class237.getWidget(var9);
            if (var6.children == null) {
               var6.children = new Widget[var11 + 1];
            }

            if (var6.children.length <= var11) {
               Widget[] var7 = new Widget[var11 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if (var11 > 0 && var6.children[var11 - 1] == null) {
               throw new RuntimeException("" + (var11 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.childIndex = var11;
               var12.isIf3 = true;
               var6.children[var11] = var12;
               if (var2) {
                  class277.scriptDotWidget = var12;
               } else {
                  Interpreter.scriptActiveWidget = var12;
               }

               IsaacCipher.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget;
            Widget var10 = class237.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            IsaacCipher.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            var3.children = null;
            IsaacCipher.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     class277.scriptDotWidget = var3;
                  } else {
                     Interpreter.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Widget var5 = ArchiveLoader.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  class277.scriptDotWidget = var5;
               } else {
                  Interpreter.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2112037440"
   )
   public static void method4311() {
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "585"
   )
   @Export("runIntfCloseListeners")
   static final void runIntfCloseListeners(int var0, int var1) {
      if (WorldMapCacheName.loadInterface(var0)) {
         WorldMapData_1.runComponentCloseListeners(DefaultsGroup.Widget_interfaceComponents[var0], var1);
      }
   }
}
