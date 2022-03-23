import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -200468809
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -360256483
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("n")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -686455869
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -387721833
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1136876601
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1542135077
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1164612895
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -559631655
	)
	int field1084;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1275397879
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 383945299
	)
	int field1095;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1705642801
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1662300579
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1765502875
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1355026989
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("m")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -428995767
	)
	@Export("team")
	int team;
	@ObfuscatedName("y")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1050389241
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -422585593
	)
	@Export("index")
	int index;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ax")
	boolean field1109;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 300036197
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1550758311
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
		this.field1109 = false; // L: 50
	} // L: 54

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "57802936"
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
					var8 = class67.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class20.field102[var6].length) { // L: 84
				var7 = 0;
			}

			var24[var6] = var7; // L: 85
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class83.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2143(); // L: 105
		if (this == class19.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class168[] var25 = null; // L: 111
		boolean var26 = false; // L: 112
		if (var1.offset < var1.array.length) { // L: 113
			var8 = var1.readUnsignedShort(); // L: 114
			var26 = (var8 >> 15 & 1) == 1; // L: 115
			if (var8 > 0 && var8 != 32768) { // L: 116
				var25 = new class168[12]; // L: 117

				for (int var9 = 0; var9 < 12; ++var9) { // L: 118
					int var10 = var8 >> 12 - var9 & 1; // L: 119
					if (var10 == 1) { // L: 120
						int var14 = var4[var9] - 512; // L: 124
						int var15 = var1.readUnsignedByte(); // L: 126
						boolean var16 = (var15 & 1) != 0; // L: 127
						boolean var17 = (var15 & 2) != 0; // L: 128
						class168 var18 = new class168(var14); // L: 129
						int var19;
						int[] var20;
						boolean var21;
						int var22;
						short var23;
						if (var16) { // L: 130
							var19 = var1.readUnsignedByte(); // L: 131
							var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 132 133 134
							var21 = var18.field1804 != null && var20.length == var18.field1804.length; // L: 135

							for (var22 = 0; var22 < 2; ++var22) { // L: 136
								if (var20[var22] != 15) { // L: 137
									var23 = (short)var1.readUnsignedShort(); // L: 138
									if (var21) { // L: 139
										var18.field1804[var20[var22]] = var23; // L: 140
									}
								}
							}
						}

						if (var17) { // L: 145
							var19 = var1.readUnsignedByte(); // L: 146
							var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 147 148 149
							var21 = var18.field1805 != null && var20.length == var18.field1805.length; // L: 150

							for (var22 = 0; var22 < 2; ++var22) { // L: 151
								if (var20[var22] != 15) { // L: 152
									var23 = (short)var1.readUnsignedShort(); // L: 153
									if (var21) { // L: 154
										var18.field1805[var20[var22]] = var23; // L: 155
									}
								}
							}
						}

						var25[var9] = var18; // L: 162
					}
				}
			}
		}

		if (this.appearance == null) { // L: 167
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5604(var4, var25, var26, var24, var2 == 1, var3); // L: 168
	} // L: 169

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 232
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null; // L: 233
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : ItemContainer.SequenceDefinition_get(super.movementSequence); // L: 234
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 235
			if (var3 == null) { // L: 236
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 237
				super.defaultHeight = var3.height; // L: 238
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 239
					var4 = class6.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 240
					if (var4 != null) { // L: 241
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 242
						var5 = new Model[]{var3, var4}; // L: 243
						var3 = new Model(var5, 2); // L: 244
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 247
					if (Client.cycle >= this.animationCycleEnd) { // L: 248
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 249
						var4 = this.model0; // L: 250
						var4.offsetBy(this.field1084 - super.x, this.tileHeight2 - this.tileHeight, this.field1095 - super.y); // L: 251
						if (super.orientation == 512) { // L: 252
							var4.rotateY90Ccw(); // L: 253
							var4.rotateY90Ccw(); // L: 254
							var4.rotateY90Ccw(); // L: 255
						} else if (super.orientation == 1024) { // L: 257
							var4.rotateY90Ccw(); // L: 258
							var4.rotateY90Ccw(); // L: 259
						} else if (super.orientation == 1536) { // L: 261
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 262
						var3 = new Model(var5, 2); // L: 263
						if (super.orientation == 512) { // L: 264
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 265
							var4.rotateY90Ccw(); // L: 266
							var4.rotateY90Ccw(); // L: 267
						} else if (super.orientation == 1536) { // L: 269
							var4.rotateY90Ccw(); // L: 270
							var4.rotateY90Ccw(); // L: 271
							var4.rotateY90Ccw(); // L: 272
						}

						var4.offsetBy(super.x - this.field1084, this.tileHeight - this.tileHeight2, super.y - this.field1095); // L: 274
					}
				}

				var3.isSingleTile = true; // L: 277
				if (super.field1189 != 0 && Client.cycle >= super.field1133 && Client.cycle < super.field1185) { // L: 278
					var3.overrideHue = super.field1146; // L: 279
					var3.overrideSaturation = super.field1187; // L: 280
					var3.overrideLuminance = super.field1188; // L: 281
					var3.overrideAmount = super.field1189; // L: 282
				} else {
					var3.overrideAmount = 0; // L: 285
				}

				return var3; // L: 287
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1604625207"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 172
			this.checkIsFriend(); // L: 173
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 175
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 179
	} // L: 180

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "849201143"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class155.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 183
	} // L: 184

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1692885288"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 187
			this.updateIsInFriendsChat(); // L: 188
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 190
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2145347544"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 194
	} // L: 195

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1562539797"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class230.friendsChat != null && class230.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 198
	} // L: 199

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "947633407"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 3; ++var1) { // L: 202
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2979(this.username.getName()) != -1 && var1 != 2) { // L: 203 204
				this.isInClanChat = TriBool.TriBool_true; // L: 205
				return; // L: 206
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 210
	} // L: 211

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1330730743"
	)
	void method2143() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 214
	} // L: 215

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1825758047"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 218
			this.updateIsInClanChat(); // L: 219
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 221
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1904316565"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class9.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 225 226 228
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILgv;I)V",
		garbageValue = "-2026849446"
	)
	final void method2144(int var1, int var2, class193 var3) {
		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2171 == 1) { // L: 291
			super.sequence = -1;
		}

		super.field1160 = -1; // L: 292
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 293
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 294
				if (var3 == class193.field2191) {
					GraphicsObject.method1860(this, var1, var2, class193.field2191); // L: 296
				}

				this.method2149(var1, var2, var3); // L: 297
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 299

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-330540951"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 302
		super.field1134 = 0; // L: 303
		super.field1197 = 0; // L: 304
		super.pathX[0] = var1; // L: 305
		super.pathY[0] = var2; // L: 306
		int var3 = this.transformedSize(); // L: 307
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 308
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 309
	} // L: 310

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILgv;B)V",
		garbageValue = "-40"
	)
	final void method2149(int var1, int var2, class193 var3) {
		if (super.pathLength < 9) { // L: 313
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 314
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 315
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 316
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 317
		}

		super.pathX[0] = var1; // L: 319
		super.pathY[0] = var2; // L: 320
		super.pathTraversed[0] = var3; // L: 321
	} // L: 322

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-450224469"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 325
	}
}
