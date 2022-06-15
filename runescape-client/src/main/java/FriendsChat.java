import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("f")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@Export("owner")
	public String owner;
	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1691262047
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 860712691
	)
	int field4297;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lnv;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4297 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Lne;",
		garbageValue = "-7122"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 26
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lne;",
		garbageValue = "77510907"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 31
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	final void method6590(String var1) {
		this.name = TaskHandler.method3240(var1); // L: 35
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	final void method6591(String var1) {
		this.owner = TaskHandler.method3240(var1); // L: 39
	} // L: 40

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-1186116576"
	)
	public final void method6592(Buffer var1, int var2) {
		this.method6591(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong(); // L: 44
		long var6 = var3; // L: 46
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 48
			if (var3 % 37L == 0L) { // L: 52
				var5 = null; // L: 53
			} else {
				var8 = 0; // L: 56

				for (long var9 = var3; var9 != 0L; var9 /= 37L) { // L: 57 58 60
					++var8; // L: 59
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 62

				while (0L != var6) { // L: 63
					long var12 = var6; // L: 64
					var6 /= 37L; // L: 65
					var11.append(class344.base37Table[(int)(var12 - 37L * var6)]); // L: 66
				}

				var5 = var11.reverse().toString(); // L: 68
			}
		} else {
			var5 = null; // L: 49
		}

		this.method6590(var5); // L: 70
		this.minKick = var1.readByte(); // L: 71
		short var14;
		if (var2 == 1) { // L: 74
			var8 = var1.readUnsignedByte(); // L: 75
			var14 = 255; // L: 76
		} else {
			if (var2 != 2) { // L: 78
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 83
			}

			var8 = var1.method7749(); // L: 79
			var14 = -1; // L: 80
		}

		if (var14 != var8) { // L: 85
			int var10 = var8; // L: 88
			this.clear(); // L: 89

			for (int var15 = 0; var15 < var10; ++var15) { // L: 90
				ClanMate var16 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 91
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4297 - 1); // L: 93
				var16.rank = var1.readByte(); // L: 94
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16); // L: 96
			}

		}
	} // L: 86 98

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "123"
	)
	public final void method6612(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 101
		int var3 = var1.readUnsignedShort(); // L: 102
		byte var4 = var1.readByte(); // L: 103
		boolean var5 = false; // L: 104
		if (var4 == -128) { // L: 105
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 106
			if (this.getSize() == 0) { // L: 107
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 108
			if (var6 != null && var6.getWorld() == var3) { // L: 109
				this.remove(var6); // L: 110
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 114
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 115
			if (var6 == null) { // L: 116
				if (this.getSize() > super.capacity) { // L: 117
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 118
			}

			var6.set(var3, ++this.field4297 - 1); // L: 120
			var6.rank = var4; // L: 121
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "679696158"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 128
		}

	} // L: 130

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1412688360"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "2099019894"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140
}
