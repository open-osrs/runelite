import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -471255991
	)
	int field713;

	@ObfuscatedSignature(
		descriptor = "(Lnf;)V"
	)
	FriendSystem(LoginType var1) {
		this.field713 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-759002684"
	)
	boolean method1473() {
		return this.field713 == 2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2024285394"
	)
	final void method1440() {
		this.field713 = 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "-469570565"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field713 = 2;
		class107.method2293();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-905255692"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3846 < UrlRequester.method2125() / 1000L - 5L) {
				if (var1.world > 0) {
					class120.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class120.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1918010624"
	)
	@Export("clear")
	final void clear() {
		this.field713 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Loh;ZI)Z",
		garbageValue = "1313209132"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(MouseHandler.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Loh;I)Z",
		garbageValue = "-622518373"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1772980259"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					SequenceDefinition.method3167();
				} else if (MouseHandler.localPlayer.username.equals(var2)) {
					MouseHandler.method369("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					MouseHandler.method369(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					MouseHandler.method369("Please remove " + var1 + " from your ignore list first");
				} else {
					PacketBufferNode var3 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2564, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "330747119"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field525 != 1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1413332284"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class315.method5681();
				} else if (MouseHandler.localPlayer.username.equals(var2)) {
					class270.method4928();
				} else if (this.isIgnored(var2)) {
					MouseHandler.method369(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					MouseHandler.method369("Please remove " + var1 + " from your friend list first");
				} else {
					class376.method6562(var1);
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field525 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field609 = Client.cycleCntr;
					PacketBufferNode var3 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class107.method2293();
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1226126458"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					class124.method2539();
					PacketBufferNode var3 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2578, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				AbstractByteArrayCopier.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Loh;I)Z",
		garbageValue = "-1196057065"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;B)V",
		garbageValue = "1"
	)
	public static void method1452(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Leg;",
		garbageValue = "126"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "738859003"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[GrandExchangeEvent.Client_plane][var0][var1];
		if (var2 == null) {
			WorldMapIcon_1.scene.removeGroundItemPile(GrandExchangeEvent.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = KeyHandler.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				WorldMapIcon_1.scene.removeGroundItemPile(GrandExchangeEvent.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = class171.calculateTag(var0, var1, 3, false, 0);
				WorldMapIcon_1.scene.newGroundItemPile(GrandExchangeEvent.Client_plane, var0, var1, class122.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GrandExchangeEvent.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
