import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -813950429
	)
	static int field3818;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("owner")
	public String owner;
	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1749202535
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1051245869
	)
	int field3824;

	@ObfuscatedSignature(
		descriptor = "(Lmf;Lla;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3824 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Llt;",
		garbageValue = "-1522637653"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[Llt;",
		garbageValue = "1232560537"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1170592676"
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

		while (var5 % 37L == 0L && 0L != var5) { // L: 46
			var5 /= 37L;
		}

		String var10 = Varcs.base37DecodeLong(var5); // L: 49
		if (var10 == null) { // L: 50
			var10 = "";
		}

		this.name = var10; // L: 53
	} // L: 54

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-197094825"
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

		while (0L == var5 % 37L && 0L != var5) { // L: 71
			var5 /= 37L;
		}

		String var10 = Varcs.base37DecodeLong(var5); // L: 74
		if (var10 == null) { // L: 75
			var10 = "";
		}

		this.owner = var10; // L: 78
	} // L: 79

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-872249620"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 82
		long var2 = var1.readLong(); // L: 83
		this.readName(class11.method196(var2)); // L: 84
		this.minKick = var1.readByte(); // L: 85
		int var4 = var1.readUnsignedByte(); // L: 86
		if (var4 != 255) { // L: 87
			this.clear(); // L: 88

			for (int var5 = 0; var5 < var4; ++var5) { // L: 89
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 90
				int var7 = var1.readUnsignedShort(); // L: 91
				var6.set(var7, ++this.field3824 - 1); // L: 92
				var6.rank = var1.readByte(); // L: 93
				var1.readStringCp1252NullTerminated(); // L: 94
				this.isLocalPlayer(var6); // L: 95
			}

		}
	} // L: 97

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-2086644068"
	)
	public final void method5653(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 100
		int var3 = var1.readUnsignedShort(); // L: 101
		byte var4 = var1.readByte(); // L: 102
		boolean var5 = false; // L: 103
		if (var4 == -128) { // L: 104
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 105
			if (this.getSize() == 0) { // L: 106
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 107
			if (var6 != null && var6.getWorld() == var3) { // L: 108
				this.remove(var6); // L: 109
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 113
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 114
			if (var6 == null) { // L: 115
				if (this.getSize() > super.capacity) { // L: 116
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 117
			}

			var6.set(var3, ++this.field3824 - 1); // L: 119
			var6.rank = var4; // L: 120
			this.isLocalPlayer(var6); // L: 121
		}

	} // L: 123

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1868427261"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 126
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 127
		}

	} // L: 129

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 132
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 133
		}

	} // L: 135

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "-409410599"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 138
			this.rank = var1.rank;
		}

	} // L: 139

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;Ljava/lang/String;Ljava/lang/String;I)Lkq;",
		garbageValue = "762686546"
	)
	public static Font method5655(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 182
		int var5 = var0.getFileId(var4, var3); // L: 183
		return class236.method4378(var0, var1, var4, var5); // L: 184
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Z",
		garbageValue = "633331288"
	)
	static final boolean method5644(Widget var0) {
		int var1 = var0.contentType; // L: 11332
		if (var1 == 205) { // L: 11333
			Client.logoutTimer = 250; // L: 11334
			return true; // L: 11335
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11337
				var2 = (var1 - 300) / 2; // L: 11338
				var3 = var1 & 1; // L: 11339
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11340
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11342
				var2 = (var1 - 314) / 2; // L: 11343
				var3 = var1 & 1; // L: 11344
				Client.playerAppearance.method4205(var2, var3 == 1); // L: 11345
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11347
			}

			if (var1 == 325) { // L: 11348
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11349
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2225, Client.packetWriter.isaacCipher); // L: 11351
				Client.playerAppearance.write(var4.packetBuffer); // L: 11352
				Client.packetWriter.addNode(var4); // L: 11353
				return true; // L: 11354
			} else {
				return false; // L: 11356
			}
		}
	}
}
