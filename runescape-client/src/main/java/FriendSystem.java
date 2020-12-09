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
		this.field1069 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-413073532"
	)
	boolean method1939() {
		return this.field1069 == 2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321244010"
	)
	final void method1919() {
		this.field1069 = 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-1406977446"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field1069 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		TileItem.method2189();
		if (WorldMapArea.clanChat != null) {
			WorldMapArea.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "502952777"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3680 < class298.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					class234.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class234.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2051278822"
	)
	@Export("clear")
	final void clear() {
		this.field1069 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lki;ZB)Z",
		garbageValue = "66"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(PlayerAppearance.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "-1147819947"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-262000374"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Calendar.method3985();
				} else if (PlayerAppearance.localPlayer.username.equals(var2)) {
					ServerPacket.method3668();
				} else if (this.isFriended(var2, false)) {
					class219.method4003(var1);
				} else if (this.isIgnored(var2)) {
					StringBuilder var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					String var3 = var10000.append(" from your ignore list first").toString();
					class234.addGameMessage(30, "", var3);
				} else {
					FloorDecoration.method2932(var1);
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1820755315"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field766 != 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1480172940"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class234.addGameMessage(30, "", var3);
				} else if (PlayerAppearance.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					class234.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					var10000 = (new StringBuilder()).append(var1);
					Object var10001 = null;
					var3 = var10000.append(" is already on your ignore list").toString();
					class234.addGameMessage(30, "", var3);
				} else if (this.isFriended(var2, false)) {
					GrandExchangeOfferTotalQuantityComparator.method165(var1);
				} else {
					Skeleton.method3155(var1);
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1353584964"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field766 != 1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "92133268"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field879 = Client.cycleCntr;
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				TileItem.method2189();
				if (WorldMapArea.clanChat != null) {
					WorldMapArea.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "40"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field879 = Client.cycleCntr;
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class9.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "-1294359433"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("h")
	static double method1972(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("v")
	public static boolean method1943(long var0) {
		return 0L != var0 && !AbstractWorldMapIcon.method657(var0);
	}
}
