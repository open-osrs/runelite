import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static class368 field910;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1378545391
	)
	int field908;

	@ObfuscatedSignature(
		descriptor = "(Lmf;)V"
	)
	FriendSystem(LoginType var1) {
		this.field908 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1719() {
		return this.field908 == 2; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	final void method1720() {
		this.field908 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;II)V",
		garbageValue = "474808595"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field908 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		GameEngine.method682(); // L: 47
		if (InterfaceParent.clanChat != null) { // L: 48
			InterfaceParent.clanChat.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1118155085"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field3833 < ObjectSound.currentTimeMillis() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					class69.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					class69.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	@Export("clear")
	final void clear() {
		this.field908 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llw;ZI)Z",
		garbageValue = "-302791861"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(Varcs.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Z",
		garbageValue = "2086987830"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "91342792"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					class124.method2488(); // L: 88
				} else if (Varcs.localPlayer.username.equals(var2)) { // L: 91
					Object var10000 = null; // L: 93
					String var4 = "You can't add yourself to your own friend list";
					class69.addGameMessage(30, "", var4); // L: 95
				} else if (this.isFriended(var2, false)) { // L: 100
					class147.method3014(var1); // L: 101
				} else if (this.isIgnored(var2)) { // L: 104
					Projectile.method1981(var1); // L: 105
				} else {
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 110
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1)); // L: 111
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 112
					Client.packetWriter.addNode(var3); // L: 113
				}
			}
		}
	} // L: 89 98 102 106 115

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2112164938"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field720 != 1; // L: 139
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-9"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 146
			Username var2 = new Username(var1, this.loginType); // L: 147
			if (var2.hasCleanName()) { // L: 148
				if (this.canAddIgnore()) { // L: 149
					class157.method3113(); // L: 150
				} else if (Varcs.localPlayer.username.equals(var2)) { // L: 153
					class35.method435(); // L: 154
				} else if (this.isIgnored(var2)) { // L: 157
					HealthBarUpdate.method2180(var1); // L: 158
				} else if (this.isFriended(var2, false)) { // L: 161
					class11.method205(var1); // L: 162
				} else {
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher); // L: 167
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1)); // L: 168
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 169
					Client.packetWriter.addNode(var3); // L: 170
				}
			}
		}
	} // L: 151 155 159 163 172

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "57"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field720 != 1; // L: 203
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "45"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 210
			Username var2 = new Username(var1, this.loginType); // L: 211
			if (var2.hasCleanName()) { // L: 212
				if (this.friendsList.removeByUsername(var2)) { // L: 213
					MouseHandler.method707(); // L: 214
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher); // L: 216
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1)); // L: 217
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 218
					Client.packetWriter.addNode(var3); // L: 219
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 222
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 223
					var4.clearIsFriend(); // L: 224
				}

				GameEngine.method682(); // L: 226
				if (InterfaceParent.clanChat != null) { // L: 227
					InterfaceParent.clanChat.clearFriends(); // L: 228
				}

			}
		}
	} // L: 231

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-784998952"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 234
			Username var2 = new Username(var1, this.loginType); // L: 235
			if (var2.hasCleanName()) { // L: 236
				if (this.ignoreList.removeByUsername(var2)) { // L: 237
					MouseHandler.method707(); // L: 238
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher); // L: 240
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1)); // L: 241
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 242
					Client.packetWriter.addNode(var3); // L: 243
				}

				class1.FriendSystem_invalidateIgnoreds(); // L: 245
			}
		}
	} // L: 246

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llw;I)Z",
		garbageValue = "-448496053"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 258
		return var2 != null && var2.hasWorld(); // L: 259
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lcs;ZI)V",
		garbageValue = "1735869199"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 3927
			var0.isUnanimated = false; // L: 3928
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 3929 3930
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 3932
			int var3 = var0.y >> 7; // L: 3933
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 3934
				long var4 = AttackOption.calculateTag(0, 0, 0, false, var0.index); // L: 3935
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 3936
					var0.isUnanimated = false; // L: 3937
					var0.tileHeight = UserComparator7.getTileHeight(var0.x, var0.y, class26.Client_plane); // L: 3938
					var0.playerCycle = Client.cycle; // L: 3939
					WorldMapArea.scene.addNullableObject(class26.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 3940
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 3943
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 3944
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 3945
					}

					var0.tileHeight = UserComparator7.getTileHeight(var0.x, var0.y, class26.Client_plane); // L: 3947
					var0.playerCycle = Client.cycle; // L: 3948
					WorldMapArea.scene.drawEntity(class26.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 3949
				}
			}
		}

	} // L: 3953
}
