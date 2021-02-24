import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1261462593
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 673564695
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1568075511
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1256357453
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1568273265
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1493611659
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1992152745
   )
   int field227;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 360944973
   )
   int field228;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1394856673
   )
   int field222;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1765677155
   )
   int field230;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lar;B)V",
      garbageValue = "112"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field227) {
         var1.regionLowX = this.field227;
      }

      if (var1.regionHighX < this.field222) {
         var1.regionHighX = this.field222;
      }

      if (var1.regionLowY > this.field228) {
         var1.regionLowY = this.field228;
      }

      if (var1.regionHighY < this.field230) {
         var1.regionHighY = this.field230;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "-90"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
      return var1 >> 6 >= this.field227 && var1 >> 6 <= this.field222 && var2 >> 6 >= this.field228 && var2 >> 6 <= this.field230;
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
         int[] var4 = new int[]{this.field227 * 64 - this.regionStartX * 64 + var2, var3 + (this.field228 * 64 - this.regionStartY * 64)};
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
         int var3 = this.regionStartX * 64 - this.field227 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field228 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-489268143"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field227 = var1.readUnsignedShort();
      this.field228 = var1.readUnsignedShort();
      this.field222 = var1.readUnsignedShort();
      this.field230 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "16256"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1722479891"
   )
   public static void method387() {
      try {
         JagexCache.JagexCache_dat2File.close();

         for(int var0 = 0; var0 < JagexCache.idxCount; ++var0) {
            WorldMapEvent.JagexCache_idxFiles[var0].close();
         }

         JagexCache.JagexCache_idx255File.close();
         JagexCache.JagexCache_randomDat.close();
      } catch (Exception var2) {
         ;
      }

   }

   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "815934971"
   )
   @Export("forceDisconnect")
   static final void forceDisconnect(int var0) {
      SecureRandomCallable.logOut();
      switch(var0) {
      case 1:
         Login.loginIndex = 24;
         InvDefinition.setLoginResponseString("", "You were disconnected from the server.", "");
         break;
      case 2:
         Login.loginIndex = 24;
         InvDefinition.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
      }

   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "8447233"
   )
   @Export("Widget_runOnTargetLeave")
   static void Widget_runOnTargetLeave() {
      if (Client.isSpellSelected) {
         Widget var0 = ArchiveLoader.getWidgetChild(MidiPcmStream.selectedSpellWidget, Client.selectedSpellChildIndex);
         if (var0 != null && var0.onTargetLeave != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.widget = var0;
            var1.args = var0.onTargetLeave;
            PacketWriter.runScriptEvent(var1);
         }

         Client.isSpellSelected = false;
         IsaacCipher.invalidateWidget(var0);
      }
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "(Lhz;B)V",
      garbageValue = "59"
   )
   static final void method401(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 324) {
         if (Client.field850 == -1) {
            Client.field850 = var0.spriteId2;
            Client.field927 = var0.spriteId;
         }

         if (Client.playerAppearance.isFemale) {
            var0.spriteId2 = Client.field850;
         } else {
            var0.spriteId2 = Client.field927;
         }

      } else if (var1 == 325) {
         if (Client.field850 == -1) {
            Client.field850 = var0.spriteId2;
            Client.field927 = var0.spriteId;
         }

         if (Client.playerAppearance.isFemale) {
            var0.spriteId2 = Client.field927;
         } else {
            var0.spriteId2 = Client.field850;
         }

      } else if (var1 == 327) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if (var1 == 328) {
         var0.modelAngleX = 150;
         var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }
}
