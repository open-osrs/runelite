import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@Export("owner")
	public String owner;
	@ObfuscatedName("g")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1093956825
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -724455409
	)
	int field3939;

	@ObfuscatedSignature(
		descriptor = "(Lni;Llc;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field3939 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lla;",
		garbageValue = "-450730044"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lla;",
		garbageValue = "91"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 29
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-763520850"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class134.method2788(var1); // L: 33
	} // L: 34

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1960344003"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class134.method2788(var1); // L: 37
	} // L: 38

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "248840752"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 41
		long var2 = var1.readLong(); // L: 42
		long var5 = var2; // L: 44
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 46
			if (0L == var2 % 37L) { // L: 50
				var4 = null; // L: 51
			} else {
				var7 = 0; // L: 54

				for (long var8 = var2; 0L != var8; var8 /= 37L) { // L: 55 56 58
					++var7; // L: 57
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 60

				while (var5 != 0L) { // L: 61
					long var11 = var5; // L: 62
					var5 /= 37L; // L: 63
					var10.append(class320.base37Table[(int)(var11 - var5 * 37L)]); // L: 64
				}

				var4 = var10.reverse().toString(); // L: 66
			}
		} else {
			var4 = null; // L: 47
		}

		this.readName(var4); // L: 68
		this.minKick = var1.readByte(); // L: 69
		var7 = var1.readUnsignedByte(); // L: 70
		if (var7 != 255) { // L: 71
			this.clear(); // L: 72

			for (int var13 = 0; var13 < var7; ++var13) { // L: 73
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 74
				int var14 = var1.readUnsignedShort(); // L: 75
				var9.set(var14, ++this.field3939 - 1); // L: 76
				var9.rank = var1.readByte(); // L: 77
				var1.readStringCp1252NullTerminated(); // L: 78
				this.isLocalPlayer(var9); // L: 79
			}

		}
	} // L: 81

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "65280"
	)
	public final void method6040(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		byte var4 = var1.readByte(); // L: 86
		boolean var5 = false; // L: 87
		if (var4 == -128) { // L: 88
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 89
			if (this.getSize() == 0) { // L: 90
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 91
			if (var6 != null && var6.getWorld() == var3) { // L: 92
				this.remove(var6); // L: 93
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 97
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 98
			if (var6 == null) { // L: 99
				if (this.getSize() > super.capacity) { // L: 100
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 101
			}

			var6.set(var3, ++this.field3939 - 1); // L: 103
			var6.rank = var4; // L: 104
			this.isLocalPlayer(var6); // L: 105
		}

	} // L: 107

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 110
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 111
		}

	} // L: 113

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-12509743"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 116
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 117
		}

	} // L: 119

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "609728257"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 122
			this.rank = var1.rank;
		}

	} // L: 123
}
