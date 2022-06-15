import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 594500445
	)
	int field802;

	@ObfuscatedSignature(
		descriptor = "(Lpe;)V"
	)
	FriendSystem(LoginType var1) {
		this.field802 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	boolean method1634() {
		return this.field802 == 2; // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-499734620"
	)
	final void method1635() {
		this.field802 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "-18"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field802 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (Huffman.friendsChat != null) { // L: 55
			Huffman.friendsChat.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1539962262"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4300 < class115.method2692() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					class290.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					class290.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1212770605"
	)
	@Export("clear")
	final void clear() {
		this.field802 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ZI)Z",
		garbageValue = "883394648"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(class101.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z",
		garbageValue = "1096678749"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-108"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				StringBuilder var10000;
				String var4;
				if (this.friendsListIsFull()) { // L: 94
					var10000 = null; // L: 96
					var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					class290.addGameMessage(30, "", var4); // L: 98
				} else if (class101.localPlayer.username.equals(var2)) { // L: 103
					var10000 = null; // L: 105
					var4 = "You can't add yourself to your own friend list";
					class290.addGameMessage(30, "", var4); // L: 107
				} else if (this.isFriended(var2, false)) { // L: 112
					FriendLoginUpdate.method6632(var1); // L: 113
				} else if (this.isIgnored(var2)) { // L: 116
					var10000 = new StringBuilder();
					Object var10001 = null; // L: 118
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var4 = var10000.append(" from your ignore list first").toString();
					class290.addGameMessage(30, "", var4); // L: 120
				} else {
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher); // L: 127
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1)); // L: 128
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 129
					Client.packetWriter.addNode(var3); // L: 130
				}
			}
		}
	} // L: 101 110 114 123 132

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2036548455"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field601 != 1; // L: 142
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "87"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 149
			Username var2 = new Username(var1, this.loginType); // L: 150
			if (var2.hasCleanName()) { // L: 151
				if (this.canAddIgnore()) { // L: 152
					GrandExchangeOfferOwnWorldComparator.method1095(); // L: 153
				} else {
					StringBuilder var10000;
					String var3;
					if (class101.localPlayer.username.equals(var2)) { // L: 156
						var10000 = null; // L: 158
						var3 = "You can't add yourself to your own ignore list";
						class290.addGameMessage(30, "", var3); // L: 160
					} else {
						Object var10001;
						if (this.isIgnored(var2)) { // L: 165
							var10000 = (new StringBuilder()).append(var1); // L: 167
							var10001 = null;
							var3 = var10000.append(" is already on your ignore list").toString();
							class290.addGameMessage(30, "", var3); // L: 169
						} else if (this.isFriended(var2, false)) { // L: 174
							var10000 = new StringBuilder();
							var10001 = null; // L: 176
							var10000 = var10000.append("Please remove ").append(var1);
							var10001 = null;
							var3 = var10000.append(" from your friend list first").toString();
							class290.addGameMessage(30, "", var3); // L: 178
						} else {
							class113.method2632(var1); // L: 183
						}
					}
				}
			}
		}
	} // L: 154 163 172 181 184

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2051401607"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field601 != 1; // L: 202
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1055399844"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 209
			Username var2 = new Username(var1, this.loginType); // L: 210
			if (var2.hasCleanName()) { // L: 211
				if (this.friendsList.removeByUsername(var2)) { // L: 212
					Client.field689 = Client.cycleCntr; // L: 214
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 217
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1)); // L: 218
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 219
					Client.packetWriter.addNode(var3); // L: 220
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 223
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 224
					var4.clearIsFriend(); // L: 225
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 228

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 229
					var7.clearIsFromFriend(); // L: 231
				}

				if (Huffman.friendsChat != null) { // L: 235
					Huffman.friendsChat.clearFriends(); // L: 236
				}

			}
		}
	} // L: 239

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1243393303"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 242
			Username var2 = new Username(var1, this.loginType); // L: 243
			if (var2.hasCleanName()) { // L: 244
				if (this.ignoreList.removeByUsername(var2)) { // L: 245
					Client.field689 = Client.cycleCntr; // L: 247
					PacketBufferNode var3 = EnumComposition.getPacketBufferNode(ClientPacket.field2921, Client.packetWriter.isaacCipher); // L: 250
					var3.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var1)); // L: 251
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 252
					Client.packetWriter.addNode(var3); // L: 253
				}

				class126.FriendSystem_invalidateIgnoreds(); // L: 255
			}
		}
	} // L: 256

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z",
		garbageValue = "-2000641193"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 268
		return var2 != null && var2.hasWorld(); // L: 269
	}
}
