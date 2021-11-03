import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class138 extends class116 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 449318605468420723L
	)
	long field1525;
	@ObfuscatedName("w")
	String field1524;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class138(class119 var1) {
		this.this$0 = var1;
		this.field1525 = -1L; // L: 194
		this.field1524 = null; // L: 195
	} // L: 197

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1525 = var1.readLong(); // L: 202
		}

		this.field1524 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2658(this.field1525, this.field1524); // L: 208
	} // L: 209

	@ObfuscatedName("a")
	public static int method2827(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 64
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-1003389326"
	)
	static final void method2836(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4305
		if (var0.pathLength == 0) { // L: 4306
			var0.field1085 = 0; // L: 4307
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4310
				SequenceDefinition var1 = MouseHandler.SequenceDefinition_get(var0.sequence); // L: 4311
				if (var0.field1144 > 0 && var1.field1963 == 0) { // L: 4312
					++var0.field1085; // L: 4313
					return; // L: 4314
				}

				if (var0.field1144 <= 0 && var1.field1956 == 0) { // L: 4316
					++var0.field1085; // L: 4317
					return; // L: 4318
				}
			}

			int var10 = var0.x; // L: 4321
			int var2 = var0.y; // L: 4322
			int var3 = var0.field1087 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4323
			int var4 = var0.field1087 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4324
			if (var10 < var3) { // L: 4325
				if (var2 < var4) { // L: 4326
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4327
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4328
				}
			} else if (var10 > var3) { // L: 4330
				if (var2 < var4) { // L: 4331
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4332
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4333
				}
			} else if (var2 < var4) { // L: 4335
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4336
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4337
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4338
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4345
				if (var6 > 1024) { // L: 4346
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4347
				if (var6 >= -256 && var6 <= 256) { // L: 4348
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4349
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4350
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4351
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4352
				int var8 = 4; // L: 4353
				boolean var9 = true; // L: 4354
				if (var0 instanceof NPC) { // L: 4355
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4356
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1138 != 0) { // L: 4357
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4358
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4359
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) { // L: 4360
						var8 = 8; // L: 4361
						--var0.field1085; // L: 4362
					}
				} else {
					if (var0.pathLength > 1) { // L: 4366
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4367
						var8 = 8;
					}

					if (var0.field1085 > 0 && var0.pathLength > 1) { // L: 4368
						var8 = 8; // L: 4369
						--var0.field1085; // L: 4370
					}
				}

				if (var5 == 2) { // L: 4373
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4374
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) { // L: 4375
					if (var10 < var3) { // L: 4376
						var0.x += var8; // L: 4377
						if (var0.x > var3) { // L: 4378
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4380
						var0.x -= var8; // L: 4381
						if (var0.x < var3) { // L: 4382
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4384
						var0.y += var8; // L: 4385
						if (var0.y > var4) { // L: 4386
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4388
						var0.y -= var8; // L: 4389
						if (var0.y < var4) { // L: 4390
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4393
					--var0.pathLength; // L: 4394
					if (var0.field1144 > 0) { // L: 4395
						--var0.field1144;
					}
				}

			} else {
				var0.x = var3; // L: 4339
				var0.y = var4; // L: 4340
				--var0.pathLength; // L: 4341
				if (var0.field1144 > 0) { // L: 4342
					--var0.field1144;
				}

			}
		}
	} // L: 4308 4343 4397
}
