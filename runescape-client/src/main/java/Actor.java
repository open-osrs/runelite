import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 1224542185
	)
	static int field1146;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1060488561
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1758566435
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -780864819
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("as")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1850945247
	)
	int field1087;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1010787109
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1162942381
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -976729951
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1205631887
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1698656563
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1827265149
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -862066401
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -680764833
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 528537939
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ap")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("au")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aj")
	boolean field1099;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1349162329
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -485598179
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1527060029
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ay")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bg")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bx")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bt")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1726125141
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bh")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1484671141
	)
	int field1112;
	@ObfuscatedName("bm")
	boolean field1127;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1478500765
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1354844887
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 909600967
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -153672255
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 688727445
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -701592673
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1424121639
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1810491641
	)
	int field1116;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1442456691
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1112868275
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 914687343
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -577715243
	)
	int field1125;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 539982077
	)
	int field1126;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -222009755
	)
	int field1083;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 964367307
	)
	int field1128;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 646319749
	)
	int field1100;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 154596387
	)
	int field1130;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1879657163
	)
	int field1131;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -438636187
	)
	int field1132;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1091823721
	)
	int field1133;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -685467991
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1735337961
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1488414823
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -2044798983
	)
	int field1137;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 369982221
	)
	int field1138;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 274803431
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cs")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ce")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cp")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -405619359
	)
	int field1085;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 910802769
	)
	int field1144;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -947188393
	)
	int field1145;

	Actor() {
		this.isWalking = false; // L: 12
		this.field1087 = 1; // L: 13
		this.idleSequence = -1; // L: 15
		this.turnLeftSequence = -1; // L: 16
		this.turnRightSequence = -1; // L: 17
		this.walkSequence = -1; // L: 18
		this.walkBackSequence = -1; // L: 19
		this.walkLeftSequence = -1; // L: 20
		this.walkRightSequence = -1; // L: 21
		this.runSequence = -1; // L: 22
		this.overheadText = null; // L: 23
		this.field1099 = false; // L: 25
		this.overheadTextCyclesRemaining = 100; // L: 26
		this.overheadTextColor = 0; // L: 27
		this.overheadTextEffect = 0; // L: 28
		this.hitSplatCount = 0; // L: 30
		this.hitSplatTypes = new int[4]; // L: 31
		this.hitSplatValues = new int[4]; // L: 32
		this.hitSplatCycles = new int[4]; // L: 33
		this.hitSplatTypes2 = new int[4]; // L: 34
		this.hitSplatValues2 = new int[4]; // L: 35
		this.healthBars = new IterableNodeDeque(); // L: 36
		this.targetIndex = -1; // L: 37
		this.false0 = false; // L: 38
		this.field1112 = -1; // L: 39
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1116 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1137 = 0; // L: 64
		this.field1138 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1085 = 0; // L: 70
		this.field1144 = 0; // L: 71
		this.field1145 = -1; // L: 72
	} // L: 74

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-532391824"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 82
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	final void method2165() {
		this.pathLength = 0; // L: 77
		this.field1144 = 0; // L: 78
	} // L: 79

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "32"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 86
		boolean var8 = true; // L: 87

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 88
			if (this.hitSplatCycles[var9] > var5) { // L: 89
				var7 = false;
			} else {
				var8 = false; // L: 90
			}
		}

		var9 = -1; // L: 92
		int var10 = -1; // L: 93
		int var11 = 0; // L: 94
		if (var1 >= 0) { // L: 95
			HitSplatDefinition var12 = Canvas.method372(var1); // L: 96
			var10 = var12.field1816; // L: 97
			var11 = var12.field1805; // L: 98
		}

		int var14;
		if (var8) { // L: 100
			if (var10 == -1) { // L: 101
				return;
			}

			var9 = 0; // L: 102
			var14 = 0; // L: 103
			if (var10 == 0) { // L: 104
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 105
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 106
				if (var10 == 0) { // L: 107
					if (this.hitSplatCycles[var13] < var14) { // L: 108
						var9 = var13; // L: 109
						var14 = this.hitSplatCycles[var13]; // L: 110
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 113 114
					var9 = var13; // L: 115
					var14 = this.hitSplatValues[var13]; // L: 116
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 120
				return;
			}
		} else {
			if (var7) { // L: 123
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 124
				byte var15 = this.hitSplatCount; // L: 125
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 126
				if (this.hitSplatCycles[var15] <= var5) { // L: 127
					var9 = var15; // L: 128
					break; // L: 129
				}
			}
		}

		if (var9 >= 0) { // L: 133
			this.hitSplatTypes[var9] = var1; // L: 134
			this.hitSplatValues[var9] = var2; // L: 135
			this.hitSplatTypes2[var9] = var3; // L: 136
			this.hitSplatValues2[var9] = var4; // L: 137
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 138
		}
	} // L: 139

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2125214461"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = ObjectSound.method1772(var1); // L: 142
		HealthBar var8 = null; // L: 143
		HealthBar var9 = null; // L: 144
		int var10 = var7.int2; // L: 145
		int var11 = 0; // L: 146

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 147
			++var11; // L: 148
			if (var12.definition.field1668 == var7.field1668) { // L: 149
				var12.put(var2 + var4, var5, var6, var3); // L: 150
				return; // L: 151
			}

			if (var12.definition.int1 <= var7.int1) { // L: 153
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 154
				var9 = var12; // L: 155
				var10 = var12.definition.int2; // L: 156
			}
		}

		if (var9 != null || var11 < 4) { // L: 159
			var12 = new HealthBar(var7); // L: 160
			if (var8 == null) { // L: 161
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 162
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 163
			if (var11 >= 4) { // L: 164
				var9.remove();
			}

		}
	} // L: 165

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1759022108"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = ObjectSound.method1772(var1); // L: 168

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 169
			if (var2 == var3.definition) { // L: 170
				var3.remove(); // L: 171
				return; // L: 172
			}
		}

	} // L: 175
}
