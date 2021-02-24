import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -280091935
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1430754159
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1286467611
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1909904707
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("y")
   @Export("action")
   String action;

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-1250415572"
   )
   @Export("setViewportShape")
   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = Client.field779;
      } else if (var5 >= 100) {
         var6 = Client.field913;
      } else {
         var6 = (Client.field913 - Client.field779) * var5 / 100 + Client.field779;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var15;
      if (var7 < Client.field918) {
         var15 = Client.field918;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field690) {
            var6 = Client.field690;
            var8 = var3 * var6 * 512 / (var15 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field846) {
         var15 = Client.field846;
         var6 = var15 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field916) {
            var6 = Client.field916;
            var8 = var15 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      Client.viewportZoom = var3 * var6 / 334;
      if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
         int[] var14 = new int[9];

         for(var9 = 0; var9 < var14.length; ++var9) {
            int var10 = var9 * 32 + 15 + 128;
            int var11 = var10 * 3 + 600;
            int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
            int var12 = SecureRandomCallable.method1233(var11, var3);
            var14[var9] = var12 * var13 >> 16;
         }

         Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334);
      }

      Client.viewportOffsetX = var0;
      Client.viewportOffsetY = var1;
      Client.viewportWidth = var2;
      Client.viewportHeight = var3;
   }
}
