import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6990585350022661681L
	)
	public static long field1093;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lki;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Ljw;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 132482079
	)
	int field1094;

	@ObfuscatedSignature(
		signature = "(Lmo;)V"
	)
	FriendSystem(LoginType var1) {
		this.field1094 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-100444560"
	)
	boolean method1923() {
		return this.field1094 == 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "-20972"
	)
	final void method1981() {
		this.field1094 = 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-11966056"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field1094 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (ClientPreferences.clanChat != null) {
			ClientPreferences.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "892305960"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3667 < MilliClock.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					ObjectSound.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					ObjectSound.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2071426788"
	)
	@Export("clear")
	final void clear() {
		this.field1094 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkq;ZI)Z",
		garbageValue = "1031830697"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class60.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lkq;B)Z",
		garbageValue = "41"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1198783878"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					AbstractWorldMapData.method328();
				} else if (class60.localPlayer.username.equals(var2)) {
					WorldMapLabelSize.method249();
				} else if (this.isFriended(var2, false)) {
					Canvas.method927(var1);
				} else if (this.isIgnored(var2)) {
					class7.method95(var1);
				} else {
					PacketBufferNode var3 = UserComparator4.getPacketBufferNode(ClientPacket.field2336, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "276950128"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field791 != 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "467200787"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				Object var10000;
				String var4;
				if (this.canAddIgnore()) {
					var10000 = null;
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					ObjectSound.addGameMessage(30, "", var4);
				} else if (class60.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					ObjectSound.addGameMessage(30, "", var4);
				} else if (this.isIgnored(var2)) {
					WorldMapSection1.method655(var1);
				} else if (this.isFriended(var2, false)) {
					TileItemPile.method2904(var1);
				} else {
					PacketBufferNode var3 = UserComparator4.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-516025853"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field791 != 1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-964450223"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field866 = Client.cycleCntr;
					PacketBufferNode var3 = UserComparator4.getPacketBufferNode(ClientPacket.field2306, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (ClientPreferences.clanChat != null) {
					ClientPreferences.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1026417394"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field866 = Client.cycleCntr;
					PacketBufferNode var3 = UserComparator4.getPacketBufferNode(ClientPacket.field2255, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				WorldMapSprite.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkq;B)Z",
		garbageValue = "-1"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		signature = "(Lhd;B)Lhd;",
		garbageValue = "74"
	)
	static Widget method1994(Widget var0) {
		int var1 = WorldMapDecoration.method402(KeyHandler.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = WorldMapSprite.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
