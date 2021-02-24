import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("titleboxSprite")
   static IndexedSprite titleboxSprite;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = -1624406993
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("mt")
   @ObfuscatedGetter(
      intValue = -755072753
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lx;Lx;I)I",
      garbageValue = "1549101660"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.getOfferName().compareTo(var2.getOfferName());
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Llm;IIII)V",
      garbageValue = "-1717498700"
   )
   static void method211(SpritePixels var0, int var1, int var2, int var3) {
      WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, AttackOption.method2203(var1, var2, var3), var0.pixels.length * 4);
   }

   @ObfuscatedName("z")
   @Export("Entity_unpackSceneX")
   public static int Entity_unpackSceneX(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lig;II)Z",
      garbageValue = "754600726"
   )
   public static boolean method212(AbstractArchive var0, int var1) {
      byte[] var2 = var0.takeFileFlat(var1);
      if (var2 == null) {
         return false;
      } else {
         SpriteBuffer_decode(var2);
         return true;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "2140539566"
   )
   @Export("SpriteBuffer_decode")
   public static void SpriteBuffer_decode(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = var0.length - 2;
      class336.SpriteBuffer_spriteCount = var1.readUnsignedShort();
      class105.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount];
      class336.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount];
      class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount];
      class225.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount];
      class2.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][];
      var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8;
      class336.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
      class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
         class105.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
         class336.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
         class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
         class225.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
      HorizontalAlignment.SpriteBuffer_spritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         HorizontalAlignment.SpriteBuffer_spritePalette[var3] = var1.readMedium();
         if (HorizontalAlignment.SpriteBuffer_spritePalette[var3] == 0) {
            HorizontalAlignment.SpriteBuffer_spritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
         int var4 = class336.SpriteBuffer_spriteWidths[var3];
         int var5 = class225.SpriteBuffer_spriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class2.SpriteBuffer_pixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.readByte();
               }
            }
         }
      }

   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "1502126569"
   )
   static final void method199(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0 ? var6 : -var6;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8;
      if (var8 < var9) {
         var10 = var9;
      }

      if (var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if (var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
         var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var13 + var6;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         Rasterizer3D.method3237(var17, var18, var19);
         Rasterizer3D.method3179(var21, var22, var23, var17, var18, var19, var4);
         Rasterizer3D.method3237(var17, var19, var20);
         Rasterizer3D.method3179(var21, var23, var24, var17, var19, var20, var4);
      }
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "408357083"
   )
   static String method209(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (AccessFile.field4100 != null) {
         var3 = "/p=" + AccessFile.field4100;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + NPCComposition.clientLanguage + "/a=" + ItemLayer.field1562 + var3 + "/";
   }
}
