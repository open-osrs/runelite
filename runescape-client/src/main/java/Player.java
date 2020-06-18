import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1432806709
	)
	static int field638;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhv;"
	)
	@Export("appearance")
	PlayerAppearance appearance;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1861709523
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 777321397
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("g")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2047058123
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1460634789
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -287002613
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1724096507
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -691368709
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 366626367
	)
	int field661;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1150589939
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1432568009
	)
	int field653;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lef;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1121860103
	)
	int field648;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1904203447
	)
	int field649;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1087815703
	)
	int field650;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -910928239
	)
	int field651;
	@ObfuscatedName("e")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -136485713
	)
	@Export("team")
	int team;
	@ObfuscatedName("t")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 679078717
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 445698711
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ah")
	boolean field659;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1374290549
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 499025605
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
		this.field659 = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "1937390555"
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
					int var8 = KitDefinition.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= PlayerAppearance.field2575[var6].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class195.loginType);
		this.clearIsFriend();
		this.clearIsInClanChat();
		if (this == class60.localPlayer) {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-928055977"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1165782088"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2131517341"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ModeWhere.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1651593034"
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
		signature = "(I)V",
		garbageValue = "1245879584"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = ClientPreferences.clanChat != null && ClientPreferences.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-6778929"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? StudioGame.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? NetSocket.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : NetSocket.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = class4.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1005, 0);
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
						var4.offsetBy(this.field661 - super.x, this.tileHeight2 - this.tileHeight, this.field653 - super.y);
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

						var4.offsetBy(super.x - this.field661, this.tileHeight - this.tileHeight2, super.y - this.field653);
					}
				}

				var3.isSingleTile = true;
				return var3;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIBI)V",
		garbageValue = "-1126022474"
	)
	final void method1300(int var1, int var2, byte var3) {
		if (super.sequence != -1 && NetSocket.SequenceDefinition_get(super.sequence).field3560 == 1) {
			super.sequence = -1;
		}

		super.field992 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == 2) {
					ApproximateRouteStrategy.method1284(this, var1, var2, (byte)2);
				}

				this.method1302(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2675490"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1023 = 0;
		super.field1022 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(IIBI)V",
		garbageValue = "-1628655645"
	)
	final void method1302(int var1, int var2, byte var3) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2139314606"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		GrandExchangeOffer.sortWorlds(class13.World_worlds, 0, class13.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		signature = "(Lby;IIIS)V",
		garbageValue = "160"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class60.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				if (var0.skillLevel == 0) {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + Canvas.method924(var0.combatLevel, class60.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var5;
				if (Client.isItemSelected == 1) {
					ScriptEvent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ItemContainer.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((WorldMapSprite.selectedSpellFlags & 8) == 8) {
						ScriptEvent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ItemContainer.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) {
						if (Client.playerMenuActions[var5] != null) {
							short var6 = 0;
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class60.localPlayer.combatLevel) {
									var6 = 2000;
								}

								if (class60.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class60.localPlayer.team) {
										var6 = 2000;
									} else {
										var6 = 0;
									}
								}
							} else if (Client.playerOptionsPriorities[var5]) {
								var6 = 2000;
							}

							boolean var7 = false;
							int var8 = Client.playerMenuOpcodes[var5] + var6;
							ScriptEvent.insertMenuItemNoShift(Client.playerMenuActions[var5], ItemContainer.colorStartTag(16777215) + var4, var8, var1, var2, var3);
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
					if (Client.menuOpcodes[var5] == 23) {
						Client.menuTargets[var5] = ItemContainer.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "452106658"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
