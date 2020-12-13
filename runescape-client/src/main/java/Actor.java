import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Entity {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -164376935
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1393247939
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1676669577
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -824647789
	)
	int field941;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -545590403
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1349814771
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1202521559
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 514642555
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 211635629
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1470742753
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1189589409
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -225179451
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -547384873
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ap")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ad")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field953;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1570740193
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1034227111
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -150751555
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("az")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("at")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bh")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("by")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bs")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("br")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1378723849
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bf")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1723621713
	)
	int field959;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 66905399
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1817256849
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2112770449
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2008675691
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1716773013
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1725354425
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 772627963
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1988310499
	)
	int field974;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1707465321
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2143799121
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1610783339
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -11622765
	)
	int field978;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 843591835
	)
	int field979;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 450740853
	)
	int field981;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -222499745
	)
	int field958;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -730625153
	)
	int field982;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -447390819
	)
	int field956;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -556199195
	)
	int field984;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1930886253
	)
	int field973;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 287969781
	)
	int field986;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1778031273
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 197743289
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1792117497
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 494801965
	)
	int field954;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -87751045
	)
	int field940;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -835146171
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ce")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cb")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cf")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 541721127
	)
	int field963;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -884102379
	)
	int field996;

	Actor() {
		this.isWalking = false; // L: 13
		this.field941 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field953 = false; // L: 26
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
		this.field959 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field974 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field954 = 0; // L: 64
		this.field940 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field963 = 0; // L: 70
		this.field996 = 0; // L: 71
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1661589479"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-874125335"
	)
	final void method1803() {
		this.pathLength = 0; // L: 76
		this.field996 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "794886398"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1; // L: 91
		int var10 = -1; // L: 92
		int var11 = 0; // L: 93
		if (var1 >= 0) { // L: 94
			HitSplatDefinition var12 = class198.method3697(var1); // L: 95
			var10 = var12.field3373; // L: 96
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
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1; // L: 133
			this.hitSplatValues[var9] = var2; // L: 134
			this.hitSplatTypes2[var9] = var3; // L: 135
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1554709476"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = HealthBarUpdate.method1826(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field3313 == var7.field3313) { // L: 148
				var12.put(var2 + var4, var5, var6, var3);
				return; // L: 150
			}

			if (var12.definition.int1 <= var7.int1) { // L: 152
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 153
				var9 = var12; // L: 154
				var10 = var12.definition.int2; // L: 155
			}
		}

		if (var9 != null || var11 < 4) { // L: 158
			var12 = new HealthBar(var7); // L: 159
			if (var8 == null) { // L: 160
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 161
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 162
			if (var11 >= 4) { // L: 163
				var9.remove();
			}

		}
	} // L: 164

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-324524490"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = HealthBarUpdate.method1826(var1); // L: 167

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 168
			if (var2 == var3.definition) { // L: 169
				var3.remove(); // L: 170
				return; // L: 171
			}
		}

	} // L: 174

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;ZLku;I)V",
		garbageValue = "411546609"
	)
	public static void method1821(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		NPC.ItemDefinition_archive = var0; // L: 84
		VertexNormal.ItemDefinition_modelArchive = var1; // L: 85
		ItemComposition.ItemDefinition_inMembersWorld = var2; // L: 86
		Varcs.ItemDefinition_fileCount = NPC.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		ItemComposition.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BB)Lcs;",
		garbageValue = "0"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 111
		Buffer var2 = new Buffer(var0); // L: 112
		var2.offset = var2.array.length - 2; // L: 113
		int var3 = var2.readUnsignedShort(); // L: 114
		int var4 = var2.array.length - 2 - var3 - 12; // L: 115
		var2.offset = var4; // L: 116
		int var5 = var2.readInt(); // L: 117
		var1.localIntCount = var2.readUnsignedShort(); // L: 118
		var1.localStringCount = var2.readUnsignedShort(); // L: 119
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 120
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 121
		int var6 = var2.readUnsignedByte(); // L: 122
		int var7;
		int var8;
		if (var6 > 0) { // L: 123
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 124

			for (var7 = 0; var7 < var6; ++var7) { // L: 125
				var8 = var2.readUnsignedShort(); // L: 126
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? World.method1870(var8) : 1); // L: 127
				var1.switches[var7] = var9; // L: 128

				while (var8-- > 0) { // L: 129
					int var10 = var2.readInt(); // L: 130
					int var11 = var2.readInt(); // L: 131
					var9.put(new IntegerNode(var11), (long)var10); // L: 132
				}
			}
		}

		var2.offset = 0; // L: 136
		var2.readStringCp1252NullTerminatedOrNull(); // L: 137
		var1.opcodes = new int[var5]; // L: 138
		var1.intOperands = new int[var5]; // L: 139
		var1.stringOperands = new String[var5]; // L: 140

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 141 142 147
			var8 = var2.readUnsignedShort(); // L: 143
			if (var8 == 3) { // L: 144
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 145
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 146
			}
		}

		return var1; // L: 149
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1653526163"
	)
	static void method1819(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)Lma;",
		garbageValue = "-1640183017"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return WorldMapRectangle.worldMap; // L: 663
	}
}
