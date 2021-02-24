import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
   @ObfuscatedName("sf")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("masterDisk")
   static ArchiveDisk masterDisk;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1871677981
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("v")
   @Export("tileTemplates")
   byte[][][] tileTemplates;

   WorldMapScaleHandler(int var1) {
      this.pixelsPerTile = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-313253056"
   )
   void method813(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method826(var8, var7);
         var7 = this.method815(var7);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "655322250"
   )
   int method826(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "244529953"
   )
   int method815(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2066624516"
   )
   @Export("init")
   void init() {
      if (this.tileTemplates == null) {
         this.tileTemplates = new byte[8][4][];
         this.init0();
         this.init1();
         this.init2();
         this.init3();
         this.init4();
         this.init5();
         this.init6();
         this.init7();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-134858358"
   )
   @Export("init0")
   void init0() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][3] = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2097945159"
   )
   @Export("init1")
   void init1() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.tileTemplates[1][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][3] = var1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "123"
   )
   @Export("init2")
   void init2() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "60"
   )
   @Export("init3")
   void init3() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][3] = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1887345157"
   )
   @Export("init4")
   void init4() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][3] = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1859326664"
   )
   @Export("init5")
   void init5() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var3 <= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var3 >= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][3] = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "99"
   )
   @Export("init6")
   void init6() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][3] = var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1454081837"
   )
   @Export("init7")
   void init7() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][3] = var1;
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "(Lbk;ZI)V",
      garbageValue = "458493805"
   )
   @Export("addPlayerToScene")
   static void addPlayerToScene(Player var0, boolean var1) {
      if (var0 != null && var0.isVisible() && !var0.isHidden) {
         var0.isUnanimated = false;
         if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
            var0.isUnanimated = true;
         }

         int var2 = var0.x >> 7;
         int var3 = var0.y >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = TextureProvider.calculateTag(0, 0, 0, false, var0.index);
            if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
               var0.isUnanimated = false;
               var0.tileHeight = WorldMapRegion.getTileHeight(var0.x, var0.y, class90.Client_plane);
               var0.playerCycle = Client.cycle;
               MilliClock.scene.addNullableObject(class90.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field641, var0.field642, var0.field640, var0.field644);
            } else {
               if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
                     return;
                  }

                  Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
               }

               var0.tileHeight = WorldMapRegion.getTileHeight(var0.x, var0.y, class90.Client_plane);
               var0.playerCycle = Client.cycle;
               MilliClock.scene.drawEntity(class90.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
            }
         }
      }

   }
}
