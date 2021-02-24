import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("HitSplatDefinition_archive")
   static AbstractArchive HitSplatDefinition_archive;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("HitSplatDefinition_cached")
   static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("HitSplatDefinition_cachedFonts")
   static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1737800845
   )
   @Export("fontId")
   int fontId = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1895359321
   )
   @Export("textColor")
   public int textColor = 16777215;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1681619933
   )
   public int field3364 = 70;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -334206497
   )
   int field3365 = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 54312143
   )
   int field3366 = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1316651061
   )
   int field3367 = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2079925537
   )
   int field3372 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -2039546161
   )
   public int field3378 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 74632649
   )
   public int field3370 = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -854871663
   )
   public int field3371 = -1;
   @ObfuscatedName("p")
   String field3358 = "";
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1999046971
   )
   public int field3375 = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1539092209
   )
   public int field3368 = 0;
   @ObfuscatedName("o")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -979456213
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -351254549
   )
   @Export("transformVarp")
   int transformVarp = -1;

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-1255296319"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lkx;IB)V",
      garbageValue = "12"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.fontId = var1.method5833();
      } else if (var2 == 2) {
         this.textColor = var1.readMedium();
      } else if (var2 == 3) {
         this.field3365 = var1.method5833();
      } else if (var2 == 4) {
         this.field3367 = var1.method5833();
      } else if (var2 == 5) {
         this.field3366 = var1.method5833();
      } else if (var2 == 6) {
         this.field3372 = var1.method5833();
      } else if (var2 == 7) {
         this.field3378 = var1.readShort();
      } else if (var2 == 8) {
         this.field3358 = var1.readStringCp1252NullCircumfixed();
      } else if (var2 == 9) {
         this.field3364 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field3370 = var1.readShort();
      } else if (var2 == 11) {
         this.field3371 = 0;
      } else if (var2 == 12) {
         this.field3375 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.field3368 = var1.readShort();
      } else if (var2 == 14) {
         this.field3371 = var1.readUnsignedShort();
      } else if (var2 == 17 || var2 == 18) {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Ljz;",
      garbageValue = "-718809763"
   )
   @Export("transform")
   public final HitSplatDefinition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = FontName.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? ScriptFrame.method1222(var2) : null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1367111183"
   )
   @Export("getString")
   public String getString(int var1) {
      String var2 = this.field3358;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + GrandExchangeOfferOwnWorldComparator.intToString(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)Llm;",
      garbageValue = "-1595522971"
   )
   public SpritePixels method4764() {
      if (this.field3365 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3365);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3365, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field3365);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Llm;",
      garbageValue = "49"
   )
   public SpritePixels method4770() {
      if (this.field3366 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3366);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3366, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field3366);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Llm;",
      garbageValue = "1511725830"
   )
   public SpritePixels method4769() {
      if (this.field3367 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3367);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3367, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field3367);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Llm;",
      garbageValue = "-2138481070"
   )
   public SpritePixels method4766() {
      if (this.field3372 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3372);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BufferedSource.SpriteBuffer_getSprite(Frames.field1904, this.field3372, 0);
            if (var1 != null) {
               HitSplatDefinition_cachedSprites.put(var1, (long)this.field3372);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Lkl;",
      garbageValue = "1442657906"
   )
   @Export("getFont")
   public Font getFont() {
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            AbstractArchive var3 = Frames.field1904;
            AbstractArchive var4 = HitSplatDefinition_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7);
               var6 = true;
            }

            Font var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.takeFile(var5, 0);
               Font var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  Font var9 = new Font(var8, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels);
                  class105.SpriteBuffer_xOffsets = null;
                  class336.SpriteBuffer_yOffsets = null;
                  class336.SpriteBuffer_spriteWidths = null;
                  class225.SpriteBuffer_spriteHeights = null;
                  HorizontalAlignment.SpriteBuffer_spritePalette = null;
                  class2.SpriteBuffer_pixels = null;
                  var10 = var9;
               }

               var2 = var10;
            }

            if (var2 != null) {
               HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "1153896983"
   )
   public static String method4768(CharSequence var0) {
      return ReflectionCheck.method2449('*', var0.length());
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-483129503"
   )
   @Export("updateItemPile")
   static final void updateItemPile(int var0, int var1) {
      NodeDeque var2 = Client.groundItems[class90.Client_plane][var0][var1];
      if (var2 == null) {
         MilliClock.scene.removeGroundItemPile(class90.Client_plane, var0, var1);
      } else {
         long var3 = -99999999L;
         TileItem var5 = null;

         TileItem var6;
         for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
            ItemComposition var7 = class281.ItemDefinition_get(var6.id);
            long var11 = (long)var7.price;
            if (var7.isStackable == 1) {
               var11 *= (long)(var6.quantity + 1);
            }

            if (var11 > var3) {
               var3 = var11;
               var5 = var6;
            }
         }

         if (var5 == null) {
            MilliClock.scene.removeGroundItemPile(class90.Client_plane, var0, var1);
         } else {
            var2.addLast(var5);
            TileItem var13 = null;
            TileItem var8 = null;

            for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
               if (var5.id != var6.id) {
                  if (var13 == null) {
                     var13 = var6;
                  }

                  if (var6.id != var13.id && var8 == null) {
                     var8 = var6;
                  }
               }
            }

            long var9 = TextureProvider.calculateTag(var0, var1, 3, false, 0);
            MilliClock.scene.newGroundItemPile(class90.Client_plane, var0, var1, WorldMapRegion.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class90.Client_plane), var5, var9, var13, var8);
         }
      }
   }
}
