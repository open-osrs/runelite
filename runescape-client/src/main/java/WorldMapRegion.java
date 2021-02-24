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

@ObfuscatedName("as")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   @Export("WorldMapRegion_cachedSprites")
   static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1299522103
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 861898053
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lo;"
   )
   @Export("worldMapData_0")
   WorldMapData_0 worldMapData_0;
   @ObfuscatedName("q")
   @Export("worldMapData1List")
   LinkedList worldMapData1List;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -360836645
   )
   @Export("backgroundColor")
   int backgroundColor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1984621095
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("b")
   @Export("icon0List")
   List icon0List;
   @ObfuscatedName("a")
   @Export("iconMap")
   HashMap iconMap;
   @ObfuscatedName("w")
   @Export("fonts")
   final HashMap fonts;

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.regionX = var1;
      this.regionY = var2;
      this.worldMapData1List = new LinkedList();
      this.icon0List = new LinkedList();
      this.iconMap = new HashMap();
      this.backgroundColor = var3 | -16777216;
      this.fonts = var4;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "46"
   )
   void method506(int var1, int var2, int var3) {
      SpritePixels var4 = LoginPacket.method3816(this.regionX, this.regionY, this.pixelsPerTile);
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lo;Ljava/util/List;I)V",
      garbageValue = "1448874199"
   )
   @Export("initWorldMapData0")
   void initWorldMapData0(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "-905581142"
   )
   @Export("initWorldMapData1")
   void initWorldMapData1(HashSet var1, List var2) {
      this.iconMap.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         WorldMapData_1 var4 = (WorldMapData_1)var3.next();
         if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
            this.worldMapData1List.add(var4);
         }
      }

      this.addAllToIconList(var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIIILac;I)V",
      garbageValue = "-747714746"
   )
   @Export("getIconsForTiles")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label50:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.planes; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = WorldMapAreaData.getObjectDefinition(var12.objectDefinitionId);
                     if (MidiPcmStream.method4031(var13)) {
                        this.getIcon(var13, var8, var6, var7, var5);
                        continue label50;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljg;IIILac;S)V",
      garbageValue = "-25437"
   )
   @Export("getIcon")
   void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
      Coord var7 = null;
      if (this.worldMapData_0 != null) {
         var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64);
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
      }

      WorldMapElement var9;
      Object var10;
      if (var1.transforms != null) {
         var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
      } else {
         var9 = InvDefinition.WorldMapElement_get(var1.mapIconId);
         var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
      }

      var9 = InvDefinition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
      if (var9.field3250) {
         this.iconMap.put(new Coord(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1523999708"
   )
   @Export("initWorldMapIcon1s")
   void initWorldMapIcon1s() {
      Iterator var1 = this.iconMap.values().iterator();

      while(var1.hasNext()) {
         AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
         if (var2 instanceof WorldMapIcon_1) {
            ((WorldMapIcon_1)var2).init();
         }
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/List;I)V",
      garbageValue = "614836611"
   )
   @Export("addAllToIconList")
   void addAllToIconList(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
         if (InvDefinition.WorldMapElement_get(var3.element).field3250 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method535(var3.element));
            this.icon0List.add(var4);
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1548540670"
   )
   void method513() {
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.reset();
      } else {
         Iterator var1 = this.worldMapData1List.iterator();

         while(var1.hasNext()) {
            WorldMapData_1 var2 = (WorldMapData_1)var1.next();
            var2.reset();
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lig;I)Z",
      garbageValue = "130952485"
   )
   @Export("loadGeography")
   boolean loadGeography(AbstractArchive var1) {
      this.iconMap.clear();
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.loadGeography(var1);
         if (this.worldMapData_0.isFullyLoaded()) {
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         WorldMapData_1 var4;
         for(var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
            var4 = (WorldMapData_1)var3.next();
            var4.loadGeography(var1);
         }

         if (var2) {
            var3 = this.worldMapData1List.iterator();

            while(var3.hasNext()) {
               var4 = (WorldMapData_1)var3.next();
               this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(ILaf;[Lly;Lig;Lig;I)V",
      garbageValue = "-1610882473"
   )
   @Export("drawTile")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
         if (LoginPacket.method3816(this.regionX, this.regionY, var1) == null) {
            boolean var6 = true;
            var6 &= this.loadGeography(var4);
            int var8;
            if (this.worldMapData_0 != null) {
               var8 = this.worldMapData_0.groupId;
            } else {
               var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
            }

            var6 &= var5.tryLoadGroup(var8);
            if (var6) {
               byte[] var7 = var5.takeFileFlat(var8);
               WorldMapSprite var9;
               if (var7 == null) {
                  var9 = new WorldMapSprite();
               } else {
                  var9 = new WorldMapSprite(WorldMapRectangle.convertJpgToSprite(var7).pixels);
               }

               SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var11.setRaster();
               if (this.worldMapData_0 != null) {
                  this.method617(var2, var3, var9);
               } else {
                  this.method519(var2, var3, var9);
               }

               GrandExchangeOfferNameComparator.method211(var11, this.regionX, this.regionY, this.pixelsPerTile);
               this.method513();
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;B)V",
      garbageValue = "-78"
   )
   void method516(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "14"
   )
   @Export("flashElements")
   void flashElements(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconMap.values().iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = InvDefinition.WorldMapElement_get(var6);
               this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method527(var1, var2, var3);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Laf;[Lly;Lal;B)V",
      garbageValue = "-124"
   )
   void method617(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
            this.method611(var4, var5, this.worldMapData_0, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method590(var4, var5, this.worldMapData_0, var1, var2);
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Laf;[Lly;Lal;I)V",
      garbageValue = "-1042910211"
   )
   void method519(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      Iterator var4 = this.worldMapData1List.iterator();

      WorldMapData_1 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.drawTileGround(var6, var7, var5, var1, var3);
               this.method611(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.worldMapData1List.iterator();

      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.method590(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IILac;Laf;[Lly;I)V",
      garbageValue = "-1638899903"
   )
   void method590(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method631(var1, var2, var3);
      this.method555(var1, var2, var3, var5);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IILac;Laf;Lal;I)V",
      garbageValue = "-2002564713"
   )
   @Export("drawTileGround")
   void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = this.backgroundColor;
         FloorOverlayDefinition var11 = WallDecoration.method3449(var7);
         if (var11 == null) {
            var9 = var10;
         } else if (var11.secondaryRgb >= 0) {
            var9 = var11.secondaryRgb | -16777216;
         } else {
            int var13;
            int var20;
            if (var11.texture >= 0) {
               var13 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture);
               byte var14 = 96;
               int var12;
               if (var13 == -2) {
                  var12 = 12345678;
               } else if (var13 == -1) {
                  if (var14 < 0) {
                     var14 = 0;
                  } else if (var14 > 127) {
                     var14 = 127;
                  }

                  var20 = 127 - var14;
                  var12 = var20;
               } else {
                  var20 = var14 * (var13 & 127) / 128;
                  if (var20 < 2) {
                     var20 = 2;
                  } else if (var20 > 126) {
                     var20 = 126;
                  }

                  var12 = var20 + (var13 & 'ﾀ');
               }

               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
            } else if (var11.primaryRgb == 16711935) {
               var9 = var10;
            } else {
               var13 = var11.hue;
               var20 = var11.saturation;
               int var15 = var11.lightness;
               if (var15 > 179) {
                  var20 /= 2;
               }

               if (var15 > 192) {
                  var20 /= 2;
               }

               if (var15 > 217) {
                  var20 /= 2;
               }

               if (var15 > 243) {
                  var20 /= 2;
               }

               int var16 = (var20 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
               byte var18 = 96;
               int var17;
               if (var16 == -2) {
                  var17 = 12345678;
               } else {
                  int var21;
                  if (var16 == -1) {
                     if (var18 < 0) {
                        var18 = 0;
                     } else if (var18 > 127) {
                        var18 = 127;
                     }

                     var21 = 127 - var18;
                     var17 = var21;
                  } else {
                     var21 = var18 * (var16 & 127) / 128;
                     if (var21 < 2) {
                        var21 = 2;
                     } else if (var21 > 126) {
                        var21 = 126;
                     }

                     var17 = var21 + (var16 & 'ﾀ');
                  }
               }

               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field193[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method525(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method813(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field193[0][var1][var2], var3.field204[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IILac;Laf;I)V",
      garbageValue = "-1963666509"
   )
   void method611(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      for(int var5 = 1; var5 < var3.planes; ++var5) {
         int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = this.backgroundColor;
            FloorOverlayDefinition var9 = WallDecoration.method3449(var6);
            int var7;
            if (var9 == null) {
               var7 = var8;
            } else if (var9.secondaryRgb >= 0) {
               var7 = var9.secondaryRgb | -16777216;
            } else {
               int var11;
               int var19;
               if (var9.texture >= 0) {
                  var11 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture);
                  byte var12 = 96;
                  int var10;
                  if (var11 == -2) {
                     var10 = 12345678;
                  } else if (var11 == -1) {
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 127) {
                        var12 = 127;
                     }

                     var19 = 127 - var12;
                     var10 = var19;
                  } else {
                     var19 = var12 * (var11 & 127) / 128;
                     if (var19 < 2) {
                        var19 = 2;
                     } else if (var19 > 126) {
                        var19 = 126;
                     }

                     var10 = var19 + (var11 & 'ﾀ');
                  }

                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
               } else if (var9.primaryRgb == 16711935) {
                  var7 = var8;
               } else {
                  var11 = var9.hue;
                  var19 = var9.saturation;
                  int var13 = var9.lightness;
                  if (var13 > 179) {
                     var19 /= 2;
                  }

                  if (var13 > 192) {
                     var19 /= 2;
                  }

                  if (var13 > 217) {
                     var19 /= 2;
                  }

                  if (var13 > 243) {
                     var19 /= 2;
                  }

                  int var14 = (var19 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
                  byte var16 = 96;
                  int var15;
                  if (var14 == -2) {
                     var15 = 12345678;
                  } else {
                     int var20;
                     if (var14 == -1) {
                        if (var16 < 0) {
                           var16 = 0;
                        } else if (var16 > 127) {
                           var16 = 127;
                        }

                        var20 = 127 - var16;
                        var15 = var20;
                     } else {
                        var20 = var16 * (var14 & 127) / 128;
                        if (var20 < 2) {
                           var20 = 2;
                        } else if (var20 > 126) {
                           var20 = 126;
                        }

                        var15 = var20 + (var14 & 'ﾀ');
                     }
                  }

                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
               }
            }

            if (var3.field193[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method813(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field193[var5][var1][var2], var3.field204[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IILac;Lal;I)I",
      garbageValue = "-306988149"
   )
   int method525(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IILac;[Lly;B)V",
      garbageValue = "54"
   )
   void method555(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.planes; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration;
               boolean var10 = var11 >= WorldMapDecorationType.field2747.id && var11 <= WorldMapDecorationType.field2753.id;
               if (!var10) {
                  int var13 = var9.decoration;
                  boolean var12 = var13 == WorldMapDecorationType.field2759.id;
                  if (!var12) {
                     continue;
                  }
               }

               ObjectComposition var14 = WorldMapAreaData.getObjectDefinition(var9.objectDefinitionId);
               if (var14.mapSceneId != -1) {
                  if (var14.mapSceneId != 46 && var14.mapSceneId != 52) {
                     var4[var14.mapSceneId].method6302(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                  } else {
                     var4[var14.mapSceneId].method6302(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IILac;B)V",
      garbageValue = "-12"
   )
   void method631(int var1, int var2, AbstractWorldMapData var3) {
      for(int var4 = 0; var4 < var3.planes; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               if (GraphicsObject.method2153(var8.decoration)) {
                  ObjectComposition var9 = WorldMapAreaData.getObjectDefinition(var8.objectDefinitionId);
                  int var10 = var9.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field2765.id) {
                     this.method539(var1, var2, var8.rotation, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field2749.id) {
                     this.method539(var1, var2, var8.rotation, -3355444);
                     this.method539(var1, var2, var8.rotation + 1, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field2750.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field2760.id) {
                     int var11 = var8.rotation % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;IB)V",
      garbageValue = "1"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.iconMap.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)((float)var1 + var5 * (float)var9.x - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.hasValidElement()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = InvDefinition.WorldMapElement_get(var12.getElement());
            if (!var3.contains(var13.getObjectId())) {
               this.method520(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "31"
   )
   void method527(HashSet var1, int var2, int var3) {
      Iterator var4 = this.icon0List.iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            WorldMapElement var6 = InvDefinition.WorldMapElement_get(var5.getElement());
            if (var6 != null && var1.contains(var6.getObjectId())) {
               this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lic;IIIII)V",
      garbageValue = "-515640206"
   )
   @Export("drawBackgroundCircle")
   void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.getSpriteBool(false);
      if (var6 != null) {
         var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Laj;IIFI)V",
      garbageValue = "1091480533"
   )
   void method520(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = InvDefinition.WorldMapElement_get(var1.getElement());
      this.method530(var5, var2, var3);
      this.method601(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lic;IIS)V",
      garbageValue = "-21879"
   )
   void method530(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.getSpriteBool(false);
      if (var4 != null) {
         int var5 = this.method577(var4, var1.horizontalAlignment);
         int var6 = this.method534(var4, var1.verticalAlignment);
         var4.drawTransBgAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Laj;Lic;IIFI)V",
      garbageValue = "-1852361850"
   )
   void method601(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null) {
         if (var6.size.method255(var5)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field3245, 0, 1, 0, var7.ascent / 2);
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "281744270"
   )
   @Export("drawMapLinks")
   void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.icon0List.iterator();

      while(var6.hasNext()) {
         AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
         if (var7.hasValidElement()) {
            int var8 = var7.coord2.x % 64;
            int var9 = var7.coord2.y % 64;
            var7.screenX = (int)((float)var1 + (float)var8 * var5);
            var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
            if (!var3.contains(var7.getElement())) {
               this.method520(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Llm;Lje;I)I",
      garbageValue = "1212230502"
   )
   int method577(SpritePixels var1, HorizontalAlignment var2) {
      switch(var2.value) {
      case 0:
         return 0;
      case 2:
         return -var1.subWidth / 2;
      default:
         return -var1.subWidth;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Llm;Lie;I)I",
      garbageValue = "1365602769"
   )
   int method534(SpritePixels var1, VerticalAlignment var2) {
      switch(var2.value) {
      case 0:
         return 0;
      case 2:
         return -var1.subHeight / 2;
      default:
         return -var1.subHeight;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Laa;",
      garbageValue = "-1773755795"
   )
   WorldMapLabel method535(int var1) {
      WorldMapElement var2 = InvDefinition.WorldMapElement_get(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lic;B)Laa;",
      garbageValue = "-89"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         WorldMapLabelSize var2 = WorldMapLabelSize.method266(var1.textSize);
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

               for(int var9 = 0; var9 < var8.length; ++var9) {
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)Ljava/util/List;",
      garbageValue = "123"
   )
   List method537(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.iconMap.values().iterator();

            AbstractWorldMapIcon var8;
            while(var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.icon0List.iterator();

            while(var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/List;",
      garbageValue = "-1276264710"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "1"
   )
   void method539(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 1) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 2) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(S)[Lgb;",
      garbageValue = "16256"
   )
   @Export("ServerPacket_values")
   public static ServerPacket[] ServerPacket_values() {
      return new ServerPacket[]{ServerPacket.field2172, ServerPacket.field2205, ServerPacket.field2143, ServerPacket.field2144, ServerPacket.field2153, ServerPacket.field2146, ServerPacket.field2147, ServerPacket.field2210, ServerPacket.field2149, ServerPacket.field2195, ServerPacket.field2151, ServerPacket.field2141, ServerPacket.field2198, ServerPacket.field2154, ServerPacket.field2155, ServerPacket.field2156, ServerPacket.field2157, ServerPacket.field2158, ServerPacket.field2159, ServerPacket.field2160, ServerPacket.field2161, ServerPacket.field2207, ServerPacket.field2163, ServerPacket.field2152, ServerPacket.field2165, ServerPacket.field2166, ServerPacket.field2145, ServerPacket.field2184, ServerPacket.field2169, ServerPacket.field2170, ServerPacket.field2188, ServerPacket.field2164, ServerPacket.field2173, ServerPacket.field2174, ServerPacket.field2175, ServerPacket.field2176, ServerPacket.field2177, ServerPacket.field2178, ServerPacket.field2168, ServerPacket.field2171, ServerPacket.field2181, ServerPacket.field2182, ServerPacket.field2183, ServerPacket.field2203, ServerPacket.field2185, ServerPacket.field2150, ServerPacket.field2224, ServerPacket.field2221, ServerPacket.field2189, ServerPacket.field2190, ServerPacket.field2216, ServerPacket.field2186, ServerPacket.field2193, ServerPacket.field2194, ServerPacket.field2202, ServerPacket.field2196, ServerPacket.field2197, ServerPacket.field2191, ServerPacket.field2199, ServerPacket.field2200, ServerPacket.field2206, ServerPacket.field2192, ServerPacket.field2220, ServerPacket.field2204, ServerPacket.field2226, ServerPacket.field2167, ServerPacket.field2215, ServerPacket.field2208, ServerPacket.field2209, ServerPacket.field2179, ServerPacket.field2211, ServerPacket.field2212, ServerPacket.field2213, ServerPacket.field2214, ServerPacket.field2142, ServerPacket.field2148, ServerPacket.field2217, ServerPacket.field2218, ServerPacket.field2219, ServerPacket.field2187, ServerPacket.field2201, ServerPacket.field2180, ServerPacket.field2223, ServerPacket.field2162, ServerPacket.field2225, ServerPacket.field2222};
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)Ljava/lang/String;",
      garbageValue = "216758500"
   )
   static String method642(Buffer var0, int var1) {
      try {
         int var2 = var0.readUShortSmart();
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class219.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
         String var4 = VertexNormal.decodeStringCp1252(var3, 0, var2);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lhz;IIII)V",
      garbageValue = "-1454373131"
   )
   @Export("Widget_setKeyRate")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
      if (var0.field2686 == null) {
         throw new RuntimeException();
      } else {
         var0.field2686[var1] = var2;
         var0.field2599[var1] = var3;
      }
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "556014304"
   )
   @Export("getTileHeight")
   static final int getTileHeight(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
         int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
         return var7 * var9 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
