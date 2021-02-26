import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@Export("owner")
	public String owner;
	@ObfuscatedName("b")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1770422849
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 348775717
	)
	int field3671;

	@ObfuscatedSignature(
		descriptor = "(Lml;Lkg;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3671 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-315842787"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljn;",
		garbageValue = "1723641195"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1893983659"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L; // L: 36
		int var7 = var1.length(); // L: 37

		for (int var8 = 0; var8 < var7; ++var8) { // L: 38
			var5 *= 37L; // L: 39
			char var9 = var1.charAt(var8); // L: 40
			if (var9 >= 'A' && var9 <= 'Z') { // L: 41
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 42
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 43
			}

			if (var5 >= 177917621779460413L) { // L: 44
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) { // L: 46
			var5 /= 37L;
		}

		String var10 = Messages.base37DecodeLong(var5); // L: 49
		if (var10 == null) { // L: 50
			var10 = "";
		}

		this.name = var10; // L: 53
	} // L: 54

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L; // L: 61
		int var7 = var1.length(); // L: 62

		for (int var8 = 0; var8 < var7; ++var8) { // L: 63
			var5 *= 37L; // L: 64
			char var9 = var1.charAt(var8); // L: 65
			if (var9 >= 'A' && var9 <= 'Z') { // L: 66
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 67
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 68
			}

			if (var5 >= 177917621779460413L) { // L: 69
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) { // L: 71
			var5 /= 37L;
		}

		String var10 = Messages.base37DecodeLong(var5); // L: 74
		if (var10 == null) { // L: 75
			var10 = "";
		}

		this.owner = var10; // L: 78
	} // L: 79

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "-9"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 82
		long var2 = var1.readLong(); // L: 83
		long var5 = var2; // L: 85
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 87
			if (var2 % 37L == 0L) { // L: 91
				var4 = null; // L: 92
			} else {
				var7 = 0; // L: 95

				for (long var8 = var2; var8 != 0L; var8 /= 37L) { // L: 96 97 99
					++var7; // L: 98
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 101

				while (0L != var5) { // L: 102
					long var11 = var5; // L: 103
					var5 /= 37L; // L: 104
					var10.append(class299.base37Table[(int)(var11 - var5 * 37L)]); // L: 105
				}

				var4 = var10.reverse().toString(); // L: 107
			}
		} else {
			var4 = null; // L: 88
		}

		this.readName(var4); // L: 109
		this.minKick = var1.readByte(); // L: 110
		var7 = var1.readUnsignedByte(); // L: 111
		if (var7 != 255) { // L: 112
			this.clear(); // L: 113

			for (int var13 = 0; var13 < var7; ++var13) { // L: 114
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 115
				int var14 = var1.readUnsignedShort(); // L: 116
				var9.set(var14, ++this.field3671 - 1); // L: 117
				var9.rank = var1.readByte(); // L: 118
				var1.readStringCp1252NullTerminated(); // L: 119
				this.isLocalPlayer(var9); // L: 120
			}

		}
	} // L: 122

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-941337557"
	)
	public final void method5428(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 125
		int var3 = var1.readUnsignedShort(); // L: 126
		byte var4 = var1.readByte(); // L: 127
		boolean var5 = false; // L: 128
		if (var4 == -128) { // L: 129
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 130
			if (this.getSize() == 0) { // L: 131
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 132
			if (var6 != null && var6.getWorld() == var3) { // L: 133
				this.remove(var6); // L: 134
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 138
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 139
			if (var6 == null) { // L: 140
				if (this.getSize() > super.capacity) { // L: 141
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 142
			}

			var6.set(var3, ++this.field3671 - 1); // L: 144
			var6.rank = var4; // L: 145
			this.isLocalPlayer(var6); // L: 146
		}

	} // L: 148

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17506"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 151
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 152
		}

	} // L: 154

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1186051536"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 157
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 158
		}

	} // L: 160

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljb;I)V",
		garbageValue = "1217977801"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 163
			this.rank = var1.rank;
		}

	} // L: 164
}
