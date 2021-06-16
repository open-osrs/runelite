import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1112314023
	)
	static int field3815;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("y")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	@Export("owner")
	public String owner;
	@ObfuscatedName("o")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1281242043
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2021937321
	)
	int field3821;

	@ObfuscatedSignature(
		descriptor = "(Lnb;Llz;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3821 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Llf;",
		garbageValue = "1590299985"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Llf;",
		garbageValue = "-1320557093"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "370345592"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) { // L: 38
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = class80.base37DecodeLong(var5); // L: 49
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10; // L: 53
	} // L: 54

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "919584410"
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

		String var10 = class80.base37DecodeLong(var5); // L: 74
		if (var10 == null) { // L: 75
			var10 = "";
		}

		this.owner = var10; // L: 78
	} // L: 79

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1598769296"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 82
		long var2 = var1.readLong(); // L: 83
		long var5 = var2; // L: 85
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 87
			if (0L == var2 % 37L) { // L: 91
				var4 = null; // L: 92
			} else {
				var7 = 0; // L: 95

				for (long var8 = var2; 0L != var8; var8 /= 37L) { // L: 96 97 99
					++var7; // L: 98
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 101

				while (var5 != 0L) { // L: 102
					long var11 = var5; // L: 103
					var5 /= 37L; // L: 104
					var10.append(class306.base37Table[(int)(var11 - 37L * var5)]); // L: 105
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
				var9.set(var14, ++this.field3821 - 1); // L: 117
				var9.rank = var1.readByte(); // L: 118
				var1.readStringCp1252NullTerminated(); // L: 119
				this.isLocalPlayer(var9); // L: 120
			}

		}
	} // L: 122

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1315927757"
	)
	public final void method5751(Buffer var1) {
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

			var6.set(var3, ++this.field3821 - 1); // L: 144
			var6.rank = var4; // L: 145
			this.isLocalPlayer(var6); // L: 146
		}

	} // L: 148

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 151
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 152
		}

	} // L: 154

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "24878188"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 157
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 158
		}

	} // L: 160

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llt;I)V",
		garbageValue = "1528059933"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 163
			this.rank = var1.rank;
		}

	} // L: 164

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "1551905858"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = GrandExchangeOfferNameComparator.method5193(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) { // L: 36
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 37
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_'); // L: 41
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_'); // L: 43
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + Login.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + GZipDecompressor.clientType + "&e=" + var2); // L: 45
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read(); // L: 47
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	} // L: 51

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method5760() {
		if (Client.oculusOrbState == 1) { // L: 11678
			Client.field705 = true; // L: 11679
		}

	} // L: 11681
}
