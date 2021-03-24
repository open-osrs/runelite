import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -542532009
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2086179455
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("h")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1032185691
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -844211389
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2099878383
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1111564727
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1006983921
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2021402629
	)
	int field637;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -141826323
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2121626467
	)
	int field639;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 123594343
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2053334325
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1294199975
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1259880177
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("u")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1563525681
	)
	@Export("team")
	int team;
	@ObfuscatedName("p")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1722408107
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1541347041
	)
	@Export("index")
	int index;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ay")
	boolean field652;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1937405249
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1915597601
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
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field652 = false;
	} // L: 51

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "937296924"
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
					int var8 = class281.ItemDefinition_get(var4[var5] - 512).team; // L: 74
					if (var8 != 0) { // L: 75
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5]; // L: 78

		for (var6 = 0; var6 < 5; ++var6) { // L: 79
			var7 = var1.readUnsignedByte(); // L: 80
			if (var7 < 0 || var7 >= class105.field1339[var6].length) { // L: 81
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), Message.loginType); // L: 99
		this.clearIsFriend(); // L: 100
		this.clearIsInClanChat(); // L: 101
		if (this == UserComparator9.localPlayer) { // L: 102
			class1.localPlayerName = this.username.getName();
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
		garbageValue = "644215303"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 112
			this.checkIsFriend(); // L: 113
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 115
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511487286"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 119
	} // L: 120

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "667815611"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InterfaceParent.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 123
	} // L: 124

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "34388997"
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
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 134
	} // L: 135

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = WorldMapID.clanChat != null && WorldMapID.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 138
	} // L: 139

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1075941627"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class90.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 142 143 145
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "127"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 149
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? InterfaceParent.SequenceDefinition_get(super.sequence) : null; // L: 150
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : InterfaceParent.SequenceDefinition_get(super.movementSequence); // L: 151
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 152
			if (var3 == null) { // L: 153
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 154
				super.defaultHeight = var3.height; // L: 155
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 156
					var4 = AbstractUserComparator.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 157
					if (var4 != null) { // L: 158
						var4.offsetBy(0, -super.field994, 0); // L: 159
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
						var4.offsetBy(this.field637 - super.x, this.tileHeight2 - this.tileHeight, this.field639 - super.y); // L: 168
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

						var4.offsetBy(super.x - this.field637, this.tileHeight - this.tileHeight2, super.y - this.field639); // L: 191
					}
				}

				var3.isSingleTile = true; // L: 194
				return var3; // L: 195
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1833516243"
	)
	final void method1327(int var1, int var2, byte var3) {
		if (super.sequence != -1 && InterfaceParent.SequenceDefinition_get(super.sequence).field3565 == 1) { // L: 199
			super.sequence = -1;
		}

		super.field981 = -1; // L: 200
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 201
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 202
				if (var3 == 2) { // L: 204
					Player var4 = this; // L: 205
					int var5 = super.pathX[0]; // L: 207
					int var6 = super.pathY[0]; // L: 208
					int var7 = this.transformedSize(); // L: 209
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 210 211
						int var9 = this.transformedSize(); // L: 213
						RouteStrategy var10 = GrandExchangeOfferAgeComparator.method214(var1, var2); // L: 214
						CollisionMap var11 = Client.collisionMaps[this.plane]; // L: 215
						int[] var12 = Client.field708; // L: 216
						int[] var13 = Client.field859; // L: 217
						int var14 = 0;

						label550:
						while (true) {
							int var15;
							if (var14 >= 128) {
								int var16;
								int var17;
								byte var19;
								int var20;
								int var21;
								int var23;
								int var25;
								int var26;
								int var27;
								int var28;
								boolean var34;
								int var36;
								int var37;
								int var39;
								if (var9 == 1) { // L: 226
									var34 = MusicPatchPcmStream.method4098(var5, var6, var10, var11);
								} else if (var9 == 2) { // L: 227
									var34 = WorldMapElement.method4591(var5, var6, var10, var11);
								} else {
									var16 = var5; // L: 231
									var17 = var6; // L: 232
									byte var18 = 64; // L: 233
									var19 = 64; // L: 234
									var20 = var5 - var18; // L: 235
									var21 = var6 - var19; // L: 236
									class182.directions[var18][var19] = 99; // L: 237
									class182.distances[var18][var19] = 0; // L: 238
									byte var22 = 0; // L: 239
									var23 = 0; // L: 240
									class182.bufferX[var22] = var5; // L: 241
									var39 = var22 + 1;
									class182.bufferY[var22] = var6;
									int[][] var24 = var11.flags;

									boolean var35;
									label536:
									while (true) {
										label534:
										while (true) {
											do {
												do {
													do {
														label511:
														do {
															if (var23 == var39) { // L: 244
																class182.field2118 = var16; // L: 364
																class182.field2124 = var17; // L: 365
																var35 = false; // L: 366
																break label536;
															}

															var16 = class182.bufferX[var23]; // L: 245
															var17 = class182.bufferY[var23]; // L: 246
															var23 = var23 + 1 & 4095; // L: 247
															var36 = var16 - var20; // L: 248
															var37 = var17 - var21; // L: 249
															var25 = var16 - var11.xInset; // L: 250
															var26 = var17 - var11.yInset; // L: 251
															if (var10.hasArrived(var9, var16, var17, var11)) { // L: 252
																class182.field2118 = var16; // L: 253
																class182.field2124 = var17; // L: 254
																var35 = true; // L: 255
																break label536;
															}

															var27 = class182.distances[var36][var37] + 1; // L: 258
															if (var36 > 0 && class182.directions[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136782) == 0 && (var24[var25 - 1][var9 + var26 - 1] & 19136824) == 0) { // L: 259 260 261 262
																var28 = 1;

																while (true) {
																	if (var28 >= var9 - 1) {
																		class182.bufferX[var39] = var16 - 1; // L: 266
																		class182.bufferY[var39] = var17; // L: 267
																		var39 = var39 + 1 & 4095; // L: 268
																		class182.directions[var36 - 1][var37] = 2; // L: 269
																		class182.distances[var36 - 1][var37] = var27; // L: 270
																		break;
																	}

																	if ((var24[var25 - 1][var28 + var26] & 19136830) != 0) { // L: 264
																		break;
																	}

																	++var28; // L: 263
																}
															}

															if (var36 < 128 - var9 && class182.directions[var36 + 1][var37] == 0 && (var24[var9 + var25][var26] & 19136899) == 0 && (var24[var25 + var9][var26 + var9 - 1] & 19136992) == 0) { // L: 272 273 274 275
																var28 = 1;

																while (true) {
																	if (var28 >= var9 - 1) {
																		class182.bufferX[var39] = var16 + 1; // L: 279
																		class182.bufferY[var39] = var17; // L: 280
																		var39 = var39 + 1 & 4095; // L: 281
																		class182.directions[var36 + 1][var37] = 8; // L: 282
																		class182.distances[var36 + 1][var37] = var27; // L: 283
																		break;
																	}

																	if ((var24[var25 + var9][var28 + var26] & 19136995) != 0) { // L: 277
																		break;
																	}

																	++var28; // L: 276
																}
															}

															if (var37 > 0 && class182.directions[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136782) == 0 && (var24[var25 + var9 - 1][var26 - 1] & 19136899) == 0) { // L: 285 286 287 288
																var28 = 1;

																while (true) {
																	if (var28 >= var9 - 1) {
																		class182.bufferX[var39] = var16; // L: 292
																		class182.bufferY[var39] = var17 - 1; // L: 293
																		var39 = var39 + 1 & 4095; // L: 294
																		class182.directions[var36][var37 - 1] = 1; // L: 295
																		class182.distances[var36][var37 - 1] = var27; // L: 296
																		break;
																	}

																	if ((var24[var28 + var25][var26 - 1] & 19136911) != 0) { // L: 290
																		break;
																	}

																	++var28; // L: 289
																}
															}

															if (var37 < 128 - var9 && class182.directions[var36][var37 + 1] == 0 && (var24[var25][var26 + var9] & 19136824) == 0 && (var24[var25 + var9 - 1][var9 + var26] & 19136992) == 0) { // L: 298 299 300 301
																var28 = 1;

																while (true) {
																	if (var28 >= var9 - 1) {
																		class182.bufferX[var39] = var16; // L: 305
																		class182.bufferY[var39] = var17 + 1; // L: 306
																		var39 = var39 + 1 & 4095; // L: 307
																		class182.directions[var36][var37 + 1] = 4; // L: 308
																		class182.distances[var36][var37 + 1] = var27; // L: 309
																		break;
																	}

																	if ((var24[var28 + var25][var26 + var9] & 19137016) != 0) { // L: 303
																		break;
																	}

																	++var28; // L: 302
																}
															}

															if (var36 > 0 && var37 > 0 && class182.directions[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0) { // L: 311 312 313
																var28 = 1;

																while (true) {
																	if (var28 >= var9) {
																		class182.bufferX[var39] = var16 - 1; // L: 318
																		class182.bufferY[var39] = var17 - 1; // L: 319
																		var39 = var39 + 1 & 4095; // L: 320
																		class182.directions[var36 - 1][var37 - 1] = 3; // L: 321
																		class182.distances[var36 - 1][var37 - 1] = var27; // L: 322
																		break;
																	}

																	if ((var24[var25 - 1][var28 + (var26 - 1)] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var26 - 1] & 19136911) != 0) { // L: 315 316
																		break;
																	}

																	++var28; // L: 314
																}
															}

															if (var36 < 128 - var9 && var37 > 0 && class182.directions[var36 + 1][var37 - 1] == 0 && (var24[var25 + var9][var26 - 1] & 19136899) == 0) { // L: 324 325 326
																var28 = 1;

																while (true) {
																	if (var28 >= var9) {
																		class182.bufferX[var39] = var16 + 1; // L: 331
																		class182.bufferY[var39] = var17 - 1; // L: 332
																		var39 = var39 + 1 & 4095; // L: 333
																		class182.directions[var36 + 1][var37 - 1] = 9; // L: 334
																		class182.distances[var36 + 1][var37 - 1] = var27; // L: 335
																		break;
																	}

																	if ((var24[var9 + var25][var28 + (var26 - 1)] & 19136995) != 0 || (var24[var25 + var28][var26 - 1] & 19136911) != 0) { // L: 328 329
																		break;
																	}

																	++var28; // L: 327
																}
															}

															if (var36 > 0 && var37 < 128 - var9 && class182.directions[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + var9] & 19136824) == 0) { // L: 337 338 339
																for (var28 = 1; var28 < var9; ++var28) { // L: 340
																	if ((var24[var25 - 1][var26 + var28] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var9 + var26] & 19137016) != 0) { // L: 341 342
																		continue label511;
																	}
																}

																class182.bufferX[var39] = var16 - 1; // L: 344
																class182.bufferY[var39] = var17 + 1; // L: 345
																var39 = var39 + 1 & 4095; // L: 346
																class182.directions[var36 - 1][var37 + 1] = 6; // L: 347
																class182.distances[var36 - 1][var37 + 1] = var27; // L: 348
															}
														} while(var36 >= 128 - var9); // L: 350
													} while(var37 >= 128 - var9);
												} while(class182.directions[var36 + 1][var37 + 1] != 0); // L: 351
											} while((var24[var25 + var9][var9 + var26] & 19136992) != 0); // L: 352

											for (var28 = 1; var28 < var9; ++var28) { // L: 353
												if ((var24[var25 + var28][var26 + var9] & 19137016) != 0 || (var24[var9 + var25][var26 + var28] & 19136995) != 0) { // L: 354 355
													continue label534;
												}
											}

											class182.bufferX[var39] = var16 + 1; // L: 357
											class182.bufferY[var39] = var17 + 1; // L: 358
											var39 = var39 + 1 & 4095; // L: 359
											class182.directions[var36 + 1][var37 + 1] = 12; // L: 360
											class182.distances[var36 + 1][var37 + 1] = var27; // L: 361
										}
									}

									var34 = var35; // L: 368
								}

								int var8;
								label589: {
									var15 = var5 - 64; // L: 370
									var16 = var6 - 64; // L: 371
									var17 = class182.field2118; // L: 372
									var36 = class182.field2124; // L: 373
									if (!var34) { // L: 374
										var37 = Integer.MAX_VALUE; // L: 376
										var20 = Integer.MAX_VALUE; // L: 377
										byte var38 = 10; // L: 378
										var39 = var10.approxDestinationX; // L: 379
										var23 = var10.approxDestinationY; // L: 380
										int var33 = var10.approxDestinationSizeX; // L: 381
										var25 = var10.approxDestinationSizeY; // L: 382

										for (var26 = var39 - var38; var26 <= var39 + var38; ++var26) { // L: 383
											for (var27 = var23 - var38; var27 <= var38 + var23; ++var27) { // L: 384
												var28 = var26 - var15; // L: 385
												int var29 = var27 - var16; // L: 386
												if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class182.distances[var28][var29] < 100) { // L: 387 388
													int var30 = 0; // L: 389
													if (var26 < var39) { // L: 390
														var30 = var39 - var26;
													} else if (var26 > var33 + var39 - 1) { // L: 391
														var30 = var26 - (var39 + var33 - 1);
													}

													int var31 = 0; // L: 392
													if (var27 < var23) { // L: 393
														var31 = var23 - var27;
													} else if (var27 > var25 + var23 - 1) { // L: 394
														var31 = var27 - (var23 + var25 - 1);
													}

													int var32 = var31 * var31 + var30 * var30; // L: 395
													if (var32 < var37 || var37 == var32 && class182.distances[var28][var29] < var20) { // L: 396
														var37 = var32; // L: 397
														var20 = class182.distances[var28][var29]; // L: 398
														var17 = var26; // L: 399
														var36 = var27; // L: 400
													}
												}
											}
										}

										if (var37 == Integer.MAX_VALUE) { // L: 406
											var8 = -1; // L: 407
											break label589;
										}
									}

									if (var5 == var17 && var6 == var36) { // L: 416
										var8 = 0; // L: 417
									} else {
										var19 = 0; // L: 420
										class182.bufferX[var19] = var17; // L: 423
										var37 = var19 + 1;
										class182.bufferY[var19] = var36; // L: 424

										for (var20 = var21 = class182.directions[var17 - var15][var36 - var16]; var17 != var5 || var6 != var36; var20 = class182.directions[var17 - var15][var36 - var16]) { // L: 425 426 436
											if (var20 != var21) { // L: 427
												var21 = var20; // L: 428
												class182.bufferX[var37] = var17; // L: 429
												class182.bufferY[var37++] = var36; // L: 430
											}

											if ((var20 & 2) != 0) { // L: 432
												++var17;
											} else if ((var20 & 8) != 0) { // L: 433
												--var17;
											}

											if ((var20 & 1) != 0) { // L: 434
												++var36;
											} else if ((var20 & 4) != 0) { // L: 435
												--var36;
											}
										}

										var39 = 0; // L: 438

										while (var37-- > 0) { // L: 439
											var12[var39] = class182.bufferX[var37]; // L: 440
											var13[var39++] = class182.bufferY[var37]; // L: 441
											if (var39 >= var12.length) { // L: 442
												break;
											}
										}

										var8 = var39; // L: 444
									}
								}

								var14 = var8; // L: 446
								if (var8 < 1) { // L: 447
									break;
								}

								var15 = 0; // L: 448

								while (true) {
									if (var15 >= var14 - 1) {
										break label550;
									}

									var4.method1329(Client.field708[var15], Client.field859[var15], (byte)2);
									++var15;
								}
							}

							for (var15 = 0; var15 < 128; ++var15) { // L: 220
								class182.directions[var14][var15] = 0; // L: 221
								class182.distances[var14][var15] = 99999999; // L: 222
							}

							++var14; // L: 219
						}
					}
				}

				this.method1329(var1, var2, var3); // L: 451
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 453

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-101"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 456
		super.field1012 = 0; // L: 457
		super.field989 = 0; // L: 458
		super.pathX[0] = var1; // L: 459
		super.pathY[0] = var2; // L: 460
		int var3 = this.transformedSize(); // L: 461
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 462
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 463
	} // L: 464

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-498567231"
	)
	final void method1329(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 467
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 468
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 469
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 470
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 471
		}

		super.pathX[0] = var1; // L: 473
		super.pathY[0] = var2; // L: 474
		super.pathTraversed[0] = var3; // L: 475
	} // L: 476

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-251916247"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 479
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lcq;",
		garbageValue = "1"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "4"
	)
	public static int method1317(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 45

		for (int var4 = var1; var4 < var2; ++var4) { // L: 46
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 47
		}

		var3 = ~var3; // L: 49
		return var3; // L: 50
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1132112001"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 7815
		Client.isMenuOpen = false; // L: 7816
		Client.menuActions[0] = "Cancel"; // L: 7818
		Client.menuTargets[0] = ""; // L: 7819
		Client.menuOpcodes[0] = 1006; // L: 7820
		Client.menuShiftClick[0] = false; // L: 7821
		Client.menuOptionsCount = 1; // L: 7822
	} // L: 7823

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lhz;B)Ljava/lang/String;",
		garbageValue = "101"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var0)) == 0) { // L: 11507
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11508 11509 11511
		}
	}
}
