import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("Username")
public class Username implements Comparable {
   @ObfuscatedName("n")
   @Export("name")
   String name;
   @ObfuscatedName("v")
   @Export("cleanName")
   String cleanName;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lml;)V"
   )
   public Username(String var1, LoginType var2) {
      this.name = var1;
      String var4;
      if (var1 == null) {
         var4 = null;
      } else {
         label124: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && class281.method5194(var1.charAt(var5)); ++var5) {
               ;
            }

            while(var6 > var5 && class281.method5194(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               byte var9;
               if (var2 == null) {
                  var9 = 12;
               } else {
                  switch(var2.field4073) {
                  case 0:
                     var9 = 20;
                     break;
                  default:
                     var9 = 12;
                  }
               }

               if (var7 <= var9) {
                  StringBuilder var15 = new StringBuilder(var7);

                  for(int var17 = var5; var17 < var6; ++var17) {
                     char var10 = var1.charAt(var17);
                     boolean var11;
                     if (Character.isISOControl(var10)) {
                        var11 = false;
                     } else if (class225.isAlphaNumeric(var10)) {
                        var11 = true;
                     } else {
                        char[] var12 = class349.field4080;
                        int var13 = 0;

                        label91:
                        while(true) {
                           char var14;
                           if (var13 >= var12.length) {
                              var12 = class349.field4078;

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = var12[var13];
                                 if (var14 == var10) {
                                    var11 = true;
                                    break label91;
                                 }
                              }

                              var11 = false;
                              break;
                           }

                           var14 = var12[var13];
                           if (var10 == var14) {
                              var11 = true;
                              break;
                           }

                           ++var13;
                        }
                     }

                     if (var11) {
                        char var16;
                        switch(var10) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                           var16 = '_';
                           break;
                        case '#':
                        case '[':
                        case ']':
                           var16 = var10;
                           break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                           var16 = 'a';
                           break;
                        case 'Ç':
                        case 'ç':
                           var16 = 'c';
                           break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                           var16 = 'e';
                           break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                           var16 = 'i';
                           break;
                        case 'Ñ':
                        case 'ñ':
                           var16 = 'n';
                           break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                           var16 = 'o';
                           break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                           var16 = 'u';
                           break;
                        case 'ß':
                           var16 = 'b';
                           break;
                        case 'ÿ':
                        case 'Ÿ':
                           var16 = 'y';
                           break;
                        default:
                           var16 = Character.toLowerCase(var10);
                        }

                        if (var16 != 0) {
                           var15.append(var16);
                        }
                     }
                  }

                  if (var15.length() == 0) {
                     var4 = null;
                  } else {
                     var4 = var15.toString();
                  }
                  break label124;
               }
            }

            var4 = null;
         }
      }

      this.cleanName = var4;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1565783636"
   )
   @Export("getName")
   public String getName() {
      return this.name;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2035894536"
   )
   @Export("hasCleanName")
   public boolean hasCleanName() {
      return this.cleanName != null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkk;B)I",
      garbageValue = "120"
   )
   @Export("compareToTyped")
   public int compareToTyped(Username var1) {
      if (this.cleanName == null) {
         return var1.cleanName == null ? 0 : 1;
      } else {
         return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (var2.cleanName == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.cleanName == null ? 0 : this.cleanName.hashCode();
   }

   public int compareTo(Object var1) {
      return this.compareToTyped((Username)var1);
   }

   public String toString() {
      return this.getName();
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "296142419"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = MilliClock.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      if (var5 != 0L) {
         var7 = MilliClock.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (TileItem.method2265(var5)) {
            var10 = var4;
         }

         int[] var11 = GrandExchangeOfferAgeComparator.sceneMinimapSprite.pixels;
         var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var13 = class25.Entity_unpackID(var5);
         ObjectComposition var14 = WorldMapAreaData.getObjectDefinition(var13);
         if (var14.mapSceneId != -1) {
            IndexedSprite var15 = WorldMapSection1.mapSceneSprites[var14.mapSceneId];
            if (var15 != null) {
               int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
               int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
               var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 1) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var11[var12] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = MilliClock.scene.getGameObjectTag(var0, var1, var2);
      if (var5 != 0L) {
         var7 = MilliClock.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class25.Entity_unpackID(var5);
         ObjectComposition var24 = WorldMapAreaData.getObjectDefinition(var10);
         int var19;
         if (var24.mapSceneId != -1) {
            IndexedSprite var20 = WorldMapSection1.mapSceneSprites[var24.mapSceneId];
            if (var20 != null) {
               var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
               var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
               var20.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48);
            }
         } else if (var9 == 9) {
            var12 = 15658734;
            if (TileItem.method2265(var5)) {
               var12 = 15597568;
            }

            int[] var18 = GrandExchangeOfferAgeComparator.sceneMinimapSprite.pixels;
            var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var18[var19] = var12;
               var18[var19 + 1 + 512] = var12;
               var18[var19 + 1024 + 2] = var12;
               var18[var19 + 1536 + 3] = var12;
            } else {
               var18[var19 + 1536] = var12;
               var18[var19 + 1 + 1024] = var12;
               var18[var19 + 512 + 2] = var12;
               var18[var19 + 3] = var12;
            }
         }
      }

      var5 = MilliClock.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class25.Entity_unpackID(var5);
         ObjectComposition var21 = WorldMapAreaData.getObjectDefinition(var7);
         if (var21.mapSceneId != -1) {
            IndexedSprite var22 = WorldMapSection1.mapSceneSprites[var21.mapSceneId];
            if (var22 != null) {
               var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
               int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
               var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
            }
         }
      }

   }
}
