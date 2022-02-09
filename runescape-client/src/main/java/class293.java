import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class293 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class293 field3485;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static final class293 field3483;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 796657837
	)
	final int field3484;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 494317377
	)
	final int field3482;

	static {
		field3485 = new class293(51, 27, 800, 0, 16, 16); // L: 33
		field3483 = new class293(25, 28, 800, 656, 40, 40); // L: 34
	}

	class293(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3484 = var5; // L: 39
		this.field3482 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfy;",
		garbageValue = "606619398"
	)
	public static HitSplatDefinition method5480(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-657313045"
	)
	static int method5482(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 951
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 952
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcq;B)V",
		garbageValue = "1"
	)
	static final void method5481(Actor var0) {
		var0.isWalking = false; // L: 3998
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 3999
			var1 = class78.SequenceDefinition_get(var0.movementSequence); // L: 4000
			if (var1 != null) { // L: 4001
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4002
					++var0.movementFrameCycle; // L: 4003
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4004
						var0.movementFrameCycle = 1; // L: 4005
						++var0.movementFrame; // L: 4006
						Projectile.method1958(var1, var0.movementFrame, var0.x, var0.y); // L: 4007
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4009
						var0.movementFrameCycle = 0; // L: 4010
						var0.movementFrame = 0; // L: 4011
						Projectile.method1958(var1, var0.movementFrame, var0.x, var0.y); // L: 4012
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4015
					++var0.movementFrame; // L: 4016
					var2 = var1.method3637(); // L: 4017
					if (var0.movementFrame < var2) { // L: 4018
						class333.method6126(var1, var0.movementFrame, var0.x, var0.y); // L: 4019
					} else {
						var0.movementFrameCycle = 0; // L: 4022
						var0.movementFrame = 0; // L: 4023
						class333.method6126(var1, var0.movementFrame, var0.x, var0.y); // L: 4024
					}
				} else {
					var0.movementSequence = -1; // L: 4027
				}
			} else {
				var0.movementSequence = -1; // L: 4029
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1177) { // L: 4031
			if (var0.spotAnimationFrame < 0) { // L: 4032
				var0.spotAnimationFrame = 0;
			}

			int var4 = Widget.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4033
			if (var4 != -1) { // L: 4034
				SequenceDefinition var5 = class78.SequenceDefinition_get(var4); // L: 4035
				if (var5 != null && var5.frameIds != null) { // L: 4036
					++var0.spotAnimationFrameCycle; // L: 4037
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4038
						var0.spotAnimationFrameCycle = 1; // L: 4039
						++var0.spotAnimationFrame; // L: 4040
						Projectile.method1958(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4041
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4043 4044
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4047
					++var0.spotAnimationFrame; // L: 4048
					int var3 = var5.method3637(); // L: 4049
					if (var0.spotAnimationFrame < var3) { // L: 4050
						class333.method6126(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4051
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4054
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4057
				}
			} else {
				var0.spotAnimation = -1; // L: 4059
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4061
			var1 = class78.SequenceDefinition_get(var0.sequence); // L: 4062
			if (var1.field2107 == 1 && var0.field1176 > 0 && var0.field1157 <= Client.cycle && var0.field1158 < Client.cycle) { // L: 4063 4064
				var0.sequenceDelay = 1; // L: 4065
				return; // L: 4066
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4070
			var1 = class78.SequenceDefinition_get(var0.sequence); // L: 4071
			if (var1 != null) { // L: 4072
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4073
					++var0.sequenceFrameCycle; // L: 4074
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4075
						var0.sequenceFrameCycle = 1; // L: 4076
						++var0.sequenceFrame; // L: 4077
						Projectile.method1958(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4078
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4080
						var0.sequenceFrame -= var1.frameCount; // L: 4081
						++var0.field1129; // L: 4082
						if (var0.field1129 >= var1.field2108) { // L: 4083
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4084
							Projectile.method1958(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4085
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2102; // L: 4087
				} else if (var1.isCachedModelIdSet()) { // L: 4089
					++var0.sequenceFrame; // L: 4090
					var2 = var1.method3602().method2693(); // L: 4091
					if (var0.sequenceFrame < var2) { // L: 4092
						class333.method6126(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4093
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4096
						++var0.field1129; // L: 4097
						if (var0.field1129 >= var1.field2108) { // L: 4098
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4099
							class333.method6126(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4100
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1; // L: 4103
				}
			} else {
				var0.sequence = -1; // L: 4105
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4107
			--var0.sequenceDelay;
		}

	} // L: 4108
}
