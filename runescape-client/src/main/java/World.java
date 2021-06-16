import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("World")
public class World {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1728801439
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1039031469
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("r")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1045630855
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 425898455
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -372282787
	)
	@Export("population")
	int population;
	@ObfuscatedName("k")
	@Export("host")
	String host;
	@ObfuscatedName("g")
	@Export("activity")
	String activity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1961893903
	)
	@Export("location")
	int location;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 724778095
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1633198198"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-896740127"
	)
	boolean method1749() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1876446967"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2071254222"
	)
	boolean method1757() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1854711947"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "39105033"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-31490"
	)
	boolean method1778() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2001631546"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World_sortOption1[var5]; // L: 70
				var3[var4] = World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World_sortOption1 = var2; // L: 75
		World_sortOption2 = var3; // L: 76
		FileSystem.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IS)V",
		garbageValue = "-356"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1276 >= Client.cycle) { // L: 4089
			Messages.method2461(var0);
		} else if (var0.field1269 >= Client.cycle) { // L: 4090
			WorldMapLabelSize.method3279(var0);
		} else {
			SoundCache.method930(var0); // L: 4091
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4092
			var0.sequence = -1; // L: 4093
			var0.spotAnimation = -1; // L: 4094
			var0.field1276 = 0; // L: 4095
			var0.field1269 = 0; // L: 4096
			var0.x = var0.pathX[0] * 128 + var0.field1225 * 64; // L: 4097
			var0.y = var0.field1225 * 64 + var0.pathY[0] * 128; // L: 4098
			var0.method2263(); // L: 4099
		}

		if (class262.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4101 4102
			var0.sequence = -1; // L: 4103
			var0.spotAnimation = -1; // L: 4104
			var0.field1276 = 0; // L: 4105
			var0.field1269 = 0; // L: 4106
			var0.x = var0.field1225 * 64 + var0.pathX[0] * 128; // L: 4107
			var0.y = var0.field1225 * 64 + var0.pathY[0] * 128; // L: 4108
			var0.method2263(); // L: 4109
		}

		if (var0.field1275 != 0) { // L: 4113
			if (var0.targetIndex != -1) { // L: 4114
				Object var2 = null; // L: 4115
				if (var0.targetIndex < 32768) { // L: 4116
					var2 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4117
					var2 = Client.players[var0.targetIndex - 32768];
				}

				if (var2 != null) { // L: 4118
					int var3 = var0.x - ((Actor)var2).x; // L: 4119
					int var4 = var0.y - ((Actor)var2).y; // L: 4120
					if (var3 != 0 || var4 != 0) { // L: 4121
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4123
					var0.targetIndex = -1; // L: 4124
					var0.false0 = false; // L: 4125
				}
			}

			if (var0.field1280 != -1 && (var0.pathLength == 0 || var0.field1242 > 0)) { // L: 4128
				var0.orientation = var0.field1280; // L: 4129
				var0.field1280 = -1; // L: 4130
			}

			int var5 = var0.orientation - var0.rotation & 2047; // L: 4132
			if (var5 == 0 && var0.false0) { // L: 4133
				var0.targetIndex = -1; // L: 4134
				var0.false0 = false; // L: 4135
			}

			if (var5 != 0) { // L: 4137
				++var0.field1274; // L: 4138
				boolean var7;
				if (var5 > 1024) { // L: 4139
					var0.rotation -= var0.field1275; // L: 4140
					var7 = true; // L: 4141
					if (var5 < var0.field1275 || var5 > 2048 - var0.field1275) { // L: 4142
						var0.rotation = var0.orientation; // L: 4143
						var7 = false; // L: 4144
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1274 > 25 || var7)) { // L: 4146
						if (var0.turnLeftSequence != -1) { // L: 4147
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4148
						}
					}
				} else {
					var0.rotation += var0.field1275; // L: 4152
					var7 = true; // L: 4153
					if (var5 < var0.field1275 || var5 > 2048 - var0.field1275) { // L: 4154
						var0.rotation = var0.orientation; // L: 4155
						var7 = false; // L: 4156
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1274 > 25 || var7)) { // L: 4158
						if (var0.turnRightSequence != -1) { // L: 4159
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4160
						}
					}
				}

				var0.rotation &= 2047; // L: 4164
			} else {
				var0.field1274 = 0; // L: 4166
			}
		}

		class0.method11(var0); // L: 4168
	} // L: 4169

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIB)V",
		garbageValue = "2"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4371
			int var3 = WorldMapScaleHandler.SequenceDefinition_get(var1).field1894; // L: 4372
			if (var3 == 1) { // L: 4373
				var0.sequenceFrame = 0; // L: 4374
				var0.sequenceFrameCycle = 0; // L: 4375
				var0.sequenceDelay = var2; // L: 4376
				var0.field1258 = 0; // L: 4377
			}

			if (var3 == 2) { // L: 4379
				var0.field1258 = 0; // L: 4380
			}
		} else if (var1 == -1 || var0.sequence == -1 || WorldMapScaleHandler.SequenceDefinition_get(var1).field1892 >= WorldMapScaleHandler.SequenceDefinition_get(var0.sequence).field1892) { // L: 4383
			var0.sequence = var1; // L: 4384
			var0.sequenceFrame = 0; // L: 4385
			var0.sequenceFrameCycle = 0; // L: 4386
			var0.sequenceDelay = var2; // L: 4387
			var0.field1258 = 0; // L: 4388
			var0.field1281 = var0.pathLength; // L: 4389
		}

	} // L: 4391

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1994807431"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class233.method4541(); // L: 11436
		if (class289.friendsChat != null) { // L: 11437
			class289.friendsChat.invalidateIgnoreds(); // L: 11438
		}

	} // L: 11440
}
