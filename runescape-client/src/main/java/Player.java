import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("appearance")
	PlayerAppearance appearance;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 262221405
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1053442849
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("o")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1265290789
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2038384431
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1117584059
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1379087493
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1569239967
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 658942553
	)
	int field645;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 232655151
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1335611075
	)
	int field640;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 896754859
	)
	int field649;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 177396383
	)
	int field635;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -797190095
	)
	int field651;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -191920347
	)
	int field643;
	@ObfuscatedName("j")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1988252929
	)
	@Export("team")
	int team;
	@ObfuscatedName("u")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -398923579
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1030686615
	)
	@Export("index")
	int index;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ab")
	boolean field660;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 321223155
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1001779515
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
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
		this.field660 = false; // L: 47
	} // L: 51

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1567604648"
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
					int var8 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var4[var5] - 512).team; // L: 74
					if (var8 != 0) { // L: 75
						this.team = var8;
					}
				}
			}
		}

		int[] var9 = new int[5]; // L: 78

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= WorldMapSprite.field253[var6].length) {
				var7 = 0;
			}

			var9[var6] = var7;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) { // L: 87
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 88
		super.walkSequence = var1.readUnsignedShort(); // L: 89
		if (super.walkSequence == 65535) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapAreaData.loginType); // L: 99
		this.clearIsFriend(); // L: 100
		this.clearIsInClanChat(); // L: 101
		if (this == WorldMapLabelSize.localPlayer) { // L: 102
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 103
		this.skillLevel = var1.readUnsignedShort(); // L: 104
		this.isHidden = var1.readUnsignedByte() == 1; // L: 105
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 106
			this.isHidden = false;
		}

		if (this.appearance == null) { // L: 107
			this.appearance = new PlayerAppearance();
		}

		this.appearance.update(var4, var9, var2 == 1, var3); // L: 108
	} // L: 109

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-659819020"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 112
			this.checkIsFriend(); // L: 113
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 115
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737435180"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 119
	} // L: 120

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1949087224"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class60.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 123
	} // L: 124

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 127
			this.updateIsInClanChat(); // L: 128
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 130
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	@Export("clearIsInClanChat")
	void clearIsInClanChat() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 134
	} // L: 135

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2055605300"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Entity.clanChat != null && Entity.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 138
	} // L: 139

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1374983546"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Skeleton.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 142 143 145
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 149
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapRegion.SequenceDefinition_get(super.sequence) : null; // L: 150
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.idleSequence != super.movementSequence || var1 == null) ? WorldMapRegion.SequenceDefinition_get(super.movementSequence) : null; // L: 151
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 152
			if (var3 == null) { // L: 153
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 154
				super.defaultHeight = var3.height; // L: 155
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 156
					var4 = Tiles.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 157
					if (var4 != null) { // L: 158
						var4.offsetBy(0, -super.field1003, 0); // L: 159
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
						var4.offsetBy(this.field645 - super.x, this.tileHeight2 - this.tileHeight, this.field640 - super.y); // L: 168
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

						var4.offsetBy(super.x - this.field645, this.tileHeight - this.tileHeight2, super.y - this.field640); // L: 191
					}
				}

				var3.isSingleTile = true; // L: 194
				return var3; // L: 195
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "954112592"
	)
	final void method1286(int var1, int var2, byte var3) {
		if (super.sequence != -1 && WorldMapRegion.SequenceDefinition_get(super.sequence).field3541 == 1) { // L: 199
			super.sequence = -1;
		}

		super.field1000 = -1; // L: 200
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 201
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 202
				if (var3 == 2) { // L: 204
					PacketBuffer.method5598(this, var1, var2, (byte)2);
				}

				this.method1288(var1, var2, var3); // L: 205
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 207

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1761567284"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 210
		super.field973 = 0; // L: 211
		super.field1032 = 0; // L: 212
		super.pathX[0] = var1; // L: 213
		super.pathY[0] = var2; // L: 214
		int var3 = this.transformedSize(); // L: 215
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 216
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 217
	} // L: 218

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIBB)V",
		garbageValue = "5"
	)
	final void method1288(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 221
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 222
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 223
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 224
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 225
		}

		super.pathX[0] = var1; // L: 227
		super.pathY[0] = var2; // L: 228
		super.pathTraversed[0] = var3; // L: 229
	} // L: 230

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "68470795"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 233
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Ljava/lang/String;I)I",
		garbageValue = "-1169357315"
	)
	public static int method1326(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = EnumDefinition.method4644(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-94"
	)
	static final void method1327(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					class22.field122[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkr;Lkr;Lkr;B)V",
		garbageValue = "-76"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (FloorDecoration.canvasWidth - 765) / 2; // L: 1105
		Login.loginBoxX = Login.xPadding + 202; // L: 1106
		IsaacCipher.loginBoxCenter = Login.loginBoxX + 180; // L: 1107
		if (Login.worldSelectOpen) { // L: 1108
			ItemDefinition.method4823(var0, var1); // L: 1109
		} else {
			UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1112
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1113
			AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18); // L: 1114
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1115
				byte var3 = 20; // L: 1116
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1117
				var4 = 253 - var3; // L: 1118
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1119
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1120
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1121
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1122
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1123
			}

			String var5;
			String var6;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) { // L: 1125
				class296.titleboxSprite.drawAt(Login.loginBoxX + 180 - class296.titleboxSprite.subWidth / 2, 271 - class296.titleboxSprite.subHeight / 2); // L: 1126
				var22 = 201; // L: 1127
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1128
				var23 = var22 + 15; // L: 1129
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1130
				var23 += 15; // L: 1131
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1132
				var23 += 15; // L: 1133
				var23 += 7; // L: 1134
				if (Login.loginIndex != 4) { // L: 1135
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var23, 16777215, 0); // L: 1136
					var24 = 200; // L: 1137

					for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) { // L: 1138 1139 1140
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var23, 16777215, 0); // L: 1142
					var23 += 15; // L: 1143

					for (var6 = FontName.method5445(Login.Login_password); var0.stringWidth(var6) > var24; var6 = var6.substring(1)) { // L: 1144 1145 1146
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1148
					var23 += 15; // L: 1149
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1152
				class296.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1153
				short var17;
				if (Login.loginIndex == 0) { // L: 1154
					var22 = 251; // L: 1155
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1156
					var23 = var22 + 30; // L: 1157
					var4 = Login.loginBoxX + 180 - 80; // L: 1158
					var17 = 291; // L: 1159
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1160
					var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1161
					var4 = Login.loginBoxX + 180 + 80; // L: 1162
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1163
					var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1164
				} else if (Login.loginIndex == 1) { // L: 1166
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1167
					var22 = 236; // L: 1168
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1169
					var23 = var22 + 15; // L: 1170
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1171
					var23 += 15; // L: 1172
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1173
					var23 += 15; // L: 1174
					var4 = Login.loginBoxX + 180 - 80; // L: 1175
					var17 = 321; // L: 1176
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1177
					var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0); // L: 1178
					var4 = Login.loginBoxX + 180 + 80; // L: 1179
					ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1180
					var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0); // L: 1181
				} else {
					int var7;
					if (Login.loginIndex == 2) { // L: 1183
						var22 = 201; // L: 1184
						var0.drawCentered(Login.Login_response1, IsaacCipher.loginBoxCenter, var22, 16776960, 0); // L: 1185
						var23 = var22 + 15; // L: 1186
						var0.drawCentered(Login.Login_response2, IsaacCipher.loginBoxCenter, var23, 16776960, 0); // L: 1187
						var23 += 15; // L: 1188
						var0.drawCentered(Login.Login_response3, IsaacCipher.loginBoxCenter, var23, 16776960, 0); // L: 1189
						var23 += 15; // L: 1190
						var23 += 7; // L: 1191
						var0.draw("Login: ", IsaacCipher.loginBoxCenter - 110, var23, 16777215, 0); // L: 1192
						var24 = 200; // L: 1193

						for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) { // L: 1194 1195 1196
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), IsaacCipher.loginBoxCenter - 70, var23, 16777215, 0); // L: 1198
						var23 += 15; // L: 1199

						for (var6 = FontName.method5445(Login.Login_password); var0.stringWidth(var6) > var24; var6 = var6.substring(1)) { // L: 1200 1201 1202
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), IsaacCipher.loginBoxCenter - 108, var23, 16777215, 0); // L: 1204
						var23 += 15; // L: 1205
						var22 = 277; // L: 1206
						var7 = IsaacCipher.loginBoxCenter + -117; // L: 1207
						boolean var9 = Client.Login_isUsernameRemembered; // L: 1209
						boolean var10 = Login.field1224; // L: 1210
						IndexedSprite var20 = var9 ? (var10 ? Login.field1221 : MusicPatchNode2.options_buttons_2Sprite) : (var10 ? PlayerType.field3134 : class227.options_buttons_0Sprite); // L: 1212
						var20.drawAt(var7, var22); // L: 1215
						var7 = var7 + var20.subWidth + 5; // L: 1216
						var1.draw("Remember username", var7, var22 + 13, 16776960, 0); // L: 1217
						var7 = IsaacCipher.loginBoxCenter + 24; // L: 1218
						boolean var13 = Tile.clientPreferences.hideUsername; // L: 1220
						boolean var14 = Login.field1201; // L: 1221
						IndexedSprite var12 = var13 ? (var14 ? Login.field1221 : MusicPatchNode2.options_buttons_2Sprite) : (var14 ? PlayerType.field3134 : class227.options_buttons_0Sprite); // L: 1223
						var12.drawAt(var7, var22); // L: 1226
						var7 = var7 + var12.subWidth + 5; // L: 1227
						var1.draw("Hide username", var7, var22 + 13, 16776960, 0); // L: 1228
						var23 = var22 + 15; // L: 1229
						int var15 = IsaacCipher.loginBoxCenter - 80; // L: 1230
						short var16 = 321; // L: 1231
						ModelData0.titlebuttonSprite.drawAt(var15 - 73, var16 - 20); // L: 1232
						var0.drawCentered("Login", var15, var16 + 5, 16777215, 0); // L: 1233
						var15 = IsaacCipher.loginBoxCenter + 80; // L: 1234
						ModelData0.titlebuttonSprite.drawAt(var15 - 73, var16 - 20); // L: 1235
						var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0); // L: 1236
						var22 = 357; // L: 1237
						switch(Login.field1213) { // L: 1238
						case 2:
							ModelData0.field1904 = "Having trouble logging in?"; // L: 1240
							break;
						default:
							ModelData0.field1904 = "Can't login? Click here."; // L: 1243
						}

						GrandExchangeOfferNameComparator.field112 = new Bounds(IsaacCipher.loginBoxCenter, var22, var1.stringWidth(ModelData0.field1904), 11); // L: 1246
						MusicPatchPcmStream.field2519 = new Bounds(IsaacCipher.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1247
						var1.drawCentered(ModelData0.field1904, IsaacCipher.loginBoxCenter, var22, 16777215, 0); // L: 1248
					} else if (Login.loginIndex == 3) { // L: 1250
						var22 = 201; // L: 1251
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1252
						var23 = var22 + 20; // L: 1253
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1254
						var23 += 15; // L: 1255
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1256
						var23 += 15; // L: 1257
						var4 = Login.loginBoxX + 180; // L: 1258
						var17 = 276; // L: 1259
						ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1260
						var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0); // L: 1261
						var4 = Login.loginBoxX + 180; // L: 1262
						var17 = 326; // L: 1263
						ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1264
						var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0); // L: 1265
					} else {
						short var8;
						if (Login.loginIndex == 4) { // L: 1267
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1268
							var22 = 236; // L: 1269
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1270
							var23 = var22 + 15; // L: 1271
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1272
							var23 += 15; // L: 1273
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1274
							var23 += 15; // L: 1275
							var0.draw("PIN: " + FontName.method5445(WorldMapLabelSize.otp) + (Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var23, 16777215, 0); // L: 1276
							var23 -= 8; // L: 1277
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1278
							var23 += 15; // L: 1279
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var23, 16776960, 0); // L: 1280
							var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1281
							int var27 = var23 - var0.ascent; // L: 1282
							IndexedSprite var25;
							if (Login.field1223) { // L: 1284
								var25 = MusicPatchNode2.options_buttons_2Sprite; // L: 1285
							} else {
								var25 = class227.options_buttons_0Sprite; // L: 1288
							}

							var25.drawAt(var4, var27); // L: 1290
							var23 += 15; // L: 1291
							var7 = Login.loginBoxX + 180 - 80; // L: 1292
							var8 = 321; // L: 1293
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1294
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1295
							var7 = Login.loginBoxX + 180 + 80; // L: 1296
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1297
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1298
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1299
						} else if (Login.loginIndex == 5) { // L: 1301
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1302
							var22 = 221; // L: 1303
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1304
							var23 = var22 + 15; // L: 1305
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1306
							var23 += 15; // L: 1307
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1308
							var23 += 15; // L: 1309
							var23 += 14; // L: 1310
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var23, 16777215, 0); // L: 1311
							var24 = 174; // L: 1312

							for (var5 = WorldMapRectangle.method359(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) { // L: 1313 1314 1315
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? WorldMapAreaData.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var23, 16777215, 0); // L: 1317
							var23 += 15; // L: 1318
							int var19 = Login.loginBoxX + 180 - 80; // L: 1319
							short var26 = 321; // L: 1320
							ModelData0.titlebuttonSprite.drawAt(var19 - 73, var26 - 20); // L: 1321
							var0.drawCentered("Recover", var19, var26 + 5, 16777215, 0); // L: 1322
							var19 = Login.loginBoxX + 180 + 80; // L: 1323
							ModelData0.titlebuttonSprite.drawAt(var19 - 73, var26 - 20); // L: 1324
							var0.drawCentered("Back", var19, var26 + 5, 16777215, 0); // L: 1325
							var26 = 356; // L: 1326
							var1.drawCentered("Still having trouble logging in?", IsaacCipher.loginBoxCenter, var26, 268435455, 0); // L: 1327
						} else if (Login.loginIndex == 6) { // L: 1329
							var22 = 201; // L: 1330
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1331
							var23 = var22 + 15; // L: 1332
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1333
							var23 += 15; // L: 1334
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1335
							var23 += 15; // L: 1336
							var4 = Login.loginBoxX + 180; // L: 1337
							var17 = 321; // L: 1338
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1339
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1340
						} else if (Login.loginIndex == 7) { // L: 1342
							var22 = 216; // L: 1343
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1344
							var23 = var22 + 15; // L: 1345
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1346
							var23 += 15; // L: 1347
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1348
							var23 += 15; // L: 1349
							var4 = Login.loginBoxX + 180 - 80; // L: 1350
							var17 = 321; // L: 1351
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1352
							var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0); // L: 1353
							var4 = Login.loginBoxX + 180 + 80; // L: 1354
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1355
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1356
						} else if (Login.loginIndex == 8) { // L: 1358
							var22 = 216; // L: 1359
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0); // L: 1360
							var23 = var22 + 15; // L: 1361
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1362
							var23 += 15; // L: 1363
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1364
							var23 += 15; // L: 1365
							var4 = Login.loginBoxX + 180 - 80; // L: 1366
							var17 = 321; // L: 1367
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1368
							var0.drawCentered("Privacy Policy", var4, var17 + 5, 16777215, 0); // L: 1369
							var4 = Login.loginBoxX + 180 + 80; // L: 1370
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1371
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0); // L: 1372
						} else if (Login.loginIndex == 12) { // L: 1374
							var22 = 201; // L: 1375
							String var18 = ""; // L: 1376
							var5 = ""; // L: 1377
							var6 = ""; // L: 1378
							switch(Login.field1210) { // L: 1379
							case 0:
								var18 = "Your account has been disabled."; // L: 1382
								var5 = Strings.field2988; // L: 1383
								var6 = ""; // L: 1384
								break;
							case 1:
								var18 = "Account locked as we suspect it has been stolen."; // L: 1394
								var5 = Strings.field2936; // L: 1395
								var6 = ""; // L: 1396
								break;
							default:
								class41.Login_promptCredentials(false); // L: 1389
							}

							var0.drawCentered(var18, Login.loginBoxX + 180, var22, 16776960, 0); // L: 1400
							var23 = var22 + 15; // L: 1401
							var2.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1402
							var23 += 15; // L: 1403
							var2.drawCentered(var6, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1404
							var23 += 15; // L: 1405
							var7 = Login.loginBoxX + 180; // L: 1406
							var8 = 276; // L: 1407
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1408
							var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0); // L: 1409
							var7 = Login.loginBoxX + 180; // L: 1410
							var8 = 326; // L: 1411
							ModelData0.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1412
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1413
						} else if (Login.loginIndex == 24) { // L: 1415
							var22 = 221; // L: 1416
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0); // L: 1417
							var23 = var22 + 15; // L: 1418
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1419
							var23 += 15; // L: 1420
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1421
							var23 += 15; // L: 1422
							var4 = Login.loginBoxX + 180; // L: 1423
							var17 = 301; // L: 1424
							ModelData0.titlebuttonSprite.drawAt(var4 - 73, var17 - 20); // L: 1425
							var0.drawCentered("Ok", var4, var17 + 5, 16777215, 0); // L: 1426
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1429
				int[] var21 = new int[4]; // L: 1430
				Rasterizer2D.Rasterizer2D_getClipArray(var21); // L: 1431
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameShell.canvasHeight); // L: 1432
				Varcs.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1433
				Varcs.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1434
				Rasterizer2D.Rasterizer2D_setClipArray(var21); // L: 1435
			}

			ClientPreferences.title_muteSprite[Tile.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1437
			if (Client.gameState > 5 && class58.clientLanguage == Language.Language_EN) { // L: 1438
				if (class7.field36 != null) { // L: 1439
					var23 = Login.xPadding + 5; // L: 1440
					var24 = 463; // L: 1441
					byte var29 = 100; // L: 1442
					byte var28 = 35; // L: 1443
					class7.field36.drawAt(var23, var24); // L: 1444
					var0.drawCentered("World" + " " + Client.worldId, var29 / 2 + var23, var28 / 2 + var24 - 2, 16777215, 0); // L: 1445
					if (WorldMapScaleHandler.World_request != null) { // L: 1446
						var1.drawCentered("Loading...", var29 / 2 + var23, var28 / 2 + var24 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var29 / 2 + var23, var28 / 2 + var24 + 12, 16777215, 0); // L: 1447
					}
				} else {
					class7.field36 = class234.SpriteBuffer_getIndexedSpriteByName(Huffman.archive8, "sl_button", ""); // L: 1450
				}
			}

		}
	} // L: 1110 1453

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "750694700"
	)
	static int method1324(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3470
			var3 = Huffman.Client_plane; // L: 3471
			int var15 = (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX; // L: 3472
			int var8 = (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY; // L: 3473
			WorldMapSection0.getWorldMap().method6482(var3, var15, var8, true); // L: 3474
			return 1; // L: 3475
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3477
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3478
				String var16 = ""; // L: 3479
				var9 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3480
				if (var9 != null) { // L: 3481
					var16 = var9.getExternalName(); // L: 3482
				}

				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var16; // L: 3484
				return 1; // L: 3485
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3487
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3488
				WorldMapSection0.getWorldMap().setCurrentMapAreaId(var3); // L: 3489
				return 1; // L: 3490
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3492
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getZoomLevel(); // L: 3493
				return 1; // L: 3494
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3496
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3497
				WorldMapSection0.getWorldMap().setZoomPercentage(var3); // L: 3498
				return 1; // L: 3499
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3501
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3502
				return 1; // L: 3503
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3505
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3506
					WorldMapSection0.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3507
					return 1; // L: 3508
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3510
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3511
					WorldMapSection0.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3512
					return 1; // L: 3513
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3515
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3516
					WorldMapSection0.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3517
					return 1; // L: 3518
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3520
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3521
					WorldMapSection0.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3522
					return 1; // L: 3523
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3525
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayX(); // L: 3526
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayY(); // L: 3527
					return 1; // L: 3528
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3530
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3531
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3532
						if (var11 == null) { // L: 3533
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3534
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3537
						}

						return 1; // L: 3539
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3541
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3542
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3543
						if (var11 == null) { // L: 3544
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3545
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3546
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3549
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3550
						}

						return 1; // L: 3552
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3554
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3555
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3556
						if (var11 == null) { // L: 3557
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3558
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3559
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3560
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3561
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3564
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3565
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3566
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3567
						}

						return 1; // L: 3569
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3571
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3572
						var11 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3573
						if (var11 == null) { // L: 3574
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3575
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3578
						}

						return 1; // L: 3580
					} else if (var0 == 6615) { // L: 3582
						var14 = WorldMapSection0.getWorldMap().getDisplayCoord(); // L: 3583
						if (var14 == null) { // L: 3584
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3585
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3586
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 3589
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 3590
						}

						return 1; // L: 3592
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3594
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().currentMapAreaId(); // L: 3595
						return 1; // L: 3596
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3598
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3599
						var11 = WorldMapSection0.getWorldMap().getCurrentMapArea(); // L: 3600
						if (var11 == null) { // L: 3601
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3602
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3603
							return 1; // L: 3604
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3606
							if (var12 == null) { // L: 3607
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3608
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3609
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 3612
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 3613
							}

							return 1; // L: 3615
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3617
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3618
							var11 = WorldMapSection0.getWorldMap().getCurrentMapArea(); // L: 3619
							if (var11 == null) { // L: 3620
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3621
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3622
								return 1; // L: 3623
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3625
								if (var5 == null) { // L: 3626
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3627
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 3630
								}

								return 1; // L: 3632
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 3634
								Interpreter.Interpreter_intStackSize -= 2; // L: 3635
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3636
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3637
								MouseHandler.method1150(var3, var10, false); // L: 3638
								return 1; // L: 3639
							} else if (var0 == 6620) { // L: 3641
								Interpreter.Interpreter_intStackSize -= 2; // L: 3642
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3643
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3644
								MouseHandler.method1150(var3, var10, true); // L: 3645
								return 1; // L: 3646
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 3648
								Interpreter.Interpreter_intStackSize -= 2; // L: 3649
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3650
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3651
								var9 = WorldMapSection0.getWorldMap().getMapArea(var3); // L: 3652
								if (var9 == null) { // L: 3653
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3654
									return 1; // L: 3655
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 3657
									return 1; // L: 3658
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 3660
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayWith(); // L: 3661
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getDisplayHeight(); // L: 3662
								return 1; // L: 3663
							} else if (var0 == 6623) { // L: 3665
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3666
								var11 = WorldMapSection0.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 3667
								if (var11 == null) { // L: 3668
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3669
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 3672
								}

								return 1; // L: 3674
							} else if (var0 == 6624) { // L: 3676
								WorldMapSection0.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3677
								return 1; // L: 3678
							} else if (var0 == 6625) { // L: 3680
								WorldMapSection0.getWorldMap().resetMaxFlashCount(); // L: 3681
								return 1; // L: 3682
							} else if (var0 == 6626) { // L: 3684
								WorldMapSection0.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3685
								return 1; // L: 3686
							} else if (var0 == 6627) { // L: 3688
								WorldMapSection0.getWorldMap().resetCyclesPerFlash(); // L: 3689
								return 1; // L: 3690
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 3692
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3693
									WorldMapSection0.getWorldMap().setPerpetualFlash(var13); // L: 3694
									return 1; // L: 3695
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 3697
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3698
									WorldMapSection0.getWorldMap().flashElement(var3); // L: 3699
									return 1; // L: 3700
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 3702
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3703
									WorldMapSection0.getWorldMap().flashCategory(var3); // L: 3704
									return 1; // L: 3705
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 3707
									WorldMapSection0.getWorldMap().stopCurrentFlashes(); // L: 3708
									return 1; // L: 3709
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 3711
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3712
									WorldMapSection0.getWorldMap().setElementsDisabled(var13); // L: 3713
									return 1; // L: 3714
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 3716
										Interpreter.Interpreter_intStackSize -= 2; // L: 3717
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3718
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3719
										WorldMapSection0.getWorldMap().disableElement(var3, var7); // L: 3720
										return 1; // L: 3721
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 3723
										Interpreter.Interpreter_intStackSize -= 2; // L: 3724
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3725
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3726
										WorldMapSection0.getWorldMap().setCategoryDisabled(var3, var7); // L: 3727
										return 1; // L: 3728
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 3730
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 3731
										return 1; // L: 3732
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 3734
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3735
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 3736
										return 1; // L: 3737
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 3739
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3740
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection0.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 3741
										return 1; // L: 3742
									} else if (var0 == 6638) { // L: 3744
										Interpreter.Interpreter_intStackSize -= 2; // L: 3745
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3746
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3747
										var5 = WorldMapSection0.getWorldMap().method6507(var3, var10); // L: 3748
										if (var5 == null) { // L: 3749
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3750
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 3753
										}

										return 1; // L: 3755
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 3757
											var6 = WorldMapSection0.getWorldMap().iconStart(); // L: 3758
											if (var6 == null) { // L: 3759
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3760
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3761
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3764
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3765
											}

											return 1; // L: 3767
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 3769
											var6 = WorldMapSection0.getWorldMap().iconNext(); // L: 3770
											if (var6 == null) { // L: 3771
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3772
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3773
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 3776
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 3777
											}

											return 1; // L: 3779
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 3781
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3782
												var4 = WorldMapSection0.WorldMapElement_get(var3); // L: 3783
												if (var4.name == null) { // L: 3784
													Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 3785
												} else {
													Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.name; // L: 3788
												}

												return 1; // L: 3790
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 3792
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3793
												var4 = WorldMapSection0.WorldMapElement_get(var3); // L: 3794
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 3795
												return 1; // L: 3796
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 3798
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3799
												var4 = WorldMapSection0.WorldMapElement_get(var3); // L: 3800
												if (var4 == null) { // L: 3801
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3802
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 3805
												}

												return 1; // L: 3807
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 3809
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3810
												var4 = WorldMapSection0.WorldMapElement_get(var3); // L: 3811
												if (var4 == null) { // L: 3812
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3813
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 3816
												}

												return 1; // L: 3818
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 3820
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.mapElement; // L: 3821
												return 1; // L: 3822
											} else if (var0 == 6698) { // L: 3824
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord1.packed(); // L: 3825
												return 1; // L: 3826
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 3828
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord2.packed(); // L: 3829
												return 1; // L: 3830
											} else {
												return 2; // L: 3832
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
