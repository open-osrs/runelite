import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("FloorUnderlayDefinition_archive")
   public static AbstractArchive FloorUnderlayDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("FloorUnderlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -130851115
   )
   @Export("rgb")
   int rgb = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 873128511
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1930192423
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1785513219
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -114271383
   )
   @Export("hueMultiplier")
   public int hueMultiplier;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1258878623"
   )
   @Export("postDecode")
   void postDecode() {
      this.setHsl(this.rgb);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "166104294"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkx;III)V",
      garbageValue = "1874969287"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium();
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1796735191"
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
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.saturation = (int)(var14 * 256.0D);
      this.lightness = (int)(var16 * 256.0D);
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

      if (var16 > 0.5D) {
         this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
      } else {
         this.hueMultiplier = (int)(var14 * var16 * 512.0D);
      }

      if (this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)(var12 * (double)this.hueMultiplier);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljp;",
      garbageValue = "-122"
   )
   @Export("StructDefinition_getStructDefinition")
   public static StructDefinition StructDefinition_getStructDefinition(int var0) {
      StructDefinition var1 = (StructDefinition)StructDefinition.StructDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructDefinition.StructDefinition_archive.takeFile(34, var0);
         var1 = new StructDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         StructDefinition.StructDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
