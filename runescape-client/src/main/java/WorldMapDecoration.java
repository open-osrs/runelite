import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   static IndexedSprite field237;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 948104613
   )
   static int field235;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -406250939
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1381482747
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -102940373
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "792255319"
   )
   @Export("isNumber")
   public static boolean isNumber(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label83: {
            char var7 = var0.charAt(var6);
            if (var6 == 0) {
               if (var7 == '-') {
                  var2 = true;
                  break label83;
               }

               if (var7 == '+') {
                  break label83;
               }
            }

            int var9;
            if (var7 >= '0' && var7 <= '9') {
               var9 = var7 - 48;
            } else if (var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - 55;
            } else {
               if (var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 87;
            }

            if (var9 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var9 = -var9;
            }

            int var8 = var9 + var4 * 10;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkd;B)V",
      garbageValue = "13"
   )
   static final void method404(PacketBuffer var0) {
      int var1 = 0;
      var0.importIndex();

      int var2;
      int var4;
      int var5;
      for(var2 = 0; var2 < Players.Players_count; ++var2) {
         var5 = Players.Players_indices[var2];
         if ((Players.field1275[var5] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
            } else {
               var4 = var0.readBits(1);
               if (var4 == 0) {
                  var1 = class198.method3851(var0);
                  Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
               } else {
                  PendingSpawn.readPlayerUpdate(var0, var5);
               }
            }
         }
      }

      var0.exportIndex();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.importIndex();

         for(var2 = 0; var2 < Players.Players_count; ++var2) {
            var5 = Players.Players_indices[var2];
            if ((Players.field1275[var5] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
               } else {
                  var4 = var0.readBits(1);
                  if (var4 == 0) {
                     var1 = class198.method3851(var0);
                     Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                  } else {
                     PendingSpawn.readPlayerUpdate(var0, var5);
                  }
               }
            }
         }

         var0.exportIndex();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.importIndex();

            for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
               var5 = Players.Players_emptyIndices[var2];
               if ((Players.field1275[var5] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                  } else {
                     var4 = var0.readBits(1);
                     if (var4 == 0) {
                        var1 = class198.method3851(var0);
                        Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                     } else if (World.updateExternalPlayer(var0, var5)) {
                        Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                     }
                  }
               }
            }

            var0.exportIndex();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.importIndex();

               for(var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
                  var5 = Players.Players_emptyIndices[var2];
                  if ((Players.field1275[var5] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                     } else {
                        var4 = var0.readBits(1);
                        if (var4 == 0) {
                           var1 = class198.method3851(var0);
                           Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                        } else if (World.updateExternalPlayer(var0, var5)) {
                           Players.field1275[var5] = (byte)(Players.field1275[var5] | 2);
                        }
                     }
                  }
               }

               var0.exportIndex();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  Players.Players_count = 0;
                  Players.Players_emptyIdxCount = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     Players.field1275[var2] = (byte)(Players.field1275[var2] >> 1);
                     Player var3 = Client.players[var2];
                     if (var3 != null) {
                        Players.Players_indices[++Players.Players_count - 1] = var2;
                     } else {
                        Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1927290139"
   )
   static void method406(int var0) {
      Login.loginIndex = 12;
      Login.field1206 = var0;
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(IIIILlm;Lht;I)V",
      garbageValue = "-1757506186"
   )
   @Export("worldToMinimap")
   static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = Client.camAngleY & 2047;
         int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
         int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.width / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class236.redHintArrowSprite.method6393(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         AbstractArchive.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
      }

   }
}
