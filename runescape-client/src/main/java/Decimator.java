import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("Decimator")
public class Decimator {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1376358157
   )
   @Export("inputRate")
   int inputRate;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -876645877
   )
   @Export("outputRate")
   int outputRate;
   @ObfuscatedName("u")
   @Export("table")
   int[][] table;

   public Decimator(int var1, int var2) {
      if (var2 != var1) {
         int var3 = var1;
         int var4 = var2;
         if (var2 > var1) {
            var3 = var2;
            var4 = var1;
         }

         int var5;
         while (var4 != 0) {
            var5 = var3 % var4;
            var3 = var4;
            var4 = var5;
         }

         var1 /= var3;
         var2 /= var3;
         this.inputRate = var1;
         this.outputRate = var2;
         this.table = new int[var1][14];

         for (var5 = 0; var5 < var1; ++var5) {
            int[] var6 = this.table[var5];
            double var7 = (double)var5 / (double)var1 + 6.0D;
            int var9 = (int)Math.floor(var7 - 7.0D + 1.0D);
            if (var9 < 0) {
               var9 = 0;
            }

            int var10 = (int)Math.ceil(var7 + 7.0D);
            if (var10 > 14) {
               var10 = 14;
            }

            for (double var11 = (double)var2 / (double)var1; var9 < var10; ++var9) {
               double var13 = ((double)var9 - var7) * 3.141592653589793D;
               double var15 = var11;
               if (var13 < -1.0E-4D || var13 > 1.0E-4D) {
                  var15 = var11 * (Math.sin(var13) / var13);
               }

               var15 *= 0.54D + 0.46D * Math.cos(((double)var9 - var7) * 0.2243994752564138D);
               var6[var9] = (int)Math.floor(0.5D + var15 * 65536.0D);
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "1292206986"
   )
   @Export("resample")
   byte[] resample(byte[] var1) {
      if (this.table != null) {
         int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for (var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.table[var5];

            int var9;
            for (var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.outputRate;
            var9 = var5 / this.inputRate;
            var4 += var9;
            var5 -= var9 * this.inputRate;
         }

         var1 = new byte[var2];

         for (var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + 32768 >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1419232405"
   )
   @Export("scaleRate")
   int scaleRate(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "25"
   )
   @Export("scalePosition")
   int scalePosition(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1214582149"
   )
   public static final boolean method2490() {
      KeyHandler var0 = KeyHandler.KeyHandler_instance;
      synchronized(KeyHandler.KeyHandler_instance) {
         if (KeyHandler.field453 == KeyHandler.field455) {
            return false;
         } else {
            IndexStoreAction.field411 = KeyHandler.field450[KeyHandler.field453];
            GzipDecompressor.field378 = KeyHandler.field449[KeyHandler.field453];
            KeyHandler.field453 = KeyHandler.field453 + 1 & 127;
            return true;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ldu;IIII)Z",
      garbageValue = "555449756"
   )
   static final boolean method2491(Model var0, int var1, int var2, int var3) {
      boolean var4 = ViewportMouse.ViewportMouse_isInViewport;
      if (!var4) {
         return false;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (!ViewportMouse.ViewportMouse_false0) {
            var5 = Scene.Scene_cameraPitchSine;
            var6 = Scene.Scene_cameraPitchCosine;
            var7 = Scene.Scene_cameraYawSine;
            var8 = Scene.Scene_cameraYawCosine;
            byte var14 = 50;
            short var15 = 3500;
            var9 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var14 / Rasterizer3D.Rasterizer3D_zoom;
            var10 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var14 / Rasterizer3D.Rasterizer3D_zoom;
            var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var15 / Rasterizer3D.Rasterizer3D_zoom;
            int var16 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var15 / Rasterizer3D.Rasterizer3D_zoom;
            int var17 = Rasterizer3D.rot1(var10, var14, var6, var5);
            var12 = Rasterizer3D.rot2(var10, var14, var6, var5);
            var10 = var17;
            var17 = Rasterizer3D.rot1(var16, var15, var6, var5);
            var13 = Rasterizer3D.rot2(var16, var15, var6, var5);
            var16 = var17;
            var17 = Rasterizer3D.rot3(var9, var12, var8, var7);
            var12 = Rasterizer3D.rot4(var9, var12, var8, var7);
            var9 = var17;
            var17 = Rasterizer3D.rot3(var11, var13, var8, var7);
            var13 = Rasterizer3D.rot4(var11, var13, var8, var7);
            AccessFile.field7 = (var9 + var17) / 2;
            ViewportMouse.field951 = (var16 + var10) / 2;
            ViewportMouse.field952 = (var13 + var12) / 2;
            ViewportMouse.field953 = (var17 - var9) / 2;
            class311.field1156 = (var16 - var10) / 2;
            Skeleton.field874 = (var13 - var12) / 2;
            GraphicsObject.field377 = Math.abs(ViewportMouse.field953);
            ViewportMouse.field954 = Math.abs(class311.field1156);
            class248.field1142 = Math.abs(Skeleton.field874);
         }

         var5 = var0.xMid + var1;
         var6 = var2 + var0.yMid;
         var7 = var3 + var0.zMid;
         var8 = var0.xMidOffset;
         var12 = var0.yMidOffset;
         var13 = var0.zMidOffset;
         var9 = AccessFile.field7 - var5;
         var10 = ViewportMouse.field951 - var6;
         var11 = ViewportMouse.field952 - var7;
         return Math.abs(var9) > var8 + GraphicsObject.field377 ? false : (Math.abs(var10) > var12 + ViewportMouse.field954 ? false : (Math.abs(var11) > var13 + class248.field1142 ? false : (Math.abs(var11 * class311.field1156 - var10 * Skeleton.field874) > var13 * ViewportMouse.field954 + var12 * class248.field1142 ? false : (Math.abs(var9 * Skeleton.field874 - var11 * ViewportMouse.field953) > var8 * class248.field1142 + var13 * GraphicsObject.field377 ? false : Math.abs(var10 * ViewportMouse.field953 - var9 * class311.field1156) <= var8 * ViewportMouse.field954 + var12 * GraphicsObject.field377))));
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILcg;ZI)I",
      garbageValue = "-858740470"
   )
   static int method2492(int var0, Script var1, boolean var2) {
      if (var0 == 5630) {
         Client.field175 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
