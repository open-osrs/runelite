import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 121889507
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 661010269
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1669699483
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("az")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1075193415
	)
	int field1167;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1662995403
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 277443883
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -828957377
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 541405107
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 567570905
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 181548217
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -268256549
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1210183331
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2015875653
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 688372339
	)
	int field1150;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1227089691
	)
	int field1183;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 659809895
	)
	int field1152;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 850455971
	)
	int field1160;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1260070347
	)
	int field1154;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1833639881
	)
	int field1155;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -417824403
	)
	int field1156;
	@ObfuscatedName("at")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("br")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ba")
	boolean field1198;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1230418907
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2134963039
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2079520011
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("bl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bs")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bx")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bj")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("be")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 16666525
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bv")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1468417251
	)
	int field1172;
	@ObfuscatedName("bu")
	boolean field1173;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -87801333
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1659027519
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1628370693
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -419918963
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 647710587
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1189789481
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1226146741
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1495425719
	)
	int field1186;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 556914221
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -861517093
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 511018915
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -539089199
	)
	int field1185;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1282068867
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -598436523
	)
	int field1187;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1307371871
	)
	int field1188;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1779400399
	)
	int field1189;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2006327735
	)
	int field1190;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -192434321
	)
	int field1191;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -41775789
	)
	int field1192;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1780782035
	)
	int field1139;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 986187043
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1812690243
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1016685127
	)
	int field1196;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1275836225
	)
	int field1197;
	@ObfuscatedName("cf")
	byte field1143;
	@ObfuscatedName("cq")
	byte field1199;
	@ObfuscatedName("cg")
	byte field1153;
	@ObfuscatedName("cl")
	byte field1140;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1211095435
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1602792415
	)
	int field1203;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1818380337
	)
	int field1204;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1724632665
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cb")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	@Export("pathTraversed")
	class193[] pathTraversed;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 753559813
	)
	int field1194;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1620196957
	)
	int field1200;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 731891927
	)
	int field1210;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1167 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1150 = -1; // L: 24
		this.field1183 = -1; // L: 25
		this.field1152 = -1; // L: 26
		this.field1160 = -1; // L: 27
		this.field1154 = -1; // L: 28
		this.field1155 = -1; // L: 29
		this.field1156 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1198 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.overheadTextColor = 0; // L: 35
		this.overheadTextEffect = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1172 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.sequence = -1; // L: 52
		this.sequenceFrame = 0; // L: 53
		this.sequenceFrameCycle = 0; // L: 54
		this.sequenceDelay = 0; // L: 55
		this.field1186 = 0; // L: 56
		this.spotAnimation = -1; // L: 57
		this.spotAnimationFrame = 0; // L: 58
		this.spotAnimationFrameCycle = 0; // L: 59
		this.npcCycle = 0; // L: 69
		this.defaultHeight = 200; // L: 70
		this.field1196 = -1; // L: 71
		this.field1197 = -1; // L: 72
		this.field1203 = 0; // L: 78
		this.field1204 = 32; // L: 79
		this.pathLength = 0; // L: 80
		this.pathX = new int[10]; // L: 81
		this.pathY = new int[10]; // L: 82
		this.pathTraversed = new class193[10]; // L: 83
		this.field1194 = 0; // L: 84
		this.field1200 = 0; // L: 85
		this.field1210 = -1; // L: 86
	} // L: 88

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 96
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method2180() {
		this.pathLength = 0; // L: 91
		this.field1200 = 0; // L: 92
	} // L: 93

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1908161271"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 100
		boolean var8 = true; // L: 101

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 102
			if (this.hitSplatCycles[var9] > var5) { // L: 103
				var7 = false;
			} else {
				var8 = false; // L: 104
			}
		}

		var9 = -1; // L: 106
		int var10 = -1; // L: 107
		int var11 = 0; // L: 108
		if (var1 >= 0) { // L: 109
			HitSplatDefinition var12 = UserComparator4.method2567(var1); // L: 110
			var10 = var12.field2070; // L: 111
			var11 = var12.field2071; // L: 112
		}

		int var14;
		if (var8) { // L: 114
			if (var10 == -1) { // L: 115
				return;
			}

			var9 = 0; // L: 116
			var14 = 0; // L: 117
			if (var10 == 0) { // L: 118
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 119
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 120
				if (var10 == 0) { // L: 121
					if (this.hitSplatCycles[var13] < var14) { // L: 122
						var9 = var13; // L: 123
						var14 = this.hitSplatCycles[var13]; // L: 124
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 127 128
					var9 = var13; // L: 129
					var14 = this.hitSplatValues[var13]; // L: 130
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 134
				return;
			}
		} else {
			if (var7) { // L: 137
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 138
				byte var15 = this.hitSplatCount; // L: 139
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 140
				if (this.hitSplatCycles[var15] <= var5) { // L: 141
					var9 = var15; // L: 142
					break; // L: 143
				}
			}
		}

		if (var9 >= 0) { // L: 147
			this.hitSplatTypes[var9] = var1; // L: 148
			this.hitSplatValues[var9] = var2; // L: 149
			this.hitSplatTypes2[var9] = var3; // L: 150
			this.hitSplatValues2[var9] = var4; // L: 151
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 152
		}
	} // L: 153

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1476814237"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 158
		HealthBarDefinition var7;
		if (var8 != null) { // L: 159
			var7 = var8; // L: 160
		} else {
			byte[] var9 = World.HealthBarDefinition_archive.takeFile(33, var1); // L: 163
			var8 = new HealthBarDefinition(); // L: 164
			if (var9 != null) { // L: 165
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 166
			var7 = var8; // L: 167
		}

		var8 = var7; // L: 169
		HealthBar var14 = null; // L: 170
		HealthBar var10 = null; // L: 171
		int var11 = var7.int2; // L: 172
		int var12 = 0; // L: 173

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 174
			++var12; // L: 175
			if (var13.definition.field1908 == var8.field1908) { // L: 176
				var13.put(var2 + var4, var5, var6, var3); // L: 177
				return; // L: 178
			}

			if (var13.definition.int1 <= var8.int1) { // L: 180
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 181
				var10 = var13; // L: 182
				var11 = var13.definition.int2; // L: 183
			}
		}

		if (var10 != null || var12 < 4) { // L: 186
			var13 = new HealthBar(var8); // L: 187
			if (var14 == null) { // L: 188
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 189
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 190
			if (var12 >= 4) { // L: 191
				var10.remove();
			}

		}
	} // L: 192

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 197
		HealthBarDefinition var2;
		if (var3 != null) { // L: 198
			var2 = var3; // L: 199
		} else {
			byte[] var4 = World.HealthBarDefinition_archive.takeFile(33, var1); // L: 202
			var3 = new HealthBarDefinition(); // L: 203
			if (var4 != null) { // L: 204
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 205
			var2 = var3; // L: 206
		}

		var3 = var2; // L: 208

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 209
			if (var3 == var5.definition) { // L: 210
				var5.remove(); // L: 211
				return; // L: 212
			}
		}

	} // L: 215
}
