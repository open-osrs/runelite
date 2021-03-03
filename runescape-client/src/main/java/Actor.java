import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 136172069
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1402910771
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1011628117
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -477017185
	)
	int field1007;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1508823583
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1984168657
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 845088399
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1336726555
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1451963771
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2000722135
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 207993293
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1423094315
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1748919145
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("aj")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("an")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field968;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -263246735
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1742046101
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -815377649
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("av")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ao")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bj")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bn")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bi")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bp")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1403434087
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bx")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1507873993
	)
	int field981;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -203452431
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1749828811
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1321307133
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1530341969
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1363131469
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2014778209
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1060389691
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1582636697
	)
	int field973;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1271026177
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -416499547
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1172946753
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1898700159
	)
	int field993;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2097471137
	)
	int field994;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1384002081
	)
	int field992;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2137511937
	)
	int field996;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2030426109
	)
	int field952;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -593176361
	)
	int field998;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 798187101
	)
	int field999;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 145719275
	)
	int field1000;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 423082639
	)
	int field1001;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -724191925
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -250505211
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 373581305
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1380674587
	)
	int field957;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1991830867
	)
	int field1006;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1201240635
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 349923111
	)
	int field989;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1293926575
	)
	int field1012;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1007 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field968 = false; // L: 26
		this.overheadTextCyclesRemaining = 100; // L: 27
		this.overheadTextColor = 0; // L: 28
		this.overheadTextEffect = 0; // L: 29
		this.hitSplatCount = 0; // L: 31
		this.hitSplatTypes = new int[4]; // L: 32
		this.hitSplatValues = new int[4]; // L: 33
		this.hitSplatCycles = new int[4]; // L: 34
		this.hitSplatTypes2 = new int[4]; // L: 35
		this.hitSplatValues2 = new int[4]; // L: 36
		this.healthBars = new IterableNodeDeque(); // L: 37
		this.targetIndex = -1; // L: 38
		this.false0 = false; // L: 39
		this.field981 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0;
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field973 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field957 = 0; // L: 64
		this.field1006 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field989 = 0; // L: 70
		this.field1012 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-251916247"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1387787360"
	)
	final void method1848() {
		this.pathLength = 0; // L: 76
		this.field1012 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "104"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 85
		boolean var8 = true; // L: 86

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 87
			if (this.hitSplatCycles[var9] > var5) { // L: 88
				var7 = false;
			} else {
				var8 = false; // L: 89
			}
		}

		var9 = -1; // L: 91
		int var10 = -1; // L: 92
		int var11 = 0; // L: 93
		if (var1 >= 0) { // L: 94
			HitSplatDefinition var12 = ScriptFrame.method1222(var1); // L: 95
			var10 = var12.field3375; // L: 96
			var11 = var12.field3364; // L: 97
		}

		int var14;
		if (var8) { // L: 99
			if (var10 == -1) { // L: 100
				return;
			}

			var9 = 0; // L: 101
			var14 = 0; // L: 102
			if (var10 == 0) { // L: 103
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 104
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 105
				if (var10 == 0) { // L: 106
					if (this.hitSplatCycles[var13] < var14) { // L: 107
						var9 = var13; // L: 108
						var14 = this.hitSplatCycles[var13]; // L: 109
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 112 113
					var9 = var13; // L: 114
					var14 = this.hitSplatValues[var13]; // L: 115
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 119
				return;
			}
		} else {
			if (var7) { // L: 122
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 123
				byte var15 = this.hitSplatCount; // L: 124
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 125
				if (this.hitSplatCycles[var15] <= var5) { // L: 126
					var9 = var15; // L: 127
					break; // L: 128
				}
			}
		}

		if (var9 >= 0) { // L: 132
			this.hitSplatTypes[var9] = var1; // L: 133
			this.hitSplatValues[var9] = var2; // L: 134
			this.hitSplatTypes2[var9] = var3; // L: 135
			this.hitSplatValues2[var9] = var4; // L: 136
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 137
		}
	} // L: 138

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 143
		HealthBarDefinition var7;
		if (var8 != null) { // L: 144
			var7 = var8; // L: 145
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 148
			var8 = new HealthBarDefinition(); // L: 149
			if (var9 != null) { // L: 150
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 151
			var7 = var8; // L: 152
		}

		var8 = var7; // L: 154
		HealthBar var14 = null; // L: 155
		HealthBar var10 = null; // L: 156
		int var11 = var7.int2; // L: 157
		int var12 = 0; // L: 158

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 159
			++var12; // L: 160
			if (var13.definition.field3312 == var8.field3312) { // L: 161
				var13.put(var2 + var4, var5, var6, var3); // L: 162
				return; // L: 163
			}

			if (var13.definition.int1 <= var8.int1) { // L: 165
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 166
				var10 = var13; // L: 167
				var11 = var13.definition.int2; // L: 168
			}
		}

		if (var10 != null || var12 < 4) { // L: 171
			var13 = new HealthBar(var8); // L: 172
			if (var14 == null) { // L: 173
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 174
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 175
			if (var12 >= 4) { // L: 176
				var10.remove();
			}

		}
	} // L: 177

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 182
		HealthBarDefinition var2;
		if (var3 != null) { // L: 183
			var2 = var3; // L: 184
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 187
			var3 = new HealthBarDefinition(); // L: 188
			if (var4 != null) { // L: 189
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 190
			var2 = var3; // L: 191
		}

		var3 = var2; // L: 193

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 194
			if (var3 == var5.definition) { // L: 195
				var5.remove(); // L: 196
				return; // L: 197
			}
		}

	} // L: 200

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "424984717"
	)
	public static void method1867(boolean var0) {
		if (class297.NetCache_socket != null) { // L: 42
			try {
				Buffer var1 = new Buffer(4); // L: 44
				var1.writeByte(var0 ? 2 : 3); // L: 45
				var1.writeMedium(0); // L: 46
				class297.NetCache_socket.write(var1.array, 0, 4); // L: 47
			} catch (IOException var4) {
				try {
					class297.NetCache_socket.close(); // L: 51
				} catch (Exception var3) { // L: 53
				}

				++NetCache.NetCache_ioExceptions; // L: 54
				class297.NetCache_socket = null; // L: 55
			}

		}
	} // L: 57

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1068788857"
	)
	static final void method1868() {
		int[] var0 = Players.Players_indices; // L: 3449

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3450
			Player var4 = Client.players[var0[var1]]; // L: 3451
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3452
				--var4.overheadTextCyclesRemaining; // L: 3453
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3454
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3457
			int var2 = Client.npcIndices[var1]; // L: 3458
			NPC var3 = Client.npcs[var2]; // L: 3459
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3460
				--var3.overheadTextCyclesRemaining; // L: 3461
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3462
					var3.overheadText = null;
				}
			}
		}

	} // L: 3465
}
