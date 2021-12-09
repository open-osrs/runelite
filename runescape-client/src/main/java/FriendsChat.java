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
		super(100); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4090 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "2"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 26
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmv;",
		garbageValue = "-813912346"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 31
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "982680902"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class92.method2353(var1); // L: 35
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "550170662"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class92.method2353(var1); // L: 39
	} // L: 40

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1860574080"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 43
		long var2 = var1.readLong(); // L: 44
		this.readName(BufferedNetSocket.method6496(var2)); // L: 45
		this.minKick = var1.readByte(); // L: 46
		int var4 = var1.readUnsignedByte(); // L: 47
		if (var4 != 255) { // L: 48
			this.clear(); // L: 49

			for (int var5 = 0; var5 < var4; ++var5) { // L: 50
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 51
				int var7 = var1.readUnsignedShort(); // L: 52
				var6.set(var7, ++this.field4090 - 1); // L: 53
				var6.rank = var1.readByte(); // L: 54
				var1.readStringCp1252NullTerminated(); // L: 55
				this.isLocalPlayer(var6); // L: 56
			}

		}
	} // L: 58

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "191521599"
	)
	public final void method6305(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 61
		int var3 = var1.readUnsignedShort(); // L: 62
		byte var4 = var1.readByte(); // L: 63
		boolean var5 = false; // L: 64
		if (var4 == -128) { // L: 65
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 66
			if (this.getSize() == 0) { // L: 67
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 68
			if (var6 != null && var6.getWorld() == var3) { // L: 69
				this.remove(var6); // L: 70
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 74
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 75
			if (var6 == null) { // L: 76
				if (this.getSize() > super.capacity) { // L: 77
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 78
			}

			var6.set(var3, ++this.field4090 - 1); // L: 80
			var6.rank = var4; // L: 81
			this.isLocalPlayer(var6); // L: 82
		}

	} // L: 84

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1074072286"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 87
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 88
		}

	} // L: 90

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1945019430"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 93
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 94
		}

	} // L: 96

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lmx;I)V",
		garbageValue = "133175483"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 99
			this.rank = var1.rank;
		}

	} // L: 100
}
