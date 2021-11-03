import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -991444483
	)
	int field765;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	FriendSystem(LoginType var1) {
		this.field765 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1885773213"
	)
	boolean method1757() {
		return this.field765 == 2; // L: 32
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1636767062"
	)
	final void method1746() {
		this.field765 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-3"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field765 = 2; // L: 41
		UserComparator8.method2462(); // L: 42
	} // L: 43

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field3945 < class111.method2516() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					class397.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					class397.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-903439002"
	)
	@Export("clear")
	final void clear() {
		this.field765 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZI)Z",
		garbageValue = "-1394062445"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(HealthBarDefinition.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "624915849"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1752227266"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					class20.method294(); // L: 79
				} else {
					StringBuilder var10000;
					String var4;
					if (HealthBarDefinition.localPlayer.username.equals(var2)) { // L: 82
						var10000 = null; // L: 84
						var4 = "You can't add yourself to your own friend list";
						class397.addGameMessage(30, "", var4); // L: 86
					} else if (this.isFriended(var2, false)) { // L: 91
						var10000 = (new StringBuilder()).append(var1); // L: 93
						Object var10001 = null;
						var4 = var10000.append(" is already on your friend list").toString();
						class397.addGameMessage(30, "", var4); // L: 95
					} else if (this.isIgnored(var2)) { // L: 100
						class279.method5217(var1); // L: 101
					} else {
						PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2747, Client.packetWriter.isaacCipher); // L: 106
						var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1)); // L: 107
						var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 108
						Client.packetWriter.addNode(var3); // L: 109
					}
				}
			}
		}
	} // L: 80 89 98 102 111

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1476294097"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field588 != 1; // L: 128
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1282328040"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 135
			Username var2 = new Username(var1, this.loginType); // L: 136
			if (var2.hasCleanName()) { // L: 137
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 138
					var10000 = null; // L: 140
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class397.addGameMessage(30, "", var3); // L: 142
				} else if (HealthBarDefinition.localPlayer.username.equals(var2)) { // L: 147
					var10000 = null; // L: 149
					var3 = "You can't add yourself to your own ignore list";
					class397.addGameMessage(30, "", var3); // L: 151
				} else if (this.isIgnored(var2)) { // L: 156
					var10000 = (new StringBuilder()).append(var1); // L: 158
					Object var10001 = null;
					var3 = var10000.append(" is already on your ignore list").toString();
					class397.addGameMessage(30, "", var3); // L: 160
				} else if (this.isFriended(var2, false)) { // L: 165
					KeyHandler.method324(var1); // L: 166
				} else {
					class9.method82(var1); // L: 169
				}
			}
		}
	} // L: 145 154 163 167 170

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-31"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field588 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "11"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 195
			Username var2 = new Username(var1, this.loginType); // L: 196
			if (var2.hasCleanName()) { // L: 197
				if (this.friendsList.removeByUsername(var2)) {
					VarcInt.method3033();
					PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2684, Client.packetWriter.isaacCipher); // L: 201
					var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 212

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (AbstractArchive.friendsChat != null) { // L: 219
					AbstractArchive.friendsChat.clearFriends(); // L: 220
				}

			}
		}
	} // L: 223

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "42"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 226
			Username var2 = new Username(var1, this.loginType); // L: 227
			if (var2.hasCleanName()) { // L: 228
				if (this.ignoreList.removeByUsername(var2)) { // L: 229
					VarcInt.method3033(); // L: 230
					PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2700, Client.packetWriter.isaacCipher); // L: 232
					var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1)); // L: 233
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 234
					Client.packetWriter.addNode(var3); // L: 235
				}

				TextureProvider.FriendSystem_invalidateIgnoreds(); // L: 237
			}
		}
	} // L: 238

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "1383012789"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 250
		return var2 != null && var2.hasWorld(); // L: 251
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "87"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = WorldMapEvent.World_worlds[var6]; // L: 180
			WorldMapEvent.World_worlds[var6] = WorldMapEvent.World_worlds[var1]; // L: 181
			WorldMapEvent.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = WorldMapEvent.World_worlds[var9]; // L: 185
				int var12 = WorldMapArchiveLoader.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = WorldMapArchiveLoader.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = WorldMapEvent.World_worlds[var9]; // L: 207
					WorldMapEvent.World_worlds[var9] = WorldMapEvent.World_worlds[var7]; // L: 208
					WorldMapEvent.World_worlds[var7++] = var14; // L: 209
				}
			}

			WorldMapEvent.World_worlds[var1] = WorldMapEvent.World_worlds[var7]; // L: 213
			WorldMapEvent.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1917272702"
	)
	public static void method1755(boolean var0) {
		if (var0 != BuddyRankComparator.ItemDefinition_inMembersWorld) { // L: 554
			CollisionMap.method3492(); // L: 555
			BuddyRankComparator.ItemDefinition_inMembersWorld = var0; // L: 556
		}

	} // L: 558

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-725135495"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		KeyHandler.method343(); // L: 8059
		Client.menuActions[0] = "Cancel"; // L: 8060
		Client.menuTargets[0] = ""; // L: 8061
		Client.menuOpcodes[0] = 1006; // L: 8062
		Client.menuShiftClick[0] = false; // L: 8063
		Client.menuOptionsCount = 1; // L: 8064
	} // L: 8065
}
