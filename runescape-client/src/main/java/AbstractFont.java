import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("m")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("d")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("c")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("j")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("r")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("q")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("t")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("v")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("x")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("z")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("i")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("f")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("o")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("u")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("p")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("b")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("e")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("k")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("g")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("h")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("l")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1; // L: 23
		AbstractFont_underline = -1; // L: 24
		AbstractFont_previousShadow = -1; // L: 25
		AbstractFont_shadow = -1; // L: 26
		AbstractFont_previousColor = 0; // L: 27
		AbstractFont_color = 0; // L: 28
		AbstractFont_alpha = 256; // L: 29
		AbstractFont_justificationTotal = 0; // L: 30
		AbstractFont_justificationCurrent = 0; // L: 31
		AbstractFont_random = new Random(); // L: 32
		AbstractFont_lines = new String[100]; // L: 33
	}

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.leftBearings = var2; // L: 36
		this.topBearings = var3; // L: 37
		this.widths = var4; // L: 38
		this.heights = var5; // L: 39
		this.readMetrics(var1); // L: 40
		this.pixels = var7; // L: 41
		int var8 = Integer.MAX_VALUE; // L: 42
		int var9 = Integer.MIN_VALUE; // L: 43

		for (int var10 = 0; var10 < 256; ++var10) { // L: 44
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) { // L: 45
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) { // L: 46
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8; // L: 48
		this.maxDescent = var9 - this.ascent; // L: 49
	} // L: 50

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][]; // L: 12
		this.ascent = 0; // L: 18
		this.readMetrics(var1); // L: 53
	} // L: 54

	@ObfuscatedName("f")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("o")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("h")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256]; // L: 57
		int var2;
		if (var1.length == 257) { // L: 58
			for (var2 = 0; var2 < this.advances.length; ++var2) { // L: 59
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255; // L: 60
		} else {
			var2 = 0; // L: 63

			for (int var3 = 0; var3 < 256; ++var3) { // L: 64
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256]; // L: 65
			int[] var4 = new int[256]; // L: 66

			int var5;
			for (var5 = 0; var5 < 256; ++var5) { // L: 67
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) { // L: 68
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][]; // L: 69

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) { // L: 70
				var11[var6] = new byte[var10[var6]]; // L: 71
				byte var7 = 0; // L: 72

				for (var8 = 0; var8 < var11[var6].length; ++var8) { // L: 73
					var7 += var1[var2++]; // L: 74
					var11[var6][var8] = var7; // L: 75
				}
			}

			byte[][] var12 = new byte[256][]; // L: 78

			int var13;
			for (var13 = 0; var13 < 256; ++var13) { // L: 79
				var12[var13] = new byte[var10[var13]]; // L: 80
				byte var14 = 0; // L: 81

				for (int var9 = 0; var9 < var12[var13].length; ++var9) { // L: 82
					var14 += var1[var2++]; // L: 83
					var12[var13][var9] = var14; // L: 84
				}
			}

			this.kerning = new byte[65536]; // L: 87

			for (var13 = 0; var13 < 256; ++var13) { // L: 88
				if (var13 != 32 && var13 != 160) { // L: 89
					for (var8 = 0; var8 < 256; ++var8) { // L: 90
						if (var8 != 32 && var8 != 160) { // L: 91
							this.kerning[var8 + (var13 << 8)] = (byte)method5369(var11, var12, var4, this.advances, var10, var13, var8); // L: 92
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 95
		}

	} // L: 97

	@ObfuscatedName("l")
	@Export("charWidth")
	int charWidth(char var1) {
		if (var1 == 160) { // L: 122
			var1 = ' ';
		}

		return this.advances[Messages.charToByteCp1252(var1) & 255]; // L: 123
	}

	@ObfuscatedName("m")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) { // L: 127
			return 0;
		} else {
			int var2 = -1; // L: 128
			int var3 = -1; // L: 129
			int var4 = 0; // L: 130

			for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 131
				char var6 = var1.charAt(var5); // L: 132
				if (var6 == '<') { // L: 133
					var2 = var5; // L: 134
				} else {
					if (var6 == '>' && var2 != -1) { // L: 137
						String var7 = var1.substring(var2 + 1, var5); // L: 138
						var2 = -1; // L: 139
						if (var7.equals("lt")) { // L: 140
							var6 = '<';
						} else {
							if (!var7.equals("gt")) { // L: 141
								if (var7.startsWith("img=")) { // L: 142
									try {
										int var8 = class69.method1168(var7.substring(4)); // L: 144
										var4 += AbstractFont_modIconSprites[var8].width; // L: 145
										var3 = -1; // L: 146
									} catch (Exception var10) { // L: 148
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) { // L: 153
						var6 = ' ';
					}

					if (var2 == -1) { // L: 154
						var4 += this.advances[(char)(Messages.charToByteCp1252(var6) & 255)]; // L: 155
						if (this.kerning != null && var3 != -1) { // L: 156
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6; // L: 157
					}
				}
			}

			return var4; // L: 160
		}
	}

	@ObfuscatedName("d")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) { // L: 164
			return 0;
		} else {
			int var4 = 0; // L: 165
			int var5 = 0; // L: 166
			StringBuilder var6 = new StringBuilder(100); // L: 167
			int var7 = -1; // L: 168
			int var8 = 0; // L: 169
			byte var9 = 0; // L: 170
			int var10 = -1; // L: 171
			char var11 = 0; // L: 172
			int var12 = 0; // L: 173
			int var13 = var1.length(); // L: 174

			for (int var14 = 0; var14 < var13; ++var14) { // L: 175
				char var15 = var1.charAt(var14); // L: 176
				if (var15 == '<') { // L: 177
					var10 = var14; // L: 178
				} else {
					if (var15 == '>' && var10 != -1) { // L: 181
						String var16 = var1.substring(var10 + 1, var14); // L: 182
						var10 = -1; // L: 183
						var6.append('<'); // L: 184
						var6.append(var16); // L: 185
						var6.append('>'); // L: 186
						if (var16.equals("br")) { // L: 187
							var3[var12] = var6.toString().substring(var5, var6.length()); // L: 188
							++var12; // L: 189
							var5 = var6.length(); // L: 190
							var4 = 0; // L: 191
							var7 = -1; // L: 192
							var11 = 0; // L: 193
						} else if (var16.equals("lt")) { // L: 195
							var4 += this.charWidth('<'); // L: 196
							if (this.kerning != null && var11 != -1) { // L: 197
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<'; // L: 198
						} else if (var16.equals("gt")) { // L: 200
							var4 += this.charWidth('>'); // L: 201
							if (this.kerning != null && var11 != -1) { // L: 202
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>'; // L: 203
						} else if (var16.startsWith("img=")) { // L: 205
							try {
								int var17 = class69.method1168(var16.substring(4)); // L: 207
								var4 += AbstractFont_modIconSprites[var17].width; // L: 208
								var11 = 0; // L: 209
							} catch (Exception var20) { // L: 211
							}
						}

						var15 = 0; // L: 213
					}

					if (var10 == -1) { // L: 215
						if (var15 != 0) { // L: 216
							var6.append(var15); // L: 217
							var4 += this.charWidth(var15); // L: 218
							if (this.kerning != null && var11 != -1) { // L: 219
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15; // L: 220
						}

						if (var15 == ' ') { // L: 222
							var7 = var6.length(); // L: 223
							var8 = var4; // L: 224
							var9 = 1; // L: 225
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) { // L: 227
							var3[var12] = var6.toString().substring(var5, var7 - var9); // L: 228
							++var12; // L: 229
							var5 = var7; // L: 230
							var7 = -1; // L: 231
							var4 -= var8; // L: 232
							var11 = 0; // L: 233
						}

						if (var15 == '-') { // L: 235
							var7 = var6.length(); // L: 236
							var8 = var4; // L: 237
							var9 = 0; // L: 238
						}
					}
				}
			}

			String var19 = var6.toString(); // L: 242
			if (var19.length() > var5) { // L: 243
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12; // L: 244
		}
	}

	@ObfuscatedName("c")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 248
		int var4 = 0; // L: 249

		for (int var5 = 0; var5 < var3; ++var5) { // L: 250
			int var6 = this.stringWidth(AbstractFont_lines[var5]); // L: 251
			if (var6 > var4) { // L: 252
				var4 = var6;
			}
		}

		return var4; // L: 254
	}

	@ObfuscatedName("j")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 258
	}

	@ObfuscatedName("q")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 279
			this.reset(var4, var5); // L: 280
			this.draw0(var1, var2, var3); // L: 281
		}
	} // L: 282

	@ObfuscatedName("t")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 285
			this.reset(var4, var5); // L: 286
			AbstractFont_alpha = var6; // L: 287
			this.draw0(var1, var2, var3); // L: 288
		}
	} // L: 289

	@ObfuscatedName("v")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 292
			this.reset(var4, var5); // L: 293
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 294
		}
	} // L: 295

	@ObfuscatedName("x")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 298
			this.reset(var4, var5); // L: 299
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 300
		}
	} // L: 301

	@ObfuscatedName("z")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) { // L: 304
			return 0;
		} else {
			this.reset(var6, var7); // L: 305
			if (var10 == 0) { // L: 306
				var10 = this.ascent;
			}

			int[] var11 = new int[]{var4}; // L: 307
			if (var5 < var10 + this.maxAscent + this.maxDescent && var5 < var10 + var10) { // L: 308
				var11 = null;
			}

			int var12 = this.breakLines(var1, var11, AbstractFont_lines); // L: 309
			if (var9 == 3 && var12 == 1) { // L: 311
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) { // L: 312
				var13 = var3 + this.maxAscent;
			} else if (var9 == 1) { // L: 313
				var13 = var3 + (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / 2 + this.maxAscent;
			} else if (var9 == 2) { // L: 314
				var13 = var3 + var5 - this.maxDescent - var10 * (var12 - 1);
			} else {
				var14 = (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / (var12 + 1); // L: 316
				if (var14 < 0) { // L: 317
					var14 = 0;
				}

				var13 = var3 + var14 + this.maxAscent; // L: 318
				var10 += var14; // L: 319
			}

			for (var14 = 0; var14 < var12; ++var14) { // L: 321
				if (var8 == 0) {
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 322
				} else if (var8 == 1) { // L: 323
					this.draw0(AbstractFont_lines[var14], var2 + (var4 - this.stringWidth(AbstractFont_lines[var14])) / 2, var13);
				} else if (var8 == 2) { // L: 324
					this.draw0(AbstractFont_lines[var14], var2 + var4 - this.stringWidth(AbstractFont_lines[var14]), var13);
				} else if (var14 == var12 - 1) { // L: 326
					this.draw0(AbstractFont_lines[var14], var2, var13);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var14], var4); // L: 328
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 329
					AbstractFont_justificationTotal = 0; // L: 330
				}

				var13 += var10; // L: 333
			}

			return var12; // L: 335
		}
	}

	@ObfuscatedName("i")
	@Export("drawCenteredWave")
	public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 339
			this.reset(var4, var5); // L: 340
			int[] var7 = new int[var1.length()]; // L: 341

			for (int var8 = 0; var8 < var1.length(); ++var8) { // L: 342
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7); // L: 343
		}
	} // L: 344

	@ObfuscatedName("a")
	@Export("drawCenteredWave2")
	public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 347
			this.reset(var4, var5); // L: 348
			int[] var7 = new int[var1.length()]; // L: 349
			int[] var8 = new int[var1.length()]; // L: 350

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 351
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D); // L: 352
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D); // L: 353
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8); // L: 355
		}
	} // L: 356

	@ObfuscatedName("w")
	@Export("drawCenteredShake")
	public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) { // L: 359
			this.reset(var4, var5); // L: 360
			double var8 = 7.0D - (double)var7 / 8.0D; // L: 361
			if (var8 < 0.0D) { // L: 362
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()]; // L: 363

			for (int var11 = 0; var11 < var1.length(); ++var11) { // L: 364
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10); // L: 365
		}
	} // L: 366

	@ObfuscatedName("s")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 369
			this.reset(var4, var5); // L: 370
			AbstractFont_random.setSeed((long)var6); // L: 371
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31); // L: 372
			int[] var7 = new int[var1.length()]; // L: 373
			int var8 = 0; // L: 374

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 375
				var7[var9] = var8; // L: 376
				if ((AbstractFont_random.nextInt() & 3) == 0) { // L: 377
					++var8;
				}
			}

			this.drawWithOffsets0(var1, var2, var3, var7, (int[])null); // L: 379
		}
	} // L: 380

	@ObfuscatedName("y")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1; // L: 383
		AbstractFont_underline = -1; // L: 384
		AbstractFont_previousShadow = var2; // L: 385
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1; // L: 386
		AbstractFont_color = var1;
		AbstractFont_alpha = 256; // L: 387
		AbstractFont_justificationTotal = 0; // L: 388
		AbstractFont_justificationCurrent = 0; // L: 389
	} // L: 390

	@ObfuscatedName("ac")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) { // L: 394
				AbstractFont_color = ItemLayer.method3273(var1.substring(4), 16);
			} else if (var1.equals("/col")) { // L: 395
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 396
				AbstractFont_strike = ItemLayer.method3273(var1.substring(4), 16);
			} else if (var1.equals("str")) { // L: 397
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 398
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) { // L: 399
				AbstractFont_underline = ItemLayer.method3273(var1.substring(2), 16);
			} else if (var1.equals("u")) { // L: 400
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 401
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 402
				AbstractFont_shadow = ItemLayer.method3273(var1.substring(5), 16);
			} else if (var1.equals("shad")) { // L: 403
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 404
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) { // L: 405
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var3) { // L: 407
		}

	} // L: 408

	@ObfuscatedName("ay")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 411
		boolean var4 = false; // L: 412

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 413
			char var6 = var1.charAt(var5); // L: 414
			if (var6 == '<') { // L: 415
				var4 = true;
			} else if (var6 == '>') { // L: 416
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 417
				++var3;
			}
		}

		if (var3 > 0) { // L: 419
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 420

	@ObfuscatedName("am")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 423
		int var4 = -1; // L: 424
		int var5 = -1; // L: 425

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 426
			if (var1.charAt(var6) != 0) { // L: 427
				char var7 = (char)(Messages.charToByteCp1252(var1.charAt(var6)) & 255); // L: 428
				if (var7 == '<') { // L: 429
					var4 = var6; // L: 430
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 433
						String var8 = var1.substring(var4 + 1, var6); // L: 434
						var4 = -1; // L: 435
						if (var8.equals("lt")) { // L: 436
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 437
								if (var8.startsWith("img=")) { // L: 438
									try {
										var9 = class69.method1168(var8.substring(4)); // L: 440
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 441
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 442
										var2 += var10.width; // L: 443
										var5 = -1; // L: 444
									} catch (Exception var14) { // L: 446
									}
								} else {
									this.decodeTag(var8); // L: 450
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 454
						var7 = ' ';
					}

					if (var4 == -1) { // L: 455
						if (this.kerning != null && var5 != -1) { // L: 456
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 457
						var9 = this.heights[var7]; // L: 458
						if (var7 != ' ') { // L: 459
							if (AbstractFont_alpha == 256) { // L: 460
								if (AbstractFont_shadow != -1) { // L: 461
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 462
							} else {
								if (AbstractFont_shadow != -1) { // L: 465
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 466
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 470
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 471
							var2 += AbstractFont_justificationCurrent >> 8; // L: 472
							AbstractFont_justificationCurrent &= 255; // L: 473
						}

						int var13 = this.advances[var7]; // L: 476
						if (AbstractFont_strike != -1) { // L: 477
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 478
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 479
						var5 = var7; // L: 480
					}
				}
			}
		}

	} // L: 483

	@ObfuscatedName("ag")
	@Export("drawWithOffsets0")
	void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.ascent; // L: 486
		int var6 = -1; // L: 487
		int var7 = -1; // L: 488
		int var8 = 0; // L: 489

		for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 490
			if (var1.charAt(var9) != 0) { // L: 491
				char var10 = (char)(Messages.charToByteCp1252(var1.charAt(var9)) & 255); // L: 492
				if (var10 == '<') { // L: 493
					var6 = var9; // L: 494
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) { // L: 497
						String var11 = var1.substring(var6 + 1, var9); // L: 498
						var6 = -1; // L: 499
						if (var11.equals("lt")) { // L: 500
							var10 = '<';
						} else {
							if (!var11.equals("gt")) { // L: 501
								if (var11.startsWith("img=")) { // L: 502
									try {
										if (var4 != null) { // L: 505
											var12 = var4[var8];
										} else {
											var12 = 0; // L: 506
										}

										if (var5 != null) { // L: 508
											var13 = var5[var8];
										} else {
											var13 = 0; // L: 509
										}

										++var8; // L: 510
										var14 = class69.method1168(var11.substring(4)); // L: 511
										IndexedSprite var15 = AbstractFont_modIconSprites[var14]; // L: 512
										var15.drawAt(var12 + var2, var13 + (var3 + this.ascent - var15.height)); // L: 513
										var2 += var15.width; // L: 514
										var7 = -1; // L: 515
									} catch (Exception var19) { // L: 517
									}
								} else {
									this.decodeTag(var11); // L: 521
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) { // L: 525
						var10 = ' ';
					}

					if (var6 == -1) { // L: 526
						if (this.kerning != null && var7 != -1) { // L: 527
							var2 += this.kerning[var10 + (var7 << 8)];
						}

						int var17 = this.widths[var10]; // L: 528
						var12 = this.heights[var10]; // L: 529
						if (var4 != null) { // L: 531
							var13 = var4[var8];
						} else {
							var13 = 0; // L: 532
						}

						if (var5 != null) { // L: 534
							var14 = var5[var8];
						} else {
							var14 = 0; // L: 535
						}

						++var8; // L: 536
						if (var10 != ' ') { // L: 537
							if (AbstractFont_alpha == 256) { // L: 538
								if (AbstractFont_shadow != -1) { // L: 539
									AbstractFont_drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color); // L: 540
							} else {
								if (AbstractFont_shadow != -1) { // L: 543
									AbstractFont_drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color, AbstractFont_alpha); // L: 544
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 548
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 549
							var2 += AbstractFont_justificationCurrent >> 8; // L: 550
							AbstractFont_justificationCurrent &= 255; // L: 551
						}

						int var18 = this.advances[var10]; // L: 554
						if (AbstractFont_strike != -1) { // L: 555
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var18, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 556
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var18, AbstractFont_underline);
						}

						var2 += var18; // L: 557
						var7 = var10; // L: 558
					}
				}
			}
		}

	} // L: 561

	@ObfuscatedName("n")
	static int method5369(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5]; // L: 100
		int var8 = var7 + var4[var5]; // L: 101
		int var9 = var2[var6]; // L: 102
		int var10 = var9 + var4[var6]; // L: 103
		int var11 = var7; // L: 104
		if (var9 > var7) { // L: 105
			var11 = var9;
		}

		int var12 = var8; // L: 106
		if (var10 < var8) { // L: 107
			var12 = var10;
		}

		int var13 = var3[var5]; // L: 108
		if (var3[var6] < var13) { // L: 109
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5]; // L: 110
		byte[] var15 = var0[var6]; // L: 111
		int var16 = var11 - var7; // L: 112
		int var17 = var11 - var9; // L: 113

		for (int var18 = var11; var18 < var12; ++var18) { // L: 114
			int var19 = var14[var16++] + var15[var17++]; // L: 115
			if (var19 < var13) { // L: 116
				var13 = var19;
			}
		}

		return -var13; // L: 118
	}

	@ObfuscatedName("r")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length(); // L: 262
		int var2 = 0; // L: 263

		for (int var3 = 0; var3 < var1; ++var3) { // L: 264
			char var4 = var0.charAt(var3); // L: 265
			if (var4 == '<' || var4 == '>') {
				var2 += 3; // L: 266
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2); // L: 268

		for (int var7 = 0; var7 < var1; ++var7) { // L: 269
			char var5 = var0.charAt(var7); // L: 270
			if (var5 == '<') {
				var6.append("<lt>"); // L: 271
			} else if (var5 == '>') { // L: 272
				var6.append("<gt>");
			} else {
				var6.append(var5); // L: 273
			}
		}

		return var6.toString(); // L: 275
	}

	@ObfuscatedName("aq")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 567
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 568
		int var8 = 0; // L: 569
		int var9 = 0; // L: 570
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 571
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 572
			var4 -= var10; // L: 573
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 574
			var9 += var3 * var10; // L: 575
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 576
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 578
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 579
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 580
			var3 -= var10; // L: 581
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 582
			var9 += var10; // L: 583
			var6 += var10; // L: 584
			var8 += var10; // L: 585
			var7 += var10; // L: 586
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 588
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 589
			var3 -= var10; // L: 590
			var8 += var10; // L: 591
			var7 += var10; // L: 592
		}

		if (var3 > 0 && var4 > 0) { // L: 594
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 595
		}
	} // L: 596

	@ObfuscatedName("at")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 599
		var5 = -(var5 & 3); // L: 600

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 601
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 602
				if (var1[var3++] != 0) { // L: 603
					var0[var4++] = var2;
				} else {
					++var4; // L: 604
				}

				if (var1[var3++] != 0) { // L: 605
					var0[var4++] = var2;
				} else {
					++var4; // L: 606
				}

				if (var1[var3++] != 0) { // L: 607
					var0[var4++] = var2;
				} else {
					++var4; // L: 608
				}

				if (var1[var3++] != 0) { // L: 609
					var0[var4++] = var2;
				} else {
					++var4; // L: 610
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 612
				if (var1[var3++] != 0) { // L: 613
					var0[var4++] = var2;
				} else {
					++var4; // L: 614
				}
			}

			var4 += var7; // L: 616
			var3 += var8; // L: 617
		}

	} // L: 619

	@ObfuscatedName("aj")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 622
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 623
		int var9 = 0; // L: 624
		int var10 = 0; // L: 625
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 626
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 627
			var4 -= var11; // L: 628
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 629
			var10 += var3 * var11; // L: 630
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 631
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 633
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 634
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 635
			var3 -= var11; // L: 636
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 637
			var10 += var11; // L: 638
			var7 += var11; // L: 639
			var9 += var11; // L: 640
			var8 += var11; // L: 641
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 643
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 644
			var3 -= var11; // L: 645
			var9 += var11; // L: 646
			var8 += var11; // L: 647
		}

		if (var3 > 0 && var4 > 0) { // L: 649
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 650
		}
	} // L: 651

	@ObfuscatedName("aw")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 654
		var9 = 256 - var9; // L: 655

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 656
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 657
				if (var1[var3++] != 0) { // L: 658
					int var12 = var0[var4]; // L: 659
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 660
				} else {
					++var4; // L: 662
				}
			}

			var4 += var7; // L: 664
			var3 += var8; // L: 665
		}

	} // L: 667
}
