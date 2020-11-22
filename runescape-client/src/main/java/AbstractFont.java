import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("o")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("n")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("x")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("p")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("r")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("y")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("s")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("j")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("w")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("v")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("d")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("f")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("b")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("l")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("m")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("z")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("q")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("k")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("c")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("u")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("e")
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

	@ObfuscatedName("b")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("k")
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
							this.kerning[var8 + (var13 << 8)] = (byte)method5477(var11, var12, var4, this.advances, var10, var13, var8); // L: 92
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 95
		}

	} // L: 97

	@ObfuscatedName("u")
	@Export("charWidth")
	int charWidth(char var1) {
		if (var1 == 160) { // L: 122
			var1 = ' ';
		}

		return this.advances[class219.charToByteCp1252(var1) & 255]; // L: 123
	}

	@ObfuscatedName("t")
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
										int var8 = ObjectSound.parseInt(var7.substring(4)); // L: 144
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
						var4 += this.advances[(char)(class219.charToByteCp1252(var6) & 255)]; // L: 155
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

	@ObfuscatedName("e")
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
								int var17 = ObjectSound.parseInt(var16.substring(4)); // L: 207
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

	@ObfuscatedName("o")
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

	@ObfuscatedName("n")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 258
	}

	@ObfuscatedName("p")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 279
			this.reset(var4, var5); // L: 280
			this.draw0(var1, var2, var3); // L: 281
		}
	} // L: 282

	@ObfuscatedName("r")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 285
			this.reset(var4, var5); // L: 286
			AbstractFont_alpha = var6; // L: 287
			this.draw0(var1, var2, var3); // L: 288
		}
	} // L: 289

	@ObfuscatedName("y")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 292
			this.reset(var4, var5); // L: 293
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 294
		}
	} // L: 295

	@ObfuscatedName("s")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 298
			this.reset(var4, var5); // L: 299
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 300
		}
	} // L: 301

	@ObfuscatedName("j")
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

	@ObfuscatedName("d")
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

	@ObfuscatedName("g")
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

	@ObfuscatedName("h")
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

	@ObfuscatedName("ab")
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
			int var2;
			String var3;
			if (var1.startsWith("col=")) { // L: 394
				var3 = var1.substring(4); // L: 396
				var2 = SecureRandomCallable.parseIntCustomRadix(var3, 16, true); // L: 398
				AbstractFont_color = var2; // L: 400
			} else if (var1.equals("/col")) { // L: 402
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 403
				var3 = var1.substring(4); // L: 405
				var2 = SecureRandomCallable.parseIntCustomRadix(var3, 16, true); // L: 407
				AbstractFont_strike = var2; // L: 409
			} else if (var1.equals("str")) { // L: 411
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 412
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) { // L: 413
				var3 = var1.substring(2); // L: 415
				var2 = SecureRandomCallable.parseIntCustomRadix(var3, 16, true); // L: 417
				AbstractFont_underline = var2; // L: 419
			} else if (var1.equals("u")) { // L: 421
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 422
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 423
				var3 = var1.substring(5); // L: 425
				var2 = SecureRandomCallable.parseIntCustomRadix(var3, 16, true); // L: 427
				AbstractFont_shadow = var2; // L: 429
			} else if (var1.equals("shad")) { // L: 431
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 432
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) {
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow); // L: 433
			}
		} catch (Exception var5) { // L: 435
		}

	} // L: 436

	@ObfuscatedName("ao")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 439
		boolean var4 = false; // L: 440

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 441
			char var6 = var1.charAt(var5); // L: 442
			if (var6 == '<') { // L: 443
				var4 = true;
			} else if (var6 == '>') { // L: 444
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 445
				++var3;
			}
		}

		if (var3 > 0) { // L: 447
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 448

	@ObfuscatedName("af")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 451
		int var4 = -1; // L: 452
		int var5 = -1; // L: 453

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 454
			if (var1.charAt(var6) != 0) { // L: 455
				char var7 = (char)(class219.charToByteCp1252(var1.charAt(var6)) & 255); // L: 456
				if (var7 == '<') { // L: 457
					var4 = var6; // L: 458
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 461
						String var8 = var1.substring(var4 + 1, var6); // L: 462
						var4 = -1; // L: 463
						if (var8.equals("lt")) { // L: 464
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 465
								if (var8.startsWith("img=")) { // L: 466
									try {
										var9 = ObjectSound.parseInt(var8.substring(4)); // L: 468
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 469
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 470
										var2 += var10.width; // L: 471
										var5 = -1; // L: 472
									} catch (Exception var14) { // L: 474
									}
								} else {
									this.decodeTag(var8); // L: 478
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 482
						var7 = ' ';
					}

					if (var4 == -1) { // L: 483
						if (this.kerning != null && var5 != -1) { // L: 484
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 485
						var9 = this.heights[var7]; // L: 486
						if (var7 != ' ') { // L: 487
							if (AbstractFont_alpha == 256) { // L: 488
								if (AbstractFont_shadow != -1) { // L: 489
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 490
							} else {
								if (AbstractFont_shadow != -1) { // L: 493
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 494
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 498
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 499
							var2 += AbstractFont_justificationCurrent >> 8; // L: 500
							AbstractFont_justificationCurrent &= 255; // L: 501
						}

						int var13 = this.advances[var7]; // L: 504
						if (AbstractFont_strike != -1) { // L: 505
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 506
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 507
						var5 = var7; // L: 508
					}
				}
			}
		}

	} // L: 511

	@ObfuscatedName("av")
	@Export("drawWithOffsets0")
	void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.ascent; // L: 514
		int var6 = -1; // L: 515
		int var7 = -1; // L: 516
		int var8 = 0; // L: 517

		for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 518
			if (var1.charAt(var9) != 0) { // L: 519
				char var10 = (char)(class219.charToByteCp1252(var1.charAt(var9)) & 255); // L: 520
				if (var10 == '<') { // L: 521
					var6 = var9; // L: 522
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) { // L: 525
						String var11 = var1.substring(var6 + 1, var9); // L: 526
						var6 = -1; // L: 527
						if (var11.equals("lt")) { // L: 528
							var10 = '<';
						} else {
							if (!var11.equals("gt")) { // L: 529
								if (var11.startsWith("img=")) { // L: 530
									try {
										if (var4 != null) { // L: 533
											var12 = var4[var8];
										} else {
											var12 = 0; // L: 534
										}

										if (var5 != null) { // L: 536
											var13 = var5[var8];
										} else {
											var13 = 0; // L: 537
										}

										++var8; // L: 538
										var14 = ObjectSound.parseInt(var11.substring(4)); // L: 539
										IndexedSprite var15 = AbstractFont_modIconSprites[var14]; // L: 540
										var15.drawAt(var12 + var2, var13 + (var3 + this.ascent - var15.height)); // L: 541
										var2 += var15.width; // L: 542
										var7 = -1; // L: 543
									} catch (Exception var19) { // L: 545
									}
								} else {
									this.decodeTag(var11); // L: 549
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) { // L: 553
						var10 = ' ';
					}

					if (var6 == -1) { // L: 554
						if (this.kerning != null && var7 != -1) { // L: 555
							var2 += this.kerning[var10 + (var7 << 8)];
						}

						int var17 = this.widths[var10]; // L: 556
						var12 = this.heights[var10]; // L: 557
						if (var4 != null) { // L: 559
							var13 = var4[var8];
						} else {
							var13 = 0; // L: 560
						}

						if (var5 != null) { // L: 562
							var14 = var5[var8];
						} else {
							var14 = 0; // L: 563
						}

						++var8; // L: 564
						if (var10 != ' ') { // L: 565
							if (AbstractFont_alpha == 256) { // L: 566
								if (AbstractFont_shadow != -1) { // L: 567
									AbstractFont_drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color); // L: 568
							} else {
								if (AbstractFont_shadow != -1) { // L: 571
									AbstractFont_drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color, AbstractFont_alpha); // L: 572
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 576
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 577
							var2 += AbstractFont_justificationCurrent >> 8; // L: 578
							AbstractFont_justificationCurrent &= 255; // L: 579
						}

						int var18 = this.advances[var10]; // L: 582
						if (AbstractFont_strike != -1) { // L: 583
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var18, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 584
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var18, AbstractFont_underline);
						}

						var2 += var18; // L: 585
						var7 = var10; // L: 586
					}
				}
			}
		}

	} // L: 589

	@ObfuscatedName("c")
	static int method5477(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

	@ObfuscatedName("x")
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

	@ObfuscatedName("ar")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 595
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 596
		int var8 = 0; // L: 597
		int var9 = 0; // L: 598
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 599
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 600
			var4 -= var10; // L: 601
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 602
			var9 += var3 * var10; // L: 603
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 604
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 606
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 607
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 608
			var3 -= var10; // L: 609
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 610
			var9 += var10; // L: 611
			var6 += var10; // L: 612
			var8 += var10; // L: 613
			var7 += var10; // L: 614
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 616
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 617
			var3 -= var10; // L: 618
			var8 += var10; // L: 619
			var7 += var10; // L: 620
		}

		if (var3 > 0 && var4 > 0) { // L: 622
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 623
		}
	} // L: 624

	@ObfuscatedName("ay")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 627
		var5 = -(var5 & 3); // L: 628

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 629
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 630
				if (var1[var3++] != 0) { // L: 631
					var0[var4++] = var2;
				} else {
					++var4; // L: 632
				}

				if (var1[var3++] != 0) { // L: 633
					var0[var4++] = var2;
				} else {
					++var4; // L: 634
				}

				if (var1[var3++] != 0) { // L: 635
					var0[var4++] = var2;
				} else {
					++var4; // L: 636
				}

				if (var1[var3++] != 0) { // L: 637
					var0[var4++] = var2;
				} else {
					++var4; // L: 638
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 640
				if (var1[var3++] != 0) { // L: 641
					var0[var4++] = var2;
				} else {
					++var4; // L: 642
				}
			}

			var4 += var7; // L: 644
			var3 += var8; // L: 645
		}

	} // L: 647

	@ObfuscatedName("ah")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 650
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 651
		int var9 = 0; // L: 652
		int var10 = 0; // L: 653
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 654
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 655
			var4 -= var11; // L: 656
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 657
			var10 += var3 * var11; // L: 658
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 659
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 661
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 662
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 663
			var3 -= var11; // L: 664
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 665
			var10 += var11; // L: 666
			var7 += var11; // L: 667
			var9 += var11; // L: 668
			var8 += var11; // L: 669
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 671
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 672
			var3 -= var11; // L: 673
			var9 += var11; // L: 674
			var8 += var11; // L: 675
		}

		if (var3 > 0 && var4 > 0) { // L: 677
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 678
		}
	} // L: 679

	@ObfuscatedName("az")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 682
		var9 = 256 - var9; // L: 683

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 684
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 685
				if (var1[var3++] != 0) { // L: 686
					int var12 = var0[var4]; // L: 687
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 688
				} else {
					++var4; // L: 690
				}
			}

			var4 += var7; // L: 692
			var3 += var8; // L: 693
		}

	} // L: 695
}
