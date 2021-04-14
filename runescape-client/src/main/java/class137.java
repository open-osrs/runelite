import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class137 {
	@ObfuscatedName("u")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("p")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("g")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("h")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2142993463"
	)
	public static int method2654(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lcd;II)V",
		garbageValue = "391699616"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1255 >= Client.cycle) { // L: 3299
			class26.method367(var0);
		} else if (var0.field1268 >= Client.cycle) { // L: 3300
			WorldMapData_1.method2990(var0);
		} else {
			class22.method330(var0); // L: 3301
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3302
			var0.sequence = -1; // L: 3303
			var0.spotAnimation = -1; // L: 3304
			var0.field1255 = 0; // L: 3305
			var0.field1268 = 0; // L: 3306
			var0.x = var0.pathX[0] * 128 + var0.field1258 * 64; // L: 3307
			var0.y = var0.field1258 * 64 + var0.pathY[0] * 128; // L: 3308
			var0.method2157(); // L: 3309
		}

		if (Varcs.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3311 3312
			var0.sequence = -1; // L: 3313
			var0.spotAnimation = -1; // L: 3314
			var0.field1255 = 0; // L: 3315
			var0.field1268 = 0; // L: 3316
			var0.x = var0.field1258 * 64 + var0.pathX[0] * 128; // L: 3317
			var0.y = var0.field1258 * 64 + var0.pathY[0] * 128; // L: 3318
			var0.method2157(); // L: 3319
		}

		int var5;
		if (var0.field1262 != 0) { // L: 3323
			if (var0.targetIndex != -1) { // L: 3324
				Object var2 = null; // L: 3325
				if (var0.targetIndex < 32768) { // L: 3326
					var2 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3327
					var2 = Client.players[var0.targetIndex - 32768];
				}

				if (var2 != null) { // L: 3328
					int var3 = var0.x - ((Actor)var2).x; // L: 3329
					int var4 = var0.y - ((Actor)var2).y; // L: 3330
					if (var3 != 0 || var4 != 0) { // L: 3331
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3333
					var0.targetIndex = -1; // L: 3334
					var0.false0 = false; // L: 3335
				}
			}

			if (var0.field1237 != -1 && (var0.pathLength == 0 || var0.field1267 > 0)) { // L: 3338
				var0.orientation = var0.field1237; // L: 3339
				var0.field1237 = -1; // L: 3340
			}

			var5 = var0.orientation - var0.rotation & 2047; // L: 3342
			if (var5 == 0 && var0.false0) { // L: 3343
				var0.targetIndex = -1; // L: 3344
				var0.false0 = false; // L: 3345
			}

			if (var5 != 0) { // L: 3347
				++var0.field1261; // L: 3348
				boolean var8;
				if (var5 > 1024) { // L: 3349
					var0.rotation -= var0.field1262; // L: 3350
					var8 = true; // L: 3351
					if (var5 < var0.field1262 || var5 > 2048 - var0.field1262) { // L: 3352
						var0.rotation = var0.orientation; // L: 3353
						var8 = false; // L: 3354
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1261 > 25 || var8)) { // L: 3356
						if (var0.turnLeftSequence != -1) { // L: 3357
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3358
						}
					}
				} else {
					var0.rotation += var0.field1262; // L: 3362
					var8 = true; // L: 3363
					if (var5 < var0.field1262 || var5 > 2048 - var0.field1262) { // L: 3364
						var0.rotation = var0.orientation; // L: 3365
						var8 = false; // L: 3366
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1261 > 25 || var8)) { // L: 3368
						if (var0.turnRightSequence != -1) { // L: 3369
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3370
						}
					}
				}

				var0.rotation &= 2047; // L: 3374
			} else {
				var0.field1261 = 0; // L: 3376
			}
		}

		var0.isWalking = false; // L: 3379
		SequenceDefinition var7;
		if (var0.movementSequence != -1) { // L: 3380
			var7 = class225.SequenceDefinition_get(var0.movementSequence); // L: 3381
			if (var7 != null && var7.frameIds != null) { // L: 3382
				++var0.movementFrameCycle; // L: 3383
				if (var0.movementFrame < var7.frameIds.length && var0.movementFrameCycle > var7.frameLengths[var0.movementFrame]) { // L: 3384
					var0.movementFrameCycle = 1; // L: 3385
					++var0.movementFrame; // L: 3386
					class232.method4364(var7, var0.movementFrame, var0.x, var0.y); // L: 3387
				}

				if (var0.movementFrame >= var7.frameIds.length) { // L: 3389
					var0.movementFrameCycle = 0; // L: 3390
					var0.movementFrame = 0; // L: 3391
					class232.method4364(var7, var0.movementFrame, var0.x, var0.y); // L: 3392
				}
			} else {
				var0.movementSequence = -1; // L: 3395
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1249) { // L: 3397
			if (var0.spotAnimationFrame < 0) { // L: 3398
				var0.spotAnimationFrame = 0;
			}

			var5 = Varps.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 3399
			if (var5 != -1) { // L: 3400
				SequenceDefinition var6 = class225.SequenceDefinition_get(var5); // L: 3401
				if (var6 != null && var6.frameIds != null) { // L: 3402
					++var0.spotAnimationFrameCycle; // L: 3403
					if (var0.spotAnimationFrame < var6.frameIds.length && var0.spotAnimationFrameCycle > var6.frameLengths[var0.spotAnimationFrame]) { // L: 3404
						var0.spotAnimationFrameCycle = 1; // L: 3405
						++var0.spotAnimationFrame; // L: 3406
						class232.method4364(var6, var0.spotAnimationFrame, var0.x, var0.y); // L: 3407
					}

					if (var0.spotAnimationFrame >= var6.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var6.frameIds.length)) { // L: 3409 3410
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 3413
				}
			} else {
				var0.spotAnimation = -1; // L: 3415
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 3417
			var7 = class225.SequenceDefinition_get(var0.sequence); // L: 3418
			if (var7.field3722 == 1 && var0.field1224 > 0 && var0.field1255 <= Client.cycle && var0.field1268 < Client.cycle) { // L: 3419 3420
				var0.sequenceDelay = 1; // L: 3421
				return; // L: 3448
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3426
			var7 = class225.SequenceDefinition_get(var0.sequence); // L: 3427
			if (var7 != null && var7.frameIds != null) { // L: 3428
				++var0.sequenceFrameCycle; // L: 3429
				if (var0.sequenceFrame < var7.frameIds.length && var0.sequenceFrameCycle > var7.frameLengths[var0.sequenceFrame]) { // L: 3430
					var0.sequenceFrameCycle = 1; // L: 3431
					++var0.sequenceFrame; // L: 3432
					class232.method4364(var7, var0.sequenceFrame, var0.x, var0.y); // L: 3433
				}

				if (var0.sequenceFrame >= var7.frameIds.length) { // L: 3435
					var0.sequenceFrame -= var7.frameCount; // L: 3436
					++var0.field1245; // L: 3437
					if (var0.field1245 >= var7.field3721) { // L: 3438
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var7.frameIds.length) { // L: 3439
						class232.method4364(var7, var0.sequenceFrame, var0.x, var0.y); // L: 3440
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var7.field3712; // L: 3442
			} else {
				var0.sequence = -1; // L: 3444
			}
		}

		if (var0.sequenceDelay > 0) { // L: 3446
			--var0.sequenceDelay;
		}

	}
}
