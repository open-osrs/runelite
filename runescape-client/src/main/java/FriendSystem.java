import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
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
		descriptor = "Llw;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2077487873
	)
	int field793;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	FriendSystem(LoginType var1) {
		this.field793 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1042682832"
	)
	boolean method1682() {
		return this.field793 == 2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	final void method1664() {
		this.field793 = 1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "1294740095"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field793 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		class17.method275();
		if (class78.friendsChat != null) {
			class78.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3943 < Occluder.method4335() / 1000L - 5L) {
				if (var1.world > 0) {
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("clear")
	final void clear() {
		this.field793 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpp;ZI)Z",
		garbageValue = "-219417662"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class129.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lpp;B)Z",
		garbageValue = "1"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class274.method5065("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (class129.localPlayer.username.equals(var2)) {
					class274.method5065("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					class274.method5065(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					class274.method5065("Please remove " + var1 + " from your ignore list first");
				} else {
					LoginPacket.method4573(var1);
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1656178783"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field608 != 1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1982011537"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class354.method6255();
				} else if (class129.localPlayer.username.equals(var2)) {
					class274.method5065("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					class274.method5065(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					class274.method5065("Please remove " + var1 + " from your friend list first");
				} else {
					TextureProvider.method4361(var1);
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-76002213"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field608 != 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "262444453"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Decimator.method1052();
					PacketBufferNode var3 = getPacketBufferNode(ClientPacket.field2695, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				class17.method275();
				if (class78.friendsChat != null) {
					class78.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-451774086"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Decimator.method1052();
					PacketBufferNode var3 = getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				WorldMapCacheName.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Z",
		garbageValue = "-801266965"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lix;Loe;S)Lil;",
		garbageValue = "-12337"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1879853365"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "36"
	)
	public static boolean method1727() {
		return class247.musicPlayerStatus != 0 ? true : class135.midiPcmStream.isReady();
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field728) {
			Canvas.method371();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && VarbitComposition.clientPreferences.musicVolume != 0 && !Client.field728) {
			Archive var1 = class276.archive6;
			int var2 = VarbitComposition.clientPreferences.musicVolume;
			class247.musicPlayerStatus = 1;
			class247.musicTrackArchive = var1;
			class247.musicTrackGroupId = var0;
			GrandExchangeOfferOwnWorldComparator.musicTrackFileId = 0;
			class196.musicTrackVolume = var2;
			class20.musicTrackBoolean = false;
			class130.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}
