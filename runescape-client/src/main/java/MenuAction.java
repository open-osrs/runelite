import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -280091935
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1430754159
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1286467611
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1909904707
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("y")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 11701

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1250415572"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4187
			var2 = 1;
		}

		if (var3 < 1) { // L: 4188
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4189
		int var6;
		if (var5 < 0) { // L: 4191
			var6 = Client.field779;
		} else if (var5 >= 100) { // L: 4192
			var6 = Client.field913;
		} else {
			var6 = (Client.field913 - Client.field779) * var5 / 100 + Client.field779; // L: 4193
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4194
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field918) { // L: 4195
			var15 = Client.field918; // L: 4196
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4197
			if (var6 > Client.field690) { // L: 4198
				var6 = Client.field690; // L: 4199
				var8 = var3 * var6 * 512 / (var15 * 334); // L: 4200
				var9 = (var2 - var8) / 2; // L: 4201
				if (var4) { // L: 4202
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4203
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4204
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4205
				}

				var0 += var9; // L: 4207
				var2 -= var9 * 2; // L: 4208
			}
		} else if (var7 > Client.field846) { // L: 4211
			var15 = Client.field846; // L: 4212
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4213
			if (var6 < Client.field916) { // L: 4214
				var6 = Client.field916; // L: 4215
				var8 = var15 * var2 * 334 / (var6 * 512); // L: 4216
				var9 = (var3 - var8) / 2; // L: 4217
				if (var4) { // L: 4218
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4219
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4220
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4221
				}

				var1 += var9; // L: 4223
				var3 -= var9 * 2; // L: 4224
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4227
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4228
			int[] var14 = new int[9]; // L: 4230

			for (var9 = 0; var9 < var14.length; ++var9) { // L: 4231
				int var10 = var9 * 32 + 15 + 128; // L: 4232
				int var11 = var10 * 3 + 600; // L: 4235
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4238
				int var12 = SecureRandomCallable.method1233(var11, var3); // L: 4239
				var14[var9] = var12 * var13 >> 16; // L: 4240
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334); // L: 4242
		}

		Client.viewportOffsetX = var0; // L: 4245
		Client.viewportOffsetY = var1; // L: 4246
		Client.viewportWidth = var2; // L: 4247
		Client.viewportHeight = var3; // L: 4248
	} // L: 4249
}
