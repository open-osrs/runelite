import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1635688549
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 586041939
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -599736859
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 508020287
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1640401775
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -653734129
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 730739877
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -183413097
	)
	int field1185;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1745122201
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -385569285
	)
	int field1197;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2027010021
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1785758561
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 335782101
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -888481785
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("s")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 365768385
	)
	@Export("team")
	int team;
	@ObfuscatedName("c")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1650147117
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1840333455
	)
	@Export("index")
	int index;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ak")
	boolean field1201;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 5106261
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -769670651
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 19
		this.headIconPrayer = -1; // L: 20
		this.actions = new String[3]; // L: 22

		for (int var1 = 0; var1 < 3; ++var1) { // L: 25
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 28
		this.skillLevel = 0; // L: 29
		this.animationCycleStart = 0; // L: 31
		this.animationCycleEnd = 0; // L: 32
		this.isUnanimated = false; // L: 41
		this.team = 0; // L: 42
		this.isHidden = false; // L: 43
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 46
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 47
		this.isInClanChat = TriBool.TriBool_unknown; // L: 48
		this.field1201 = false; // L: 49
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1534249292"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 56
		int var2 = var1.readUnsignedByte(); // L: 57
		this.headIconPk = var1.readByte(); // L: 58
		this.headIconPrayer = var1.readByte(); // L: 59
		int var3 = -1; // L: 60
		this.team = 0; // L: 61
		int[] var4 = new int[12]; // L: 62

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) { // L: 63
			var6 = var1.readUnsignedByte(); // L: 64
			if (var6 == 0) { // L: 65
				var4[var5] = 0; // L: 66
			} else {
				var7 = var1.readUnsignedByte(); // L: 69
				var4[var5] = var7 + (var6 << 8); // L: 70
				if (var5 == 0 && var4[0] == 65535) { // L: 71
					var3 = var1.readUnsignedShort(); // L: 72
					break;
				}

				if (var4[var5] >= 512) { // L: 75
					var8 = class250.ItemDefinition_get(var4[var5] - 512).team; // L: 76
					if (var8 != 0) { // L: 77
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 80

		for (var6 = 0; var6 < 5; ++var6) { // L: 81
			var7 = var1.readUnsignedByte(); // L: 82
			if (var7 < 0 || var7 >= class69.field568[var6].length) { // L: 83
				var7 = 0;
			}

			var11[var6] = var7; // L: 84
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 86
		if (super.idleSequence == 65535) { // L: 87
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 88
		if (super.turnLeftSequence == 65535) { // L: 89
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 90
		super.walkSequence = var1.readUnsignedShort(); // L: 91
		if (super.walkSequence == 65535) { // L: 92
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 93
		if (super.walkBackSequence == 65535) { // L: 94
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 95
		if (super.walkLeftSequence == 65535) { // L: 96
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 97
		if (super.walkRightSequence == 65535) { // L: 98
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 99
		if (super.runSequence == 65535) { // L: 100
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), LoginScreenAnimation.loginType); // L: 101
		this.clearIsFriend(); // L: 102
		this.clearIsInFriendsChat(); // L: 103
		this.method2213(); // L: 104
		if (this == class262.localPlayer) { // L: 105
			Login.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 106
		this.skillLevel = var1.readUnsignedShort(); // L: 107
		this.isHidden = var1.readUnsignedByte() == 1; // L: 108
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 109
			this.isHidden = false;
		}

		class136[] var12 = null; // L: 110
		boolean var13 = false; // L: 111
		if (var1.offset < var1.array.length) { // L: 112
			var8 = var1.readUnsignedShort(); // L: 113
			var13 = (var8 >> 15 & 1) == 1; // L: 114
			if (var8 > 0 && var8 != 32768) { // L: 115
				var12 = new class136[12]; // L: 116

				for (int var9 = 0; var9 < 12; ++var9) { // L: 117
					int var10 = var8 >> 12 - var9 & 1; // L: 118
					if (var10 == 1) { // L: 119
						var12[var9] = MenuAction.method2027(var4[var9] - 512, var1); // L: 120
					}
				}
			}
		}

		if (this.appearance == null) { // L: 125
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4837(var4, var12, var13, var11, var2 == 1, var3); // L: 126
	} // L: 127

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 182
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapScaleHandler.SequenceDefinition_get(super.sequence) : null; // L: 183
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : WorldMapScaleHandler.SequenceDefinition_get(super.movementSequence); // L: 184
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 185
			if (var3 == null) { // L: 186
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 187
				super.defaultHeight = var3.height; // L: 188
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 189
					var4 = Tiles.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 190
					if (var4 != null) { // L: 191
						var4.offsetBy(0, -super.field1263, 0); // L: 192
						var5 = new Model[]{var3, var4}; // L: 193
						var3 = new Model(var5, 2); // L: 194
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 197
					if (Client.cycle >= this.animationCycleEnd) { // L: 198
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 199
						var4 = this.model0; // L: 200
						var4.offsetBy(this.field1185 - super.x, this.tileHeight2 - this.tileHeight, this.field1197 - super.y); // L: 201
						if (super.orientation == 512) { // L: 202
							var4.rotateY90Ccw(); // L: 203
							var4.rotateY90Ccw(); // L: 204
							var4.rotateY90Ccw(); // L: 205
						} else if (super.orientation == 1024) { // L: 207
							var4.rotateY90Ccw(); // L: 208
							var4.rotateY90Ccw(); // L: 209
						} else if (super.orientation == 1536) { // L: 211
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 215
							var4.rotateY90Ccw(); // L: 216
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) { // L: 219
							var4.rotateY90Ccw(); // L: 220
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field1185, this.tileHeight - this.tileHeight2, super.y - this.field1197); // L: 224
					}
				}

				var3.isSingleTile = true;
				return var3; // L: 228
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1441448466"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 130
			this.checkIsFriend(); // L: 131
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 133
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-183277896"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 137
	} // L: 138

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1895738612"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = DevicePcmPlayerProvider.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 141
	} // L: 142

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "4663"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 145
			this.updateIsInFriendsChat(); // L: 146
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 148
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-956688368"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 152
	} // L: 153

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656967848"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class289.friendsChat != null && class289.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 156
	} // L: 157

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1811167187"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Client.currentClanSettings[0] != null && Client.currentClanSettings[0].method196(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 160
	} // L: 161

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1587575970"
	)
	void method2213() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 164
	} // L: 165

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1972087508"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 168
			this.updateIsInClanChat(); // L: 169
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 171
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-254306857"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class248.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 175 176 178
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-977769569"
	)
	final void method2217(int var1, int var2, byte var3) {
		if (super.sequence != -1 && WorldMapScaleHandler.SequenceDefinition_get(super.sequence).field1893 == 1) { // L: 232
			super.sequence = -1;
		}

		super.field1280 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) { // L: 237
					Player var4 = this;
					int var5 = super.pathX[0]; // L: 240
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 244
						int var9 = this.transformedSize();
						Client.field733.approxDestinationX = var1;
						Client.field733.approxDestinationY = var2;
						Client.field733.approxDestinationSizeX = 1;
						Client.field733.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field733;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field739;
						int[] var14 = Client.field631;
						int var15 = 0;

						label412:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var20;
								int var21;
								int var22;
								int var24;
								int var26;
								int var27;
								int var28;
								boolean var35;
								int var37;
								int var38;
								int var40;
								if (var9 == 1) { // L: 267
									var35 = class126.method2595(var5, var6, var10, var12);
								} else if (var9 == 2) {
									var17 = var5;
									var18 = var6;
									byte var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20; // L: 276
									class160.directions[var19][var20] = 99;
									class160.distances[var19][var20] = 0;
									byte var23 = 0;
									var24 = 0; // L: 280
									class160.bufferX[var23] = var5; // L: 281
									var40 = var23 + 1;
									class160.bufferY[var23] = var6; // L: 282
									int[][] var25 = var12.flags; // L: 283

									boolean var36;
									while (true) {
										if (var24 == var40) {
											Login.field1033 = var17;
											GrandExchangeOfferOwnWorldComparator.field608 = var18;
											var36 = false;
											break;
										}

										var17 = class160.bufferX[var24];
										var18 = class160.bufferY[var24]; // L: 286
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21; // L: 288
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(2, var17, var18, var12)) {
											Login.field1033 = var17;
											GrandExchangeOfferOwnWorldComparator.field608 = var18;
											var36 = true; // L: 295
											break;
										}

										var28 = class160.distances[var37][var38] + 1;
										if (var37 > 0 && class160.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) {
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095; // L: 305
											class160.directions[var37 - 1][var38] = 2;
											class160.distances[var37 - 1][var38] = var28; // L: 307
										}

										if (var37 < 126 && class160.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) { // L: 312
											class160.bufferX[var40] = var17 + 1;
											class160.bufferY[var40] = var18; // L: 314
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38] = 8;
											class160.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class160.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) { // L: 319 321
											class160.bufferX[var40] = var17;
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37][var38 - 1] = 1; // L: 326
											class160.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 126 && class160.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) { // L: 332
											class160.bufferX[var40] = var17;
											class160.bufferY[var40] = var18 + 1; // L: 334
											var40 = var40 + 1 & 4095;
											class160.directions[var37][var38 + 1] = 4;
											class160.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class160.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) { // L: 343
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095; // L: 346
											class160.directions[var37 - 1][var38 - 1] = 3;
											class160.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 126 && var38 > 0 && class160.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) { // L: 350 354
											class160.bufferX[var40] = var17 + 1; // L: 355
											class160.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38 - 1] = 9; // L: 358
											class160.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 126 && class160.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) { // L: 364
											class160.bufferX[var40] = var17 - 1;
											class160.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095; // L: 368
											class160.directions[var37 - 1][var38 + 1] = 6;
											class160.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 126 && var38 < 126 && class160.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) { // L: 372 376
											class160.bufferX[var40] = var17 + 1; // L: 377
											class160.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class160.directions[var37 + 1][var38 + 1] = 12;
											class160.distances[var37 + 1][var38 + 1] = var28; // L: 381
										}
									}

									var35 = var36;
								} else {
									var35 = KeyHandler.method475(var5, var6, var9, var10, var12);
								}

								int var8;
								label435: {
									var16 = var5 - 64;
									var17 = var6 - 64; // L: 392
									var18 = Login.field1033;
									var37 = GrandExchangeOfferOwnWorldComparator.field608;
									if (!var35) { // L: 395
										var38 = Integer.MAX_VALUE; // L: 397
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX;
										var24 = var11.approxDestinationY;
										int var34 = var11.approxDestinationSizeX;
										var26 = var11.approxDestinationSizeY;

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) { // L: 404
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												int var29 = var27 - var16; // L: 406
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class160.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) { // L: 411
														var31 = var40 - var27;
													} else if (var27 > var34 + var40 - 1) {
														var31 = var27 - (var34 + var40 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32; // L: 416
													if (var33 < var38 || var38 == var33 && class160.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class160.distances[var29][var30];
														var18 = var27;
														var37 = var28; // L: 421
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label435;
										}
									}

									if (var18 == var5 && var6 == var37) {
										var8 = 0;
									} else {
										var20 = 0;
										class160.bufferX[var20] = var18; // L: 444
										var38 = var20 + 1;
										class160.bufferY[var20] = var37; // L: 445

										for (var21 = var22 = class160.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class160.directions[var18 - var16][var37 - var17]) { // L: 457
											if (var21 != var22) {
												var22 = var21;
												class160.bufferX[var38] = var18; // L: 450
												class160.bufferY[var38++] = var37; // L: 451
											}

											if ((var21 & 2) != 0) {
												++var18;
											} else if ((var21 & 8) != 0) { // L: 454
												--var18;
											}

											if ((var21 & 1) != 0) {
												++var37;
											} else if ((var21 & 4) != 0) {
												--var37;
											}
										}

										var40 = 0; // L: 459

										while (var38-- > 0) { // L: 460
											var13[var40] = class160.bufferX[var38]; // L: 461
											var14[var40++] = class160.bufferY[var38]; // L: 462
											if (var40 >= var13.length) { // L: 463
												break;
											}
										}

										var8 = var40; // L: 465
									}
								}

								var15 = var8; // L: 467
								if (var8 < 1) { // L: 468
									break;
								}

								var16 = 0; // L: 469

								while (true) {
									if (var16 >= var15 - 1) {
										break label412;
									}

									var4.method2219(Client.field739[var16], Client.field631[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class160.directions[var15][var16] = 0;
								class160.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2219(var1, var2, var3); // L: 472
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 474

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1775377890"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 477
		super.field1281 = 0; // L: 478
		super.field1242 = 0; // L: 479
		super.pathX[0] = var1; // L: 480
		super.pathY[0] = var2; // L: 481
		int var3 = this.transformedSize(); // L: 482
		super.x = super.pathX[0] * 128 + var3 * 64; // L: 483
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 484
	} // L: 485

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1698515856"
	)
	final void method2219(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 488
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 489
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 490
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 491
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 492
		}

		super.pathX[0] = var1; // L: 494
		super.pathY[0] = var2; // L: 495
		super.pathTraversed[0] = var3; // L: 496
	} // L: 497

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 500
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgp;Lfl;I)V",
		garbageValue = "1848847926"
	)
	static final void method2258(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 212 213 214
			if (var0 < Tiles.Tiles_minPlane) { // L: 217
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = Tiles.getObjectDefinition(var3); // L: 218
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 221
				var9 = var8.sizeX; // L: 226
				var10 = var8.sizeY; // L: 227
			} else {
				var9 = var8.sizeY; // L: 222
				var10 = var8.sizeX; // L: 223
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 233
				var11 = (var9 >> 1) + var1; // L: 234
				var12 = (var9 + 1 >> 1) + var1; // L: 235
			} else {
				var11 = var1; // L: 238
				var12 = var1 + 1; // L: 239
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 241
				var13 = (var10 >> 1) + var2; // L: 242
				var14 = var2 + (var10 + 1 >> 1); // L: 243
			} else {
				var13 = var2; // L: 246
				var14 = var2 + 1; // L: 247
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 249
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2; // L: 250
			int var17 = (var1 << 7) + (var9 << 6); // L: 251
			int var18 = (var2 << 7) + (var10 << 6); // L: 252
			long var19 = UserComparator3.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 253
			int var21 = var5 + (var4 << 6); // L: 254
			if (var8.int3 == 1) { // L: 255
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 256
				class171.method3612(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) { // L: 257
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 258
					if (var8.animationId == -1 && var8.transforms == null) { // L: 260
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 261
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21); // L: 262
					if (var8.interactType == 1 && var7 != null) { // L: 263
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) { // L: 266
					int[] var10000;
					if (var5 >= 12) { // L: 287
						if (var8.animationId == -1 && var8.transforms == null) { // L: 289
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 290
						}

						var6.method4046(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 291
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 292
							var10000 = Tiles.field1101[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 293
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) { // L: 296
						if (var8.animationId == -1 && var8.transforms == null) { // L: 298
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 299
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1102[var4], 0, var19, var21); // L: 300
						if (var4 == 0) { // L: 301
							if (var8.clipped) { // L: 302
								class43.field307[var0][var1][var2] = 50; // L: 303
								class43.field307[var0][var1][var2 + 1] = 50; // L: 304
							}

							if (var8.modelClipped) { // L: 306
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) { // L: 308
							if (var8.clipped) { // L: 309
								class43.field307[var0][var1][var2 + 1] = 50; // L: 310
								class43.field307[var0][var1 + 1][var2 + 1] = 50; // L: 311
							}

							if (var8.modelClipped) { // L: 313
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) { // L: 315
							if (var8.clipped) { // L: 316
								class43.field307[var0][var1 + 1][var2] = 50; // L: 317
								class43.field307[var0][var1 + 1][var2 + 1] = 50; // L: 318
							}

							if (var8.modelClipped) { // L: 320
								var10000 = Tiles.field1101[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) { // L: 322
							if (var8.clipped) { // L: 323
								class43.field307[var0][var1][var2] = 50; // L: 324
								class43.field307[var0][var1 + 1][var2] = 50; // L: 325
							}

							if (var8.modelClipped) { // L: 327
								var10000 = Tiles.field1101[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 329
							var7.method3216(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 330
							var6.method4204(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) { // L: 333
						if (var8.animationId == -1 && var8.transforms == null) { // L: 335
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 336
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1107[var4], 0, var19, var21); // L: 337
						if (var8.clipped) { // L: 338
							if (var4 == 0) { // L: 339
								class43.field307[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 340
								class43.field307[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 341
								class43.field307[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 342
								class43.field307[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 344
							var7.method3216(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) { // L: 347
							var22 = var4 + 1 & 3; // L: 348
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 351
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 352
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18); // L: 353
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 356
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 357
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1102[var4], Tiles.field1102[var22], var19, var21); // L: 359
							if (var8.modelClipped) { // L: 360
								if (var4 == 0) { // L: 361
									var10000 = Tiles.field1101[var0][var1]; // L: 362
									var10000[var2] |= 585;
									var10000 = Tiles.field1101[var0][var1]; // L: 363
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) { // L: 365
									var10000 = Tiles.field1101[var0][var1]; // L: 366
									var10000[var2 + 1] |= 1170;
									var10000 = Tiles.field1101[var0][var1 + 1]; // L: 367
									var10000[var2] |= 585;
								} else if (var4 == 2) { // L: 369
									var10000 = Tiles.field1101[var0][var1 + 1]; // L: 370
									var10000[var2] |= 585;
									var10000 = Tiles.field1101[var0][var1]; // L: 371
									var10000[var2] |= 1170;
								} else if (var4 == 3) { // L: 373
									var10000 = Tiles.field1101[var0][var1]; // L: 374
									var10000[var2] |= 1170;
									var10000 = Tiles.field1101[var0][var1]; // L: 375
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 378
								var7.method3216(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 379
								var6.method4204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) { // L: 382
							if (var8.animationId == -1 && var8.transforms == null) { // L: 384
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 385
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1107[var4], 0, var19, var21); // L: 386
							if (var8.clipped) { // L: 387
								if (var4 == 0) { // L: 388
									class43.field307[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) { // L: 389
									class43.field307[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) { // L: 390
									class43.field307[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) { // L: 391
									class43.field307[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 393
								var7.method3216(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) { // L: 396
							if (var8.animationId == -1 && var8.transforms == null) { // L: 398
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 399
							}

							var6.method4046(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21); // L: 400
							if (var8.interactType != 0 && var7 != null) { // L: 401
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 402
								var6.method4204(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) { // L: 405
							if (var8.animationId == -1 && var8.transforms == null) { // L: 407
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 408
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1102[var4], 0, 0, 0, var19, var21); // L: 409
						} else {
							long var23;
							Object var25;
							if (var5 == 5) { // L: 412
								var22 = 16; // L: 413
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 414
								if (var23 != 0L) { // L: 415
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 417
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 418
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1102[var4], 0, var22 * Tiles.field1100[var4], var22 * Tiles.field1105[var4], var19, var21); // L: 419
							} else if (var5 == 6) { // L: 422
								var22 = 8; // L: 423
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 424
								if (var23 != 0L) { // L: 425
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 427
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 428
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1106[var4], var22 * Tiles.field1097[var4], var19, var21); // L: 429
							} else if (var5 == 7) { // L: 432
								var28 = var4 + 2 & 3; // L: 434
								if (var8.animationId == -1 && var8.transforms == null) { // L: 435
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 436
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21); // L: 437
							} else if (var5 == 8) { // L: 440
								var22 = 8; // L: 441
								var23 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 442
								if (var23 != 0L) { // L: 443
									var22 = Tiles.getObjectDefinition(Message.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3; // L: 446
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 447
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 448
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 449
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 452
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 453
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1106[var4], var22 * Tiles.field1097[var4], var19, var21); // L: 455
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 268
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field1784, (Renderable)null); // L: 269
					}

					if (var29 != null && var6.method4046(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 270 271
						var28 = 15; // L: 272
						if (var29 instanceof Model) { // L: 273
							var28 = ((Model)var29).method4331() / 4; // L: 274
							if (var28 > 30) { // L: 275
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) { // L: 277
							for (int var32 = 0; var32 <= var10; ++var32) { // L: 278
								if (var28 > class43.field307[var0][var31 + var1][var32 + var2]) { // L: 279
									class43.field307[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 284
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 264 285 294 331 345 380 394 403 410 420 430 438 456 458

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "879452665"
	)
	static int method2235(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1295
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1296
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1297
			return 1; // L: 1298
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1300
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1301
			return 1; // L: 1302
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1304
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.text; // L: 1305
			return 1; // L: 1306
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1308
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1309
			return 1; // L: 1310
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1312
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1313
			return 1; // L: 1314
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1316
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1317
			return 1; // L: 1318
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1320
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1321
			return 1; // L: 1322
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1324
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1325
			return 1; // L: 1326
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1328
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1329
			return 1; // L: 1330
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1332
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1333
			return 1; // L: 1334
		} else if (var0 == 2610) { // L: 1336
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1337
			return 1; // L: 1338
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1340
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color; // L: 1341
			return 1; // L: 1342
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1344
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color2; // L: 1345
			return 1; // L: 1346
		} else if (var0 == 2613) { // L: 1348
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1349
			return 1; // L: 1350
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1352
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1353
			return 1; // L: 1354
		} else if (var0 != 2615 && var0 != 2616) { // L: 1356
			return 2; // L: 1360
		} else {
			++ChatChannel.Interpreter_intStackSize; // L: 1357
			return 1; // L: 1358
		}
	}
}
