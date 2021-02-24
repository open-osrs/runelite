import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "Lda;"
   )
   @Export("textureProvider")
   static TextureProvider textureProvider;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1837784551
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 324986435
   )
   @Export("x")
   int x;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 392241551
   )
   @Export("y")
   int y;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1347087127
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1198661661
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("entity1")
   public Entity entity1;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   @Export("entity2")
   public Entity entity2;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -5322685038188485543L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 898643669
   )
   @Export("flags")
   int flags = 0;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;IIB)[Lly;",
      garbageValue = "0"
   )
   public static IndexedSprite[] method3420(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         IndexedSprite[] var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

         for(int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
            IndexedSprite var7 = var5[var6] = new IndexedSprite();
            var7.width = class336.SpriteBuffer_spriteWidth;
            var7.height = class336.SpriteBuffer_spriteHeight;
            var7.xOffset = class105.SpriteBuffer_xOffsets[var6];
            var7.yOffset = class336.SpriteBuffer_yOffsets[var6];
            var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
            var7.subHeight = class225.SpriteBuffer_spriteHeights[var6];
            var7.palette = HorizontalAlignment.SpriteBuffer_spritePalette;
            var7.pixels = class2.SpriteBuffer_pixels[var6];
         }

         class105.SpriteBuffer_xOffsets = null;
         class336.SpriteBuffer_yOffsets = null;
         class336.SpriteBuffer_spriteWidths = null;
         class225.SpriteBuffer_spriteHeights = null;
         HorizontalAlignment.SpriteBuffer_spritePalette = null;
         class2.SpriteBuffer_pixels = null;
         return var5;
      }
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "33"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }
}
