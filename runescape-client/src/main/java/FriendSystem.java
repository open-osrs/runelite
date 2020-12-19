import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -831766123
	)
	static int field1065;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1062926745
	)
	static int field1071;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 584921379
	)
	int field1069;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	FriendSystem(LoginType var1) {
		this.field1069 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-413073532"
	)
	boolean method1939() {
		return this.field1069 == 2; // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321244010"
	)
	final void method1919() {
		this.field1069 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-1406977446"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field1069 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		TileItem.method2189(); // L: 47
		if (WorldMapArea.clanChat != null) {
			WorldMapArea.clanChat.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "502952777"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field3680 < class298.currentTimeMillis() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					class234.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					class234.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2051278822"
	)
	@Export("clear")
	final void clear() {
		this.field1069 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lki;ZB)Z",
		garbageValue = "66"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(PlayerAppearance.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "-1147819947"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-262000374"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					Calendar.method3985(); // L: 88
				} else if (PlayerAppearance.localPlayer.username.equals(var2)) { // L: 91
					ServerPacket.method3668(); // L: 92
				} else if (this.isFriended(var2, false)) { // L: 95
					class219.method4003(var1); // L: 96
				} else if (this.isIgnored(var2)) { // L: 99
					StringBuilder var10000 = new StringBuilder();
					Object var10001 = null; // L: 101
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					String var3 = var10000.append(" from your ignore list first").toString();
					class234.addGameMessage(30, "", var3); // L: 103
				} else {
					FloorDecoration.method2932(var1); // L: 108
				}
			}
		}
	} // L: 89 93 97 106 109

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1820755315"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field766 != 1; // L: 141
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1480172940"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 148
			Username var2 = new Username(var1, this.loginType); // L: 149
			if (var2.hasCleanName()) { // L: 150
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 151
					var10000 = null; // L: 153
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class234.addGameMessage(30, "", var3); // L: 155
				} else if (PlayerAppearance.localPlayer.username.equals(var2)) { // L: 160
					var10000 = null; // L: 162
					var3 = "You can't add yourself to your own ignore list";
					class234.addGameMessage(30, "", var3); // L: 164
				} else if (this.isIgnored(var2)) { // L: 169
					var10000 = (new StringBuilder()).append(var1); // L: 171
					Object var10001 = null;
					var3 = var10000.append(" is already on your ignore list").toString();
					class234.addGameMessage(30, "", var3); // L: 173
				} else if (this.isFriended(var2, false)) { // L: 178
					GrandExchangeOfferTotalQuantityComparator.method165(var1); // L: 179
				} else {
					Skeleton.method3155(var1); // L: 182
				}
			}
		}
	} // L: 158 167 176 180 183

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1353584964"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field766 != 1; // L: 201
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "92133268"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 208
			Username var2 = new Username(var1, this.loginType); // L: 209
			if (var2.hasCleanName()) { // L: 210
				if (this.friendsList.removeByUsername(var2)) { // L: 211
					Client.field879 = Client.cycleCntr; // L: 213
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher); // L: 216
					var3.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var1)); // L: 217
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 218
					Client.packetWriter.addNode(var3); // L: 219
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 222
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 223
					var4.clearIsFriend(); // L: 224
				}

				TileItem.method2189(); // L: 226
				if (WorldMapArea.clanChat != null) { // L: 227
					WorldMapArea.clanChat.clearFriends(); // L: 228
				}

			}
		}
	} // L: 231

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "40"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 234
			Username var2 = new Username(var1, this.loginType); // L: 235
			if (var2.hasCleanName()) { // L: 236
				if (this.ignoreList.removeByUsername(var2)) { // L: 237
					Client.field879 = Client.cycleCntr; // L: 239
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher); // L: 242
					var3.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var1)); // L: 243
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 244
					Client.packetWriter.addNode(var3); // L: 245
				}

				class9.FriendSystem_invalidateIgnoreds(); // L: 247
			}
		}
	} // L: 248

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "-1294359433"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 260
		return var2 != null && var2.hasWorld(); // L: 261
	}

	@ObfuscatedName("h")
	static double method1972(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("v")
	public static boolean method1943(long var0) {
		return 0L != var0 && !AbstractWorldMapIcon.method657(var0); // L: 48
	}
}
