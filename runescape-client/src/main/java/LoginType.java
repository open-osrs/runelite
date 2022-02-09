import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4455;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4449;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4450;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4451;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4452;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4453;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static final LoginType field4457;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static final LoginType field4454;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2103098327
	)
	final int field4456;
	@ObfuscatedName("y")
	final String field4448;

	static {
		oldscape = new LoginType(4, 0, "", ""); // L: 5
		field4455 = new LoginType(3, 1, "", ""); // L: 6
		field4449 = new LoginType(8, 2, "", ""); // L: 7
		field4450 = new LoginType(6, 3, "", ""); // L: 8
		field4451 = new LoginType(2, 4, "", ""); // L: 9
		field4452 = new LoginType(1, 5, "", ""); // L: 10
		field4453 = new LoginType(5, 6, "", ""); // L: 11
		field4457 = new LoginType(7, 7, "", ""); // L: 12
		field4454 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4455, field4449, field4451, field4450}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4456 = var1; // L: 18
		this.field4448 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lok;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4456 = var1; // L: 23
		this.field4448 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4448; // L: 29
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FZI)F",
		garbageValue = "1071876585"
	)
	static float method7148(class115 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 185
		if (var0 != null && var0.method2617() != 0) { // L: 186
			float var4 = (float)var0.field1430[0].field1377; // L: 189
			float var5 = (float)var0.field1430[var0.method2617() - 1].field1377; // L: 190
			float var6 = var5 - var4; // L: 191
			if ((double)var6 == 0.0D) { // L: 192
				return var0.field1430[0].field1384; // L: 193
			} else {
				float var7 = 0.0F; // L: 195
				if (var1 > var5) { // L: 196
					var7 = (var1 - var5) / var6; // L: 197
				} else {
					var7 = (var1 - var4) / var6; // L: 200
				}

				double var8 = (double)((int)var7); // L: 202
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 203
				float var11 = var6 * var10; // L: 204
				var8 = Math.abs(var8 + 1.0D); // L: 205
				double var12 = var8 / 2.0D; // L: 206
				double var14 = (double)((int)var12); // L: 207
				var10 = (float)(var12 - var14); // L: 208
				float var16;
				float var17;
				if (var2) { // L: 211
					if (var0.field1422 == class114.field1412) { // L: 212
						if ((double)var10 != 0.0D) { // L: 213
							var11 += var4; // L: 214
						} else {
							var11 = var5 - var11; // L: 217
						}
					} else if (var0.field1422 != class114.field1410 && var0.field1422 != class114.field1413) { // L: 220
						if (var0.field1422 == class114.field1409) { // L: 223
							var11 = var4 - var1; // L: 224
							var16 = var0.field1430[0].field1379; // L: 225
							var17 = var0.field1430[0].field1380; // L: 226
							var3 = var0.field1430[0].field1384; // L: 227
							if ((double)var16 != 0.0D) { // L: 228
								var3 -= var11 * var17 / var16; // L: 229
							}

							return var3; // L: 231
						}
					} else {
						var11 = var5 - var11; // L: 221
					}
				} else if (var0.field1420 == class114.field1412) { // L: 235
					if (0.0D != (double)var10) { // L: 236
						var11 = var5 - var11; // L: 237
					} else {
						var11 += var4; // L: 240
					}
				} else if (var0.field1420 != class114.field1410 && var0.field1420 != class114.field1413) { // L: 243
					if (var0.field1420 == class114.field1409) { // L: 246
						var11 = var1 - var5; // L: 247
						var16 = var0.field1430[var0.method2617() - 1].field1381; // L: 248
						var17 = var0.field1430[var0.method2617() - 1].field1378; // L: 249
						var3 = var0.field1430[var0.method2617() - 1].field1384; // L: 250
						if (0.0D != (double)var16) { // L: 251
							var3 += var17 * var11 / var16; // L: 252
						}

						return var3; // L: 254
					}
				} else {
					var11 += var4; // L: 244
				}

				var3 = class127.method2767(var0, var11); // L: 257
				float var18;
				if (var2 && var0.field1422 == class114.field1413) { // L: 259
					var18 = var0.field1430[var0.method2617() - 1].field1384 - var0.field1430[0].field1384; // L: 260
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 261
				} else if (!var2 && var0.field1420 == class114.field1413) { // L: 263
					var18 = var0.field1430[var0.method2617() - 1].field1384 - var0.field1430[0].field1384; // L: 264
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 265
				}

				return var3; // L: 267
			}
		} else {
			return var3; // L: 187
		}
	}

	@ObfuscatedName("ka")
	static final void method7149(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11528
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11529
		GraphicsObject.method1890(); // L: 11530
		class424.clientPreferences.brightness = var0; // L: 11531
		GameEngine.savePreferences(); // L: 11532
	} // L: 11533
}
