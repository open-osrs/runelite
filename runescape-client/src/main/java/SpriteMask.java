import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive1")
   static Archive archive1;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive15")
   static Archive archive15;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -305616951
   )
   @Export("width")
   public final int width;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1125441395
   )
   @Export("height")
   public final int height;
   @ObfuscatedName("d")
   @Export("xWidths")
   public final int[] xWidths;
   @ObfuscatedName("c")
   @Export("xStarts")
   public final int[] xStarts;

   SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.width = var1;
      this.height = var2;
      this.xWidths = var3;
      this.xStarts = var4;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-290220203"
   )
   @Export("contains")
   public boolean contains(int var1, int var2) {
      if (var2 >= 0 && var2 < this.xStarts.length) {
         int var3 = this.xStarts[var2];
         if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIB)V",
      garbageValue = "55"
   )
   @Export("addPendingSpawnToScene")
   static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (Client.isLowDetail && var0 != class90.Client_plane) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var7 = MilliClock.scene.getBoundaryObjectTag(var0, var2, var3);
         }

         if (var1 == 1) {
            var7 = MilliClock.scene.getWallDecorationTag(var0, var2, var3);
         }

         if (var1 == 2) {
            var7 = MilliClock.scene.getGameObjectTag(var0, var2, var3);
         }

         if (var1 == 3) {
            var7 = MilliClock.scene.getFloorDecorationTag(var0, var2, var3);
         }

         int var12;
         if (0L != var7) {
            var12 = MilliClock.scene.getObjectFlags(var0, var2, var3, var7);
            int var38 = class25.Entity_unpackID(var7);
            int var39 = var12 & 31;
            int var40 = var12 >> 6 & 3;
            ObjectComposition var13;
            if (var1 == 0) {
               MilliClock.scene.removeBoundaryObject(var0, var2, var3);
               var13 = WorldMapAreaData.getObjectDefinition(var38);
               if (var13.interactType != 0) {
                  Client.collisionMaps[var0].method3755(var2, var3, var39, var40, var13.boolean1);
               }
            }

            if (var1 == 1) {
               MilliClock.scene.removeWallDecoration(var0, var2, var3);
            }

            if (var1 == 2) {
               MilliClock.scene.removeGameObject(var0, var2, var3);
               var13 = WorldMapAreaData.getObjectDefinition(var38);
               if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) {
                  return;
               }

               if (var13.interactType != 0) {
                  Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
               }
            }

            if (var1 == 3) {
               MilliClock.scene.removeFloorDecoration(var0, var2, var3);
               var13 = WorldMapAreaData.getObjectDefinition(var38);
               if (var13.interactType == 1) {
                  Client.collisionMaps[var0].method3758(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            Scene var41 = MilliClock.scene;
            CollisionMap var14 = Client.collisionMaps[var0];
            ObjectComposition var15 = WorldMapAreaData.getObjectDefinition(var4);
            int var16;
            int var17;
            if (var5 != 1 && var5 != 3) {
               var16 = var15.sizeX;
               var17 = var15.sizeY;
            } else {
               var16 = var15.sizeY;
               var17 = var15.sizeX;
            }

            int var18;
            int var19;
            if (var16 + var2 <= 104) {
               var18 = (var16 >> 1) + var2;
               var19 = var2 + (var16 + 1 >> 1);
            } else {
               var18 = var2;
               var19 = var2 + 1;
            }

            int var20;
            int var21;
            if (var3 + var17 <= 104) {
               var20 = var3 + (var17 >> 1);
               var21 = var3 + (var17 + 1 >> 1);
            } else {
               var20 = var3;
               var21 = var3 + 1;
            }

            int[][] var22 = Tiles.Tiles_heights[var12];
            int var23 = var22[var19][var21] + var22[var18][var21] + var22[var19][var20] + var22[var18][var20] >> 2;
            int var24 = (var2 << 7) + (var16 << 6);
            int var25 = (var3 << 7) + (var17 << 6);
            long var26 = TextureProvider.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
            int var28 = (var5 << 6) + var6;
            if (var15.int3 == 1) {
               var28 += 256;
            }

            Object var36;
            if (var6 == 22) {
               if (var15.animationId == -1 && var15.transforms == null) {
                  var36 = var15.getModel(22, var5, var22, var24, var23, var25);
               } else {
                  var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
               }

               var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28);
               if (var15.interactType == 1) {
                  var14.setBlockedByFloorDec(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var15.animationId == -1 && var15.transforms == null) {
                     var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
                  } else {
                     var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                  }

                  var41.method3400(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
                  if (var15.interactType != 0) {
                     var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
                  }
               } else if (var6 == 0) {
                  if (var15.animationId == -1 && var15.transforms == null) {
                     var36 = var15.getModel(0, var5, var22, var24, var23, var25);
                  } else {
                     var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                  }

                  var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field521[var5], 0, var26, var28);
                  if (var15.interactType != 0) {
                     var14.method3749(var2, var3, var6, var5, var15.boolean1);
                  }
               } else if (var6 == 1) {
                  if (var15.animationId == -1 && var15.transforms == null) {
                     var36 = var15.getModel(1, var5, var22, var24, var23, var25);
                  } else {
                     var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                  }

                  var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field514[var5], 0, var26, var28);
                  if (var15.interactType != 0) {
                     var14.method3749(var2, var3, var6, var5, var15.boolean1);
                  }
               } else {
                  int var29;
                  if (var6 == 2) {
                     var29 = var5 + 1 & 3;
                     Object var31;
                     Object var37;
                     if (var15.animationId == -1 && var15.transforms == null) {
                        var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
                        var31 = var15.getModel(2, var29, var22, var24, var23, var25);
                     } else {
                        var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                        var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                     }

                     var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field521[var5], Tiles.field521[var29], var26, var28);
                     if (var15.interactType != 0) {
                        var14.method3749(var2, var3, var6, var5, var15.boolean1);
                     }
                  } else if (var6 == 3) {
                     if (var15.animationId == -1 && var15.transforms == null) {
                        var36 = var15.getModel(3, var5, var22, var24, var23, var25);
                     } else {
                        var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                     }

                     var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field514[var5], 0, var26, var28);
                     if (var15.interactType != 0) {
                        var14.method3749(var2, var3, var6, var5, var15.boolean1);
                     }
                  } else if (var6 == 9) {
                     if (var15.animationId == -1 && var15.transforms == null) {
                        var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
                     } else {
                        var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                     }

                     var41.method3400(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28);
                     if (var15.interactType != 0) {
                        var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
                     }
                  } else if (var6 == 4) {
                     if (var15.animationId == -1 && var15.transforms == null) {
                        var36 = var15.getModel(4, var5, var22, var24, var23, var25);
                     } else {
                        var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                     }

                     var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field521[var5], 0, 0, 0, var26, var28);
                  } else {
                     long var30;
                     Object var32;
                     if (var6 == 5) {
                        var29 = 16;
                        var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                        if (0L != var30) {
                           var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2;
                        }

                        if (var15.animationId == -1 && var15.transforms == null) {
                           var32 = var15.getModel(4, var5, var22, var24, var23, var25);
                        } else {
                           var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                        }

                        var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field521[var5], 0, var29 * Tiles.field523[var5], var29 * Tiles.field527[var5], var26, var28);
                     } else if (var6 == 6) {
                        var29 = 8;
                        var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                        if (var30 != 0L) {
                           var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2 / 2;
                        }

                        if (var15.animationId == -1 && var15.transforms == null) {
                           var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                        }

                        var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field525[var5], var29 * Tiles.field526[var5], var26, var28);
                     } else if (var6 == 7) {
                        int var35 = var5 + 2 & 3;
                        if (var15.animationId == -1 && var15.transforms == null) {
                           var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
                        } else {
                           var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                        }

                        var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28);
                     } else if (var6 == 8) {
                        var29 = 8;
                        var30 = var41.getBoundaryObjectTag(var0, var2, var3);
                        if (var30 != 0L) {
                           var29 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var30)).int2 / 2;
                        }

                        int var34 = var5 + 2 & 3;
                        Object var33;
                        if (var15.animationId == -1 && var15.transforms == null) {
                           var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
                           var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                           var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
                        }

                        var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field525[var5], var29 * Tiles.field526[var5], var26, var28);
                     }
                  }
               }
            } else {
               if (var15.animationId == -1 && var15.transforms == null) {
                  var36 = var15.getModel(10, var5, var22, var24, var23, var25);
               } else {
                  var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.field3429, (Renderable)null);
               }

               if (var36 != null) {
                  var41.method3400(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
               }

               if (var15.interactType != 0) {
                  var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
               }
            }
         }
      }

   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "(ZLkd;B)V",
      garbageValue = "100"
   )
   static final void method4174(boolean var0, PacketBuffer var1) {
      while(true) {
         if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
            int var2 = var1.readBits(15);
            if (var2 != 32767) {
               boolean var3 = false;
               if (Client.npcs[var2] == null) {
                  Client.npcs[var2] = new NPC();
                  var3 = true;
               }

               NPC var4 = Client.npcs[var2];
               Client.npcIndices[++Client.npcCount - 1] = var2;
               var4.npcCycle = Client.cycle;
               int var5;
               if (var0) {
                  var5 = var1.readBits(8);
                  if (var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.readBits(5);
                  if (var5 > 15) {
                     var5 -= 32;
                  }
               }

               var4.definition = class90.getNpcDefinition(var1.readBits(14));
               int var6 = Client.defaultRotations[var1.readBits(3)];
               if (var3) {
                  var4.orientation = var4.rotation = var6;
               }

               int var7 = var1.readBits(1);
               if (var7 == 1) {
                  Client.field697[++Client.field725 - 1] = var2;
               }

               int var8 = var1.readBits(1);
               int var9;
               if (var0) {
                  var9 = var1.readBits(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.readBits(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               var4.field1007 = var4.definition.size;
               var4.field1006 = var4.definition.rotation;
               if (var4.field1006 == 0) {
                  var4.rotation = 0;
               }

               var4.walkSequence = var4.definition.walkSequence;
               var4.walkBackSequence = var4.definition.walkBackSequence;
               var4.walkLeftSequence = var4.definition.walkLeftSequence;
               var4.walkRightSequence = var4.definition.walkRightSequence;
               var4.idleSequence = var4.definition.idleSequence;
               var4.turnLeftSequence = var4.definition.turnLeftSequence;
               var4.turnRightSequence = var4.definition.turnRightSequence;
               var4.method2181(UserComparator9.localPlayer.pathX[0] + var5, UserComparator9.localPlayer.pathY[0] + var9, var8 == 1);
               continue;
            }
         }

         var1.exportIndex();
         return;
      }
   }
}
