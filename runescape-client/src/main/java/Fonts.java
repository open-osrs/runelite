import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Fonts")
public class Fonts {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("spritesArchive")
   AbstractArchive spritesArchive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("fontsArchive")
   AbstractArchive fontsArchive;
   @ObfuscatedName("d")
   @Export("map")
   HashMap map;

   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;)V"
   )
   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.spritesArchive = var1;
      this.fontsArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([Lkq;I)Ljava/util/HashMap;",
      garbageValue = "-988913234"
   )
   @Export("createMap")
   public HashMap createMap(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         FontName var5 = var3[var4];
         if (this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            AbstractArchive var7 = this.spritesArchive;
            AbstractArchive var8 = this.fontsArchive;
            String var9 = var5.name;
            int var10 = var7.getGroupId(var9);
            int var11 = var7.getFileId(var10, "");
            byte[] var14 = var7.takeFile(var10, var11);
            boolean var13;
            if (var14 == null) {
               var13 = false;
            } else {
               GrandExchangeOfferNameComparator.SpriteBuffer_decode(var14);
               var13 = true;
            }

            Font var12;
            if (!var13) {
               var12 = null;
            } else {
               byte[] var15 = var8.takeFile(var10, var11);
               Font var18;
               if (var15 == null) {
                  var18 = null;
               } else {
                  Font var16 = new Font(var15, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels);
                  class105.SpriteBuffer_xOffsets = null;
                  class336.SpriteBuffer_yOffsets = null;
                  class336.SpriteBuffer_spriteWidths = null;
                  class225.SpriteBuffer_spriteHeights = null;
                  HorizontalAlignment.SpriteBuffer_spritePalette = null;
                  class2.SpriteBuffer_pixels = null;
                  var18 = var16;
               }

               var12 = var18;
            }

            if (var12 != null) {
               this.map.put(var5, var12);
               var2.put(var5, var12);
            }
         }
      }

      return var2;
   }
}
