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
		descriptor = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("z")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@Export("owner")
	public String owner;
	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1015634539
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1149112931
	)
	int field3676;

	@ObfuscatedSignature(
		descriptor = "(Lmu;Lka;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3676 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lju;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lju;",
		garbageValue = "-1524839332"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-513801120"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class238.method4166(var1); // L: 32
	} // L: 33

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-83"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class238.method4166(var1); // L: 36
	} // L: 37

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-147839496"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated()); // L: 40
		long var2 = var1.readLong(); // L: 41
		this.readName(SecureRandomCallable.method1218(var2)); // L: 42
		this.minKick = var1.readByte(); // L: 43
		int var4 = var1.readUnsignedByte(); // L: 44
		if (var4 != 255) { // L: 45
			this.clear(); // L: 46

			for (int var5 = 0; var5 < var4; ++var5) { // L: 47
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 48
				int var7 = var1.readUnsignedShort(); // L: 49
				var6.set(var7, ++this.field3676 - 1); // L: 50
				var6.rank = var1.readByte(); // L: 51
				var1.readStringCp1252NullTerminated(); // L: 52
				this.isLocalPlayer(var6); // L: 53
			}

		}
	} // L: 55

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkj;S)V",
		garbageValue = "255"
	)
	public final void method5251(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 58
		int var3 = var1.readUnsignedShort(); // L: 59
		byte var4 = var1.readByte(); // L: 60
		boolean var5 = false; // L: 61
		if (var4 == -128) { // L: 62
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 63
			if (this.getSize() == 0) { // L: 64
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 65
			if (var6 != null && var6.getWorld() == var3) { // L: 66
				this.remove(var6); // L: 67
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 71
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 72
			if (var6 == null) { // L: 73
				if (this.getSize() > super.capacity) { // L: 74
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 75
			}

			var6.set(var3, ++this.field3676 - 1); // L: 77
			var6.rank = var4; // L: 78
			this.isLocalPlayer(var6); // L: 79
		}

	} // L: 81

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 84
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 85
		}

	} // L: 87

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 90
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)V",
		garbageValue = "353715814"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 96
			this.rank = var1.rank;
		}

	} // L: 97
}
