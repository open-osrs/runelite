import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("ParamDefinition_archive")
   static AbstractArchive ParamDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("ParamDefinition_cached")
   public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("d")
   @Export("type")
   char type;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -551037179
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("y")
   @Export("defaultStr")
   public String defaultStr;
   @ObfuscatedName("h")
   @Export("autoDisable")
   boolean autoDisable = true;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1000046844"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "1362546091"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "1500921565"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.readByte();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class298.cp1252AsciiExtension[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.type = var3;
      } else if (var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if (var2 == 4) {
         this.autoDisable = false;
      } else if (var2 == 5) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "31310"
   )
   @Export("isString")
   public boolean isString() {
      return this.type == 's';
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1478943473"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = WorldMapRegion.getTileHeight(var0, var1, class90.Client_plane) - var2;
         var0 -= SecureRandomFuture.cameraX;
         var3 -= ArchiveLoader.cameraY;
         var1 -= ObjectSound.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[KeyHandler.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[KeyHandler.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class39.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class39.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var5 * var3 - var4 * var1 >> 16;
         var1 = var5 * var1 + var3 * var4 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }
}
