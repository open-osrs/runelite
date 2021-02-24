import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("ScriptFrame")
public class ScriptFrame {
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   @Export("script")
   Script script;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1121255489
   )
   @Export("pc")
   int pc = -1;
   @ObfuscatedName("d")
   @Export("intLocals")
   int[] intLocals;
   @ObfuscatedName("c")
   @Export("stringLocals")
   String[] stringLocals;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljz;",
      garbageValue = "0"
   )
   public static HitSplatDefinition method1222(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "461265882"
   )
   static int method1221(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.GETWINDOWMODE) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.SETWINDOWMODE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               GameBuild.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.windowMode;
            return 1;
         } else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
            if (var0 == 5310) {
               --Interpreter.Interpreter_intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               WorldMapSectionType.clientPreferences.windowMode = var3;
               class23.savePreferences();
            }

            return 1;
         }
      }
   }
}
