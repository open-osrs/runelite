import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 60387583
	)
	int field798;

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	FriendSystem(LoginType var1) {
		this.field798 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "581100794"
	)
	boolean method1650() {
		return this.field798 == 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1858509524"
	)
	final void method1651() {
		this.field798 = 1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "1685533221"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field798 = 2;
		ItemLayer.method4020();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21942"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3952 < UserComparator4.method2406() / 1000L - 5L) {
				if (var1.world > 0) {
					GraphicsDefaults.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					GraphicsDefaults.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "454898237"
	)
	@Export("clear")
	final void clear() {
		this.field798 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpm;ZI)Z",
		garbageValue = "832653527"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class67.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Z",
		garbageValue = "1448245723"
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
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1077227721"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class196.method3881();
				} else if (class67.localPlayer.username.equals(var2)) {
					MusicPatchNode.method4912();
				} else if (this.isFriended(var2, false)) {
					FloorUnderlayDefinition.method3094(var1);
				} else if (this.isIgnored(var2)) {
					StringBuilder var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					String var3 = var10000.append(" from your ignore list first").toString();
					GraphicsDefaults.addGameMessage(30, "", var3);
				} else {
					WorldMapSection0.method3824(var1);
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "676441464"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "394314051"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class18.method282();
				} else {
					StringBuilder var10000;
					String var3;
					if (class67.localPlayer.username.equals(var2)) {
						var10000 = null;
						var3 = "You can't add yourself to your own ignore list";
						GraphicsDefaults.addGameMessage(30, "", var3);
					} else {
						Object var10001;
						if (this.isIgnored(var2)) {
							var10000 = (new StringBuilder()).append(var1);
							var10001 = null;
							var3 = var10000.append(" is already on your ignore list").toString();
							GraphicsDefaults.addGameMessage(30, "", var3);
						} else if (this.isFriended(var2, false)) {
							var10000 = new StringBuilder();
							var10001 = null;
							var10000 = var10000.append("Please remove ").append(var1);
							var10001 = null;
							var3 = var10000.append(" from your friend list first").toString();
							GraphicsDefaults.addGameMessage(30, "", var3);
						} else {
							Actor.method2152(var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1564665727"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1771954936"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					HealthBarDefinition.method2980();
					PacketBufferNode var3 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2687, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class113.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				ItemLayer.method4020();
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "43"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					HealthBarDefinition.method2980();
					PacketBufferNode var3 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2746, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class113.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				SceneTilePaint.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Z",
		garbageValue = "2010486015"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}
}
