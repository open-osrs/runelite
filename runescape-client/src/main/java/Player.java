import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972215407
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 786520397
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("z")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 177544021
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 439955349
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1996153449
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -470171859
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2092287543
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1153336923
	)
	int field1174;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 607445449
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -705770457
	)
	int field1172;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1470022945
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1450627593
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 410410317
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -662783103
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("m")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 515461967
	)
	@Export("team")
	int team;
	@ObfuscatedName("f")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -276233463
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -319055031
	)
	@Export("index")
	int index;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	TriBool field1170;
	@ObfuscatedName("ae")
	boolean field1186;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 139064121
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1808848513
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
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false; // L: 43
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 46
		this.isInClanChat = TriBool.TriBool_unknown; // L: 47
		this.field1170 = TriBool.TriBool_unknown; // L: 48
		this.field1186 = false; // L: 49
	} // L: 53

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "100"
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
					var8 = Strings.ItemDefinition_get(var4[var5] - 512).team; // L: 76
					if (var8 != 0) { // L: 77
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 80

		for (var6 = 0; var6 < 5; ++var6) { // L: 81
			var7 = var1.readUnsignedByte(); // L: 82
			if (var7 < 0 || var7 >= Canvas.field295[var6].length) { // L: 83
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
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1; // L: 96
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 97
		if (super.walkRightSequence == 65535) { // L: 98
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 99
		if (super.runSequence == 65535) { // L: 100
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), ModeWhere.loginType); // L: 101
		this.clearIsFriend(); // L: 102
		this.clearIsInClanChat(); // L: 103
		this.method2130(); // L: 104
		if (this == class35.localPlayer) { // L: 105
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 106
		this.skillLevel = var1.readUnsignedShort(); // L: 107
		this.isHidden = var1.readUnsignedByte() == 1; // L: 108
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 109
			this.isHidden = false;
		}

		class135[] var12 = null; // L: 110
		boolean var13 = false; // L: 111
		if (var1.offset < var1.array.length) { // L: 112
			var8 = var1.readUnsignedShort(); // L: 113
			var13 = (var8 >> 15 & 1) == 1; // L: 114
			if (var8 > 0 && var8 != 32768) { // L: 115
				var12 = new class135[12]; // L: 116

				for (int var9 = 0; var9 < 12; ++var9) { // L: 117
					int var10 = var8 >> 12 - var9 & 1; // L: 118
					if (var10 == 1) { // L: 119
						var12[var9] = class23.method310(var4[var9] - 512, var1); // L: 120
					}
				}
			}
		}

		if (this.appearance == null) { // L: 125
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4614(var4, var12, var13, var11, var2 == 1, var3); // L: 126
	} // L: 127

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 182
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? SequenceDefinition_get(super.sequence) : null; // L: 183
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : SequenceDefinition_get(super.movementSequence); // L: 184
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 185
			if (var3 == null) { // L: 186
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 187
				super.defaultHeight = var3.height; // L: 188
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 189
					var4 = Friend.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 190
					if (var4 != null) { // L: 191
						var4.offsetBy(0, -super.field1224, 0); // L: 192
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
						var4.offsetBy(this.field1174 - super.x, this.tileHeight2 - this.tileHeight, this.field1172 - super.y); // L: 201
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

						var5 = new Model[]{var3, var4}; // L: 212
						var3 = new Model(var5, 2); // L: 213
						if (super.orientation == 512) { // L: 214
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 215
							var4.rotateY90Ccw(); // L: 216
							var4.rotateY90Ccw(); // L: 217
						} else if (super.orientation == 1536) { // L: 219
							var4.rotateY90Ccw(); // L: 220
							var4.rotateY90Ccw(); // L: 221
							var4.rotateY90Ccw(); // L: 222
						}

						var4.offsetBy(super.x - this.field1174, this.tileHeight - this.tileHeight2, super.y - this.field1172); // L: 224
					}
				}

				var3.isSingleTile = true; // L: 227
				return var3; // L: 228
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1577174246"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 130
			this.checkIsFriend(); // L: 131
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 133
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 137
	} // L: 138

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2054012929"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = GrandExchangeOfferUnitPriceComparator.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 141
	} // L: 142

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1144773320"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 145
			this.updateIsInClanChat(); // L: 146
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 148
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1529344254"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 152
	} // L: 153

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "28293"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = class25.clanChat != null && class25.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 156
	} // L: 157

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-925189639"
	)
	void method2177() {
		this.field1170 = Client.field678[0] != null && Client.field678[0].method113(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 160
	} // L: 161

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31443"
	)
	void method2130() {
		this.field1170 = TriBool.TriBool_unknown; // L: 164
	} // L: 165

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	boolean method2137() {
		if (this.field1170 == TriBool.TriBool_unknown) { // L: 168
			this.method2177(); // L: 169
		}

		return this.field1170 == TriBool.TriBool_true; // L: 171
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-796021521"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class8.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 175 176 178
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "166145793"
	)
	final void method2140(int var1, int var2, byte var3) {
		if (super.sequence != -1 && SequenceDefinition_get(super.sequence).field1882 == 1) { // L: 232
			super.sequence = -1;
		}

		super.field1247 = -1; // L: 233
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 234
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 235
				if (var3 == 2) { // L: 237
					Player var4 = this; // L: 238
					int var5 = super.pathX[0]; // L: 240
					int var6 = super.pathY[0]; // L: 241
					int var7 = this.transformedSize(); // L: 242
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 243 244
						int var9 = this.transformedSize(); // L: 246
						Client.field894.approxDestinationX = var1; // L: 249
						Client.field894.approxDestinationY = var2; // L: 250
						Client.field894.approxDestinationSizeX = 1; // L: 251
						Client.field894.approxDestinationSizeY = 1; // L: 252
						ApproximateRouteStrategy var10 = Client.field894; // L: 253
						ApproximateRouteStrategy var11 = var10; // L: 255
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 256
						int[] var13 = Client.field828; // L: 257
						int[] var14 = Client.field896; // L: 258
						int var15 = 0;

						label853:
						while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var19;
								byte var20;
								int var21;
								int var22;
								byte var23;
								int var24;
								int[][] var25;
								int var26;
								int var27;
								int var28;
								int var29;
								boolean var35;
								boolean var36;
								int var37;
								int var38;
								int var40;
								if (var9 == 1) { // L: 267
									var17 = var5; // L: 270
									var18 = var6; // L: 271
									var19 = 64; // L: 272
									var20 = 64; // L: 273
									var21 = var5 - var19; // L: 274
									var22 = var6 - var20; // L: 275
									class159.directions[var19][var20] = 99; // L: 276
									class159.distances[var19][var20] = 0; // L: 277
									var23 = 0; // L: 278
									var24 = 0; // L: 279
									class159.bufferX[var23] = var5; // L: 280
									var40 = var23 + 1;
									class159.bufferY[var23] = var6; // L: 281
									var25 = var12.flags; // L: 282

									while (true) {
										if (var24 == var40) { // L: 285
											class159.field1920 = var17; // L: 357
											class159.field1924 = var18; // L: 358
											var36 = false; // L: 359
											break;
										}

										var17 = class159.bufferX[var24]; // L: 286
										var18 = class159.bufferY[var24]; // L: 287
										var24 = var24 + 1 & 4095; // L: 288
										var37 = var17 - var21; // L: 289
										var38 = var18 - var22; // L: 290
										var26 = var17 - var12.xInset; // L: 291
										var27 = var18 - var12.yInset; // L: 292
										if (var11.hasArrived(1, var17, var18, var12)) { // L: 293
											class159.field1920 = var17; // L: 294
											class159.field1924 = var18; // L: 295
											var36 = true; // L: 296
											break;
										}

										var28 = class159.distances[var37][var38] + 1; // L: 299
										if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) { // L: 300
											class159.bufferX[var40] = var17 - 1; // L: 301
											class159.bufferY[var40] = var18; // L: 302
											var40 = var40 + 1 & 4095; // L: 303
											class159.directions[var37 - 1][var38] = 2; // L: 304
											class159.distances[var37 - 1][var38] = var28; // L: 305
										}

										if (var37 < 127 && class159.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) { // L: 307
											class159.bufferX[var40] = var17 + 1; // L: 308
											class159.bufferY[var40] = var18; // L: 309
											var40 = var40 + 1 & 4095; // L: 310
											class159.directions[var37 + 1][var38] = 8; // L: 311
											class159.distances[var37 + 1][var38] = var28; // L: 312
										}

										if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 314
											class159.bufferX[var40] = var17; // L: 315
											class159.bufferY[var40] = var18 - 1; // L: 316
											var40 = var40 + 1 & 4095; // L: 317
											class159.directions[var37][var38 - 1] = 1; // L: 318
											class159.distances[var37][var38 - 1] = var28; // L: 319
										}

										if (var38 < 127 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 321
											class159.bufferX[var40] = var17; // L: 322
											class159.bufferY[var40] = var18 + 1; // L: 323
											var40 = var40 + 1 & 4095; // L: 324
											class159.directions[var37][var38 + 1] = 4; // L: 325
											class159.distances[var37][var38 + 1] = var28; // L: 326
										}

										if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 328
											class159.bufferX[var40] = var17 - 1; // L: 329
											class159.bufferY[var40] = var18 - 1; // L: 330
											var40 = var40 + 1 & 4095; // L: 331
											class159.directions[var37 - 1][var38 - 1] = 3; // L: 332
											class159.distances[var37 - 1][var38 - 1] = var28; // L: 333
										}

										if (var37 < 127 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 335
											class159.bufferX[var40] = var17 + 1; // L: 336
											class159.bufferY[var40] = var18 - 1; // L: 337
											var40 = var40 + 1 & 4095; // L: 338
											class159.directions[var37 + 1][var38 - 1] = 9; // L: 339
											class159.distances[var37 + 1][var38 - 1] = var28; // L: 340
										}

										if (var37 > 0 && var38 < 127 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 342
											class159.bufferX[var40] = var17 - 1; // L: 343
											class159.bufferY[var40] = var18 + 1; // L: 344
											var40 = var40 + 1 & 4095; // L: 345
											class159.directions[var37 - 1][var38 + 1] = 6; // L: 346
											class159.distances[var37 - 1][var38 + 1] = var28; // L: 347
										}

										if (var37 < 127 && var38 < 127 && class159.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 349
											class159.bufferX[var40] = var17 + 1; // L: 350
											class159.bufferY[var40] = var18 + 1; // L: 351
											var40 = var40 + 1 & 4095; // L: 352
											class159.directions[var37 + 1][var38 + 1] = 12; // L: 353
											class159.distances[var37 + 1][var38 + 1] = var28; // L: 354
										}
									}

									var35 = var36; // L: 361
								} else if (var9 == 2) { // L: 363
									var17 = var5; // L: 366
									var18 = var6; // L: 367
									var19 = 64; // L: 368
									var20 = 64; // L: 369
									var21 = var5 - var19; // L: 370
									var22 = var6 - var20; // L: 371
									class159.directions[var19][var20] = 99; // L: 372
									class159.distances[var19][var20] = 0; // L: 373
									var23 = 0; // L: 374
									var24 = 0; // L: 375
									class159.bufferX[var23] = var5; // L: 376
									var40 = var23 + 1;
									class159.bufferY[var23] = var6; // L: 377
									var25 = var12.flags; // L: 378

									while (true) {
										if (var40 == var24) { // L: 379
											class159.field1920 = var17; // L: 479
											class159.field1924 = var18; // L: 480
											var36 = false; // L: 481
											break;
										}

										var17 = class159.bufferX[var24]; // L: 380
										var18 = class159.bufferY[var24]; // L: 381
										var24 = var24 + 1 & 4095; // L: 382
										var37 = var17 - var21; // L: 383
										var38 = var18 - var22; // L: 384
										var26 = var17 - var12.xInset; // L: 385
										var27 = var18 - var12.yInset; // L: 386
										if (var11.hasArrived(2, var17, var18, var12)) { // L: 387
											class159.field1920 = var17; // L: 388
											class159.field1924 = var18; // L: 389
											var36 = true; // L: 390
											break;
										}

										var28 = class159.distances[var37][var38] + 1; // L: 393
										if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) { // L: 394 395 396 397
											class159.bufferX[var40] = var17 - 1; // L: 398
											class159.bufferY[var40] = var18; // L: 399
											var40 = var40 + 1 & 4095; // L: 400
											class159.directions[var37 - 1][var38] = 2; // L: 401
											class159.distances[var37 - 1][var38] = var28; // L: 402
										}

										if (var37 < 126 && class159.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) { // L: 404 405 406 407
											class159.bufferX[var40] = var17 + 1; // L: 408
											class159.bufferY[var40] = var18; // L: 409
											var40 = var40 + 1 & 4095; // L: 410
											class159.directions[var37 + 1][var38] = 8; // L: 411
											class159.distances[var37 + 1][var38] = var28; // L: 412
										}

										if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) { // L: 414 415 416 417
											class159.bufferX[var40] = var17; // L: 418
											class159.bufferY[var40] = var18 - 1; // L: 419
											var40 = var40 + 1 & 4095; // L: 420
											class159.directions[var37][var38 - 1] = 1; // L: 421
											class159.distances[var37][var38 - 1] = var28; // L: 422
										}

										if (var38 < 126 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) { // L: 424 425 426 427
											class159.bufferX[var40] = var17; // L: 428
											class159.bufferY[var40] = var18 + 1; // L: 429
											var40 = var40 + 1 & 4095; // L: 430
											class159.directions[var37][var38 + 1] = 4; // L: 431
											class159.distances[var37][var38 + 1] = var28; // L: 432
										}

										if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) { // L: 434 435 436 437 438
											class159.bufferX[var40] = var17 - 1; // L: 439
											class159.bufferY[var40] = var18 - 1; // L: 440
											var40 = var40 + 1 & 4095; // L: 441
											class159.directions[var37 - 1][var38 - 1] = 3; // L: 442
											class159.distances[var37 - 1][var38 - 1] = var28; // L: 443
										}

										if (var37 < 126 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) { // L: 445 446 447 448 449
											class159.bufferX[var40] = var17 + 1; // L: 450
											class159.bufferY[var40] = var18 - 1; // L: 451
											var40 = var40 + 1 & 4095; // L: 452
											class159.directions[var37 + 1][var38 - 1] = 9; // L: 453
											class159.distances[var37 + 1][var38 - 1] = var28; // L: 454
										}

										if (var37 > 0 && var38 < 126 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) { // L: 456 457 458 459 460
											class159.bufferX[var40] = var17 - 1; // L: 461
											class159.bufferY[var40] = var18 + 1; // L: 462
											var40 = var40 + 1 & 4095; // L: 463
											class159.directions[var37 - 1][var38 + 1] = 6; // L: 464
											class159.distances[var37 - 1][var38 + 1] = var28; // L: 465
										}

										if (var37 < 126 && var38 < 126 && class159.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) { // L: 467 468 469 470 471
											class159.bufferX[var40] = var17 + 1; // L: 472
											class159.bufferY[var40] = var18 + 1; // L: 473
											var40 = var40 + 1 & 4095; // L: 474
											class159.directions[var37 + 1][var38 + 1] = 12; // L: 475
											class159.distances[var37 + 1][var38 + 1] = var28; // L: 476
										}
									}

									var35 = var36; // L: 483
								} else {
									var17 = var5; // L: 488
									var18 = var6; // L: 489
									var19 = 64; // L: 490
									var20 = 64; // L: 491
									var21 = var5 - var19; // L: 492
									var22 = var6 - var20; // L: 493
									class159.directions[var19][var20] = 99; // L: 494
									class159.distances[var19][var20] = 0; // L: 495
									var23 = 0; // L: 496
									var24 = 0; // L: 497
									class159.bufferX[var23] = var5; // L: 498
									var40 = var23 + 1;
									class159.bufferY[var23] = var6; // L: 499
									var25 = var12.flags; // L: 500

									label839:
									while (true) {
										label837:
										while (true) {
											do {
												do {
													do {
														label814:
														do {
															if (var40 == var24) { // L: 501
																class159.field1920 = var17; // L: 621
																class159.field1924 = var18; // L: 622
																var36 = false; // L: 623
																break label839;
															}

															var17 = class159.bufferX[var24]; // L: 502
															var18 = class159.bufferY[var24]; // L: 503
															var24 = var24 + 1 & 4095; // L: 504
															var37 = var17 - var21; // L: 505
															var38 = var18 - var22; // L: 506
															var26 = var17 - var12.xInset; // L: 507
															var27 = var18 - var12.yInset; // L: 508
															if (var11.hasArrived(var9, var17, var18, var12)) { // L: 509
																class159.field1920 = var17; // L: 510
																class159.field1924 = var18; // L: 511
																var36 = true; // L: 512
																break label839;
															}

															var28 = class159.distances[var37][var38] + 1; // L: 515
															if (var37 > 0 && class159.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + var9 - 1] & 19136824) == 0) { // L: 516 517 518 519
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17 - 1; // L: 523
																		class159.bufferY[var40] = var18; // L: 524
																		var40 = var40 + 1 & 4095; // L: 525
																		class159.directions[var37 - 1][var38] = 2; // L: 526
																		class159.distances[var37 - 1][var38] = var28; // L: 527
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) { // L: 521
																		break;
																	}

																	++var29; // L: 520
																}
															}

															if (var37 < 128 - var9 && class159.directions[var37 + 1][var38] == 0 && (var25[var9 + var26][var27] & 19136899) == 0 && (var25[var9 + var26][var27 + var9 - 1] & 19136992) == 0) { // L: 529 530 531 532
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17 + 1; // L: 536
																		class159.bufferY[var40] = var18; // L: 537
																		var40 = var40 + 1 & 4095; // L: 538
																		class159.directions[var37 + 1][var38] = 8; // L: 539
																		class159.distances[var37 + 1][var38] = var28; // L: 540
																		break;
																	}

																	if ((var25[var26 + var9][var29 + var27] & 19136995) != 0) { // L: 534
																		break;
																	}

																	++var29; // L: 533
																}
															}

															if (var38 > 0 && class159.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + var9 - 1][var27 - 1] & 19136899) == 0) { // L: 542 543 544 545
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17; // L: 549
																		class159.bufferY[var40] = var18 - 1; // L: 550
																		var40 = var40 + 1 & 4095; // L: 551
																		class159.directions[var37][var38 - 1] = 1; // L: 552
																		class159.distances[var37][var38 - 1] = var28; // L: 553
																		break;
																	}

																	if ((var25[var26 + var29][var27 - 1] & 19136911) != 0) { // L: 547
																		break;
																	}

																	++var29; // L: 546
																}
															}

															if (var38 < 128 - var9 && class159.directions[var37][var38 + 1] == 0 && (var25[var26][var9 + var27] & 19136824) == 0 && (var25[var26 + var9 - 1][var9 + var27] & 19136992) == 0) { // L: 555 556 557 558
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class159.bufferX[var40] = var17; // L: 562
																		class159.bufferY[var40] = var18 + 1; // L: 563
																		var40 = var40 + 1 & 4095; // L: 564
																		class159.directions[var37][var38 + 1] = 4; // L: 565
																		class159.distances[var37][var38 + 1] = var28; // L: 566
																		break;
																	}

																	if ((var25[var29 + var26][var27 + var9] & 19137016) != 0) { // L: 560
																		break;
																	}

																	++var29; // L: 559
																}
															}

															if (var37 > 0 && var38 > 0 && class159.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) { // L: 568 569 570
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class159.bufferX[var40] = var17 - 1; // L: 575
																		class159.bufferY[var40] = var18 - 1; // L: 576
																		var40 = var40 + 1 & 4095; // L: 577
																		class159.directions[var37 - 1][var38 - 1] = 3; // L: 578
																		class159.distances[var37 - 1][var38 - 1] = var28; // L: 579
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) { // L: 572 573
																		break;
																	}

																	++var29; // L: 571
																}
															}

															if (var37 < 128 - var9 && var38 > 0 && class159.directions[var37 + 1][var38 - 1] == 0 && (var25[var9 + var26][var27 - 1] & 19136899) == 0) { // L: 581 582 583
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class159.bufferX[var40] = var17 + 1; // L: 588
																		class159.bufferY[var40] = var18 - 1; // L: 589
																		var40 = var40 + 1 & 4095; // L: 590
																		class159.directions[var37 + 1][var38 - 1] = 9; // L: 591
																		class159.distances[var37 + 1][var38 - 1] = var28; // L: 592
																		break;
																	}

																	if ((var25[var26 + var9][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var29 + var26][var27 - 1] & 19136911) != 0) { // L: 585 586
																		break;
																	}

																	++var29; // L: 584
																}
															}

															if (var37 > 0 && var38 < 128 - var9 && class159.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + var9] & 19136824) == 0) { // L: 594 595 596
																for (var29 = 1; var29 < var9; ++var29) { // L: 597
																	if ((var25[var26 - 1][var27 + var29] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var9 + var27] & 19137016) != 0) { // L: 598 599
																		continue label814;
																	}
																}

																class159.bufferX[var40] = var17 - 1; // L: 601
																class159.bufferY[var40] = var18 + 1; // L: 602
																var40 = var40 + 1 & 4095; // L: 603
																class159.directions[var37 - 1][var38 + 1] = 6; // L: 604
																class159.distances[var37 - 1][var38 + 1] = var28; // L: 605
															}
														} while(var37 >= 128 - var9); // L: 607
													} while(var38 >= 128 - var9);
												} while(class159.directions[var37 + 1][var38 + 1] != 0); // L: 608
											} while((var25[var26 + var9][var27 + var9] & 19136992) != 0); // L: 609

											for (var29 = 1; var29 < var9; ++var29) { // L: 610
												if ((var25[var29 + var26][var9 + var27] & 19137016) != 0 || (var25[var26 + var9][var29 + var27] & 19136995) != 0) { // L: 611 612
													continue label837;
												}
											}

											class159.bufferX[var40] = var17 + 1; // L: 614
											class159.bufferY[var40] = var18 + 1; // L: 615
											var40 = var40 + 1 & 4095; // L: 616
											class159.directions[var37 + 1][var38 + 1] = 12; // L: 617
											class159.distances[var37 + 1][var38 + 1] = var28; // L: 618
										}
									}

									var35 = var36; // L: 625
								}

								int var8;
								label896: {
									var16 = var5 - 64; // L: 627
									var17 = var6 - 64; // L: 628
									var18 = class159.field1920; // L: 629
									var37 = class159.field1924; // L: 630
									if (!var35) { // L: 631
										var38 = Integer.MAX_VALUE; // L: 633
										var21 = Integer.MAX_VALUE; // L: 634
										byte var39 = 10; // L: 635
										var40 = var11.approxDestinationX; // L: 636
										var24 = var11.approxDestinationY; // L: 637
										int var34 = var11.approxDestinationSizeX; // L: 638
										var26 = var11.approxDestinationSizeY; // L: 639

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) { // L: 640
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) { // L: 641
												var29 = var27 - var16; // L: 642
												int var30 = var28 - var17; // L: 643
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class159.distances[var29][var30] < 100) { // L: 644 645
													int var31 = 0; // L: 646
													if (var27 < var40) { // L: 647
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) { // L: 648
														var31 = var27 - (var34 + var40 - 1);
													}

													int var32 = 0; // L: 649
													if (var28 < var24) { // L: 650
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) { // L: 651
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var31 * var31 + var32 * var32; // L: 652
													if (var33 < var38 || var38 == var33 && class159.distances[var29][var30] < var21) { // L: 653
														var38 = var33; // L: 654
														var21 = class159.distances[var29][var30]; // L: 655
														var18 = var27; // L: 656
														var37 = var28; // L: 657
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) { // L: 663
											var8 = -1; // L: 664
											break label896;
										}
									}

									if (var18 == var5 && var6 == var37) { // L: 673
										var8 = 0; // L: 674
									} else {
										var20 = 0; // L: 677
										class159.bufferX[var20] = var18; // L: 680
										var38 = var20 + 1;
										class159.bufferY[var20] = var37; // L: 681

										for (var21 = var22 = class159.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class159.directions[var18 - var16][var37 - var17]) { // L: 682 683 693
											if (var21 != var22) { // L: 684
												var22 = var21; // L: 685
												class159.bufferX[var38] = var18; // L: 686
												class159.bufferY[var38++] = var37; // L: 687
											}

											if ((var21 & 2) != 0) { // L: 689
												++var18;
											} else if ((var21 & 8) != 0) { // L: 690
												--var18;
											}

											if ((var21 & 1) != 0) { // L: 691
												++var37;
											} else if ((var21 & 4) != 0) { // L: 692
												--var37;
											}
										}

										var40 = 0; // L: 695

										while (var38-- > 0) { // L: 696
											var13[var40] = class159.bufferX[var38]; // L: 697
											var14[var40++] = class159.bufferY[var38]; // L: 698
											if (var40 >= var13.length) { // L: 699
												break;
											}
										}

										var8 = var40; // L: 701
									}
								}

								var15 = var8; // L: 703
								if (var8 < 1) { // L: 704
									break;
								}

								var16 = 0; // L: 705

								while (true) {
									if (var16 >= var15 - 1) {
										break label853;
									}

									var4.method2163(Client.field828[var16], Client.field896[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) { // L: 261
								class159.directions[var15][var16] = 0; // L: 262
								class159.distances[var15][var16] = 99999999; // L: 263
							}

							++var15; // L: 260
						}
					}
				}

				this.method2163(var1, var2, var3); // L: 708
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 710

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-381441568"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 713
		super.field1215 = 0; // L: 714
		super.field1250 = 0; // L: 715
		super.pathX[0] = var1; // L: 716
		super.pathY[0] = var2; // L: 717
		int var3 = this.transformedSize(); // L: 718
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 719
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 720
	} // L: 721

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "364759226"
	)
	final void method2163(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 724
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 725
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 726
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 727
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 728
		}

		super.pathX[0] = var1; // L: 730
		super.pathY[0] = var2; // L: 731
		super.pathTraversed[0] = var3; // L: 732
	} // L: 733

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 736
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-595055331"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 40
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1209787772"
	)
	static int method2179(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2751
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2752
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2753
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2754
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4 + var3; // L: 2755
			return 1; // L: 2756
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2758
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2759
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2760
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2761
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 - var4; // L: 2762
			return 1; // L: 2763
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2765
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2766
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2767
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2768
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4 * var3; // L: 2769
			return 1; // L: 2770
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2772
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2773
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2774
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2775
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 / var4; // L: 2776
			return 1; // L: 2777
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2779
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2780
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2781
			return 1; // L: 2782
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2784
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 2785
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2786
			return 1; // L: 2787
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2789
				WorldMapCacheName.Interpreter_intStackSize -= 5; // L: 2790
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2791
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2792
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2793
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 2794
				var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 4]; // L: 2795
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 2796
				return 1; // L: 2797
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2799
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2800
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2801
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2802
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 2803
				return 1; // L: 2804
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2806
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2807
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2808
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2809
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2810
				return 1; // L: 2811
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2813
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2814
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2815
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2816
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2817
				return 1; // L: 2818
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2820
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2821
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2822
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2823
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2824
				return 1; // L: 2825
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2827
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2828
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2829
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2830
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 % var4; // L: 2831
				return 1; // L: 2832
			} else if (var0 == ScriptOpcodes.POW) { // L: 2834
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2835
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2836
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2837
				if (var3 == 0) { // L: 2838
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2839
				}

				return 1; // L: 2840
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2842
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2843
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2844
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2845
				if (var3 == 0) { // L: 2846
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 2847
					return 1; // L: 2848
				} else {
					switch(var4) { // L: 2850
					case 0:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2858
						break; // L: 2859
					case 1:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3; // L: 2878
						break;
					case 2:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2863
						break; // L: 2864
					case 3:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2853
						break;
					case 4:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2873
						break; // L: 2874
					default:
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2868
					}

					return 1; // L: 2882
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2884
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2885
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2886
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2887
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & var4; // L: 2888
				return 1; // L: 2889
			} else if (var0 == ScriptOpcodes.OR) { // L: 2891
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2892
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2893
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2894
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | var4; // L: 2895
				return 1; // L: 2896
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2898
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2899
				long var9 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2900
				long var11 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2901
				long var13 = (long)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2902
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 2903
				return 1; // L: 2904
			} else if (var0 == 4025) { // L: 2906
				var3 = ItemContainer.method2104(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 2907
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3; // L: 2908
				return 1; // L: 2909
			} else if (var0 == 4026) { // L: 2911
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 2912
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2913
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2914
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2915
				return 1; // L: 2916
			} else if (var0 == 4027) { // L: 2918
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2919
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2920
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2921
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2922
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = WorldMapElement.method2628(var3, var4, var5); // L: 2923
				return 1; // L: 2924
			} else if (var0 == 4028) { // L: 2926
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2927
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2928
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2929
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2930
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeEvents.method4968(var3, var4, var5); // L: 2931
				return 1; // L: 2932
			} else if (var0 == 4029) { // L: 2934
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 2935
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2936
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2937
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2938
				var6 = 31 - var5; // L: 2939
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 2940
				return 1; // L: 2941
			} else if (var0 == 4030) { // L: 2943
				WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 2944
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 2945
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 2946
				var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 2947
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 2948
				var3 = GrandExchangeEvents.method4968(var3, var5, var6); // L: 2949
				var7 = WorldMapLabel.method3582(var6 - var5 + 1); // L: 2950
				if (var4 > var7) { // L: 2951
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 2952
				return 1; // L: 2953
			} else {
				return 2; // L: 2955
			}
		}
	}
}
