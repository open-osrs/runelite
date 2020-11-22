import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Actor")
public abstract class Actor extends Entity {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -952501591
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1794864455
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -780515937
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ay")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -955529005
	)
	int field1011;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 788781121
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 790102969
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 457621463
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -276318067
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1230196885
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 560375303
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1465864773
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -994348101
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -974301415
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("am")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("aa")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("at")
	boolean field974;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1009044477
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 852014531
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -762307729
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ap")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ad")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bb")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bf")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bp")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -49521303
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bl")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 81504171
	)
	int field1003;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1355414019
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 878455421
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 570882557
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -254649357
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1925242573
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1589867689
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1211840765
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -192373127
	)
	int field1022;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1626363285
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1912022721
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 806708579
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 419210595
	)
	int field1015;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1288579003
	)
	int field1016;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2146213825
	)
	int field1017;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -972516227
	)
	int field1018;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -180985593
	)
	int field1019;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1137308257
	)
	int field1020;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 740782339
	)
	int field1009;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 968395653
	)
	int field1024;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1324873521
	)
	int field1023;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2110040743
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1789811467
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 501904063
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -816252921
	)
	int field1027;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1271802057
	)
	int field1028;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1827352877
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cy")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cx")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1285644013
	)
	int field978;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 392864233
	)
	int field1034;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1011 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field974 = false; // L: 26
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
		this.field1003 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1022 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1027 = 0; // L: 64
		this.field1028 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field978 = 0; // L: 70
		this.field1034 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035007323"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-104"
	)
	final void method1845() {
		this.pathLength = 0; // L: 76
		this.field1034 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "82"
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
			HitSplatDefinition var12 = class258.method4654(var1); // L: 95
			var10 = var12.field3361; // L: 96
			var11 = var12.field3370; // L: 97
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "-1764"
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
			if (var13.definition.field3310 == var8.field3310) { // L: 161
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931669108"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lft;",
		garbageValue = "17"
	)
	public static Clock method1864() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1341349782"
	)
	static void method1855() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher); // L: 4218
		var0.packetBuffer.writeByte(UrlRequester.getWindowedMode()); // L: 4219
		var0.packetBuffer.writeShort(ItemContainer.canvasWidth); // L: 4220
		var0.packetBuffer.writeShort(HealthBar.canvasHeight); // L: 4221
		Client.packetWriter.addNode(var0); // L: 4222
	} // L: 4223
}
