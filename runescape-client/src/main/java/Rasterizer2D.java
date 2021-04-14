import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("Rasterizer2D")
public class Rasterizer2D extends DualNode {
	@ObfuscatedName("ay")
	@Export("Rasterizer2D_pixels")
	public static int[] Rasterizer2D_pixels;
	@ObfuscatedName("am")
	@Export("Rasterizer2D_width")
	public static int Rasterizer2D_width;
	@ObfuscatedName("ag")
	@Export("Rasterizer2D_height")
	public static int Rasterizer2D_height;
	@ObfuscatedName("aq")
	@Export("Rasterizer2D_yClipStart")
	public static int Rasterizer2D_yClipStart;
	@ObfuscatedName("at")
	@Export("Rasterizer2D_yClipEnd")
	public static int Rasterizer2D_yClipEnd;
	@ObfuscatedName("aj")
	@Export("Rasterizer2D_xClipStart")
	public static int Rasterizer2D_xClipStart;
	@ObfuscatedName("aw")
	@Export("Rasterizer2D_xClipEnd")
	public static int Rasterizer2D_xClipEnd;

	static {
		Rasterizer2D_yClipStart = 0; // L: 11
		Rasterizer2D_yClipEnd = 0; // L: 12
		Rasterizer2D_xClipStart = 0; // L: 13
		Rasterizer2D_xClipEnd = 0; // L: 14
	}

	protected Rasterizer2D() {
	} // L: 16

	@ObfuscatedName("dc")
	@Export("Rasterizer2D_replace")
	public static void Rasterizer2D_replace(int[] var0, int var1, int var2) {
		Rasterizer2D_pixels = var0; // L: 19
		Rasterizer2D_width = var1; // L: 20
		Rasterizer2D_height = var2; // L: 21
		Rasterizer2D_setClip(0, 0, var1, var2); // L: 22
	} // L: 23

	@ObfuscatedName("dn")
	@Export("Rasterizer2D_resetClip")
	public static void Rasterizer2D_resetClip() {
		Rasterizer2D_xClipStart = 0; // L: 26
		Rasterizer2D_yClipStart = 0; // L: 27
		Rasterizer2D_xClipEnd = Rasterizer2D_width; // L: 28
		Rasterizer2D_yClipEnd = Rasterizer2D_height; // L: 29
	} // L: 30

	@ObfuscatedName("de")
	@Export("Rasterizer2D_setClip")
	public static void Rasterizer2D_setClip(int var0, int var1, int var2, int var3) {
		if (var0 < 0) { // L: 33
			var0 = 0;
		}

		if (var1 < 0) { // L: 34
			var1 = 0;
		}

		if (var2 > Rasterizer2D_width) { // L: 35
			var2 = Rasterizer2D_width;
		}

		if (var3 > Rasterizer2D_height) {
			var3 = Rasterizer2D_height; // L: 36
		}

		Rasterizer2D_xClipStart = var0; // L: 37
		Rasterizer2D_yClipStart = var1; // L: 38
		Rasterizer2D_xClipEnd = var2; // L: 39
		Rasterizer2D_yClipEnd = var3; // L: 40
	} // L: 41

	@ObfuscatedName("da")
	@Export("Rasterizer2D_expandClip")
	public static void Rasterizer2D_expandClip(int var0, int var1, int var2, int var3) {
		if (Rasterizer2D_xClipStart < var0) { // L: 44
			Rasterizer2D_xClipStart = var0;
		}

		if (Rasterizer2D_yClipStart < var1) { // L: 45
			Rasterizer2D_yClipStart = var1;
		}

		if (Rasterizer2D_xClipEnd > var2) { // L: 46
			Rasterizer2D_xClipEnd = var2;
		}

		if (Rasterizer2D_yClipEnd > var3) { // L: 47
			Rasterizer2D_yClipEnd = var3;
		}

	} // L: 48

	@ObfuscatedName("dz")
	@Export("Rasterizer2D_getClipArray")
	public static void Rasterizer2D_getClipArray(int[] var0) {
		var0[0] = Rasterizer2D_xClipStart; // L: 51
		var0[1] = Rasterizer2D_yClipStart; // L: 52
		var0[2] = Rasterizer2D_xClipEnd; // L: 53
		var0[3] = Rasterizer2D_yClipEnd; // L: 54
	} // L: 55

	@ObfuscatedName("dr")
	@Export("Rasterizer2D_setClipArray")
	public static void Rasterizer2D_setClipArray(int[] var0) {
		Rasterizer2D_xClipStart = var0[0]; // L: 58
		Rasterizer2D_yClipStart = var0[1]; // L: 59
		Rasterizer2D_xClipEnd = var0[2]; // L: 60
		Rasterizer2D_yClipEnd = var0[3]; // L: 61
	} // L: 62

	@ObfuscatedName("dh")
	@Export("Rasterizer2D_clear")
	public static void Rasterizer2D_clear() {
		int var0 = 0; // L: 65

		int var1;
		for (var1 = Rasterizer2D_width * Rasterizer2D_height - 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) { // L: 66 67 75
			Rasterizer2D_pixels[var0++] = 0; // L: 68
			Rasterizer2D_pixels[var0++] = 0; // L: 69
			Rasterizer2D_pixels[var0++] = 0; // L: 70
			Rasterizer2D_pixels[var0++] = 0; // L: 71
			Rasterizer2D_pixels[var0++] = 0; // L: 72
			Rasterizer2D_pixels[var0++] = 0; // L: 73
			Rasterizer2D_pixels[var0++] = 0; // L: 74
		}

		for (var1 += 7; var0 < var1; Rasterizer2D_pixels[var0++] = 0) { // L: 77 78
		}

	} // L: 79

	@ObfuscatedName("du")
	@Export("drawCircle")
	static void drawCircle(int var0, int var1, int var2, int var3) {
		if (var2 == 0) { // L: 82
			Rasterizer2D_setPixel(var0, var1, var3); // L: 83
		} else {
			if (var2 < 0) { // L: 86
				var2 = -var2;
			}

			int var4 = var1 - var2; // L: 87
			if (var4 < Rasterizer2D_yClipStart) { // L: 88
				var4 = Rasterizer2D_yClipStart;
			}

			int var5 = var2 + var1 + 1; // L: 89
			if (var5 > Rasterizer2D_yClipEnd) { // L: 90
				var5 = Rasterizer2D_yClipEnd;
			}

			int var6 = var4; // L: 91
			int var7 = var2 * var2; // L: 92
			int var8 = 0; // L: 93
			int var9 = var1 - var4; // L: 94
			int var10 = var9 * var9; // L: 95
			int var11 = var10 - var9; // L: 96
			if (var1 > var5) { // L: 97
				var1 = var5;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			while (var6 < var1) { // L: 98
				while (var11 <= var7 || var10 <= var7) { // L: 99
					var10 = var10 + var8 + var8; // L: 100
					var11 += var8++ + var8; // L: 101
				}

				var12 = var0 - var8 + 1; // L: 103
				if (var12 < Rasterizer2D_xClipStart) { // L: 104
					var12 = Rasterizer2D_xClipStart;
				}

				var13 = var0 + var8; // L: 105
				if (var13 > Rasterizer2D_xClipEnd) { // L: 106
					var13 = Rasterizer2D_xClipEnd;
				}

				var14 = var12 + var6 * Rasterizer2D_width; // L: 107

				for (var15 = var12; var15 < var13; ++var15) { // L: 108
					Rasterizer2D_pixels[var14++] = var3;
				}

				++var6; // L: 109
				var10 -= var9-- + var9; // L: 110
				var11 -= var9 + var9; // L: 111
			}

			var8 = var2; // L: 113
			var9 = var6 - var1; // L: 114
			var11 = var7 + var9 * var9; // L: 115
			var10 = var11 - var2; // L: 116

			for (var11 -= var9; var6 < var5; var10 += var9++ + var9) { // L: 117 118 131
				while (var11 > var7 && var10 > var7) { // L: 119
					var11 -= var8-- + var8; // L: 120
					var10 -= var8 + var8; // L: 121
				}

				var12 = var0 - var8; // L: 123
				if (var12 < Rasterizer2D_xClipStart) { // L: 124
					var12 = Rasterizer2D_xClipStart;
				}

				var13 = var0 + var8; // L: 125
				if (var13 > Rasterizer2D_xClipEnd - 1) { // L: 126
					var13 = Rasterizer2D_xClipEnd - 1;
				}

				var14 = var12 + var6 * Rasterizer2D_width; // L: 127

				for (var15 = var12; var15 <= var13; ++var15) {
					Rasterizer2D_pixels[var14++] = var3; // L: 128
				}

				++var6; // L: 129
				var11 = var11 + var9 + var9; // L: 130
			}

		}
	} // L: 84 133

	@ObfuscatedName("di")
	@Export("Rasterizer2D_drawCircleAlpha")
	public static void Rasterizer2D_drawCircleAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) { // L: 136
			if (var4 == 256) { // L: 137
				drawCircle(var0, var1, var2, var3); // L: 138
			} else {
				if (var2 < 0) { // L: 141
					var2 = -var2;
				}

				int var5 = 256 - var4; // L: 142
				int var6 = (var3 >> 16 & 255) * var4; // L: 143
				int var7 = (var3 >> 8 & 255) * var4; // L: 144
				int var8 = var4 * (var3 & 255); // L: 145
				int var12 = var1 - var2; // L: 149
				if (var12 < Rasterizer2D_yClipStart) { // L: 150
					var12 = Rasterizer2D_yClipStart;
				}

				int var13 = var2 + var1 + 1; // L: 151
				if (var13 > Rasterizer2D_yClipEnd) { // L: 152
					var13 = Rasterizer2D_yClipEnd;
				}

				int var14 = var12; // L: 153
				int var15 = var2 * var2; // L: 154
				int var16 = 0; // L: 155
				int var17 = var1 - var12; // L: 156
				int var18 = var17 * var17; // L: 157
				int var19 = var18 - var17; // L: 158
				if (var1 > var13) { // L: 159
					var1 = var13;
				}

				int var9;
				int var10;
				int var11;
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				while (var14 < var1) { // L: 160
					while (var19 <= var15 || var18 <= var15) { // L: 161
						var18 = var18 + var16 + var16; // L: 162
						var19 += var16++ + var16; // L: 163
					}

					var20 = var0 - var16 + 1; // L: 165
					if (var20 < Rasterizer2D_xClipStart) { // L: 166
						var20 = Rasterizer2D_xClipStart;
					}

					var21 = var0 + var16; // L: 167
					if (var21 > Rasterizer2D_xClipEnd) { // L: 168
						var21 = Rasterizer2D_xClipEnd;
					}

					var22 = var20 + var14 * Rasterizer2D_width; // L: 169

					for (var23 = var20; var23 < var21; ++var23) { // L: 170
						var9 = var5 * (Rasterizer2D_pixels[var22] >> 16 & 255); // L: 171
						var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5; // L: 172
						var11 = var5 * (Rasterizer2D_pixels[var22] & 255); // L: 173
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 174
						Rasterizer2D_pixels[var22++] = var24; // L: 175
					}

					++var14; // L: 177
					var18 -= var17-- + var17; // L: 178
					var19 -= var17 + var17; // L: 179
				}

				var16 = var2; // L: 181
				var17 = -var17; // L: 182
				var19 = var15 + var17 * var17; // L: 183
				var18 = var19 - var2; // L: 184

				for (var19 -= var17; var14 < var13; var18 += var17++ + var17) { // L: 185 186 205
					while (var19 > var15 && var18 > var15) { // L: 187
						var19 -= var16-- + var16; // L: 188
						var18 -= var16 + var16; // L: 189
					}

					var20 = var0 - var16; // L: 191
					if (var20 < Rasterizer2D_xClipStart) { // L: 192
						var20 = Rasterizer2D_xClipStart;
					}

					var21 = var0 + var16; // L: 193
					if (var21 > Rasterizer2D_xClipEnd - 1) { // L: 194
						var21 = Rasterizer2D_xClipEnd - 1;
					}

					var22 = var20 + var14 * Rasterizer2D_width; // L: 195

					for (var23 = var20; var23 <= var21; ++var23) { // L: 196
						var9 = var5 * (Rasterizer2D_pixels[var22] >> 16 & 255); // L: 197
						var10 = (Rasterizer2D_pixels[var22] >> 8 & 255) * var5; // L: 198
						var11 = var5 * (Rasterizer2D_pixels[var22] & 255); // L: 199
						var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 200
						Rasterizer2D_pixels[var22++] = var24; // L: 201
					}

					++var14; // L: 203
					var19 = var19 + var17 + var17; // L: 204
				}

			}
		}
	} // L: 139 207

	@ObfuscatedName("dp")
	@Export("Rasterizer2D_fillRectangleAlpha")
	public static void Rasterizer2D_fillRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < Rasterizer2D_xClipStart) { // L: 210
			var2 -= Rasterizer2D_xClipStart - var0; // L: 211
			var0 = Rasterizer2D_xClipStart; // L: 212
		}

		if (var1 < Rasterizer2D_yClipStart) { // L: 214
			var3 -= Rasterizer2D_yClipStart - var1; // L: 215
			var1 = Rasterizer2D_yClipStart; // L: 216
		}

		if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 218
			var2 = Rasterizer2D_xClipEnd - var0;
		}

		if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 219
			var3 = Rasterizer2D_yClipEnd - var1;
		}

		var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & 65280) >> 8 & 65280); // L: 220
		int var6 = 256 - var5; // L: 221
		int var7 = Rasterizer2D_width - var2; // L: 222
		int var8 = var0 + Rasterizer2D_width * var1; // L: 223

		for (int var9 = 0; var9 < var3; ++var9) { // L: 224
			for (int var10 = -var2; var10 < 0; ++var10) { // L: 225
				int var11 = Rasterizer2D_pixels[var8]; // L: 226
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & 65280) >> 8 & 65280); // L: 227
				Rasterizer2D_pixels[var8++] = var11 + var4; // L: 228
			}

			var8 += var7; // L: 230
		}

	} // L: 232

	@ObfuscatedName("db")
	@Export("Rasterizer2D_fillRectangle")
	public static void Rasterizer2D_fillRectangle(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < Rasterizer2D_xClipStart) { // L: 235
			var2 -= Rasterizer2D_xClipStart - var0; // L: 236
			var0 = Rasterizer2D_xClipStart; // L: 237
		}

		if (var1 < Rasterizer2D_yClipStart) { // L: 239
			var3 -= Rasterizer2D_yClipStart - var1; // L: 240
			var1 = Rasterizer2D_yClipStart; // L: 241
		}

		if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 243
			var2 = Rasterizer2D_xClipEnd - var0;
		}

		if (var3 + var1 > Rasterizer2D_yClipEnd) {
			var3 = Rasterizer2D_yClipEnd - var1; // L: 244
		}

		int var5 = Rasterizer2D_width - var2; // L: 245
		int var6 = var0 + Rasterizer2D_width * var1; // L: 246

		for (int var7 = -var3; var7 < 0; ++var7) { // L: 247
			for (int var8 = -var2; var8 < 0; ++var8) { // L: 248
				Rasterizer2D_pixels[var6++] = var4; // L: 249
			}

			var6 += var5; // L: 251
		}

	} // L: 253

	@ObfuscatedName("ds")
	@Export("Rasterizer2D_fillRectangleGradient")
	public static void Rasterizer2D_fillRectangleGradient(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) { // L: 256
			int var6 = 0; // L: 257
			int var7 = 65536 / var3; // L: 258
			if (var0 < Rasterizer2D_xClipStart) { // L: 259
				var2 -= Rasterizer2D_xClipStart - var0; // L: 260
				var0 = Rasterizer2D_xClipStart; // L: 261
			}

			if (var1 < Rasterizer2D_yClipStart) { // L: 263
				var6 += (Rasterizer2D_yClipStart - var1) * var7; // L: 264
				var3 -= Rasterizer2D_yClipStart - var1; // L: 265
				var1 = Rasterizer2D_yClipStart; // L: 266
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 268
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 269
				var3 = Rasterizer2D_yClipEnd - var1;
			}

			int var8 = Rasterizer2D_width - var2; // L: 270
			int var9 = var0 + Rasterizer2D_width * var1; // L: 271

			for (int var10 = -var3; var10 < 0; ++var10) { // L: 272
				int var11 = 65536 - var6 >> 8; // L: 273
				int var12 = var6 >> 8; // L: 274
				int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & 65280) + var11 * (var4 & 65280) & 16711680) >>> 8; // L: 275

				for (int var14 = -var2; var14 < 0; ++var14) { // L: 276
					Rasterizer2D_pixels[var9++] = var13; // L: 277
				}

				var9 += var8; // L: 279
				var6 += var7; // L: 280
			}

		}
	} // L: 282

	@ObfuscatedName("dv")
	@Export("Rasterizer2D_fillRectangleGradientAlpha")
	public static void Rasterizer2D_fillRectangleGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) { // L: 285
			int var8 = 0; // L: 286
			int var9 = 65536 / var3; // L: 287
			if (var0 < Rasterizer2D_xClipStart) { // L: 288
				var2 -= Rasterizer2D_xClipStart - var0; // L: 289
				var0 = Rasterizer2D_xClipStart; // L: 290
			}

			if (var1 < Rasterizer2D_yClipStart) { // L: 292
				var8 += (Rasterizer2D_yClipStart - var1) * var9; // L: 293
				var3 -= Rasterizer2D_yClipStart - var1; // L: 294
				var1 = Rasterizer2D_yClipStart; // L: 295
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 297
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			if (var3 + var1 > Rasterizer2D_yClipEnd) { // L: 298
				var3 = Rasterizer2D_yClipEnd - var1;
			}

			int var10 = Rasterizer2D_width - var2; // L: 299
			int var11 = var0 + Rasterizer2D_width * var1; // L: 300

			for (int var12 = -var3; var12 < 0; ++var12) { // L: 301
				int var13 = 65536 - var8 >> 8; // L: 302
				int var14 = var8 >> 8; // L: 303
				int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8; // L: 304
				if (var15 == 0) { // L: 305
					var11 += Rasterizer2D_width; // L: 306
					var8 += var9; // L: 307
				} else {
					int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & 65280) + var13 * (var4 & 65280) & 16711680) >>> 8; // L: 310
					int var17 = 255 - var15; // L: 311
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280); // L: 312

					for (int var19 = -var2; var19 < 0; ++var19) { // L: 313
						int var20 = Rasterizer2D_pixels[var11]; // L: 314
						if (var20 == 0) { // L: 315
							Rasterizer2D_pixels[var11++] = var18; // L: 316
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280); // L: 319
							Rasterizer2D_pixels[var11++] = var18 + var20; // L: 320
						}
					}

					var11 += var10; // L: 323
					var8 += var9; // L: 324
				}
			}

		}
	} // L: 326

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(IIIIII[BIZ)V",
		garbageValue = "1"
	)
	@Export("Rasterizer2D_drawGradientPixels")
	public static void Rasterizer2D_drawGradientPixels(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
		if (var0 + var2 >= 0 && var3 + var1 >= 0) { // L: 329
			if (var0 < Rasterizer2D_width && var1 < Rasterizer2D_height) { // L: 330
				int var8 = 0; // L: 331
				int var9 = 0; // L: 332
				if (var0 < 0) { // L: 333
					var8 -= var0; // L: 334
					var2 += var0; // L: 335
				}

				if (var1 < 0) { // L: 337
					var9 -= var1; // L: 338
					var3 += var1; // L: 339
				}

				if (var0 + var2 > Rasterizer2D_width) { // L: 341
					var2 = Rasterizer2D_width - var0; // L: 342
				}

				if (var3 + var1 > Rasterizer2D_height) { // L: 344
					var3 = Rasterizer2D_height - var1; // L: 345
				}

				int var10 = var6.length / var7; // L: 347
				int var11 = Rasterizer2D_width - var2; // L: 348
				int var12 = var4 >>> 24; // L: 349
				int var13 = var5 >>> 24; // L: 350
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var12 == 255 && var13 == 255) { // L: 351
					var14 = var0 + var8 + (var9 + var1) * Rasterizer2D_width; // L: 352

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) { // L: 353
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) { // L: 354
							var17 = (var15 - var1) % var10; // L: 355
							var18 = (var16 - var0) % var7; // L: 356
							if (var6[var18 + var17 * var7] != 0) { // L: 357
								Rasterizer2D_pixels[var14++] = var5;
							} else {
								Rasterizer2D_pixels[var14++] = var4; // L: 358
							}
						}

						var14 += var11; // L: 360
					}
				} else {
					var14 = var0 + var8 + (var9 + var1) * Rasterizer2D_width; // L: 364

					for (var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) { // L: 365
						for (var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) { // L: 366
							var17 = (var15 - var1) % var10; // L: 367
							var18 = (var16 - var0) % var7; // L: 368
							int var19 = var4; // L: 369
							if (var6[var18 + var17 * var7] != 0) { // L: 370
								var19 = var5;
							}

							int var20 = var19 >>> 24; // L: 371
							int var21 = 255 - var20; // L: 372
							int var22 = Rasterizer2D_pixels[var14]; // L: 373
							int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & 65280) + var21 * (var22 & 65280) & 16711680) >> 8; // L: 374
							Rasterizer2D_pixels[var14++] = var23; // L: 375
						}

						var14 += var11; // L: 377
					}
				}

			}
		}
	} // L: 380

	@ObfuscatedName("df")
	@Export("Rasterizer2D_drawRectangle")
	public static void Rasterizer2D_drawRectangle(int var0, int var1, int var2, int var3, int var4) {
		Rasterizer2D_drawHorizontalLine(var0, var1, var2, var4); // L: 383
		Rasterizer2D_drawHorizontalLine(var0, var3 + var1 - 1, var2, var4); // L: 384
		Rasterizer2D_drawVerticalLine(var0, var1, var3, var4); // L: 385
		Rasterizer2D_drawVerticalLine(var0 + var2 - 1, var1, var3, var4); // L: 386
	} // L: 387

	@ObfuscatedName("dx")
	@Export("Rasterizer2D_drawRectangleAlpha")
	public static void Rasterizer2D_drawRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
		Rasterizer2D_drawHorizontalLineAlpha(var0, var1, var2, var4, var5); // L: 390
		Rasterizer2D_drawHorizontalLineAlpha(var0, var3 + var1 - 1, var2, var4, var5); // L: 391
		if (var3 >= 3) { // L: 392
			Rasterizer2D_drawVerticalLineAlpha(var0, var1 + 1, var3 - 2, var4, var5); // L: 393
			Rasterizer2D_drawVerticalLineAlpha(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5); // L: 394
		}

	} // L: 396

	@ObfuscatedName("dj")
	@Export("Rasterizer2D_drawHorizontalLine")
	public static void Rasterizer2D_drawHorizontalLine(int var0, int var1, int var2, int var3) {
		if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) { // L: 399
			if (var0 < Rasterizer2D_xClipStart) { // L: 400
				var2 -= Rasterizer2D_xClipStart - var0; // L: 401
				var0 = Rasterizer2D_xClipStart; // L: 402
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 404
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			int var4 = var0 + Rasterizer2D_width * var1; // L: 405

			for (int var5 = 0; var5 < var2; ++var5) { // L: 406
				Rasterizer2D_pixels[var4 + var5] = var3;
			}

		}
	} // L: 407

	@ObfuscatedName("dt")
	@Export("Rasterizer2D_drawHorizontalLineAlpha")
	static void Rasterizer2D_drawHorizontalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= Rasterizer2D_yClipStart && var1 < Rasterizer2D_yClipEnd) { // L: 410
			if (var0 < Rasterizer2D_xClipStart) { // L: 411
				var2 -= Rasterizer2D_xClipStart - var0; // L: 412
				var0 = Rasterizer2D_xClipStart; // L: 413
			}

			if (var0 + var2 > Rasterizer2D_xClipEnd) { // L: 415
				var2 = Rasterizer2D_xClipEnd - var0;
			}

			int var5 = 256 - var4; // L: 416
			int var6 = (var3 >> 16 & 255) * var4; // L: 417
			int var7 = (var3 >> 8 & 255) * var4; // L: 418
			int var8 = var4 * (var3 & 255); // L: 419
			int var12 = var0 + Rasterizer2D_width * var1; // L: 423

			for (int var13 = 0; var13 < var2; ++var13) { // L: 424
				int var9 = var5 * (Rasterizer2D_pixels[var12] >> 16 & 255); // L: 425
				int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5; // L: 426
				int var11 = var5 * (Rasterizer2D_pixels[var12] & 255); // L: 427
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 428
				Rasterizer2D_pixels[var12++] = var14; // L: 429
			}

		}
	} // L: 431

	@ObfuscatedName("dd")
	@Export("Rasterizer2D_drawVerticalLine")
	public static void Rasterizer2D_drawVerticalLine(int var0, int var1, int var2, int var3) {
		if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) { // L: 434
			if (var1 < Rasterizer2D_yClipStart) { // L: 435
				var2 -= Rasterizer2D_yClipStart - var1; // L: 436
				var1 = Rasterizer2D_yClipStart; // L: 437
			}

			if (var2 + var1 > Rasterizer2D_yClipEnd) { // L: 439
				var2 = Rasterizer2D_yClipEnd - var1;
			}

			int var4 = var0 + Rasterizer2D_width * var1; // L: 440

			for (int var5 = 0; var5 < var2; ++var5) { // L: 441
				Rasterizer2D_pixels[var4 + var5 * Rasterizer2D_width] = var3;
			}

		}
	} // L: 442

	@ObfuscatedName("dw")
	@Export("Rasterizer2D_drawVerticalLineAlpha")
	static void Rasterizer2D_drawVerticalLineAlpha(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= Rasterizer2D_xClipStart && var0 < Rasterizer2D_xClipEnd) { // L: 445
			if (var1 < Rasterizer2D_yClipStart) { // L: 446
				var2 -= Rasterizer2D_yClipStart - var1; // L: 447
				var1 = Rasterizer2D_yClipStart; // L: 448
			}

			if (var2 + var1 > Rasterizer2D_yClipEnd) { // L: 450
				var2 = Rasterizer2D_yClipEnd - var1;
			}

			int var5 = 256 - var4; // L: 451
			int var6 = (var3 >> 16 & 255) * var4; // L: 452
			int var7 = (var3 >> 8 & 255) * var4; // L: 453
			int var8 = var4 * (var3 & 255); // L: 454
			int var12 = var0 + Rasterizer2D_width * var1; // L: 458

			for (int var13 = 0; var13 < var2; ++var13) { // L: 459
				int var9 = var5 * (Rasterizer2D_pixels[var12] >> 16 & 255); // L: 460
				int var10 = (Rasterizer2D_pixels[var12] >> 8 & 255) * var5; // L: 461
				int var11 = var5 * (Rasterizer2D_pixels[var12] & 255); // L: 462
				int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8); // L: 463
				Rasterizer2D_pixels[var12] = var14; // L: 464
				var12 += Rasterizer2D_width; // L: 465
			}

		}
	} // L: 467

	@ObfuscatedName("ec")
	@Export("Rasterizer2D_drawLine")
	public static void Rasterizer2D_drawLine(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0; // L: 470
		var3 -= var1; // L: 471
		if (var3 == 0) { // L: 472
			if (var2 >= 0) { // L: 473
				Rasterizer2D_drawHorizontalLine(var0, var1, var2 + 1, var4);
			} else {
				Rasterizer2D_drawHorizontalLine(var0 + var2, var1, -var2 + 1, var4); // L: 474
			}

		} else if (var2 == 0) { // L: 477
			if (var3 >= 0) { // L: 478
				Rasterizer2D_drawVerticalLine(var0, var1, var3 + 1, var4);
			} else {
				Rasterizer2D_drawVerticalLine(var0, var3 + var1, -var3 + 1, var4); // L: 479
			}

		} else {
			if (var3 + var2 < 0) { // L: 482
				var0 += var2; // L: 483
				var2 = -var2; // L: 484
				var1 += var3; // L: 485
				var3 = -var3; // L: 486
			}

			int var5;
			int var6;
			if (var2 > var3) { // L: 488
				var1 <<= 16; // L: 489
				var1 += 32768; // L: 490
				var3 <<= 16; // L: 491
				var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D); // L: 492
				var2 += var0; // L: 493
				if (var0 < Rasterizer2D_xClipStart) { // L: 494
					var1 += var5 * (Rasterizer2D_xClipStart - var0); // L: 495
					var0 = Rasterizer2D_xClipStart; // L: 496
				}

				if (var2 >= Rasterizer2D_xClipEnd) { // L: 498
					var2 = Rasterizer2D_xClipEnd - 1;
				}

				while (var0 <= var2) { // L: 499
					var6 = var1 >> 16; // L: 500
					if (var6 >= Rasterizer2D_yClipStart && var6 < Rasterizer2D_yClipEnd) { // L: 501
						Rasterizer2D_pixels[var0 + var6 * Rasterizer2D_width] = var4;
					}

					var1 += var5; // L: 502
					++var0; // L: 503
				}
			} else {
				var0 <<= 16; // L: 507
				var0 += 32768; // L: 508
				var2 <<= 16; // L: 509
				var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D); // L: 510
				var3 += var1; // L: 511
				if (var1 < Rasterizer2D_yClipStart) { // L: 512
					var0 += (Rasterizer2D_yClipStart - var1) * var5; // L: 513
					var1 = Rasterizer2D_yClipStart; // L: 514
				}

				if (var3 >= Rasterizer2D_yClipEnd) { // L: 516
					var3 = Rasterizer2D_yClipEnd - 1;
				}

				while (var1 <= var3) { // L: 517
					var6 = var0 >> 16; // L: 518
					if (var6 >= Rasterizer2D_xClipStart && var6 < Rasterizer2D_xClipEnd) { // L: 519
						Rasterizer2D_pixels[var6 + Rasterizer2D_width * var1] = var4;
					}

					var0 += var5; // L: 520
					++var1; // L: 521
				}
			}

		}
	} // L: 475 480 524

	@ObfuscatedName("ek")
	@Export("Rasterizer2D_setPixel")
	static void Rasterizer2D_setPixel(int var0, int var1, int var2) {
		if (var0 >= Rasterizer2D_xClipStart && var1 >= Rasterizer2D_yClipStart && var0 < Rasterizer2D_xClipEnd && var1 < Rasterizer2D_yClipEnd) { // L: 527
			Rasterizer2D_pixels[var0 + Rasterizer2D_width * var1] = var2; // L: 528
		}
	} // L: 529

	@ObfuscatedName("ei")
	@Export("Rasterizer2D_fillMaskedRectangle")
	public static void Rasterizer2D_fillMaskedRectangle(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + Rasterizer2D_width * var1; // L: 532

		for (var1 = 0; var1 < var3.length; ++var1) { // L: 533
			int var6 = var5 + var3[var1]; // L: 534

			for (var0 = -var4[var1]; var0 < 0; ++var0) { // L: 535
				Rasterizer2D_pixels[var6++] = var2;
			}

			var5 += Rasterizer2D_width; // L: 536
		}

	} // L: 538
}
