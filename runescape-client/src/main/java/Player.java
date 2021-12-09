import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -547248219
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1687298057
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("s")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 878255091
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -423854961
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1513601945
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1398284239
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -870222811
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1880432377
	)
	int field1056;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 624676029
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1704388603
	)
	int field1058;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1828058055
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -252077857
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1520865497
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 639738043
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("f")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 826351973
	)
	@Export("team")
	int team;
	@ObfuscatedName("q")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1303296439
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1488352927
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ao")
	boolean field1055;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -869781509
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1571518459
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
		this.isUnanimated = false; // L: 42
		this.team = 0; // L: 43
		this.isHidden = false; // L: 44
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 47
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 48
		this.isInClanChat = TriBool.TriBool_unknown; // L: 49
		this.field1055 = false; // L: 50
	} // L: 54

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1789639005"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		this.headIconPk = var1.readByte(); // L: 59
		this.headIconPrayer = var1.readByte(); // L: 60
		int var3 = -1; // L: 61
		this.team = 0; // L: 62
		int[] var4 = new int[12]; // L: 63

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) { // L: 64
			var6 = var1.readUnsignedByte(); // L: 65
			if (var6 == 0) { // L: 66
				var4[var5] = 0; // L: 67
			} else {
				var7 = var1.readUnsignedByte(); // L: 70
				var4[var5] = var7 + (var6 << 8); // L: 71
				if (var5 == 0 && var4[0] == 65535) { // L: 72
					var3 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var4[var5] >= 512) { // L: 76
					var8 = UserComparator6.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class114.field1382[var6].length) { // L: 84
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class194.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2186(); // L: 105
		if (this == class340.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class160[] var12 = null; // L: 111
		boolean var13 = false; // L: 112
		if (var1.offset < var1.array.length) { // L: 113
			var8 = var1.readUnsignedShort(); // L: 114
			var13 = (var8 >> 15 & 1) == 1; // L: 115
			if (var8 > 0 && var8 != 32768) { // L: 116
				var12 = new class160[12]; // L: 117

				for (int var9 = 0; var9 < 12; ++var9) { // L: 118
					int var10 = var8 >> 12 - var9 & 1; // L: 119
					if (var10 == 1) { // L: 120
						var12[var9] = ClanChannelMember.method2777(var4[var9] - 512, var1); // L: 121
					}
				}
			}
		}

		if (this.appearance == null) { // L: 126
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5368(var4, var12, var13, var11, var2 == 1, var3); // L: 127
	} // L: 128

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "202861607"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 189
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? UserComparator5.SequenceDefinition_get(super.sequence) : null; // L: 190
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : UserComparator5.SequenceDefinition_get(super.movementSequence); // L: 191
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 192
			if (var3 == null) { // L: 193
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 194
				super.defaultHeight = var3.height; // L: 195
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 196
					var4 = AccessFile.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 197
					if (var4 != null) { // L: 198
						var4.offsetBy(0, -super.field1131, 0); // L: 199
						var5 = new Model[]{var3, var4}; // L: 200
						var3 = new Model(var5, 2); // L: 201
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 204
					if (Client.cycle >= this.animationCycleEnd) { // L: 205
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 206
						var4 = this.model0; // L: 207
						var4.offsetBy(this.field1056 - super.x, this.tileHeight2 - this.tileHeight, this.field1058 - super.y); // L: 208
						if (super.orientation == 512) { // L: 209
							var4.rotateY90Ccw(); // L: 210
							var4.rotateY90Ccw(); // L: 211
							var4.rotateY90Ccw(); // L: 212
						} else if (super.orientation == 1024) { // L: 214
							var4.rotateY90Ccw(); // L: 215
							var4.rotateY90Ccw(); // L: 216
						} else if (super.orientation == 1536) { // L: 218
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 219
						var3 = new Model(var5, 2); // L: 220
						if (super.orientation == 512) { // L: 221
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 222
							var4.rotateY90Ccw(); // L: 223
							var4.rotateY90Ccw(); // L: 224
						} else if (super.orientation == 1536) { // L: 226
							var4.rotateY90Ccw(); // L: 227
							var4.rotateY90Ccw(); // L: 228
							var4.rotateY90Ccw(); // L: 229
						}

						var4.offsetBy(super.x - this.field1056, this.tileHeight - this.tileHeight2, super.y - this.field1058); // L: 231
					}
				}

				var3.isSingleTile = true; // L: 234
				if (super.field1146 != 0 && Client.cycle >= super.field1141 && Client.cycle < super.field1140) { // L: 235
					var3.field2494 = super.field1143; // L: 236
					var3.field2495 = super.field1144; // L: 237
					var3.field2479 = super.field1095; // L: 238
					var3.field2474 = super.field1146; // L: 239
				} else {
					var3.field2474 = 0; // L: 242
				}

				return var3; // L: 244
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-373800926"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 131
			this.checkIsFriend(); // L: 132
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 134
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 138
	} // L: 139

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1903452676"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = GameEngine.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 142
	} // L: 143

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 146
			this.updateIsInFriendsChat(); // L: 147
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1186540924"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = Players.friendsChat != null && Players.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1789868613"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) { // L: 161
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2881(this.username.getName()) != -1) { // L: 162
				this.isInClanChat = TriBool.TriBool_true; // L: 163
				return; // L: 164
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 167
	} // L: 168

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-782154637"
	)
	void method2186() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 171
	} // L: 172

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "98044476"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 175
			this.updateIsInClanChat(); // L: 176
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 178
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1145675774"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? WorldMapLabelSize.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 182 183 185
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILgj;I)V",
		garbageValue = "-1031926598"
	)
	final void method2175(int var1, int var2, class185 var3) {
		if (super.sequence != -1 && UserComparator5.SequenceDefinition_get(super.sequence).field2097 == 1) { // L: 248
			super.sequence = -1;
		}

		super.field1122 = -1; // L: 249
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 250
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 251
				if (var3 == class185.field2122) {
					Archive.method5586(this, var1, var2, class185.field2122); // L: 253
				}

				this.method2177(var1, var2, var3); // L: 254
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 256

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "625623334"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 259
		super.field1098 = 0; // L: 260
		super.field1117 = 0; // L: 261
		super.pathX[0] = var1; // L: 262
		super.pathY[0] = var2; // L: 263
		int var3 = this.transformedSize(); // L: 264
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 265
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 266
	} // L: 267

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILgj;I)V",
		garbageValue = "1075045053"
	)
	final void method2177(int var1, int var2, class185 var3) {
		if (super.pathLength < 9) { // L: 270
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 271
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 272
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 273
			super.field1153[var4] = super.field1153[var4 - 1]; // L: 274
		}

		super.pathX[0] = var1; // L: 276
		super.pathY[0] = var2; // L: 277
		super.field1153[0] = var3; // L: 278
	} // L: 279

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 282
	}
}
