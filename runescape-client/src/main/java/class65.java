import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class65 extends RouteStrategy {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lcz;"
   )
   @Export("pcmPlayerProvider")
   public static PcmPlayerProvider pcmPlayerProvider;
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   @Export("scene")
   static Scene scene;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIILfy;I)Z",
      garbageValue = "-519225044"
   )
   protected boolean vmethod3644(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(Lbz;II)V",
      garbageValue = "406386718"
   )
   static final void method1232(Actor var0, int var1) {
      if (var0.field19 > Client.cycle) {
         SpriteIds.method5828(var0);
      } else {
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         if (var0.field20 >= Client.cycle) {
            if (var0.field20 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > WorldMapAreaData.getSequenceDefinition(var0.sequence).frameLengths[var0.sequenceFrame]) {
               var2 = var0.field20 - var0.field19;
               var3 = Client.cycle - var0.field19;
               var4 = var0.field15 * 128 + var0.size * 64;
               var5 = var0.field17 * 128 + var0.size * 64;
               int var7 = var0.field16 * 128 + var0.size * 64;
               var6 = var0.field18 * 128 + var0.size * 64;
               var0.x = (var3 * var7 + var4 * (var2 - var3)) / var2;
               var0.y = (var3 * var6 + var5 * (var2 - var3)) / var2;
            }

            var0.field24 = 0;
            var0.orientation = var0.field21;
            var0.field9 = var0.orientation;
         } else {
            var0.movementSequence = var0.idleSequence;
            if (var0.pathLength == 0) {
               var0.field24 = 0;
            } else {
               label225: {
                  if (var0.sequence != -1 && var0.sequenceDelay == 0) {
                     SequenceDefinition var11 = WorldMapAreaData.getSequenceDefinition(var0.sequence);
                     if (var0.field25 > 0 && var11.field781 == 0) {
                        ++var0.field24;
                        break label225;
                     }

                     if (var0.field25 <= 0 && var11.field782 == 0) {
                        ++var0.field24;
                        break label225;
                     }
                  }

                  var2 = var0.x;
                  var3 = var0.y;
                  var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.size * 64;
                  var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.size * 64;
                  if (var2 < var4) {
                     if (var3 < var5) {
                        var0.orientation = 1280;
                     } else if (var3 > var5) {
                        var0.orientation = 1792;
                     } else {
                        var0.orientation = 1536;
                     }
                  } else if (var2 > var4) {
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
                  if (var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
                     var6 = var0.orientation - var0.field9 & 2047;
                     if (var6 > 1024) {
                        var6 -= 2048;
                     }

                     int var8 = var0.walkTurnSequence;
                     if (var6 >= -256 && var6 <= 256) {
                        var8 = var0.walkSequence;
                     } else if (var6 >= 256 && var6 < 768) {
                        var8 = var0.walkTurnRightSequence;
                     } else if (var6 >= -768 && var6 <= -256) {
                        var8 = var0.walkTurnLeftSequence;
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
                        if (var0.field9 != var0.orientation && var0.targetIndex == -1 && var0.field23 != 0) {
                           var9 = 2;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 3) {
                           var9 = 8;
                        }

                        if (var0.field24 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field24;
                        }
                     } else {
                        if (var0.pathLength > 1) {
                           var9 = 6;
                        }

                        if (var0.pathLength > 2) {
                           var9 = 8;
                        }

                        if (var0.field24 > 0 && var0.pathLength > 1) {
                           var9 = 8;
                           --var0.field24;
                        }
                     }

                     if (var12 == 2) {
                        var9 <<= 1;
                     }

                     if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
                        var0.movementSequence = var0.runSequence;
                     }

                     if (var2 != var4 || var5 != var3) {
                        if (var2 < var4) {
                           var0.x += var9;
                           if (var0.x > var4) {
                              var0.x = var4;
                           }
                        } else if (var2 > var4) {
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
                        if (var0.field25 > 0) {
                           --var0.field25;
                        }
                     }
                  } else {
                     var0.x = var4;
                     var0.y = var5;
                     --var0.pathLength;
                     if (var0.field25 > 0) {
                        --var0.field25;
                     }
                  }
               }
            }
         }
      }

      if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field19 = 0;
         var0.field20 = 0;
         var0.x = var0.pathX[0] * 128 + var0.size * 64;
         var0.y = var0.pathY[0] * 128 + var0.size * 64;
         var0.method23();
      }

      if (Canvas.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
         var0.sequence = -1;
         var0.spotAnimation = -1;
         var0.field19 = 0;
         var0.field20 = 0;
         var0.x = var0.pathX[0] * 128 + var0.size * 64;
         var0.y = var0.pathY[0] * 128 + var0.size * 64;
         var0.method23();
      }

      IndexStoreAction.method4553(var0);
      ChatChannel.method2225(var0);
   }
}
