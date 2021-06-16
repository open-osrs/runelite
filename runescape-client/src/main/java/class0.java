import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class0 extends class14 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 566766495
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1559337791
	)
	static int field2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 469754669
	)
	int field3;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -494167787820068405L
	)
	long field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field3 = var1.readInt(); // L: 310
		this.field0 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method137(this.field3, this.field0); // L: 315
	} // L: 316

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcl;B)V",
		garbageValue = "-91"
	)
	static final void method11(Actor var0) {
		var0.isWalking = false; // L: 4293
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 4294
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.movementSequence); // L: 4295
			if (var1 != null && var1.frameIds != null) { // L: 4296
				++var0.movementFrameCycle; // L: 4297
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4298
					var0.movementFrameCycle = 1; // L: 4299
					++var0.movementFrame; // L: 4300
					Buddy.method5896(var1, var0.movementFrame, var0.x, var0.y); // L: 4301
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 4303
					var0.movementFrameCycle = 0; // L: 4304
					var0.movementFrame = 0; // L: 4305
					Buddy.method5896(var1, var0.movementFrame, var0.x, var0.y); // L: 4306
				}
			} else {
				var0.movementSequence = -1; // L: 4309
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1262) { // L: 4311
			if (var0.spotAnimationFrame < 0) { // L: 4312
				var0.spotAnimationFrame = 0;
			}

			int var3 = Tiles.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4313
			if (var3 != -1) { // L: 4314
				SequenceDefinition var2 = WorldMapScaleHandler.SequenceDefinition_get(var3); // L: 4315
				if (var2 != null && var2.frameIds != null) { // L: 4316
					++var0.spotAnimationFrameCycle; // L: 4317
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 4318
						var0.spotAnimationFrameCycle = 1; // L: 4319
						++var0.spotAnimationFrame; // L: 4320
						Buddy.method5896(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 4321
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 4323 4324
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4327
				}
			} else {
				var0.spotAnimation = -1; // L: 4329
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4331
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence); // L: 4332
			if (var1.field1895 == 1 && var0.field1281 > 0 && var0.field1276 <= Client.cycle && var0.field1269 < Client.cycle) { // L: 4333 4334
				var0.sequenceDelay = 1; // L: 4335
				return; // L: 4336
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4340
			var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence); // L: 4341
			if (var1 != null && var1.frameIds != null) { // L: 4342
				++var0.sequenceFrameCycle; // L: 4343
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4344
					var0.sequenceFrameCycle = 1; // L: 4345
					++var0.sequenceFrame; // L: 4346
					Buddy.method5896(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4347
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4349
					var0.sequenceFrame -= var1.frameCount; // L: 4350
					++var0.field1258; // L: 4351
					if (var0.field1258 >= var1.field1896) { // L: 4352
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4353
						Buddy.method5896(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4354
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1888; // L: 4356
			} else {
				var0.sequence = -1; // L: 4358
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4360
			--var0.sequenceDelay;
		}

	} // L: 4361

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1925251884"
	)
	static String method1(int var0) {
		if (var0 < 0) { // L: 8997
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 8998 8999
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "935953368"
	)
	static final void method0(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11112
		if (var0 != class4.clientPreferences.musicVolume) { // L: 11113
			if (class4.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11114
				class105.method2357(DynamicObject.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11115
				Client.field862 = false; // L: 11116
			} else if (var0 == 0) { // L: 11118
				Decimator.method1169(); // L: 11119
				Client.field862 = false; // L: 11120
			} else if (class233.musicPlayerStatus != 0) { // L: 11123
				class233.musicTrackVolume = var0;
			} else {
				class233.midiPcmStream.setPcmStreamVolume(var0); // L: 11124
			}

			class4.clientPreferences.musicVolume = var0; // L: 11126
			Actor.savePreferences(); // L: 11127
		}

	} // L: 11129
}
