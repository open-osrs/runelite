import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("Scene")
public class Scene {
   @ObfuscatedName("m")
   @Export("Scene_isLowDetail")
   public static boolean Scene_isLowDetail;
   @ObfuscatedName("a")
   @Export("tileUpdateCount")
   static int tileUpdateCount;
   @ObfuscatedName("z")
   @Export("Scene_plane")
   static int Scene_plane;
   @ObfuscatedName("j")
   @Export("Scene_drawnCount")
   static int Scene_drawnCount;
   @ObfuscatedName("s")
   @Export("Scene_cameraXTileMin")
   static int Scene_cameraXTileMin;
   @ObfuscatedName("t")
   @Export("Scene_cameraXTileMax")
   static int Scene_cameraXTileMax;
   @ObfuscatedName("y")
   @Export("Scene_cameraYTileMin")
   static int Scene_cameraYTileMin;
   @ObfuscatedName("h")
   @Export("Scene_cameraYTileMax")
   static int Scene_cameraYTileMax;
   @ObfuscatedName("b")
   @Export("Scene_cameraXTile")
   static int Scene_cameraXTile;
   @ObfuscatedName("c")
   @Export("Scene_cameraYTile")
   static int Scene_cameraYTile;
   @ObfuscatedName("r")
   @Export("Scene_cameraX")
   static int Scene_cameraX;
   @ObfuscatedName("p")
   @Export("Scene_cameraY")
   static int Scene_cameraY;
   @ObfuscatedName("v")
   @Export("Scene_cameraZ")
   static int Scene_cameraZ;
   @ObfuscatedName("ag")
   @Export("Scene_cameraPitchSine")
   static int Scene_cameraPitchSine;
   @ObfuscatedName("aq")
   @Export("Scene_cameraPitchCosine")
   static int Scene_cameraPitchCosine;
   @ObfuscatedName("aj")
   @Export("Scene_cameraYawSine")
   static int Scene_cameraYawSine;
   @ObfuscatedName("av")
   @Export("Scene_cameraYawCosine")
   static int Scene_cameraYawCosine;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "[Leh;"
   )
   @Export("Scene_gameObjects")
   static GameObject[] Scene_gameObjects;
   @ObfuscatedName("ac")
   @Export("checkClick")
   static boolean checkClick;
   @ObfuscatedName("ay")
   @Export("Scene_selectedPlane")
   static int Scene_selectedPlane;
   @ObfuscatedName("ah")
   @Export("Scene_selectedScreenX")
   static int Scene_selectedScreenX;
   @ObfuscatedName("ak")
   @Export("Scene_selectedScreenY")
   static int Scene_selectedScreenY;
   @ObfuscatedName("aw")
   @Export("Scene_selectedX")
   public static int Scene_selectedX;
   @ObfuscatedName("al")
   @Export("Scene_selectedY")
   public static int Scene_selectedY;
   @ObfuscatedName("ab")
   @Export("viewportWalking")
   static boolean viewportWalking;
   @ObfuscatedName("ad")
   @Export("Scene_planesCount")
   static int Scene_planesCount;
   @ObfuscatedName("ap")
   @Export("Scene_planeOccluderCounts")
   static int[] Scene_planeOccluderCounts;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "[[Lee;"
   )
   @Export("Scene_planeOccluders")
   static Occluder[][] Scene_planeOccluders;
   @ObfuscatedName("am")
   @Export("Scene_currentOccludersCount")
   static int Scene_currentOccludersCount;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Lee;"
   )
   @Export("Scene_currentOccluders")
   static Occluder[] Scene_currentOccluders;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Lje;"
   )
   @Export("Scene_tilesDeque")
   static NodeDeque Scene_tilesDeque;
   @ObfuscatedName("au")
   static final int[] field762;
   @ObfuscatedName("ao")
   static final int[] field763;
   @ObfuscatedName("aa")
   static final int[] field764;
   @ObfuscatedName("ax")
   static final int[] field765;
   @ObfuscatedName("af")
   static final int[] field766;
   @ObfuscatedName("ai")
   static final int[] field767;
   @ObfuscatedName("ba")
   static final int[] field768;
   @ObfuscatedName("bc")
   @Export("visibilityMap")
   static boolean[][][][] visibilityMap;
   @ObfuscatedName("bo")
   @Export("visibleTiles")
   static boolean[][] visibleTiles;
   @ObfuscatedName("bx")
   @Export("Scene_viewportXCenter")
   static int Scene_viewportXCenter;
   @ObfuscatedName("by")
   @Export("Scene_viewportYCenter")
   static int Scene_viewportYCenter;
   @ObfuscatedName("bu")
   @Export("Scene_viewportXMin")
   static int Scene_viewportXMin;
   @ObfuscatedName("bm")
   @Export("Scene_viewportYMin")
   static int Scene_viewportYMin;
   @ObfuscatedName("bl")
   @Export("Scene_viewportXMax")
   static int Scene_viewportXMax;
   @ObfuscatedName("br")
   @Export("Scene_viewportYMax")
   static int Scene_viewportYMax;
   @ObfuscatedName("f")
   @Export("planes")
   int planes;
   @ObfuscatedName("q")
   @Export("xSize")
   int xSize;
   @ObfuscatedName("w")
   @Export("ySize")
   int ySize;
   @ObfuscatedName("o")
   @Export("tileHeights")
   int[][][] tileHeights;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "[[[Ldj;"
   )
   @Export("tiles")
   Tile[][][] tiles;
   @ObfuscatedName("g")
   @Export("Scene_minPlane")
   int Scene_minPlane;
   @ObfuscatedName("l")
   @Export("tempGameObjectsCount")
   int tempGameObjectsCount;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Leh;"
   )
   @Export("tempGameObjects")
   GameObject[] tempGameObjects;
   @ObfuscatedName("x")
   int[][][] field769;
   @ObfuscatedName("bk")
   int[][] field770;
   @ObfuscatedName("bd")
   int[][] field771;

   public Scene(int var1, int var2, int var3, int[][][] var4) {
      this.Scene_minPlane = 0;
      this.tempGameObjectsCount = 0;
      this.tempGameObjects = new GameObject[5000];
      this.field770 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field771 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.planes = var1;
      this.xSize = var2;
      this.ySize = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.field769 = new int[var1][var2 + 1][var3 + 1];
      this.tileHeights = var4;
      this.clear();
   }

   @ObfuscatedName("m")
   @Export("clear")
   public void clear() {
      int var1;
      int var2;
      for (var1 = 0; var1 < this.planes; ++var1) {
         for (var2 = 0; var2 < this.xSize; ++var2) {
            for (int var3 = 0; var3 < this.ySize; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for (var1 = 0; var1 < Scene_planesCount; ++var1) {
         for (var2 = 0; var2 < Scene_planeOccluderCounts[var1]; ++var2) {
            Scene_planeOccluders[var1][var2] = null;
         }

         Scene_planeOccluderCounts[var1] = 0;
      }

      for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
         this.tempGameObjects[var1] = null;
      }

      this.tempGameObjectsCount = 0;

      for (var1 = 0; var1 < Scene_gameObjects.length; ++var1) {
         Scene_gameObjects[var1] = null;
      }

   }

   @ObfuscatedName("f")
   @Export("init")
   public void init(int var1) {
      this.Scene_minPlane = var1;

      for (int var2 = 0; var2 < this.xSize; ++var2) {
         for (int var3 = 0; var3 < this.ySize; ++var3) {
            if (this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("q")
   @Export("setLinkBelow")
   public void setLinkBelow(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for (int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.plane;

            for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
               GameObject var7 = var5.gameObjects[var6];
               long var8 = var7.tag;
               int var10 = (int)(var8 >>> 14 & 3L);
               boolean var11 = var10 == 2;
               if (var11 && var7.startX == var1 && var2 == var7.startY) {
                  --var7.plane;
               }
            }
         }
      }

      if (this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].linkedBelowTile = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ObfuscatedName("o")
   @Export("setTileMinPlane")
   public void setTileMinPlane(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if (var5 != null) {
         this.tiles[var1][var2][var3].minPlane = var4;
      }

   }

   @ObfuscatedName("u")
   @Export("addTile")
   public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      TilePaint var21;
      int var22;
      if (var4 == 0) {
         var21 = new TilePaint(var11, var12, var13, var14, -1, var19, false);

         for (var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      } else if (var4 != 1) {
         TileModel var23 = new TileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for (var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].model = var23;
      } else {
         var21 = new TilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for (var22 = var1; var22 >= 0; --var22) {
            if (this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIILex;JI)V"
   )
   @Export("newFloorDecoration")
   public void newFloorDecoration(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
      if (var5 != null) {
         FloorDecoration var9 = new FloorDecoration();
         var9.entity = var5;
         var9.x = var2 * 128 + 64;
         var9.y = var3 * 128 + 64;
         var9.tileHeight = var4;
         var9.tag = var6;
         var9.flags = var8;
         if (this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].floorDecoration = var9;
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(IIIILex;JLex;Lex;)V"
   )
   @Export("newGroundItemPile")
   public void newGroundItemPile(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
      GroundItemPile var10 = new GroundItemPile();
      var10.first = var5;
      var10.x = var2 * 128 + 64;
      var10.y = var3 * 128 + 64;
      var10.tileHeight = var4;
      var10.tag = var6;
      var10.second = var8;
      var10.third = var9;
      int var11 = 0;
      Tile var12 = this.tiles[var1][var2][var3];
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) {
            if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].entity instanceof Model) {
               Model var14 = (Model)var12.gameObjects[var13].entity;
               var14.calculateBoundsCylinder();
               if (var14.height > var11) {
                  var11 = var14.height;
               }
            }
         }
      }

      var10.height = var11;
      if (this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].groundItemPile = var10;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIILex;Lex;IIJI)V"
   )
   @Export("newBoundaryObject")
   public void newBoundaryObject(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         BoundaryObject var12 = new BoundaryObject();
         var12.tag = var9;
         var12.flags = var11;
         var12.x = var2 * 128 + 64;
         var12.y = var3 * 128 + 64;
         var12.tileHeight = var4;
         var12.entity1 = var5;
         var12.entity2 = var6;
         var12.orientationA = var7;
         var12.orientationB = var8;

         for (int var13 = var1; var13 >= 0; --var13) {
            if (this.tiles[var13][var2][var3] == null) {
               this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].boundaryObject = var12;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIILex;Lex;IIIIJI)V"
   )
   @Export("newWallDecoration")
   public void newWallDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         WallDecoration var14 = new WallDecoration();
         var14.tag = var11;
         var14.flags = var13;
         var14.x = var2 * 128 + 64;
         var14.y = var3 * 128 + 64;
         var14.tileHeight = var4;
         var14.entity1 = var5;
         var14.entity2 = var6;
         var14.orientation = var7;
         var14.orientation2 = var8;
         var14.xOffset = var9;
         var14.yOffset = var10;

         for (int var15 = var1; var15 >= 0; --var15) {
            if (this.tiles[var15][var2][var3] == null) {
               this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallDecoration = var14;
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IIIIIILex;IJI)Z"
   )
   public boolean method284(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIIILex;IJZ)Z"
   )
   public boolean method285(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IIIIILex;IJIIII)Z"
   )
   public boolean method286(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILex;IZJI)Z"
   )
   @Export("newGameObject")
   boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, long var12, int var14) {
      int var15;
      for (int var16 = var2; var16 < var2 + var4; ++var16) {
         for (var15 = var3; var15 < var3 + var5; ++var15) {
            if (var16 < 0 || var15 < 0 || var16 >= this.xSize || var15 >= this.ySize) {
               return false;
            }

            Tile var17 = this.tiles[var1][var16][var15];
            if (var17 != null && var17.gameObjectsCount >= 5) {
               return false;
            }
         }
      }

      GameObject var20 = new GameObject();
      var20.tag = var12;
      var20.flags = var14;
      var20.plane = var1;
      var20.centerX = var6;
      var20.centerY = var7;
      var20.height = var8;
      var20.entity = var9;
      var20.orientation = var10;
      var20.startX = var2;
      var20.startY = var3;
      var20.endX = var2 + var4 - 1;
      var20.endY = var3 + var5 - 1;

      for (var15 = var2; var15 < var2 + var4; ++var15) {
         for (int var21 = var3; var21 < var3 + var5; ++var21) {
            int var18 = 0;
            if (var15 > var2) {
               ++var18;
            }

            if (var15 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var21 > var3) {
               var18 += 8;
            }

            if (var21 < var3 + var5 - 1) {
               var18 += 2;
            }

            for (int var19 = var1; var19 >= 0; --var19) {
               if (this.tiles[var19][var15][var21] == null) {
                  this.tiles[var19][var15][var21] = new Tile(var19, var15, var21);
               }
            }

            Tile var22 = this.tiles[var1][var15][var21];
            var22.gameObjects[var22.gameObjectsCount] = var20;
            var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18;
            var22.gameObjectsEdgeMask |= var18;
            ++var22.gameObjectsCount;
         }
      }

      if (var11) {
         this.tempGameObjects[this.tempGameObjectsCount++] = var20;
      }

      return true;
   }

   @ObfuscatedName("s")
   @Export("clearTempGameObjects")
   public void clearTempGameObjects() {
      for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
         GameObject var2 = this.tempGameObjects[var1];
         this.removeGameObject(var2);
         this.tempGameObjects[var1] = null;
      }

      this.tempGameObjectsCount = 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Leh;)V"
   )
   @Export("removeGameObject")
   void removeGameObject(GameObject var1) {
      for (int var2 = var1.startX; var2 <= var1.endX; ++var2) {
         for (int var3 = var1.startY; var3 <= var1.endY; ++var3) {
            Tile var4 = this.tiles[var1.plane][var2][var3];
            if (var4 != null) {
               int var5;
               for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
                  if (var4.gameObjects[var5] == var1) {
                     --var4.gameObjectsCount;

                     for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) {
                        var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
                        var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
                     }

                     var4.gameObjects[var4.gameObjectsCount] = null;
                     break;
                  }
               }

               var4.gameObjectsEdgeMask = 0;

               for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
                  var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   public void method287(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if (var5 != null) {
         WallDecoration var6 = var5.wallDecoration;
         if (var6 != null) {
            var6.xOffset = var4 * var6.xOffset / 16;
            var6.yOffset = var4 * var6.yOffset / 16;
         }
      }

   }

   @ObfuscatedName("h")
   @Export("removeBoundaryObject")
   public void removeBoundaryObject(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.boundaryObject = null;
      }

   }

   @ObfuscatedName("b")
   @Export("removeWallDecoration")
   public void removeWallDecoration(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.wallDecoration = null;
      }

   }

   @ObfuscatedName("c")
   public void method288(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
            GameObject var6 = var4.gameObjects[var5];
            long var7 = var6.tag;
            int var9 = (int)(var7 >>> 14 & 3L);
            boolean var10 = var9 == 2;
            if (var10 && var2 == var6.startX && var3 == var6.startY) {
               this.removeGameObject(var6);
               return;
            }
         }
      }

   }

   @ObfuscatedName("p")
   @Export("removeFloorDecoration")
   public void removeFloorDecoration(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.floorDecoration = null;
      }

   }

   @ObfuscatedName("v")
   @Export("removeGroundItemPile")
   public void removeGroundItemPile(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 != null) {
         var4.groundItemPile = null;
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(III)Lej;"
   )
   @Export("getBoundaryObject")
   public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.boundaryObject;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(III)Leq;"
   )
   @Export("getWallDecoration")
   public WallDecoration getWallDecoration(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null ? null : var4.wallDecoration;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(III)Leh;"
   )
   public GameObject method289(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
            GameObject var6 = var4.gameObjects[var5];
            long var7 = var6.tag;
            int var9 = (int)(var7 >>> 14 & 3L);
            boolean var10 = var9 == 2;
            if (var10 && var2 == var6.startX && var3 == var6.startY) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(III)Ldo;"
   )
   @Export("getFloorDecoration")
   public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
   }

   @ObfuscatedName("ar")
   public long method290(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L;
   }

   @ObfuscatedName("ac")
   public long method291(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L;
   }

   @ObfuscatedName("ay")
   public long method292(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
            GameObject var6 = var4.gameObjects[var5];
            long var7 = var6.tag;
            int var9 = (int)(var7 >>> 14 & 3L);
            boolean var10 = var9 == 2;
            if (var10 && var2 == var6.startX && var3 == var6.startY) {
               return var6.tag;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("ah")
   @Export("getFloorDecorationTag")
   public long getFloorDecorationTag(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
   }

   @ObfuscatedName("ak")
   @Export("getObjectFlags")
   public int getObjectFlags(int var1, int var2, int var3, long var4) {
      Tile var6 = this.tiles[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) {
         return var6.boundaryObject.flags & 255;
      } else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) {
         return var6.wallDecoration.flags & 255;
      } else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
         return var6.floorDecoration.flags & 255;
      } else {
         for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) {
            if (var6.gameObjects[var7].tag == var4) {
               return var6.gameObjects[var7].flags & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("aw")
   public void method293(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.planes; ++var4) {
         for (int var5 = 0; var5 < this.xSize; ++var5) {
            for (int var6 = 0; var6 < this.ySize; ++var6) {
               Tile var7 = this.tiles[var4][var5][var6];
               if (var7 != null) {
                  BoundaryObject var8 = var7.boundaryObject;
                  ModelData var9;
                  if (var8 != null && var8.entity1 instanceof ModelData) {
                     ModelData var10 = (ModelData)var8.entity1;
                     this.method295(var10, var4, var5, var6, 1, 1);
                     if (var8.entity2 instanceof ModelData) {
                        var9 = (ModelData)var8.entity2;
                        this.method295(var9, var4, var5, var6, 1, 1);
                        ModelData.method2800(var10, var9, 0, 0, 0, false);
                        var8.entity2 = var9.toModel(var9.field559, var9.field560, var1, var2, var3);
                     }

                     var8.entity1 = var10.toModel(var10.field559, var10.field560, var1, var2, var3);
                  }

                  for (int var13 = 0; var13 < var7.gameObjectsCount; ++var13) {
                     GameObject var11 = var7.gameObjects[var13];
                     if (var11 != null && var11.entity instanceof ModelData) {
                        ModelData var12 = (ModelData)var11.entity;
                        this.method295(var12, var4, var5, var6, var11.endX - var11.startX + 1, var11.endY - var11.startY + 1);
                        var11.entity = var12.toModel(var12.field559, var12.field560, var1, var2, var3);
                     }
                  }

                  FloorDecoration var14 = var7.floorDecoration;
                  if (var14 != null && var14.entity instanceof ModelData) {
                     var9 = (ModelData)var14.entity;
                     this.method294(var9, var4, var5, var6);
                     var14.entity = var9.toModel(var9.field559, var9.field560, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ldw;III)V"
   )
   void method294(ModelData var1, int var2, int var3, int var4) {
      Tile var5;
      ModelData var6;
      if (var3 < this.xSize) {
         var5 = this.tiles[var2][var3 + 1][var4];
         if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) {
            var6 = (ModelData)var5.floorDecoration.entity;
            ModelData.method2800(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.xSize) {
         var5 = this.tiles[var2][var3][var4 + 1];
         if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) {
            var6 = (ModelData)var5.floorDecoration.entity;
            ModelData.method2800(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.xSize && var4 < this.ySize) {
         var5 = this.tiles[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) {
            var6 = (ModelData)var5.floorDecoration.entity;
            ModelData.method2800(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.xSize && var4 > 0) {
         var5 = this.tiles[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.floorDecoration != null && var5.floorDecoration.entity instanceof ModelData) {
            var6 = (ModelData)var5.floorDecoration.entity;
            ModelData.method2800(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ldw;IIIII)V"
   )
   void method295(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for (int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.planes) {
            for (int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.xSize) {
                  for (int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4;
                           BoundaryObject var17 = var15.boundaryObject;
                           if (var17 != null) {
                              ModelData var18;
                              if (var17.entity1 instanceof ModelData) {
                                 var18 = (ModelData)var17.entity1;
                                 ModelData.method2800(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.entity2 instanceof ModelData) {
                                 var18 = (ModelData)var17.entity2;
                                 ModelData.method2800(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
                              GameObject var19 = var15.gameObjects[var23];
                              if (var19 != null && var19.entity instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.entity;
                                 int var21 = var19.endX - var19.startX + 1;
                                 int var22 = var19.endY - var19.startY + 1;
                                 ModelData.method2800(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("ae")
   @Export("drawTileMinimap")
   public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if (var7 != null) {
         TilePaint var8 = var7.paint;
         int var9;
         if (var8 != null) {
            int var10 = var8.rgb;
            if (var10 != 0) {
               for (var9 = 0; var9 < 4; ++var9) {
                  var1[var2] = var10;
                  var1[var2 + 1] = var10;
                  var1[var2 + 2] = var10;
                  var1[var2 + 3] = var10;
                  var2 += var3;
               }
            }
         } else {
            TileModel var18 = var7.model;
            if (var18 != null) {
               var9 = var18.shape;
               int var11 = var18.rotation;
               int var12 = var18.underlayRgb;
               int var13 = var18.overlayRgb;
               int[] var14 = this.field770[var9];
               int[] var15 = this.field771[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for (var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for (var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @Export("menuOpen")
   public void menuOpen(int var1, int var2, int var3, boolean var4) {
      if (!method3187() || var4) {
         checkClick = true;
         viewportWalking = var4;
         Scene_selectedPlane = var1;
         Scene_selectedScreenX = var2;
         Scene_selectedScreenY = var3;
         Scene_selectedX = -1;
         Scene_selectedY = -1;
      }

   }

   @ObfuscatedName("as")
   public void method296() {
      viewportWalking = true;
   }

   @ObfuscatedName("az")
   @Export("draw")
   public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.xSize * 128) {
         var1 = this.xSize * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.ySize * 128) {
         var3 = this.ySize * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++Scene_drawnCount;
      Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4];
      Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4];
      Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5];
      Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5];
      visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64];
      Scene_cameraX = var1;
      Scene_cameraY = var2;
      Scene_cameraZ = var3;
      Scene_cameraXTile = var1 / 128;
      Scene_cameraYTile = var3 / 128;
      Scene_plane = var6;
      Scene_cameraXTileMin = Scene_cameraXTile - 25;
      if (Scene_cameraXTileMin < 0) {
         Scene_cameraXTileMin = 0;
      }

      Scene_cameraYTileMin = Scene_cameraYTile - 25;
      if (Scene_cameraYTileMin < 0) {
         Scene_cameraYTileMin = 0;
      }

      Scene_cameraXTileMax = Scene_cameraXTile + 25;
      if (Scene_cameraXTileMax > this.xSize) {
         Scene_cameraXTileMax = this.xSize;
      }

      Scene_cameraYTileMax = Scene_cameraYTile + 25;
      if (Scene_cameraYTileMax > this.ySize) {
         Scene_cameraYTileMax = this.ySize;
      }

      this.occlude();
      tileUpdateCount = 0;

      int var7;
      Tile[][] var8;
      int var9;
      int var10;
      for (var7 = this.Scene_minPlane; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) {
            for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) {
               Tile var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.minPlane > var6 || !visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] && this.tileHeights[var7][var9][var10] - var2 < 2000) {
                     var11.drawPrimary = false;
                     var11.drawSecondary = false;
                     var11.drawGameObjectEdges = 0;
                  } else {
                     var11.drawPrimary = true;
                     var11.drawSecondary = true;
                     if (var11.gameObjectsCount > 0) {
                        var11.drawGameObjects = true;
                     } else {
                        var11.drawGameObjects = false;
                     }

                     ++tileUpdateCount;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      Tile var14;
      int var15;
      int var16;
      for (var7 = this.Scene_minPlane; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for (var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + Scene_cameraXTile;
            var15 = Scene_cameraXTile - var9;
            if (var10 >= Scene_cameraXTileMin || var15 < Scene_cameraXTileMax) {
               for (var16 = -25; var16 <= 0; ++var16) {
                  var12 = var16 + Scene_cameraYTile;
                  var13 = Scene_cameraYTile - var16;
                  if (var10 >= Scene_cameraXTileMin) {
                     if (var12 >= Scene_cameraYTileMin) {
                        var14 = var8[var10][var12];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, true);
                        }
                     }

                     if (var13 < Scene_cameraYTileMax) {
                        var14 = var8[var10][var13];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, true);
                        }
                     }
                  }

                  if (var15 < Scene_cameraXTileMax) {
                     if (var12 >= Scene_cameraYTileMin) {
                        var14 = var8[var15][var12];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, true);
                        }
                     }

                     if (var13 < Scene_cameraYTileMax) {
                        var14 = var8[var15][var13];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, true);
                        }
                     }
                  }

                  if (tileUpdateCount == 0) {
                     checkClick = false;
                     return;
                  }
               }
            }
         }
      }

      for (var7 = this.Scene_minPlane; var7 < this.planes; ++var7) {
         var8 = this.tiles[var7];

         for (var9 = -25; var9 <= 0; ++var9) {
            var10 = var9 + Scene_cameraXTile;
            var15 = Scene_cameraXTile - var9;
            if (var10 >= Scene_cameraXTileMin || var15 < Scene_cameraXTileMax) {
               for (var16 = -25; var16 <= 0; ++var16) {
                  var12 = var16 + Scene_cameraYTile;
                  var13 = Scene_cameraYTile - var16;
                  if (var10 >= Scene_cameraXTileMin) {
                     if (var12 >= Scene_cameraYTileMin) {
                        var14 = var8[var10][var12];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, false);
                        }
                     }

                     if (var13 < Scene_cameraYTileMax) {
                        var14 = var8[var10][var13];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, false);
                        }
                     }
                  }

                  if (var15 < Scene_cameraXTileMax) {
                     if (var12 >= Scene_cameraYTileMin) {
                        var14 = var8[var15][var12];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, false);
                        }
                     }

                     if (var13 < Scene_cameraYTileMax) {
                        var14 = var8[var15][var13];
                        if (var14 != null && var14.drawPrimary) {
                           this.drawTile(var14, false);
                        }
                     }
                  }

                  if (tileUpdateCount == 0) {
                     checkClick = false;
                     return;
                  }
               }
            }
         }
      }

      checkClick = false;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Ldj;Z)V"
   )
   @Export("drawTile")
   void drawTile(Tile var1, boolean var2) {
      Scene_tilesDeque.addFirst(var1);

      while (true) {
         Tile var3;
         int var4;
         int var5;
         int var6;
         int var7;
         Tile[][] var8;
         Tile var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while (true) {
                              BoundaryObject var16;
                              GameObject var17;
                              int var18;
                              int var19;
                              boolean var20;
                              int var21;
                              Tile var22;
                              while (true) {
                                 do {
                                    var3 = (Tile)Scene_tilesDeque.removeLast();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.drawSecondary);

                                 var4 = var3.x;
                                 var5 = var3.y;
                                 var6 = var3.plane;
                                 var7 = var3.originalPlane;
                                 var8 = this.tiles[var6];
                                 if (!var3.drawPrimary) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.tiles[var6 - 1][var4][var5];
                                       if (var9 != null && var9.drawSecondary) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.drawPrimary = false;
                                 if (var3.linkedBelowTile != null) {
                                    var9 = var3.linkedBelowTile;
                                    if (var9.paint != null) {
                                       if (!this.method297(0, var4, var5)) {
                                          this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                       }
                                    } else if (var9.model != null && !this.method297(0, var4, var5)) {
                                       this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                    }

                                    var16 = var9.boundaryObject;
                                    if (var16 != null) {
                                       var16.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var16.x - Scene_cameraX, var16.tileHeight - Scene_cameraY, var16.y - Scene_cameraZ, var16.tag);
                                    }

                                    for (var10 = 0; var10 < var9.gameObjectsCount; ++var10) {
                                       var17 = var9.gameObjects[var10];
                                       if (var17 != null) {
                                          var17.entity.renderDraw(var17.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var17.centerX - Scene_cameraX, var17.height - Scene_cameraY, var17.centerY - Scene_cameraZ, var17.tag);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if (var3.paint != null) {
                                    if (!this.method297(var7, var4, var5)) {
                                       var20 = true;
                                       if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) {
                                          this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                       }
                                    }
                                 } else if (var3.model != null && !this.method297(var7, var4, var5)) {
                                    var20 = true;
                                    this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
                                 }

                                 var21 = 0;
                                 var10 = 0;
                                 BoundaryObject var23 = var3.boundaryObject;
                                 WallDecoration var24 = var3.wallDecoration;
                                 if (var23 != null || var24 != null) {
                                    if (var4 == Scene_cameraXTile) {
                                       ++var21;
                                    } else if (Scene_cameraXTile < var4) {
                                       var21 += 2;
                                    }

                                    if (var5 == Scene_cameraYTile) {
                                       var21 += 3;
                                    } else if (Scene_cameraYTile > var5) {
                                       var21 += 6;
                                    }

                                    var10 = field762[var21];
                                    var3.field899 = field764[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.orientationA & field763[var21]) != 0) {
                                       if (var23.orientationA == 16) {
                                          var3.drawGameObjectEdges = 3;
                                          var3.field897 = field765[var21];
                                          var3.field898 = 3 - var3.field897;
                                       } else if (var23.orientationA == 32) {
                                          var3.drawGameObjectEdges = 6;
                                          var3.field897 = field766[var21];
                                          var3.field898 = 6 - var3.field897;
                                       } else if (var23.orientationA == 64) {
                                          var3.drawGameObjectEdges = 12;
                                          var3.field897 = field767[var21];
                                          var3.field898 = 12 - var3.field897;
                                       } else {
                                          var3.drawGameObjectEdges = 9;
                                          var3.field897 = field768[var21];
                                          var3.field898 = 9 - var3.field897;
                                       }
                                    } else {
                                       var3.drawGameObjectEdges = 0;
                                    }

                                    if ((var23.orientationA & var10) != 0 && !this.method298(var7, var4, var5, var23.orientationA)) {
                                       var23.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
                                    }

                                    if ((var23.orientationB & var10) != 0 && !this.method298(var7, var4, var5, var23.orientationB)) {
                                       var23.entity2.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x - Scene_cameraX, var23.tileHeight - Scene_cameraY, var23.y - Scene_cameraZ, var23.tag);
                                    }
                                 }

                                 if (var24 != null && !this.method299(var7, var4, var5, var24.entity1.height)) {
                                    if ((var24.orientation & var10) != 0) {
                                       var24.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var24.x - Scene_cameraX + var24.xOffset, var24.tileHeight - Scene_cameraY, var24.y - Scene_cameraZ + var24.yOffset, var24.tag);
                                    } else if (var24.orientation == 256) {
                                       var11 = var24.x - Scene_cameraX;
                                       var12 = var24.tileHeight - Scene_cameraY;
                                       var13 = var24.y - Scene_cameraZ;
                                       var18 = var24.orientation2;
                                       if (var18 != 1 && var18 != 2) {
                                          var19 = var11;
                                       } else {
                                          var19 = -var11;
                                       }

                                       int var25;
                                       if (var18 != 2 && var18 != 3) {
                                          var25 = var13;
                                       } else {
                                          var25 = -var13;
                                       }

                                       if (var25 < var19) {
                                          var24.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var24.xOffset, var12, var13 + var24.yOffset, var24.tag);
                                       } else if (var24.entity2 != null) {
                                          var24.entity2.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var12, var13, var24.tag);
                                       }
                                    }
                                 }

                                 if (var20) {
                                    FloorDecoration var34 = var3.floorDecoration;
                                    if (var34 != null) {
                                       var34.entity.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var34.x - Scene_cameraX, var34.tileHeight - Scene_cameraY, var34.y - Scene_cameraZ, var34.tag);
                                    }

                                    GroundItemPile var26 = var3.groundItemPile;
                                    if (var26 != null && var26.height == 0) {
                                       if (var26.second != null) {
                                          var26.second.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var26.x - Scene_cameraX, var26.tileHeight - Scene_cameraY, var26.y - Scene_cameraZ, var26.tag);
                                       }

                                       if (var26.third != null) {
                                          var26.third.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var26.x - Scene_cameraX, var26.tileHeight - Scene_cameraY, var26.y - Scene_cameraZ, var26.tag);
                                       }

                                       if (var26.first != null) {
                                          var26.first.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var26.x - Scene_cameraX, var26.tileHeight - Scene_cameraY, var26.y - Scene_cameraZ, var26.tag);
                                       }
                                    }
                                 }

                                 var11 = var3.gameObjectsEdgeMask;
                                 if (var11 != 0) {
                                    if (var4 < Scene_cameraXTile && (var11 & 4) != 0) {
                                       var22 = var8[var4 + 1][var5];
                                       if (var22 != null && var22.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var22);
                                       }
                                    }

                                    if (var5 < Scene_cameraYTile && (var11 & 2) != 0) {
                                       var22 = var8[var4][var5 + 1];
                                       if (var22 != null && var22.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var22);
                                       }
                                    }

                                    if (var4 > Scene_cameraXTile && (var11 & 1) != 0) {
                                       var22 = var8[var4 - 1][var5];
                                       if (var22 != null && var22.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var22);
                                       }
                                    }

                                    if (var5 > Scene_cameraYTile && (var11 & 8) != 0) {
                                       var22 = var8[var4][var5 - 1];
                                       if (var22 != null && var22.drawSecondary) {
                                          Scene_tilesDeque.addFirst(var22);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.drawGameObjectEdges != 0) {
                                 var20 = true;

                                 for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) {
                                    if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field897) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if (var20) {
                                    var16 = var3.boundaryObject;
                                    if (!this.method298(var7, var4, var5, var16.orientationA)) {
                                       var16.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var16.x - Scene_cameraX, var16.tileHeight - Scene_cameraY, var16.y - Scene_cameraZ, var16.tag);
                                    }

                                    var3.drawGameObjectEdges = 0;
                                 }
                              }

                              if (!var3.drawGameObjects) {
                                 break;
                              }

                              try {
                                 int var32 = var3.gameObjectsCount;
                                 var3.drawGameObjects = false;
                                 var21 = 0;

                                 label562:
                                 for (var10 = 0; var10 < var32; ++var10) {
                                    var17 = var3.gameObjects[var10];
                                    if (var17.lastDrawn != Scene_drawnCount) {
                                       for (var14 = var17.startX; var14 <= var17.endX; ++var14) {
                                          for (var11 = var17.startY; var11 <= var17.endY; ++var11) {
                                             var22 = var8[var14][var11];
                                             if (var22.drawPrimary) {
                                                var3.drawGameObjects = true;
                                                continue label562;
                                             }

                                             if (var22.drawGameObjectEdges != 0) {
                                                var13 = 0;
                                                if (var14 > var17.startX) {
                                                   ++var13;
                                                }

                                                if (var14 < var17.endX) {
                                                   var13 += 4;
                                                }

                                                if (var11 > var17.startY) {
                                                   var13 += 8;
                                                }

                                                if (var11 < var17.endY) {
                                                   var13 += 2;
                                                }

                                                if ((var13 & var22.drawGameObjectEdges) == var3.field898) {
                                                   var3.drawGameObjects = true;
                                                   continue label562;
                                                }
                                             }
                                          }
                                       }

                                       Scene_gameObjects[var21++] = var17;
                                       var14 = Scene_cameraXTile - var17.startX;
                                       var11 = var17.endX - Scene_cameraXTile;
                                       if (var11 > var14) {
                                          var14 = var11;
                                       }

                                       var12 = Scene_cameraYTile - var17.startY;
                                       var13 = var17.endY - Scene_cameraYTile;
                                       if (var13 > var12) {
                                          var17.field360 = var14 + var13;
                                       } else {
                                          var17.field360 = var14 + var12;
                                       }
                                    }
                                 }

                                 while (var21 > 0) {
                                    var10 = -50;
                                    var15 = -1;

                                    GameObject var33;
                                    for (var14 = 0; var14 < var21; ++var14) {
                                       var33 = Scene_gameObjects[var14];
                                       if (var33.lastDrawn != Scene_drawnCount) {
                                          if (var33.field360 > var10) {
                                             var10 = var33.field360;
                                             var15 = var14;
                                          } else if (var10 == var33.field360) {
                                             var12 = var33.centerX - Scene_cameraX;
                                             var13 = var33.centerY - Scene_cameraZ;
                                             var18 = Scene_gameObjects[var15].centerX - Scene_cameraX;
                                             var19 = Scene_gameObjects[var15].centerY - Scene_cameraZ;
                                             if (var12 * var12 + var13 * var13 > var18 * var18 + var19 * var19) {
                                                var15 = var14;
                                             }
                                          }
                                       }
                                    }

                                    if (var15 == -1) {
                                       break;
                                    }

                                    var33 = Scene_gameObjects[var15];
                                    var33.lastDrawn = Scene_drawnCount;
                                    if (!this.method300(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.entity.height)) {
                                       var33.entity.renderDraw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.height - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag);
                                    }

                                    for (var11 = var33.startX; var11 <= var33.endX; ++var11) {
                                       for (var12 = var33.startY; var12 <= var33.endY; ++var12) {
                                          Tile var35 = var8[var11][var12];
                                          if (var35.drawGameObjectEdges != 0) {
                                             Scene_tilesDeque.addFirst(var35);
                                          } else if ((var11 != var4 || var12 != var5) && var35.drawSecondary) {
                                             Scene_tilesDeque.addFirst(var35);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.drawGameObjects) {
                                    break;
                                 }
                              } catch (Exception var27) {
                                 var3.drawGameObjects = false;
                                 break;
                              }
                           }
                        } while(!var3.drawSecondary);
                     } while(var3.drawGameObjectEdges != 0);

                     if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.drawSecondary);

                  if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.drawSecondary);

               if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.drawSecondary);

            if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.drawSecondary);

         var3.drawSecondary = false;
         --tileUpdateCount;
         GroundItemPile var28 = var3.groundItemPile;
         if (var28 != null && var28.height != 0) {
            if (var28.second != null) {
               var28.second.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var28.x - Scene_cameraX, var28.tileHeight - Scene_cameraY - var28.height, var28.y - Scene_cameraZ, var28.tag);
            }

            if (var28.third != null) {
               var28.third.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var28.x - Scene_cameraX, var28.tileHeight - Scene_cameraY - var28.height, var28.y - Scene_cameraZ, var28.tag);
            }

            if (var28.first != null) {
               var28.first.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var28.x - Scene_cameraX, var28.tileHeight - Scene_cameraY - var28.height, var28.y - Scene_cameraZ, var28.tag);
            }
         }

         if (var3.field899 != 0) {
            WallDecoration var29 = var3.wallDecoration;
            if (var29 != null && !this.method299(var7, var4, var5, var29.entity1.height)) {
               if ((var29.orientation & var3.field899) != 0) {
                  var29.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.x - Scene_cameraX + var29.xOffset, var29.tileHeight - Scene_cameraY, var29.y - Scene_cameraZ + var29.yOffset, var29.tag);
               } else if (var29.orientation == 256) {
                  var10 = var29.x - Scene_cameraX;
                  var15 = var29.tileHeight - Scene_cameraY;
                  var14 = var29.y - Scene_cameraZ;
                  var11 = var29.orientation2;
                  if (var11 != 1 && var11 != 2) {
                     var12 = var10;
                  } else {
                     var12 = -var10;
                  }

                  if (var11 != 2 && var11 != 3) {
                     var13 = var14;
                  } else {
                     var13 = -var14;
                  }

                  if (var13 >= var12) {
                     var29.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10 + var29.xOffset, var15, var14 + var29.yOffset, var29.tag);
                  } else if (var29.entity2 != null) {
                     var29.entity2.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10, var15, var14, var29.tag);
                  }
               }
            }

            BoundaryObject var31 = var3.boundaryObject;
            if (var31 != null) {
               if ((var31.orientationB & var3.field899) != 0 && !this.method298(var7, var4, var5, var31.orientationB)) {
                  var31.entity2.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
               }

               if ((var31.orientationA & var3.field899) != 0 && !this.method298(var7, var4, var5, var31.orientationA)) {
                  var31.entity1.renderDraw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x - Scene_cameraX, var31.tileHeight - Scene_cameraY, var31.y - Scene_cameraZ, var31.tag);
               }
            }
         }

         Tile var30;
         if (var6 < this.planes - 1) {
            var30 = this.tiles[var6 + 1][var4][var5];
            if (var30 != null && var30.drawSecondary) {
               Scene_tilesDeque.addFirst(var30);
            }
         }

         if (var4 < Scene_cameraXTile) {
            var30 = var8[var4 + 1][var5];
            if (var30 != null && var30.drawSecondary) {
               Scene_tilesDeque.addFirst(var30);
            }
         }

         if (var5 < Scene_cameraYTile) {
            var30 = var8[var4][var5 + 1];
            if (var30 != null && var30.drawSecondary) {
               Scene_tilesDeque.addFirst(var30);
            }
         }

         if (var4 > Scene_cameraXTile) {
            var30 = var8[var4 - 1][var5];
            if (var30 != null && var30.drawSecondary) {
               Scene_tilesDeque.addFirst(var30);
            }
         }

         if (var5 > Scene_cameraYTile) {
            var30 = var8[var4][var5 - 1];
            if (var30 != null && var30.drawSecondary) {
               Scene_tilesDeque.addFirst(var30);
            }
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Leb;IIIIIII)V"
   )
   @Export("drawTileUnderlay")
   void drawTileUnderlay(TilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - Scene_cameraX;
      int var11;
      int var12 = var11 = (var8 << 7) - Scene_cameraZ;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY;
      int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY;
      int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY;
      int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var3 * var17 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var3 * var18 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var3 * var19 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var3 * var20 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX;
                  int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY;
                  int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX;
                  int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY;
                  int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX;
                  int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY;
                  int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX;
                  int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY;
                  Rasterizer3D.Rasterizer3D_alpha = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     Rasterizer3D.field739 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) {
                        Rasterizer3D.field739 = true;
                     }

                     if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) {
                        Scene_selectedX = var7;
                        Scene_selectedY = var8;
                     }

                     if (var1.texture == -1) {
                        if (var1.neColor != 12345678) {
                           Rasterizer3D.method3037(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
                        }
                     } else if (!Scene_isLowDetail) {
                        if (var1.isFlat) {
                           Rasterizer3D.method3012(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                        } else {
                           Rasterizer3D.method3012(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture);
                        }
                     } else {
                        var30 = Rasterizer3D.Rasterizer3D_textureLoader.vmethod324(var1.texture);
                        Rasterizer3D.method3037(var27, var29, var25, var26, var28, var24, method3108(var30, var1.neColor), method3108(var30, var1.nwColor), method3108(var30, var1.seColor));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     Rasterizer3D.field739 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) {
                        Rasterizer3D.field739 = true;
                     }

                     if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) {
                        Scene_selectedX = var7;
                        Scene_selectedY = var8;
                     }

                     if (var1.texture == -1) {
                        if (var1.swColor != 12345678) {
                           Rasterizer3D.method3037(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
                        }
                     } else if (!Scene_isLowDetail) {
                        Rasterizer3D.method3012(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                     } else {
                        var30 = Rasterizer3D.Rasterizer3D_textureLoader.vmethod324(var1.texture);
                        Rasterizer3D.method3037(var23, var25, var29, var22, var24, var28, method3108(var30, var1.swColor), method3108(var30, var1.seColor), method3108(var30, var1.nwColor));
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ldv;IIIIII)V"
   )
   @Export("drawTileOverlay")
   void drawTileOverlay(TileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.vertexX.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for (var9 = 0; var9 < var8; ++var9) {
         var10 = var1.vertexX[var9] - Scene_cameraX;
         var11 = var1.vertexY[var9] - Scene_cameraY;
         var12 = var1.vertexZ[var9] - Scene_cameraZ;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.triangleTextureId != null) {
            TileModel.field902[var9] = var10;
            TileModel.field903[var9] = var13;
            TileModel.field904[var9] = var12;
         }

         TileModel.field900[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX;
         TileModel.field901[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY;
      }

      Rasterizer3D.Rasterizer3D_alpha = 0;
      var8 = var1.faceX.length;

      for (var9 = 0; var9 < var8; ++var9) {
         var10 = var1.faceX[var9];
         var11 = var1.faceY[var9];
         var12 = var1.faceZ[var9];
         var13 = TileModel.field900[var10];
         int var14 = TileModel.field900[var11];
         int var15 = TileModel.field900[var12];
         int var16 = TileModel.field901[var10];
         int var17 = TileModel.field901[var11];
         int var18 = TileModel.field901[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            Rasterizer3D.field739 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) {
               Rasterizer3D.field739 = true;
            }

            if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) {
               Scene_selectedX = var6;
               Scene_selectedY = var7;
            }

            if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) {
               if (!Scene_isLowDetail) {
                  if (var1.isFlat) {
                     Rasterizer3D.method3012(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], TileModel.field902[0], TileModel.field902[1], TileModel.field902[3], TileModel.field903[0], TileModel.field903[1], TileModel.field903[3], TileModel.field904[0], TileModel.field904[1], TileModel.field904[3], var1.triangleTextureId[var9]);
                  } else {
                     Rasterizer3D.method3012(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], TileModel.field902[var10], TileModel.field902[var11], TileModel.field902[var12], TileModel.field903[var10], TileModel.field903[var11], TileModel.field903[var12], TileModel.field904[var10], TileModel.field904[var11], TileModel.field904[var12], var1.triangleTextureId[var9]);
                  }
               } else {
                  int var19 = Rasterizer3D.Rasterizer3D_textureLoader.vmethod324(var1.triangleTextureId[var9]);
                  Rasterizer3D.method3037(var16, var17, var18, var13, var14, var15, method3108(var19, var1.triangleColorA[var9]), method3108(var19, var1.triangleColorB[var9]), method3108(var19, var1.triangleColorC[var9]));
               }
            } else if (var1.triangleColorA[var9] != 12345678) {
               Rasterizer3D.method3037(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @Export("occlude")
   void occlude() {
      int var1 = Scene_planeOccluderCounts[Scene_plane];
      Occluder[] var2 = Scene_planeOccluders[Scene_plane];
      Scene_currentOccludersCount = 0;

      for (int var3 = 0; var3 < var1; ++var3) {
         Occluder var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var8;
         boolean var9;
         if (var4.type == 1) {
            var5 = var4.minTileX - Scene_cameraXTile + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.minTileY - Scene_cameraYTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTileY - Scene_cameraYTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while (var6 <= var7) {
                  if (visibleTiles[var5][var6++]) {
                     var9 = true;
                     break;
                  }
               }

               if (var9) {
                  var8 = Scene_cameraX - var4.minX;
                  if (var8 > 32) {
                     var4.field656 = 1;
                  } else {
                     if (var8 >= -32) {
                        continue;
                     }

                     var4.field656 = 2;
                     var8 = -var8;
                  }

                  var4.field659 = (var4.minZ - Scene_cameraZ << 8) / var8;
                  var4.field660 = (var4.maxZ - Scene_cameraZ << 8) / var8;
                  var4.field661 = (var4.minY - Scene_cameraY << 8) / var8;
                  var4.field662 = (var4.maxY - Scene_cameraY << 8) / var8;
                  Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.type == 2) {
            var5 = var4.minTileY - Scene_cameraYTile + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.minTileX - Scene_cameraXTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTileX - Scene_cameraXTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var9 = false;

               while (var6 <= var7) {
                  if (visibleTiles[var6++][var5]) {
                     var9 = true;
                     break;
                  }
               }

               if (var9) {
                  var8 = Scene_cameraZ - var4.minZ;
                  if (var8 > 32) {
                     var4.field656 = 3;
                  } else {
                     if (var8 >= -32) {
                        continue;
                     }

                     var4.field656 = 4;
                     var8 = -var8;
                  }

                  var4.field657 = (var4.minX - Scene_cameraX << 8) / var8;
                  var4.field658 = (var4.maxX - Scene_cameraX << 8) / var8;
                  var4.field661 = (var4.minY - Scene_cameraY << 8) / var8;
                  var4.field662 = (var4.maxY - Scene_cameraY << 8) / var8;
                  Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
               }
            }
         } else if (var4.type == 4) {
            var5 = var4.minY - Scene_cameraY;
            if (var5 > 128) {
               var6 = var4.minTileY - Scene_cameraYTile + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTileY - Scene_cameraYTile + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var10 = var4.minTileX - Scene_cameraXTile + 25;
                  if (var10 < 0) {
                     var10 = 0;
                  }

                  var8 = var4.maxTileX - Scene_cameraXTile + 25;
                  if (var8 > 50) {
                     var8 = 50;
                  }

                  boolean var11 = false;

                  label140:
                  for (int var12 = var10; var12 <= var8; ++var12) {
                     for (int var13 = var6; var13 <= var7; ++var13) {
                        if (visibleTiles[var12][var13]) {
                           var11 = true;
                           break label140;
                        }
                     }
                  }

                  if (var11) {
                     var4.field656 = 5;
                     var4.field657 = (var4.minX - Scene_cameraX << 8) / var5;
                     var4.field658 = (var4.maxX - Scene_cameraX << 8) / var5;
                     var4.field659 = (var4.minZ - Scene_cameraZ << 8) / var5;
                     var4.field660 = (var4.maxZ - Scene_cameraZ << 8) / var5;
                     Scene_currentOccluders[Scene_currentOccludersCount++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ba")
   boolean method297(int var1, int var2, int var3) {
      int var4 = this.field769[var1][var2][var3];
      if (var4 == -Scene_drawnCount) {
         return false;
      } else if (var4 == Scene_drawnCount) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method301(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method301(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method301(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method301(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field769[var1][var2][var3] = Scene_drawnCount;
            return true;
         } else {
            this.field769[var1][var2][var3] = -Scene_drawnCount;
            return false;
         }
      }
   }

   @ObfuscatedName("bb")
   boolean method298(int var1, int var2, int var3, int var4) {
      if (!this.method297(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.tileHeights[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > Scene_cameraX) {
                  if (!this.method301(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method301(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method301(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method301(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method301(var5, var9, var6)) {
                  return false;
               }

               if (!this.method301(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < Scene_cameraZ) {
                  if (!this.method301(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method301(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method301(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method301(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < Scene_cameraX) {
                  if (!this.method301(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method301(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method301(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method301(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > Scene_cameraZ) {
                  if (!this.method301(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method301(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method301(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method301(var5, var9, var6)) {
                  return false;
               }

               if (!this.method301(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method301(var5 + 64, var10, var6 + 64) ? false : (var4 == 16 ? this.method301(var5, var9, var6 + 128) : (var4 == 32 ? this.method301(var5 + 128, var9, var6 + 128) : (var4 == 64 ? this.method301(var5 + 128, var9, var6) : (var4 == 128 ? this.method301(var5, var9, var6) : true))));
      }
   }

   @ObfuscatedName("bs")
   boolean method299(int var1, int var2, int var3, int var4) {
      if (!this.method297(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method301(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method301(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method301(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method301(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("bq")
   boolean method300(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var3 == var2 && var5 == var4) {
         if (!this.method297(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method301(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method301(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method301(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method301(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for (var7 = var2; var7 <= var3; ++var7) {
            for (var8 = var4; var8 <= var5; ++var8) {
               if (this.field769[var1][var7][var8] == -Scene_drawnCount) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
         if (!this.method301(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method301(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method301(var7, var9, var11)) {
                  return false;
               } else if (!this.method301(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("bn")
   boolean method301(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) {
         Occluder var5 = Scene_currentOccluders[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field656 == 1) {
            var6 = var5.minX - var1;
            if (var6 > 0) {
               var7 = (var6 * var5.field659 >> 8) + var5.minZ;
               var8 = (var6 * var5.field660 >> 8) + var5.maxZ;
               var9 = (var6 * var5.field661 >> 8) + var5.minY;
               var10 = (var6 * var5.field662 >> 8) + var5.maxY;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field656 == 2) {
            var6 = var1 - var5.minX;
            if (var6 > 0) {
               var7 = (var6 * var5.field659 >> 8) + var5.minZ;
               var8 = (var6 * var5.field660 >> 8) + var5.maxZ;
               var9 = (var6 * var5.field661 >> 8) + var5.minY;
               var10 = (var6 * var5.field662 >> 8) + var5.maxY;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field656 == 3) {
            var6 = var5.minZ - var3;
            if (var6 > 0) {
               var7 = (var6 * var5.field657 >> 8) + var5.minX;
               var8 = (var6 * var5.field658 >> 8) + var5.maxX;
               var9 = (var6 * var5.field661 >> 8) + var5.minY;
               var10 = (var6 * var5.field662 >> 8) + var5.maxY;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field656 == 4) {
            var6 = var3 - var5.minZ;
            if (var6 > 0) {
               var7 = (var6 * var5.field657 >> 8) + var5.minX;
               var8 = (var6 * var5.field658 >> 8) + var5.maxX;
               var9 = (var6 * var5.field661 >> 8) + var5.minY;
               var10 = (var6 * var5.field662 >> 8) + var5.maxY;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field656 == 5) {
            var6 = var2 - var5.minY;
            if (var6 > 0) {
               var7 = (var6 * var5.field657 >> 8) + var5.minX;
               var8 = (var6 * var5.field658 >> 8) + var5.maxX;
               var9 = (var6 * var5.field659 >> 8) + var5.minZ;
               var10 = (var6 * var5.field660 >> 8) + var5.maxZ;
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("w")
   @Export("Scene_addOccluder")
   public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Occluder var8 = new Occluder();
      var8.minTileX = var2 / 128;
      var8.maxTileX = var3 / 128;
      var8.minTileY = var4 / 128;
      var8.maxTileY = var5 / 128;
      var8.type = var1;
      var8.minX = var2;
      var8.maxX = var3;
      var8.minZ = var4;
      var8.maxZ = var5;
      var8.minY = var6;
      var8.maxY = var7;
      Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8;
   }

   @ObfuscatedName("at")
   @Export("Scene_buildVisiblityMap")
   public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
      Scene_viewportXMin = 0;
      Scene_viewportYMin = 0;
      Scene_viewportXMax = var3;
      Scene_viewportYMax = var4;
      Scene_viewportXCenter = var3 / 2;
      Scene_viewportYCenter = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for (var6 = 128; var6 <= 383; var6 += 32) {
         for (var7 = 0; var7 < 2048; var7 += 64) {
            Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6];
            Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6];
            Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7];
            Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for (int var12 = -26; var12 < 26; ++var12) {
               for (var10 = -26; var10 < 26; ++var10) {
                  var11 = var12 * 128;
                  int var13 = var10 * 128;
                  boolean var14 = false;

                  for (int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method3100(var11, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var12 + 1 + 25][var10 + 1 + 25] = var14;
               }
            }
         }
      }

      for (var6 = 0; var6 < 8; ++var6) {
         for (var7 = 0; var7 < 32; ++var7) {
            for (var8 = -25; var8 < 25; ++var8) {
               for (var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for (var10 = -1; var10 <= 1; ++var10) {
                     for (var11 = -1; var11 <= 1; ++var11) {
                        if (var5[var6][var7][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var10 + 1 + 25][var9 + var11 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   @ObfuscatedName("ad")
   static boolean method3100(int var0, int var1, int var2) {
      int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16;
      int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16;
      int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16;
      int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + Scene_viewportXCenter;
         int var8 = var6 * 128 / var5 + Scene_viewportYCenter;
         return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax;
      } else {
         return false;
      }
   }

   @ObfuscatedName("am")
   public static boolean method3187() {
      return viewportWalking && Scene_selectedX != -1;
   }

   @ObfuscatedName("an")
   public static void method3103() {
      Scene_selectedX = -1;
      viewportWalking = false;
   }

   @ObfuscatedName("ax")
   static final int method3108(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @Export("containsBounds")
   @ObfuscatedName("af")
   static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         return var8 == 0 ? (var9 != 0 ? (var9 < 0 ? var10 <= 0 : var10 >= 0) : true) : (var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0);
      }
   }

   static {
      Scene_isLowDetail = true;
      tileUpdateCount = 0;
      Scene_plane = 0;
      Scene_gameObjects = new GameObject[100];
      checkClick = false;
      Scene_selectedPlane = 0;
      Scene_selectedScreenX = 0;
      Scene_selectedScreenY = 0;
      Scene_selectedX = -1;
      Scene_selectedY = -1;
      viewportWalking = false;
      Scene_planesCount = 4;
      Scene_planeOccluderCounts = new int[Scene_planesCount];
      Scene_planeOccluders = new Occluder[Scene_planesCount][500];
      Scene_currentOccludersCount = 0;
      Scene_currentOccluders = new Occluder[500];
      Scene_tilesDeque = new NodeDeque();
      field762 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field763 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field764 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field765 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field766 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field767 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field768 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      visibilityMap = new boolean[8][32][51][51];
   }
}
