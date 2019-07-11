import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("sn")
   @ObfuscatedGetter(
      intValue = -1946112139
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("p")
   static int[] field1056;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2011838881
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1299225715
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 82600709
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -477370575
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -671345527
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 529427495
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -150870205
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1009718107
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1022177315
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1397517463
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -799353317
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1388959491
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1657956317
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1345061881
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lag;I)V",
      garbageValue = "1384899025"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea area) {
      if (area.regionLowX > this.newX) {
         area.regionLowX = this.newX;
      }

      if (area.regionHighX < this.newX) {
         area.regionHighX = this.newX;
      }

      if (area.regionLowY > this.newY) {
         area.regionLowY = this.newY;
      }

      if (area.regionHighY < this.newY) {
         area.regionHighY = this.newY;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "93"
   )
   @Export("containsCoord")
   public boolean containsCoord(int plane, int x, int y) {
      return plane >= this.oldZ && plane < this.oldZ + this.newZ ? x >= (this.oldX << 6) + (this.oldChunkXLow << 3) && x <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && y >= (this.oldY << 6) + (this.oldChunkYLow << 3) && y <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7 : false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "4"
   )
   @Export("containsPosition")
   public boolean containsPosition(int x, int y) {
      return x >= (this.newX << 6) + (this.newChunkXLow << 3) && x <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && y >= (this.newY << 6) + (this.newChunkYLow << 3) && y <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "1545934424"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int plane, int x, int y) {
      if (!this.containsCoord(plane, x, y)) {
         return null;
      } else {
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + x + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), y + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
         return var4;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)Lhu;",
      garbageValue = "-1916486802"
   )
   @Export("coord")
   public Coord coord(int x, int y) {
      if (!this.containsPosition(x, y)) {
         return null;
      } else {
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + x;
         int var4 = this.oldY * 64 - this.newY * 64 + y + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lgr;B)V",
      garbageValue = "-113"
   )
   @Export("read")
   public void read(Buffer buffer) {
      this.oldZ = buffer.readUnsignedByte();
      this.newZ = buffer.readUnsignedByte();
      this.oldX = buffer.readUnsignedShort();
      this.oldChunkXLow = buffer.readUnsignedByte();
      this.oldChunkXHigh = buffer.readUnsignedByte();
      this.oldY = buffer.readUnsignedShort();
      this.oldChunkYLow = buffer.readUnsignedByte();
      this.oldChunkYHigh = buffer.readUnsignedByte();
      this.newX = buffer.readUnsignedShort();
      this.newChunkXLow = buffer.readUnsignedByte();
      this.newChunkXHigh = buffer.readUnsignedByte();
      this.newY = buffer.readUnsignedShort();
      this.newChunkYLow = buffer.readUnsignedByte();
      this.newChunkYHigh = buffer.readUnsignedByte();
      this.postRead();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1967186894"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2102591569"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = LoginPacket.getPreferencesFile("", WorldMapRectangle.studioGame.name, true);
         Buffer var1 = ReflectionCheck.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.index);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
      }

   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1886145284"
   )
   static final void method245(int var0) {
      if (var0 >= 0) {
         int var1 = Client.menuArguments1[var0];
         int var2 = Client.menuArguments2[var0];
         int var3 = Client.menuOpcodes[var0];
         int var4 = Client.menuArguments0[var0];
         String var5 = Client.menuActions[var0];
         String var6 = Client.menuTargetNames[var0];
         Actor.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
      }

   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Lho;IIIIIII)V",
      garbageValue = "-1723792771"
   )
   static final void method246(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field188) {
         Client.field189 = 32;
      } else {
         Client.field189 = 0;
      }

      Client.field188 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !AbstractRasterProvider.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            WorldMapRectangle.method295(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            WorldMapRectangle.method295(var0);
         } else if (var5 >= var1 - Client.field189 && var5 < Client.field189 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            WorldMapRectangle.method295(var0);
            Client.field188 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            WorldMapRectangle.method295(var0);
         }
      }

   }
}
