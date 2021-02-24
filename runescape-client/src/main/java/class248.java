import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class248 {
   @ObfuscatedName("n")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lli;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("d")
   int[] field3224 = new int[2048];
   @ObfuscatedName("c")
   int[] field3228 = new int[2048];
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1846736513
   )
   int field3226 = 0;

   public class248() {
      Strings.method4324();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-381922948"
   )
   void method4507(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = HealthBarDefinition.method4658((double)var8, 0.0D, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var17 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var17[var12 + var2 * var11] = (int)(var14[var11] * var14[var12] / var15 * 256.0D);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      Sprite var18 = new Sprite(var17, var2, var2);
      this.spriteMap.put(var1, var18);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)Llm;",
      garbageValue = "1559199090"
   )
   Sprite method4527(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method4507(var1);
      }

      return (Sprite)this.spriteMap.get(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1110209387"
   )
   public final void method4509(int var1, int var2) {
      if (this.field3226 < this.field3224.length) {
         this.field3224[this.field3226] = var1;
         this.field3228[this.field3226] = var2;
         ++this.field3226;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1700428858"
   )
   public final void method4510() {
      this.field3226 = 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IILlm;FI)V",
      garbageValue = "2039360324"
   )
   public final void method4511(int var1, int var2, Sprite var3, float var4) {
      int var5 = (int)(18.0F * var4);
      Sprite var6 = this.method4527(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field3226; ++var10) {
         var11 = this.field3224[var10];
         var12 = this.field3228[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method6182(var8, var9);
         this.method4506(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if (var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if (var11 > Coord.field2560.length) {
                  var11 = Coord.field2560.length;
               }

               var12 = Coord.field2560[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Llm;Llm;Lli;I)V",
      garbageValue = "-524888104"
   )
   void method4506(Sprite var1, Sprite var2, Bounds var3) {
      if (var3.highX != 0 && var3.highY != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.lowX == 0) {
            var4 = var1.subWidth - var3.highX;
         }

         if (var3.lowY == 0) {
            var5 = var1.subHeight - var3.highY;
         }

         int var6 = var4 + var5 * var1.subWidth;
         int var7 = var3.lowX + var2.subWidth * var3.lowY;

         for(int var8 = 0; var8 < var3.highY; ++var8) {
            for(int var9 = 0; var9 < var3.highX; ++var9) {
               int var10001 = var7++;
               var2.pixels[var10001] += var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.highX;
            var7 += var2.subWidth - var3.highX;
         }

      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "15"
   )
   static void method4514() {
      if (Login.Login_username == null || Login.Login_username.length() <= 0) {
         if (WorldMapSectionType.clientPreferences.rememberedUsername != null) {
            Login.Login_username = WorldMapSectionType.clientPreferences.rememberedUsername;
            Client.Login_isUsernameRemembered = true;
         } else {
            Client.Login_isUsernameRemembered = false;
         }

      }
   }
}
