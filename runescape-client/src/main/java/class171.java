import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class171 implements class170 {
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = -853566565
   )
   @Export("port2")
   static int port2;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;IZI)Lel;",
      garbageValue = "-2064266261"
   )
   public static Frames method3642(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
      boolean var4 = true;
      int[] var5 = var0.getGroupFileIds(var2);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.getFile(var2, var5[var6]);
         if (var7 == null) {
            var4 = false;
         } else {
            int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9;
            if (var3) {
               var9 = var1.getFile(0, var8);
            } else {
               var9 = var1.getFile(var8, 0);
            }

            if (var9 == null) {
               var4 = false;
            }
         }
      }

      if (!var4) {
         return null;
      } else {
         try {
            return new Frames(var0, var1, var2, var3);
         } catch (Exception var11) {
            return null;
         }
      }
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "(Lcv;II)V",
      garbageValue = "478475301"
   )
   @Export("updateActorSequence")
   static final void updateActorSequence(Actor var0, int var1) {
      if (var0.field999 >= Client.cycle) {
         GrandExchangeEvent.method147(var0);
      } else {
         int var3;
         int var4;
         int var5;
         int var7;
         int var11;
         if (var0.field1000 >= Client.cycle) {
            if (var0.field1000 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > InterfaceParent.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
               var11 = var0.field1000 - var0.field999;
               var3 = Client.cycle - var0.field999;
               var4 = var0.field992 * 128 + var0.field1007 * 64;
               var5 = var0.field952 * 128 + var0.field1007 * 64;
               int var6 = var0.field996 * 128 + var0.field1007 * 64;
               var7 = var0.field998 * 128 + var0.field1007 * 64;
               var0.x = (var3 * var6 + var4 * (var11 - var3)) / var11;
               var0.y = (var3 * var7 + var5 * (var11 - var3)) / var11;
            }

            var0.field989 = 0;
            var0.orientation = var0.field1001;
            var0.rotation = var0.orientation;
         } else {
            var0.movementSequence = var0.idleSequence;
            if (var0.pathLength == 0) {
               var0.field989 = 0;
            } else {
               label280: {
                  if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                     SequenceDefinition var2 = InterfaceParent.SequenceDefinition_get(var0.sequence);
                     if (var0.field1012 > 0 && var2.field3564 == 0) {
                        ++var0.field989;
                        break label280;
                     }

                     if (var0.field1012 <= 0 && var2.field3565 == 0) {
                        ++var0.field989;
                        break label280;
                     }
                  }

                  var11 = var0.x;
                  var3 = var0.y;
                  var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1007 * 64;
                  var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1007 * 64;
                  if (var11 < var4) {
                     if (var3 < var5) {
                        var0.orientation = 1280;
                     } else if (var3 > var5) {
                        var0.orientation = 1792;
                     } else {
                        var0.orientation = 1536;
                     }
                  } else if (var11 > var4) {
                     if (var3 < var5) {
                        var0.orientation = 768;
                     } else if (var3 > var5) {
                        var0.orientation = 256;
                     } else {
                        var0.orientation = 512;
                     }
                  } else if (var3 < var5) {
                     var0.orientation = 1024;
                  } else if (var3 > var5) {
                     var0.orientation = 0;
                  }

                  byte var12 = var0.pathTraversed[var0.pathLength - 1];
                  if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var7 = var0.orientation - var0.rotation & 2047;
                     if (var7 > 1024) {
                        var7 -= 2048;
                     }

                     int var8 = var0.walkBackSequence;
                     if (var7 >= -256 && var7 <= 256) {
                        var8 = var0.walkSequence;
                     } else if (var7 >= 256 && var7 < 768) {
                        var8 = var0.walkRightSequence;
                     } else if (var7 >= -768 && var7 <= -256) {
                        var8 = var0.walkLeftSequence;
                     }

                     if (var8 == -1) {
                        var8 = var0.walkSequence;
                     }

                     var0.movementSequence = var8;
                     int var9 = 4;
                     boolean var10 = true;
                     if (var0 instanceof NPC) {
                        var10 = ((NPC)var0).definition.isClickable;
                     }

                     if (var10) {
                        if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1006 != 0) {
                           var9 = 2;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 3) {
                           var9 = 8;
                        }

                        if (var0.field989 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field989;
                        }
                     } else {
                        if (var0.pathLength > 1) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 8;
                        }

                        if (var0.field989 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field989;
                        }
                     }

                     if (var12 == 2) {
                        var9 <<= 1;
                     }

                     if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                        var0.movementSequence = var0.runSequence;
                     }

                     if (var4 != var11 || var5 != var3) {
                        if (var11 < var4) {
                           var0.x += var9;
                           if (var0.x > var4) {
                              var0.x = var4;
                           }
                        } else if (var11 > var4) {
                           var0.x -= var9;
                           if (var0.x < var4) {
                              var0.x = var4;
                           }
                        }

                        if (var3 < var5) {
                           var0.y += var9;
                           if (var0.y > var5) {
                              var0.y = var5;
                           }
                        } else if (var3 > var5) {
                           var0.y -= var9;
                           if (var0.y < var5) {
                              var0.y = var5;
                           }
                        }
                     }

                     if (var4 == var0.x && var5 == var0.y) {
                        --var0.pathLength;
                        if (var0.field1012 > 0) {
                           --var0.field1012;
                        }
                     }
                  } else {
                     var0.x = var4;
                     var0.y = var5;
                     --var0.pathLength;
                     if (var0.field1012 > 0) {
                        --var0.field1012;
                     }
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field999 = 0;
         var0.field1000 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1007 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1007 * 64;
         var0.method1848();
      }

      if (UserComparator9.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field999 = 0;
         var0.field1000 = 0;
         var0.x = var0.pathX[0] * 128 + var0.field1007 * 64;
         var0.y = var0.pathY[0] * 128 + var0.field1007 * 64;
         var0.method1848();
      }

      GameObject.method3453(var0);
      Players.method2286(var0);
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-654550315"
   )
   static final int method3639() {
      if (WorldMapSectionType.clientPreferences.roofsHidden) {
         return class90.Client_plane;
      } else {
         int var0 = WorldMapRegion.getTileHeight(SecureRandomFuture.cameraX, ObjectSound.cameraZ, class90.Client_plane);
         return var0 - ArchiveLoader.cameraY < 800 && (Tiles.Tiles_renderFlags[class90.Client_plane][SecureRandomFuture.cameraX >> 7][ObjectSound.cameraZ >> 7] & 4) != 0 ? class90.Client_plane : 3;
      }
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   static final void method3641(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      WorldMapSectionType.clientPreferences.soundEffectsVolume = var0;
      class23.savePreferences();
   }
}
