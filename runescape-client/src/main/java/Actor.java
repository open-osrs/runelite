import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -243732171
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1689270295
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -140599245
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ae")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2082986637
	)
	int field1145;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 928814055
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2001174681
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2071019383
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1481660425
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -770719891
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1457598045
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1531156735
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2066302829
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1738511053
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("am")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("al")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ak")
	boolean field1152;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -763990675
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1295917443
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 632811089
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ai")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bk")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bz")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bl")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("be")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bt")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 2070222075
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bq")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1308262457
	)
	int field1160;
	@ObfuscatedName("bc")
	boolean field1183;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 403424131
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1321838793
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1594151757
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 575683211
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 190938797
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1492406229
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -169397669
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 913353811
	)
	int field1169;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 64571753
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 912175547
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1527911221
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 914678487
	)
	int field1173;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 548528549
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -124454417
	)
	int field1175;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -298998957
	)
	int field1176;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2023300915
	)
	int field1177;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1753319677
	)
	int field1178;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1977620089
	)
	int field1179;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 897769849
	)
	int field1180;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 59479215
	)
	int field1181;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -441727743
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1004897691
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -2031811309
	)
	int field1133;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -618210081
	)
	int field1185;
	@ObfuscatedName("co")
	byte field1146;
	@ObfuscatedName("cu")
	byte field1187;
	@ObfuscatedName("cl")
	byte field1188;
	@ObfuscatedName("cv")
	byte field1189;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 576355457
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2007935065
	)
	int field1131;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1413434473
	)
	int field1192;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -838911281
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cb")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cq")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("pathTraversed")
	class193[] pathTraversed;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -738645237
	)
	int field1197;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 787083707
	)
	int field1134;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1966879477
	)
	int field1161;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1145 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1152 = false; // L: 26
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
		this.field1160 = -1; // L: 40
		this.movementSequence = -1; // L: 42
		this.movementFrame = 0; // L: 43
		this.movementFrameCycle = 0; // L: 44
		this.sequence = -1; // L: 45
		this.sequenceFrame = 0; // L: 46
		this.sequenceFrameCycle = 0; // L: 47
		this.sequenceDelay = 0; // L: 48
		this.field1169 = 0; // L: 49
		this.spotAnimation = -1; // L: 50
		this.spotAnimationFrame = 0; // L: 51
		this.spotAnimationFrameCycle = 0; // L: 52
		this.npcCycle = 0; // L: 62
		this.defaultHeight = 200; // L: 63
		this.field1133 = -1; // L: 64
		this.field1185 = -1; // L: 65
		this.field1131 = 0; // L: 71
		this.field1192 = 32; // L: 72
		this.pathLength = 0; // L: 73
		this.pathX = new int[10]; // L: 74
		this.pathY = new int[10]; // L: 75
		this.pathTraversed = new class193[10]; // L: 76
		this.field1197 = 0; // L: 77
		this.field1134 = 0; // L: 78
		this.field1161 = -1; // L: 79
	} // L: 81

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-450224469"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 89
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1354401176"
	)
	final void method2205() {
		this.pathLength = 0; // L: 84
		this.field1134 = 0; // L: 85
	} // L: 86

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1153359285"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 93
		boolean var8 = true; // L: 94

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 95
			if (this.hitSplatCycles[var9] > var5) { // L: 96
				var7 = false;
			} else {
				var8 = false; // L: 97
			}
		}

		var9 = -1; // L: 99
		int var10 = -1; // L: 100
		int var11 = 0; // L: 101
		if (var1 >= 0) { // L: 102
			HitSplatDefinition var12 = GameEngine.method589(var1); // L: 103
			var10 = var12.field2020; // L: 104
			var11 = var12.field2025; // L: 105
		}

		int var14;
		if (var8) { // L: 107
			if (var10 == -1) { // L: 108
				return;
			}

			var9 = 0; // L: 109
			var14 = 0; // L: 110
			if (var10 == 0) { // L: 111
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 112
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 113
				if (var10 == 0) { // L: 114
					if (this.hitSplatCycles[var13] < var14) { // L: 115
						var9 = var13; // L: 116
						var14 = this.hitSplatCycles[var13]; // L: 117
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 120 121
					var9 = var13; // L: 122
					var14 = this.hitSplatValues[var13]; // L: 123
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 127
				return;
			}
		} else {
			if (var7) { // L: 130
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 131
				byte var15 = this.hitSplatCount; // L: 132
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 133
				if (this.hitSplatCycles[var15] <= var5) { // L: 134
					var9 = var15; // L: 135
					break; // L: 136
				}
			}
		}

		if (var9 >= 0) { // L: 140
			this.hitSplatTypes[var9] = var1; // L: 141
			this.hitSplatValues[var9] = var2; // L: 142
			this.hitSplatTypes2[var9] = var3; // L: 143
			this.hitSplatValues2[var9] = var4; // L: 144
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 145
		}
	} // L: 146

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "108057759"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = HitSplatDefinition.method3619(var1); // L: 149
		HealthBar var8 = null; // L: 150
		HealthBar var9 = null; // L: 151
		int var10 = var7.int2; // L: 152
		int var11 = 0; // L: 153

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 154
			++var11; // L: 155
			if (var12.definition.field1871 == var7.field1871) { // L: 156
				var12.put(var2 + var4, var5, var6, var3); // L: 157
				return; // L: 158
			}

			if (var12.definition.int1 <= var7.int1) { // L: 160
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 161
				var9 = var12; // L: 162
				var10 = var12.definition.int2; // L: 163
			}
		}

		if (var9 != null || var11 < 4) { // L: 166
			var12 = new HealthBar(var7); // L: 167
			if (var8 == null) { // L: 168
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 169
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 170
			if (var11 >= 4) { // L: 171
				var9.remove();
			}

		}
	} // L: 172

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = HitSplatDefinition.method3619(var1); // L: 175

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 176
			if (var2 == var3.definition) { // L: 177
				var3.remove(); // L: 178
				return; // L: 179
			}
		}

	} // L: 182
}
