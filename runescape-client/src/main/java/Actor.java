import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -371192105
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -130212619
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1248597615
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1073291133
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ag")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1868694145
	)
	int field1239;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1698768263
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -932232515
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2010968993
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -144191447
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -152072953
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1808202573
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1341114765
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1993879825
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1401897961
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("aq")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("aw")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("af")
	boolean field1248;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1654949393
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -275691641
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1592365515
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("an")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bt")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bq")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 637535539
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bz")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 800070667
	)
	int field1264;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -330797761
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1832573289
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 572579455
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1762760413
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2078717111
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 643131463
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1848146093
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 272217185
	)
	int field1245;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1915525677
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 479634489
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1084268575
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 58747199
	)
	int field1287;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1377519793
	)
	int field1277;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 721291573
	)
	int field1278;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1049471373
	)
	int field1269;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 690610019
	)
	int field1280;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1504119385
	)
	int field1238;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -611848265
	)
	int field1265;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -61946015
	)
	int field1283;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 165021719
	)
	int field1284;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1280286129
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -881485665
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1173912475
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -906983361
	)
	int field1282;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1889632377
	)
	int field1289;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -664818219
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cs")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cg")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 110165637
	)
	int field1294;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 313310131
	)
	int field1274;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1239 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1248 = false; // L: 26
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
		this.field1264 = -1; // L: 40
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
		this.field1282 = 0; // L: 64
		this.field1289 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1294 = 0; // L: 70
		this.field1274 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1557316570"
	)
	final void method2171() {
		this.pathLength = 0; // L: 76
		this.field1274 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "31"
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
			HitSplatDefinition var12 = Projectile.method1966(var1); // L: 95
			var10 = var12.field1743; // L: 96
			var11 = var12.field1731; // L: 97
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
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-127"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = UserComparator6.method2492(var1); // L: 141
		HealthBar var8 = null; // L: 142
		HealthBar var9 = null; // L: 143
		int var10 = var7.int2; // L: 144
		int var11 = 0; // L: 145

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 146
			++var11; // L: 147
			if (var12.definition.field1596 == var7.field1596) { // L: 148
				var12.put(var2 + var4, var5, var6, var3); // L: 149
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = UserComparator6.method2492(var1); // L: 167

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 168
			if (var2 == var3.definition) { // L: 169
				var3.remove(); // L: 170
				return; // L: 171
			}
		}

	} // L: 174

	@ObfuscatedName("o")
	static final void method2191(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 108
	} // L: 109

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "325868949"
	)
	static void method2192(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8588
		int[] var3 = Players.Players_indices; // L: 8589
		boolean var4 = false; // L: 8590
		Username var5 = new Username(var1, WorldMapSection0.loginType); // L: 8591

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8592
			Player var7 = Client.players[var3[var6]]; // L: 8593
			if (var7 != null && var7 != class93.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8594
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8595
					var8 = class21.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher); // L: 8597
					var8.packetBuffer.method6619(var3[var6]); // L: 8598
					var8.packetBuffer.method6584(0); // L: 8599
					Client.packetWriter.addNode(var8); // L: 8600
				} else if (var0 == 4) { // L: 8602
					var8 = class21.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher); // L: 8604
					var8.packetBuffer.method6619(var3[var6]); // L: 8605
					var8.packetBuffer.method6584(0); // L: 8606
					Client.packetWriter.addNode(var8); // L: 8607
				} else if (var0 == 6) { // L: 8609
					var8 = class21.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher); // L: 8611
					var8.packetBuffer.method6581(0); // L: 8612
					var8.packetBuffer.method6602(var3[var6]); // L: 8613
					Client.packetWriter.addNode(var8); // L: 8614
				} else if (var0 == 7) { // L: 8616
					var8 = class21.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher); // L: 8618
					var8.packetBuffer.writeByte(0); // L: 8619
					var8.packetBuffer.method6602(var3[var6]); // L: 8620
					Client.packetWriter.addNode(var8); // L: 8621
				}

				var4 = true; // L: 8623
				break;
			}
		}

		if (!var4) { // L: 8627
			World.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8628
}
