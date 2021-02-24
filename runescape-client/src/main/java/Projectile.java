import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("bv")
   static String field1254;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -755996103
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1141398545
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 877328381
   )
   @Export("sourceX")
   int sourceX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1822373019
   )
   @Export("sourceY")
   int sourceY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -584501537
   )
   @Export("sourceZ")
   int sourceZ;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1427536699
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1057628543
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1465417479
   )
   @Export("cycleEnd")
   int cycleEnd;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1352197335
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1830330659
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 165397127
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("b")
   @Export("isMoving")
   boolean isMoving = false;
   @ObfuscatedName("a")
   @Export("x")
   double x;
   @ObfuscatedName("w")
   @Export("y")
   double y;
   @ObfuscatedName("k")
   @Export("z")
   double z;
   @ObfuscatedName("i")
   @Export("speedX")
   double speedX;
   @ObfuscatedName("x")
   @Export("speedY")
   double speedY;
   @ObfuscatedName("f")
   @Export("speed")
   double speed;
   @ObfuscatedName("g")
   @Export("speedZ")
   double speedZ;
   @ObfuscatedName("u")
   @Export("accelerationZ")
   double accelerationZ;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1955217023
   )
   @Export("yaw")
   int yaw;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2095511803
   )
   @Export("pitch")
   int pitch;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 900549733
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 404929191
   )
   @Export("frameCycle")
   int frameCycle = 0;

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.id = var1;
      this.plane = var2;
      this.sourceX = var3;
      this.sourceY = var4;
      this.sourceZ = var5;
      this.cycleStart = var6;
      this.cycleEnd = var7;
      this.slope = var8;
      this.startHeight = var9;
      this.targetIndex = var10;
      this.endHeight = var11;
      this.isMoving = false;
      int var12 = AbstractUserComparator.SpotAnimationDefinition_get(this.id).sequence;
      if (var12 != -1) {
         this.sequenceDefinition = InterfaceParent.SequenceDefinition_get(var12);
      } else {
         this.sequenceDefinition = null;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "101"
   )
   @Export("setDestination")
   final void setDestination(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double)(var1 - this.sourceX);
         double var7 = (double)(var2 - this.sourceY);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
         this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
         this.z = (double)this.sourceZ;
      }

      var5 = (double)(this.cycleEnd + 1 - var4);
      this.speedX = ((double)var1 - this.x) / var5;
      this.speedY = ((double)var2 - this.y) / var5;
      this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
      }

      this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "114"
   )
   @Export("advance")
   final void advance(int var1) {
      this.isMoving = true;
      this.x += (double)var1 * this.speedX;
      this.y += this.speedY * (double)var1;
      this.z += (double)var1 * 0.5D * this.accelerationZ * (double)var1 + this.speedZ * (double)var1;
      this.speedZ += (double)var1 * this.accelerationZ;
      this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
      this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
      if (this.sequenceDefinition != null) {
         this.frameCycle += var1;

         while(true) {
            do {
               do {
                  if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
                     return;
                  }

                  this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
                  ++this.frame;
               } while(this.frame < this.sequenceDefinition.frameIds.length);

               this.frame -= this.sequenceDefinition.frameCount;
            } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

            this.frame = 0;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = AbstractUserComparator.SpotAnimationDefinition_get(this.id);
      Model var2 = var1.getModel(this.frame);
      if (var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.pitch);
         return var2;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "23"
   )
   public static void method2255(String var0, String var1, int var2, int var3) throws IOException {
      JagexCache.idxCount = var3;
      JagexCache.cacheGamebuild = var2;

      try {
         JagexCache.field2065 = System.getProperty("os.name");
      } catch (Exception var28) {
         JagexCache.field2065 = "Unknown";
      }

      GZipDecompressor.field4046 = JagexCache.field2065.toLowerCase();

      try {
         JagexCache.userHomeDirectory = System.getProperty("user.home");
         if (JagexCache.userHomeDirectory != null) {
            JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
         }
      } catch (Exception var27) {
         ;
      }

      try {
         if (GZipDecompressor.field4046.startsWith("win")) {
            if (JagexCache.userHomeDirectory == null) {
               JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
            }
         } else if (JagexCache.userHomeDirectory == null) {
            JagexCache.userHomeDirectory = System.getenv("HOME");
         }

         if (JagexCache.userHomeDirectory != null) {
            JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
         }
      } catch (Exception var26) {
         ;
      }

      if (JagexCache.userHomeDirectory == null) {
         JagexCache.userHomeDirectory = "~/";
      }

      class224.field2576 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
      Timer.field3621 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
      int var18 = 0;

      label250:
      while(var18 < 4) {
         String var6 = var18 == 0 ? "" : "" + var18;
         JagexCache.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
         String var7 = null;
         String var8 = null;
         boolean var9 = false;
         Buffer var11;
         File var33;
         if (JagexCache.JagexCache_locationFile.exists()) {
            try {
               AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

               int var12;
               for(var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) {
                  var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
                  if (var12 == -1) {
                     throw new IOException();
                  }
               }

               var11.offset = 0;
               var12 = var11.readUnsignedByte();
               if (var12 < 1 || var12 > 3) {
                  throw new IOException("" + var12);
               }

               int var13 = 0;
               if (var12 > 1) {
                  var13 = var11.readUnsignedByte();
               }

               if (var12 <= 2) {
                  var7 = var11.readStringCp1252NullCircumfixed();
                  if (var13 == 1) {
                     var8 = var11.readStringCp1252NullCircumfixed();
                  }
               } else {
                  var7 = var11.readCESU8();
                  if (var13 == 1) {
                     var8 = var11.readCESU8();
                  }
               }

               var10.close();
            } catch (IOException var30) {
               var30.printStackTrace();
            }

            if (var7 != null) {
               var33 = new File(var7);
               if (!var33.exists()) {
                  var7 = null;
               }
            }

            if (var7 != null) {
               var33 = new File(var7, "test.dat");
               if (!class23.method235(var33, true)) {
                  var7 = null;
               }
            }
         }

         if (var7 == null && var18 == 0) {
            label225:
            for(int var19 = 0; var19 < Timer.field3621.length; ++var19) {
               for(int var20 = 0; var20 < class224.field2576.length; ++var20) {
                  File var21 = new File(class224.field2576[var20] + Timer.field3621[var19] + File.separatorChar + var0 + File.separatorChar);
                  if (var21.exists() && class23.method235(new File(var21, "test.dat"), true)) {
                     var7 = var21.toString();
                     var9 = true;
                     break label225;
                  }
               }
            }
         }

         if (var7 == null) {
            var7 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var9 = true;
         }

         File var32;
         if (var8 != null) {
            var32 = new File(var8);
            var33 = new File(var7);

            try {
               File[] var35 = var32.listFiles();
               File[] var22 = var35;

               for(int var14 = 0; var14 < var22.length; ++var14) {
                  File var15 = var22[var14];
                  File var16 = new File(var33, var15.getName());
                  boolean var17 = var15.renameTo(var16);
                  if (!var17) {
                     throw new IOException();
                  }
               }
            } catch (Exception var29) {
               var29.printStackTrace();
            }

            var9 = true;
         }

         if (var9) {
            var32 = new File(var7);
            var11 = null;

            try {
               AccessFile var36 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
               Buffer var37 = new Buffer(500);
               var37.writeByte(3);
               var37.writeByte(var11 != null ? 1 : 0);
               var37.writeCESU8(var32.getPath());
               if (var11 != null) {
                  var37.writeCESU8("");
               }

               var36.write(var37.array, 0, var37.offset);
               var36.close();
            } catch (IOException var25) {
               var25.printStackTrace();
            }
         }

         File var5 = new File(var7);
         JagexCache.cacheDir = var5;
         if (!JagexCache.cacheDir.exists()) {
            JagexCache.cacheDir.mkdirs();
         }

         File[] var31 = JagexCache.cacheDir.listFiles();
         if (var31 != null) {
            File[] var34 = var31;

            for(int var23 = 0; var23 < var34.length; ++var23) {
               File var24 = var34[var23];
               if (!class23.method235(var24, false)) {
                  ++var18;
                  continue label250;
               }
            }
         }
         break;
      }

      class3.method36(JagexCache.cacheDir);
      Varcs.method2346();
      JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      WorldMapEvent.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

      for(var18 = 0; var18 < JagexCache.idxCount; ++var18) {
         WorldMapEvent.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "-22"
   )
   public static byte[] method2260() {
      byte[] var0 = new byte[24];

      try {
         JagexCache.JagexCache_randomDat.seek(0L);
         JagexCache.JagexCache_randomDat.readFully(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
            ;
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-87"
   )
   static final void method2262(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field816[var4] = true;
         }
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "2"
   )
   @Export("addSceneMenuOptions")
   static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
      if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
         WorldMapManager.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;

      int var8;
      for(var8 = 0; var8 < AbstractWorldMapData.method342(); ++var8) {
         long var22 = ObjectSound.method2044(var8);
         if (var22 != var6) {
            var6 = var22;
            int var11 = class200.method3865(var8);
            int var12 = NPC.method2179(var8);
            int var13 = FontName.method5502(ViewportMouse.ViewportMouse_entityTags[var8]);
            int var15 = AbstractWorldMapIcon.method710(var8);
            if (var13 == 2 && MilliClock.scene.getObjectFlags(class90.Client_plane, var11, var12, var22) >= 0) {
               ObjectComposition var16 = WorldMapAreaData.getObjectDefinition(var15);
               if (var16.transforms != null) {
                  var16 = var16.transform();
               }

               if (var16 == null) {
                  continue;
               }

               if (Client.isItemSelected == 1) {
                  WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(65535) + var16.name, 1, var15, var11, var12);
               } else if (Client.isSpellSelected) {
                  if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 4) == 4) {
                     WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(65535) + var16.name, 2, var15, var11, var12);
                  }
               } else {
                  String[] var17 = var16.actions;
                  if (var17 != null) {
                     for(int var18 = 4; var18 >= 0; --var18) {
                        if (var17[var18] != null) {
                           short var19 = 0;
                           if (var18 == 0) {
                              var19 = 3;
                           }

                           if (var18 == 1) {
                              var19 = 4;
                           }

                           if (var18 == 2) {
                              var19 = 5;
                           }

                           if (var18 == 3) {
                              var19 = 6;
                           }

                           if (var18 == 4) {
                              var19 = 1001;
                           }

                           WorldMapManager.insertMenuItemNoShift(var17[var18], FileSystem.colorStartTag(65535) + var16.name, var19, var15, var11, var12);
                        }
                     }
                  }

                  WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12);
               }
            }

            Player var20;
            int var24;
            NPC var25;
            int var32;
            int[] var33;
            if (var13 == 1) {
               NPC var28 = Client.npcs[var15];
               if (var28 == null) {
                  continue;
               }

               if (var28.definition.size == 1 && (var28.x & 127) == 64 && (var28.y & 127) == 64) {
                  for(var24 = 0; var24 < Client.npcCount; ++var24) {
                     var25 = Client.npcs[Client.npcIndices[var24]];
                     if (var25 != null && var25 != var28 && var25.definition.size == 1 && var25.x == var28.x && var25.y == var28.y) {
                        GameBuild.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
                     }
                  }

                  var24 = Players.Players_count;
                  var33 = Players.Players_indices;

                  for(var32 = 0; var32 < var24; ++var32) {
                     var20 = Client.players[var33[var32]];
                     if (var20 != null && var20.x == var28.x && var20.y == var28.y) {
                        GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var20, var33[var32], var11, var12);
                     }
                  }
               }

               GameBuild.addNpcToMenu(var28.definition, var15, var11, var12);
            }

            if (var13 == 0) {
               Player var29 = Client.players[var15];
               if (var29 == null) {
                  continue;
               }

               if ((var29.x & 127) == 64 && (var29.y & 127) == 64) {
                  for(var24 = 0; var24 < Client.npcCount; ++var24) {
                     var25 = Client.npcs[Client.npcIndices[var24]];
                     if (var25 != null && var25.definition.size == 1 && var29.x == var25.x && var29.y == var25.y) {
                        GameBuild.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
                     }
                  }

                  var24 = Players.Players_count;
                  var33 = Players.Players_indices;

                  for(var32 = 0; var32 < var24; ++var32) {
                     var20 = Client.players[var33[var32]];
                     if (var20 != null && var29 != var20 && var20.x == var29.x && var20.y == var29.y) {
                        GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var20, var33[var32], var11, var12);
                     }
                  }
               }

               if (var15 != Client.combatTargetPlayerIndex) {
                  GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var29, var15, var11, var12);
               } else {
                  var4 = var22;
               }
            }

            if (var13 == 3) {
               NodeDeque var31 = Client.groundItems[class90.Client_plane][var11][var12];
               if (var31 != null) {
                  for(TileItem var30 = (TileItem)var31.first(); var30 != null; var30 = (TileItem)var31.next()) {
                     ItemComposition var34 = class281.ItemDefinition_get(var30.id);
                     if (Client.isItemSelected == 1) {
                        WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var34.name, 16, var30.id, var11, var12);
                     } else if (Client.isSpellSelected) {
                        if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 1) == 1) {
                           WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var34.name, 17, var30.id, var11, var12);
                        }
                     } else {
                        String[] var26 = var34.groundActions;

                        for(int var27 = 4; var27 >= 0; --var27) {
                           if (var26 != null && var26[var27] != null) {
                              byte var21 = 0;
                              if (var27 == 0) {
                                 var21 = 18;
                              }

                              if (var27 == 1) {
                                 var21 = 19;
                              }

                              if (var27 == 2) {
                                 var21 = 20;
                              }

                              if (var27 == 3) {
                                 var21 = 21;
                              }

                              if (var27 == 4) {
                                 var21 = 22;
                              }

                              WorldMapManager.insertMenuItemNoShift(var26[var27], FileSystem.colorStartTag(16748608) + var34.name, var21, var30.id, var11, var12);
                           } else if (var27 == 2) {
                              WorldMapManager.insertMenuItemNoShift("Take", FileSystem.colorStartTag(16748608) + var34.name, 20, var30.id, var11, var12);
                           }
                        }

                        WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16748608) + var34.name, 1004, var30.id, var11, var12);
                     }
                  }
               }
            }
         }
      }

      if (var4 != -1L) {
         var8 = ReflectionCheck.method2451(var4);
         int var9 = GrandExchangeOfferNameComparator.Entity_unpackSceneX(var4);
         Player var10 = Client.players[Client.combatTargetPlayerIndex];
         GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9);
      }

   }
}
