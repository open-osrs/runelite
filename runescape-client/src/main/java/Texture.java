import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Texture")
public class Texture extends Node {
   @ObfuscatedName("a")
   @Export("Texture_animatedPixels")
   static int[] Texture_animatedPixels;
   @ObfuscatedName("o")
   @Export("int1")
   int int1;
   @ObfuscatedName("u")
   boolean field893;
   @ObfuscatedName("g")
   @Export("records")
   int[] records;
   @ObfuscatedName("l")
   int[] field894;
   @ObfuscatedName("e")
   int[] field895;
   @ObfuscatedName("x")
   int[] field896;
   @ObfuscatedName("d")
   @Export("animationDirection")
   int animationDirection;
   @ObfuscatedName("k")
   @Export("animationSpeed")
   int animationSpeed;
   @ObfuscatedName("n")
   @Export("pixels")
   int[] pixels;
   @ObfuscatedName("i")
   @Export("isLoaded")
   boolean isLoaded;

   @ObfuscatedSignature(
      signature = "(Lgr;)V"
   )
   Texture(Buffer var1) {
      this.isLoaded = false;
      this.int1 = var1.method43();
      this.field893 = var1.readUnsignedByte() == 1;
      int var2 = var1.readUnsignedByte();
      if (var2 >= 1 && var2 <= 4) {
         this.records = new int[var2];

         int var3;
         for (var3 = 0; var3 < var2; ++var3) {
            this.records[var3] = var1.method43();
         }

         if (var2 > 1) {
            this.field894 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
               this.field894[var3] = var1.readUnsignedByte();
            }
         }

         if (var2 > 1) {
            this.field895 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
               this.field895[var3] = var1.readUnsignedByte();
            }
         }

         this.field896 = new int[var2];

         for (var3 = 0; var3 < var2; ++var3) {
            this.field896[var3] = var1.readInt();
         }

         this.animationDirection = var1.readUnsignedByte();
         this.animationSpeed = var1.readUnsignedByte();
         this.pixels = null;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(DILir;)Z"
   )
   boolean method320(double var1, int var3, AbstractIndexCache var4) {
      int var5;
      for (var5 = 0; var5 < this.records.length; ++var5) {
         if (var4.getRecordFlat(this.records[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.pixels = new int[var5];

      for (int var6 = 0; var6 < this.records.length; ++var6) {
         IndexedSprite var7 = class83.method2028(var4, this.records[var6]);
         var7.normalize();
         byte[] var8 = var7.pixels;
         int[] var9 = var7.palette;
         int var10 = this.field896[var6];
         if ((var10 & -16777216) == 16777216) {
         }

         if ((var10 & -16777216) == 33554432) {
         }

         int var11;
         int var12;
         int var13;
         int var14;
         if ((var10 & -16777216) == 50331648) {
            var11 = var10 & 16711935;
            var12 = var10 >> 8 & 255;

            for (var13 = 0; var13 < var9.length; ++var13) {
               var14 = var9[var13];
               if (var14 >> 8 == (var14 & 65535)) {
                  var14 &= 255;
                  var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & 65280;
               }
            }
         }

         for (var11 = 0; var11 < var9.length; ++var11) {
            var9[var11] = Rasterizer3D.Rasterizer3D_brighten(var9[var11], var1);
         }

         if (var6 == 0) {
            var11 = 0;
         } else {
            var11 = this.field894[var6 - 1];
         }

         if (var11 == 0) {
            if (var3 == var7.subWidth) {
               for (var12 = 0; var12 < var5; ++var12) {
                  this.pixels[var12] = var9[var8[var12] & 255];
               }
            } else if (var7.subWidth == 64 && var3 == 128) {
               var12 = 0;

               for (var13 = 0; var13 < var3; ++var13) {
                  for (var14 = 0; var14 < var3; ++var14) {
                     this.pixels[var12++] = var9[var8[(var13 >> 1 << 6) + (var14 >> 1)] & 255];
                  }
               }
            } else {
               if (var7.subWidth != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var12 = 0;

               for (var13 = 0; var13 < var3; ++var13) {
                  for (var14 = 0; var14 < var3; ++var14) {
                     this.pixels[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var11 == 1) {
         }

         if (var11 == 2) {
         }

         if (var11 == 3) {
         }
      }

      return true;
   }

   @ObfuscatedName("f")
   @Export("reset")
   void reset() {
      this.pixels = null;
   }

   @ObfuscatedName("q")
   @Export("Texture_animate")
   void Texture_animate(int var1) {
      if (this.pixels != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var8;
         if (this.animationDirection == 1 || this.animationDirection == 3) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = var2 * this.animationSpeed * var1;
            var5 = var3 - 1;
            if (this.animationDirection == 1) {
               var4 = -var4;
            }

            for (var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               Texture_animatedPixels[var6] = this.pixels[var7];
            }

            var8 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var8;
         }

         if (this.animationDirection == 2 || this.animationDirection == 4) {
            if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) {
               Texture_animatedPixels = new int[this.pixels.length];
            }

            if (this.pixels.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.pixels.length;
            var4 = this.animationSpeed * var1;
            var5 = var2 - 1;
            if (this.animationDirection == 2) {
               var4 = -var4;
            }

            for (var6 = 0; var6 < var3; var6 += var2) {
               for (var7 = 0; var7 < var2; ++var7) {
                  int var9 = var6 + var7;
                  int var10 = var6 + (var7 + var4 & var5);
                  Texture_animatedPixels[var9] = this.pixels[var10];
               }
            }

            var8 = this.pixels;
            this.pixels = Texture_animatedPixels;
            Texture_animatedPixels = var8;
         }
      }

   }
}
