import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1696994265
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2126802757
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("g")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -937184137
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1332697309
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 337451977
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1425054189
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1458184293
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 288875039
	)
	int field1042;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 332788461
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 13115945
	)
	int field1052;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775444559
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1238271901
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1266032001
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1322091437
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("d")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -928304435
	)
	@Export("team")
	int team;
	@ObfuscatedName("m")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1357016489
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 416153075
	)
	@Export("index")
	int index;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ae")
	boolean field1067;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -308953969
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -699519147
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1757625786"
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
					var8 = TaskHandler.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class137.field1519[var6].length) { // L: 84
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), GrandExchangeOfferUnitPriceComparator.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2105(); // L: 105
		if (this == HealthBarDefinition.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class150[] var12 = null; // L: 111
		boolean var13 = false; // L: 112
		if (var1.offset < var1.array.length) { // L: 113
			var8 = var1.readUnsignedShort(); // L: 114
			var13 = (var8 >> 15 & 1) == 1; // L: 115
			if (var8 > 0 && var8 != 32768) { // L: 116
				var12 = new class150[12]; // L: 117

				for (int var9 = 0; var9 < 12; ++var9) { // L: 118
					int var10 = var8 >> 12 - var9 & 1; // L: 119
					if (var10 == 1) { // L: 120
						var12[var9] = NPCComposition.method3152(var4[var9] - 512, var1); // L: 121
					}
				}
			}
		}

		if (this.appearance == null) { // L: 126
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5062(var4, var12, var13, var11, var2 == 1, var3); // L: 127
	} // L: 128

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 189
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MouseHandler.SequenceDefinition_get(super.sequence) : null; // L: 190
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : MouseHandler.SequenceDefinition_get(super.movementSequence); // L: 191
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 192
			if (var3 == null) { // L: 193
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 194
				super.defaultHeight = var3.height; // L: 195
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 196
					var4 = BZip2State.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 197
					if (var4 != null) { // L: 198
						var4.offsetBy(0, -super.field1126, 0); // L: 199
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
						var4.offsetBy(this.field1042 - super.x, this.tileHeight2 - this.tileHeight, this.field1052 - super.y); // L: 208
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

						var4.offsetBy(super.x - this.field1042, this.tileHeight - this.tileHeight2, super.y - this.field1052); // L: 231
					}
				}

				var3.isSingleTile = true; // L: 234
				return var3; // L: 235
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 131
			this.checkIsFriend(); // L: 132
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 134
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426200775"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 138
	} // L: 139

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "942612760"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class112.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 142
	} // L: 143

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "220303243"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 146
			this.updateIsInFriendsChat(); // L: 147
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "579888047"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = AbstractArchive.friendsChat != null && AbstractArchive.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-396296136"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) { // L: 161
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2649(this.username.getName()) != -1) { // L: 162
				this.isInClanChat = TriBool.TriBool_true; // L: 163
				return; // L: 164
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 167
	} // L: 168

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	void method2105() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 171
	} // L: 172

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 175
			this.updateIsInClanChat(); // L: 176
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 178
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? ScriptFrame.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 182 183 185
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-1013246003"
	)
	final void method2109(int var1, int var2, byte var3) {
		if (super.sequence != -1 && MouseHandler.SequenceDefinition_get(super.sequence).field1956 == 1) { // L: 239
			super.sequence = -1;
		}

		super.field1112 = -1; // L: 240
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 241
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 242
				if (var3 == 2) { // L: 244
					Player var4 = this; // L: 245
					int var5 = super.pathX[0]; // L: 247
					int var6 = super.pathY[0]; // L: 248
					int var7 = this.transformedSize(); // L: 249
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 250 251
						int var9 = this.transformedSize(); // L: 253
						Client.field743.approxDestinationX = var1; // L: 256
						Client.field743.approxDestinationY = var2; // L: 257
						Client.field743.approxDestinationSizeX = 1; // L: 258
						Client.field743.approxDestinationSizeY = 1; // L: 259
						ApproximateRouteStrategy var10 = Client.field743; // L: 260
						ApproximateRouteStrategy var11 = var10; // L: 262
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 263
						int[] var13 = Client.field538; // L: 264
						int[] var14 = Client.field748; // L: 265
						int var15 = 0;

						label381:
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
								if (var9 == 1) { // L: 274
									var17 = var5; // L: 277
									var18 = var6; // L: 278
									byte var19 = 64; // L: 279
									var20 = 64; // L: 280
									var21 = var5 - var19; // L: 281
									var22 = var6 - var20; // L: 282
									class174.directions[var19][var20] = 99; // L: 283
									class174.distances[var19][var20] = 0; // L: 284
									byte var23 = 0; // L: 285
									var24 = 0; // L: 286
									class174.bufferX[var23] = var5; // L: 287
									var40 = var23 + 1;
									class174.bufferY[var23] = var6; // L: 288
									int[][] var25 = var12.flags; // L: 289

									boolean var36;
									while (true) {
										if (var24 == var40) { // L: 292
											RouteStrategy.field1979 = var17; // L: 364
											class67.field845 = var18; // L: 365
											var36 = false; // L: 366
											break;
										}

										var17 = class174.bufferX[var24]; // L: 293
										var18 = class174.bufferY[var24]; // L: 294
										var24 = var24 + 1 & 4095; // L: 295
										var37 = var17 - var21; // L: 296
										var38 = var18 - var22; // L: 297
										var26 = var17 - var12.xInset; // L: 298
										var27 = var18 - var12.yInset; // L: 299
										if (var11.hasArrived(1, var17, var18, var12)) { // L: 300
											RouteStrategy.field1979 = var17; // L: 301
											class67.field845 = var18; // L: 302
											var36 = true; // L: 303
											break;
										}

										var28 = class174.distances[var37][var38] + 1; // L: 306
										if (var37 > 0 && class174.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) { // L: 307
											class174.bufferX[var40] = var17 - 1; // L: 308
											class174.bufferY[var40] = var18; // L: 309
											var40 = var40 + 1 & 4095; // L: 310
											class174.directions[var37 - 1][var38] = 2; // L: 311
											class174.distances[var37 - 1][var38] = var28; // L: 312
										}

										if (var37 < 127 && class174.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) { // L: 314
											class174.bufferX[var40] = var17 + 1; // L: 315
											class174.bufferY[var40] = var18; // L: 316
											var40 = var40 + 1 & 4095; // L: 317
											class174.directions[var37 + 1][var38] = 8; // L: 318
											class174.distances[var37 + 1][var38] = var28; // L: 319
										}

										if (var38 > 0 && class174.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 321
											class174.bufferX[var40] = var17; // L: 322
											class174.bufferY[var40] = var18 - 1; // L: 323
											var40 = var40 + 1 & 4095; // L: 324
											class174.directions[var37][var38 - 1] = 1; // L: 325
											class174.distances[var37][var38 - 1] = var28; // L: 326
										}

										if (var38 < 127 && class174.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 328
											class174.bufferX[var40] = var17; // L: 329
											class174.bufferY[var40] = var18 + 1; // L: 330
											var40 = var40 + 1 & 4095; // L: 331
											class174.directions[var37][var38 + 1] = 4; // L: 332
											class174.distances[var37][var38 + 1] = var28; // L: 333
										}

										if (var37 > 0 && var38 > 0 && class174.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 335
											class174.bufferX[var40] = var17 - 1; // L: 336
											class174.bufferY[var40] = var18 - 1; // L: 337
											var40 = var40 + 1 & 4095; // L: 338
											class174.directions[var37 - 1][var38 - 1] = 3; // L: 339
											class174.distances[var37 - 1][var38 - 1] = var28; // L: 340
										}

										if (var37 < 127 && var38 > 0 && class174.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 342
											class174.bufferX[var40] = var17 + 1; // L: 343
											class174.bufferY[var40] = var18 - 1; // L: 344
											var40 = var40 + 1 & 4095; // L: 345
											class174.directions[var37 + 1][var38 - 1] = 9; // L: 346
											class174.distances[var37 + 1][var38 - 1] = var28; // L: 347
										}

										if (var37 > 0 && var38 < 127 && class174.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 349
											class174.bufferX[var40] = var17 - 1; // L: 350
											class174.bufferY[var40] = var18 + 1; // L: 351
											var40 = var40 + 1 & 4095; // L: 352
											class174.directions[var37 - 1][var38 + 1] = 6; // L: 353
											class174.distances[var37 - 1][var38 + 1] = var28; // L: 354
										}

										if (var37 < 127 && var38 < 127 && class174.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 356
											class174.bufferX[var40] = var17 + 1; // L: 357
											class174.bufferY[var40] = var18 + 1; // L: 358
											var40 = var40 + 1 & 4095; // L: 359
											class174.directions[var37 + 1][var38 + 1] = 12; // L: 360
											class174.distances[var37 + 1][var38 + 1] = var28; // L: 361
										}
									}

									var35 = var36; // L: 368
								} else if (var9 == 2) { // L: 370
									var35 = WorldMapRectangle.method3959(var5, var6, var10, var12);
								} else {
									var35 = class318.method5874(var5, var6, var9, var10, var12); // L: 371
								}

								int var8;
								label404: {
									var16 = var5 - 64; // L: 372
									var17 = var6 - 64; // L: 373
									var18 = RouteStrategy.field1979; // L: 374
									var37 = class67.field845; // L: 375
									if (!var35) { // L: 376
										var38 = Integer.MAX_VALUE; // L: 378
										var21 = Integer.MAX_VALUE; // L: 379
										byte var39 = 10; // L: 380
										var40 = var11.approxDestinationX; // L: 381
										var24 = var11.approxDestinationY; // L: 382
										int var34 = var11.approxDestinationSizeX; // L: 383
										var26 = var11.approxDestinationSizeY; // L: 384

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) { // L: 385
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) { // L: 386
												int var29 = var27 - var16; // L: 387
												int var30 = var28 - var17; // L: 388
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class174.distances[var29][var30] < 100) { // L: 389 390
													int var31 = 0; // L: 391
													if (var27 < var40) { // L: 392
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) { // L: 393
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0; // L: 394
													if (var28 < var24) { // L: 395
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) { // L: 396
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32; // L: 397
													if (var33 < var38 || var38 == var33 && class174.distances[var29][var30] < var21) { // L: 398
														var38 = var33; // L: 399
														var21 = class174.distances[var29][var30]; // L: 400
														var18 = var27; // L: 401
														var37 = var28; // L: 402
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) { // L: 408
											var8 = -1; // L: 409
											break label404;
										}
									}

									if (var18 == var5 && var37 == var6) { // L: 418
										var8 = 0; // L: 419
									} else {
										var20 = 0; // L: 422
										class174.bufferX[var20] = var18; // L: 425
										var38 = var20 + 1;
										class174.bufferY[var20] = var37; // L: 426

										for (var21 = var22 = class174.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class174.directions[var18 - var16][var37 - var17]) { // L: 427 428 438
											if (var22 != var21) { // L: 429
												var22 = var21; // L: 430
												class174.bufferX[var38] = var18; // L: 431
												class174.bufferY[var38++] = var37; // L: 432
											}

											if ((var21 & 2) != 0) { // L: 434
												++var18;
											} else if ((var21 & 8) != 0) { // L: 435
												--var18;
											}

											if ((var21 & 1) != 0) { // L: 436
												++var37;
											} else if ((var21 & 4) != 0) { // L: 437
												--var37;
											}
										}

										var40 = 0; // L: 440

										while (var38-- > 0) { // L: 441
											var13[var40] = class174.bufferX[var38]; // L: 442
											var14[var40++] = class174.bufferY[var38]; // L: 443
											if (var40 >= var13.length) { // L: 444
												break;
											}
										}

										var8 = var40; // L: 446
									}
								}

								var15 = var8; // L: 448
								if (var8 < 1) { // L: 449
									break;
								}

								var16 = 0; // L: 450

								while (true) {
									if (var16 >= var15 - 1) {
										break label381;
									}

									var4.method2111(Client.field538[var16], Client.field748[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) { // L: 268
								class174.directions[var15][var16] = 0; // L: 269
								class174.distances[var15][var16] = 99999999; // L: 270
							}

							++var15; // L: 267
						}
					}
				}

				this.method2111(var1, var2, var3); // L: 453
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 455

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "107443252"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 458
		super.field1144 = 0; // L: 459
		super.field1085 = 0; // L: 460
		super.pathX[0] = var1; // L: 461
		super.pathY[0] = var2; // L: 462
		int var3 = this.transformedSize(); // L: 463
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 464
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 465
	} // L: 466

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1234210425"
	)
	final void method2111(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 469
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 470
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 471
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 472
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 473
		}

		super.pathX[0] = var1; // L: 475
		super.pathY[0] = var2; // L: 476
		super.pathTraversed[0] = var3; // L: 477
	} // L: 478

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-532391824"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 481
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-665498236"
	)
	public static long method2159(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 56
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-763445745"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class174.loadInterface(var0)) { // L: 11304
			Widget[] var1 = WorldMapSection1.Widget_interfaceComponents[var0]; // L: 11305

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11306
				Widget var3 = var1[var2]; // L: 11307
				if (var3 != null) { // L: 11308
					var3.modelFrame = 0; // L: 11309
					var3.modelFrameCycle = 0; // L: 11310
				}
			}

		}
	} // L: 11312

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "55"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (AbstractArchive.friendsChat != null) { // L: 11804
			PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2766, Client.packetWriter.isaacCipher); // L: 11805
			var1.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0)); // L: 11806
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11807
			Client.packetWriter.addNode(var1); // L: 11808
		}
	} // L: 11809
}
