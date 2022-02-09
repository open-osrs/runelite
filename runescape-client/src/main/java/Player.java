import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1229040637
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 378877663
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1196180537
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2144897369
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1790396467
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 5972609
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -451757955
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1679747591
	)
	int field1075;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1673748563
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1458594827
	)
	int field1077;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -64519035
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1116523143
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 145100775
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 894137499
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("j")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1965287033
	)
	@Export("team")
	int team;
	@ObfuscatedName("g")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 56842439
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1237565359
	)
	@Export("index")
	int index;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("af")
	boolean field1067;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2024062865
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1738196589
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
		this.field1067 = false; // L: 50
	} // L: 54

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1567808519"
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
					var8 = Client.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class1.field8[var6].length) { // L: 84
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), VarcInt.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2105(); // L: 105
		if (this == WorldMapSprite.localPlayer) { // L: 106
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
						var12[var9] = PcmPlayer.method744(var4[var9] - 512, var1); // L: 121
					}
				}
			}
		}

		if (this.appearance == null) { // L: 126
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5361(var4, var12, var13, var11, var2 == 1, var3); // L: 127
	} // L: 128

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "39"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 189
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class78.SequenceDefinition_get(super.sequence) : null; // L: 190
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class78.SequenceDefinition_get(super.movementSequence); // L: 191
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 192
			if (var3 == null) { // L: 193
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 194
				super.defaultHeight = var3.height; // L: 195
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 196
					var4 = Widget.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 197
					if (var4 != null) { // L: 198
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 199
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
						var4.offsetBy(this.field1075 - super.x, this.tileHeight2 - this.tileHeight, this.field1077 - super.y); // L: 208
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

						var4.offsetBy(super.x - this.field1075, this.tileHeight - this.tileHeight2, super.y - this.field1077); // L: 231
					}
				}

				var3.isSingleTile = true; // L: 234
				if (super.field1167 != 0 && Client.cycle >= super.field1162 && Client.cycle < super.field1163) { // L: 235
					var3.overrideHue = super.field1164; // L: 236
					var3.overrideSaturation = super.field1155; // L: 237
					var3.overrideLuminance = super.field1166; // L: 238
					var3.overrideAmount = super.field1167; // L: 239
				} else {
					var3.overrideAmount = 0; // L: 242
				}

				return var3; // L: 244
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-716281640"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 131
			this.checkIsFriend(); // L: 132
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 134
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2053260559"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 138
	} // L: 139

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179876428"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ClanSettings.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 142
	} // L: 143

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1426624736"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 146
			this.updateIsInFriendsChat(); // L: 147
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1638628990"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class67.friendsChat != null && class67.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1606395580"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) { // L: 161
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2848(this.username.getName()) != -1) { // L: 162
				this.isInClanChat = TriBool.TriBool_true; // L: 163
				return; // L: 164
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 167
	} // L: 168

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "162856621"
	)
	void method2105() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 171
	} // L: 172

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1292882175"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 175
			this.updateIsInClanChat(); // L: 176
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 178
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator10.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 182 183 185
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILgl;I)V",
		garbageValue = "-726114570"
	)
	final void method2122(int var1, int var2, class185 var3) {
		if (super.sequence != -1 && class78.SequenceDefinition_get(super.sequence).field2099 == 1) { // L: 248
			super.sequence = -1;
		}

		super.field1138 = -1; // L: 249
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 250
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 251
				if (var3 == class185.field2132) {
					class125.method2742(this, var1, var2, class185.field2132); // L: 253
				}

				this.method2116(var1, var2, var3); // L: 254
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 256

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-80"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 259
		super.field1176 = 0; // L: 260
		super.field1175 = 0; // L: 261
		super.pathX[0] = var1; // L: 262
		super.pathY[0] = var2; // L: 263
		int var3 = this.transformedSize(); // L: 264
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 265
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 266
	} // L: 267

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILgl;B)V",
		garbageValue = "-51"
	)
	final void method2116(int var1, int var2, class185 var3) {
		if (super.pathLength < 9) { // L: 270
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 271
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 272
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 273
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 274
		}

		super.pathX[0] = var1; // L: 276
		super.pathY[0] = var2; // L: 277
		super.pathTraversed[0] = var3; // L: 278
	} // L: 279

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1570210948"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 282
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-103"
	)
	static void method2159(int var0) {
		if (var0 != Login.loginIndex) { // L: 2030
			Login.loginIndex = var0; // L: 2031
		}
	} // L: 2032

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "([Ljz;II)V",
		garbageValue = "-1598355358"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11476
			Widget var3 = var0[var2]; // L: 11477
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class260.isComponentHidden(var3))) { // L: 11478 11479 11480
				int var5;
				if (var3.type == 0) { // L: 11481
					if (!var3.isIf3 && class260.isComponentHidden(var3) && var3 != class242.mousedOverWidgetIf1) { // L: 11482
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11483
					if (var3.children != null) { // L: 11484
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11485
					if (var4 != null) { // L: 11486
						var5 = var4.group; // L: 11487
						if (class13.loadInterface(var5)) { // L: 11489
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1); // L: 11490
						}
					}
				}

				if (var3.type == 6) { // L: 11494
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11495
						boolean var7 = SceneTilePaint.runCs1(var3); // L: 11496
						if (var7) { // L: 11498
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11499
						}

						if (var5 != -1) { // L: 11500
							SequenceDefinition var6 = class78.SequenceDefinition_get(var5); // L: 11501

							for (var3.modelFrameCycle += Client.field566; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class112.invalidateWidget(var3)) { // L: 11502 11503 11510
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11504
								++var3.modelFrame; // L: 11505
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11506
									var3.modelFrame -= var6.frameCount; // L: 11507
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11508
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3320 != 0 && !var3.isIf3) { // L: 11514
						int var8 = var3.field3320 >> 16; // L: 11515
						var5 = var3.field3320 << 16 >> 16; // L: 11516
						var8 *= Client.field566; // L: 11517
						var5 *= Client.field566; // L: 11518
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11519
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11520
						class112.invalidateWidget(var3); // L: 11521
					}
				}
			}
		}

	} // L: 11525
}
