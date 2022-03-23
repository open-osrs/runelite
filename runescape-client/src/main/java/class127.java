import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class127 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1168568969
	)
	int field1531;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1531 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1531 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2919(this.field1531); // L: 123
	} // L: 124

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-81"
	)
	public static int method2831(int var0) {
		return class400.field4389[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IIIIIII)V",
		garbageValue = "1671310726"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 192
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 193

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 195
				if (var7 == 0) { // L: 196
					if (var1 == 0) { // L: 197
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 198
						int var11 = var2 + var4 + 932731; // L: 201
						int var12 = var3 + var5 + 556238; // L: 202
						int var13 = UserComparator6.method2631(45365 + var11, 91923 + var12, 4) - 128 + (UserComparator6.method2631(10294 + var11, 37821 + var12, 2) - 128 >> 1) + (UserComparator6.method2631(var11, var12, 1) - 128 >> 2); // L: 204
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 205
						if (var13 < 10) { // L: 206
							var13 = 10;
						} else if (var13 > 60) { // L: 207
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 210
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 212
					}
					break;
				}

				if (var7 == 1) { // L: 215
					int var8 = var0.readUnsignedByte(); // L: 216
					if (var8 == 1) { // L: 217
						var8 = 0;
					}

					if (var1 == 0) { // L: 218
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 219
					}
					break;
				}

				if (var7 <= 49) { // L: 222
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 223
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 224
					RunException.field4754[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 225
				} else if (var7 <= 81) { // L: 228
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 229
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 232
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 237
				if (var7 == 0) { // L: 238
					break;
				}

				if (var7 == 1) { // L: 239
					var0.readUnsignedByte(); // L: 240
					break;
				}

				if (var7 <= 49) { // L: 243
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 246

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 1264
		Login.Login_response2 = "Enter your username/email & password."; // L: 1265
		Login.Login_response3 = ""; // L: 1266
		class150.method3089(2); // L: 1267
		if (var0) { // L: 1268
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1270
			if (Interpreter.clientPreferences.method2273() != null) { // L: 1271
				Login.Login_username = Interpreter.clientPreferences.method2273(); // L: 1272
				Client.Login_isUsernameRemembered = true; // L: 1273
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1275
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1278
			Login.currentLoginField = 1; // L: 1279
		} else {
			Login.currentLoginField = 0; // L: 1282
		}

	} // L: 1285

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1828922441"
	)
	static final void method2827(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10074
		int var7 = var3 - var1; // L: 10075
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10076
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10077
		int var10 = var8; // L: 10078
		if (var8 < var9) { // L: 10079
			var10 = var9;
		}

		if (var10 != 0) { // L: 10080
			int var11 = (var6 << 16) / var10; // L: 10081
			int var12 = (var7 << 16) / var10; // L: 10082
			if (var12 <= var11) { // L: 10083
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10084
			}

			int var13 = var5 * var12 >> 17; // L: 10085
			int var14 = var5 * var12 + 1 >> 17; // L: 10086
			int var15 = var5 * var11 >> 17; // L: 10087
			int var16 = var5 * var11 + 1 >> 17; // L: 10088
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10089
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10090
			int var17 = var0 + var13; // L: 10091
			int var18 = var0 - var14; // L: 10092
			int var19 = var0 + var6 - var14; // L: 10093
			int var20 = var0 + var6 + var13; // L: 10094
			int var21 = var15 + var1; // L: 10095
			int var22 = var1 - var16; // L: 10096
			int var23 = var7 + var1 - var16; // L: 10097
			int var24 = var15 + var7 + var1; // L: 10098
			Rasterizer3D.method4024(var17, var18, var19); // L: 10099
			Rasterizer3D.method4007(var21, var22, var23, var17, var18, var19, var4); // L: 10100
			Rasterizer3D.method4024(var17, var19, var20); // L: 10101
			Rasterizer3D.method4007(var21, var23, var24, var17, var19, var20, var4); // L: 10102
		}
	} // L: 10103

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1923735470"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (MusicPatchNode2.loadInterface(var0)) { // L: 11277
			Widget[] var1 = EnumComposition.Widget_interfaceComponents[var0]; // L: 11278

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11279
				Widget var3 = var1[var2]; // L: 11280
				if (var3 != null) { // L: 11281
					var3.modelFrame = 0; // L: 11282
					var3.modelFrameCycle = 0; // L: 11283
				}
			}

		}
	} // L: 11285
}
