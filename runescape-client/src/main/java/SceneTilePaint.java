import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("SceneTilePaint")
public final class SceneTilePaint
{
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 624265355
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 110092511
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -722994813
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -401882753
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1831175523
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("j")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2137249819
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "311945184"
	)
	static final void method3154(Actor var0) {
		var0.isWalking = false; // L: 4080
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 4081
			var1 = ParamDefinition.SequenceDefinition_get(var0.movementSequence); // L: 4082
			if (var1 != null && var1.frameIds != null) { // L: 4083
				++var0.movementFrameCycle; // L: 4084
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4085
					var0.movementFrameCycle = 1; // L: 4086
					++var0.movementFrame; // L: 4087
					class225.method4075(var1, var0.movementFrame, var0.x, var0.y); // L: 4088
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 4090
					var0.movementFrameCycle = 0; // L: 4091
					var0.movementFrame = 0; // L: 4092
					class225.method4075(var1, var0.movementFrame, var0.x, var0.y); // L: 4093
				}
			} else {
				var0.movementSequence = -1; // L: 4096
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field978) { // L: 4098
			if (var0.spotAnimationFrame < 0) { // L: 4099
				var0.spotAnimationFrame = 0;
			}

			int var3 = TileItem.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4100
			if (var3 != -1) { // L: 4101
				SequenceDefinition var2 = ParamDefinition.SequenceDefinition_get(var3); // L: 4102
				if (var2 != null && var2.frameIds != null) { // L: 4103
					++var0.spotAnimationFrameCycle; // L: 4104
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 4105
						var0.spotAnimationFrameCycle = 1; // L: 4106
						++var0.spotAnimationFrame; // L: 4107
						class225.method4075(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 4108
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 4110 4111
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4114
				}
			} else {
				var0.spotAnimation = -1; // L: 4116
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4118
			var1 = ParamDefinition.SequenceDefinition_get(var0.sequence); // L: 4119
			if (var1.field3560 == 1 && var0.field996 > 0 && var0.field984 <= Client.cycle && var0.field973 < Client.cycle) { // L: 4120 4121
				var0.sequenceDelay = 1; // L: 4122
				return; // L: 4123
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4127
			var1 = ParamDefinition.SequenceDefinition_get(var0.sequence); // L: 4128
			if (var1 != null && var1.frameIds != null) { // L: 4129
				++var0.sequenceFrameCycle; // L: 4130
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4131
					var0.sequenceFrameCycle = 1; // L: 4132
					++var0.sequenceFrame; // L: 4133
					class225.method4075(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4134
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4136
					var0.sequenceFrame -= var1.frameCount; // L: 4137
					++var0.field974; // L: 4138
					if (var0.field974 >= var1.field3554) { // L: 4139
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4140
						class225.method4075(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4141
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field3556; // L: 4143
			} else {
				var0.sequence = -1; // L: 4145
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4147
			--var0.sequenceDelay;
		}

	} // L: 4148
}
