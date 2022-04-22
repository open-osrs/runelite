import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("f")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("owner")
	public String owner;
	@ObfuscatedName("n")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1273194957
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 923261223
	)
	int field4244;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lnp;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4244 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-2105397576"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnn;",
		garbageValue = "1888809026"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 29
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "106117795"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L; // L: 37
		int var7 = var1.length(); // L: 38

		for (int var8 = 0; var8 < var7; ++var8) { // L: 39
			var5 *= 37L; // L: 40
			char var9 = var1.charAt(var8); // L: 41
			if (var9 >= 'A' && var9 <= 'Z') { // L: 42
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 43
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 44
			}

			if (var5 >= 177917621779460413L) { // L: 45
				break;
			}
		}

		while (var5 % 37L == 0L && var5 != 0L) { // L: 47
			var5 /= 37L;
		}

		String var10 = class82.base37DecodeLong(var5); // L: 50
		if (var10 == null) { // L: 51
			var10 = "";
		}

		this.name = var10; // L: 54
	} // L: 55

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1333219984"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L; // L: 62
		int var7 = var1.length(); // L: 63

		for (int var8 = 0; var8 < var7; ++var8) { // L: 64
			var5 *= 37L; // L: 65
			char var9 = var1.charAt(var8); // L: 66
			if (var9 >= 'A' && var9 <= 'Z') { // L: 67
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 68
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 69
			}

			if (var5 >= 177917621779460413L) { // L: 70
				break;
			}
		}

		while (0L == var5 % 37L && 0L != var5) { // L: 72
			var5 /= 37L;
		}

		String var10 = class82.base37DecodeLong(var5); // L: 75
		if (var10 == null) { // L: 76
			var10 = "";
		}

		this.owner = var10; // L: 79
	} // L: 80

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-896267822"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 83
		long var2 = var1.readLong(); // L: 84
		long var5 = var2; // L: 86
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 88
			if (0L == var2 % 37L) { // L: 92
				var4 = null; // L: 93
			} else {
				var7 = 0; // L: 96

				for (long var8 = var2; var8 != 0L; var8 /= 37L) { // L: 97 98 100
					++var7; // L: 99
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 102

				while (0L != var5) { // L: 103
					long var11 = var5; // L: 104
					var5 /= 37L; // L: 105
					var10.append(class349.base37Table[(int)(var11 - var5 * 37L)]); // L: 106
				}

				var4 = var10.reverse().toString(); // L: 108
			}
		} else {
			var4 = null; // L: 89
		}

		this.readName(var4); // L: 110
		this.minKick = var1.readByte(); // L: 111
		var7 = var1.readUnsignedByte(); // L: 112
		if (var7 != 255) { // L: 113
			this.clear(); // L: 114

			for (int var13 = 0; var13 < var7; ++var13) { // L: 115
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 116
				int var14 = var1.readUnsignedShort(); // L: 117
				var9.set(var14, ++this.field4244 - 1); // L: 118
				var9.rank = var1.readByte(); // L: 119
				var1.readStringCp1252NullTerminated(); // L: 120
				this.isLocalPlayer(var9); // L: 121
			}

		}
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-432033095"
	)
	public final void method6661(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 126
		int var3 = var1.readUnsignedShort(); // L: 127
		byte var4 = var1.readByte(); // L: 128
		boolean var5 = false; // L: 129
		if (var4 == -128) { // L: 130
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 131
			if (this.getSize() == 0) { // L: 132
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 133
			if (var6 != null && var6.getWorld() == var3) { // L: 134
				this.remove(var6); // L: 135
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 139
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 140
			if (var6 == null) { // L: 141
				if (this.getSize() > super.capacity) { // L: 142
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 143
			}

			var6.set(var3, ++this.field4244 - 1); // L: 145
			var6.rank = var4; // L: 146
			this.isLocalPlayer(var6); // L: 147
		}

	} // L: 149

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990148862"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 152
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 153
		}

	} // L: 155

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1742976679"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 158
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 159
		}

	} // L: 161

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-103692595"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 164
			this.rank = var1.rank;
		}

	} // L: 165
}
