import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
   @ObfuscatedName("by")
   static String field1123;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -474193537
   )
   @Export("regionXLow")
   int regionXLow;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1952285401
   )
   @Export("regionYLow")
   int regionYLow;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1560078681
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 549708301
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -814742029
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2075507241
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1715718119
   )
   @Export("groupId")
   int groupId;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -2119420619
   )
   @Export("fileId")
   int fileId;
   @ObfuscatedName("e")
   @Export("floorUnderlayIds")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("x")
   @Export("floorOverlayIds")
   short[][][] floorOverlayIds;
   @ObfuscatedName("d")
   byte[][][] field154;
   @ObfuscatedName("k")
   byte[][][] field155;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[[[[Lv;"
   )
   @Export("decorations")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("i")
   boolean field157;
   @ObfuscatedName("a")
   boolean field153;

   AbstractWorldMapData() {
      this.groupId = -1;
      this.fileId = -1;
      new LinkedList();
      this.field157 = false;
      this.field153 = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgr;I)V",
      garbageValue = "1937224298"
   )
   @Export("readGeography")
   abstract void readGeography(Buffer var1);

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-947070877"
   )
   @Export("isFullyLoaded")
   boolean isFullyLoaded() {
      return this.field157 && this.field153;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lir;B)V",
      garbageValue = "-108"
   )
   @Export("loadGeography")
   void loadGeography(AbstractArchive var1) {
      if (!this.isFullyLoaded()) {
         byte[] var2 = var1.takeFile(this.groupId, this.fileId);
         if (var2 != null) {
            this.readGeography(new Buffer(var2));
            this.field157 = true;
            this.field153 = true;
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2111523326"
   )
   @Export("reset")
   void reset() {
      this.floorUnderlayIds =(short[][][])null;
      this.floorOverlayIds = (short[][][])null;
      this.field154 =(byte[][][])null;
      this.field155 =(byte[][][])null;
      this.decorations = (WorldMapDecoration[][][][])null;
      this.field157 = false;
      this.field153 = false;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(IILgr;I)V",
      garbageValue = "-1039890176"
   )
   @Export("readTile")
   void readTile(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method260(var1, var2, var3, var4);
         } else {
            this.method257(var1, var2, var3, var4);
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IILgr;IB)V",
      garbageValue = "34"
   )
   void method260(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(IILgr;II)V",
      garbageValue = "1538895535"
   )
   void method257(int x, int y, Buffer var3, int tileSettings) {
      int var5 = ((tileSettings & 24) >> 3) + 1;
      boolean var6 = (tileSettings & 2) != 0;
      boolean var7 = (tileSettings & 4) != 0;
      this.floorUnderlayIds[0][x][y] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var10;
      if (var6) {
         var8 = var3.readUnsignedByte();

         for (var9 = 0; var9 < var8; ++var9) {
            int var11 = var3.readUnsignedByte();
            if (var11 != 0) {
               this.floorOverlayIds[var9][x][y] = (short)var11;
               var10 = var3.readUnsignedByte();
               this.field154[var9][x][y] = (byte)(var10 >> 2);
               this.field155[var9][x][y] = (byte)(var10 & 3);
            }
         }
      }

      if (var7) {
         for (var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if (var9 != 0) {
               WorldMapDecoration[] var14 = this.decorations[var8][x][y] = new WorldMapDecoration[var9];

               for (var10 = 0; var10 < var9; ++var10) {
                  int var12 = var3.method51();
                  int var13 = var3.readUnsignedByte();
                  var14[var10] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1061931388"
   )
   @Export("getRegionX")
   int getRegionX() {
      return this.regionX;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-128"
   )
   @Export("getRegionY")
   int getRegionY() {
      return this.regionY;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lhx;B)V",
      garbageValue = "-3"
   )
   static final void method293(PacketBuffer var0) {
      for (int var1 = 0; var1 < Players.field736; ++var1) {
         int var2 = Players.field737[var1];
         Player var3 = Client.players[var2];
         int var4 = var0.readUnsignedByte();
         if ((var4 & 8) != 0) {
            var4 += var0.readUnsignedByte() << 8;
         }

         byte var5 = -1;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if ((var4 & 64) != 0) {
            var6 = var0.method58();
            int var11;
            int var12;
            int var13;
            if (var6 > 0) {
               for (var7 = 0; var7 < var6; ++var7) {
                  var8 = -1;
                  var9 = -1;
                  var12 = -1;
                  var11 = var0.readUShortSmart();
                  if (var11 == 32767) {
                     var11 = var0.readUShortSmart();
                     var9 = var0.readUShortSmart();
                     var8 = var0.readUShortSmart();
                     var12 = var0.readUShortSmart();
                  } else if (var11 != 32766) {
                     var9 = var0.readUShortSmart();
                  } else {
                     var11 = -1;
                  }

                  var13 = var0.readUShortSmart();
                  var3.addHitSplat(var11, var9, var8, var12, Client.cycle, var13);
               }
            }

            var7 = var0.readUnsignedByteNegate();
            if (var7 > 0) {
               for (var11 = 0; var11 < var7; ++var11) {
                  var8 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  if (var9 != 32767) {
                     var12 = var0.readUShortSmart();
                     var13 = var0.method58();
                     var10 = var9 > 0 ? var0.readUnsignedByte() : var13;
                     var3.addHealthBar(var8, Client.cycle, var9, var12, var13, var10);
                  } else {
                     var3.removeHealthBar(var8);
                  }
               }
            }
         }

         if ((var4 & 512) != 0) {
            var3.spotAnimation = var0.method67();
            var6 = var0.method72();
            var3.heightOffset = var6 >> 16;
            var3.field14 = (var6 & 65535) + Client.cycle;
            var3.spotAnimationFrame = 0;
            var3.spotAnimationFrameCycle = 0;
            if (var3.field14 > Client.cycle) {
               var3.spotAnimationFrame = -1;
            }

            if (var3.spotAnimation == 65535) {
               var3.spotAnimation = -1;
            }
         }

         if ((var4 & 4096) != 0) {
            var5 = var0.method60();
         }

         if ((var4 & 1024) != 0) {
            var3.field15 = var0.method62();
            var3.field17 = var0.method60();
            var3.field16 = var0.method60();
            var3.field18 = var0.method62();
            var3.field19 = var0.method66() + Client.cycle;
            var3.field20 = var0.method65() + Client.cycle;
            var3.field21 = var0.readUnsignedShort();
            if (var3.field725) {
               var3.field15 += var3.tileX;
               var3.field17 += var3.tileY;
               var3.field16 += var3.tileX;
               var3.field18 += var3.tileY;
               var3.pathLength = 0;
            } else {
               var3.field15 += var3.pathX[0];
               var3.field17 += var3.pathY[0];
               var3.field16 += var3.pathX[0];
               var3.field18 += var3.pathY[0];
               var3.pathLength = 1;
            }

            var3.field25 = 0;
         }

         if ((var4 & 32) != 0) {
            var3.overheadText = var0.readStringCp1252NullTerminated();
            if (var3.overheadText.charAt(0) == '~') {
               var3.overheadText = var3.overheadText.substring(1);
               WorldMapIcon_0.addGameMessage(2, var3.username.getName(), var3.overheadText);
            } else if (var3 == Canvas.localPlayer) {
               WorldMapIcon_0.addGameMessage(2, var3.username.getName(), var3.overheadText);
            }

            var3.isAutoChatting = false;
            var3.overheadTextColor = 0;
            var3.overheadTextEffect = 0;
            var3.overheadTextCyclesRemaining = 150;
         }

         if ((var4 & 4) != 0) {
            var3.field12 = var0.method65();
            if (var3.pathLength == 0) {
               var3.orientation = var3.field12;
               var3.field12 = -1;
            }
         }

         if ((var4 & 1) != 0) {
            var6 = var0.method59();
            byte[] var15 = new byte[var6];
            Buffer var16 = new Buffer(var15);
            var0.method74(var15, 0, var6);
            Players.field733[var2] = var16;
            var3.read(var16);
         }

         if ((var4 & 2) != 0) {
            var3.targetIndex = var0.method66();
            if (var3.targetIndex == 65535) {
               var3.targetIndex = -1;
            }
         }

         if ((var4 & 2048) != 0) {
            Players.field732[var2] = var0.method60();
         }

         if ((var4 & 16) != 0) {
            var6 = var0.method66();
            PlayerType var17 = (PlayerType)ScriptFrame.findEnumerated(class48.PlayerType_values(), var0.readUnsignedByte());
            boolean var18 = var0.readUnsignedByteNegate() == 1;
            var8 = var0.readUnsignedByte();
            var9 = var0.index;
            if (var3.username != null && var3.appearance != null) {
               boolean var19 = false;
               if (var17.isUser && WorldMapArea.friendSystem.isIgnored(var3.username)) {
                  var19 = true;
               }

               if (!var19 && Client.field208 == 0 && !var3.isHidden) {
                  Players.field738.index = 0;
                  var0.readBytes(Players.field738.array, 0, var8);
                  Players.field738.index = 0;
                  String var14 = AbstractFont.escapeBrackets(class233.method4527(KitDefinition.method4866(Players.field738)));
                  var3.overheadText = var14.trim();
                  var3.overheadTextColor = var6 >> 8;
                  var3.overheadTextEffect = var6 & 255;
                  var3.overheadTextCyclesRemaining = 150;
                  var3.isAutoChatting = var18;
                  var3.field11 = var3 != Canvas.localPlayer && var17.isUser && "" != Client.field158 && var14.toLowerCase().indexOf(Client.field158) == -1;
                  if (var17.isPrivileged) {
                     var10 = var18 ? 91 : 1;
                  } else {
                     var10 = var18 ? 90 : 2;
                  }

                  if (var17.modIcon != -1) {
                     WorldMapIcon_0.addGameMessage(var10, ItemContainer.method1170(var17.modIcon) + var3.username.getName(), var14);
                  } else {
                     WorldMapIcon_0.addGameMessage(var10, var3.username.getName(), var14);
                  }
               }
            }

            var0.index = var9 + var8;
         }

         if ((var4 & 256) != 0) {
            for (var6 = 0; var6 < 3; ++var6) {
               var3.actions[var6] = var0.readStringCp1252NullTerminated();
            }
         }

         if ((var4 & 128) != 0) {
            var6 = var0.readUnsignedShort();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var0.readUnsignedByte();
            class234.performPlayerAnimation(var3, var6, var7);
         }

         if (var3.field725) {
            if (var5 == 127) {
               var3.resetPath(var3.tileX, var3.tileY);
            } else {
               byte var20;
               if (var5 != -1) {
                  var20 = var5;
               } else {
                  var20 = Players.field732[var2];
               }

               var3.method254(var3.tileX, var3.tileY, var20);
            }
         }
      }

   }
}
