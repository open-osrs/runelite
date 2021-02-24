import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
public class class197 {
   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   @Export("pcmPlayer0")
   static PcmPlayer pcmPlayer0;
   @ObfuscatedName("n")
   static int[] field2375;

   static {
      new Object();
      field2375 = new int[33];
      field2375[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field2375[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;B)V",
      garbageValue = "52"
   )
   public static void method3828(AbstractArchive var0) {
      ParamDefinition.ParamDefinition_archive = var0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "1647502"
   )
   static int method3844(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? class277.field3584 : Interpreter.field1117;
      }

      IsaacCipher.invalidateWidget(var3);
      if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
         if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
            var3.modelType = 2;
            var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
            var3.modelType = 3;
            var3.modelId = UserComparator9.localPlayer.appearance.getChatHeadId();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 2;
         int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemDefinition var6 = class281.ItemDefinition_get(var4);
         var3.modelAngleX = var6.xan2d;
         var3.modelAngleY = var6.yan2d;
         var3.modelAngleZ = var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d;
         var3.modelOffsetY = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
            var3.itemQuantityMode = 0;
         } else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
            var3.itemQuantityMode = 1;
         } else {
            var3.itemQuantityMode = 2;
         }

         if (var3.field2648 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field2648;
         } else if (var3.rawWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
         }

         return 1;
      }
   }
}
