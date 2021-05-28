import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1565845213
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 268049119
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1372932469
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("j")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1947441591
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1658362291
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -483485189
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1390365133
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2037290909
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1452650311
	)
	int field1202;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1606153053
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2065747987
	)
	int field1220;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1119093931
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1402081485
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 482792791
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1028292805
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1597353853
	)
	@Export("team")
	int team;
	@ObfuscatedName("w")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 671262203
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -104146557
	)
	@Export("index")
	int index;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ap")
	boolean field1218;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -40810693
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1966912699
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
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 47
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1218 = false; // L: 49
	} // L: 53

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "1"
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
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) { // L: 71
					var3 = var1.readUnsignedShort(); // L: 72
					break;
				}

				if (var4[var5] >= 512) { // L: 75
					var8 = class260.ItemDefinition_get(var4[var5] - 512).team; // L: 76
					if (var8 != 0) { // L: 77
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5]; // L: 80

		for (var6 = 0; var6 < 5; ++var6) { // L: 81
			var7 = var1.readUnsignedByte(); // L: 82
			if (var7 < 0 || var7 >= class15.field137[var6].length) { // L: 83
				var7 = 0;
			}

			var24[var6] = var7; // L: 84
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
		if (super.walkLeftSequence == 65535) { // L: 96
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 97
		if (super.walkRightSequence == 65535) { // L: 98
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 99
		if (super.runSequence == 65535) { // L: 100
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapSection0.loginType); // L: 101
		this.clearIsFriend(); // L: 102
		this.clearIsInFriendsChat(); // L: 103
		this.method2147();
		if (this == class93.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		class135[] var25 = null;
		boolean var26 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var26 = (var8 >> 15 & 1) == 1;
			if (var8 > 0 && var8 != 32768) {
				var25 = new class135[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = var8 >> 12 - var9 & 1;
					if (var10 == 1) {
						int var14 = var4[var9] - 512;
						int var15 = var1.readUnsignedByte();
						boolean var16 = (var15 & 1) != 0;
						boolean var17 = (var15 & 2) != 0;
						class135 var18 = new class135(var14);
						int var19;
						int[] var20;
						boolean var21;
						int var22;
						short var23;
						if (var16) {
							var19 = var1.readUnsignedByte();
							var20 = new int[]{var19 & 15, var19 >> 4 & 15};
							var21 = var18.field1537 != null && var20.length == var18.field1537.length;

							for (var22 = 0; var22 < 2; ++var22) {
								if (var20[var22] != 15) { // L: 136
									var23 = (short)var1.readUnsignedShort();
									if (var21) { // L: 138
										var18.field1537[var20[var22]] = var23; // L: 139
									}
								}
							}
						}

						if (var17) { // L: 144
							var19 = var1.readUnsignedByte(); // L: 145
							var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 146 147 148
							var21 = var18.field1538 != null && var20.length == var18.field1538.length; // L: 149

							for (var22 = 0; var22 < 2; ++var22) { // L: 150
								if (var20[var22] != 15) { // L: 151
									var23 = (short)var1.readUnsignedShort(); // L: 152
									if (var21) { // L: 153
										var18.field1538[var20[var22]] = var23; // L: 154
									}
								}
							}
						}

						var25[var9] = var18; // L: 161
					}
				}
			}
		}

		if (this.appearance == null) { // L: 166
			this.appearance = new PlayerComposition();
		}

		this.appearance.method4704(var4, var25, var26, var24, var2 == 1, var3); // L: 167
	} // L: 168

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 223
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? LoginScreenAnimation.SequenceDefinition_get(super.sequence) : null; // L: 224
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : LoginScreenAnimation.SequenceDefinition_get(super.movementSequence); // L: 225
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 226
			if (var3 == null) { // L: 227
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 228
				super.defaultHeight = var3.height; // L: 229
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 230
					var4 = VarcInt.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 231
					if (var4 != null) { // L: 232
						var4.offsetBy(0, -super.field1277, 0); // L: 233
						var5 = new Model[]{var3, var4}; // L: 234
						var3 = new Model(var5, 2); // L: 235
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 238
					if (Client.cycle >= this.animationCycleEnd) { // L: 239
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 240
						var4 = this.model0; // L: 241
						var4.offsetBy(this.field1202 - super.x, this.tileHeight2 - this.tileHeight, this.field1220 - super.y); // L: 242
						if (super.orientation == 512) { // L: 243
							var4.rotateY90Ccw(); // L: 244
							var4.rotateY90Ccw(); // L: 245
							var4.rotateY90Ccw(); // L: 246
						} else if (super.orientation == 1024) { // L: 248
							var4.rotateY90Ccw(); // L: 249
							var4.rotateY90Ccw(); // L: 250
						} else if (super.orientation == 1536) { // L: 252
							var4.rotateY90Ccw();
						}

						var5 = new Model[]{var3, var4}; // L: 253
						var3 = new Model(var5, 2); // L: 254
						if (super.orientation == 512) { // L: 255
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 256
							var4.rotateY90Ccw(); // L: 257
							var4.rotateY90Ccw(); // L: 258
						} else if (super.orientation == 1536) { // L: 260
							var4.rotateY90Ccw(); // L: 261
							var4.rotateY90Ccw(); // L: 262
							var4.rotateY90Ccw(); // L: 263
						}

						var4.offsetBy(super.x - this.field1202, this.tileHeight - this.tileHeight2, super.y - this.field1220); // L: 265
					}
				}

				var3.isSingleTile = true; // L: 268
				return var3; // L: 269
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2031085482"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 171
			this.checkIsFriend(); // L: 172
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 174
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 178
	} // L: 179

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-574067295"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = NetSocket.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 182
	} // L: 183

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-78"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 186
			this.updateIsInFriendsChat(); // L: 187
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 189
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 193
	} // L: 194

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2108325676"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = WorldMapRegion.friendsChat != null && WorldMapRegion.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 197
	} // L: 198

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		this.isInClanChat = Client.currentClanSettings[0] != null && Client.currentClanSettings[0].method99(this.username.getName()) != -1 ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 201
	} // L: 202

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-660230159"
	)
	void method2147() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 205
	} // L: 206

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1964192988"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 209
			this.updateIsInClanChat(); // L: 210
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 212
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1517836125"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? StructComposition.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 216 217 219
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIBI)V",
		garbageValue = "2070611264"
	)
	final void method2129(int var1, int var2, byte var3) {
		if (super.sequence != -1 && LoginScreenAnimation.SequenceDefinition_get(super.sequence).field1890 == 1) { // L: 273
			super.sequence = -1;
		}

		super.field1264 = -1; // L: 274
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 275
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 276
				if (var3 == 2) { // L: 278
					Player var4 = this; // L: 279
					int var5 = super.pathX[0]; // L: 281
					int var6 = super.pathY[0]; // L: 282
					int var7 = this.transformedSize(); // L: 283
					if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) { // L: 284 285
						int var8 = SoundSystem.method808(var5, var6, this.transformedSize(), class372.method6463(var1, var2), Client.collisionMaps[this.plane], true, Client.field689, Client.field851); // L: 286
						if (var8 >= 1) { // L: 287
							for (int var9 = 0; var9 < var8 - 1; ++var9) { // L: 288
								var4.method2165(Client.field689[var9], Client.field851[var9], (byte)2);
							}
						}
					}
				}

				this.method2165(var1, var2, var3); // L: 291
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 293

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1441238495"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 296
		super.field1274 = 0; // L: 297
		super.field1294 = 0; // L: 298
		super.pathX[0] = var1; // L: 299
		super.pathY[0] = var2; // L: 300
		int var3 = this.transformedSize(); // L: 301
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 302
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 303
	} // L: 304

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIBB)V",
		garbageValue = "-30"
	)
	final void method2165(int var1, int var2, byte var3) {
		if (super.pathLength < 9) { // L: 307
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 308
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 309
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 310
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 311
		}

		super.pathX[0] = var1; // L: 313
		super.pathY[0] = var2; // L: 314
		super.pathTraversed[0] = var3; // L: 315
	} // L: 316

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 319
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1258875415"
	)
	public static void method2166() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 37
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 38
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 39
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 40
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 41
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 42
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 43
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 44
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 45
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 46
		}
	} // L: 48

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-169882356"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 104

		for (int var6 = 0; var6 < var5; ++var6) { // L: 105
			char var7 = var0.charAt(var6 + var1); // L: 106
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 107
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 108
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 109
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 110
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 111
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 112
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 113
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 114
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 115
			} else if (var7 == 8240) { // L: 116
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 117
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 118
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 119
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 120
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 121
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 122
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 123
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 124
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 125
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 126
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 127
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 128
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 129
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 130
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 131
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 132
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 133
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 134
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 135
			}
		}

		return var5; // L: 137
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "130039632"
	)
	public static int method2128(int var0) {
		--var0; // L: 64
		var0 |= var0 >>> 1; // L: 65
		var0 |= var0 >>> 2; // L: 66
		var0 |= var0 >>> 4; // L: 67
		var0 |= var0 >>> 8; // L: 68
		var0 |= var0 >>> 16; // L: 69
		return var0 + 1; // L: 70
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-201107483"
	)
	static void method2110() {
		Players.Players_count = 0; // L: 646

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 647
			Players.field1374[var0] = null; // L: 648
			Players.field1373[var0] = 1; // L: 649
		}

	} // L: 651
}
