import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class231 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive ItemDefinition_archive;

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1537075351"
	)
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4175
			var2 = 1;
		}

		if (var3 < 1) { // L: 4176
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4177
		int var6;
		if (var5 < 0) { // L: 4179
			var6 = Client.field769;
		} else if (var5 >= 100) { // L: 4180
			var6 = Client.field928;
		} else {
			var6 = (Client.field928 - Client.field769) * var5 / 100 + Client.field769; // L: 4181
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4182
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field938) { // L: 4183
			var18 = Client.field938; // L: 4184
			var6 = var18 * var2 * 334 / (var3 * 512); // L: 4185
			if (var6 > Client.field932) { // L: 4186
				var6 = Client.field932; // L: 4187
				var8 = var3 * var6 * 512 / (var18 * 334); // L: 4188
				var9 = (var2 - var8) / 2; // L: 4189
				if (var4) { // L: 4190
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4191
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4192
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4193
				}

				var0 += var9; // L: 4195
				var2 -= var9 * 2; // L: 4196
			}
		} else if (var7 > Client.field934) { // L: 4199
			var18 = Client.field934; // L: 4200
			var6 = var18 * var2 * 334 / (var3 * 512); // L: 4201
			if (var6 < Client.field931) { // L: 4202
				var6 = Client.field931; // L: 4203
				var8 = var18 * var2 * 334 / (var6 * 512); // L: 4204
				var9 = (var3 - var8) / 2; // L: 4205
				if (var4) { // L: 4206
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4207
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4208
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4209
				}

				var1 += var9; // L: 4211
				var3 -= var9 * 2; // L: 4212
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4215
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4216
			int[] var17 = new int[9]; // L: 4218

			for (var9 = 0; var9 < var17.length; ++var9) { // L: 4219
				int var10 = var9 * 32 + 15 + 128; // L: 4220
				int var11 = var10 * 3 + 600; // L: 4223
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4226
				int var15 = var3 - 334; // L: 4229
				if (var15 < 0) { // L: 4230
					var15 = 0;
				} else if (var15 > 100) { // L: 4231
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight; // L: 4232
				int var14 = var11 * var16 / 256; // L: 4233
				var17[var9] = var13 * var14 >> 16; // L: 4236
			}

			Scene.Scene_buildVisiblityMap(var17, 500, 800, var2 * 334 / var3, 334); // L: 4238
		}

		Client.viewportOffsetX = var0; // L: 4241
		Client.viewportOffsetY = var1; // L: 4242
		Client.viewportWidth = var2; // L: 4243
		Client.viewportHeight = var3; // L: 4244
	} // L: 4245
}
