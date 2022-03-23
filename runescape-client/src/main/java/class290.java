import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class290 {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILge;Lgf;I)Z",
		garbageValue = "-1850220919"
	)
	static final boolean method5577(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 315
		int var6 = var1; // L: 316
		byte var7 = 64; // L: 317
		byte var8 = 64; // L: 318
		int var9 = var0 - var7; // L: 319
		int var10 = var1 - var8; // L: 320
		class194.directions[var7][var8] = 99; // L: 321
		class194.distances[var7][var8] = 0; // L: 322
		byte var11 = 0; // L: 323
		int var12 = 0; // L: 324
		class194.bufferX[var11] = var0; // L: 325
		int var20 = var11 + 1;
		class194.bufferY[var11] = var1; // L: 326
		int[][] var13 = var4.flags; // L: 327

		while (true) {
			label311:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label288:
							do {
								if (var12 == var20) { // L: 328
									VarpDefinition.field1819 = var5; // L: 447
									class194.field2202 = var6; // L: 448
									return false; // L: 449
								}

								var5 = class194.bufferX[var12]; // L: 329
								var6 = class194.bufferY[var12]; // L: 330
								var12 = var12 + 1 & 4095; // L: 331
								var18 = var5 - var9; // L: 332
								var19 = var6 - var10; // L: 333
								var14 = var5 - var4.xInset; // L: 334
								var15 = var6 - var4.yInset; // L: 335
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 336
									VarpDefinition.field1819 = var5; // L: 337
									class194.field2202 = var6; // L: 338
									return true; // L: 339
								}

								var16 = class194.distances[var18][var19] + 1; // L: 341
								if (var18 > 0 && class194.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 342 343 344 345
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5 - 1; // L: 349
											class194.bufferY[var20] = var6; // L: 350
											var20 = var20 + 1 & 4095; // L: 351
											class194.directions[var18 - 1][var19] = 2; // L: 352
											class194.distances[var18 - 1][var19] = var16; // L: 353
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) { // L: 347
											break;
										}

										++var17; // L: 346
									}
								}

								if (var18 < 128 - var2 && class194.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 355 356 357 358
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5 + 1; // L: 362
											class194.bufferY[var20] = var6; // L: 363
											var20 = var20 + 1 & 4095; // L: 364
											class194.directions[var18 + 1][var19] = 8; // L: 365
											class194.distances[var18 + 1][var19] = var16; // L: 366
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 360
											break;
										}

										++var17; // L: 359
									}
								}

								if (var19 > 0 && class194.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 368 369 370 371
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5; // L: 375
											class194.bufferY[var20] = var6 - 1; // L: 376
											var20 = var20 + 1 & 4095; // L: 377
											class194.directions[var18][var19 - 1] = 1; // L: 378
											class194.distances[var18][var19 - 1] = var16; // L: 379
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 373
											break;
										}

										++var17; // L: 372
									}
								}

								if (var19 < 128 - var2 && class194.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 381 382 383 384
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class194.bufferX[var20] = var5; // L: 388
											class194.bufferY[var20] = var6 + 1; // L: 389
											var20 = var20 + 1 & 4095; // L: 390
											class194.directions[var18][var19 + 1] = 4; // L: 391
											class194.distances[var18][var19 + 1] = var16; // L: 392
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 386
											break;
										}

										++var17; // L: 385
									}
								}

								if (var18 > 0 && var19 > 0 && class194.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 394 395 396
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class194.bufferX[var20] = var5 - 1; // L: 401
											class194.bufferY[var20] = var6 - 1; // L: 402
											var20 = var20 + 1 & 4095; // L: 403
											class194.directions[var18 - 1][var19 - 1] = 3; // L: 404
											class194.distances[var18 - 1][var19 - 1] = var16; // L: 405
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 398 399
											break;
										}

										++var17; // L: 397
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class194.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 407 408 409
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class194.bufferX[var20] = var5 + 1; // L: 414
											class194.bufferY[var20] = var6 - 1; // L: 415
											var20 = var20 + 1 & 4095; // L: 416
											class194.directions[var18 + 1][var19 - 1] = 9; // L: 417
											class194.distances[var18 + 1][var19 - 1] = var16; // L: 418
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 411 412
											break;
										}

										++var17; // L: 410
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class194.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 420 421 422
									for (var17 = 1; var17 < var2; ++var17) { // L: 423
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 424 425
											continue label288;
										}
									}

									class194.bufferX[var20] = var5 - 1; // L: 427
									class194.bufferY[var20] = var6 + 1; // L: 428
									var20 = var20 + 1 & 4095; // L: 429
									class194.directions[var18 - 1][var19 + 1] = 6; // L: 430
									class194.distances[var18 - 1][var19 + 1] = var16; // L: 431
								}
							} while(var18 >= 128 - var2); // L: 433
						} while(var19 >= 128 - var2);
					} while(class194.directions[var18 + 1][var19 + 1] != 0); // L: 434
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 435

				for (var17 = 1; var17 < var2; ++var17) { // L: 436
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) { // L: 437 438
						continue label311;
					}
				}

				class194.bufferX[var20] = var5 + 1; // L: 440
				class194.bufferY[var20] = var6 + 1; // L: 441
				var20 = var20 + 1 & 4095; // L: 442
				class194.directions[var18 + 1][var19 + 1] = 12; // L: 443
				class194.distances[var18 + 1][var19 + 1] = var16; // L: 444
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-1527097157"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field698) { // L: 11244
			Client.field564[var0.rootIndex] = true; // L: 11245
		}

	} // L: 11247
}
