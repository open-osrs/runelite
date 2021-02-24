import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class39 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Law;"
   )
   static final class39 field285 = new class39(0);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Law;"
   )
   static final class39 field283 = new class39(1);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1455031991
   )
   static int field288;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 1613594049
   )
   static int field284;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = 1560346671
   )
   @Export("cameraYaw")
   static int cameraYaw;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1348128359
   )
   @Export("value")
   final int value;

   class39(int var1) {
      this.value = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1057060168"
   )
   public static int method644(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var2 = var0 * var2;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/security/SecureRandom;",
      garbageValue = "12"
   )
   static SecureRandom method643() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}
