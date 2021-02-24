import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Decimator")
public class Decimator {
   @ObfuscatedName("rl")
   @ObfuscatedGetter(
      intValue = -1809661952
   )
   static int field1475;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 18883239
   )
   static int field1480;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1921433287
   )
   @Export("inputRate")
   int inputRate;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1053329407
   )
   @Export("outputRate")
   int outputRate;
   @ObfuscatedName("h")
   @Export("table")
   int[][] table;

   public Decimator(int var1, int var2) {
      if (var2 != var1) {
         int var4 = var1;
         int var5 = var2;
         if (var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.inputRate = var1;
         this.outputRate = var2;
         this.table = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.table[var7];
            double var9 = (double)var7 / (double)var1 + 6.0D;
            int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(var9 + 7.0D);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * 3.141592653589793D;
               double var17 = var13;
               if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D);
               var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
            }
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "-153024312"
   )
   @Export("resample")
   byte[] resample(byte[] var1) {
      if (this.table != null) {
         int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.table[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var7 * var8[var9];
            }

            var5 += this.outputRate;
            var9 = var5 / this.inputRate;
            var4 += var9;
            var5 -= var9 * this.inputRate;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + '耀' >> 16;
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-128"
   )
   @Export("scaleRate")
   int scaleRate(int var1) {
      if (this.table != null) {
         var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
      }

      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   @Export("scalePosition")
   int scalePosition(int var1) {
      if (this.table != null) {
         var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
      }

      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1972966178"
   )
   static void method2704() {
      if (WorldMapData_0.loadWorlds()) {
         Login.worldSelectOpen = true;
         Login.worldSelectPage = 0;
         Login.worldSelectPagesCount = 0;
      }

   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "909165860"
   )
   static final void method2708() {
      for(Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
         if (var0.plane == class90.Client_plane && Client.cycle <= var0.cycleEnd) {
            if (Client.cycle >= var0.cycleStart) {
               if (var0.targetIndex > 0) {
                  NPC var1 = Client.npcs[var0.targetIndex - 1];
                  if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.setDestination(var1.x, var1.y, WorldMapRegion.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               if (var0.targetIndex < 0) {
                  int var2 = -var0.targetIndex - 1;
                  Player var3;
                  if (var2 == Client.localPlayerIndex) {
                     var3 = UserComparator9.localPlayer;
                  } else {
                     var3 = Client.players[var2];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.setDestination(var3.x, var3.y, WorldMapRegion.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               var0.advance(Client.field808);
               MilliClock.scene.drawEntity(class90.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
            }
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("jk")
   static final void method2707(double var0) {
      Rasterizer3D.Rasterizer3D_setBrightness(var0);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
      WorldMapData_0.method239();
      WorldMapSectionType.clientPreferences.field1072 = var0;
      class23.savePreferences();
   }
}
