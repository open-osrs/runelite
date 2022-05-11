import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2020260253
	)
	int field803;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field803 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-76"
	)
	boolean method1666() {
		return this.field803 == 2; // L: 32
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990336643"
	)
	final void method1667() {
		this.field803 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1619915993"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field803 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (PcmPlayer.friendsChat != null) { // L: 55
			PcmPlayer.friendsChat.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4314 < class113.method2624() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					WorldMapEvent.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					WorldMapEvent.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1844"
	)
	@Export("clear")
	final void clear() {
		this.field803 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqv;ZS)Z",
		garbageValue = "753"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(ModelData0.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqv;I)Z",
		garbageValue = "1274631135"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-35"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					Tiles.method2017(); // L: 95
				} else if (ModelData0.localPlayer.username.equals(var2)) { // L: 98
					InterfaceParent.method2067("You can't add yourself to your own friend list"); // L: 100
				} else if (this.isFriended(var2, false)) { // L: 104
					InterfaceParent.method2067(var1 + " is already on your friend list"); // L: 106
				} else if (this.isIgnored(var2)) { // L: 110
					InterfaceParent.method2067("Please remove " + var1 + " from your ignore list first"); // L: 112
				} else {
					PacketBufferNode var3 = WallDecoration.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 118
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1)); // L: 119
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 120
					Client.packetWriter.addNode(var3); // L: 121
				}
			}
		}
	} // L: 96 102 108 114 123

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "731924017"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field610 != 1; // L: 134
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1674532630"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 141
			Username var2 = new Username(var1, this.loginType); // L: 142
			if (var2.hasCleanName()) { // L: 143
				if (this.canAddIgnore()) { // L: 144
					InterfaceParent.method2067("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 146
				} else if (ModelData0.localPlayer.username.equals(var2)) { // L: 150
					UserComparator9.method2601(); // L: 151
				} else if (this.isIgnored(var2)) { // L: 154
					class230.method4731(var1); // L: 155
				} else if (this.isFriended(var2, false)) { // L: 158
					InterfaceParent.method2067("Please remove " + var1 + " from your friend list first"); // L: 160
				} else {
					PacketBufferNode var3 = WallDecoration.getPacketBufferNode(ClientPacket.field2959, Client.packetWriter.isaacCipher); // L: 166
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1)); // L: 167
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 168
					Client.packetWriter.addNode(var3); // L: 169
				}
			}
		}
	} // L: 148 152 156 162 171

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799291101"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field610 != 1; // L: 182
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1784311825"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 189
			Username var2 = new Username(var1, this.loginType); // L: 190
			if (var2.hasCleanName()) { // L: 191
				if (this.friendsList.removeByUsername(var2)) { // L: 192
					Renderable.method4210(); // L: 193
					PacketBufferNode var3 = WallDecoration.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 195
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1)); // L: 196
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 197
					Client.packetWriter.addNode(var3); // L: 198
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 201
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 202
					var4.clearIsFriend(); // L: 203
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 206

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 207
					var7.clearIsFromFriend(); // L: 209
				}

				if (PcmPlayer.friendsChat != null) { // L: 213
					PcmPlayer.friendsChat.clearFriends(); // L: 214
				}

			}
		}
	} // L: 217

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "516139495"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 220
			Username var2 = new Username(var1, this.loginType); // L: 221
			if (var2.hasCleanName()) { // L: 222
				if (this.ignoreList.removeByUsername(var2)) { // L: 223
					Renderable.method4210(); // L: 224
					PacketBufferNode var3 = WallDecoration.getPacketBufferNode(ClientPacket.field3034, Client.packetWriter.isaacCipher); // L: 226
					var3.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var1)); // L: 227
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 228
					Client.packetWriter.addNode(var3); // L: 229
				}

				class121.FriendSystem_invalidateIgnoreds(); // L: 231
			}
		}
	} // L: 232

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqv;I)Z",
		garbageValue = "723636782"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 244
		return var2 != null && var2.hasWorld(); // L: 245
	}
}
