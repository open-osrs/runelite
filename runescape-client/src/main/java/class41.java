import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class41 {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static TextureProvider textureProvider;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lis;",
		garbageValue = "306746421"
	)
	public static StudioGame[] method624() {
		return new StudioGame[]{StudioGame.game4, StudioGame.game3, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game5, StudioGame.runescape}; // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IILgk;Lft;B)Z",
		garbageValue = "68"
	)
	static final boolean method619(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 190
		int var5 = var1; // L: 191
		byte var6 = 64; // L: 192
		byte var7 = 64; // L: 193
		int var8 = var0 - var6; // L: 194
		int var9 = var1 - var7; // L: 195
		class182.directions[var6][var7] = 99; // L: 196
		class182.distances[var6][var7] = 0; // L: 197
		byte var10 = 0; // L: 198
		int var11 = 0; // L: 199
		class182.bufferX[var10] = var0; // L: 200
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1; // L: 201
		int[][] var12 = var3.flags; // L: 202

		while (var18 != var11) { // L: 203
			var4 = class182.bufferX[var11]; // L: 204
			var5 = class182.bufferY[var11]; // L: 205
			var11 = var11 + 1 & 4095; // L: 206
			int var16 = var4 - var8; // L: 207
			int var17 = var5 - var9; // L: 208
			int var13 = var4 - var3.xInset; // L: 209
			int var14 = var5 - var3.yInset; // L: 210
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 211
				class182.field2135 = var4; // L: 212
				class182.field2136 = var5; // L: 213
				return true; // L: 214
			}

			int var15 = class182.distances[var16][var17] + 1; // L: 216
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 217 218 219 220
				class182.bufferX[var18] = var4 - 1; // L: 221
				class182.bufferY[var18] = var5; // L: 222
				var18 = var18 + 1 & 4095; // L: 223
				class182.directions[var16 - 1][var17] = 2; // L: 224
				class182.distances[var16 - 1][var17] = var15; // L: 225
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 227 228 229 230
				class182.bufferX[var18] = var4 + 1; // L: 231
				class182.bufferY[var18] = var5; // L: 232
				var18 = var18 + 1 & 4095; // L: 233
				class182.directions[var16 + 1][var17] = 8; // L: 234
				class182.distances[var16 + 1][var17] = var15; // L: 235
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 237 238 239 240
				class182.bufferX[var18] = var4; // L: 241
				class182.bufferY[var18] = var5 - 1; // L: 242
				var18 = var18 + 1 & 4095; // L: 243
				class182.directions[var16][var17 - 1] = 1; // L: 244
				class182.distances[var16][var17 - 1] = var15; // L: 245
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 247 248 249 250
				class182.bufferX[var18] = var4; // L: 251
				class182.bufferY[var18] = var5 + 1; // L: 252
				var18 = var18 + 1 & 4095; // L: 253
				class182.directions[var16][var17 + 1] = 4; // L: 254
				class182.distances[var16][var17 + 1] = var15; // L: 255
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 257 258 259 260 261
				class182.bufferX[var18] = var4 - 1; // L: 262
				class182.bufferY[var18] = var5 - 1; // L: 263
				var18 = var18 + 1 & 4095; // L: 264
				class182.directions[var16 - 1][var17 - 1] = 3; // L: 265
				class182.distances[var16 - 1][var17 - 1] = var15; // L: 266
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 268 269 270 271 272
				class182.bufferX[var18] = var4 + 1; // L: 273
				class182.bufferY[var18] = var5 - 1; // L: 274
				var18 = var18 + 1 & 4095; // L: 275
				class182.directions[var16 + 1][var17 - 1] = 9; // L: 276
				class182.distances[var16 + 1][var17 - 1] = var15; // L: 277
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 279 280 281 282 283
				class182.bufferX[var18] = var4 - 1; // L: 284
				class182.bufferY[var18] = var5 + 1; // L: 285
				var18 = var18 + 1 & 4095; // L: 286
				class182.directions[var16 - 1][var17 + 1] = 6; // L: 287
				class182.distances[var16 - 1][var17 + 1] = var15; // L: 288
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 290 291 292 293 294
				class182.bufferX[var18] = var4 + 1; // L: 295
				class182.bufferY[var18] = var5 + 1; // L: 296
				var18 = var18 + 1 & 4095; // L: 297
				class182.directions[var16 + 1][var17 + 1] = 12; // L: 298
				class182.distances[var16 + 1][var17 + 1] = var15; // L: 299
			}
		}

		class182.field2135 = var4; // L: 302
		class182.field2136 = var5; // L: 303
		return false; // L: 304
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2053521560"
	)
	public static int method622() {
		return KeyHandler.KeyHandler_idleCycles; // L: 174
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1795227808"
	)
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 1088
		Login.Login_response2 = "Enter your username/email & password."; // L: 1089
		Login.Login_response3 = ""; // L: 1090
		Login.loginIndex = 2; // L: 1091
		if (var0) { // L: 1092
			Login.Login_password = "";
		}

		ScriptFrame.method1192(); // L: 1093
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1095
			Login.currentLoginField = 1; // L: 1096
		} else {
			Login.currentLoginField = 0; // L: 1099
		}

	} // L: 1102
}
