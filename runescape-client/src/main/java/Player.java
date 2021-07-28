import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1136667611
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -513201511
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("n")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 282946051
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 22908287
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 260638265
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 935016543
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1313763475
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1672706655
	)
	int field982;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -777846559
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1130340063
	)
	int field989;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1604216139
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 101251931
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -661964639
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -646684587
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("i")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1548026079
	)
	@Export("team")
	int team;
	@ObfuscatedName("b")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1947758471
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1723203755
	)
	@Export("index")
	int index;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("am")
	boolean field1003;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1669913231
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 796156567
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
		this.field1003 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "118"
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
					var8 = KeyHandler.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= Varps.field2914[var6].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), GraphicsObject.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method1825();
		if (this == MouseHandler.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class137[] var25 = null;
		boolean var26 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var26 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var25 = new class137[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						int var14 = var4[var9] - 512;
						int var15 = var1.readUnsignedByte();
						boolean var16 = (var15 & 1) != 0;
						boolean var17 = (var15 & 2) != 0;
						class137 var18 = new class137(var14);
						int var19;
						int[] var20;
						boolean var21;
						int var22;
						short var23;
						if (var16) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1515 != null && var20.length == var18.field1515.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1515[var20[var22]] = var23;
									}
								}
							}
						}

						if (var17) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1518 != null && var20.length == var18.field1518.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) {
									var23 = (short)var1.readUnsignedShort();
									if (var21) {
										var18.field1518[var20[var22]] = var23;
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

		this.appearance.method4718(var4, var25, var26, var24, var2 == 1, var3);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lgl;",
		garbageValue = "1291603774"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? World.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : World.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = PcmPlayer.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1061, 0);
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
						var4.offsetBy(this.field982 - super.x, this.tileHeight2 - this.tileHeight, this.field989 - super.y);
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

						var4.offsetBy(super.x - this.field982, this.tileHeight - this.tileHeight2, super.y - this.field989);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1966505747"
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
		garbageValue = "1425318771"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "866218939"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = Canvas.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1844116107"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-478383809"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1457645317"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = MouseRecorder.friendsChat != null && MouseRecorder.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1798457932"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Client.currentClanSettings[0] != null && Client.currentClanSettings[0].method2358(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "979756410"
	)
	void method1825() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1853309089"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-85"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator6.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-1941334841"
	)
	final void method1829(int var1, int var2, byte var3) {
		if (super.sequence != -1 && World.SequenceDefinition_get(super.sequence).field1859 == 1) {
			super.sequence = -1;
		}

		super.field1048 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					Player var4 = this;
					int var5 = super.pathX[0];
					int var6 = super.pathY[0];
					int var7 = this.transformedSize();
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
						int var10 = this.transformedSize();
						Client.field493.approxDestinationX = var1;
						Client.field493.approxDestinationY = var2;
						Client.field493.approxDestinationSizeX = 1;
						Client.field493.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var11 = Client.field493;
						int var12 = ClanChannel.method2508(var5, var6, var10, var11, Client.collisionMaps[this.plane], true, Client.field683, Client.field665);
						if (var12 >= 1) {
							for (int var13 = 0; var13 < var12 - 1; ++var13) {
								var4.method1830(Client.field683[var13], Client.field665[var13], (byte)2);
							}
						}
					}
				}

				this.method1830(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "20"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1066 = 0;
		super.field1078 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "-934855592"
	)
	final void method1830(int var1, int var2, byte var3) {
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lio;I)Ljava/lang/String;",
		garbageValue = "-110735832"
	)
	static String method1833(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + KeyHandler.method83(JagexCache.method2617(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
