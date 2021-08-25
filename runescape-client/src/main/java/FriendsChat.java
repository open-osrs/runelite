import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static Widget field3934;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@Export("owner")
	public String owner;
	@ObfuscatedName("g")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 342416901
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2085968083
	)
	int field3932;

	@ObfuscatedSignature(
		descriptor = "(Lnf;Llt;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3932 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lle;",
		garbageValue = "27"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lle;",
		garbageValue = "-1704587572"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "65"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = BuddyRankComparator.method2456(var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1260867518"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = BuddyRankComparator.method2456(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-661620065"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(InterfaceParent.method2045(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field3932 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1745402205"
	)
	public final void method5877(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3932 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2126941507"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1035680702"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "-1627041344"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10673"
	)
	static final void method5904() {
		PacketBufferNode var0 = FriendSystem.getPacketBufferNode(ClientPacket.field2699, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				WorldMapID.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			Actor.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
