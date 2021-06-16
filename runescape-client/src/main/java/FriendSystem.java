import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1091220247
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1019813463
	)
	int field928;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	FriendSystem(LoginType var1) {
		this.field928 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method1804() {
		return this.field928 == 2; // L: 32
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26603"
	)
	final void method1817() {
		this.field928 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1640361249"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field928 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		FileSystem.method2647(); // L: 47
		if (class289.friendsChat != null) { // L: 48
			class289.friendsChat.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1325813770"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field3829 < ClientPacket.currentTimeMillis() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					UserComparator10.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					UserComparator10.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	@Export("clear")
	final void clear() {
		this.field928 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZI)Z",
		garbageValue = "2140108913"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(class262.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)Z",
		garbageValue = "668891946"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-935678134"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					GrandExchangeEvent.method5223(); // L: 88
				} else if (class262.localPlayer.username.equals(var2)) { // L: 91
					FloorOverlayDefinition.method3168(); // L: 92
				} else if (this.isFriended(var2, false)) { // L: 95
					MusicPatchNode2.method4537(var1); // L: 96
				} else if (this.isIgnored(var2)) { // L: 99
					DirectByteArrayCopier.method4955(var1); // L: 100
				} else {
					class375.method6530(var1); // L: 103
				}
			}
		}
	} // L: 89 93 97 101 104

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field740 != 1; // L: 143
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 150
			Username var2 = new Username(var1, this.loginType); // L: 151
			if (var2.hasCleanName()) { // L: 152
				Object var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 153
					var10000 = null; // L: 155
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					UserComparator10.addGameMessage(30, "", var3); // L: 157
				} else if (class262.localPlayer.username.equals(var2)) { // L: 162
					var10000 = null; // L: 164
					var3 = "You can't add yourself to your own ignore list";
					UserComparator10.addGameMessage(30, "", var3); // L: 166
				} else if (this.isIgnored(var2)) { // L: 171
					class314.method5693(var1); // L: 172
				} else if (this.isFriended(var2, false)) { // L: 175
					ClanSettings.method201(var1); // L: 176
				} else {
					TextureProvider.method4291(var1); // L: 179
				}
			}
		}
	} // L: 160 169 173 177 180

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field740 != 1; // L: 205
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-120"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 212
			Username var2 = new Username(var1, this.loginType); // L: 213
			if (var2.hasCleanName()) { // L: 214
				if (this.friendsList.removeByUsername(var2)) { // L: 215
					Coord.method4801(); // L: 216
					PacketBufferNode var3 = InterfaceParent.getPacketBufferNode(ClientPacket.field2612, Client.packetWriter.isaacCipher); // L: 218
					var3.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var1)); // L: 219
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 220
					Client.packetWriter.addNode(var3); // L: 221
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 224
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 225
					var4.clearIsFriend(); // L: 226
				}

				FileSystem.method2647(); // L: 228
				if (class289.friendsChat != null) { // L: 229
					class289.friendsChat.clearFriends(); // L: 230
				}

			}
		}
	} // L: 233

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "79"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 236
			Username var2 = new Username(var1, this.loginType); // L: 237
			if (var2.hasCleanName()) { // L: 238
				if (this.ignoreList.removeByUsername(var2)) { // L: 239
					Coord.method4801(); // L: 240
					PacketBufferNode var3 = InterfaceParent.getPacketBufferNode(ClientPacket.field2587, Client.packetWriter.isaacCipher); // L: 242
					var3.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var1)); // L: 243
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 244
					Client.packetWriter.addNode(var3); // L: 245
				}

				World.FriendSystem_invalidateIgnoreds(); // L: 247
			}
		}
	} // L: 248

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)Z",
		garbageValue = "1657999347"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 260
		return var2 != null && var2.hasWorld(); // L: 261
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "702642598"
	)
	static final void method1875(PendingSpawn var0) {
		long var1 = 0L; // L: 7331
		int var3 = -1; // L: 7332
		int var4 = 0; // L: 7333
		int var5 = 0; // L: 7334
		if (var0.type == 0) { // L: 7335
			var1 = DevicePcmPlayerProvider.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7336
			var1 = DevicePcmPlayerProvider.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7337
			var1 = DevicePcmPlayerProvider.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7338
			var1 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 7339
			int var6 = DevicePcmPlayerProvider.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7340
			var3 = Message.Entity_unpackID(var1); // L: 7341
			var4 = var6 & 31; // L: 7342
			var5 = var6 >> 6 & 3; // L: 7343
		}

		var0.objectId = var3; // L: 7345
		var0.field1210 = var4; // L: 7346
		var0.field1209 = var5; // L: 7347
	} // L: 7348

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lci;",
		garbageValue = "-81"
	)
	static final InterfaceParent method1867(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11254
		var3.group = var1; // L: 11255
		var3.type = var2; // L: 11256
		Client.interfaceParents.put(var3, (long)var0); // L: 11257
		TextureProvider.Widget_resetModelFrames(var1); // L: 11258
		Widget var4 = WorldMapData_1.getWidget(var0); // L: 11259
		Script.invalidateWidget(var4); // L: 11260
		if (Client.meslayerContinueWidget != null) { // L: 11261
			Script.invalidateWidget(Client.meslayerContinueWidget); // L: 11262
			Client.meslayerContinueWidget = null; // L: 11263
		}

		WorldMapScaleHandler.method3856(); // L: 11265
		WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11266
		ScriptFrame.runWidgetOnLoadListener(var1); // L: 11267
		if (Client.rootInterface != -1) { // L: 11268
			class8.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11269
	}
}
