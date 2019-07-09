import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lec;"
   )
   public static DemotingHashTable field1051;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1061363609
   )
   @Export("x")
   int x;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 2099407363
   )
   @Export("y")
   int y;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lz;"
   )
   class15 field239;
   @ObfuscatedName("e")
   LinkedList field1052;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -120515153
   )
   int field1053;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 415972873
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("k")
   @Export("iconsList")
   List iconsList;
   @ObfuscatedName("n")
   @Export("iconsMap")
   HashMap iconsMap;
   @ObfuscatedName("i")
   @Export("fonts")
   final HashMap fonts;

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.x = var1;
      this.y = var2;
      this.field1052 = new LinkedList();
      this.iconsList = new LinkedList();
      this.iconsMap = new HashMap();
      this.field1053 = var3 | -16777216;
      this.fonts = var4;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-87"
   )
   void method404(int var1, int var2, int var3) {
      Sprite var4 = class13.method164(this.x, this.y, this.pixelsPerTile);
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.method319(var1, var2, var3, var3);
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lz;Ljava/util/List;I)V",
      garbageValue = "1704588050"
   )
   void method447(class15 var1, List var2) {
      this.iconsMap.clear();
      this.field239 = var1;
      this.method407(var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;B)V",
      garbageValue = "-47"
   )
   void method405(HashSet var1, List var2) {
      this.iconsMap.clear();
      Iterator var3 = var1.iterator();

      while (var3.hasNext()) {
         class39 var4 = (class39)var3.next();
         if (var4.method256() == this.x && var4.method264() == this.y) {
            this.field1052.add(var4);
         }
      }

      this.method407(var2);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIILb;B)V",
      garbageValue = "115"
   )
   void method449(int var1, int var2, int var3, int var4, class21 var5) {
      this.iconsMap.clear();

      for (int var6 = var1; var6 < var3 + var1; ++var6) {
         label66:
         for (int var7 = var2; var7 < var2 + var4; ++var7) {
            for (int var8 = 0; var8 < var5.field156; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for (int var11 = 0; var11 < var10.length; ++var11) {
                     ObjectDefinition var12;
                     boolean var13;
                     label57: {
                        WorldMapDecoration var14 = var10[var11];
                        var12 = class50.getObjectDefinition(var14.objectDefinitionId);
                        if (var12.transforms != null) {
                           int[] var15 = var12.transforms;

                           for (int var16 = 0; var16 < var15.length; ++var16) {
                              int var17 = var15[var16];
                              ObjectDefinition var18 = class50.getObjectDefinition(var17);
                              if (var18.mapIconId != -1) {
                                 var13 = true;
                                 break label57;
                              }
                           }
                        } else if (var12.mapIconId != -1) {
                           var13 = true;
                           break label57;
                        }

                        var13 = false;
                     }

                     if (var13) {
                        this.method479(var12, var8, var6, var7, var5);
                        continue label66;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljr;IIILb;I)V",
      garbageValue = "-896662600"
   )
   void method479(ObjectDefinition var1, int var2, int var3, int var4, class21 var5) {
      Coord var6 = new Coord(var2, var3 + this.x * 64, this.y * 64 + var4);
      Coord var7 = null;
      if (this.field239 != null) {
         var7 = new Coord(this.field239.field148 + var2, var3 + this.field239.field149 * 64, var4 + this.field239.field146 * 64);
      } else {
         class39 var8 = (class39)var5;
         var7 = new Coord(var2 + var8.field148, var3 + var8.field149 * 64 + var8.method717() * 8, var4 + var8.field146 * 64 + var8.method718() * 8);
      }

      Object var10;
      if (var1.transforms != null) {
         var10 = new WorldMapIcon2(var7, var6, var1.id, this);
      } else {
         WorldMapElement var9 = ViewportMouse.getWorldMapElement(var1.mapIconId);
         var10 = new WorldMapIcon1(var7, var6, var9.field1020, this.createMapLabel(var9));
      }

      this.iconsMap.put(new Coord(0, var3, var4), var10);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   void method406() {
      Iterator var1 = this.iconsMap.values().iterator();

      while (var1.hasNext()) {
         AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
         if (var2 instanceof WorldMapIcon2) {
            ((WorldMapIcon2)var2).method399();
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;I)V",
      garbageValue = "128876606"
   )
   void method407(List var1) {
      Iterator var2 = var1.iterator();

      while (var2.hasNext()) {
         WorldMapIcon1 var3 = (WorldMapIcon1)var2.next();
         if (var3.coord2.x >> 6 == this.x && var3.coord2.y >> 6 == this.y) {
            WorldMapIcon1 var4 = new WorldMapIcon1(var3.coord2, var3.coord2, var3.element, this.method419(var3.element));
            this.iconsList.add(var4);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1543354181"
   )
   void method408() {
      if (this.field239 != null) {
         this.field239.method282();
      } else {
         Iterator var1 = this.field1052.iterator();

         while (var1.hasNext()) {
            class39 var2 = (class39)var1.next();
            var2.method282();
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lir;B)Z",
      garbageValue = "2"
   )
   boolean method409(AbstractArchive var1) {
      if (this.field239 != null) {
         this.field239.method263(var1);
         if (this.field239.method271()) {
            this.method449(0, 0, 64, 64, this.field239);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class39 var4;
         for (var3 = this.field1052.iterator(); var3.hasNext(); var2 &= var4.method271()) {
            var4 = (class39)var3.next();
            var4.method263(var1);
         }

         if (var2) {
            var3 = this.field1052.iterator();

            while (var3.hasNext()) {
               var4 = (class39)var3.next();
               this.method449(var4.method719() * 8, var4.method720() * 8, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(ILad;[Llq;Lir;Lir;I)V",
      garbageValue = "518389076"
   )
   void method455(int var1, class40 var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if ((this.field239 != null || !this.field1052.isEmpty()) && class13.method164(this.x, this.y, var1) == null) {
         boolean var6 = true;
         var6 &= this.method409(var4);
         int var7;
         if (this.field239 != null) {
            var7 = this.field239.field150;
         } else {
            var7 = ((class21)this.field1052.getFirst()).field150;
         }

         var6 &= var5.tryLoadGroup(var7);
         if (var6) {
            byte[] var8 = var5.takeFileFlat(var7);
            class27 var9 = SecureRandomCallable.method1145(var8);
            Sprite var10 = new Sprite(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
            var10.setRaster();
            if (this.field239 != null) {
               this.method546(var2, var3, var9);
            } else {
               this.method459(var2, var3, var9);
            }

            int var11 = this.x;
            int var12 = this.y;
            int var13 = this.pixelsPerTile;
            field1051.put(var10, MouseHandler.method1083(var11, var12, var13), var10.pixels.length * 4);
            this.method408();
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "893970699"
   )
   void method410(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "-70"
   )
   void method411(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconsMap.values().iterator();

      while (var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.method19()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = ViewportMouse.getWorldMapElement(var6);
               this.method414(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method413(var1, var2, var3);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Lad;[Llq;Laq;B)V",
      garbageValue = "-1"
   )
   void method546(class40 var1, IndexedSprite[] var2, class27 var3) {
      int var4;
      int var5;
      for (var4 = 0; var4 < 64; ++var4) {
         for (var5 = 0; var5 < 64; ++var5) {
            this.method461(var4, var5, this.field239, var1, var3);
            this.method462(var4, var5, this.field239, var1);
         }
      }

      for (var4 = 0; var4 < 64; ++var4) {
         for (var5 = 0; var5 < 64; ++var5) {
            this.method460(var4, var5, this.field239, var1, var2);
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lad;[Llq;Laq;I)V",
      garbageValue = "752069098"
   )
   void method459(class40 var1, IndexedSprite[] var2, class27 var3) {
      Iterator var4 = this.field1052.iterator();

      class39 var5;
      int var6;
      int var7;
      while (var4.hasNext()) {
         var5 = (class39)var4.next();

         for (var6 = var5.method719() * 8; var6 < var5.method719() * 8 + 8; ++var6) {
            for (var7 = var5.method720() * 8; var7 < var5.method720() * 8 + 8; ++var7) {
               this.method461(var6, var7, var5, var1, var3);
               this.method462(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field1052.iterator();

      while (var4.hasNext()) {
         var5 = (class39)var4.next();

         for (var6 = var5.method719() * 8; var6 < var5.method719() * 8 + 8; ++var6) {
            for (var7 = var5.method720() * 8; var7 < var5.method720() * 8 + 8; ++var7) {
               this.method460(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IILb;Lad;[Llq;I)V",
      garbageValue = "1304772019"
   )
   void method460(int var1, int var2, class21 var3, class40 var4, IndexedSprite[] var5) {
      this.method465(var1, var2, var3);
      this.method464(var1, var2, var3, var5);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IILb;Lad;Laq;I)V",
      garbageValue = "1006396037"
   )
   void method461(int var1, int var2, class21 var3, class40 var4, class27 var5) {
      int var6 = var3.field151[0][var1][var2] - 1;
      int var7 = var3.field145[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.field1053);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = this.field1053;
         FloorOverlayDefinition var11 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7);
         FloorOverlayDefinition var12;
         if (var11 != null) {
            var12 = var11;
         } else {
            byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7);
            var11 = new FloorOverlayDefinition();
            if (var13 != null) {
               var11.decode(new Buffer(var13), var7);
            }

            var11.postDecode();
            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var11, (long)var7);
            var12 = var11;
         }

         if (var12 == null) {
            var9 = var10;
         } else if (var12.rgb2 >= 0) {
            var9 = var12.rgb2 | -16777216;
         } else {
            int var20;
            if (var12.texture >= 0) {
               var20 = WorldMapArea.method427(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var12.texture), 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var20] | -16777216;
            } else if (var12.rgb == 16711935) {
               var9 = var10;
            } else {
               var20 = var12.hue;
               int var14 = var12.saturation;
               int var15 = var12.lightness;
               if (var15 > 179) {
                  var14 /= 2;
               }

               if (var15 > 192) {
                  var14 /= 2;
               }

               if (var15 > 217) {
                  var14 /= 2;
               }

               if (var15 > 243) {
                  var14 /= 2;
               }

               int var16 = (var14 / 32 << 7) + var15 / 2 + (var20 / 4 << 10);
               byte var17 = 96;
               int var18;
               if (var16 == -2) {
                  var18 = 12345678;
               } else {
                  int var19;
                  if (var16 == -1) {
                     if (var17 < 0) {
                        var17 = 0;
                     } else if (var17 > 127) {
                        var17 = 127;
                     }

                     var19 = 127 - var17;
                     var18 = var19;
                  } else {
                     var19 = var17 * (var16 & 127) / 128;
                     if (var19 < 2) {
                        var19 = 2;
                     } else if (var19 > 126) {
                        var19 = 126;
                     }

                     var18 = var19 + (var16 & 65408);
                  }
               }

               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field154[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method541(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method743(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field154[0][var1][var2], var3.field155[0][var1][var2]);
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILb;Lad;B)V",
      garbageValue = "9"
   )
   void method462(int var1, int var2, class21 var3, class40 var4) {
      for (int var5 = 1; var5 < var3.field156; ++var5) {
         int var6 = var3.field145[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = this.field1053;
            FloorOverlayDefinition var8 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6);
            FloorOverlayDefinition var9;
            if (var8 != null) {
               var9 = var8;
            } else {
               byte[] var10 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6);
               var8 = new FloorOverlayDefinition();
               if (var10 != null) {
                  var8.decode(new Buffer(var10), var6);
               }

               var8.postDecode();
               FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var8, (long)var6);
               var9 = var8;
            }

            int var18;
            if (var9 == null) {
               var18 = var7;
            } else if (var9.rgb2 >= 0) {
               var18 = var9.rgb2 | -16777216;
            } else {
               int var11;
               if (var9.texture >= 0) {
                  var11 = WorldMapArea.method427(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
                  var18 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216;
               } else if (var9.rgb == 16711935) {
                  var18 = var7;
               } else {
                  var11 = var9.hue;
                  int var12 = var9.saturation;
                  int var13 = var9.lightness;
                  if (var13 > 179) {
                     var12 /= 2;
                  }

                  if (var13 > 192) {
                     var12 /= 2;
                  }

                  if (var13 > 217) {
                     var12 /= 2;
                  }

                  if (var13 > 243) {
                     var12 /= 2;
                  }

                  int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
                  byte var15 = 96;
                  int var16;
                  if (var14 == -2) {
                     var16 = 12345678;
                  } else {
                     int var17;
                     if (var14 == -1) {
                        if (var15 < 0) {
                           var15 = 0;
                        } else if (var15 > 127) {
                           var15 = 127;
                        }

                        var17 = 127 - var15;
                        var16 = var17;
                     } else {
                        var17 = var15 * (var14 & 127) / 128;
                        if (var17 < 2) {
                           var17 = 2;
                        } else if (var17 > 126) {
                           var17 = 126;
                        }

                        var16 = var17 + (var14 & 65408);
                     }
                  }

                  var18 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216;
               }
            }

            if (var3.field154[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var18);
            } else {
               var4.method743(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var18, this.pixelsPerTile, this.pixelsPerTile, var3.field154[var5][var1][var2], var3.field155[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IILb;Laq;I)I",
      garbageValue = "1908333009"
   )
   int method541(int var1, int var2, class21 var3, class27 var4) {
      return var3.field151[0][var1][var2] == 0 ? this.field1053 : var4.method430(var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IILb;[Llq;S)V",
      garbageValue = "-26219"
   )
   void method464(int var1, int var2, class21 var3, IndexedSprite[] var4) {
      for (int var5 = 0; var5 < var3.field156; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for (int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               if (WorldMapAreaData.method711(var9.decoration) || class1.method19(var9.decoration)) {
                  ObjectDefinition var10 = class50.getObjectDefinition(var9.objectDefinitionId);
                  if (var10.mapSceneId != -1) {
                     if (var10.mapSceneId != 46 && var10.mapSceneId != 52) {
                        var4[var10.mapSceneId].method135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                     } else {
                        var4[var10.mapSceneId].method135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IILb;B)V",
      garbageValue = "-31"
   )
   void method465(int var1, int var2, class21 var3) {
      for (int var4 = 0; var4 < var3.field156; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for (int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               int var9 = var8.decoration;
               boolean var10 = var9 >= WorldMapDecorationType.field2805.id && var9 <= WorldMapDecorationType.field2804.id || var9 == WorldMapDecorationType.field2806.id;
               if (var10) {
                  ObjectDefinition var11 = class50.getObjectDefinition(var8.objectDefinitionId);
                  int var12 = var11.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field2805.id) {
                     this.method422(var1, var2, var8.rotation, var12);
                  }

                  if (var8.decoration == WorldMapDecorationType.field2813.id) {
                     this.method422(var1, var2, var8.rotation, -3355444);
                     this.method422(var1, var2, var8.rotation + 1, var12);
                  }

                  if (var8.decoration == WorldMapDecorationType.field2804.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field2806.id) {
                     int var13 = var8.rotation % 2;
                     int var14;
                     if (var13 == 0) {
                        for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
                        }
                     } else {
                        for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "0"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.iconsMap.entrySet().iterator();

      while (var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)((float)var1 + var5 * (float)var9.x - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.method19()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = ViewportMouse.getWorldMapElement(var12.getElement());
            if (!var3.contains(var13.method390())) {
               this.method415(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "781854370"
   )
   void method413(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconsList.iterator();

      while (var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.method19()) {
            WorldMapElement var6 = ViewportMouse.getWorldMapElement(var5.getElement());
            if (var6 != null && var1.contains(var6.method390())) {
               this.method414(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Lic;IIIIB)V",
      garbageValue = "92"
   )
   void method414(WorldMapElement var1, int x, int y, int var4, int var5) {
      Sprite var6 = var1.getSprite(false);
      if (var6 != null) {
         var6.drawAt2(x - var6.subWidth / 2, y - var6.subHeight / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(x, y, 15, 16776960, 128);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(x, y, 7, 16777215, 256);
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Lak;IIFI)V",
      garbageValue = "-1283733783"
   )
   void method415(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = ViewportMouse.getWorldMapElement(var1.getElement());
      this.method416(var5, var2, var3);
      this.method417(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lic;III)V",
      garbageValue = "423173487"
   )
   void method416(WorldMapElement var1, int var2, int var3) {
      Sprite var4 = var1.getSprite(false);
      if (var4 != null) {
         int var5 = this.method473(var4, var1.horizontalAlignment);
         int var6 = this.method474(var4, var1.verticalAlignment);
         var4.drawAt2(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Lak;Lic;IIFI)V",
      garbageValue = "-1237576843"
   )
   void method417(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null && var6.size.method400(var5)) {
         Font var7 = (Font)this.fonts.get(var6.size);
         var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1022, 0, 1, 0, var7.ascent / 2);
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-17"
   )
   @Export("drawMapLinks")
   void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.iconsList.iterator();

      while (var6.hasNext()) {
         AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
         if (var7.method19()) {
            int var8 = var7.coord2.x % 64;
            int var9 = var7.coord2.y % 64;
            var7.screenX = (int)((float)var8 * var5 + (float)var1);
            var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
            if (!var3.contains(var7.getElement())) {
               this.method415(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Lln;Lju;I)I",
      garbageValue = "1945325707"
   )
   int method473(Sprite var1, HorizontalAlignment var2) {
      switch(var2.value) {
      case 0:
         return -var1.subWidth / 2;
      case 2:
         return 0;
      default:
         return -var1.subWidth;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lln;Lip;I)I",
      garbageValue = "1788772278"
   )
   int method474(Sprite var1, VerticalAlignment var2) {
      switch(var2.value) {
      case 0:
         return 0;
      case 1:
         return -var1.subHeight / 2;
      default:
         return -var1.subHeight;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)Laj;",
      garbageValue = "598030754"
   )
   WorldMapLabel method419(int var1) {
      WorldMapElement var2 = ViewportMouse.getWorldMapElement(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Lic;B)Laj;",
      garbageValue = "59"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         WorldMapLabelSize var2 = WorldMapLabelSize.valueOf(var1.textSize);
         if (var2 == null) {
            return null;
         } else {
            Font var3 = (Font)this.fonts.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.lineCount(var1.name, 1000000);
               String[] var5 = new String[var4];
               var3.breakLines(var1.name, (int[])null, var5);
               int var6 = var5.length * var3.ascent / 2;
               int var7 = 0;
               String[] var8 = var5;

               for (int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.stringWidth(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new WorldMapLabel(var1.name, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "-1237576843"
   )
   List method421(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.iconsMap.values().iterator();

            AbstractWorldMapIcon var8;
            while (var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.method19() && var8.method18(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.iconsList.iterator();

            while (var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.method19() && var8.method18(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Ljava/util/List;",
      garbageValue = "722163590"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.iconsList);
      var1.addAll(this.iconsMap.values());
      return var1;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1516512827"
   )
   void method422(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 1) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 2) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1836178572"
   )
   public static int method568(int var0) {
      return var0 >> 17 & 7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "1877870965"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(Lho;IIS)V",
      garbageValue = "597"
   )
   // Click minimap?
   static final void method567(Widget var0, int var1, int var2) {
      if ((Client.minimapState == 0 || Client.minimapState == 3) && !Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !AbstractRasterProvider.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
         SpriteMask var3 = var0.getSpriteMask(true);
         if (var3 == null) {
            return;
         }

         int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
         int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
         if (var3.contains(var4, var5)) {
            var4 -= var3.width / 2;
            var5 -= var3.height / 2;
            int var6 = Client.camAngleY & 2047;
            int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
            int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
            int var9 = var4 * var8 + var7 * var5 >> 11;
            int var10 = var5 * var8 - var4 * var7 >> 11;
            int var11 = var9 + Canvas.localPlayer.x >> 7;
            int var12 = Canvas.localPlayer.y - var10 >> 7;
            PacketBufferNode var13 = Interpreter.method1915(ClientPacket.field274, Client.packetWriter.isaacCipher);
            var13.packetBuffer.writeByte(18);
            var13.packetBuffer.method63(var12 + GraphicsObject.baseY);
            var13.packetBuffer.method63(var11 + class50.baseX);
            var13.packetBuffer.method55(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
            var13.packetBuffer.writeByte(var4);
            var13.packetBuffer.writeByte(var5);
            var13.packetBuffer.writeShort(Client.camAngleY);
            var13.packetBuffer.writeByte(57);
            var13.packetBuffer.writeByte(0);
            var13.packetBuffer.writeByte(0);
            var13.packetBuffer.writeByte(89);
            var13.packetBuffer.writeShort(Canvas.localPlayer.x);
            var13.packetBuffer.writeShort(Canvas.localPlayer.y);
            var13.packetBuffer.writeByte(63);
            Client.packetWriter.method241(var13);
            Client.destinationX = var11;
            Client.destinationY = var12;
         }
      }

   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "([Lho;IIIZS)V",
      garbageValue = "3640"
   )
   @Export("notRevalidateWidgetScroll")
   static void notRevalidateWidgetScroll(Widget[] var0, int var1, int var2, int var3, boolean var4) {
      for (int var5 = 0; var5 < var0.length; ++var5) {
         Widget var6 = var0[var5];
         if (var6 != null && var6.parentId == var1) {
            WorldMapSection1.alignWidgetSize(var6, var2, var3, var4);
            FloorOverlayDefinition.alignWidgetPosition(var6, var2, var3);
            if (var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if (var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if (var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if (var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if (var6.type == 0) {
               class39.revalidateWidgetScroll(var0, var6, var4);
            }
         }
      }

   }

   static {
      field1051 = new DemotingHashTable(37748736, 256);
   }
}
