import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("t")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("z")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("r")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("u")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("k")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("h")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("x")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("l")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("a")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("p")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("b")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("c")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("v")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("q")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("f")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("j")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("e")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("g")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("w")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("y")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("s")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1; // L: 24
		AbstractFont_underline = -1; // L: 25
		AbstractFont_previousShadow = -1; // L: 26
		AbstractFont_shadow = -1; // L: 27
		AbstractFont_previousColor = 0; // L: 28
		AbstractFont_color = 0; // L: 29
		AbstractFont_alpha = 256; // L: 30
		AbstractFont_justificationTotal = 0; // L: 31
		AbstractFont_justificationCurrent = 0; // L: 32
		AbstractFont_random = new Random(); // L: 33
		AbstractFont_lines = new String[100]; // L: 34
	}

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.readMetrics(var1); // L: 54
	} // L: 55

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][]; // L: 13
		this.ascent = 0; // L: 19
		this.leftBearings = var2; // L: 37
		this.topBearings = var3; // L: 38
		this.widths = var4; // L: 39
		this.heights = var5; // L: 40
		this.readMetrics(var1); // L: 41
		this.pixels = var7; // L: 42
		int var8 = Integer.MAX_VALUE; // L: 43
		int var9 = Integer.MIN_VALUE; // L: 44

		for (int var10 = 0; var10 < 256; ++var10) { // L: 45
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) { // L: 46
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) { // L: 47
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8; // L: 49
		this.maxDescent = var9 - this.ascent; // L: 50
	} // L: 51

	@ObfuscatedName("c")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("v")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("e")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256]; // L: 58
		int var2;
		if (var1.length == 257) { // L: 59
			for (var2 = 0; var2 < this.advances.length; ++var2) { // L: 60
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255; // L: 61
		} else {
			var2 = 0; // L: 64

			for (int var3 = 0; var3 < 256; ++var3) { // L: 65
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256]; // L: 66
			int[] var4 = new int[256]; // L: 67

			int var5;
			for (var5 = 0; var5 < 256; ++var5) { // L: 68
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) { // L: 69
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][]; // L: 70

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) { // L: 71
				var11[var6] = new byte[var10[var6]]; // L: 72
				byte var7 = 0; // L: 73

				for (var8 = 0; var8 < var11[var6].length; ++var8) { // L: 74
					var7 += var1[var2++]; // L: 75
					var11[var6][var8] = var7; // L: 76
				}
			}

			byte[][] var12 = new byte[256][]; // L: 79

			int var13;
			for (var13 = 0; var13 < 256; ++var13) { // L: 80
				var12[var13] = new byte[var10[var13]]; // L: 81
				byte var14 = 0; // L: 82

				for (int var9 = 0; var9 < var12[var13].length; ++var9) { // L: 83
					var14 += var1[var2++]; // L: 84
					var12[var13][var9] = var14; // L: 85
				}
			}

			this.kerning = new byte[65536]; // L: 88

			for (var13 = 0; var13 < 256; ++var13) { // L: 89
				if (var13 != 32 && var13 != 160) { // L: 90
					for (var8 = 0; var8 < 256; ++var8) { // L: 91
						if (var8 != 32 && var8 != 160) { // L: 92
							this.kerning[var8 + (var13 << 8)] = (byte)method6443(var11, var12, var4, this.advances, var10, var13, var8); // L: 93
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 96
		}

	} // L: 98

	@ObfuscatedName("w")
	@Export("charWidth")
	int charWidth(char var1) {
		if (var1 == 160) { // L: 123
			var1 = ' ';
		}

		return this.advances[class295.charToByteCp1252(var1) & 255]; // L: 124
	}

	@ObfuscatedName("y")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) { // L: 128
			return 0;
		} else {
			int var2 = -1; // L: 129
			int var3 = -1; // L: 130
			int var4 = 0; // L: 131

			for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 132
				char var6 = var1.charAt(var5); // L: 133
				if (var6 == '<') { // L: 134
					var2 = var5; // L: 135
				} else {
					if (var6 == '>' && var2 != -1) { // L: 138
						String var7 = var1.substring(var2 + 1, var5); // L: 139
						var2 = -1; // L: 140
						if (var7.equals("lt")) { // L: 141
							var6 = '<';
						} else {
							if (!var7.equals("gt")) { // L: 142
								if (var7.startsWith("img=")) { // L: 143
									try {
										int var8 = FaceNormal.method4344(var7.substring(4)); // L: 145
										var4 += AbstractFont_modIconSprites[var8].width; // L: 146
										var3 = -1; // L: 147
									} catch (Exception var10) { // L: 149
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) { // L: 154
						var6 = ' ';
					}

					if (var2 == -1) { // L: 155
						var4 += this.advances[(char)(class295.charToByteCp1252(var6) & 255)]; // L: 156
						if (this.kerning != null && var3 != -1) { // L: 157
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6; // L: 158
					}
				}
			}

			return var4; // L: 161
		}
	}

	@ObfuscatedName("i")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) { // L: 165
			return 0;
		} else {
			int var4 = 0; // L: 166
			int var5 = 0; // L: 167
			StringBuilder var6 = new StringBuilder(100); // L: 168
			int var7 = -1; // L: 169
			int var8 = 0; // L: 170
			byte var9 = 0; // L: 171
			int var10 = -1; // L: 172
			char var11 = 0; // L: 173
			int var12 = 0; // L: 174
			int var13 = var1.length(); // L: 175

			for (int var14 = 0; var14 < var13; ++var14) { // L: 176
				char var15 = var1.charAt(var14); // L: 177
				if (var15 == '<') { // L: 178
					var10 = var14; // L: 179
				} else {
					if (var15 == '>' && var10 != -1) { // L: 182
						String var16 = var1.substring(var10 + 1, var14); // L: 183
						var10 = -1; // L: 184
						var6.append('<'); // L: 185
						var6.append(var16); // L: 186
						var6.append('>'); // L: 187
						if (var16.equals("br")) { // L: 188
							var3[var12] = var6.toString().substring(var5, var6.length()); // L: 189
							++var12; // L: 190
							var5 = var6.length(); // L: 191
							var4 = 0; // L: 192
							var7 = -1; // L: 193
							var11 = 0; // L: 194
						} else if (var16.equals("lt")) { // L: 196
							var4 += this.charWidth('<'); // L: 197
							if (this.kerning != null && var11 != -1) { // L: 198
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<'; // L: 199
						} else if (var16.equals("gt")) { // L: 201
							var4 += this.charWidth('>'); // L: 202
							if (this.kerning != null && var11 != -1) { // L: 203
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>'; // L: 204
						} else if (var16.startsWith("img=")) { // L: 206
							try {
								int var17 = FaceNormal.method4344(var16.substring(4)); // L: 208
								var4 += AbstractFont_modIconSprites[var17].width; // L: 209
								var11 = 0; // L: 210
							} catch (Exception var20) { // L: 212
							}
						}

						var15 = 0; // L: 214
					}

					if (var10 == -1) { // L: 216
						if (var15 != 0) { // L: 217
							var6.append(var15); // L: 218
							var4 += this.charWidth(var15); // L: 219
							if (this.kerning != null && var11 != -1) { // L: 220
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15; // L: 221
						}

						if (var15 == ' ') { // L: 223
							var7 = var6.length(); // L: 224
							var8 = var4; // L: 225
							var9 = 1; // L: 226
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) { // L: 228
							var3[var12] = var6.toString().substring(var5, var7 - var9); // L: 229
							++var12; // L: 230
							var5 = var7; // L: 231
							var7 = -1; // L: 232
							var4 -= var8; // L: 233
							var11 = 0; // L: 234
						}

						if (var15 == '-') { // L: 236
							var7 = var6.length(); // L: 237
							var8 = var4; // L: 238
							var9 = 0; // L: 239
						}
					}
				}
			}

			String var19 = var6.toString(); // L: 243
			if (var19.length() > var5) { // L: 244
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12; // L: 245
		}
	}

	@ObfuscatedName("s")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 249
		int var4 = 0; // L: 250

		for (int var5 = 0; var5 < var3; ++var5) { // L: 251
			int var6 = this.stringWidth(AbstractFont_lines[var5]); // L: 252
			if (var6 > var4) { // L: 253
				var4 = var6;
			}
		}

		return var4; // L: 255
	}

	@ObfuscatedName("t")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 259
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Lns;"
	)
	public Bounds method6372(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) { // L: 280
			int var6 = var4 - this.stringWidth(var3) / 2; // L: 283
			var6 += this.stringWidth(var3.substring(0, var1)); // L: 284
			int var7 = var5 - this.maxAscent; // L: 285
			int var8 = this.stringWidth(var3.substring(var1, var2 + var1)); // L: 286
			int var9 = this.maxAscent + this.maxDescent; // L: 287
			return new Bounds(var6, var7, var8, var9); // L: 288
		} else {
			return new Bounds(var4, var5, 0, 0); // L: 281
		}
	}

	@ObfuscatedName("u")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 292
			this.reset(var4, var5); // L: 293
			this.draw0(var1, var2, var3); // L: 294
		}
	} // L: 295

	@ObfuscatedName("k")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 298
			this.reset(var4, var5); // L: 299
			AbstractFont_alpha = var6; // L: 300
			this.draw0(var1, var2, var3); // L: 301
		}
	} // L: 302

	@ObfuscatedName("h")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 305
			this.reset(var4, var5); // L: 306
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 307
		}
	} // L: 308

	@ObfuscatedName("x")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 311
			this.reset(var4, var5); // L: 312
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 313
		}
	} // L: 314

	@ObfuscatedName("l")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) { // L: 317
			return 0;
		} else {
			this.reset(var6, var7); // L: 318
			if (var10 == 0) { // L: 319
				var10 = this.ascent;
			}

			int[] var11 = new int[]{var4}; // L: 320
			if (var5 < var10 + this.maxAscent + this.maxDescent && var5 < var10 + var10) { // L: 321
				var11 = null;
			}

			int var12 = this.breakLines(var1, var11, AbstractFont_lines); // L: 322
			if (var9 == 3 && var12 == 1) { // L: 324
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) { // L: 325
				var13 = var3 + this.maxAscent;
			} else if (var9 == 1) { // L: 326
				var13 = var3 + (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / 2 + this.maxAscent;
			} else if (var9 == 2) { // L: 327
				var13 = var3 + var5 - this.maxDescent - var10 * (var12 - 1);
			} else {
				var14 = (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / (var12 + 1); // L: 329
				if (var14 < 0) { // L: 330
					var14 = 0;
				}

				var13 = var3 + var14 + this.maxAscent; // L: 331
				var10 += var14; // L: 332
			}

			for (var14 = 0; var14 < var12; ++var14) { // L: 334
				if (var8 == 0) {
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 335
				} else if (var8 == 1) { // L: 336
					this.draw0(AbstractFont_lines[var14], var2 + (var4 - this.stringWidth(AbstractFont_lines[var14])) / 2, var13);
				} else if (var8 == 2) { // L: 337
					this.draw0(AbstractFont_lines[var14], var2 + var4 - this.stringWidth(AbstractFont_lines[var14]), var13);
				} else if (var14 == var12 - 1) { // L: 339
					this.draw0(AbstractFont_lines[var14], var2, var13);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var14], var4); // L: 341
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 342
					AbstractFont_justificationTotal = 0; // L: 343
				}

				var13 += var10; // L: 346
			}

			return var12; // L: 348
		}
	}

	@ObfuscatedName("a")
	@Export("drawCenteredWave")
	public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 352
			this.reset(var4, var5); // L: 353
			int[] var7 = new int[var1.length()]; // L: 354

			for (int var8 = 0; var8 < var1.length(); ++var8) { // L: 355
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7); // L: 356
		}
	} // L: 357

	@ObfuscatedName("p")
	@Export("drawCenteredWave2")
	public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 360
			this.reset(var4, var5); // L: 361
			int[] var7 = new int[var1.length()]; // L: 362
			int[] var8 = new int[var1.length()]; // L: 363

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 364
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D); // L: 365
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D); // L: 366
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8); // L: 368
		}
	} // L: 369

	@ObfuscatedName("b")
	@Export("drawCenteredShake")
	public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) { // L: 372
			this.reset(var4, var5); // L: 373
			double var8 = 7.0D - (double)var7 / 8.0D; // L: 374
			if (var8 < 0.0D) { // L: 375
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()]; // L: 376

			for (int var11 = 0; var11 < var1.length(); ++var11) { // L: 377
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10); // L: 378
		}
	} // L: 379

	@ObfuscatedName("n")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 382
			this.reset(var4, var5); // L: 383
			AbstractFont_random.setSeed((long)var6); // L: 384
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31); // L: 385
			int[] var7 = new int[var1.length()]; // L: 386
			int var8 = 0; // L: 387

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 388
				var7[var9] = var8; // L: 389
				if ((AbstractFont_random.nextInt() & 3) == 0) { // L: 390
					++var8;
				}
			}

			this.drawWithOffsets0(var1, var2, var3, var7, (int[])null); // L: 392
		}
	} // L: 393

	@ObfuscatedName("o")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1; // L: 396
		AbstractFont_underline = -1; // L: 397
		AbstractFont_previousShadow = var2; // L: 398
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1; // L: 399
		AbstractFont_color = var1;
		AbstractFont_alpha = 256; // L: 400
		AbstractFont_justificationTotal = 0; // L: 401
		AbstractFont_justificationCurrent = 0; // L: 402
	} // L: 403

	@ObfuscatedName("m")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) { // L: 407
				AbstractFont_color = ClientPacket.method5190(var1.substring(4), 16);
			} else if (var1.equals("/col")) { // L: 408
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 409
				AbstractFont_strike = ClientPacket.method5190(var1.substring(4), 16);
			} else if (var1.equals("str")) { // L: 410
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 411
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) { // L: 412
				AbstractFont_underline = ClientPacket.method5190(var1.substring(2), 16);
			} else if (var1.equals("u")) { // L: 413
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 414
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 415
				AbstractFont_shadow = ClientPacket.method5190(var1.substring(5), 16);
			} else if (var1.equals("shad")) { // L: 416
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 417
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) { // L: 418
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var3) { // L: 420
		}

	} // L: 421

	@ObfuscatedName("d")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 424
		boolean var4 = false; // L: 425

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 426
			char var6 = var1.charAt(var5); // L: 427
			if (var6 == '<') { // L: 428
				var4 = true;
			} else if (var6 == '>') { // L: 429
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 430
				++var3;
			}
		}

		if (var3 > 0) { // L: 432
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 433

	@ObfuscatedName("ad")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 436
		int var4 = -1; // L: 437
		int var5 = -1; // L: 438

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 439
			if (var1.charAt(var6) != 0) { // L: 440
				char var7 = (char)(class295.charToByteCp1252(var1.charAt(var6)) & 255); // L: 441
				if (var7 == '<') { // L: 442
					var4 = var6; // L: 443
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 446
						String var8 = var1.substring(var4 + 1, var6); // L: 447
						var4 = -1; // L: 448
						if (var8.equals("lt")) { // L: 449
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 450
								if (var8.startsWith("img=")) { // L: 451
									try {
										var9 = FaceNormal.method4344(var8.substring(4)); // L: 453
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 454
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 455
										var2 += var10.width; // L: 456
										var5 = -1; // L: 457
									} catch (Exception var14) { // L: 459
									}
								} else {
									this.decodeTag(var8); // L: 463
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 467
						var7 = ' ';
					}

					if (var4 == -1) { // L: 468
						if (this.kerning != null && var5 != -1) { // L: 469
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 470
						var9 = this.heights[var7]; // L: 471
						if (var7 != ' ') { // L: 472
							if (AbstractFont_alpha == 256) { // L: 473
								if (AbstractFont_shadow != -1) { // L: 474
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 475
							} else {
								if (AbstractFont_shadow != -1) { // L: 478
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 479
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 483
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 484
							var2 += AbstractFont_justificationCurrent >> 8; // L: 485
							AbstractFont_justificationCurrent &= 255; // L: 486
						}

						int var13 = this.advances[var7]; // L: 489
						if (AbstractFont_strike != -1) { // L: 490
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 491
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 492
						var5 = var7; // L: 493
					}
				}
			}
		}

	} // L: 496

	@ObfuscatedName("ak")
	@Export("drawWithOffsets0")
	void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.ascent; // L: 499
		int var6 = -1; // L: 500
		int var7 = -1; // L: 501
		int var8 = 0; // L: 502

		for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 503
			if (var1.charAt(var9) != 0) { // L: 504
				char var10 = (char)(class295.charToByteCp1252(var1.charAt(var9)) & 255); // L: 505
				if (var10 == '<') { // L: 506
					var6 = var9; // L: 507
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) { // L: 510
						String var11 = var1.substring(var6 + 1, var9); // L: 511
						var6 = -1; // L: 512
						if (var11.equals("lt")) { // L: 513
							var10 = '<';
						} else {
							if (!var11.equals("gt")) { // L: 514
								if (var11.startsWith("img=")) { // L: 515
									try {
										if (var4 != null) { // L: 518
											var12 = var4[var8];
										} else {
											var12 = 0; // L: 519
										}

										if (var5 != null) { // L: 521
											var13 = var5[var8];
										} else {
											var13 = 0; // L: 522
										}

										++var8; // L: 523
										var14 = FaceNormal.method4344(var11.substring(4)); // L: 524
										IndexedSprite var15 = AbstractFont_modIconSprites[var14]; // L: 525
										var15.drawAt(var12 + var2, var13 + (var3 + this.ascent - var15.height)); // L: 526
										var2 += var15.width; // L: 527
										var7 = -1; // L: 528
									} catch (Exception var19) { // L: 530
									}
								} else {
									this.decodeTag(var11); // L: 534
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) { // L: 538
						var10 = ' ';
					}

					if (var6 == -1) { // L: 539
						if (this.kerning != null && var7 != -1) { // L: 540
							var2 += this.kerning[var10 + (var7 << 8)];
						}

						int var17 = this.widths[var10]; // L: 541
						var12 = this.heights[var10]; // L: 542
						if (var4 != null) { // L: 544
							var13 = var4[var8];
						} else {
							var13 = 0; // L: 545
						}

						if (var5 != null) { // L: 547
							var14 = var5[var8];
						} else {
							var14 = 0; // L: 548
						}

						++var8; // L: 549
						if (var10 != ' ') { // L: 550
							if (AbstractFont_alpha == 256) { // L: 551
								if (AbstractFont_shadow != -1) { // L: 552
									AbstractFont_drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color); // L: 553
							} else {
								if (AbstractFont_shadow != -1) { // L: 556
									AbstractFont_drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color, AbstractFont_alpha); // L: 557
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 561
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 562
							var2 += AbstractFont_justificationCurrent >> 8; // L: 563
							AbstractFont_justificationCurrent &= 255; // L: 564
						}

						int var18 = this.advances[var10]; // L: 567
						if (AbstractFont_strike != -1) { // L: 568
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var18, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 569
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var18, AbstractFont_underline);
						}

						var2 += var18; // L: 570
						var7 = var10; // L: 571
					}
				}
			}
		}

	} // L: 574

	@ObfuscatedName("g")
	static int method6443(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5]; // L: 101
		int var8 = var7 + var4[var5]; // L: 102
		int var9 = var2[var6]; // L: 103
		int var10 = var9 + var4[var6]; // L: 104
		int var11 = var7; // L: 105
		if (var9 > var7) { // L: 106
			var11 = var9;
		}

		int var12 = var8; // L: 107
		if (var10 < var8) { // L: 108
			var12 = var10;
		}

		int var13 = var3[var5]; // L: 109
		if (var3[var6] < var13) { // L: 110
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5]; // L: 111
		byte[] var15 = var0[var6]; // L: 112
		int var16 = var11 - var7; // L: 113
		int var17 = var11 - var9; // L: 114

		for (int var18 = var11; var18 < var12; ++var18) { // L: 115
			int var19 = var14[var16++] + var15[var17++]; // L: 116
			if (var19 < var13) { // L: 117
				var13 = var19;
			}
		}

		return -var13; // L: 119
	}

	@ObfuscatedName("z")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length(); // L: 263
		int var2 = 0; // L: 264

		for (int var3 = 0; var3 < var1; ++var3) { // L: 265
			char var4 = var0.charAt(var3); // L: 266
			if (var4 == '<' || var4 == '>') {
				var2 += 3; // L: 267
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2); // L: 269

		for (int var7 = 0; var7 < var1; ++var7) { // L: 270
			char var5 = var0.charAt(var7); // L: 271
			if (var5 == '<') {
				var6.append("<lt>"); // L: 272
			} else if (var5 == '>') { // L: 273
				var6.append("<gt>");
			} else {
				var6.append(var5); // L: 274
			}
		}

		return var6.toString(); // L: 276
	}

	@ObfuscatedName("al")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 580
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 581
		int var8 = 0; // L: 582
		int var9 = 0; // L: 583
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 584
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 585
			var4 -= var10; // L: 586
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 587
			var9 += var3 * var10; // L: 588
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 589
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 591
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 592
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 593
			var3 -= var10; // L: 594
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 595
			var9 += var10; // L: 596
			var6 += var10; // L: 597
			var8 += var10; // L: 598
			var7 += var10; // L: 599
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 601
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 602
			var3 -= var10; // L: 603
			var8 += var10; // L: 604
			var7 += var10; // L: 605
		}

		if (var3 > 0 && var4 > 0) { // L: 607
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 608
		}
	} // L: 609

	@ObfuscatedName("ao")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 612
		var5 = -(var5 & 3); // L: 613

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 614
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 615
				if (var1[var3++] != 0) { // L: 616
					var0[var4++] = var2;
				} else {
					++var4; // L: 617
				}

				if (var1[var3++] != 0) { // L: 618
					var0[var4++] = var2;
				} else {
					++var4; // L: 619
				}

				if (var1[var3++] != 0) { // L: 620
					var0[var4++] = var2;
				} else {
					++var4; // L: 621
				}

				if (var1[var3++] != 0) { // L: 622
					var0[var4++] = var2;
				} else {
					++var4; // L: 623
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 625
				if (var1[var3++] != 0) { // L: 626
					var0[var4++] = var2;
				} else {
					++var4; // L: 627
				}
			}

			var4 += var7; // L: 629
			var3 += var8; // L: 630
		}

	} // L: 632

	@ObfuscatedName("ab")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 635
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 636
		int var9 = 0; // L: 637
		int var10 = 0; // L: 638
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 639
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 640
			var4 -= var11; // L: 641
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 642
			var10 += var3 * var11; // L: 643
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 644
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 646
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 647
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 648
			var3 -= var11; // L: 649
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 650
			var10 += var11; // L: 651
			var7 += var11; // L: 652
			var9 += var11; // L: 653
			var8 += var11; // L: 654
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 656
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 657
			var3 -= var11; // L: 658
			var9 += var11; // L: 659
			var8 += var11; // L: 660
		}

		if (var3 > 0 && var4 > 0) { // L: 662
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 663
		}
	} // L: 664

	@ObfuscatedName("ap")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 667
		var9 = 256 - var9; // L: 668

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 669
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 670
				if (var1[var3++] != 0) { // L: 671
					int var12 = var0[var4]; // L: 672
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 673
				} else {
					++var4; // L: 675
				}
			}

			var4 += var7; // L: 677
			var3 += var8; // L: 678
		}

	} // L: 680
}
