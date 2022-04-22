import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)I",
		garbageValue = "-468460476"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 36
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "-1213322311"
	)
	static final void method6006(Actor var0) {
		var0.isWalking = false; // L: 4123
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4124
			var1 = class163.SequenceDefinition_get(var0.movementSequence); // L: 4125
			if (var1 != null) { // L: 4126
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4127
					++var0.movementFrameCycle; // L: 4128
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4129
						var0.movementFrameCycle = 1; // L: 4130
						++var0.movementFrame; // L: 4131
						Language.method6087(var1, var0.movementFrame, var0.x, var0.y); // L: 4132
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4134
						var0.movementFrameCycle = 0; // L: 4135
						var0.movementFrame = 0; // L: 4136
						Language.method6087(var1, var0.movementFrame, var0.x, var0.y); // L: 4137
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4140
					++var0.movementFrame; // L: 4141
					var2 = var1.method3844(); // L: 4142
					if (var0.movementFrame < var2) { // L: 4143
						KeyHandler.method336(var1, var0.movementFrame, var0.x, var0.y); // L: 4144
					} else {
						var0.movementFrameCycle = 0; // L: 4147
						var0.movementFrame = 0; // L: 4148
						KeyHandler.method336(var1, var0.movementFrame, var0.x, var0.y); // L: 4149
					}
				} else {
					var0.movementSequence = -1; // L: 4152
				}
			} else {
				var0.movementSequence = -1; // L: 4154
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1134) { // L: 4156
			if (var0.spotAnimationFrame < 0) { // L: 4157
				var0.spotAnimationFrame = 0;
			}

			int var4 = ClientPreferences.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4158
			if (var4 != -1) { // L: 4159
				SequenceDefinition var5 = class163.SequenceDefinition_get(var4); // L: 4160
				if (var5 != null && var5.frameIds != null) { // L: 4161
					++var0.spotAnimationFrameCycle; // L: 4162
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4163
						var0.spotAnimationFrameCycle = 1; // L: 4164
						++var0.spotAnimationFrame; // L: 4165
						Language.method6087(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4166
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4168 4169
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4172
					++var0.spotAnimationFrame; // L: 4173
					int var3 = var5.method3844(); // L: 4174
					if (var0.spotAnimationFrame < var3) { // L: 4175
						KeyHandler.method336(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4176
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4179
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4182
				}
			} else {
				var0.spotAnimation = -1; // L: 4184
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4186
			var1 = class163.SequenceDefinition_get(var0.sequence); // L: 4187
			if (var1.field2159 == 1 && var0.field1170 > 0 && var0.field1143 <= Client.cycle && var0.field1163 < Client.cycle) { // L: 4188 4189
				var0.sequenceDelay = 1; // L: 4190
				return; // L: 4191
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4195
			var1 = class163.SequenceDefinition_get(var0.sequence); // L: 4196
			if (var1 != null) { // L: 4197
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4198
					++var0.sequenceFrameCycle; // L: 4199
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4200
						var0.sequenceFrameCycle = 1; // L: 4201
						++var0.sequenceFrame; // L: 4202
						Language.method6087(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4203
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4205
						var0.sequenceFrame -= var1.frameCount; // L: 4206
						++var0.field1152; // L: 4207
						if (var0.field1152 >= var1.field2138) { // L: 4208
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4209
							Language.method6087(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4210
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2154; // L: 4212
				} else if (var1.isCachedModelIdSet()) { // L: 4214
					++var0.sequenceFrame; // L: 4215
					var2 = var1.method3801().method2762(); // L: 4216
					if (var0.sequenceFrame < var2) { // L: 4217
						KeyHandler.method336(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4218
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4221
						++var0.field1152; // L: 4222
						if (var0.field1152 >= var1.field2138) { // L: 4223
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4224
							KeyHandler.method336(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4225
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1; // L: 4228
				}
			} else {
				var0.sequence = -1; // L: 4230
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4232
			--var0.sequenceDelay;
		}

	} // L: 4233

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "1469705502"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7693

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7694 7695 7700
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7696
				var9 = var10; // L: 7697
				break;
			}
		}

		if (var9 == null) { // L: 7702
			var9 = new PendingSpawn(); // L: 7703
			var9.plane = var0; // L: 7704
			var9.type = var3; // L: 7705
			var9.x = var1; // L: 7706
			var9.y = var2; // L: 7707
			class163.method3315(var9); // L: 7708
			Client.pendingSpawns.addFirst(var9); // L: 7709
		}

		var9.id = var4; // L: 7711
		var9.field1107 = var5; // L: 7712
		var9.orientation = var6; // L: 7713
		var9.delay = var7; // L: 7714
		var9.hitpoints = var8; // L: 7715
	} // L: 7716
}
