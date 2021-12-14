import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class363 {
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "499018335"
	)
	static final void method6612(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) {
			var1 = UserComparator5.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.method3690() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class409.method7269(var1, var0.movementFrame, var0.x, var0.y);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						class409.method7269(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var1.method3690()) {
					++var0.movementFrame;
					var2 = var1.method3647();
					if (var0.movementFrame < var2) {
						Varcs.method2427(var1, var0.movementFrame, var0.x, var0.y);
					} else {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						Varcs.method2427(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1130) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var4 = AccessFile.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var4 != -1) {
				SequenceDefinition var5 = UserComparator5.SequenceDefinition_get(var4);
				if (var5 != null && var5.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class409.method7269(var5, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else if (var5.method3690()) {
					++var0.spotAnimationFrame;
					int var3 = var5.method3647();
					if (var0.spotAnimationFrame < var3) {
						Varcs.method2427(var5, var0.spotAnimationFrame, var0.x, var0.y);
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var1 = UserComparator5.SequenceDefinition_get(var0.sequence);
			if (var1.field2096 == 1 && var0.field1098 > 0 && var0.field1136 <= Client.cycle && var0.field1157 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = UserComparator5.SequenceDefinition_get(var0.sequence);
			if (var1 != null) {
				if (!var1.method3690() && var1.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class409.method7269(var1, var0.sequenceFrame, var0.x, var0.y);
					}

					if (var0.sequenceFrame >= var1.frameIds.length) {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1126;
						if (var0.field1126 >= var1.field2095) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
							class409.method7269(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2091;
				} else if (var1.method3690()) {
					++var0.sequenceFrame;
					var2 = var1.method3648().method2691();
					if (var0.sequenceFrame < var2) {
						Varcs.method2427(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1126;
						if (var0.field1126 >= var1.field2095) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) {
							Varcs.method2427(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)I",
		garbageValue = "1020849345"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
