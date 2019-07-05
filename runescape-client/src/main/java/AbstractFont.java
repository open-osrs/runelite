import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "[Llq;"
   )
   @Export("AbstractFont_modIconSprites")
   public static IndexedSprite[] AbstractFont_modIconSprites;
   @ObfuscatedName("k")
   @Export("AbstractFont_strike")
   static int AbstractFont_strike;
   @ObfuscatedName("n")
   @Export("AbstractFont_underline")
   static int AbstractFont_underline;
   @ObfuscatedName("i")
   @Export("AbstractFont_previousShadow")
   static int AbstractFont_previousShadow;
   @ObfuscatedName("a")
   @Export("AbstractFont_shadow")
   static int AbstractFont_shadow;
   @ObfuscatedName("z")
   @Export("AbstractFont_previousColor")
   static int AbstractFont_previousColor;
   @ObfuscatedName("j")
   @Export("AbstractFont_color")
   static int AbstractFont_color;
   @ObfuscatedName("s")
   @Export("AbstractFont_alpha")
   static int AbstractFont_alpha;
   @ObfuscatedName("t")
   @Export("AbstractFont_justificationTotal")
   static int AbstractFont_justificationTotal;
   @ObfuscatedName("y")
   @Export("AbstractFont_justificationCurrent")
   static int AbstractFont_justificationCurrent;
   @ObfuscatedName("h")
   @Export("AbstractFont_random")
   static Random AbstractFont_random;
   @ObfuscatedName("b")
   @Export("AbstractFont_lines")
   static String[] AbstractFont_lines;
   @ObfuscatedName("m")
   @Export("pixels")
   byte[][] pixels;
   @ObfuscatedName("f")
   @Export("advances")
   int[] advances;
   @ObfuscatedName("q")
   @Export("widths")
   int[] widths;
   @ObfuscatedName("w")
   @Export("heights")
   int[] heights;
   @ObfuscatedName("o")
   @Export("leftBearings")
   int[] leftBearings;
   @ObfuscatedName("u")
   @Export("topBearings")
   int[] topBearings;
   @ObfuscatedName("g")
   @Export("ascent")
   public int ascent;
   @ObfuscatedName("l")
   @Export("maxAscent")
   public int maxAscent;
   @ObfuscatedName("e")
   @Export("maxDescent")
   public int maxDescent;
   @ObfuscatedName("d")
   @Export("kerning")
   byte[] kerning;

   AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.pixels = new byte[256][];
      this.ascent = 0;
      this.leftBearings = var2;
      this.topBearings = var3;
      this.widths = var4;
      this.heights = var5;
      this.readMetrics(var1);
      this.pixels = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for (int var10 = 0; var10 < 256; ++var10) {
         if (this.topBearings[var10] < var8 && this.heights[var10] != 0) {
            var8 = this.topBearings[var10];
         }

         if (this.topBearings[var10] + this.heights[var10] > var9) {
            var9 = this.topBearings[var10] + this.heights[var10];
         }
      }

      this.maxAscent = this.ascent - var8;
      this.maxDescent = var9 - this.ascent;
   }

   AbstractFont(byte[] var1) {
      this.pixels = new byte[256][];
      this.ascent = 0;
      this.readMetrics(var1);
   }

   @ObfuscatedName("m")
   @Export("drawGlyph")
   abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("f")
   @Export("drawGlyphAlpha")
   abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("l")
   @Export("readMetrics")
   void readMetrics(byte[] var1) {
      this.advances = new int[256];
      int var2;
      if (var1.length == 257) {
         for (var2 = 0; var2 < this.advances.length; ++var2) {
            this.advances[var2] = var1[var2] & 255;
         }

         this.ascent = var1[256] & 255;
      } else {
         var2 = 0;

         for (int var3 = 0; var3 < 256; ++var3) {
            this.advances[var3] = var1[var2++] & 255;
         }

         int[] var12 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for (var5 = 0; var5 < 256; ++var5) {
            var12[var5] = var1[var2++] & 255;
         }

         for (var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var6 = new byte[256][];

         int var7;
         for (int var8 = 0; var8 < 256; ++var8) {
            var6[var8] = new byte[var12[var8]];
            byte var9 = 0;

            for (var7 = 0; var7 < var6[var8].length; ++var7) {
               var9 += var1[var2++];
               var6[var8][var7] = var9;
            }
         }

         byte[][] var13 = new byte[256][];

         int var14;
         for (var14 = 0; var14 < 256; ++var14) {
            var13[var14] = new byte[var12[var14]];
            byte var10 = 0;

            for (int var11 = 0; var11 < var13[var14].length; ++var11) {
               var10 += var1[var2++];
               var13[var14][var11] = var10;
            }
         }

         this.kerning = new byte[65536];

         for (var14 = 0; var14 < 256; ++var14) {
            if (var14 != 32 && var14 != 160) {
               for (var7 = 0; var7 < 256; ++var7) {
                  if (var7 != 32 && var7 != 160) {
                     this.kerning[var7 + (var14 << 8)] = (byte)method5658(var6, var13, var4, this.advances, var12, var14, var7);
                  }
               }
            }
         }

         this.ascent = var4[32] + var12[32];
      }

   }

   @ObfuscatedName("x")
   @Export("charWidth")
   int charWidth(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.advances[HealthBar.charToByteCp1252(var1) & 255];
   }

   @ObfuscatedName("d")
   @Export("stringWidth")
   public int stringWidth(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = MouseHandler.method1085(var7.substring(4));
                              var4 += AbstractFont_modIconSprites[var8].width;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.advances[(char)(HealthBar.charToByteCp1252(var6) & 255)];
                  if (this.kerning != null && var3 != -1) {
                     var4 += this.kerning[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("a")
   @Export("breakLines")
   public int breakLines(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for (int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.charWidth('<');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << '\b') + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.charWidth('>');
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[(var11 << '\b') + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = MouseHandler.method1085(var16.substring(4));
                        var4 += AbstractFont_modIconSprites[var17].width;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.charWidth(var15);
                     if (this.kerning != null && var11 != -1) {
                        var4 += this.kerning[var15 + (var11 << '\b')];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   @ObfuscatedName("z")
   @Export("lineWidth")
   public int lineWidth(String var1, int var2) {
      int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.stringWidth(AbstractFont_lines[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("j")
   @Export("lineCount")
   public int lineCount(String var1, int var2) {
      return this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
   }

   @ObfuscatedName("t")
   @Export("draw")
   public void draw(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2, var3);
      }

   }

   @ObfuscatedName("y")
   @Export("drawAlpha")
   public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         AbstractFont_alpha = var6;
         this.draw0(var1, var2, var3);
      }

   }

   @ObfuscatedName("h")
   @Export("drawRightAligned")
   public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1), var3);
      }

   }

   @ObfuscatedName("b")
   @Export("drawCentered")
   public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.reset(var4, var5);
         this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
      }

   }

   @ObfuscatedName("c")
   @Export("drawLines")
   public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 == null) {
         return 0;
      } else {
         this.reset(var6, var7);
         if (var10 == 0) {
            var10 = this.ascent;
         }

         int[] var11 = new int[]{var4};
         if (var5 < var10 + this.maxAscent + this.maxDescent && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.breakLines(var1, var11, AbstractFont_lines);
         if (var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if (var9 == 0) {
            var13 = var3 + this.maxAscent;
         } else if (var9 == 1) {
            var13 = var3 + (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / 2 + this.maxAscent;
         } else if (var9 == 2) {
            var13 = var3 + var5 - this.maxDescent - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / (var12 + 1);
            if (var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.maxAscent;
            var10 += var14;
         }

         for (var14 = 0; var14 < var12; ++var14) {
            if (var8 == 0) {
               this.draw0(AbstractFont_lines[var14], var2, var13);
            } else if (var8 == 1) {
               this.draw0(AbstractFont_lines[var14], var2 + (var4 - this.stringWidth(AbstractFont_lines[var14])) / 2, var13);
            } else if (var8 == 2) {
               this.draw0(AbstractFont_lines[var14], var2 + var4 - this.stringWidth(AbstractFont_lines[var14]), var13);
            } else if (var14 == var12 - 1) {
               this.draw0(AbstractFont_lines[var14], var2, var13);
            } else {
               this.calculateLineJustification(AbstractFont_lines[var14], var4);
               this.draw0(AbstractFont_lines[var14], var2, var13);
               AbstractFont_justificationTotal = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   @ObfuscatedName("p")
   @Export("drawCenteredWave")
   public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         int[] var7 = new int[var1.length()];

         for (int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7);
      }

   }

   @ObfuscatedName("v")
   @Export("drawCenteredWave2")
   public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for (int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8);
      }

   }

   @ObfuscatedName("ag")
   @Export("drawCenteredShake")
   public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.reset(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10);
      }

   }

   @ObfuscatedName("aq")
   @Export("drawRandomAlphaAndSpacing")
   public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.reset(var4, var5);
         AbstractFont_random.setSeed((long)var6);
         AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((AbstractFont_random.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.drawWithOffsets0(var1, var2, var3, var7, (int[])null);
      }

   }

   @ObfuscatedName("aj")
   @Export("reset")
   void reset(int var1, int var2) {
      AbstractFont_strike = -1;
      AbstractFont_underline = -1;
      AbstractFont_previousShadow = var2;
      AbstractFont_shadow = var2;
      AbstractFont_previousColor = var1;
      AbstractFont_color = var1;
      AbstractFont_alpha = 256;
      AbstractFont_justificationTotal = 0;
      AbstractFont_justificationCurrent = 0;
   }

   @ObfuscatedName("av")
   @Export("decodeTag")
   void decodeTag(String var1) {
      try {
         if (var1.startsWith("col=")) {
            AbstractFont_color = class214.method4157(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            AbstractFont_color = AbstractFont_previousColor;
         } else if (var1.startsWith("str=")) {
            AbstractFont_strike = class214.method4157(var1.substring(4), 16);
         } else if (var1.equals("str")) {
            AbstractFont_strike = 8388608;
         } else if (var1.equals("/str")) {
            AbstractFont_strike = -1;
         } else if (var1.startsWith("u=")) {
            AbstractFont_underline = class214.method4157(var1.substring(2), 16);
         } else if (var1.equals("u")) {
            AbstractFont_underline = 0;
         } else if (var1.equals("/u")) {
            AbstractFont_underline = -1;
         } else if (var1.startsWith("shad=")) {
            AbstractFont_shadow = class214.method4157(var1.substring(5), 16);
         } else if (var1.equals("shad")) {
            AbstractFont_shadow = 0;
         } else if (var1.equals("/shad")) {
            AbstractFont_shadow = AbstractFont_previousShadow;
         } else if (var1.equals("br")) {
            this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
         }
      } catch (Exception var3) {
      }

   }

   @ObfuscatedName("ar")
   @Export("calculateLineJustification")
   void calculateLineJustification(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("ac")
   @Export("draw0")
   void draw0(String var1, int var2, int var3) {
      var3 -= this.ascent;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(HealthBar.charToByteCp1252(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var8;
               if (var7 == '>' && var4 != -1) {
                  String var9 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var9.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var9.equals("gt")) {
                        if (var9.startsWith("img=")) {
                           try {
                              var8 = MouseHandler.method1085(var9.substring(4));
                              IndexedSprite var13 = AbstractFont_modIconSprites[var8];
                              var13.drawAt(var2, var3 + this.ascent - var13.height);
                              var2 += var13.width;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.decodeTag(var9);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.kerning != null && var5 != -1) {
                     var2 += this.kerning[var7 + (var5 << 8)];
                  }

                  int var12 = this.widths[var7];
                  var8 = this.heights[var7];
                  if (var7 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var8, AbstractFont_shadow);
                        }

                        this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var8, AbstractFont_color);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var8, AbstractFont_shadow, AbstractFont_alpha);
                        }

                        this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var8, AbstractFont_color, AbstractFont_alpha);
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent += AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var10 = this.advances[var7];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var10, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var10, AbstractFont_underline);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("ay")
   @Export("drawWithOffsets0")
   void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.ascent;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for (int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(HealthBar.charToByteCp1252(var1.charAt(var9)) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var11;
               int var12;
               int var13;
               if (var10 == '>' && var6 != -1) {
                  String var14 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var14.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var14.equals("gt")) {
                        if (var14.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var11 = var4[var8];
                              } else {
                                 var11 = 0;
                              }

                              if (var5 != null) {
                                 var12 = var5[var8];
                              } else {
                                 var12 = 0;
                              }

                              ++var8;
                              var13 = MouseHandler.method1085(var14.substring(4));
                              IndexedSprite var18 = AbstractFont_modIconSprites[var13];
                              var18.drawAt(var11 + var2, var12 + (var3 + this.ascent - var18.height));
                              var2 += var18.width;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.decodeTag(var14);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == 160) {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.kerning != null && var7 != -1) {
                     var2 += this.kerning[var10 + (var7 << 8)];
                  }

                  int var17 = this.widths[var10];
                  var11 = this.heights[var10];
                  if (var4 != null) {
                     var12 = var4[var8];
                  } else {
                     var12 = 0;
                  }

                  if (var5 != null) {
                     var13 = var5[var8];
                  } else {
                     var13 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (AbstractFont_alpha == 256) {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyph(this.pixels[var10], var12 + var2 + this.leftBearings[var10] + 1, var3 + var13 + this.topBearings[var10] + 1, var17, var11, AbstractFont_shadow);
                        }

                        this.drawGlyph(this.pixels[var10], var12 + var2 + this.leftBearings[var10], var3 + var13 + this.topBearings[var10], var17, var11, AbstractFont_color);
                     } else {
                        if (AbstractFont_shadow != -1) {
                           AbstractFont_drawGlyphAlpha(this.pixels[var10], var12 + var2 + this.leftBearings[var10] + 1, var3 + var13 + this.topBearings[var10] + 1, var17, var11, AbstractFont_shadow, AbstractFont_alpha);
                        }

                        this.drawGlyphAlpha(this.pixels[var10], var12 + var2 + this.leftBearings[var10], var3 + var13 + this.topBearings[var10], var17, var11, AbstractFont_color, AbstractFont_alpha);
                     }
                  } else if (AbstractFont_justificationTotal > 0) {
                     AbstractFont_justificationCurrent += AbstractFont_justificationTotal;
                     var2 += AbstractFont_justificationCurrent >> 8;
                     AbstractFont_justificationCurrent &= 255;
                  }

                  int var15 = this.advances[var10];
                  if (AbstractFont_strike != -1) {
                     Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var15, AbstractFont_strike);
                  }

                  if (AbstractFont_underline != -1) {
                     Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var15, AbstractFont_underline);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   static int method5658(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("s")
   @Export("escapeBrackets")
   public static String escapeBrackets(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedName("ah")
   @Export("AbstractFont_drawGlyph")
   static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
      int var7 = Rasterizer2D.Rasterizer2D_width - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
         var4 -= var10;
         var2 = Rasterizer2D.Rasterizer2D_yClipStart;
         var9 += var3 * var10;
         var6 += var10 * Rasterizer2D.Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
         var3 -= var10;
         var1 = Rasterizer2D.Rasterizer2D_xClipStart;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }

   }

   @ObfuscatedName("ak")
   @Export("AbstractFont_placeGlyph")
   static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for (var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for (var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("aw")
   @Export("AbstractFont_drawGlyphAlpha")
   static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
      int var8 = Rasterizer2D.Rasterizer2D_width - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
         var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
         var4 -= var11;
         var2 = Rasterizer2D.Rasterizer2D_yClipStart;
         var10 += var3 * var11;
         var7 += var11 * Rasterizer2D.Rasterizer2D_width;
      }

      if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
         var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
      }

      if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
         var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
         var3 -= var11;
         var1 = Rasterizer2D.Rasterizer2D_xClipStart;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
         var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }

   }

   @ObfuscatedName("al")
   @Export("AbstractFont_placeGlyphAlpha")
   static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for (int var10 = -var6; var10 < 0; ++var10) {
         for (int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static {
      AbstractFont_strike = -1;
      AbstractFont_underline = -1;
      AbstractFont_previousShadow = -1;
      AbstractFont_shadow = -1;
      AbstractFont_previousColor = 0;
      AbstractFont_color = 0;
      AbstractFont_alpha = 256;
      AbstractFont_justificationTotal = 0;
      AbstractFont_justificationCurrent = 0;
      AbstractFont_random = new Random();
      AbstractFont_lines = new String[100];
   }
}
