import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1051269069
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1768904761
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("k")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1150967033
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1021404595
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 78214381
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 918727087
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1671660339
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -924564511
	)
	int field1087;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 201682335
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -236914309
	)
	int field1070;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1035892391
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2014633579
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1248260379
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1768054799
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("z")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1848750593
	)
	@Export("team")
	int team;
	@ObfuscatedName("o")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1789077761
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2000058311
	)
	@Export("index")
	int index;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ad")
	boolean field1060;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1518425549
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1990098543
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
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1060 = false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1541664871"
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
					var8 = class87.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= class185.field2101[var6].length) {
				var7 = 0;
			}

			var24[var6] = var7;
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapSectionType.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2127();
		if (this == class67.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class150[] var25 = null;
		boolean var26 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var26 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var25 = new class150[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						int var14 = var4[var9] - 512;
						int var15 = var1.readUnsignedByte();
						boolean var16 = (var15 & 1) != 0;
						boolean var17 = (var15 & 2) != 0;
						class150 var18 = new class150(var14);
						int var19;
						int[] var20;
						boolean var21;
						int var22;
						short var23;
						if (var16) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1606 != null && var20.length == var18.field1606.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1606[var20[var22]] = var23;
									}
								}
							}
						}

						if (var17) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1607 != null && var20.length == var18.field1607.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1607[var20[var22]] = var23;
									}
								}
							}
						}

						var25[var9] = var18;
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4954(var4, var25, var26, var24, var2 == 1, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lhl;",
		garbageValue = "126"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? KitDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : KitDefinition.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = class21.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1147, 0);
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
						var4.offsetBy(this.field1087 - super.x, this.tileHeight2 - this.tileHeight, this.field1070 - super.y);
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

						var4.offsetBy(super.x - this.field1087, this.tileHeight - this.tileHeight2, super.y - this.field1070);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1896228975"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-326576513"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = Message.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035950911"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-49500709"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class264.friendsChat != null && class264.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1547987750"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 2; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2584(this.username.getName()) != -1) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2127() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1535473073"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16777215"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class112.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIBB)V",
		garbageValue = "39"
	)
	final void method2092(int var1, int var2, byte var3) {
		if (super.sequence != -1 && KitDefinition.SequenceDefinition_get(super.sequence).field1960 == 1) {
			super.sequence = -1;
		}

		super.field1134 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var9 = this.transformedSize();
						Client.field649.approxDestinationX = var1;
						Client.field649.approxDestinationY = var2;
						Client.field649.approxDestinationSizeX = 1;
						Client.field649.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var10 = Client.field649;
						ApproximateRouteStrategy var11 = var10;
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field668;
						int[] var14 = Client.field491;
						int var15 = 0;

						label378:
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
								if (var9 == 1) {
									var17 = var5;
									var18 = var6;
									byte var19 = 64;
									var20 = 64;
									var21 = var5 - var19;
									var22 = var6 - var20;
									class174.directions[var19][var20] = 99;
									class174.distances[var19][var20] = 0;
									byte var23 = 0;
									var24 = 0;
									class174.bufferX[var23] = var5;
									var40 = var23 + 1;
									class174.bufferY[var23] = var6;
									int[][] var25 = var12.flags;

									boolean var36;
									while (true) {
										if (var24 == var40) {
											class318.field3870 = var17;
											class174.field1994 = var18;
											var36 = false;
											break;
										}

										var17 = class174.bufferX[var24];
										var18 = class174.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(1, var17, var18, var12)) {
											class318.field3870 = var17;
											class174.field1994 = var18;
											var36 = true;
											break;
										}

										var28 = class174.distances[var37][var38] + 1;
										if (var37 > 0 && class174.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38] = 2;
											class174.distances[var37 - 1][var38] = var28;
										}

										if (var37 < 127 && class174.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38] = 8;
											class174.distances[var37 + 1][var38] = var28;
										}

										if (var38 > 0 && class174.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37][var38 - 1] = 1;
											class174.distances[var37][var38 - 1] = var28;
										}

										if (var38 < 127 && class174.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37][var38 + 1] = 4;
											class174.distances[var37][var38 + 1] = var28;
										}

										if (var37 > 0 && var38 > 0 && class174.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38 - 1] = 3;
											class174.distances[var37 - 1][var38 - 1] = var28;
										}

										if (var37 < 127 && var38 > 0 && class174.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38 - 1] = 9;
											class174.distances[var37 + 1][var38 - 1] = var28;
										}

										if (var37 > 0 && var38 < 127 && class174.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17 - 1;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 - 1][var38 + 1] = 6;
											class174.distances[var37 - 1][var38 + 1] = var28;
										}

										if (var37 < 127 && var38 < 127 && class174.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class174.bufferX[var40] = var17 + 1;
											class174.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class174.directions[var37 + 1][var38 + 1] = 12;
											class174.distances[var37 + 1][var38 + 1] = var28;
										}
									}

									var35 = var36;
								} else if (var9 == 2) {
									var35 = Canvas.method381(var5, var6, var10, var12);
								} else {
									var35 = class129.method2673(var5, var6, var9, var10, var12);
								}

								int var8;
								label401: {
									var16 = var5 - 64;
									var17 = var6 - 64;
									var18 = class318.field3870;
									var37 = class174.field1994;
									if (!var35) {
										var38 = Integer.MAX_VALUE;
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX;
										var24 = var11.approxDestinationY;
										int var34 = var11.approxDestinationSizeX;
										var26 = var11.approxDestinationSizeY;

										for (var27 = var40 - var39; var27 <= var40 + var39; ++var27) {
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												int var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class174.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var34 + var40 - 1);
													}

													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var24 + var26 - 1) {
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var31 * var31 + var32 * var32;
													if (var33 < var38 || var38 == var33 && class174.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class174.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}

										if (var38 == Integer.MAX_VALUE) {
											var8 = -1;
											break label401;
										}
									}

									if (var5 == var18 && var37 == var6) {
										var8 = 0;
									} else {
										var20 = 0;
										class174.bufferX[var20] = var18;
										var38 = var20 + 1;
										class174.bufferY[var20] = var37;

										for (var21 = var22 = class174.directions[var18 - var16][var37 - var17]; var5 != var18 || var6 != var37; var21 = class174.directions[var18 - var16][var37 - var17]) {
											if (var22 != var21) {
												var22 = var21;
												class174.bufferX[var38] = var18;
												class174.bufferY[var38++] = var37;
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
											var13[var40] = class174.bufferX[var38];
											var14[var40++] = class174.bufferY[var38];
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
										break label378;
									}

									var4.method2094(Client.field668[var16], Client.field491[var16], (byte)2);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) {
								class174.directions[var15][var16] = 0;
								class174.distances[var15][var16] = 99999999;
							}

							++var15;
						}
					}
				}

				this.method2094(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-725905590"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1129 = 0;
		super.field1164 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "1407598778"
	)
	final void method2094(int var1, int var2, byte var3) {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841514183"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Loy;ILci;II)V",
		garbageValue = "-1673892976"
	)
	static final void method2133(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1;
		int var5;
		if ((var3 & 8192) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 1024) != 0) {
			Players.field1245[var1] = var0.readByte();
		}

		if ((var3 & 4) != 0) {
			var2.targetIndex = var0.method6933();
			if (var2.targetIndex == 65535) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 256) != 0) {
			var2.field1148 = var0.method6915();
			var2.field1126 = var0.method6915();
			var2.field1149 = var0.method6929();
			var2.field1125 = var0.method6929();
			var2.field1145 = var0.method6933() + Client.cycle;
			var2.field1165 = var0.method6933() + Client.cycle;
			var2.field1151 = var0.method6934();
			if (var2.field1060) {
				var2.field1148 += var2.tileX;
				var2.field1126 += var2.tileY;
				var2.field1149 += var2.tileX;
				var2.field1125 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1148 += var2.pathX[0];
				var2.field1126 += var2.pathY[0];
				var2.field1149 += var2.pathX[0];
				var2.field1125 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1129 = 0;
		}

		if ((var3 & 16) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				GraphicsDefaults.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class67.localPlayer) {
				GraphicsDefaults.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.isAutoChatting = false;
			var2.overheadTextColor = 0;
			var2.overheadTextEffect = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		int var6;
		int var8;
		int var9;
		int var12;
		if ((var3 & 32) != 0) {
			var5 = var0.method6925();
			int var7;
			int var10;
			int var15;
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var7 = var0.readUShortSmart();
					if (var7 == 32767) {
						var7 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var7 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var7 = -1;
					}

					var15 = var0.readUShortSmart();
					var2.addHitSplat(var7, var9, var8, var10, Client.cycle, var15);
				}
			}

			var6 = var0.readUnsignedByte();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var15 = var0.readUnsignedByte();
						var12 = var9 > 0 ? var0.method6925() : var15;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var15, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 8) != 0) {
			var5 = var0.method6933();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.readUnsignedByte();
			SpotAnimationDefinition.performPlayerAnimation(var2, var5, var6);
		}

		if ((var3 & 128) != 0) {
			var5 = var0.method7059();
			PlayerType var13 = (PlayerType)class128.findEnumerated(class19.PlayerType_values(), var0.readUnsignedByte());
			boolean var17 = var0.method6927() == 1;
			var8 = var0.method6926();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var18 = false;
				if (var13.isUser && Message.friendSystem.isIgnored(var2.username)) {
					var18 = true;
				}

				if (!var18 && Client.field559 == 0 && !var2.isHidden) {
					Players.field1259.offset = 0;
					var0.method7021(Players.field1259.array, 0, var8);
					Players.field1259.offset = 0;
					String var11 = AbstractFont.escapeBrackets(Tiles.method2025(SecureRandomFuture.method1951(Players.field1259)));
					var2.overheadText = var11.trim();
					var2.overheadTextColor = var5 >> 8;
					var2.overheadTextEffect = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.isAutoChatting = var17;
					var2.field1121 = var2 != class67.localPlayer && var13.isUser && "" != Client.field550 && var11.toLowerCase().indexOf(Client.field550) == -1;
					if (var13.isPrivileged) {
						var12 = var17 ? 91 : 1;
					} else {
						var12 = var17 ? 90 : 2;
					}

					if (var13.modIcon != -1) {
						GraphicsDefaults.addGameMessage(var12, ReflectionCheck.method1064(var13.modIcon) + var2.username.getName(), var11);
					} else {
						GraphicsDefaults.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 1) != 0) {
			var2.field1134 = var0.method6934();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1134;
				var2.field1134 = -1;
			}
		}

		if ((var3 & 4096) != 0) {
			var2.spotAnimation = var0.method7059();
			var5 = var0.method6876();
			var2.field1147 = var5 >> 16;
			var2.field1105 = (var5 & 65535) + Client.cycle;
			var2.spotAnimationFrame = 0;
			var2.spotAnimationFrameCycle = 0;
			if (var2.field1105 > Client.cycle) {
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) {
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 2048) != 0) {
			var4 = var0.method6915();
		}

		if ((var3 & 2) != 0) {
			var5 = var0.method6927();
			byte[] var19 = new byte[var5];
			Buffer var14 = new Buffer(var19);
			var0.method6947(var19, 0, var5);
			Players.field1248[var1] = var14;
			var2.read(var14);
		}

		if (var2.field1060) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var16;
				if (var4 != -1) {
					var16 = var4;
				} else {
					var16 = Players.field1245[var1];
				}

				var2.method2092(var2.tileX, var2.tileY, var16);
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;Llt;B)V",
		garbageValue = "91"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Huffman.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class78.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var9;
		int var11;
		int var12;
		int var25;
		int var26;
		int var28;
		int var34;
		if (Login.worldSelectOpen) {
			if (BoundaryObject.worldSelectBackSprites == null) {
				BoundaryObject.worldSelectBackSprites = Script.method1970(class176.archive8, "sl_back", "");
			}

			Archive var40;
			int var42;
			IndexedSprite[] var44;
			int var45;
			if (NetFileRequest.worldSelectFlagSprites == null) {
				var40 = class176.archive8;
				var42 = var40.getGroupId("sl_flags");
				var45 = var40.getFileId(var42, "");
				var44 = KitDefinition.method2934(var40, var42, var45);
				NetFileRequest.worldSelectFlagSprites = var44;
			}

			if (EnumComposition.worldSelectArrows == null) {
				var40 = class176.archive8;
				var42 = var40.getGroupId("sl_arrows");
				var45 = var40.getFileId(var42, "");
				var44 = KitDefinition.method2934(var40, var42, var45);
				EnumComposition.worldSelectArrows = var44;
			}

			if (class320.worldSelectStars == null) {
				var40 = class176.archive8;
				var42 = var40.getGroupId("sl_stars");
				var45 = var40.getFileId(var42, "");
				var44 = KitDefinition.method2934(var40, var42, var45);
				class320.worldSelectStars = var44;
			}

			if (WorldMapCacheName.worldSelectLeftSprite == null) {
				WorldMapCacheName.worldSelectLeftSprite = class131.SpriteBuffer_getIndexedSpriteByName(class176.archive8, "leftarrow", "");
			}

			if (ByteArrayPool.worldSelectRightSprite == null) {
				ByteArrayPool.worldSelectRightSprite = class131.SpriteBuffer_getIndexedSpriteByName(class176.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class320.worldSelectStars != null) {
				class320.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class320.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (EnumComposition.worldSelectArrows != null) {
				var34 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					EnumComposition.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					EnumComposition.worldSelectArrows[0].drawAt(var34, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					EnumComposition.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					EnumComposition.worldSelectArrows[1].drawAt(var34 + 15, 4);
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					EnumComposition.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					EnumComposition.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					EnumComposition.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					EnumComposition.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var42 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					EnumComposition.worldSelectArrows[2].drawAt(var42, 4);
				} else {
					EnumComposition.worldSelectArrows[0].drawAt(var42, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					EnumComposition.worldSelectArrows[3].drawAt(var42 + 15, 4);
				} else {
					EnumComposition.worldSelectArrows[1].drawAt(var42 + 15, 4);
				}

				var0.draw("Location", var42 + 32, 17, 16777215, -1);
				var45 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					EnumComposition.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					EnumComposition.worldSelectArrows[0].drawAt(var45, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					EnumComposition.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					EnumComposition.worldSelectArrows[1].drawAt(var45 + 15, 4);
				}

				var0.draw("Type", var45 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (BoundaryObject.worldSelectBackSprites != null) {
				var3 = 88;
				byte var37 = 19;
				var42 = 765 / (var3 + 1) - 1;
				var45 = 480 / (var37 + 1);

				do {
					var25 = var45;
					var26 = var42;
					if (var45 * (var42 - 1) >= World.World_count) {
						--var42;
					}

					if (var42 * (var45 - 1) >= World.World_count) {
						--var45;
					}

					if (var42 * (var45 - 1) >= World.World_count) {
						--var45;
					}
				} while(var25 != var45 || var26 != var42);

				var25 = (765 - var42 * var3) / (var42 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var26 = (480 - var45 * var37) / (var45 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var9 = (765 - var42 * var3 - var25 * (var42 - 1)) / 2;
				var28 = (480 - var45 * var37 - var26 * (var45 - 1)) / 2;
				var11 = (var45 + World.World_count - 1) / var45;
				Login.worldSelectPagesCount = var11 - var42;
				if (WorldMapCacheName.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					WorldMapCacheName.worldSelectLeftSprite.drawAt(8, MouseRecorder.canvasHeight / 2 - WorldMapCacheName.worldSelectLeftSprite.subHeight / 2);
				}

				if (ByteArrayPool.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					ByteArrayPool.worldSelectRightSprite.drawAt(Huffman.canvasWidth - ByteArrayPool.worldSelectRightSprite.subWidth - 8, MouseRecorder.canvasHeight / 2 - ByteArrayPool.worldSelectRightSprite.subHeight / 2);
				}

				var12 = var28 + 23;
				int var38 = var9 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var45; var17 < World.World_count && var16 - Login.worldSelectPage < var42; ++var17) {
					World var18 = class386.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1639()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var38 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var3 + var38 && MouseHandler.MouseHandler_y < var37 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						BoundaryObject.worldSelectBackSprites[var21].drawTransOverlayAt(var38, var12, 128, 16777215);
						var15 = true;
					} else {
						BoundaryObject.worldSelectBackSprites[var21].drawAt(var38, var12);
					}

					if (NetFileRequest.worldSelectFlagSprites != null) {
						NetFileRequest.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var38 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var38 + 15, var37 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var38 + 60, var37 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var26 + var37;
					++var14;
					if (var14 >= var45) {
						var12 = var28 + 23;
						var38 = var38 + var25 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(class386.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var32 = var1.ascent + 8;
					int var39 = MouseHandler.MouseHandler_y + 25;
					if (var32 + var39 > 480) {
						var39 = MouseHandler.MouseHandler_y - 25 - var32;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var32, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var32, 0);
					var1.drawCentered(class386.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var39 + var1.ascent + 4, 0, -1);
				}
			}

			class244.rasterProvider.drawFull(0, 0);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			ClanChannelMember.logoSprite.drawAt(Login.xPadding + 382 - ClanChannelMember.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var6;
			String var7;
			String var8;
			short var33;
			short var35;
			if (Client.gameState == 20) {
				SoundCache.titleboxSprite.drawAt(Login.loginBoxX + 180 - SoundCache.titleboxSprite.subWidth / 2, 271 - SoundCache.titleboxSprite.subHeight / 2);
				var33 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
				var34 = var33 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var34 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0);
					var35 = 200;
					if (WorldMapDecorationType.clientPreferences.hideUsername) {
						var8 = Login.Login_username;
						var7 = StructComposition.method3152('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var34, 16777215, 0);
					var34 += 15;

					for (var7 = class129.method2670(Login.Login_password); var0.stringWidth(var7) > var35; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var34, 16777215, 0);
					var34 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				SoundCache.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var33 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var33 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
					var34 = var33 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var33 = 201;
					var0.drawCentered(Login.Login_response1, class78.loginBoxCenter, var33, 16776960, 0);
					var34 = var33 + 15;
					var0.drawCentered(Login.Login_response2, class78.loginBoxCenter, var34, 16776960, 0);
					var34 += 15;
					var0.drawCentered(Login.Login_response3, class78.loginBoxCenter, var34, 16776960, 0);
					var34 += 15;
					var34 += 7;
					var0.draw("Login: ", class78.loginBoxCenter - 110, var34, 16777215, 0);
					var35 = 200;
					if (WorldMapDecorationType.clientPreferences.hideUsername) {
						var8 = Login.Login_username;
						var7 = StructComposition.method3152('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? FloorUnderlayDefinition.colorStartTag(16776960) + "|" : ""), class78.loginBoxCenter - 70, var34, 16777215, 0);
					var34 += 15;
					var8 = Login.Login_password;
					var7 = StructComposition.method3152('*', var8.length());

					String var27;
					for (var27 = var7; var0.stringWidth(var27) > var35; var27 = var27.substring(1)) {
					}

					var0.draw("Password: " + var27 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? FloorUnderlayDefinition.colorStartTag(16776960) + "|" : ""), class78.loginBoxCenter - 108, var34, 16777215, 0);
					var34 += 15;
					var33 = 277;
					var28 = class78.loginBoxCenter + -117;
					IndexedSprite var29 = Script.method1955(Client.Login_isUsernameRemembered, Login.field904);
					var29.drawAt(var28, var33);
					var28 = var28 + var29.subWidth + 5;
					var1.draw("Remember username", var28, var33 + 13, 16776960, 0);
					var28 = class78.loginBoxCenter + 24;
					var29 = Script.method1955(WorldMapDecorationType.clientPreferences.hideUsername, Login.field895);
					var29.drawAt(var28, var33);
					var28 = var28 + var29.subWidth + 5;
					var1.draw("Hide username", var28, var33 + 13, 16776960, 0);
					var34 = var33 + 15;
					var12 = class78.loginBoxCenter - 80;
					short var13 = 321;
					class132.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = class78.loginBoxCenter + 80;
					class132.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var33 = 357;
					switch(Login.field869) {
					case 2:
						Login.field894 = "Having trouble logging in?";
						break;
					default:
						Login.field894 = "Can't login? Click here.";
					}

					Ignored.field3969 = new Bounds(class78.loginBoxCenter, var33, var1.stringWidth(Login.field894), 11);
					class13.field76 = new Bounds(class78.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(Login.field894, class78.loginBoxCenter, var33, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var33 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var34, 16776960, 0);
					var34 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var34, 16776960, 0);
					var34 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					String var5;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var33 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var5 = "PIN: ";
						var7 = Ignored.otp;
						var6 = StructComposition.method3152('*', var7.length());
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? FloorUnderlayDefinition.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0);
						var34 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var34 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var34 - var0.ascent;
						IndexedSprite var10;
						if (Login.field900) {
							var10 = FileSystem.options_buttons_2Sprite;
						} else {
							var10 = class397.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var9);
						var34 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						short var36 = 321;
						class132.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
						var0.drawCentered("Continue", var11, var36 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						class132.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
						var0.drawCentered("Cancel", var11, var36 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0);
					} else {
						short var43;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var33 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var34 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0);
							var35 = 174;
							if (WorldMapDecorationType.clientPreferences.hideUsername) {
								var8 = Login.Login_username;
								var7 = StructComposition.method3152('*', var8.length());
								var6 = var7;
							} else {
								var6 = Login.Login_username;
							}

							for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? FloorUnderlayDefinition.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0);
							var34 += 15;
							var25 = Login.loginBoxX + 180 - 80;
							var43 = 321;
							class132.titlebuttonSprite.drawAt(var25 - 73, var43 - 20);
							var0.drawCentered("Recover", var25, var43 + 5, 16777215, 0);
							var25 = Login.loginBoxX + 180 + 80;
							class132.titlebuttonSprite.drawAt(var25 - 73, var43 - 20);
							var0.drawCentered("Back", var25, var43 + 5, 16777215, 0);
							var43 = 356;
							var1.drawCentered("Still having trouble logging in?", class78.loginBoxCenter, var43, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var33 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 321;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							var33 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 8) {
							var33 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var33 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 311;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var34 = Login.loginBoxX + 180;
							var35 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
							var4 = var35 + 20;
							Login.field873.drawAt(var34 - 109, var4);
							class4.field8.drawAt(var34 - 48, var4 + 18);
						} else if (Login.loginIndex == 12) {
							var34 = class78.loginBoxCenter;
							var35 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0);
							var4 = var35 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0);
							var34 = class78.loginBoxCenter - 80;
							var35 = 311;
							class132.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
							var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0);
							var34 = class78.loginBoxCenter + 80;
							class132.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
							var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var33 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0);
							var34 = var33 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var33 = 311;
							class132.titlebuttonSprite.drawAt(var4 - 73, var33 - 20);
							var0.drawCentered("Back", var4, var33 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var33 = 201;
							String var24 = "";
							var5 = "";
							var6 = "";
							switch(Login.field884) {
							case 0:
								var24 = "Your account has been disabled.";
								var5 = Strings.field3540;
								var6 = "";
								break;
							case 1:
								var24 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field3539;
								var6 = "";
								break;
							default:
								class20.Login_promptCredentials(false);
							}

							var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var25 = Login.loginBoxX + 180;
							var43 = 276;
							class132.titlebuttonSprite.drawAt(var25 - 73, var43 - 20);
							var0.drawCentered("Support Page", var25, var43 + 5, 16777215, 0);
							var25 = Login.loginBoxX + 180;
							var43 = 326;
							class132.titlebuttonSprite.drawAt(var25 - 73, var43 - 20);
							var0.drawCentered("Back", var25, var43 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var33 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
							var34 = var33 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
							var34 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 301;
							class132.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var30 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var30);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, MouseRecorder.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var30);
			}

			class16.title_muteSprite[WorldMapDecorationType.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == ReflectionCheck.clientLanguage) {
				if (Client.field563 != null) {
					var34 = Login.xPadding + 5;
					var35 = 463;
					byte var41 = 100;
					byte var31 = 35;
					Client.field563.drawAt(var34, var35);
					var0.drawCentered("World" + " " + Client.worldId, var41 / 2 + var34, var31 / 2 + var35 - 2, 16777215, 0);
					if (class4.World_request != null) {
						var1.drawCentered("Loading...", var41 / 2 + var34, var31 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var41 / 2 + var34, var31 / 2 + var35 + 12, 16777215, 0);
					}
				} else {
					Client.field563 = class131.SpriteBuffer_getIndexedSpriteByName(class176.archive8, "sl_button", "");
				}
			}

		}
	}
}
