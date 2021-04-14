import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1743715259
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	static Widget field1192;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -977719887
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -408127355
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("e")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1388157533
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1578238861
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1337282737
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1410786421
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1885617879
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -269548317
	)
	int field1175;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1894921585
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1189884347
	)
	int field1177;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 233121641
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -14411627
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -875595153
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 602004441
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1987166721
	)
	@Export("team")
	int team;
	@ObfuscatedName("i")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -500648257
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 797660319
	)
	@Export("index")
	int index;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ac")
	boolean field1189;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1160349387
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2033773215
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 18
		this.headIconPrayer = -1; // L: 19
		this.actions = new String[3]; // L: 21

		for (int var1 = 0; var1 < 3; ++var1) { // L: 24
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 27
		this.skillLevel = 0; // L: 28
		this.animationCycleStart = 0; // L: 30
		this.animationCycleEnd = 0; // L: 31
		this.isUnanimated = false; // L: 40
		this.team = 0; // L: 41
		this.isHidden = false; // L: 42
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 45
		this.isInClanChat = TriBool.TriBool_unknown; // L: 46
		this.field1189 = false; // L: 47
	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "20"
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
					int var8 = class23.ItemDefinition_get(var4[var5] - 512).team; // L: 74
					if (var8 != 0) { // L: 75
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5]; // L: 78

		for (var6 = 0; var6 < 5; ++var6) { // L: 79
			var7 = var1.readUnsignedByte(); // L: 80
			if (var7 < 0 || var7 >= ChatChannel.field1086[var6].length) { // L: 81
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), AbstractUserComparator.loginType); // L: 99
		this.clearIsFriend(); // L: 100
		this.clearIsInClanChat(); // L: 101
		if (this == Varcs.localPlayer) { // L: 102
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 103
		this.skillLevel = var1.readUnsignedShort(); // L: 104
		this.isHidden = var1.readUnsignedByte() == 1; // L: 105
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 106
			this.isHidden = false;
		}

		if (this.appearance == null) { // L: 107
			this.appearance = new PlayerComposition();
		}

		this.appearance.update(var4, var9, var2 == 1, var3); // L: 108
	} // L: 109

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 149
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class225.SequenceDefinition_get(super.sequence) : null; // L: 150
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class225.SequenceDefinition_get(super.movementSequence); // L: 151
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 152
			if (var3 == null) { // L: 153
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 154
				super.defaultHeight = var3.height; // L: 155
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 156
					var4 = Varps.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 157
					if (var4 != null) { // L: 158
						var4.offsetBy(0, -super.field1238, 0); // L: 159
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
						var4.offsetBy(this.field1175 - super.x, this.tileHeight2 - this.tileHeight, this.field1177 - super.y); // L: 168
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

						var4.offsetBy(super.x - this.field1175, this.tileHeight - this.tileHeight2, super.y - this.field1177); // L: 191
					}
				}

				var3.isSingleTile = true; // L: 194
				return var3; // L: 195
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-13206"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 112
			this.checkIsFriend(); // L: 113
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 115
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-799905621"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 119
	} // L: 120

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2126620163"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class13.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 123
	} // L: 124

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666089616"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 127
			this.updateIsInClanChat(); // L: 128
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 130
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1597100975"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 134
	} // L: 135

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-790736304"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = InterfaceParent.clanChat != null && InterfaceParent.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 138
	} // L: 139

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1864035459"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? GraphicsObject.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 142 143 145
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1419129901"
	)
	final void method2120(int var1, int var2, byte var3) {
		if (super.sequence != -1 && class225.SequenceDefinition_get(super.sequence).field3723 == 1) { // L: 199
			super.sequence = -1;
		}

		super.field1237 = -1; // L: 200
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 201
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 202
				if (var3 == 2) {
					DevicePcmPlayerProvider.method470(this, var1, var2, (byte)2); // L: 204
				}

				this.method2142(var1, var2, var3); // L: 205
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 207

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1191185889"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 210
		super.field1224 = 0; // L: 211
		super.field1267 = 0; // L: 212
		super.pathX[0] = var1; // L: 213
		super.pathY[0] = var2; // L: 214
		int var3 = this.transformedSize(); // L: 215
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 216
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 217
	} // L: 218

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1951772159"
	)
	final void method2142(int var1, int var2, byte var3) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 233
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-726167195"
	)
	static int method2140(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1189
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1190
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class223.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var3)); // L: 1191
			return 1; // L: 1192
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1194
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1201
				if (var3.dataText == null) { // L: 1202
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1203
				}

				return 1; // L: 1204
			} else {
				return 2; // L: 1206
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1195
			--var4; // L: 1196
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1197
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1198
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1199
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1281921833"
	)
	static final int method2148(int var0, int var1) {
		if (var0 == -2) { // L: 999
			return 12345678;
		} else if (var0 == -1) { // L: 1000
			if (var1 < 2) { // L: 1001
				var1 = 2;
			} else if (var1 > 126) { // L: 1002
				var1 = 126;
			}

			return var1; // L: 1003
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1005
			if (var1 < 2) { // L: 1006
				var1 = 2;
			} else if (var1 > 126) { // L: 1007
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1008
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-73"
	)
	static final boolean method2150(int var0) {
		if (var0 < 0) { // L: 7968
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 7969
			if (var1 >= 2000) { // L: 7970
				var1 -= 2000;
			}

			return var1 == 1007; // L: 7971
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcv;",
		garbageValue = "55"
	)
	static final InterfaceParent method2151(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11301
		var3.group = var1; // L: 11302
		var3.type = var2; // L: 11303
		Client.interfaceParents.put(var3, (long)var0); // L: 11304
		PlayerComposition.Widget_resetModelFrames(var1); // L: 11305
		Widget var4 = class139.getWidget(var0); // L: 11306
		class29.invalidateWidget(var4); // L: 11307
		if (Client.meslayerContinueWidget != null) { // L: 11308
			class29.invalidateWidget(Client.meslayerContinueWidget); // L: 11309
			Client.meslayerContinueWidget = null; // L: 11310
		}

		AbstractWorldMapIcon.method3186(); // L: 11312
		UserList.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11313
		AbstractSocket.runWidgetOnLoadListener(var1); // L: 11314
		if (Client.rootInterface != -1) { // L: 11315
			class379.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11316
	}
}
