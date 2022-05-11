import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 207387843
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2136235279
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("m")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1373676035
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 216850049
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -982635953
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 583621725
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 171882853
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1199422479
	)
	int field1104;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -776738565
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -934008587
	)
	int field1106;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1928979701
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1892949157
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 738468853
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -73932831
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("h")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 98212949
	)
	@Export("team")
	int team;
	@ObfuscatedName("d")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2123212889
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1295799177
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ar")
	boolean field1095;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -634902129
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 375783777
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 20
		this.headIconPrayer = -1; // L: 21
		this.actions = new String[3]; // L: 23

		for (int var1 = 0; var1 < 3; ++var1) { // L: 26
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 29
		this.skillLevel = 0; // L: 30
		this.animationCycleStart = 0; // L: 32
		this.animationCycleEnd = 0; // L: 33
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1095 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "261913950"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) { // L: 66
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte(); // L: 70
				var4[var5] = var7 + (var6 << 8); // L: 71
				if (var5 == 0 && var4[0] == 65535) { // L: 72
					var3 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var4[var5] >= 512) { // L: 76
					var8 = FileSystem.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= DesktopPlatformInfoProvider.field4469[var6].length) { // L: 84
				var7 = 0;
			}

			var11[var6] = var7; // L: 85
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 87
		if (super.idleSequence == 65535) { // L: 88
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 89
		if (super.turnLeftSequence == 65535) { // L: 90
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 91
		super.walkSequence = var1.readUnsignedShort(); // L: 92
		if (super.walkSequence == 65535) { // L: 93
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 94
		if (super.walkBackSequence == 65535) { // L: 95
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 96
		if (super.walkLeftSequence == 65535) { // L: 97
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 98
		if (super.walkRightSequence == 65535) { // L: 99
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 100
		if (super.runSequence == 65535) { // L: 101
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class391.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2114(); // L: 105
		if (this == ModelData0.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class168[] var12 = null; // L: 111
		boolean var13 = false; // L: 112
		var8 = var1.readUnsignedShort(); // L: 113
		var13 = (var8 >> 15 & 1) == 1; // L: 114
		int var9;
		if (var8 > 0 && var8 != 32768) { // L: 115
			var12 = new class168[12]; // L: 116

			for (var9 = 0; var9 < 12; ++var9) { // L: 117
				int var10 = var8 >> 12 - var9 & 1; // L: 118
				if (var10 == 1) { // L: 119
					var12[var9] = class127.method2807(var4[var9] - 512, var1); // L: 120
				}
			}
		}

		if (var1.offset < var1.array.length) { // L: 124
			for (var9 = 0; var9 < 3; ++var9) { // L: 125
				this.actions[var9] = var1.readStringCp1252NullTerminated(); // L: 126
			}
		}

		if (this.appearance == null) { // L: 129
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5395(var4, var12, var13, var11, var2 == 1, var3); // L: 130
	} // L: 131

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-238822980"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 194
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class114.SequenceDefinition_get(super.sequence) : null; // L: 195
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.idleSequence != super.movementSequence || var1 == null) ? class114.SequenceDefinition_get(super.movementSequence) : null; // L: 196
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 197
			if (var3 == null) { // L: 198
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 199
				super.defaultHeight = var3.height; // L: 200
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 201
					var4 = class136.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 202
					if (var4 != null) { // L: 203
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 204
						var5 = new Model[]{var3, var4}; // L: 205
						var3 = new Model(var5, 2); // L: 206
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 209
					if (Client.cycle >= this.animationCycleEnd) { // L: 210
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 211
						var4 = this.model0; // L: 212
						var4.offsetBy(this.field1104 - super.x, this.tileHeight2 - this.tileHeight, this.field1106 - super.y); // L: 213
						if (super.orientation == 512) { // L: 214
							var4.rotateY90Ccw(); // L: 215
							var4.rotateY90Ccw(); // L: 216
							var4.rotateY90Ccw(); // L: 217
						} else if (super.orientation == 1024) { // L: 219
							var4.rotateY90Ccw(); // L: 220
							var4.rotateY90Ccw(); // L: 221
						} else if (super.orientation == 1536) { // L: 223
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 224
						var3 = new Model(var5, 2); // L: 225
						if (super.orientation == 512) { // L: 226
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 227
							var4.rotateY90Ccw(); // L: 228
							var4.rotateY90Ccw(); // L: 229
						} else if (super.orientation == 1536) { // L: 231
							var4.rotateY90Ccw(); // L: 232
							var4.rotateY90Ccw(); // L: 233
							var4.rotateY90Ccw(); // L: 234
						}

						var4.offsetBy(super.x - this.field1104, this.tileHeight - this.tileHeight2, super.y - this.field1106); // L: 236
					}
				}

				var3.isSingleTile = true; // L: 239
				if (super.field1140 != 0 && Client.cycle >= super.field1196 && Client.cycle < super.field1197) { // L: 240
					var3.overrideHue = super.field1143; // L: 241
					var3.overrideSaturation = super.field1199; // L: 242
					var3.overrideLuminance = super.field1153; // L: 243
					var3.overrideAmount = super.field1140; // L: 244
				} else {
					var3.overrideAmount = 0; // L: 247
				}

				return var3; // L: 249
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1628986356"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 134
			this.checkIsFriend(); // L: 135
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 137
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 141
	} // L: 142

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1844788103"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = BufferedSource.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 145
	} // L: 146

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1086408777"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 149
			this.updateIsInFriendsChat(); // L: 150
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 152
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 156
	} // L: 157

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "199387675"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = PcmPlayer.friendsChat != null && PcmPlayer.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 160
	} // L: 161

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1914658106"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 164
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2884(this.username.getName()) != -1 && var1 != 2) { // L: 165 166
				this.isInClanChat = TriBool.TriBool_true; // L: 167
				return; // L: 168
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 172
	} // L: 173

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1431876622"
	)
	void method2114() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 176
	} // L: 177

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1920996538"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 180
			this.updateIsInClanChat(); // L: 181
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 183
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1044591641"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? WorldMapSectionType.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 187 188 190
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILgd;I)V",
		garbageValue = "1708455011"
	)
	final void method2117(int var1, int var2, class193 var3) {
		if (super.sequence != -1 && class114.SequenceDefinition_get(super.sequence).field2206 == 1) { // L: 253
			super.sequence = -1;
		}

		super.field1172 = -1; // L: 254
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 255
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 256
				if (var3 == class193.field2248) {
					UrlRequester.method2540(this, var1, var2, class193.field2248); // L: 258
				}

				this.method2119(var1, var2, var3); // L: 259
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 261

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2013717198"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 264
		super.field1200 = 0; // L: 265
		super.field1194 = 0; // L: 266
		super.pathX[0] = var1; // L: 267
		super.pathY[0] = var2; // L: 268
		int var3 = this.transformedSize(); // L: 269
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 270
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 271
	} // L: 272

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILgd;I)V",
		garbageValue = "4079166"
	)
	final void method2119(int var1, int var2, class193 var3) {
		if (super.pathLength < 9) { // L: 275
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 276
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 277
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 278
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 279
		}

		super.pathX[0] = var1; // L: 281
		super.pathY[0] = var2; // L: 282
		super.pathTraversed[0] = var3; // L: 283
	} // L: 284

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 287
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpc;B)V",
		garbageValue = "0"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = ModelData0.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - SecureRandomCallable.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - GrandExchangeOfferOwnWorldComparator.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class128.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1307[var1] != null) { // L: 50
			var2.read(Players.field1307[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1301[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1301[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcs;",
		garbageValue = "-1603535940"
	)
	static class82[] method2159() {
		return new class82[]{class82.field1078, class82.field1073, class82.field1076, class82.field1075, class82.field1079}; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-86"
	)
	static int method2157(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1031
			var0 -= 1000; // L: 1032
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1033
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1035
		}

		String var4 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1036
		int[] var5 = null; // L: 1037
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1038
			int var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1039
			if (var6 > 0) { // L: 1040
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]) { // L: 1041 1042
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1044
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1046

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1047
			if (var4.charAt(var7 - 1) == 's') { // L: 1048
				var8[var7] = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1049
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1051
		if (var7 != -1) { // L: 1052
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1053
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1055
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1056
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1057
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1058
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1059
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1060
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1061
			var3.onVarTransmit = var8; // L: 1062
			var3.varTransmitTriggers = var5; // L: 1063
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1065
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1066
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1067
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1068
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1069
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1070
			var3.onInvTransmit = var8; // L: 1071
			var3.invTransmitTriggers = var5; // L: 1072
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1074
			var3.onStatTransmit = var8; // L: 1075
			var3.statTransmitTriggers = var5; // L: 1076
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1078
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1079
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1080
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1081
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1082
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1083
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1084
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1085
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1086
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1087
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1088
			var3.field3520 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1089
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1090
			var3.field3513 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1091
			var3.field3456 = var8;
		} else if (var0 == 1430) { // L: 1092
			var3.field3443 = var8;
		} else if (var0 == 1431) { // L: 1093
			var3.field3510 = var8;
		} else {
			if (var0 != 1434) { // L: 1094
				return 2; // L: 1095
			}

			var3.field3460 = var8;
		}

		var3.hasListener = true; // L: 1096
		return 1; // L: 1097
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2538543"
	)
	static void method2135() {
		if (ClientPreferences.loadWorlds()) { // L: 1949
			Login.worldSelectOpen = true; // L: 1950
			Login.worldSelectPage = 0; // L: 1951
			Login.worldSelectPagesCount = 0; // L: 1952
		}

	} // L: 1954
}
