import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cc")
public class class98 {
   @ObfuscatedName("m")
   int field1306;
   @ObfuscatedName("f")
   int field1303;
   @ObfuscatedName("q")
   int[] field1304;
   @ObfuscatedName("w")
   int[] field1305;
   @ObfuscatedName("o")
   float[][] field1302;
   @ObfuscatedName("u")
   int[] field1307;

   class98() {
      MusicSample.method2352(24);
      this.field1306 = MusicSample.method2352(16);
      this.field1303 = MusicSample.method2352(24);
      this.field1304 = new int[this.field1303];
      boolean var1 = MusicSample.method2338() != 0;
      int var2;
      int var3;
      int var4;
      if (var1) {
         var2 = 0;

         for (var3 = MusicSample.method2352(5) + 1; var2 < this.field1303; ++var3) {
            int var5 = MusicSample.method2352(WorldMapCacheName.method634(this.field1303 - var2));

            for (var4 = 0; var4 < var5; ++var4) {
               this.field1304[var2++] = var3;
            }
         }
      } else {
         boolean var15 = MusicSample.method2338() != 0;

         for (var3 = 0; var3 < this.field1303; ++var3) {
            if (var15 && MusicSample.method2338() == 0) {
               this.field1304[var3] = 0;
            } else {
               this.field1304[var3] = MusicSample.method2352(5) + 1;
            }
         }
      }

      this.method2311();
      var2 = MusicSample.method2352(4);
      if (var2 > 0) {
         float var16 = MusicSample.method2357(MusicSample.method2352(32));
         float var6 = MusicSample.method2357(MusicSample.method2352(32));
         var4 = MusicSample.method2352(4) + 1;
         boolean var7 = MusicSample.method2338() != 0;
         int var8;
         if (var2 == 1) {
            var8 = method2310(this.field1303, this.field1306);
         } else {
            var8 = this.field1303 * this.field1306;
         }

         this.field1305 = new int[var8];

         int var9;
         for (var9 = 0; var9 < var8; ++var9) {
            this.field1305[var9] = MusicSample.method2352(var4);
         }

         this.field1302 = new float[this.field1303][this.field1306];
         float var10;
         int var11;
         int var12;
         if (var2 == 1) {
            for (var9 = 0; var9 < this.field1303; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for (var12 = 0; var12 < this.field1306; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.field1305[var13] * var6 + var16 + var10;
                  this.field1302[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for (var9 = 0; var9 < this.field1303; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.field1306;

               for (var12 = 0; var12 < this.field1306; ++var12) {
                  float var17 = (float)this.field1305[var11] * var6 + var16 + var10;
                  this.field1302[var9][var12] = var17;
                  if (var7) {
                     var10 = var17;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   @ObfuscatedName("f")
   void method2311() {
      int[] var1 = new int[this.field1303];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for (var3 = 0; var3 < this.field1303; ++var3) {
         var4 = this.field1304[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (var8 = var4 - 1; var8 >= 1; --var8) {
                  var10 = var2[var8];
                  if (var10 != var6) {
                     break;
                  }

                  var9 = 1 << 32 - var8;
                  if ((var10 & var9) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var10 | var9;
               }
            }

            var2[var4] = var7;

            for (var8 = var4 + 1; var8 <= 32; ++var8) {
               var10 = var2[var8];
               if (var10 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1307 = new int[8];
      var10 = 0;

      for (var3 = 0; var3 < this.field1303; ++var3) {
         var4 = this.field1304[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for (var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field1307[var6] == 0) {
                     this.field1307[var6] = var10;
                  }

                  var6 = this.field1307[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field1307.length) {
                  int[] var11 = new int[this.field1307.length * 2];

                  for (var9 = 0; var9 < this.field1307.length; ++var9) {
                     var11[var9] = this.field1307[var9];
                  }

                  this.field1307 = var11;
               }

               var8 >>>= 1;
            }

            this.field1307[var6] = ~var3;
            if (var6 >= var10) {
               var10 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("q")
   int method2306() {
      int var1;
      for (var1 = 0; this.field1307[var1] >= 0; var1 = MusicSample.method2338() != 0 ? this.field1307[var1] : var1 + 1) {
      }

      return ~this.field1307[var1];
   }

   @ObfuscatedName("w")
   float[] method2307() {
      return this.field1302[this.method2306()];
   }

   @ObfuscatedName("m")
   static int method2310(int var0, int var1) {
      int var2;
      for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; RouteStrategy.method3642(var2, var1) > var0; --var2) {
      }

      return var2;
   }
}
