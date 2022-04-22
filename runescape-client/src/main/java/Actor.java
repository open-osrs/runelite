import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -737197671
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1503029363
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 949937203
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("al")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -783744909
	)
	int field1150;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2090551411
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 232574947
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1143253727
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1560864183
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1127685057
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 744886811
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -956659469
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 184480963
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1130956487
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ad")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ai")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ax")
	boolean field1130;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1982594461
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -634626739
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -775634919
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("aa")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bj")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("br")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bo")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1015640839
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bf")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2088058279
	)
	int field1121;
	@ObfuscatedName("bw")
	boolean field1144;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1146125633
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 898293505
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -112560555
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 10456859
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 560334071
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1378795463
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 404973767
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 483100279
	)
	int field1152;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 949581517
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -246855743
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 428527393
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1353205367
	)
	int field1134;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -848140033
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2105127011
	)
	int field1129;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2045898909
	)
	int field1132;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1275901079
	)
	int field1160;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -9234697
	)
	int field1161;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 46528465
	)
	int field1143;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1381806485
	)
	int field1163;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 988836337
	)
	int field1135;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 871764515
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 512453881
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 688985935
	)
	int field1167;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1582188565
	)
	int field1168;
	@ObfuscatedName("cb")
	byte field1169;
	@ObfuscatedName("cp")
	byte field1114;
	@ObfuscatedName("co")
	byte field1171;
	@ObfuscatedName("ca")
	byte field1122;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1373710797
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1390704935
	)
	int field1174;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1419386607
	)
	int field1175;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 661195985
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cu")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	@Export("pathTraversed")
	class193[] pathTraversed;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1219276617
	)
	int field1179;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -167546627
	)
	int field1170;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1781781251
	)
	int field1182;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1150 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1130 = false; // L: 26
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
		this.field1121 = -1; // L: 40
		this.movementSequence = -1; // L: 42
		this.movementFrame = 0; // L: 43
		this.movementFrameCycle = 0; // L: 44
		this.sequence = -1; // L: 45
		this.sequenceFrame = 0; // L: 46
		this.sequenceFrameCycle = 0; // L: 47
		this.sequenceDelay = 0; // L: 48
		this.field1152 = 0; // L: 49
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1167 = -1;
		this.field1168 = -1;
		this.field1174 = 0; // L: 71
		this.field1175 = 32; // L: 72
		this.pathLength = 0; // L: 73
		this.pathX = new int[10]; // L: 74
		this.pathY = new int[10]; // L: 75
		this.pathTraversed = new class193[10]; // L: 76
		this.field1179 = 0; // L: 77
		this.field1170 = 0; // L: 78
		this.field1182 = -1; // L: 79
	} // L: 81

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-323504433"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 89
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	final void method2179() {
		this.pathLength = 0; // L: 84
		this.field1170 = 0; // L: 85
	} // L: 86

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "32"
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
			HitSplatDefinition var12 = UserComparator3.method2602(var1); // L: 103
			var10 = var12.field2007; // L: 104
			var11 = var12.field1998; // L: 105
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-36044149"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = ClanChannelMember.method2870(var1); // L: 149
		HealthBar var8 = null; // L: 150
		HealthBar var9 = null; // L: 151
		int var10 = var7.int2; // L: 152
		int var11 = 0; // L: 153

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 154
			++var11; // L: 155
			if (var12.definition.field1862 == var7.field1862) { // L: 156
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2121685273"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = ClanChannelMember.method2870(var1); // L: 175

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 176
			if (var2 == var3.definition) { // L: 177
				var3.remove(); // L: 178
				return; // L: 179
			}
		}

	} // L: 182

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-954026724"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class301.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public static void method2183(int var0) {
		class273.musicPlayerStatus = 1; // L: 60
		class273.musicTrackArchive = null; // L: 61
		AccessFile.musicTrackGroupId = -1; // L: 62
		class273.musicTrackFileId = -1; // L: 63
		class273.musicTrackVolume = 0; // L: 64
		class17.musicTrackBoolean = false; // L: 65
		class273.pcmSampleLength = var0; // L: 66
	} // L: 67

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24811"
	)
	static void method2177() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1778836338"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 381
		int var2 = var1.readUnsignedByte(); // L: 382
		int var3 = var1.readInt(); // L: 383
		if (var3 < 0 || AbstractArchive.field3981 != 0 && var3 > AbstractArchive.field3981) { // L: 384
			throw new RuntimeException(); // L: 385
		} else if (var2 == 0) { // L: 387
			byte[] var6 = new byte[var3]; // L: 388
			var1.readBytes(var6, 0, var3); // L: 389
			return var6; // L: 390
		} else {
			int var4 = var1.readInt(); // L: 393
			if (var4 >= 0 && (AbstractArchive.field3981 == 0 || var4 <= AbstractArchive.field3981)) { // L: 394
				byte[] var5 = new byte[var4]; // L: 397
				if (var2 == 1) { // L: 398
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 399
				}

				return var5; // L: 400
			} else {
				throw new RuntimeException(); // L: 395
			}
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "53"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class131.clientPreferences.method2243() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3597
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3598
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3599
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3600
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3601
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3602
			++Client.soundEffectCount; // L: 3603
		}

	} // L: 3605
}
