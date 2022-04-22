import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -340980975
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2075940565
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("n")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 940198705
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1876948275
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1793810743
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1130612929
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 38935459
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 249721451
	)
	int field1080;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1209305495
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1724112821
	)
	int field1082;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 593217569
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1371594921
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1538239
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1112469711
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1892679033
	)
	@Export("team")
	int team;
	@ObfuscatedName("y")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -181716259
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -567529937
	)
	@Export("index")
	int index;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aq")
	boolean field1070;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1041685371
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1747269173
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
		this.field1070 = false; // L: 50
	} // L: 54

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1242087125"
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
					var8 = class19.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class144.field1629[var6].length) { // L: 84
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class122.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2121(); // L: 105
		if (this == GrandExchangeEvents.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		class168[] var12 = null; // L: 111
		boolean var13 = false; // L: 112
		if (var1.offset < var1.array.length) { // L: 113
			var8 = var1.readUnsignedShort(); // L: 114
			var13 = (var8 >> 15 & 1) == 1; // L: 115
			if (var8 > 0 && var8 != 32768) { // L: 116
				var12 = new class168[12]; // L: 117

				for (int var9 = 0; var9 < 12; ++var9) { // L: 118
					int var10 = var8 >> 12 - var9 & 1; // L: 119
					if (var10 == 1) { // L: 120
						var12[var9] = class349.method6509(var4[var9] - 512, var1); // L: 121
					}
				}
			}
		}

		if (this.appearance == null) { // L: 126
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5570(var4, var12, var13, var11, var2 == 1, var3); // L: 127
	} // L: 128

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 191
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class163.SequenceDefinition_get(super.sequence) : null; // L: 192
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class163.SequenceDefinition_get(super.movementSequence); // L: 193
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 194
			if (var3 == null) { // L: 195
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 196
				super.defaultHeight = var3.height; // L: 197
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 198
					var4 = ClientPreferences.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 199
					if (var4 != null) { // L: 200
						var4.offsetBy(0, -super.spotAnimationHeight, 0); // L: 201
						var5 = new Model[]{var3, var4}; // L: 202
						var3 = new Model(var5, 2); // L: 203
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 206
					if (Client.cycle >= this.animationCycleEnd) { // L: 207
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 208
						var4 = this.model0; // L: 209
						var4.offsetBy(this.field1080 - super.x, this.tileHeight2 - this.tileHeight, this.field1082 - super.y); // L: 210
						if (super.orientation == 512) { // L: 211
							var4.rotateY90Ccw(); // L: 212
							var4.rotateY90Ccw(); // L: 213
							var4.rotateY90Ccw(); // L: 214
						} else if (super.orientation == 1024) { // L: 216
							var4.rotateY90Ccw(); // L: 217
							var4.rotateY90Ccw(); // L: 218
						} else if (super.orientation == 1536) { // L: 220
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 221
						var3 = new Model(var5, 2); // L: 222
						if (super.orientation == 512) { // L: 223
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 224
							var4.rotateY90Ccw(); // L: 225
							var4.rotateY90Ccw(); // L: 226
						} else if (super.orientation == 1536) { // L: 228
							var4.rotateY90Ccw(); // L: 229
							var4.rotateY90Ccw(); // L: 230
							var4.rotateY90Ccw(); // L: 231
						}

						var4.offsetBy(super.x - this.field1080, this.tileHeight - this.tileHeight2, super.y - this.field1082); // L: 233
					}
				}

				var3.isSingleTile = true; // L: 236
				if (super.field1122 != 0 && Client.cycle >= super.field1167 && Client.cycle < super.field1168) { // L: 237
					var3.overrideHue = super.field1169; // L: 238
					var3.overrideSaturation = super.field1114; // L: 239
					var3.overrideLuminance = super.field1171; // L: 240
					var3.overrideAmount = super.field1122; // L: 241
				} else {
					var3.overrideAmount = 0; // L: 244
				}

				return var3; // L: 246
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2114149890"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 131
			this.checkIsFriend(); // L: 132
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 134
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-187822721"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 138
	} // L: 139

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = Decimator.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 142
	} // L: 143

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 146
			this.updateIsInFriendsChat(); // L: 147
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 149
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "374589634"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 153
	} // L: 154

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ClientPacket.friendsChat != null && ClientPacket.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 157
	} // L: 158

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-935029357"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 3; ++var1) { // L: 161
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2955(this.username.getName()) != -1 && var1 != 2) { // L: 162 163
				this.isInClanChat = TriBool.TriBool_true; // L: 164
				return; // L: 165
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 169
	} // L: 170

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1132300918"
	)
	void method2121() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 173
	} // L: 174

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1003316934"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 177
			this.updateIsInClanChat(); // L: 178
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 180
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? KeyHandler.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 184 185 187
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILgm;I)V",
		garbageValue = "626817443"
	)
	final void method2125(int var1, int var2, class193 var3) {
		if (super.sequence != -1 && class163.SequenceDefinition_get(super.sequence).field2158 == 1) { // L: 250
			super.sequence = -1;
		}

		super.field1121 = -1; // L: 251
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 252
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 253
				if (var3 == class193.field2187) {
					class341.method6279(this, var1, var2, class193.field2187); // L: 255
				}

				this.method2127(var1, var2, var3); // L: 256
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 258

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1757316857"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 261
		super.field1170 = 0; // L: 262
		super.field1179 = 0; // L: 263
		super.pathX[0] = var1; // L: 264
		super.pathY[0] = var2; // L: 265
		int var3 = this.transformedSize(); // L: 266
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 267
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 268
	} // L: 269

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILgm;B)V",
		garbageValue = "71"
	)
	final void method2127(int var1, int var2, class193 var3) {
		if (super.pathLength < 9) { // L: 272
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 273
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 274
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 275
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 276
		}

		super.pathX[0] = var1; // L: 278
		super.pathY[0] = var2; // L: 279
		super.pathTraversed[0] = var3; // L: 280
	} // L: 281

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-323504433"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 284
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "1"
	)
	static int method2112(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 2892
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2893
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 2894
			return 1; // L: 2895
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 2897
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2898
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 2899
			return 1; // L: 2900
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 2902
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2903
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 2904
			return 1; // L: 2905
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 2907
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2908
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 2909
			return 1; // L: 2910
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 2912
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2913
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 2914
			return 1; // L: 2915
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 2917
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2918
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 2919
			return 1; // L: 2920
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 2922
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2923
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2924
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 2925
				return 1; // L: 2926
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 2928
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2929
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2930
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 2931
				return 1; // L: 2932
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 2934
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2935
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2936
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 2937
				return 1; // L: 2938
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 2940
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2941
				var13 = Client.grandExchangeOffers[var3].status(); // L: 2942
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 2943
				return 1; // L: 2944
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 2946
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2947
					if (class83.grandExchangeEvents != null) { // L: 2948
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 2949
					}

					return 1; // L: 2951
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 2953
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2954
					if (class83.grandExchangeEvents != null) { // L: 2955
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 2956
					}

					return 1; // L: 2958
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 2960
					Interpreter.Interpreter_intStackSize -= 2; // L: 2961
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 2962
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2963
					if (class83.grandExchangeEvents != null) { // L: 2964
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 2965
						class83.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 2966
					}

					return 1; // L: 2968
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 2970
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2971
					if (class83.grandExchangeEvents != null) { // L: 2972
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 2973
					}

					return 1; // L: 2975
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 2977
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2978
					if (class83.grandExchangeEvents != null) { // L: 2979
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 2980
					}

					return 1; // L: 2982
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 2984
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class83.grandExchangeEvents == null ? 0 : class83.grandExchangeEvents.events.size(); // L: 2985
					return 1; // L: 2986
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 2988
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2989
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 2990
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 2991
						return 1; // L: 2992
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 2994
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2995
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 2996
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 2997
						return 1; // L: 2998
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3000
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3001
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 3002
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3003
						return 1; // L: 3004
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3006
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3007
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 3008
						long var5 = class136.method2931() - WorldMapID.field2388 - var4.age; // L: 3009
						int var7 = (int)(var5 / 3600000L); // L: 3010
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3011
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3012
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3013
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var10; // L: 3014
						return 1; // L: 3015
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3017
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3018
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 3019
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3020
						return 1; // L: 3021
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3023
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3024
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 3025
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3026
						return 1; // L: 3027
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3029
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3030
						var4 = (GrandExchangeEvent)class83.grandExchangeEvents.events.get(var3); // L: 3031
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3032
						return 1; // L: 3033
					} else {
						return 2; // L: 3035
					}
				}
			}
		}
	}
}
