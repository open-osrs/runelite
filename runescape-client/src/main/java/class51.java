import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class51 implements WorldMapSection {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -154485521
   )
   int field393;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1795008419
   )
   int field386;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 318861515
   )
   int field387;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1934336547
   )
   int field388;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1607101939
   )
   int field394;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 69269291
   )
   int field389;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -2008160761
   )
   int field391;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 294183149
   )
   int field392;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1713050183
   )
   int field385;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1407382949
   )
   int field390;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lar;B)V",
      garbageValue = "112"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field394) {
         var1.regionLowX = this.field394;
      }

      if (var1.regionHighX < this.field394) {
         var1.regionHighX = this.field394;
      }

      if (var1.regionLowY > this.field389) {
         var1.regionLowY = this.field389;
      }

      if (var1.regionHighY < this.field389) {
         var1.regionHighY = this.field389;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "-90"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.field393 && var1 < this.field386 + this.field393) {
         return var2 >= (this.field387 << 6) + (this.field391 << 3) && var2 <= (this.field387 << 6) + (this.field391 << 3) + 7 && var3 >= (this.field388 << 6) + (this.field392 << 3) && var3 <= (this.field388 << 6) + (this.field392 << 3) + 7;
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
      return var1 >= (this.field394 << 6) + (this.field385 << 3) && var1 <= (this.field394 << 6) + (this.field385 << 3) + 7 && var2 >= (this.field389 << 6) + (this.field390 << 3) && var2 <= (this.field389 << 6) + (this.field390 << 3) + 7;
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
         int[] var4 = new int[]{this.field394 * 64 - this.field387 * 64 + var2 + (this.field385 * 8 - this.field391 * 8), var3 + (this.field389 * 64 - this.field388 * 64) + (this.field390 * 8 - this.field392 * 8)};
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
         int var3 = this.field387 * 64 - this.field394 * 64 + (this.field391 * 8 - this.field385 * 8) + var1;
         int var4 = this.field388 * 64 - this.field389 * 64 + var2 + (this.field392 * 8 - this.field390 * 8);
         return new Coord(this.field393, var3, var4);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-489268143"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.field393 = var1.readUnsignedByte();
      this.field386 = var1.readUnsignedByte();
      this.field387 = var1.readUnsignedShort();
      this.field391 = var1.readUnsignedByte();
      this.field388 = var1.readUnsignedShort();
      this.field392 = var1.readUnsignedByte();
      this.field394 = var1.readUnsignedShort();
      this.field385 = var1.readUnsignedByte();
      this.field389 = var1.readUnsignedShort();
      this.field390 = var1.readUnsignedByte();
      this.method858();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   void method858() {
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Lib;",
      garbageValue = "410836037"
   )
   static class238[] method872() {
      return new class238[]{class238.field3123, class238.field3121};
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Liw;",
      garbageValue = "196588481"
   )
   public static FloorUnderlayDefinition method876(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      World.method1923();
      if (WorldMapID.clanChat != null) {
         WorldMapID.clanChat.invalidateIgnoreds();
      }

   }
}
