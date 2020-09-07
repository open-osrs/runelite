import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("n")
	@Export("owner")
	public String owner;
	@ObfuscatedName("d")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 996591213
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -463550623
	)
	int field3661;

	@ObfuscatedSignature(
		descriptor = "(Lmu;Lkp;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3661 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "35"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljc;",
		garbageValue = "-19"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2006450135"
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

		String var10 = GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var5); // L: 49
		if (var10 == null) { // L: 50
			var10 = "";
		}

		this.name = var10; // L: 53
	} // L: 54

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-13"
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

		String var10 = GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var5); // L: 74
		if (var10 == null) { // L: 75
			var10 = "";
		}

		this.owner = var10; // L: 78
	} // L: 79

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-140522773"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 82
		long var2 = var1.readLong(); // L: 83
		this.readName(AbstractWorldMapData.method331(var2)); // L: 84
		this.minKick = var1.readByte(); // L: 85
		int var4 = var1.readUnsignedByte(); // L: 86
		if (var4 != 255) { // L: 87
			this.clear(); // L: 88

			for (int var5 = 0; var5 < var4; ++var5) { // L: 89
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 90
				int var7 = var1.readUnsignedShort(); // L: 91
				var6.set(var7, ++this.field3661 - 1); // L: 92
				var6.rank = var1.readByte(); // L: 93
				var1.readStringCp1252NullTerminated(); // L: 94
				this.isLocalPlayer(var6); // L: 95
			}

		}
	} // L: 97

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1609519630"
	)
	public final void method5350(Buffer var1) {
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

			var6.set(var3, ++this.field3661 - 1); // L: 119
			var6.rank = var4; // L: 120
			this.isLocalPlayer(var6); // L: 121
		}

	} // L: 123

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1118151470"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 126
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 127
		}

	} // L: 129

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1383721491"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 132
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 133
		}

	} // L: 135

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-1871849373"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 138
			this.rank = var1.rank;
		}

	} // L: 139

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2030161914"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 9635
	}
}
