import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1759557777
	)
	static int field812;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1992863507
	)
	int field810;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	FriendSystem(LoginType var1) {
		this.field810 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1303902658"
	)
	boolean method1675() {
		return this.field810 == 2; // L: 32
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	final void method1704() {
		this.field810 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1785729800"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field810 = 2; // L: 41
		GameBuild.method5483(); // L: 42
	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-814185820"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4148 < DirectByteArrayCopier.method5318() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					LoginScreenAnimation.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					LoginScreenAnimation.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("clear")
	final void clear() {
		this.field810 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZI)Z",
		garbageValue = "104721685"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(WorldMapSprite.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpb;B)Z",
		garbageValue = "-51"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1465117831"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				StringBuilder var10000;
				String var4;
				if (this.friendsListIsFull()) { // L: 78
					var10000 = null; // L: 80
					var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					LoginScreenAnimation.addGameMessage(30, "", var4); // L: 82
				} else if (WorldMapSprite.localPlayer.username.equals(var2)) { // L: 87
					var10000 = null; // L: 89
					var4 = "You can't add yourself to your own friend list";
					LoginScreenAnimation.addGameMessage(30, "", var4); // L: 91
				} else {
					Object var10001;
					if (this.isFriended(var2, false)) { // L: 96
						var10000 = (new StringBuilder()).append(var1); // L: 98
						var10001 = null;
						var4 = var10000.append(" is already on your friend list").toString();
						LoginScreenAnimation.addGameMessage(30, "", var4); // L: 100
					} else if (this.isIgnored(var2)) { // L: 105
						var10000 = new StringBuilder();
						var10001 = null; // L: 107
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your ignore list first").toString();
						LoginScreenAnimation.addGameMessage(30, "", var4); // L: 109
					} else {
						PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher); // L: 116
						var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1)); // L: 117
						var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 118
						Client.packetWriter.addNode(var3); // L: 119
					}
				}
			}
		}
	} // L: 85 94 103 112 121

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-702179209"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field772 != 1; // L: 124
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-80"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 131
			Username var2 = new Username(var1, this.loginType); // L: 132
			if (var2.hasCleanName()) { // L: 133
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 134
					var10000 = null; // L: 136
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					LoginScreenAnimation.addGameMessage(30, "", var3); // L: 138
				} else if (WorldMapSprite.localPlayer.username.equals(var2)) { // L: 143
					var10000 = null; // L: 145
					var3 = "You can't add yourself to your own ignore list";
					LoginScreenAnimation.addGameMessage(30, "", var3); // L: 147
				} else if (this.isIgnored(var2)) { // L: 152
					WorldMapArea.method4446(var1); // L: 153
				} else if (this.isFriended(var2, false)) { // L: 156
					var10000 = new StringBuilder();
					Object var10001 = null; // L: 158
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var3 = var10000.append(" from your friend list first").toString();
					LoginScreenAnimation.addGameMessage(30, "", var3); // L: 160
				} else {
					class414.method7279(var1); // L: 165
				}
			}
		}
	} // L: 141 150 154 163 166

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field772 != 1; // L: 184
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2034559615"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 191
			Username var2 = new Username(var1, this.loginType); // L: 192
			if (var2.hasCleanName()) { // L: 193
				if (this.friendsList.removeByUsername(var2)) { // L: 194
					class412.method7241(); // L: 195
					PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher); // L: 197
					var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1)); // L: 198
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 199
					Client.packetWriter.addNode(var3); // L: 200
				}

				GameBuild.method5483(); // L: 202
			}
		}
	} // L: 203

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "122"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 206
			Username var2 = new Username(var1, this.loginType); // L: 207
			if (var2.hasCleanName()) { // L: 208
				if (this.ignoreList.removeByUsername(var2)) { // L: 209
					class412.method7241(); // L: 210
					PacketBufferNode var3 = class135.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3); // L: 215
				}

				MouseRecorder.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "-1241513602"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-528431965"
	)
	static final boolean method1689(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 212
		Buffer var4 = new Buffer(var0); // L: 213
		int var5 = -1; // L: 214

		label68:
		while (true) {
			int var6 = var4.method7383(); // L: 216
			if (var6 == 0) { // L: 217
				return var3; // L: 248
			}

			var5 += var6; // L: 218
			int var7 = 0; // L: 219
			boolean var8 = false; // L: 220

			while (true) {
				int var9;
				while (!var8) { // L: 222
					var9 = var4.readUShortSmart(); // L: 228
					if (var9 == 0) { // L: 229
						continue label68;
					}

					var7 += var9 - 1; // L: 230
					int var10 = var7 & 63; // L: 231
					int var11 = var7 >> 6 & 63; // L: 232
					int var12 = var4.readUnsignedByte() >> 2; // L: 233
					int var13 = var11 + var1; // L: 234
					int var14 = var10 + var2; // L: 235
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 236
						ObjectComposition var15 = ParamComposition.getObjectDefinition(var5); // L: 237
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 238
							if (!var15.needsModelFiles()) { // L: 239
								++Client.field559; // L: 240
								var3 = false; // L: 241
							}

							var8 = true; // L: 243
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 223
				if (var9 == 0) { // L: 224
					break;
				}

				var4.readUnsignedByte(); // L: 225
			}
		}
	}
}
