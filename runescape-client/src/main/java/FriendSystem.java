import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1124775275
	)
	int field941;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	FriendSystem(LoginType var1) {
		this.field941 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1883790130"
	)
	boolean method1689() {
		return this.field941 == 2; // L: 32
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	final void method1698() {
		this.field941 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "103"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field941 = 2; // L: 41
		Varps.method4647(); // L: 42
	} // L: 43

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1668816694"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field3828 < ObjectComposition.currentTimeMillis() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					World.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					World.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("clear")
	final void clear() {
		this.field941 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lly;ZI)Z",
		garbageValue = "-1207370332"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(class93.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Z",
		garbageValue = "279756852"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2078408502"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Tiles.method2053();
				} else {
					StringBuilder var10000;
					String var4;
					if (class93.localPlayer.username.equals(var2)) {
						var10000 = null;
						var4 = "You can't add yourself to your own friend list";
						World.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						WorldMapManager.method3490(var1);
					} else if (this.isIgnored(var2)) { // L: 95
						var10000 = new StringBuilder();
						Object var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your ignore list first").toString();
						World.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	} // L: 80

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1614251669"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field759 != 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-7"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) {
					var10000 = null; // L: 140
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					World.addGameMessage(30, "", var4);
				} else if (class93.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					World.addGameMessage(30, "", var4);
				} else {
					Object var10001;
					if (this.isIgnored(var2)) {
						var10000 = (new StringBuilder()).append(var1);
						var10001 = null;
						var4 = var10000.append(" is already on your ignore list").toString();
						World.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your friend list first").toString();
						World.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	} // L: 181

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1390615002"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field759 != 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "752053487"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) { // L: 193
				if (this.friendsList.removeByUsername(var2)) {
					Decimator.method1071();
					PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1)); // L: 198
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 199
					Client.packetWriter.addNode(var3);
				}

				Varps.method4647();
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1893508939"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) { // L: 209
					Decimator.method1071();
					PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3); // L: 215
				}

				MouseRecorder.FriendSystem_invalidateIgnoreds();
			}
		}
	} // L: 218

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)Z",
		garbageValue = "96"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnb;II)V",
		garbageValue = "-1580432233"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		PcmPlayer.method750(var0); // L: 73

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 75
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 76
			Player var5 = Client.players[var4]; // L: 77
			int var6 = var0.readUnsignedByte(); // L: 78
			if ((var6 & 128) != 0) { // L: 79
				var6 += var0.readUnsignedByte() << 8;
			}

			byte var7 = -1; // L: 81
			if ((var6 & 8) != 0) { // L: 82
				var5.targetIndex = var0.readUnsignedShort(); // L: 83
				if (var5.targetIndex == 65535) { // L: 84
					var5.targetIndex = -1;
				}
			}

			int var8;
			if ((var6 & 256) != 0) { // L: 86
				var5.spotAnimation = var0.method6604(); // L: 87
				var8 = var0.method6613(); // L: 88
				var5.field1277 = var8 >> 16; // L: 89
				var5.field1287 = (var8 & 65535) + Client.cycle; // L: 90
				var5.spotAnimationFrame = 0; // L: 91
				var5.spotAnimationFrameCycle = 0; // L: 92
				if (var5.field1287 > Client.cycle) { // L: 93
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) { // L: 94
					var5.spotAnimation = -1;
				}
			}

			int var9;
			int var11;
			int var12;
			int var15;
			if ((var6 & 16) != 0) { // L: 96
				var8 = var0.method6549(); // L: 97
				int var10;
				int var13;
				int var18;
				if (var8 > 0) { // L: 98
					for (var9 = 0; var9 < var8; ++var9) { // L: 99
						var11 = -1; // L: 101
						var12 = -1; // L: 102
						var13 = -1; // L: 103
						var10 = var0.readUShortSmart(); // L: 104
						if (var10 == 32767) { // L: 105
							var10 = var0.readUShortSmart(); // L: 106
							var12 = var0.readUShortSmart(); // L: 107
							var11 = var0.readUShortSmart(); // L: 108
							var13 = var0.readUShortSmart(); // L: 109
						} else if (var10 != 32766) { // L: 111
							var12 = var0.readUShortSmart(); // L: 112
						} else {
							var10 = -1; // L: 114
						}

						var18 = var0.readUShortSmart(); // L: 115
						var5.addHitSplat(var10, var12, var11, var13, Client.cycle, var18); // L: 116
					}
				}

				var9 = var0.readUnsignedByte(); // L: 119
				if (var9 > 0) { // L: 120
					for (var10 = 0; var10 < var9; ++var10) { // L: 121
						var11 = var0.readUShortSmart(); // L: 122
						var12 = var0.readUShortSmart(); // L: 123
						if (var12 != 32767) { // L: 124
							var13 = var0.readUShortSmart(); // L: 125
							var18 = var0.method6671(); // L: 126
							var15 = var12 > 0 ? var0.method6595() : var18; // L: 127
							var5.addHealthBar(var11, Client.cycle, var12, var13, var18, var15); // L: 128
						} else {
							var5.removeHealthBar(var11); // L: 130
						}
					}
				}
			}

			if ((var6 & 1) != 0) { // L: 134
				var5.field1264 = var0.method6605(); // L: 135
				if (var5.pathLength == 0) { // L: 136
					var5.orientation = var5.field1264; // L: 137
					var5.field1264 = -1; // L: 138
				}
			}

			if ((var6 & 2048) != 0) { // L: 141
				Players.field1373[var4] = var0.method6593(); // L: 142
			}

			if ((var6 & 512) != 0) { // L: 144
				for (var8 = 0; var8 < 3; ++var8) { // L: 145
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var6 & 8192) != 0) { // L: 147
				var5.field1278 = var0.method6559(); // L: 148
				var5.field1280 = var0.method6597(); // L: 149
				var5.field1269 = var0.method6597(); // L: 150
				var5.field1238 = var0.method6593(); // L: 151
				var5.field1265 = var0.readUnsignedShort() + Client.cycle; // L: 152
				var5.field1283 = var0.method6604() + Client.cycle; // L: 153
				var5.field1284 = var0.method6605(); // L: 154
				if (var5.field1218) { // L: 155
					var5.field1278 += var5.tileX; // L: 156
					var5.field1280 += var5.tileY; // L: 157
					var5.field1269 += var5.tileX; // L: 158
					var5.field1238 += var5.tileY; // L: 159
					var5.pathLength = 0; // L: 160
				} else {
					var5.field1278 += var5.pathX[0]; // L: 163
					var5.field1280 += var5.pathY[0]; // L: 164
					var5.field1269 += var5.pathX[0]; // L: 165
					var5.field1238 += var5.pathY[0]; // L: 166
					var5.pathLength = 1; // L: 167
				}

				var5.field1274 = 0; // L: 169
			}

			if ((var6 & 64) != 0) { // L: 171
				var8 = var0.method6604(); // L: 172
				PlayerType var16 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var0.method6549()); // L: 173
				boolean var20 = var0.method6595() == 1; // L: 174
				var11 = var0.method6595(); // L: 175
				var12 = var0.offset; // L: 176
				if (var5.username != null && var5.appearance != null) { // L: 177
					boolean var21 = false; // L: 178
					if (var16.isUser && NetSocket.friendSystem.isIgnored(var5.username)) { // L: 179 180
						var21 = true;
					}

					if (!var21 && Client.field755 == 0 && !var5.isHidden) { // L: 182
						Players.field1384.offset = 0; // L: 183
						var0.method6677(Players.field1384.array, 0, var11); // L: 184
						Players.field1384.offset = 0; // L: 185
						String var14 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(Players.field1384))); // L: 186
						var5.overheadText = var14.trim(); // L: 187
						var5.overheadTextColor = var8 >> 8; // L: 188
						var5.overheadTextEffect = var8 & 255; // L: 189
						var5.overheadTextCyclesRemaining = 150; // L: 190
						var5.isAutoChatting = var20; // L: 191
						var5.field1248 = var5 != class93.localPlayer && var16.isUser && "" != Client.field863 && var14.toLowerCase().indexOf(Client.field863) == -1; // L: 192
						if (var16.isPrivileged) { // L: 194
							var15 = var20 ? 91 : 1;
						} else {
							var15 = var20 ? 90 : 2; // L: 195
						}

						if (var16.modIcon != -1) {
							World.addGameMessage(var15, SecureRandomFuture.method1982(var16.modIcon) + var5.username.getName(), var14); // L: 196
						} else {
							World.addGameMessage(var15, var5.username.getName(), var14); // L: 197
						}
					}
				}

				var0.offset = var12 + var11; // L: 200
			}

			if ((var6 & 2) != 0) { // L: 202
				var8 = var0.method6595(); // L: 203
				byte[] var22 = new byte[var8]; // L: 204
				Buffer var17 = new Buffer(var22); // L: 205
				var0.method6677(var22, 0, var8); // L: 206
				Players.field1374[var4] = var17; // L: 207
				var5.read(var17); // L: 208
			}

			if ((var6 & 4) != 0) { // L: 210
				var8 = var0.method6603(); // L: 211
				if (var8 == 65535) { // L: 212
					var8 = -1;
				}

				var9 = var0.method6595(); // L: 213
				class32.performPlayerAnimation(var5, var8, var9); // L: 214
			}

			if ((var6 & 4096) != 0) { // L: 216
				var7 = var0.method6597(); // L: 217
			}

			if ((var6 & 32) != 0) { // L: 219
				var5.overheadText = var0.readStringCp1252NullTerminated(); // L: 220
				if (var5.overheadText.charAt(0) == '~') { // L: 221
					var5.overheadText = var5.overheadText.substring(1); // L: 222
					World.addGameMessage(2, var5.username.getName(), var5.overheadText); // L: 223
				} else if (var5 == class93.localPlayer) {
					World.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.isAutoChatting = false;
				var5.overheadTextColor = 0; // L: 229
				var5.overheadTextEffect = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			if (var5.field1218) { // L: 233
				if (var7 == 127) { // L: 234
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					byte var19;
					if (var7 != -1) { // L: 237
						var19 = var7;
					} else {
						var19 = Players.field1373[var4]; // L: 238
					}

					var5.method2129(var5.tileX, var5.tileY, var19); // L: 239
				}
			}
		}

		if (var0.offset - var2 != var1) { // L: 246
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 247
		}
	} // L: 249

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1063766627"
	)
	public static void method1746() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 225

			for (int var0 = 0; var0 < SoundCache.idxCount; ++var0) { // L: 226
				class93.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 227
			JagexCache.JagexCache_randomDat.close(); // L: 228
		} catch (Exception var2) { // L: 230
		}

	} // L: 231

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;Lkt;B)V",
		garbageValue = "0"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class32.canvasWidth - 765) / 2; // L: 1003
		Login.loginBoxX = Login.xPadding + 202; // L: 1004
		UserComparator4.loginBoxCenter = Login.loginBoxX + 180; // L: 1005
		byte var3;
		int var4;
		int var12;
		int var25;
		int var26;
		int var32;
		int var41;
		if (Login.worldSelectOpen) { // L: 1006
			if (class337.worldSelectBackSprites == null) { // L: 1008
				class337.worldSelectBackSprites = class369.method6443(GrandExchangeOfferAgeComparator.archive8, "sl_back", "");
			}

			Archive var42;
			IndexedSprite[] var46;
			if (class25.worldSelectFlagSprites == null) { // L: 1009
				var42 = GrandExchangeOfferAgeComparator.archive8; // L: 1011
				var41 = var42.getGroupId("sl_flags"); // L: 1013
				var26 = var42.getFileId(var41, ""); // L: 1014
				var46 = VerticalAlignment.method2799(var42, var41, var26); // L: 1015
				class25.worldSelectFlagSprites = var46; // L: 1017
			}

			if (HitSplatDefinition.worldSelectArrows == null) { // L: 1019
				var42 = GrandExchangeOfferAgeComparator.archive8; // L: 1021
				var41 = var42.getGroupId("sl_arrows"); // L: 1023
				var26 = var42.getFileId(var41, ""); // L: 1024
				var46 = VerticalAlignment.method2799(var42, var41, var26); // L: 1025
				HitSplatDefinition.worldSelectArrows = var46; // L: 1027
			}

			if (class18.worldSelectStars == null) { // L: 1029
				var42 = GrandExchangeOfferAgeComparator.archive8; // L: 1031
				var41 = var42.getGroupId("sl_stars"); // L: 1033
				var26 = var42.getFileId(var41, ""); // L: 1034
				var46 = VerticalAlignment.method2799(var42, var41, var26); // L: 1035
				class18.worldSelectStars = var46; // L: 1037
			}

			if (class19.worldSelectLeftSprite == null) { // L: 1039
				class19.worldSelectLeftSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "leftarrow", "");
			}

			if (WorldMapID.worldSelectRightSprite == null) { // L: 1040
				WorldMapID.worldSelectRightSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1041
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1042
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1043
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1044
			if (class18.worldSelectStars != null) { // L: 1045
				class18.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1046
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1047
				class18.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1048
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1049
			}

			if (HitSplatDefinition.worldSelectArrows != null) { // L: 1051
				var32 = Login.xPadding + 280; // L: 1052
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1053
					HitSplatDefinition.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var32, 4); // L: 1054
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1055
					HitSplatDefinition.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var32 + 15, 4); // L: 1056
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1); // L: 1057
				var4 = Login.xPadding + 390; // L: 1058
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1059
					HitSplatDefinition.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var4, 4); // L: 1060
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1061
					HitSplatDefinition.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1062
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1063
				var41 = Login.xPadding + 500; // L: 1064
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1065
					HitSplatDefinition.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var41, 4); // L: 1066
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1067
					HitSplatDefinition.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var41 + 15, 4); // L: 1068
				}

				var0.draw("Location", var41 + 32, 17, 16777215, -1); // L: 1069
				var26 = Login.xPadding + 610; // L: 1070
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1071
					HitSplatDefinition.worldSelectArrows[2].drawAt(var26, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var26, 4); // L: 1072
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1073
					HitSplatDefinition.worldSelectArrows[3].drawAt(var26 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var26 + 15, 4); // L: 1074
				}

				var0.draw("Type", var26 + 32, 17, 16777215, -1); // L: 1075
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1077
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1078
			Login.hoveredWorldIndex = -1; // L: 1079
			if (class337.worldSelectBackSprites != null) { // L: 1080
				var3 = 88; // L: 1081
				byte var37 = 19; // L: 1082
				var41 = 765 / (var3 + 1) - 1; // L: 1083
				var26 = 480 / (var37 + 1); // L: 1084

				int var35;
				do {
					var25 = var26; // L: 1086
					var35 = var41; // L: 1087
					if (var26 * (var41 - 1) >= World.World_count) { // L: 1088
						--var41;
					}

					if (var41 * (var26 - 1) >= World.World_count) { // L: 1089
						--var26;
					}

					if (var41 * (var26 - 1) >= World.World_count) { // L: 1090
						--var26;
					}
				} while(var26 != var25 || var41 != var35); // L: 1091

				var25 = (765 - var41 * var3) / (var41 + 1); // L: 1093
				if (var25 > 5) { // L: 1094
					var25 = 5;
				}

				var35 = (480 - var37 * var26) / (var26 + 1); // L: 1095
				if (var35 > 5) { // L: 1096
					var35 = 5;
				}

				int var36 = (765 - var41 * var3 - var25 * (var41 - 1)) / 2; // L: 1097
				int var38 = (480 - var37 * var26 - var35 * (var26 - 1)) / 2; // L: 1098
				int var29 = (var26 + World.World_count - 1) / var26; // L: 1099
				Login.worldSelectPagesCount = var29 - var41; // L: 1100
				if (class19.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1101
					class19.worldSelectLeftSprite.drawAt(8, ReflectionCheck.canvasHeight / 2 - class19.worldSelectLeftSprite.subHeight / 2); // L: 1102
				}

				if (WorldMapID.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1104
					WorldMapID.worldSelectRightSprite.drawAt(class32.canvasWidth - WorldMapID.worldSelectRightSprite.subWidth - 8, ReflectionCheck.canvasHeight / 2 - WorldMapID.worldSelectRightSprite.subHeight / 2); // L: 1105
				}

				var12 = var38 + 23; // L: 1107
				int var39 = var36 + Login.xPadding; // L: 1108
				int var14 = 0; // L: 1109
				boolean var15 = false; // L: 1110
				int var16 = Login.worldSelectPage; // L: 1111

				int var17;
				for (var17 = var16 * var26; var17 < World.World_count && var16 - Login.worldSelectPage < var41; ++var17) { // L: 1112 1113
					World var18 = Tiles.World_worlds[var17]; // L: 1116
					boolean var19 = true; // L: 1117
					String var20 = Integer.toString(var18.population); // L: 1118
					if (var18.population == -1) { // L: 1119
						var20 = "OFF"; // L: 1120
						var19 = false; // L: 1121
					} else if (var18.population > 1980) { // L: 1123
						var20 = "FULL"; // L: 1124
						var19 = false; // L: 1125
					}

					int var22 = 0; // L: 1128
					byte var21;
					if (var18.isBeta()) { // L: 1129
						if (var18.isMembersOnly()) { // L: 1130
							var21 = 7;
						} else {
							var21 = 6; // L: 1131
						}
					} else if (var18.isDeadman()) { // L: 1133
						var22 = 16711680; // L: 1134
						if (var18.isMembersOnly()) { // L: 1135
							var21 = 5;
						} else {
							var21 = 4; // L: 1136
						}
					} else if (var18.method1643()) { // L: 1138
						if (var18.isMembersOnly()) { // L: 1139
							var21 = 9;
						} else {
							var21 = 8; // L: 1140
						}
					} else if (var18.isPvp()) { // L: 1142
						if (var18.isMembersOnly()) { // L: 1143
							var21 = 3;
						} else {
							var21 = 2; // L: 1144
						}
					} else if (var18.isMembersOnly()) { // L: 1147
						var21 = 1;
					} else {
						var21 = 0; // L: 1148
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var37 + var12 && var19) { // L: 1150
						Login.hoveredWorldIndex = var17; // L: 1151
						class337.worldSelectBackSprites[var21].drawTransOverlayAt(var39, var12, 128, 16777215); // L: 1152
						var15 = true; // L: 1153
					} else {
						class337.worldSelectBackSprites[var21].drawAt(var39, var12); // L: 1155
					}

					if (class25.worldSelectFlagSprites != null) { // L: 1156
						class25.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var37 / 2 + var12 + 5, var22, -1); // L: 1157
					var1.drawCentered(var20, var39 + 60, var37 / 2 + var12 + 5, 268435455, -1); // L: 1158
					var12 = var12 + var37 + var35; // L: 1159
					++var14; // L: 1160
					if (var14 >= var26) {
						var12 = var38 + 23; // L: 1161
						var39 = var39 + var3 + var25; // L: 1162
						var14 = 0; // L: 1163
						++var16; // L: 1164
					}
				}

				if (var15) { // L: 1167
					var17 = var1.stringWidth(Tiles.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1168
					int var30 = var1.ascent + 8; // L: 1169
					int var40 = MouseHandler.MouseHandler_y + 25; // L: 1170
					if (var40 + var30 > 480) { // L: 1171
						var40 = MouseHandler.MouseHandler_y - 25 - var30; // L: 1172
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var30, 16777120); // L: 1174
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var30, 0); // L: 1175
					var1.drawCentered(Tiles.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var40 + var1.ascent + 4, 0, -1); // L: 1176
				}
			}

			class26.rasterProvider.drawFull(0, 0); // L: 1179
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1183
			class20.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1184
			Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18); // L: 1185
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1186
				var3 = 20; // L: 1187
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1188
				var4 = 253 - var3; // L: 1189
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1190
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1191
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1192
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1193
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1194
			}

			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) { // L: 1196
				class260.titleboxSprite.drawAt(Login.loginBoxX + 180 - class260.titleboxSprite.subWidth / 2, 271 - class260.titleboxSprite.subHeight / 2); // L: 1197
				var31 = 201; // L: 1198
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1199
				var32 = var31 + 15; // L: 1200
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1201
				var32 += 15; // L: 1202
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1203
				var32 += 15; // L: 1204
				var32 += 7; // L: 1205
				if (Login.loginIndex != 4) { // L: 1206
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0); // L: 1207
					var33 = 200; // L: 1208
					var5 = ObjectComposition.clientPreferences.hideUsername ? class6.method67(Login.Login_username) : Login.Login_username; // L: 1211

					for (var6 = var5; var0.stringWidth(var6) > var33; var6 = var6.substring(0, var6.length() - 1)) { // L: 1213 1214 1215
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var32, 16777215, 0); // L: 1217
					var32 += 15; // L: 1218

					String var7;
					for (var7 = class6.method67(Login.Login_password); var0.stringWidth(var7) > var33; var7 = var7.substring(1)) { // L: 1219 1220 1221
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1223
					var32 += 15; // L: 1224
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1227
				class260.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1228
				short var23;
				if (Login.loginIndex == 0) { // L: 1229
					var31 = 251; // L: 1230
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1231
					var32 = var31 + 30; // L: 1232
					var4 = Login.loginBoxX + 180 - 80; // L: 1233
					var23 = 291; // L: 1234
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1235
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1236
					var4 = Login.loginBoxX + 180 + 80; // L: 1237
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1238
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1239
				} else if (Login.loginIndex == 1) { // L: 1241
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1242
					var31 = 236; // L: 1243
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1244
					var32 = var31 + 15; // L: 1245
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1246
					var32 += 15; // L: 1247
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1248
					var32 += 15; // L: 1249
					var4 = Login.loginBoxX + 180 - 80; // L: 1250
					var23 = 321; // L: 1251
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1252
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1253
					var4 = Login.loginBoxX + 180 + 80; // L: 1254
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1255
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1256
				} else if (Login.loginIndex == 2) { // L: 1258
					var31 = 201; // L: 1259
					var0.drawCentered(Login.Login_response1, UserComparator4.loginBoxCenter, var31, 16776960, 0); // L: 1260
					var32 = var31 + 15; // L: 1261
					var0.drawCentered(Login.Login_response2, UserComparator4.loginBoxCenter, var32, 16776960, 0); // L: 1262
					var32 += 15; // L: 1263
					var0.drawCentered(Login.Login_response3, UserComparator4.loginBoxCenter, var32, 16776960, 0); // L: 1264
					var32 += 15; // L: 1265
					var32 += 7; // L: 1266
					var0.draw("Login: ", UserComparator4.loginBoxCenter - 110, var32, 16777215, 0); // L: 1267
					var33 = 200; // L: 1268

					for (var5 = ScriptEvent.method2086(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1269 1270 1271
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), UserComparator4.loginBoxCenter - 70, var32, 16777215, 0); // L: 1273
					var32 += 15; // L: 1274

					for (var6 = class6.method67(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) { // L: 1275 1276 1277
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), UserComparator4.loginBoxCenter - 108, var32, 16777215, 0); // L: 1279
					var32 += 15; // L: 1280
					var31 = 277; // L: 1281
					var25 = UserComparator4.loginBoxCenter + -117; // L: 1282
					boolean var9 = Client.Login_isUsernameRemembered; // L: 1284
					boolean var10 = Login.field1041; // L: 1285
					IndexedSprite var27 = var9 ? (var10 ? ClanChannel.field33 : GrandExchangeOffer.options_buttons_2Sprite) : (var10 ? Decimator.field553 : options_buttons_0Sprite); // L: 1287
					var27.drawAt(var25, var31); // L: 1290
					var25 = var25 + var27.subWidth + 5; // L: 1291
					var1.draw("Remember username", var25, var31 + 13, 16776960, 0); // L: 1292
					var25 = UserComparator4.loginBoxCenter + 24; // L: 1293
					IndexedSprite var11 = Script.method1995(ObjectComposition.clientPreferences.hideUsername, Login.field1047); // L: 1294
					var11.drawAt(var25, var31); // L: 1295
					var25 = var25 + var11.subWidth + 5; // L: 1296
					var1.draw("Hide username", var25, var31 + 13, 16776960, 0); // L: 1297
					var32 = var31 + 15; // L: 1298
					var12 = UserComparator4.loginBoxCenter - 80; // L: 1299
					short var13 = 321; // L: 1300
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1301
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1302
					var12 = UserComparator4.loginBoxCenter + 80; // L: 1303
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1304
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1305
					var31 = 357; // L: 1306
					switch(Login.field1039) { // L: 1307
					case 2:
						MusicPatchPcmStream.field2885 = "Having trouble logging in?"; // L: 1312
						break;
					default:
						MusicPatchPcmStream.field2885 = "Can't login? Click here."; // L: 1309
					}

					DynamicObject.field1107 = new Bounds(UserComparator4.loginBoxCenter, var31, var1.stringWidth(MusicPatchPcmStream.field2885), 11); // L: 1315
					GrandExchangeOfferOwnWorldComparator.field631 = new Bounds(UserComparator4.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1316
					var1.drawCentered(MusicPatchPcmStream.field2885, UserComparator4.loginBoxCenter, var31, 16777215, 0); // L: 1317
				} else if (Login.loginIndex == 3) { // L: 1319
					var31 = 201; // L: 1320
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1321
					var32 = var31 + 20; // L: 1322
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1323
					var32 += 15; // L: 1324
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1325
					var32 += 15; // L: 1326
					var4 = Login.loginBoxX + 180; // L: 1327
					var23 = 276; // L: 1328
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1329
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1330
					var4 = Login.loginBoxX + 180; // L: 1331
					var23 = 326; // L: 1332
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1333
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1334
				} else {
					short var8;
					if (Login.loginIndex == 4) { // L: 1336
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1337
						var31 = 236; // L: 1338
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1339
						var32 = var31 + 15; // L: 1340
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1341
						var32 += 15; // L: 1342
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1343
						var32 += 15; // L: 1344
						var0.draw("PIN: " + class6.method67(Varps.otp) + (Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1345
						var32 -= 8; // L: 1346
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1347
						var32 += 15; // L: 1348
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1349
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1350
						var41 = var32 - var0.ascent; // L: 1351
						IndexedSprite var34;
						if (Login.field1043) { // L: 1353
							var34 = GrandExchangeOffer.options_buttons_2Sprite; // L: 1354
						} else {
							var34 = options_buttons_0Sprite; // L: 1357
						}

						var34.drawAt(var4, var41); // L: 1359
						var32 += 15; // L: 1360
						var25 = Login.loginBoxX + 180 - 80; // L: 1361
						var8 = 321; // L: 1362
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20); // L: 1363
						var0.drawCentered("Continue", var25, var8 + 5, 16777215, 0); // L: 1364
						var25 = Login.loginBoxX + 180 + 80; // L: 1365
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20); // L: 1366
						var0.drawCentered("Cancel", var25, var8 + 5, 16777215, 0); // L: 1367
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1368
					} else if (Login.loginIndex == 5) { // L: 1370
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1371
						var31 = 221; // L: 1372
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1373
						var32 = var31 + 15; // L: 1374
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1375
						var32 += 15; // L: 1376
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1377
						var32 += 15; // L: 1378
						var32 += 14; // L: 1379
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0); // L: 1380
						var33 = 174; // L: 1381

						for (var5 = ScriptEvent.method2086(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1382 1383 1384
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0); // L: 1386
						var32 += 15; // L: 1387
						var26 = Login.loginBoxX + 180 - 80; // L: 1388
						short var45 = 321; // L: 1389
						Login.titlebuttonSprite.drawAt(var26 - 73, var45 - 20); // L: 1390
						var0.drawCentered("Recover", var26, var45 + 5, 16777215, 0); // L: 1391
						var26 = Login.loginBoxX + 180 + 80; // L: 1392
						Login.titlebuttonSprite.drawAt(var26 - 73, var45 - 20); // L: 1393
						var0.drawCentered("Back", var26, var45 + 5, 16777215, 0); // L: 1394
						var45 = 356; // L: 1395
						var1.drawCentered("Still having trouble logging in?", UserComparator4.loginBoxCenter, var45, 268435455, 0); // L: 1396
					} else if (Login.loginIndex == 6) { // L: 1398
						var31 = 201; // L: 1399
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1400
						var32 = var31 + 15; // L: 1401
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1402
						var32 += 15; // L: 1403
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1404
						var32 += 15; // L: 1405
						var4 = Login.loginBoxX + 180; // L: 1406
						var23 = 321; // L: 1407
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1408
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1409
					} else if (Login.loginIndex == 7) { // L: 1411
						var31 = 216; // L: 1412
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1413
						var32 = var31 + 15; // L: 1414
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1415
						var32 += 15; // L: 1416
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1417
						var32 += 15; // L: 1418
						var4 = Login.loginBoxX + 180 - 80; // L: 1419
						var23 = 321; // L: 1420
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1421
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1422
						var4 = Login.loginBoxX + 180 + 80; // L: 1423
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1424
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1425
					} else if (Login.loginIndex == 8) { // L: 1427
						var31 = 216; // L: 1428
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1429
						var32 = var31 + 15; // L: 1430
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1431
						var32 += 15; // L: 1432
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1433
						var32 += 15; // L: 1434
						var4 = Login.loginBoxX + 180 - 80; // L: 1435
						var23 = 321; // L: 1436
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1437
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1438
						var4 = Login.loginBoxX + 180 + 80; // L: 1439
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1440
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1441
					} else if (Login.loginIndex == 12) { // L: 1443
						var31 = 201; // L: 1444
						String var24 = ""; // L: 1445
						var5 = ""; // L: 1446
						var6 = ""; // L: 1447
						switch(Login.field1032) { // L: 1448
						case 0:
							var24 = "Your account has been disabled."; // L: 1463
							var5 = Strings.field3306; // L: 1464
							var6 = ""; // L: 1465
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1451
							var5 = Strings.field3327; // L: 1452
							var6 = ""; // L: 1453
							break;
						default:
							ClanChannelMember.Login_promptCredentials(false); // L: 1458
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1469
						var32 = var31 + 15; // L: 1470
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1471
						var32 += 15; // L: 1472
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1473
						var32 += 15; // L: 1474
						var25 = Login.loginBoxX + 180; // L: 1475
						var8 = 276; // L: 1476
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20); // L: 1477
						var0.drawCentered("Support Page", var25, var8 + 5, 16777215, 0); // L: 1478
						var25 = Login.loginBoxX + 180; // L: 1479
						var8 = 326; // L: 1480
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20); // L: 1481
						var0.drawCentered("Back", var25, var8 + 5, 16777215, 0); // L: 1482
					} else if (Login.loginIndex == 24) { // L: 1484
						var31 = 221; // L: 1485
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1486
						var32 = var31 + 15; // L: 1487
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1488
						var32 += 15; // L: 1489
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1490
						var32 += 15; // L: 1491
						var4 = Login.loginBoxX + 180; // L: 1492
						var23 = 301; // L: 1493
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1494
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1495
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1498
				int[] var28 = new int[4]; // L: 1499
				Rasterizer2D.Rasterizer2D_getClipArray(var28); // L: 1500
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, ReflectionCheck.canvasHeight); // L: 1501
				class24.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1502
				class24.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1503
				Rasterizer2D.Rasterizer2D_setClipArray(var28); // L: 1504
			}

			Decimator.title_muteSprite[ObjectComposition.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1506
			if (Client.gameState > 5 && Language.Language_EN == class378.clientLanguage) { // L: 1507
				if (class69.field597 != null) { // L: 1508
					var32 = Login.xPadding + 5; // L: 1509
					var33 = 463; // L: 1510
					byte var43 = 100; // L: 1511
					byte var44 = 35; // L: 1512
					class69.field597.drawAt(var32, var33); // L: 1513
					var0.drawCentered("World" + " " + Client.worldId, var43 / 2 + var32, var44 / 2 + var33 - 2, 16777215, 0); // L: 1514
					if (MilliClock.World_request != null) { // L: 1515
						var1.drawCentered("Loading...", var43 / 2 + var32, var44 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var43 / 2 + var32, var44 / 2 + var33 + 12, 16777215, 0); // L: 1516
					}
				} else {
					class69.field597 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "sl_button", ""); // L: 1519
				}
			}

		}
	} // L: 1181 1522
}
