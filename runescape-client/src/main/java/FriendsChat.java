import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("y")
	@Export("name")
	public String name;
	@ObfuscatedName("p")
	@Export("owner")
	public String owner;
	@ObfuscatedName("j")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -78473377
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1952190137
	)
	int field3817;

	@ObfuscatedSignature(
		descriptor = "(Lnc;Llc;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3817 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "126"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Llx;",
		garbageValue = "1924184817"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-11"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = WorldMapSection0.method3589(var1); // L: 32
	} // L: 33

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-412609184"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = WorldMapSection0.method3589(var1); // L: 36
	} // L: 37

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281712604"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 40
		long var2 = var1.readLong(); // L: 41
		long var5 = var2; // L: 43
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) { // L: 45
			if (0L == var2 % 37L) { // L: 49
				var4 = null; // L: 50
			} else {
				var7 = 0; // L: 53

				for (long var8 = var2; var8 != 0L; var8 /= 37L) { // L: 54 55 57
					++var7; // L: 56
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 59

				while (0L != var5) { // L: 60
					long var11 = var5; // L: 61
					var5 /= 37L; // L: 62
					var10.append(class305.base37Table[(int)(var11 - var5 * 37L)]); // L: 63
				}

				var4 = var10.reverse().toString(); // L: 65
			}
		} else {
			var4 = null; // L: 46
		}

		this.readName(var4); // L: 67
		this.minKick = var1.readByte(); // L: 68
		var7 = var1.readUnsignedByte(); // L: 69
		if (var7 != 255) { // L: 70
			this.clear(); // L: 71

			for (int var13 = 0; var13 < var7; ++var13) { // L: 72
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 73
				int var14 = var1.readUnsignedShort(); // L: 74
				var9.set(var14, ++this.field3817 - 1); // L: 75
				var9.rank = var1.readByte(); // L: 76
				var1.readStringCp1252NullTerminated(); // L: 77
				this.isLocalPlayer(var9); // L: 78
			}

		}
	} // L: 80

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "817545734"
	)
	public final void method5659(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 83
		int var3 = var1.readUnsignedShort(); // L: 84
		byte var4 = var1.readByte(); // L: 85
		boolean var5 = false; // L: 86
		if (var4 == -128) { // L: 87
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 88
			if (this.getSize() == 0) { // L: 89
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 90
			if (var6 != null && var6.getWorld() == var3) { // L: 91
				this.remove(var6); // L: 92
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 96
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 97
			if (var6 == null) { // L: 98
				if (this.getSize() > super.capacity) { // L: 99
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 100
			}

			var6.set(var3, ++this.field3817 - 1); // L: 102
			var6.rank = var4; // L: 103
			this.isLocalPlayer(var6); // L: 104
		}

	} // L: 106

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "308669829"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 109
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 110
		}

	} // L: 112

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1091935656"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 115
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 116
		}

	} // L: 118

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "-263854446"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 121
			this.rank = var1.rank;
		}

	} // L: 122
}
