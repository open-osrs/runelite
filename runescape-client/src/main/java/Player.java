import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 130763941
	)
	static int field674;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("appearance")
	PlayerAppearance appearance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -135527215
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 290512353
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("q")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -953649939
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1936137135
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1383715643
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1872616351
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 176416391
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1206566317
	)
	int field654;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 72603633
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1944024049
	)
	int field656;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1268773483
	)
	int field646;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1951672955
	)
	int field669;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1924513749
	)
	int field660;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1046092383
	)
	int field661;
	@ObfuscatedName("w")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1668602233
	)
	@Export("team")
	int team;
	@ObfuscatedName("d")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2138277467
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1613823593
	)
	@Export("index")
	int index;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ab")
	boolean field664;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1561517337
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 844316393
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1; // L: 19
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false; // L: 40
		this.team = 0; // L: 41
		this.isHidden = false; // L: 42
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 45
		this.isInClanChat = TriBool.TriBool_unknown; // L: 46
		this.field664 = false; // L: 47
	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1251055038"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 54
		int var2 = var1.readUnsignedByte(); // L: 55
		this.headIconPk = var1.readByte(); // L: 56
		this.headIconPrayer = var1.readByte(); // L: 57
		int var3 = -1; // L: 58
		this.team = 0; // L: 59
		int[] var4 = new int[12]; // L: 60

		int var6;
		int var7;
		for (int var5 = 0; var5 < 12; ++var5) { // L: 61
			var6 = var1.readUnsignedByte(); // L: 62
			if (var6 == 0) { // L: 63
				var4[var5] = 0; // L: 64
			} else {
				var7 = var1.readUnsignedByte(); // L: 67
				var4[var5] = var7 + (var6 << 8); // L: 68
				if (var5 == 0 && var4[0] == 65535) { // L: 69
					var3 = var1.readUnsignedShort(); // L: 70
					break;
				}

				if (var4[var5] >= 512) { // L: 73
					int var8 = AbstractWorldMapData.ItemDefinition_get(var4[var5] - 512).team; // L: 74
					if (var8 != 0) { // L: 75
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5]; // L: 78

		for (var6 = 0; var6 < 5; ++var6) { // L: 79
			var7 = var1.readUnsignedByte(); // L: 80
			if (var7 < 0 || var7 >= MouseRecorder.field628[var6].length) { // L: 81
				var7 = 0;
			}

			var9[var6] = var7; // L: 82
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 84
		if (super.idleSequence == 65535) { // L: 85
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 86
		if (super.turnLeftSequence == 65535) { // L: 87
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 88
		super.walkSequence = var1.readUnsignedShort(); // L: 89
		if (super.walkSequence == 65535) { // L: 90
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 91
		if (super.walkBackSequence == 65535) { // L: 92
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 93
		if (super.walkLeftSequence == 65535) { // L: 94
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 95
		if (super.walkRightSequence == 65535) { // L: 96
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 97
		if (super.runSequence == 65535) { // L: 98
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), UserComparator4.loginType); // L: 99
		this.clearIsFriend(); // L: 100
		this.clearIsInClanChat(); // L: 101
		if (this == PlayerType.localPlayer) { // L: 102
			class217.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 103
		this.skillLevel = var1.readUnsignedShort(); // L: 104
		this.isHidden = var1.readUnsignedByte() == 1; // L: 105
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 106
			this.isHidden = false;
		}

		if (this.appearance == null) { // L: 107
			this.appearance = new PlayerAppearance();
		}

		this.appearance.update(var4, var9, var2 == 1, var3); // L: 108
	} // L: 109

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "9"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 112
			this.checkIsFriend(); // L: 113
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 115
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1585923406"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 119
	} // L: 120

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1534173505"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = WorldMapLabelSize.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 123
	} // L: 124

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 127
			this.updateIsInClanChat(); // L: 128
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 130
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1010398193"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 134
	} // L: 135

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596026564"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = DevicePcmPlayerProvider.clanChat != null && DevicePcmPlayerProvider.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 138
	} // L: 139

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "255897896"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Clock.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 142 143 145
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 149
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class105.SequenceDefinition_get(super.sequence) : null; // L: 150
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class105.SequenceDefinition_get(super.movementSequence); // L: 151
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 152
			if (var3 == null) { // L: 153
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 154
				super.defaultHeight = var3.height; // L: 155
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 156
					var4 = HealthBarUpdate.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 157
					if (var4 != null) { // L: 158
						var4.offsetBy(0, -super.field1016, 0); // L: 159
						var5 = new Model[]{var3, var4}; // L: 160
						var3 = new Model(var5, 2); // L: 161
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 164
					if (Client.cycle >= this.animationCycleEnd) { // L: 165
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 166
						var4 = this.model0; // L: 167
						var4.offsetBy(this.field654 - super.x, this.tileHeight2 - this.tileHeight, this.field656 - super.y); // L: 168
						if (super.orientation == 512) { // L: 169
							var4.rotateY90Ccw(); // L: 170
							var4.rotateY90Ccw(); // L: 171
							var4.rotateY90Ccw(); // L: 172
						} else if (super.orientation == 1024) { // L: 174
							var4.rotateY90Ccw(); // L: 175
							var4.rotateY90Ccw(); // L: 176
						} else if (super.orientation == 1536) { // L: 178
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 179
						var3 = new Model(var5, 2); // L: 180
						if (super.orientation == 512) { // L: 181
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 182
							var4.rotateY90Ccw(); // L: 183
							var4.rotateY90Ccw(); // L: 184
						} else if (super.orientation == 1536) { // L: 186
							var4.rotateY90Ccw(); // L: 187
							var4.rotateY90Ccw(); // L: 188
							var4.rotateY90Ccw(); // L: 189
						}

						var4.offsetBy(super.x - this.field654, this.tileHeight - this.tileHeight2, super.y - this.field656); // L: 191
					}
				}

				var3.isSingleTile = true; // L: 194
				return var3; // L: 195
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-645272281"
	)
	final void method1335(int var1, int var2, byte var3) {
		if (super.sequence != -1 && class105.SequenceDefinition_get(super.sequence).field3550 == 1) { // L: 199
			super.sequence = -1;
		}

		super.field1003 = -1; // L: 200
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 201
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 202
				if (var3 == 2) { // L: 204
					class281.method5133(this, var1, var2, (byte)2);
				}

				this.method1337(var1, var2, var3); // L: 205
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 207

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1359568653"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 210
		super.field1034 = 0; // L: 211
		super.field978 = 0; // L: 212
		super.pathX[0] = var1; // L: 213
		super.pathY[0] = var2; // L: 214
		int var3 = this.transformedSize(); // L: 215
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 216
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 217
	} // L: 218

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1011126819"
	)
	final void method1337(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 221
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 222
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 223
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 224
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 225
		}

		super.pathX[0] = var1; // L: 227
		super.pathY[0] = var2; // L: 228
		super.pathTraversed[0] = var3; // L: 229
	} // L: 230

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035007323"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 233
	}

	@ObfuscatedName("f")
	public static final int method1325(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var4 * var2; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = (var12 - var14) * 6.0D * var16 + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var14 + (var12 - var14) * 6.0D * var0;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = (var12 - var14) * 6.0D * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "122"
	)
	static int method1354(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 1861
			MilliClock.Interpreter_intStackSize -= 2; // L: 1862
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1863
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1864
			EnumDefinition var10 = Decimator.getEnum(var3); // L: 1865
			if (var10.outputType != 's') { // L: 1866
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 1867
				if (var9 == var10.keys[var6]) { // L: 1868
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 1869
					var10 = null; // L: 1870
					break;
				}
			}

			if (var10 != null) { // L: 1874
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 1875
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 1877
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 1903
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1904
				EnumDefinition var4 = Decimator.getEnum(var3); // L: 1905
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4.size(); // L: 1906
				return 1; // L: 1907
			} else {
				return 2; // L: 1909
			}
		} else {
			MilliClock.Interpreter_intStackSize -= 4; // L: 1878
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 1879
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 1880
			int var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 1881
			var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 1882
			EnumDefinition var7 = Decimator.getEnum(var5); // L: 1883
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 1884
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 1889
					if (var6 == var7.keys[var8]) { // L: 1890
						if (var9 == 115) { // L: 1891
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 1892
						}

						var7 = null; // L: 1893
						break;
					}
				}

				if (var7 != null) { // L: 1897
					if (var9 == 115) { // L: 1898
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 1899
					}
				}

				return 1; // L: 1901
			} else {
				if (var9 == 115) { // L: 1885
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 1886
				}

				return 1; // L: 1887
			}
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lbs;ZI)V",
		garbageValue = "-669963127"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11299
		int var3 = (int)var0.key; // L: 11300
		var0.remove(); // L: 11301
		if (var1) { // L: 11302
			class206.method3852(var2);
		}

		UserComparator2.method6067(var2); // L: 11303
		Widget var4 = UserComparator4.getWidget(var3); // L: 11304
		if (var4 != null) { // L: 11305
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4);
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 11307
			if (DynamicObject.method2362(Client.menuOpcodes[var5])) { // L: 11308
				if (var5 < Client.menuOptionsCount - 1) { // L: 11309
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) { // L: 11310
						Client.menuActions[var6] = Client.menuActions[var6 + 1]; // L: 11311
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1]; // L: 11312
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1]; // L: 11313
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1]; // L: 11314
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1]; // L: 11315
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1]; // L: 11316
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1]; // L: 11317
					}
				}

				--var5; // L: 11320
				--Client.menuOptionsCount; // L: 11321
			}
		}

		TileItemPile.method2908(); // L: 11324
		if (Client.rootInterface != -1) { // L: 11326
			WorldMapAreaData.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11327
}
