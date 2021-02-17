import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 838938309
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -726280905
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1265111393
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 732262151
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("j")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -818142941
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 906508591
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1192790671
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1807661199
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -124646805
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -508660831
	)
	int field634;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1663722753
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 89818503
	)
	int field626;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 291010439
	)
	int field620;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2101860893
	)
	int field606;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1794275211
	)
	int field622;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1140466467
	)
	int field623;
	@ObfuscatedName("r")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -577457335
	)
	@Export("team")
	int team;
	@ObfuscatedName("g")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -285633019
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1218536575
	)
	@Export("index")
	int index;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aj")
	boolean field631;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 732463017
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -548320531
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
		this.field631 = false; // L: 47
	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-58"
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
					int var8 = SecureRandomCallable.ItemDefinition_get(var4[var5] - 512).team; // L: 74
					if (var8 != 0) { // L: 75
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5]; // L: 78

		for (var6 = 0; var6 < 5; ++var6) { // L: 79
			var7 = var1.readUnsignedByte(); // L: 80
			if (var7 < 0 || var7 >= WorldMapScaleHandler.field366[var6].length) { // L: 81
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
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1; // L: 94
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 95
		if (super.walkRightSequence == 65535) { // L: 96
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 97
		if (super.runSequence == 65535) { // L: 98
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), GrandExchangeOfferUnitPriceComparator.loginType); // L: 99
		this.clearIsFriend(); // L: 100
		this.clearIsInClanChat(); // L: 101
		if (this == PlayerComposition.localPlayer) { // L: 102
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "338154305"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 112
			this.checkIsFriend(); // L: 113
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 115
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-730921547"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 119
	} // L: 120

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "886706251"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = MilliClock.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 123
	} // L: 124

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 127
			this.updateIsInClanChat(); // L: 128
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 130
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1880119871"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 134
	} // L: 135

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "327273294"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = WorldMapArea.clanChat != null && WorldMapArea.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 138
	} // L: 139

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-20"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? WorldMapIcon_0.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 142 143 145
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 149
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ParamComposition.SequenceDefinition_get(super.sequence) : null; // L: 150
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : ParamComposition.SequenceDefinition_get(super.movementSequence); // L: 151
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 152
			if (var3 == null) { // L: 153
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 154
				super.defaultHeight = var3.height; // L: 155
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 156
					var4 = TileItem.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 157
					if (var4 != null) { // L: 158
						var4.offsetBy(0, -super.field979, 0); // L: 159
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
						var4.offsetBy(this.field634 - super.x, this.tileHeight2 - this.tileHeight, this.field626 - super.y); // L: 168
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

						var4.offsetBy(super.x - this.field634, this.tileHeight - this.tileHeight2, super.y - this.field626); // L: 191
					}
				}

				var3.isSingleTile = true; // L: 194
				return var3; // L: 195
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1635620178"
	)
	final void method1313(int var1, int var2, byte var3) {
		if (super.sequence != -1 && ParamComposition.SequenceDefinition_get(super.sequence).field3555 == 1) { // L: 199
			super.sequence = -1;
		}

		super.field959 = -1; // L: 200
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 201
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 202
				if (var3 == 2) { // L: 204
					Player var4 = this; // L: 205
					int var5 = super.pathX[0]; // L: 207
					int var6 = super.pathY[0]; // L: 208
					int var7 = this.transformedSize(); // L: 209
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 210 211
						int var9 = this.transformedSize(); // L: 213
						Client.field919.approxDestinationX = var1; // L: 216
						Client.field919.approxDestinationY = var2; // L: 217
						Client.field919.approxDestinationSizeX = 1; // L: 218
						Client.field919.approxDestinationSizeY = 1; // L: 219
						ApproximateRouteStrategy var10 = Client.field919; // L: 220
						ApproximateRouteStrategy var11 = var10; // L: 222
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 223
						int[] var13 = Client.field920; // L: 224
						int[] var14 = Client.field921; // L: 225
						int var15 = 0;

						label686:
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
								if (var9 == 1) { // L: 234
									var17 = var5; // L: 237
									var18 = var6; // L: 238
									var19 = 64; // L: 239
									var20 = 64; // L: 240
									var21 = var5 - var19; // L: 241
									var22 = var6 - var20; // L: 242
									class182.directions[var19][var20] = 99; // L: 243
									class182.distances[var19][var20] = 0; // L: 244
									var23 = 0; // L: 245
									var24 = 0; // L: 246
									class182.bufferX[var23] = var5; // L: 247
									var40 = var23 + 1;
									class182.bufferY[var23] = var6; // L: 248
									var25 = var12.flags; // L: 249

									while (true) {
										if (var24 == var40) { // L: 252
											class182.field2115 = var17; // L: 324
											class182.field2121 = var18; // L: 325
											var36 = false; // L: 326
											break;
										}

										var17 = class182.bufferX[var24]; // L: 253
										var18 = class182.bufferY[var24]; // L: 254
										var24 = var24 + 1 & 4095; // L: 255
										var37 = var17 - var21; // L: 256
										var38 = var18 - var22; // L: 257
										var26 = var17 - var12.xInset; // L: 258
										var27 = var18 - var12.yInset; // L: 259
										if (var11.hasArrived(1, var17, var18, var12)) { // L: 260
											class182.field2115 = var17; // L: 261
											class182.field2121 = var18; // L: 262
											var36 = true; // L: 263
											break;
										}

										var28 = class182.distances[var37][var38] + 1; // L: 266
										if (var37 > 0 && class182.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) { // L: 267
											class182.bufferX[var40] = var17 - 1; // L: 268
											class182.bufferY[var40] = var18; // L: 269
											var40 = var40 + 1 & 4095; // L: 270
											class182.directions[var37 - 1][var38] = 2; // L: 271
											class182.distances[var37 - 1][var38] = var28; // L: 272
										}

										if (var37 < 127 && class182.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) { // L: 274
											class182.bufferX[var40] = var17 + 1; // L: 275
											class182.bufferY[var40] = var18; // L: 276
											var40 = var40 + 1 & 4095; // L: 277
											class182.directions[var37 + 1][var38] = 8; // L: 278
											class182.distances[var37 + 1][var38] = var28; // L: 279
										}

										if (var38 > 0 && class182.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 281
											class182.bufferX[var40] = var17; // L: 282
											class182.bufferY[var40] = var18 - 1; // L: 283
											var40 = var40 + 1 & 4095; // L: 284
											class182.directions[var37][var38 - 1] = 1; // L: 285
											class182.distances[var37][var38 - 1] = var28; // L: 286
										}

										if (var38 < 127 && class182.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 288
											class182.bufferX[var40] = var17; // L: 289
											class182.bufferY[var40] = var18 + 1; // L: 290
											var40 = var40 + 1 & 4095; // L: 291
											class182.directions[var37][var38 + 1] = 4; // L: 292
											class182.distances[var37][var38 + 1] = var28; // L: 293
										}

										if (var37 > 0 && var38 > 0 && class182.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 295
											class182.bufferX[var40] = var17 - 1; // L: 296
											class182.bufferY[var40] = var18 - 1; // L: 297
											var40 = var40 + 1 & 4095; // L: 298
											class182.directions[var37 - 1][var38 - 1] = 3; // L: 299
											class182.distances[var37 - 1][var38 - 1] = var28; // L: 300
										}

										if (var37 < 127 && var38 > 0 && class182.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) { // L: 302
											class182.bufferX[var40] = var17 + 1; // L: 303
											class182.bufferY[var40] = var18 - 1; // L: 304
											var40 = var40 + 1 & 4095; // L: 305
											class182.directions[var37 + 1][var38 - 1] = 9; // L: 306
											class182.distances[var37 + 1][var38 - 1] = var28; // L: 307
										}

										if (var37 > 0 && var38 < 127 && class182.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 309
											class182.bufferX[var40] = var17 - 1; // L: 310
											class182.bufferY[var40] = var18 + 1; // L: 311
											var40 = var40 + 1 & 4095; // L: 312
											class182.directions[var37 - 1][var38 + 1] = 6; // L: 313
											class182.distances[var37 - 1][var38 + 1] = var28; // L: 314
										}

										if (var37 < 127 && var38 < 127 && class182.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) { // L: 316
											class182.bufferX[var40] = var17 + 1; // L: 317
											class182.bufferY[var40] = var18 + 1; // L: 318
											var40 = var40 + 1 & 4095; // L: 319
											class182.directions[var37 + 1][var38 + 1] = 12; // L: 320
											class182.distances[var37 + 1][var38 + 1] = var28; // L: 321
										}
									}

									var35 = var36; // L: 328
								} else if (var9 == 2) { // L: 330
									var35 = class231.method4152(var5, var6, var10, var12);
								} else {
									var17 = var5; // L: 334
									var18 = var6; // L: 335
									var19 = 64; // L: 336
									var20 = 64; // L: 337
									var21 = var5 - var19; // L: 338
									var22 = var6 - var20; // L: 339
									class182.directions[var19][var20] = 99; // L: 340
									class182.distances[var19][var20] = 0; // L: 341
									var23 = 0; // L: 342
									var24 = 0; // L: 343
									class182.bufferX[var23] = var5; // L: 344
									var40 = var23 + 1;
									class182.bufferY[var23] = var6; // L: 345
									var25 = var12.flags; // L: 346

									label672:
									while (true) {
										label670:
										while (true) {
											do {
												do {
													do {
														label647:
														do {
															if (var24 == var40) { // L: 347
																class182.field2115 = var17; // L: 467
																class182.field2121 = var18; // L: 468
																var36 = false; // L: 469
																break label672;
															}

															var17 = class182.bufferX[var24]; // L: 348
															var18 = class182.bufferY[var24]; // L: 349
															var24 = var24 + 1 & 4095; // L: 350
															var37 = var17 - var21; // L: 351
															var38 = var18 - var22; // L: 352
															var26 = var17 - var12.xInset; // L: 353
															var27 = var18 - var12.yInset; // L: 354
															if (var11.hasArrived(var9, var17, var18, var12)) { // L: 355
																class182.field2115 = var17; // L: 356
																class182.field2121 = var18; // L: 357
																var36 = true; // L: 358
																break label672;
															}

															var28 = class182.distances[var37][var38] + 1; // L: 361
															if (var37 > 0 && class182.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + var9 - 1] & 19136824) == 0) { // L: 362 363 364 365
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17 - 1; // L: 369
																		class182.bufferY[var40] = var18; // L: 370
																		var40 = var40 + 1 & 4095; // L: 371
																		class182.directions[var37 - 1][var38] = 2; // L: 372
																		class182.distances[var37 - 1][var38] = var28; // L: 373
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) { // L: 367
																		break;
																	}

																	++var29; // L: 366
																}
															}

															if (var37 < 128 - var9 && class182.directions[var37 + 1][var38] == 0 && (var25[var9 + var26][var27] & 19136899) == 0 && (var25[var26 + var9][var9 + var27 - 1] & 19136992) == 0) { // L: 375 376 377 378
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17 + 1; // L: 382
																		class182.bufferY[var40] = var18; // L: 383
																		var40 = var40 + 1 & 4095; // L: 384
																		class182.directions[var37 + 1][var38] = 8; // L: 385
																		class182.distances[var37 + 1][var38] = var28; // L: 386
																		break;
																	}

																	if ((var25[var26 + var9][var27 + var29] & 19136995) != 0) { // L: 380
																		break;
																	}

																	++var29; // L: 379
																}
															}

															if (var38 > 0 && class182.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var9 + var26 - 1][var27 - 1] & 19136899) == 0) { // L: 388 389 390 391
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17; // L: 395
																		class182.bufferY[var40] = var18 - 1; // L: 396
																		var40 = var40 + 1 & 4095; // L: 397
																		class182.directions[var37][var38 - 1] = 1; // L: 398
																		class182.distances[var37][var38 - 1] = var28; // L: 399
																		break;
																	}

																	if ((var25[var26 + var29][var27 - 1] & 19136911) != 0) { // L: 393
																		break;
																	}

																	++var29; // L: 392
																}
															}

															if (var38 < 128 - var9 && class182.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + var9] & 19136824) == 0 && (var25[var9 + var26 - 1][var9 + var27] & 19136992) == 0) { // L: 401 402 403 404
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17; // L: 408
																		class182.bufferY[var40] = var18 + 1; // L: 409
																		var40 = var40 + 1 & 4095; // L: 410
																		class182.directions[var37][var38 + 1] = 4; // L: 411
																		class182.distances[var37][var38 + 1] = var28; // L: 412
																		break;
																	}

																	if ((var25[var29 + var26][var9 + var27] & 19137016) != 0) { // L: 406
																		break;
																	}

																	++var29; // L: 405
																}
															}

															if (var37 > 0 && var38 > 0 && class182.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) { // L: 414 415 416
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class182.bufferX[var40] = var17 - 1; // L: 421
																		class182.bufferY[var40] = var18 - 1; // L: 422
																		var40 = var40 + 1 & 4095; // L: 423
																		class182.directions[var37 - 1][var38 - 1] = 3; // L: 424
																		class182.distances[var37 - 1][var38 - 1] = var28; // L: 425
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) { // L: 418 419
																		break;
																	}

																	++var29; // L: 417
																}
															}

															if (var37 < 128 - var9 && var38 > 0 && class182.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + var9][var27 - 1] & 19136899) == 0) { // L: 427 428 429
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class182.bufferX[var40] = var17 + 1; // L: 434
																		class182.bufferY[var40] = var18 - 1; // L: 435
																		var40 = var40 + 1 & 4095; // L: 436
																		class182.directions[var37 + 1][var38 - 1] = 9; // L: 437
																		class182.distances[var37 + 1][var38 - 1] = var28; // L: 438
																		break;
																	}

																	if ((var25[var26 + var9][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var26 + var29][var27 - 1] & 19136911) != 0) { // L: 431 432
																		break;
																	}

																	++var29; // L: 430
																}
															}

															if (var37 > 0 && var38 < 128 - var9 && class182.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var9 + var27] & 19136824) == 0) { // L: 440 441 442
																for (var29 = 1; var29 < var9; ++var29) { // L: 443
																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 + var9] & 19137016) != 0) { // L: 444 445
																		continue label647;
																	}
																}

																class182.bufferX[var40] = var17 - 1; // L: 447
																class182.bufferY[var40] = var18 + 1; // L: 448
																var40 = var40 + 1 & 4095; // L: 449
																class182.directions[var37 - 1][var38 + 1] = 6; // L: 450
																class182.distances[var37 - 1][var38 + 1] = var28; // L: 451
															}
														} while(var37 >= 128 - var9); // L: 453
													} while(var38 >= 128 - var9);
												} while(class182.directions[var37 + 1][var38 + 1] != 0); // L: 454
											} while((var25[var9 + var26][var9 + var27] & 19136992) != 0); // L: 455

											for (var29 = 1; var29 < var9; ++var29) { // L: 456
												if ((var25[var26 + var29][var9 + var27] & 19137016) != 0 || (var25[var9 + var26][var29 + var27] & 19136995) != 0) { // L: 457 458
													continue label670;
												}
											}

											class182.bufferX[var40] = var17 + 1; // L: 460
											class182.bufferY[var40] = var18 + 1; // L: 461
											var40 = var40 + 1 & 4095; // L: 462
											class182.directions[var37 + 1][var38 + 1] = 12; // L: 463
											class182.distances[var37 + 1][var38 + 1] = var28; // L: 464
										}
									}

									var35 = var36; // L: 471
								}

								int var8;
								label727: {
									var16 = var5 - 64; // L: 473
									var17 = var6 - 64; // L: 474
									var18 = class182.field2115; // L: 475
									var37 = class182.field2121; // L: 476
									if (!var35) { // L: 477
										var38 = Integer.MAX_VALUE; // L: 479
										var21 = Integer.MAX_VALUE; // L: 480
										byte var39 = 10; // L: 481
										var40 = var11.approxDestinationX; // L: 482
										var24 = var11.approxDestinationY; // L: 483
										int var34 = var11.approxDestinationSizeX; // L: 484
										var26 = var11.approxDestinationSizeY; // L: 485

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) { // L: 486
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) { // L: 487
												var29 = var27 - var16; // L: 488
												int var30 = var28 - var17; // L: 489
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class182.distances[var29][var30] < 100) { // L: 490 491
													int var31 = 0; // L: 492
													if (var27 < var40) { // L: 493
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) { // L: 494
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0; // L: 495
													if (var28 < var24) { // L: 496
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) { // L: 497
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32; // L: 498
													if (var33 < var38 || var38 == var33 && class182.distances[var29][var30] < var21) { // L: 499
														var38 = var33; // L: 500
														var21 = class182.distances[var29][var30]; // L: 501
														var18 = var27; // L: 502
														var37 = var28; // L: 503
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) { // L: 509
											var8 = -1; // L: 510
											break label727;
										}
									}

									if (var18 == var5 && var37 == var6) { // L: 519
										var8 = 0; // L: 520
									} else {
										var20 = 0; // L: 523
										class182.bufferX[var20] = var18; // L: 526
										var38 = var20 + 1;
										class182.bufferY[var20] = var37; // L: 527

										for (var21 = var22 = class182.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class182.directions[var18 - var16][var37 - var17]) { // L: 528 529 539
											if (var22 != var21) { // L: 530
												var22 = var21; // L: 531
												class182.bufferX[var38] = var18; // L: 532
												class182.bufferY[var38++] = var37; // L: 533
											}

											if ((var21 & 2) != 0) { // L: 535
												++var18;
											} else if ((var21 & 8) != 0) { // L: 536
												--var18;
											}

											if ((var21 & 1) != 0) { // L: 537
												++var37;
											} else if ((var21 & 4) != 0) { // L: 538
												--var37;
											}
										}

										var40 = 0; // L: 541

										while (var38-- > 0) { // L: 542
											var13[var40] = class182.bufferX[var38]; // L: 543
											var14[var40++] = class182.bufferY[var38]; // L: 544
											if (var40 >= var13.length) { // L: 545
												break;
											}
										}

										var8 = var40; // L: 547
									}
								}

								var15 = var8; // L: 549
								if (var8 < 1) { // L: 550
									break;
								}

								var16 = 0; // L: 551

								while (true) {
									if (var16 >= var15 - 1) {
										break label686;
									}

									var4.method1315(Client.field920[var16], Client.field921[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) { // L: 228
								class182.directions[var15][var16] = 0; // L: 229
								class182.distances[var15][var16] = 99999999; // L: 230
							}

							++var15; // L: 227
						}
					}
				}

				this.method1315(var1, var2, var3); // L: 554
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 556

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "273949660"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 559
		super.field996 = 0; // L: 560
		super.field963 = 0; // L: 561
		super.pathX[0] = var1; // L: 562
		super.pathY[0] = var2; // L: 563
		int var3 = this.transformedSize(); // L: 564
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 565
		super.y = super.pathY[0] * 128 + var3 * 64; // L: 566
	} // L: 567

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-52932388"
	)
	final void method1315(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 570
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 571
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 572
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 573
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 574
		}

		super.pathX[0] = var1; // L: 576
		super.pathY[0] = var2; // L: 577
		super.pathTraversed[0] = var3; // L: 578
	} // L: 579

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1661589479"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 582
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIII)V",
		garbageValue = "715521473"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2679 == null) { // L: 928
			throw new RuntimeException(); // L: 929
		} else {
			var0.field2679[var1] = var2; // L: 931
			var0.field2664[var1] = var3; // L: 932
		}
	} // L: 933

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Lhe;",
		garbageValue = "1020097317"
	)
	static Widget method1351(Widget var0) {
		Widget var2 = var0; // L: 10553
		int var4 = FaceNormal.getWidgetFlags(var0); // L: 10556
		int var3 = var4 >> 17 & 7; // L: 10558
		int var5 = var3; // L: 10560
		Widget var1;
		if (var3 == 0) { // L: 10561
			var1 = null; // L: 10562
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2; // L: 10572
					break;
				}

				var2 = CollisionMap.getWidget(var2.parentId); // L: 10566
				if (var2 == null) { // L: 10567
					var1 = null; // L: 10568
					break; // L: 10569
				}

				++var6; // L: 10565
			}
		}

		Widget var7 = var1; // L: 10574
		if (var1 == null) { // L: 10575
			var7 = var0.parent;
		}

		return var7; // L: 10576
	}
}
