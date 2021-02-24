import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive12")
   static Archive archive12;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 132603253
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1994150525
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1137484745
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1490566699
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 2105987209
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 999326875
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 769253589
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 805585157
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 180055579
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -106119971
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1816013269
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2075610043
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 754853053
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1118736637
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lar;B)V",
      garbageValue = "112"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.newX) {
         var1.regionLowX = this.newX;
      }

      if (var1.regionHighX < this.newX) {
         var1.regionHighX = this.newX;
      }

      if (var1.regionLowY > this.newY) {
         var1.regionLowY = this.newY;
      }

      if (var1.regionHighY < this.newY) {
         var1.regionHighY = this.newY;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "-90"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
         return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
      } else {
         return false;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-5"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "-76"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
         return var4;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(III)Lhd;",
      garbageValue = "-1841969392"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-489268143"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.oldZ = var1.readUnsignedByte();
      this.newZ = var1.readUnsignedByte();
      this.oldX = var1.readUnsignedShort();
      this.oldChunkXLow = var1.readUnsignedByte();
      this.oldChunkXHigh = var1.readUnsignedByte();
      this.oldY = var1.readUnsignedShort();
      this.oldChunkYLow = var1.readUnsignedByte();
      this.oldChunkYHigh = var1.readUnsignedByte();
      this.newX = var1.readUnsignedShort();
      this.newChunkXLow = var1.readUnsignedByte();
      this.newChunkXHigh = var1.readUnsignedByte();
      this.newY = var1.readUnsignedShort();
      this.newChunkYLow = var1.readUnsignedByte();
      this.newChunkYHigh = var1.readUnsignedByte();
      this.postRead();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1652627756"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "705199058"
   )
   public static String method311(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var10 = var0[var1];
         return var10 == null ? "null" : var10.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var9 = var0[var5];
            if (var9 == null) {
               var4 += 4;
            } else {
               var4 += var9.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var4);

         for(int var6 = var1; var6 < var3; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var8.append("null");
            } else {
               var8.append(var7);
            }
         }

         return var8.toString();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIS)V",
      garbageValue = "16686"
   )
   static void method308(int var0, int var1, int var2, int var3) {
      for(ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
            int var5 = 0;
            if (var1 > var4.field1090 * 16384) {
               var5 += var1 - var4.field1090 * 16384;
            } else if (var1 < var4.x * 16384) {
               var5 += var4.x * 16384 - var1;
            }

            if (var2 > var4.field1094 * 16384) {
               var5 += var2 - var4.field1094 * 16384;
            } else if (var2 < var4.y * 16384) {
               var5 += var4.y * 16384 - var2;
            }

            if (var5 - 64 <= var4.field1092 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field1092 - var5) * WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / var4.field1092;
               if (var4.stream1 == null) {
                  if (var4.soundEffectId >= 0) {
                     SoundEffect var7 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, var4.soundEffectId, 0);
                     if (var7 != null) {
                        RawSound var8 = var7.toRawSound().resample(World.decimator);
                        RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
                        var9.setNumLoops(-1);
                        VarbitComposition.pcmStreamMixer.addSubStream(var9);
                        var4.stream1 = var9;
                     }
                  }
               } else {
                  var4.stream1.method2796(var6);
               }

               if (var4.stream2 == null) {
                  if (var4.soundEffectIds != null && (var4.field1097 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
                     SoundEffect var12 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, var4.soundEffectIds[var11], 0);
                     if (var12 != null) {
                        RawSound var13 = var12.toRawSound().resample(World.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
                        var10.setNumLoops(0);
                        VarbitComposition.pcmStreamMixer.addSubStream(var10);
                        var4.stream2 = var10;
                        var4.field1097 = var4.field1095 + (int)(Math.random() * (double)(var4.field1096 - var4.field1095));
                     }
                  }
               } else {
                  var4.stream2.method2796(var6);
                  if (!var4.stream2.hasNext()) {
                     var4.stream2 = null;
                  }
               }
            } else {
               if (var4.stream1 != null) {
                  VarbitComposition.pcmStreamMixer.removeSubStream(var4.stream1);
                  var4.stream1 = null;
               }

               if (var4.stream2 != null) {
                  VarbitComposition.pcmStreamMixer.removeSubStream(var4.stream2);
                  var4.stream2 = null;
               }
            }
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILeq;[Lfe;I)V",
      garbageValue = "2043009976"
   )
   static final void method310(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
      Buffer var10 = new Buffer(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method5704();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.readUShortSmart();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.readUnsignedByte();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               ObjectComposition var21 = WorldMapAreaData.getObjectDefinition(var11);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.sizeX;
               int var28 = var21.sizeY;
               int var29;
               if ((var20 & 1) == 1) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (var26 == 2) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var30 = var3 + DevicePcmPlayerProvider.method921(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                  int var31 = var1;
                  if ((Tiles.Tiles_renderFlags[1][var29][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  CollisionMap var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  GameEngine.method1134(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      descriptor = "(I)Lmf;",
      garbageValue = "355278253"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return SoundSystem.worldMap;
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-116"
   )
   @Export("doCheat")
   static final void doCheat(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         WorldMapSectionType.clientPreferences.roofsHidden = !WorldMapSectionType.clientPreferences.roofsHidden;
         class23.savePreferences();
         if (WorldMapSectionType.clientPreferences.roofsHidden) {
            AbstractWorldMapData.addGameMessage(99, "", "Roofs are now all hidden");
         } else {
            AbstractWorldMapData.addGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         Client.displayFps = !Client.displayFps;
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.renderSelf = !Client.renderSelf;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.showMouseOverText = !Client.showMouseOverText;
      }

      if (Client.staffModLevel >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            SoundSystem.worldMap.showCoord = !SoundSystem.worldMap.showCoord;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            Client.displayFps = true;
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            Client.displayFps = false;
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class8.method90();
         }
      }

      PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(var0.length() + 1);
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }
}
