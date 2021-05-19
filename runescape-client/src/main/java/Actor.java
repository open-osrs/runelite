import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -60079109
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1766175129
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 309307455
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("al")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -508330989
	)
	int field1211;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1856466777
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1523832987
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1651347451
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -894700151
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -644124853
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -260839917
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1673254867
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1777299595
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 258726619
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("az")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aq")
	boolean field1223;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 441130155
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -506528051
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1268134939
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("an")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bw")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bf")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bb")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2001939337
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("by")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 713159597
	)
	int field1247;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1142077753
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1571862761
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 894074389
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -128111571
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1558553463
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1657374705
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1057732107
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1401992799
	)
	int field1244;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1781887565
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1474223197
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -481375045
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 895533867
	)
	int field1243;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 724261779
	)
	int field1224;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1356856001
	)
	int field1236;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 357124569
	)
	int field1251;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 837192135
	)
	int field1252;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -832167709
	)
	int field1253;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1244121347
	)
	int field1254;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1639074179
	)
	int field1237;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1718337881
	)
	int field1256;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1061708383
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1167885103
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 108366915
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1846500997
	)
	int field1248;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2042152507
	)
	int field1261;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1984582191
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cf")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cq")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cs")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -2122964403
	)
	int field1250;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -681332491
	)
	int field1215;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1211 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1223 = false; // L: 26
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
		this.field1247 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1244 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1248 = 0; // L: 64
		this.field1261 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1250 = 0; // L: 70
		this.field1215 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "580510883"
	)
	final void method2194() {
		this.pathLength = 0; // L: 76
		this.field1215 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
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
			HitSplatDefinition var13 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var1); // L: 97
			HitSplatDefinition var12;
			if (var13 != null) { // L: 98
				var12 = var13; // L: 99
			} else {
				byte[] var14 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var1); // L: 102
				var13 = new HitSplatDefinition(); // L: 103
				if (var14 != null) { // L: 104
					var13.decode(new Buffer(var14));
				}

				HitSplatDefinition.HitSplatDefinition_cached.put(var13, (long)var1); // L: 105
				var12 = var13; // L: 106
			}

			var10 = var12.field1752; // L: 109
			var11 = var12.field1735; // L: 110
		}

		int var15;
		if (var8) { // L: 112
			if (var10 == -1) { // L: 113
				return;
			}

			var9 = 0; // L: 114
			var15 = 0; // L: 115
			if (var10 == 0) { // L: 116
				var15 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var15 = this.hitSplatValues[0]; // L: 117
			}

			for (int var16 = 1; var16 < 4; ++var16) { // L: 118
				if (var10 == 0) { // L: 119
					if (this.hitSplatCycles[var16] < var15) { // L: 120
						var9 = var16; // L: 121
						var15 = this.hitSplatCycles[var16]; // L: 122
					}
				} else if (var10 == 1 && this.hitSplatValues[var16] < var15) { // L: 125 126
					var9 = var16; // L: 127
					var15 = this.hitSplatValues[var16]; // L: 128
				}
			}

			if (var10 == 1 && var15 >= var2) { // L: 132
				return;
			}
		} else {
			if (var7) { // L: 135
				this.hitSplatCount = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) { // L: 136
				byte var17 = this.hitSplatCount; // L: 137
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 138
				if (this.hitSplatCycles[var17] <= var5) { // L: 139
					var9 = var17; // L: 140
					break; // L: 141
				}
			}
		}

		if (var9 >= 0) { // L: 145
			this.hitSplatTypes[var9] = var1; // L: 146
			this.hitSplatValues[var9] = var2; // L: 147
			this.hitSplatTypes2[var9] = var3; // L: 148
			this.hitSplatValues2[var9] = var4; // L: 149
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 150
		}
	} // L: 151

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1818079351"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 156
		HealthBarDefinition var7;
		if (var8 != null) { // L: 157
			var7 = var8; // L: 158
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 161
			var8 = new HealthBarDefinition(); // L: 162
			if (var9 != null) { // L: 163
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 164
			var7 = var8; // L: 165
		}

		var8 = var7; // L: 167
		HealthBar var14 = null; // L: 168
		HealthBar var10 = null; // L: 169
		int var11 = var7.int2; // L: 170
		int var12 = 0; // L: 171

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 172
			++var12; // L: 173
			if (var13.definition.field1597 == var8.field1597) { // L: 174
				var13.put(var2 + var4, var5, var6, var3); // L: 175
				return; // L: 176
			}

			if (var13.definition.int1 <= var8.int1) { // L: 178
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 179
				var10 = var13; // L: 180
				var11 = var13.definition.int2; // L: 181
			}
		}

		if (var10 != null || var12 < 4) { // L: 184
			var13 = new HealthBar(var8); // L: 185
			if (var14 == null) { // L: 186
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 187
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 188
			if (var12 >= 4) { // L: 189
				var10.remove();
			}

		}
	} // L: 190

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1438107880"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 195
		HealthBarDefinition var2;
		if (var3 != null) { // L: 196
			var2 = var3; // L: 197
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 200
			var3 = new HealthBarDefinition(); // L: 201
			if (var4 != null) { // L: 202
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 203
			var2 = var3; // L: 204
		}

		var3 = var2; // L: 206

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 207
			if (var3 == var5.definition) { // L: 208
				var5.remove(); // L: 209
				return; // L: 210
			}
		}

	} // L: 213

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1704817926"
	)
	static final void method2199(int var0, int var1, boolean var2) {
		if (!var2 || var0 != MusicPatchNode2.field2827 || class11.field112 != var1) { // L: 5558
			MusicPatchNode2.field2827 = var0; // L: 5561
			class11.field112 = var1; // L: 5562
			Client.updateGameState(25); // L: 5563
			class7.drawLoadingMessage("Loading - please wait.", true); // L: 5564
			int var3 = JagexCache.baseX; // L: 5565
			int var4 = Messages.baseY; // L: 5566
			JagexCache.baseX = (var0 - 6) * 8; // L: 5567
			Messages.baseY = (var1 - 6) * 8; // L: 5568
			int var5 = JagexCache.baseX - var3; // L: 5569
			int var6 = Messages.baseY - var4; // L: 5570
			var3 = JagexCache.baseX; // L: 5571
			var4 = Messages.baseY; // L: 5572

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5573
				NPC var19 = Client.npcs[var7]; // L: 5574
				if (var19 != null) { // L: 5575
					for (var9 = 0; var9 < 10; ++var9) { // L: 5576
						var10000 = var19.pathX; // L: 5577
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5578
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5580
					var19.y -= var6 * 128; // L: 5581
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5584
				Player var22 = Client.players[var7]; // L: 5585
				if (var22 != null) { // L: 5586
					for (var9 = 0; var9 < 10; ++var9) { // L: 5587
						var10000 = var22.pathX; // L: 5588
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5589
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5591
					var22.y -= var6 * 128; // L: 5592
				}
			}

			byte var20 = 0; // L: 5595
			byte var8 = 104; // L: 5596
			byte var21 = 1; // L: 5597
			if (var5 < 0) { // L: 5598
				var20 = 103; // L: 5599
				var8 = -1; // L: 5600
				var21 = -1; // L: 5601
			}

			byte var10 = 0; // L: 5603
			byte var11 = 104; // L: 5604
			byte var12 = 1; // L: 5605
			if (var6 < 0) { // L: 5606
				var10 = 103; // L: 5607
				var11 = -1; // L: 5608
				var12 = -1; // L: 5609
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5611
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5612
					int var15 = var13 + var5; // L: 5613
					int var16 = var6 + var14; // L: 5614

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5615
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5616
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5617
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5621 5622 5626
				var18.x -= var5; // L: 5623
				var18.y -= var6; // L: 5624
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5625
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5628
				Client.destinationX -= var5; // L: 5629
				Client.destinationY -= var6; // L: 5630
			}

			Client.soundEffectCount = 0; // L: 5632
			Client.isCameraLocked = false; // L: 5633
			class20.cameraX -= var5 << 7; // L: 5634
			WorldMapDecoration.cameraZ -= var6 << 7; // L: 5635
			HorizontalAlignment.oculusOrbFocalPointX -= var5 << 7; // L: 5636
			class280.oculusOrbFocalPointY -= var6 << 7; // L: 5637
			Client.field848 = -1; // L: 5638
			Client.graphicsObjects.clear(); // L: 5639
			Client.projectiles.clear(); // L: 5640

			for (var14 = 0; var14 < 4; ++var14) { // L: 5641
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5559 5642
}
