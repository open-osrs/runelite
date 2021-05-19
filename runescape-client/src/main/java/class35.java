import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class35 {
	@ObfuscatedName("f")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 327341305
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("h")
	ExecutorService field246;
	@ObfuscatedName("c")
	Future field247;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	final Buffer field244;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class31 field245;

	@ObfuscatedSignature(
		descriptor = "(Lnk;Lat;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field246 = Executors.newSingleThreadExecutor(); // L: 10
		this.field244 = var1; // L: 16
		this.field245 = var2; // L: 17
		this.method399(); // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method409() {
		return this.field247.isDone(); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20171"
	)
	public void method397() {
		this.field246.shutdown(); // L: 26
		this.field246 = null; // L: 27
	} // L: 28

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnk;",
		garbageValue = "-342395493"
	)
	public Buffer method408() {
		try {
			return (Buffer)this.field247.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1826424495"
	)
	void method399() {
		this.field247 = this.field246.submit(new class29(this, this.field244, this.field245)); // L: 40
	} // L: 41

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)V",
		garbageValue = "415858019"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 229
		if (var2) { // L: 230
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 231
		Player var4 = Client.players[var1]; // L: 232
		if (var3 == 0) { // L: 233
			if (var2) { // L: 234
				var4.field1186 = false; // L: 235
			} else if (Client.localPlayerIndex == var1) { // L: 238
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (JagexCache.baseX + var4.pathX[0] >> 13 << 14) + (Messages.baseY + var4.pathY[0] >> 13); // L: 239
				if (var4.field1247 != -1) { // L: 240
					Players.Players_orientations[var1] = var4.field1247;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 241
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 242
				Client.players[var1] = null; // L: 243
				if (var0.readBits(1) != 0) { // L: 244
					Tiles.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 247
				var5 = var0.readBits(3); // L: 248
				var6 = var4.pathX[0]; // L: 249
				var7 = var4.pathY[0]; // L: 250
				if (var5 == 0) { // L: 251
					--var6; // L: 252
					--var7; // L: 253
				} else if (var5 == 1) { // L: 255
					--var7;
				} else if (var5 == 2) { // L: 256
					++var6; // L: 257
					--var7; // L: 258
				} else if (var5 == 3) { // L: 260
					--var6;
				} else if (var5 == 4) { // L: 261
					++var6;
				} else if (var5 == 5) { // L: 262
					--var6; // L: 263
					++var7; // L: 264
				} else if (var5 == 6) { // L: 266
					++var7;
				} else if (var5 == 7) { // L: 267
					++var6; // L: 268
					++var7; // L: 269
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 271
					var4.resetPath(var6, var7); // L: 272
					var4.field1186 = false; // L: 273
				} else if (var2) { // L: 275
					var4.field1186 = true; // L: 276
					var4.tileX = var6; // L: 277
					var4.tileY = var7; // L: 278
				} else {
					var4.field1186 = false; // L: 281
					var4.method2140(var6, var7, Players.field1345[var1]); // L: 282
				}

			} else if (var3 == 2) { // L: 286
				var5 = var0.readBits(4); // L: 287
				var6 = var4.pathX[0]; // L: 288
				var7 = var4.pathY[0]; // L: 289
				if (var5 == 0) { // L: 290
					var6 -= 2; // L: 291
					var7 -= 2; // L: 292
				} else if (var5 == 1) { // L: 294
					--var6; // L: 295
					var7 -= 2; // L: 296
				} else if (var5 == 2) { // L: 298
					var7 -= 2;
				} else if (var5 == 3) { // L: 299
					++var6; // L: 300
					var7 -= 2; // L: 301
				} else if (var5 == 4) { // L: 303
					var6 += 2; // L: 304
					var7 -= 2; // L: 305
				} else if (var5 == 5) { // L: 307
					var6 -= 2; // L: 308
					--var7; // L: 309
				} else if (var5 == 6) { // L: 311
					var6 += 2; // L: 312
					--var7; // L: 313
				} else if (var5 == 7) { // L: 315
					var6 -= 2;
				} else if (var5 == 8) { // L: 316
					var6 += 2;
				} else if (var5 == 9) { // L: 317
					var6 -= 2; // L: 318
					++var7; // L: 319
				} else if (var5 == 10) { // L: 321
					var6 += 2; // L: 322
					++var7; // L: 323
				} else if (var5 == 11) { // L: 325
					var6 -= 2; // L: 326
					var7 += 2; // L: 327
				} else if (var5 == 12) { // L: 329
					--var6; // L: 330
					var7 += 2; // L: 331
				} else if (var5 == 13) { // L: 333
					var7 += 2;
				} else if (var5 == 14) { // L: 334
					++var6; // L: 335
					var7 += 2; // L: 336
				} else if (var5 == 15) { // L: 338
					var6 += 2; // L: 339
					var7 += 2; // L: 340
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 342
					if (var2) { // L: 346
						var4.field1186 = true; // L: 347
						var4.tileX = var6; // L: 348
						var4.tileY = var7; // L: 349
					} else {
						var4.field1186 = false; // L: 352
						var4.method2140(var6, var7, Players.field1345[var1]); // L: 353
					}
				} else {
					var4.resetPath(var6, var7); // L: 343
					var4.field1186 = false; // L: 344
				}

			} else {
				var5 = var0.readBits(1); // L: 357
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 358
					var6 = var0.readBits(12); // L: 359
					var7 = var6 >> 10; // L: 360
					var8 = var6 >> 5 & 31; // L: 361
					if (var8 > 15) { // L: 362
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 363
					if (var9 > 15) { // L: 364
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 365
					var11 = var9 + var4.pathY[0]; // L: 366
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 367
						var4.resetPath(var10, var11); // L: 368
						var4.field1186 = false; // L: 369
					} else if (var2) { // L: 371
						var4.field1186 = true; // L: 372
						var4.tileX = var10; // L: 373
						var4.tileY = var11; // L: 374
					} else {
						var4.field1186 = false; // L: 377
						var4.method2140(var10, var11, Players.field1345[var1]); // L: 378
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 380
					if (Client.localPlayerIndex == var1) { // L: 381
						ParamComposition.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 384
					var7 = var6 >> 28; // L: 385
					var8 = var6 >> 14 & 16383; // L: 386
					var9 = var6 & 16383; // L: 387
					var10 = (var8 + JagexCache.baseX + var4.pathX[0] & 16383) - JagexCache.baseX; // L: 388
					var11 = (var9 + Messages.baseY + var4.pathY[0] & 16383) - Messages.baseY; // L: 389
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 390
						var4.resetPath(var10, var11); // L: 391
						var4.field1186 = false; // L: 392
					} else if (var2) { // L: 394
						var4.field1186 = true; // L: 395
						var4.tileX = var10; // L: 396
						var4.tileY = var11; // L: 397
					} else {
						var4.field1186 = false; // L: 400
						var4.method2140(var10, var11, Players.field1345[var1]); // L: 401
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 403
					if (Client.localPlayerIndex == var1) { // L: 404
						ParamComposition.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 236 245 284 355 382 405

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IS)V",
		garbageValue = "14935"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1254 >= Client.cycle) { // L: 4040
			var2 = Math.max(1, var0.field1254 - Client.cycle); // L: 4041
			var3 = var0.field1211 * 64 + var0.field1236 * 128; // L: 4042
			var4 = var0.field1211 * 64 + var0.field1252 * 128; // L: 4043
			var0.x += (var3 - var0.x) / var2; // L: 4044
			var0.y += (var4 - var0.y) / var2; // L: 4045
			var0.field1250 = 0; // L: 4046
			var0.orientation = var0.field1256; // L: 4047
		} else if (var0.field1237 >= Client.cycle) { // L: 4049
			if (var0.field1237 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > Player.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4050
				var2 = var0.field1237 - var0.field1254; // L: 4051
				var3 = Client.cycle - var0.field1254; // L: 4052
				var4 = var0.field1211 * 64 + var0.field1236 * 128; // L: 4053
				int var5 = var0.field1211 * 64 + var0.field1252 * 128; // L: 4054
				int var6 = var0.field1211 * 64 + var0.field1251 * 128; // L: 4055
				int var7 = var0.field1211 * 64 + var0.field1253 * 128; // L: 4056
				var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2; // L: 4057
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2; // L: 4058
			}

			var0.field1250 = 0; // L: 4060
			var0.orientation = var0.field1256; // L: 4061
			var0.rotation = var0.orientation; // L: 4062
		} else {
			class369.method6314(var0); // L: 4064
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4065
			var0.sequence = -1; // L: 4066
			var0.spotAnimation = -1; // L: 4067
			var0.field1254 = 0; // L: 4068
			var0.field1237 = 0; // L: 4069
			var0.x = var0.field1211 * 64 + var0.pathX[0] * 128; // L: 4070
			var0.y = var0.pathY[0] * 128 + var0.field1211 * 64; // L: 4071
			var0.method2194(); // L: 4072
		}

		if (localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4074 4075
			var0.sequence = -1; // L: 4076
			var0.spotAnimation = -1; // L: 4077
			var0.field1254 = 0; // L: 4078
			var0.field1237 = 0; // L: 4079
			var0.x = var0.pathX[0] * 128 + var0.field1211 * 64; // L: 4080
			var0.y = var0.field1211 * 64 + var0.pathY[0] * 128; // L: 4081
			var0.method2194(); // L: 4082
		}

		class7.method87(var0); // L: 4085
		class6.method71(var0); // L: 4086
	} // L: 4087
}
