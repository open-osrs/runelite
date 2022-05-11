import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("owner")
	public String owner;
	@ObfuscatedName("m")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -546532963
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -335963343
	)
	int field4309;

	@ObfuscatedSignature(
		descriptor = "(Lpj;Lnj;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4309 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "-1695844600"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 26
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnb;",
		garbageValue = "1788836658"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 31
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1717144210"
	)
	@Export("readName")
	final void readName(String var1) {
		String var3 = class263.base37DecodeLong(class114.method2626(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1165437728"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		String var3 = class263.base37DecodeLong(class114.method2626(var1)); // L: 47
		if (var3 == null) {
			var3 = ""; // L: 48
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-38"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 55
		long var2 = var1.readLong(); // L: 56
		this.readName(class293.method5431(var2)); // L: 57
		this.minKick = var1.readByte(); // L: 58
		int var4 = var1.readUnsignedByte(); // L: 59
		if (var4 != 255) { // L: 60
			this.clear(); // L: 61

			for (int var5 = 0; var5 < var4; ++var5) { // L: 62
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 63
				int var7 = var1.readUnsignedShort(); // L: 64
				var6.set(var7, ++this.field4309 - 1); // L: 65
				var6.rank = var1.readByte(); // L: 66
				var1.readStringCp1252NullTerminated(); // L: 67
				this.isLocalPlayer(var6); // L: 68
			}

		}
	} // L: 70

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "2"
	)
	public final void method6463(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 73
		int var3 = var1.readUnsignedShort(); // L: 74
		byte var4 = var1.readByte(); // L: 75
		boolean var5 = false; // L: 76
		if (var4 == -128) { // L: 77
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 78
			if (this.getSize() == 0) { // L: 79
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 80
			if (var6 != null && var6.getWorld() == var3) { // L: 81
				this.remove(var6); // L: 82
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 86
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 87
			if (var6 == null) { // L: 88
				if (this.getSize() > super.capacity) { // L: 89
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 90
			}

			var6.set(var3, ++this.field4309 - 1); // L: 92
			var6.rank = var4; // L: 93
			this.isLocalPlayer(var6); // L: 94
		}

	} // L: 96

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-570861245"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 99
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 100
		}

	} // L: 102

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-295246975"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 105
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 106
		}

	} // L: 108

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "402509546"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 111
			this.rank = var1.rank;
		}

	} // L: 112
}
