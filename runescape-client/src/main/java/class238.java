import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class238 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   static final class238 field3123 = new class238(51, 27, 800, 0, 16, 16);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   static final class238 field3121 = new class238(25, 28, 800, 656, 40, 40);
   @ObfuscatedName("gb")
   @Export("regions")
   static int[] regions;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1356540615
   )
   final int field3124;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 787238397
   )
   final int field3122;

   class238(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3124 = var5;
      this.field3122 = var6;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
      garbageValue = "-1656057287"
   )
   static String method4334(Throwable var0) throws IOException {
      String var1;
      if (var0 instanceof RunException) {
         RunException var2 = (RunException)var0;
         var1 = var2.message + " | ";
         var0 = var2.throwable;
      } else {
         var1 = "";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         while(true) {
            String var7 = var5.readLine();
            if (var7 == null) {
               var1 = var1 + "| " + var6;
               return var1;
            }

            int var8 = var7.indexOf(40);
            int var9 = var7.indexOf(41, var8 + 1);
            if (var8 >= 0 && var9 >= 0) {
               String var10 = var7.substring(var8 + 1, var9);
               int var11 = var10.indexOf(".java:");
               if (var11 >= 0) {
                  var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
                  var1 = var1 + var10 + ' ';
                  continue;
               }

               var7 = var7.substring(0, var8);
            }

            var7 = var7.trim();
            var7 = var7.substring(var7.lastIndexOf(32) + 1);
            var7 = var7.substring(var7.lastIndexOf(9) + 1);
            var1 = var1 + var7 + ' ';
         }
      }
   }
}
