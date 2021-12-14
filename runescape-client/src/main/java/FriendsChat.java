import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("t")
	@Export("owner")
	public String owner;
	@ObfuscatedName("s")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -541938127
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 805449653
	)
	int field4090;

	@ObfuscatedSignature(
		descriptor = "(Low;Lmz;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field4090 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "2"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmv;",
		garbageValue = "-813912346"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "982680902"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class92.method2353(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "550170662"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class92.method2353(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1860574080"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(BufferedNetSocket.method6496(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field4090 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "191521599"
	)
	public final void method6305(Buffer var1) {
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

			var6.set(var3, ++this.field4090 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1074072286"
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
		garbageValue = "-1945019430"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lmx;I)V",
		garbageValue = "133175483"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
