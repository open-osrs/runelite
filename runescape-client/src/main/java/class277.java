import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class277 {
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "Llq;"
   )
   static IndexedSprite field1144;

   @ObfuscatedName("m")
   public static final int method5355(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = var4 * (var2 + 1.0D);
         } else {
            var12 = var4 + var2 - var2 * var4;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var18 = var0 - 0.3333333333333333D;
         if (var18 < 0.0D) {
            ++var18;
         }

         if (6.0D * var16 < 1.0D) {
            var6 = var16 * (var12 - var14) * 6.0D + var14;
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + (var12 - var14) * (0.6666666666666666D - var16) * 6.0D;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = var14 + (var12 - var14) * 6.0D * var0;
         } else if (var0 * 2.0D < 1.0D) {
            var8 = var12;
         } else if (var0 * 3.0D < 2.0D) {
            var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
         } else {
            var8 = var14;
         }

         if (var18 * 6.0D < 1.0D) {
            var10 = var18 * 6.0D * (var12 - var14) + var14;
         } else if (2.0D * var18 < 1.0D) {
            var10 = var12;
         } else if (var18 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (0.6666666666666666D - var18) * (var12 - var14);
         } else {
            var10 = var14;
         }
      }

      int var20 = (int)(256.0D * var6);
      int var13 = (int)(var8 * 256.0D);
      int var21 = (int)(var10 * 256.0D);
      int var15 = var21 + (var13 << 8) + (var20 << 16);
      return var15;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "1648987580"
   )
   public static String method5356(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for (int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for (int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }
}
