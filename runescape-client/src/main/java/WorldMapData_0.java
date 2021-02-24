import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive7")
   static Archive archive7;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "2072507243"
   )
   @Export("init")
   void init(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 != WorldMapID.field301.value) {
         throw new IllegalStateException("");
      } else {
         super.minPlane = var1.readUnsignedByte();
         super.planes = var1.readUnsignedByte();
         super.regionXLow = var1.readUnsignedShort() * 4096;
         super.regionYLow = var1.readUnsignedShort() * 4096;
         super.regionX = var1.readUnsignedShort();
         super.regionY = var1.readUnsignedShort();
         super.groupId = var1.method5833();
         super.fileId = var1.method5833();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "36"
   )
   @Export("readGeography")
   void readGeography(Buffer var1) {
      super.planes = Math.min(super.planes, 4);
      super.floorUnderlayIds = new short[1][64][64];
      super.floorOverlayIds = new short[super.planes][64][64];
      super.field193 = new byte[super.planes][64][64];
      super.field204 = new byte[super.planes][64][64];
      super.decorations = new WorldMapDecoration[super.planes][64][64][];
      int var2 = var1.readUnsignedByte();
      if (var2 != class39.field285.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         if (var3 == super.regionX && var4 == super.regionY) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.readTile(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return super.regionX == var2.regionX && super.regionY == var2.regionY;
      }
   }

   public int hashCode() {
      return super.regionX | super.regionY << 8;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-825511368"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (UserComparator9.World_request == null) {
            UserComparator9.World_request = ScriptFrame.urlRequester.request(new URL(Projectile.field1254));
         } else if (UserComparator9.World_request.isDone()) {
            byte[] var0 = UserComparator9.World_request.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.World_count = var1.readUnsignedShort();
            World.World_worlds = new World[World.World_count];

            World var3;
            for(int var2 = 0; var2 < World.World_count; var3.index = var2++) {
               var3 = World.World_worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            class206.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            UserComparator9.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         UserComparator9.World_request = null;
      }

      return false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-9455782"
   )
   static int method250(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "116"
   )
   public static void method239() {
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }
}
