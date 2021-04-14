import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1068128585
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1496580437
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1434789983
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("aj")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -211651151
	)
	int field1258;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1629185903
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1638489447
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1105812335
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1459534643
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -197807279
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1105024071
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 910987067
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -943524147
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2019858221
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("au")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ab")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aa")
	boolean field1208;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1791931697
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1625309775
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1793952127
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ah")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ae")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bh")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("br")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bn")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bi")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 421944119
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bt")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -877553659
	)
	int field1237;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1958333453
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1237612855
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 950039177
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1061585055
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -692137845
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 830949033
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1415641635
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 334019467
	)
	int field1245;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -946982677
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1701654947
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1718225643
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 708623357
	)
	int field1249;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 375803761
	)
	int field1238;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1376238069
	)
	int field1240;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1384218543
	)
	int field1252;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1368903785
	)
	int field1253;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1912998321
	)
	int field1239;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1793257471
	)
	int field1255;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -836085199
	)
	int field1268;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1011086267
	)
	int field1213;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -966578099
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 890714575
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1457707769
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -551796625
	)
	int field1261;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1810654447
	)
	int field1262;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1223856599
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cc")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cn")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -570005291
	)
	int field1267;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1192220791
	)
	int field1224;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1258 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1208 = false; // L: 26
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
		this.field1237 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1245 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1261 = 0; // L: 64
		this.field1262 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1267 = 0; // L: 70
		this.field1224 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	final void method2157() {
		this.pathLength = 0; // L: 76
		this.field1224 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-186188203"
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
			HitSplatDefinition var12 = StudioGame.method4391(var1); // L: 95
			var10 = var12.field3586; // L: 96
			var11 = var12.field3581; // L: 97
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1980321202"
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
			if (var13.definition.field3445 == var8.field3445) { // L: 161
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1124408084"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1120048289"
	)
	public static void method2173(boolean var0) {
		if (var0 != class21.ItemDefinition_inMembersWorld) { // L: 582
			WorldMapLabelSize.method2678(); // L: 583
			class21.ItemDefinition_inMembersWorld = var0; // L: 584
		}

	} // L: 586

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(B)Lmr;",
		garbageValue = "14"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return UserComparator4.worldMap; // L: 683
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "19847"
	)
	static void method2174(int var0) {
		Client.oculusOrbState = var0; // L: 11696
	} // L: 11697
}
