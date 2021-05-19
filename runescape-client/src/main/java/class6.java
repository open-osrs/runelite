import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class6 extends class14 {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1741203959
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -699595077
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 896931621
	)
	int field52;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1534263289
	)
	int field56;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field52 = var1.readInt(); // L: 274
		this.field56 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method126(this.field52, this.field56); // L: 279
	} // L: 280

	@ObfuscatedName("t")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 78
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lcj;B)V",
		garbageValue = "-122"
	)
	static final void method71(Actor var0) {
		var0.isWalking = false; // L: 4242
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 4243
			var1 = Player.SequenceDefinition_get(var0.movementSequence); // L: 4244
			if (var1 != null && var1.frameIds != null) { // L: 4245
				++var0.movementFrameCycle; // L: 4246
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4247
					var0.movementFrameCycle = 1; // L: 4248
					++var0.movementFrame; // L: 4249
					WorldMapManager.method3425(var1, var0.movementFrame, var0.x, var0.y); // L: 4250
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 4252
					var0.movementFrameCycle = 0; // L: 4253
					var0.movementFrame = 0; // L: 4254
					WorldMapManager.method3425(var1, var0.movementFrame, var0.x, var0.y); // L: 4255
				}
			} else {
				var0.movementSequence = -1; // L: 4258
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1243) { // L: 4260
			if (var0.spotAnimationFrame < 0) { // L: 4261
				var0.spotAnimationFrame = 0;
			}

			int var3 = Friend.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4262
			if (var3 != -1) { // L: 4263
				SequenceDefinition var2 = Player.SequenceDefinition_get(var3); // L: 4264
				if (var2 != null && var2.frameIds != null) { // L: 4265
					++var0.spotAnimationFrameCycle; // L: 4266
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 4267
						var0.spotAnimationFrameCycle = 1; // L: 4268
						++var0.spotAnimationFrame; // L: 4269
						WorldMapManager.method3425(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 4270
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 4272 4273
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4276
				}
			} else {
				var0.spotAnimation = -1; // L: 4278
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4280
			var1 = Player.SequenceDefinition_get(var0.sequence); // L: 4281
			if (var1.field1886 == 1 && var0.field1215 > 0 && var0.field1254 <= Client.cycle && var0.field1237 < Client.cycle) { // L: 4282 4283
				var0.sequenceDelay = 1; // L: 4284
				return; // L: 4285
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4289
			var1 = Player.SequenceDefinition_get(var0.sequence); // L: 4290
			if (var1 != null && var1.frameIds != null) { // L: 4291
				++var0.sequenceFrameCycle; // L: 4292
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4293
					var0.sequenceFrameCycle = 1; // L: 4294
					++var0.sequenceFrame; // L: 4295
					WorldMapManager.method3425(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4296
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4298
					var0.sequenceFrame -= var1.frameCount; // L: 4299
					++var0.field1244; // L: 4300
					if (var0.field1244 >= var1.field1897) { // L: 4301
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4302
						WorldMapManager.method3425(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4303
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1898; // L: 4305
			} else {
				var0.sequence = -1; // L: 4307
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4309
			--var0.sequenceDelay;
		}

	} // L: 4310
}
