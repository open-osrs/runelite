import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive10")
   static Archive archive10;
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("compass")
   static Sprite compass;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("sprites")
   IndexedSprite[] sprites;
   @ObfuscatedName("z")
   int[] field1045 = new int[256];
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1212643041
   )
   int field1046 = 0;
   @ObfuscatedName("q")
   int[] field1047;
   @ObfuscatedName("l")
   int[] field1048;
   @ObfuscatedName("s")
   int[] field1049;
   @ObfuscatedName("b")
   int[] field1057;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1072742705
   )
   int field1051 = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1152282493
   )
   int field1052 = 0;
   @ObfuscatedName("k")
   int[] field1053;
   @ObfuscatedName("i")
   int[] field1054;
   @ObfuscatedName("x")
   int[] field1064;
   @ObfuscatedName("f")
   int[] field1056;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -812562451
   )
   int field1050 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 692105716
   )
   int field1058 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1614703881
   )
   int field1059 = 0;

   @ObfuscatedSignature(
      descriptor = "([Lly;)V"
   )
   LoginScreenAnimation(IndexedSprite[] var1) {
      this.sprites = var1;
      this.initColors();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-16274"
   )
   @Export("initColors")
   void initColors() {
      this.field1048 = new int[256];

      int var1;
      for(var1 = 0; var1 < 64; ++var1) {
         this.field1048[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1048[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1048[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1048[var1 + 192] = 16777215;
      }

      this.field1049 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1049[var1] = var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1049[var1 + 64] = var1 * 4 + '\uff00';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1049[var1 + 128] = var1 * 262144 + '\uffff';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1049[var1 + 192] = 16777215;
      }

      this.field1057 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1057[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1057[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1057[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1057[var1 + 192] = 16777215;
      }

      this.field1047 = new int[256];
      this.field1050 = 0;
      this.field1064 = new int['耀'];
      this.field1056 = new int['耀'];
      this.method1928((IndexedSprite)null);
      this.field1053 = new int['耀'];
      this.field1054 = new int['耀'];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "143600222"
   )
   void method1926() {
      this.field1048 = null;
      this.field1049 = null;
      this.field1057 = null;
      this.field1047 = null;
      this.field1064 = null;
      this.field1056 = null;
      this.field1053 = null;
      this.field1054 = null;
      this.field1050 = 0;
      this.field1058 = 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "67"
   )
   @Export("draw")
   void draw(int var1, int var2) {
      if (this.field1053 == null) {
         this.initColors();
      }

      if (this.field1059 == 0) {
         this.field1059 = var2;
      }

      int var3 = var2 - this.field1059;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field1059 = var2;
      if (var3 > 0) {
         this.method1930(var3);
      }

      this.method1959(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1510812052"
   )
   final void method1930(int var1) {
      this.field1050 += var1 * 128;
      int var2;
      if (this.field1050 > this.field1064.length) {
         this.field1050 -= this.field1064.length;
         var2 = (int)(Math.random() * 12.0D);
         this.method1928(this.sprites[var2]);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field1053[var3 + var2] - this.field1064[var2 + this.field1050 & this.field1064.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1053[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = var7 * 128;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.field1053[var9 + var8] = 255;
            } else {
               this.field1053[var8 + var9] = 0;
            }
         }
      }

      if (this.field1051 * 16 > 0) {
         this.field1051 = this.field1051 * 16 - var1 * 4;
      }

      if (this.field1052 * 16 > 0) {
         this.field1052 = this.field1052 * 16 - var1 * 4;
      }

      if (this.field1051 * 16 == 0 && this.field1052 * 16 == 0) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.field1051 = 1024;
         }

         if (var7 == 1) {
            this.field1052 = 1024;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.field1045[var7] = this.field1045[var7 + var1];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.field1045[var7] = (int)(Math.sin((double)this.field1046 / 14.0D) * 16.0D + Math.sin((double)this.field1046 / 15.0D) * 14.0D + Math.sin((double)this.field1046 / 16.0D) * 12.0D);
         ++this.field1046;
      }

      this.field1058 = this.field1058 * 10000 + var1 * 100;
      var7 = ((Client.cycle & 1) + var1) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < this.field1058 * 10000; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.field1053[var12 + (var13 << 7)] = 192;
         }

         this.field1058 = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = var11 * 128;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.field1053[var13 + var14 + var7];
               }

               if (var14 - (var7 + 1) >= 0) {
                  var12 -= this.field1053[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.field1054[var14 + var13] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var13 + var7 < 256) {
                  var12 += this.field1054[var11 + var14 + var7 * 128];
               }

               if (var13 - (var7 + 1) >= 0) {
                  var12 -= this.field1054[var11 + var14 - (var7 + 1) * 128];
               }

               if (var13 >= 0) {
                  this.field1053[var11 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "696665844"
   )
   final int method1931(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + var4 * (var1 & '\uff00') & 16711680) >> 8;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-557955143"
   )
   final void method1959(int var1) {
      int var2 = this.field1047.length;
      if (this.field1051 * 16 > 0) {
         this.method1933(this.field1051 * 16, this.field1049);
      } else if (this.field1052 * 16 > 0) {
         this.method1933(this.field1052 * 16, this.field1057);
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.field1047[var3] = this.field1048[var3];
         }
      }

      this.method1934(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I[II)V",
      garbageValue = "-1988316375"
   )
   final void method1933(int var1, int[] var2) {
      int var3 = this.field1047.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.field1047[var4] = this.method1931(this.field1048[var4], var2[var4], 1024 - var1);
         } else if (var1 > 256) {
            this.field1047[var4] = var2[var4];
         } else {
            this.field1047[var4] = this.method1931(var2[var4], this.field1048[var4], 256 - var1);
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "25"
   )
   final void method1934(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.field1045[var3] / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= FileSystem.rasterProvider.width) {
            var7 = FileSystem.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * FileSystem.rasterProvider.width;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.field1053[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.field1047[var10];
               int var14 = FileSystem.rasterProvider.pixels[var8];
               FileSystem.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & '\uff00') + var13 * (var14 & '\uff00') & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lly;B)V",
      garbageValue = "1"
   )
   final void method1928(IndexedSprite var1) {
      int var2;
      for(var2 = 0; var2 < this.field1064.length; ++var2) {
         this.field1064[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         this.field1064[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.field1056[var5] = (this.field1064[var5 - 128] + this.field1064[var5 + 1] + this.field1064[var5 + 128] + this.field1064[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.field1064;
         this.field1064 = this.field1056;
         this.field1056 = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.subHeight; ++var3) {
            for(var4 = 0; var4 < var1.subWidth; ++var4) {
               if (var1.pixels[var2++] != 0) {
                  var5 = var4 + var1.xOffset + 16;
                  int var6 = var3 + var1.yOffset + 16;
                  int var7 = var5 + (var6 << 7);
                  this.field1064[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "742705358"
   )
   static char method1927(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZI)I",
      garbageValue = "-1637981491"
   )
   @Export("parseIntCustomRadix")
   public static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+') {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
