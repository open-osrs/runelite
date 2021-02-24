import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("FloorOverlayDefinition_archive")
   static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("FloorOverlayDefinition_cached")
   static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 229154339
   )
   @Export("primaryRgb")
   public int primaryRgb = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 537117493
   )
   @Export("texture")
   public int texture = -1;
   @ObfuscatedName("y")
   @Export("hideUnderlay")
   public boolean hideUnderlay = true;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -151922243
   )
   @Export("secondaryRgb")
   public int secondaryRgb = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1474561599
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 580468697
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1227736915
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -214097909
   )
   @Export("secondaryHue")
   public int secondaryHue;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -996907009
   )
   @Export("secondarySaturation")
   public int secondarySaturation;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2132940635
   )
   @Export("secondaryLightness")
   public int secondaryLightness;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.secondaryRgb != -1) {
         this.setHsl(this.secondaryRgb);
         this.secondaryHue = this.hue;
         this.secondarySaturation = this.saturation;
         this.secondaryLightness = this.lightness;
      }

      this.setHsl(this.primaryRgb);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "581864251"
   )
   @Export("decode")
   void decode(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkx;IIB)V",
      garbageValue = "1"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.primaryRgb = var1.readMedium();
      } else if (var2 == 2) {
         this.texture = var1.readUnsignedByte();
      } else if (var2 == 5) {
         this.hideUnderlay = false;
      } else if (var2 == 7) {
         this.secondaryRgb = var1.readMedium();
      } else if (var2 == 8) {
         ;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "115"
   )
   @Export("setHsl")
   void setHsl(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.hue = (int)(256.0D * var12);
      this.saturation = (int)(256.0D * var14);
      this.lightness = (int)(256.0D * var16);
      if (this.saturation < 0) {
         this.saturation = 0;
      } else if (this.saturation > 255) {
         this.saturation = 255;
      }

      if (this.lightness < 0) {
         this.lightness = 0;
      } else if (this.lightness > 255) {
         this.lightness = 255;
      }

   }
}
