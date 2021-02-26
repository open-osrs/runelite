import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1793991825
	)
	int field1084;

	@ObfuscatedSignature(
		descriptor = "(Lml;)V"
	)
	FriendSystem(LoginType var1) {
		this.field1084 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1945346484"
	)
	boolean method1974() {
		return this.field1084 == 2; // L: 32
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2084368484"
	)
	final void method1975() {
		this.field1084 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-1050410631"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field1084 = 2; // L: 41
		class105.method2448(); // L: 42
	} // L: 43

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1241092725"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field3676 < Tiles.currentTimeMillis() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					AbstractWorldMapData.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					AbstractWorldMapData.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("clear")
	final void clear() {
		this.field1084 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkk;ZB)Z",
		garbageValue = "44"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(UserComparator9.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)Z",
		garbageValue = "-645506648"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "54"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					class300.method5473("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (UserComparator9.localPlayer.username.equals(var2)) { // L: 84
					class300.method5473("You can't add yourself to your own friend list"); // L: 86
				} else if (this.isFriended(var2, false)) { // L: 90
					class300.method5473(var1 + " is already on your friend list"); // L: 92
				} else if (this.isIgnored(var2)) { // L: 96
					class300.method5473("Please remove " + var1 + " from your ignore list first"); // L: 98
				} else {
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2302, Client.packetWriter.isaacCipher); // L: 104
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1)); // L: 105
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 106
					Client.packetWriter.addNode(var3); // L: 107
				}
			}
		}
	} // L: 82 88 94 100 109

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "23277245"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field673 != 1; // L: 116
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-821036710"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 123
			Username var2 = new Username(var1, this.loginType); // L: 124
			if (var2.hasCleanName()) { // L: 125
				if (this.canAddIgnore()) { // L: 126
					WorldMapAreaData.method781(); // L: 127
				} else if (UserComparator9.localPlayer.username.equals(var2)) { // L: 130
					NetSocket.method3748(); // L: 131
				} else if (this.isIgnored(var2)) { // L: 134
					class300.method5473(var1 + " is already on your ignore list"); // L: 136
				} else if (this.isFriended(var2, false)) { // L: 140
					Tiles.method1209(var1); // L: 141
				} else {
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher); // L: 146
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1)); // L: 147
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 148
					Client.packetWriter.addNode(var3); // L: 149
				}
			}
		}
	} // L: 128 132 138 142 151

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-319380471"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field673 != 1; // L: 166
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "14"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 173
			Username var2 = new Username(var1, this.loginType); // L: 174
			if (var2.hasCleanName()) { // L: 175
				if (this.friendsList.removeByUsername(var2)) { // L: 176
					Client.field857 = Client.cycleCntr; // L: 178
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher); // L: 181
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1)); // L: 182
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 183
					Client.packetWriter.addNode(var3); // L: 184
				}

				class105.method2448(); // L: 186
			}
		}
	} // L: 187

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1962434605"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 190
			Username var2 = new Username(var1, this.loginType); // L: 191
			if (var2.hasCleanName()) { // L: 192
				if (this.ignoreList.removeByUsername(var2)) { // L: 193
					Client.field857 = Client.cycleCntr; // L: 195
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher); // L: 198
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1)); // L: 199
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 200
					Client.packetWriter.addNode(var3); // L: 201
				}

				class51.FriendSystem_invalidateIgnoreds(); // L: 203
			}
		}
	} // L: 204

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)Z",
		garbageValue = "-914482688"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 216
		return var2 != null && var2.hasWorld(); // L: 217
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIB)V",
		garbageValue = "1"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10875
			if (var0 != null) { // L: 10877
				Widget var4 = Strings.method4325(var0); // L: 10880
				if (var4 == null) { // L: 10881
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 10884
					Client.clickedWidget = var0; // L: 10888
					var4 = Strings.method4325(var0); // L: 10891
					if (var4 == null) { // L: 10892
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 10895
					Client.widgetClickX = var1; // L: 10896
					Client.widgetClickY = var2; // L: 10897
					PlayerComposition.widgetDragDuration = 0; // L: 10898
					Client.isDraggingWidget = false; // L: 10899
					int var6 = Client.menuOptionsCount - 1; // L: 10902
					if (var6 != -1) { // L: 10905
						class195.tempMenuAction = new MenuAction(); // L: 10906
						class195.tempMenuAction.param0 = Client.menuArguments1[var6]; // L: 10907
						class195.tempMenuAction.param1 = Client.menuArguments2[var6]; // L: 10908
						class195.tempMenuAction.opcode = Client.menuOpcodes[var6]; // L: 10909
						class195.tempMenuAction.identifier = Client.menuIdentifiers[var6]; // L: 10910
						class195.tempMenuAction.action = Client.menuActions[var6]; // L: 10911
					}

					return; // L: 10913
				}
			}

		}
	} // L: 10886
}
