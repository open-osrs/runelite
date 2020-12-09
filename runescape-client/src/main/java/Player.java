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
	PlayerAppearance appearance;
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
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field631 = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-58"
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
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					int var8 = SecureRandomCallable.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= WorldMapScaleHandler.field366[var6].length) {
				var7 = 0;
			}

			var9[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), GrandExchangeOfferUnitPriceComparator.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		if (this == PlayerAppearance.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		if (this.appearance == null) {
			this.appearance = new PlayerAppearance();
		}

		this.appearance.update(var4, var9, var2 == 1, var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "338154305"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-730921547"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "886706251"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = MilliClock.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1880119871"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "327273294"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = WorldMapArea.clanChat != null && WorldMapArea.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-20"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? WorldMapIcon_0.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ParamDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : ParamDefinition.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = TileItem.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field979, 0);
						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field634 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field626 * 4096 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}

						var4.offsetBy(super.x - this.field634 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field626 * 4096);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1635620178"
	)
	final void method1313(int var1, int var2, byte var3) {
		if (super.sequence != -1 && ParamDefinition.SequenceDefinition_get(super.sequence).field3555 == 1) {
			super.sequence = -1;
		}

		super.field959 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var9 = this.transformedSize();
						Client.field919.approxDestinationX = var1;
						Client.field919.approxDestinationY = var2;
						Client.field919.approxDestinationSizeX = 1;
						Client.field919.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field919;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field920;
						int[] var14 = Client.field921;
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
								if (var9 == 1) {
									var17 = var5;
									var18 = var6;
									var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class182.directions[var19][var20] = 99;
									class182.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class182.bufferX[var23] = var5;
									var40 = var23 + 1;
									class182.bufferY[var23] = var6;
									var25 = var12.flags;

									while (true) {
										if (var24 == var40) {
											class182.field2115 = var17;
											class182.field2121 = var18;
											var36 = false;
											break;
										}

										var17 = class182.bufferX[var24];
										var18 = class182.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(1, var17, var18, var12)) {
											class182.field2115 = var17;
											class182.field2121 = var18;
											var36 = true;
											break;
										}

										var28 = class182.distances[var37][var38] + 1;
										if (var37 > 0 && class182.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class182.bufferX[var40] = var17 - 1;
											class182.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 - 1][var38] = 2;
											class182.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 127 && class182.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class182.bufferX[var40] = var17 + 1;
											class182.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 + 1][var38] = 8;
											class182.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class182.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class182.bufferX[var40] = var17;
											class182.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37][var38 - 1] = 1;
											class182.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 127 && class182.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class182.bufferX[var40] = var17;
											class182.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37][var38 + 1] = 4;
											class182.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class182.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class182.bufferX[var40] = var17 - 1;
											class182.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 - 1][var38 - 1] = 3;
											class182.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 127 && var38 > 0 && class182.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class182.bufferX[var40] = var17 + 1;
											class182.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 + 1][var38 - 1] = 9;
											class182.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 127 && class182.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class182.bufferX[var40] = var17 - 1;
											class182.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 - 1][var38 + 1] = 6;
											class182.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 127 && var38 < 127 && class182.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class182.bufferX[var40] = var17 + 1;
											class182.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 + 1][var38 + 1] = 12;
											class182.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else if (var9 == 2) {
									var35 = class231.method4152(var5, var6, var10, var12);
								} else {
									var17 = var5;
									var18 = var6;
									var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class182.directions[var19][var20] = 99;
									class182.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class182.bufferX[var23] = var5;
									var40 = var23 + 1;
									class182.bufferY[var23] = var6;
									var25 = var12.flags;

									label672:
									while (true) {
										label670:
										while (true) {
											do {
												do {
													do {
														label647:
														do {
															if (var24 == var40) {
																class182.field2115 = var17;
																class182.field2121 = var18;
																var36 = false;
																break label672;
															}

															var17 = class182.bufferX[var24];
															var18 = class182.bufferY[var24];
															var24 = var24 + 1 & 4095;
															var37 = var17 - var21;
															var38 = var18 - var22;
															var26 = var17 - var12.xInset;
															var27 = var18 - var12.yInset;
															if (var11.hasArrived(var9, var17, var18, var12)) {
																class182.field2115 = var17;
																class182.field2121 = var18;
																var36 = true;
																break label672;
															}

															var28 = class182.distances[var37][var38] + 1;
															if (var37 > 0 && class182.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + var9 - 1] & 19136824) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17 - 1;
																		class182.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37 - 1][var38] = 2;
																		class182.distances[var37 - 1][var38] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var9 && class182.directions[var37 + 1][var38] == 0 && (var25[var9 + var26][var27] & 19136899) == 0 && (var25[var26 + var9][var9 + var27 - 1] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17 + 1;
																		class182.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37 + 1][var38] = 8;
																		class182.distances[var37 + 1][var38] = var28;
																		break;
																	}

																	if ((var25[var26 + var9][var27 + var29] & 19136995) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 > 0 && class182.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var9 + var26 - 1][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17;
																		class182.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37][var38 - 1] = 1;
																		class182.distances[var37][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 + var29][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var38 < 128 - var9 && class182.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + var9] & 19136824) == 0 && (var25[var9 + var26 - 1][var9 + var27] & 19136992) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9 - 1) {
																		class182.bufferX[var40] = var17;
																		class182.bufferY[var40] = var18 + 1;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37][var38 + 1] = 4;
																		class182.distances[var37][var38 + 1] = var28;
																		break;
																	}

																	if ((var25[var29 + var26][var9 + var27] & 19137016) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 > 0 && class182.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class182.bufferX[var40] = var17 - 1;
																		class182.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37 - 1][var38 - 1] = 3;
																		class182.distances[var37 - 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 < 128 - var9 && var38 > 0 && class182.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + var9][var27 - 1] & 19136899) == 0) {
																var29 = 1;

																while (true) {
																	if (var29 >= var9) {
																		class182.bufferX[var40] = var17 + 1;
																		class182.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class182.directions[var37 + 1][var38 - 1] = 9;
																		class182.distances[var37 + 1][var38 - 1] = var28;
																		break;
																	}

																	if ((var25[var26 + var9][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var26 + var29][var27 - 1] & 19136911) != 0) {
																		break;
																	}

																	++var29;
																}
															}

															if (var37 > 0 && var38 < 128 - var9 && class182.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var9 + var27] & 19136824) == 0) {
																for (var29 = 1; var29 < var9; ++var29) {
																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 + var9] & 19137016) != 0) {
																		continue label647;
																	}
																}

																class182.bufferX[var40] = var17 - 1;
																class182.bufferY[var40] = var18 + 1;
																var40 = var40 + 1 & 4095;
																class182.directions[var37 - 1][var38 + 1] = 6;
																class182.distances[var37 - 1][var38 + 1] = var28;
															}
														} while(var37 >= 128 - var9);
													} while(var38 >= 128 - var9);
												} while(class182.directions[var37 + 1][var38 + 1] != 0);
											} while((var25[var9 + var26][var9 + var27] & 19136992) != 0);

											for (var29 = 1; var29 < var9; ++var29) {
												if ((var25[var26 + var29][var9 + var27] & 19137016) != 0 || (var25[var9 + var26][var29 + var27] & 19136995) != 0) {
													continue label670;
												}
											}

											class182.bufferX[var40] = var17 + 1;
											class182.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class182.directions[var37 + 1][var38 + 1] = 12;
											class182.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								}

								int var8;
								label727: {
									var16 = var5 - 64;
									var17 = var6 - 64;
									var18 = class182.field2115;
									var37 = class182.field2121;
									if (!var35) {
										var38 = Integer.MAX_VALUE;
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX;
										var24 = var11.approxDestinationY;
										int var34 = var11.approxDestinationSizeX;
										var26 = var11.approxDestinationSizeY;

										for (var27 = var40 - var39; var27 <= var39 + var40; ++var27) {
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class182.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var40 + var34 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var24 + var26 - 1);
													}

													int var33 = var31 * var31 + var32 * var32;
													if (var33 < var38 || var38 == var33 && class182.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class182.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label727;
										}
									}

									if (var18 == var5 && var37 == var6) {
										var8 = 0;
									} else {
										var20 = 0;
										class182.bufferX[var20] = var18;
										var38 = var20 + 1;
										class182.bufferY[var20] = var37;

										for (var21 = var22 = class182.directions[var18 - var16][var37 - var17]; var18 != var5 || var37 != var6; var21 = class182.directions[var18 - var16][var37 - var17]) {
											if (var22 != var21) {
												var22 = var21;
												class182.bufferX[var38] = var18;
												class182.bufferY[var38++] = var37;
											}

											if ((var21 & 2) != 0) {
												++var18;
											} else if ((var21 & 8) != 0) {
												--var18;
											}

											if ((var21 & 1) != 0) {
												++var37;
											} else if ((var21 & 4) != 0) {
												--var37;
											}
										}

										var40 = 0;

										while (var38-- > 0) {
											var13[var40] = class182.bufferX[var38];
											var14[var40++] = class182.bufferY[var38];
											if (var40 >= var13.length) {
												break;
											}
										}

										var8 = var40;
									}
								}

								var15 = var8;
								if (var8 < 1) {
									break;
								}

								var16 = 0;

								while (true) {
									if (var16 >= var15 - 1) {
										break label686;
									}

									var4.method1315(Client.field920[var16], Client.field921[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class182.directions[var15][var16] = 0;
								class182.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method1315(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "273949660"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field996 = 0;
		super.field963 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-52932388"
	)
	final void method1315(int var1, int var2, byte var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1661589479"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIII)V",
		garbageValue = "715521473"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2679 == null) {
			throw new RuntimeException();
		} else {
			var0.field2679[var1] = var2;
			var0.field2664[var1] = var3;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Lhe;",
		garbageValue = "1020097317"
	)
	static Widget method1351(Widget var0) {
		Widget var2 = var0;
		int var4 = FaceNormal.getWidgetFlags(var0);
		int var3 = var4 >> 17 & 7;
		int var5 = var3;
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2;
					break;
				}

				var2 = CollisionMap.getWidget(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var6;
			}
		}

		Widget var7 = var1;
		if (var1 == null) {
			var7 = var0.parent;
		}

		return var7;
	}
}
