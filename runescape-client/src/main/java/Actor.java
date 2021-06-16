import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1424519155
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 936237979
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 874219119
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ag")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1485342149
	)
	int field1225;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -509558101
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1206124803
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 202553539
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -133909051
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1178791293
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1446612939
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219850051
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 474611297
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1091145941
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ay")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("am")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aa")
	boolean field1253;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 158954669
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 217502675
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1564304399
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("af")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bq")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bx")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bi")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bz")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bb")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1033786515
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("be")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -340306785
	)
	int field1280;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -556285409
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -565094245
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1564505139
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -2104532797
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 115504749
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -460250755
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1967513789
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 971305057
	)
	int field1258;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1049041031
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1411850169
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1298560263
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 469123257
	)
	int field1262;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1144657861
	)
	int field1263;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1464146757
	)
	int field1264;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 610282849
	)
	int field1265;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 847021677
	)
	int field1268;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1338394283
	)
	int field1267;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 927939297
	)
	int field1276;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -406517487
	)
	int field1269;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1759311977
	)
	int field1270;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -429335855
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 191753551
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 2031424695
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1087482181
	)
	int field1274;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 731045615
	)
	int field1275;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1585830935
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cb")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cg")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1081774257
	)
	int field1242;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 815259821
	)
	int field1281;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1225 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1253 = false; // L: 26
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
		this.field1280 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1258 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1274 = 0; // L: 64
		this.field1275 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1242 = 0; // L: 70
		this.field1281 = 0; // L: 71
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136835932"
	)
	final void method2263() {
		this.pathLength = 0;
		this.field1281 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-22"
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
			HitSplatDefinition var12 = Decimator.method1171(var1); // L: 95
			var10 = var12.field1747; // L: 96
			var11 = var12.field1738; // L: 97
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

		if (var9 >= 0) { // L: 132
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2; // L: 134
			this.hitSplatTypes2[var9] = var3; // L: 135
			this.hitSplatValues2[var9] = var4; // L: 136
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 137
		}
	} // L: 138

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class287.method5260(var1); // L: 141
		HealthBar var8 = null; // L: 142
		HealthBar var9 = null; // L: 143
		int var10 = var7.int2; // L: 144
		int var11 = 0; // L: 145

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 146
			++var11; // L: 147
			if (var12.definition.field1602 == var7.field1602) { // L: 148
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1204819993"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class287.method5260(var1); // L: 167

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 168
			if (var2 == var3.definition) { // L: 169
				var3.remove(); // L: 170
				return; // L: 171
			}
		}

	} // L: 174

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZI)V",
		garbageValue = "1669535387"
	)
	public static void method2262(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = class262.getPreferencesFile("", class182.field2114.name, true); // L: 119
			Buffer var1 = class4.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	} // L: 130

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-81"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 121
		int var4 = 0; // L: 122

		for (int var5 = 0; var5 < var2; ++var5) { // L: 123
			int var6 = var0[var5 + var1] & 255; // L: 124
			if (var6 != 0) { // L: 125
				if (var6 >= 128 && var6 < 160) { // L: 126
					char var7 = class302.cp1252AsciiExtension[var6 - 128]; // L: 127
					if (var7 == 0) { // L: 128
						var7 = '?';
					}

					var6 = var7; // L: 129
				}

				var3[var4++] = (char)var6; // L: 131
			}
		}

		return new String(var3, 0, var4); // L: 133
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIII)V",
		garbageValue = "55903720"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class262.localPlayer != var0) { // L: 9282
			if (Client.menuOptionsCount < 400) { // L: 9283
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9285
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9286
					var7 = var0.combatLevel; // L: 9288
					int var8 = class262.localPlayer.combatLevel; // L: 9289
					int var9 = var8 - var7; // L: 9291
					String var6;
					if (var9 < -9) { // L: 9292
						var6 = SecureRandomFuture.colorStartTag(16711680); // L: 9293
					} else if (var9 < -6) { // L: 9296
						var6 = SecureRandomFuture.colorStartTag(16723968); // L: 9297
					} else if (var9 < -3) { // L: 9300
						var6 = SecureRandomFuture.colorStartTag(16740352); // L: 9301
					} else if (var9 < 0) { // L: 9304
						var6 = SecureRandomFuture.colorStartTag(16756736); // L: 9305
					} else if (var9 > 9) { // L: 9308
						var6 = SecureRandomFuture.colorStartTag(65280); // L: 9309
					} else if (var9 > 6) { // L: 9312
						var6 = SecureRandomFuture.colorStartTag(4259584); // L: 9313
					} else if (var9 > 3) { // L: 9316
						var6 = SecureRandomFuture.colorStartTag(8453888); // L: 9317
					} else if (var9 > 0) { // L: 9320
						var6 = SecureRandomFuture.colorStartTag(12648192); // L: 9321
					} else {
						var6 = SecureRandomFuture.colorStartTag(16776960); // L: 9324
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9326
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9328
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9329
					class22.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9330
				} else if (Client.isSpellSelected) { // L: 9333
					if ((LoginPacket.selectedSpellFlags & 8) == 8) { // L: 9334
						class22.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SecureRandomFuture.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9335
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9340
						if (Client.playerMenuActions[var10] != null) { // L: 9341
							short var11 = 0; // L: 9342
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9343
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 9344
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class262.localPlayer.combatLevel) { // L: 9345
									var11 = 2000; // L: 9346
								}

								if (class262.localPlayer.team != 0 && var0.team != 0) { // L: 9348
									if (var0.team == class262.localPlayer.team) { // L: 9349
										var11 = 2000;
									} else {
										var11 = 0; // L: 9350
									}
								} else if (var0.isClanMember()) { // L: 9352
									var11 = 2000; // L: 9353
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9356
								var11 = 2000;
							}

							boolean var12 = false; // L: 9357
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9358
							class22.insertMenuItemNoShift(Client.playerMenuActions[var10], SecureRandomFuture.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9359
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9364
					if (Client.menuOpcodes[var10] == 23) { // L: 9365
						Client.menuTargets[var10] = SecureRandomFuture.colorStartTag(16777215) + var4; // L: 9366
						break;
					}
				}

			}
		}
	} // L: 9370
}
