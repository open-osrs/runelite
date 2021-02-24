import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("ViewportMouse")
public class ViewportMouse {
   @ObfuscatedName("n")
   @Export("ViewportMouse_isInViewport")
   public static boolean ViewportMouse_isInViewport = false;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -174867873
   )
   @Export("ViewportMouse_x")
   static int ViewportMouse_x = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1503136055
   )
   @Export("ViewportMouse_y")
   static int ViewportMouse_y = 0;
   @ObfuscatedName("c")
   @Export("ViewportMouse_false0")
   static boolean ViewportMouse_false0 = false;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1632949407
   )
   static int field1757;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1445923815
   )
   static int field1758;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -822732275
   )
   static int field1759;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1825654461
   )
   @Export("ViewportMouse_entityCount")
   public static int ViewportMouse_entityCount = 0;
   @ObfuscatedName("k")
   @Export("ViewportMouse_entityTags")
   public static long[] ViewportMouse_entityTags = new long[1000];
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive9")
   static Archive archive9;

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "598296470"
   )
   static int method3161() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field934;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      descriptor = "(IZZZI)Liy;",
      garbageValue = "1822401208"
   )
   @Export("newArchive")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
      ArchiveDisk var4 = null;
      if (JagexCache.JagexCache_dat2File != null) {
         var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, WorldMapEvent.JagexCache_idxFiles[var0], 1000000);
      }

      return new Archive(var4, WorldMapScaleHandler.masterDisk, var0, var1, var2, var3);
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "-1069741089"
   )
   @Export("drawWidgets")
   static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (WorldMapCacheName.loadInterface(var0)) {
         WorldMapAreaData.field362 = null;
         class41.drawInterface(DefaultsGroup.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (WorldMapAreaData.field362 != null) {
            class41.drawInterface(WorldMapAreaData.field362, -1412584499, var1, var2, var3, var4, WorldMapIcon_1.field218, GrandExchangeOfferOwnWorldComparator.field656, var7);
            WorldMapAreaData.field362 = null;
         }

      } else {
         if (var7 != -1) {
            Client.field816[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               Client.field816[var8] = true;
            }
         }

      }
   }
}
