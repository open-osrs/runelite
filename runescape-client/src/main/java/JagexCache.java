import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = 1085994163
   )
   static int field2070;
   @ObfuscatedName("rv")
   @ObfuscatedGetter(
      intValue = -1320857685
   )
   static int field2056;
   @ObfuscatedName("c")
   @Export("JagexCache_locationFile")
   static File JagexCache_locationFile;
   @ObfuscatedName("y")
   @Export("cacheDir")
   static File cacheDir;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2009341667
   )
   @Export("idxCount")
   static int idxCount;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 2115151197
   )
   @Export("cacheGamebuild")
   static int cacheGamebuild;
   @ObfuscatedName("p")
   static String field2065;
   @ObfuscatedName("m")
   @Export("userHomeDirectory")
   static String userHomeDirectory;
   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("dragInventoryWidget")
   static Widget dragInventoryWidget;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)Ljava/lang/String;",
      garbageValue = "2062963895"
   )
   public static String method3683(Buffer var0) {
      return WorldMapRegion.method642(var0, 32767);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-638014439"
   )
   static int method3686(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.ADD) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
         return 1;
      } else if (var0 == ScriptOpcodes.INTERPOLATE) {
         Interpreter.Interpreter_intStackSize -= 5;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var11 - var10) / (var6 - var10);
         return 1;
      } else if (var0 == ScriptOpcodes.ADDPERCENT) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
         return 1;
      } else if (var0 == ScriptOpcodes.SETBIT) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
         return 1;
      } else if (var0 == ScriptOpcodes.CLEARBIT) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
         return 1;
      } else if (var0 == ScriptOpcodes.TESTBIT) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.MOD) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
         return 1;
      } else if (var0 == ScriptOpcodes.POW) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (var9 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
         }

         return 1;
      } else if (var0 == ScriptOpcodes.INVPOW) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (var9 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
               break;
            case 2:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
               break;
            case 3:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
               break;
            case 4:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
               break;
            default:
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if (var0 == ScriptOpcodes.AND) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
         return 1;
      } else if (var0 == ScriptOpcodes.OR) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
         return 1;
      } else if (var0 == ScriptOpcodes.SCALE) {
         Interpreter.Interpreter_intStackSize -= 3;
         long var3 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         long var5 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         long var7 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var7 * var3 / var5);
         return 1;
      } else {
         return 2;
      }
   }
}
