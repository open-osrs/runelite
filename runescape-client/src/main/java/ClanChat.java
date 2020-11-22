import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("ClanChat")
public class ClanChat extends UserList {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("t")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@Export("owner")
	public String owner;
	@ObfuscatedName("o")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1444461207
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1905995869
	)
	int field3662;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Lka;)V"
	)
	public ClanChat(LoginType var1, Usernamed var2) {
		super(100); // L: 18
		this.name = null; // L: 11
		this.owner = null; // L: 12
		this.field3662 = 1; // L: 15
		this.loginType = var1; // L: 19
		this.localUser = var2; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljh;",
		garbageValue = "-1664145399"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 24
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljh;",
		garbageValue = "-35"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 28
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2147338724"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = Login.method2219(var1); // L: 32
	} // L: 33

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1637949193"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = Login.method2219(var1); // L: 36
	} // L: 37

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkb;S)V",
		garbageValue = "-26042"
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

				for (long var8 = var2; 0L != var8; var8 /= 37L) { // L: 54 55 57
					++var7; // L: 56
				}

				StringBuilder var10 = new StringBuilder(var7); // L: 59

				while (var5 != 0L) { // L: 60
					long var11 = var5; // L: 61
					var5 /= 37L; // L: 62
					var10.append(class299.base37Table[(int)(var11 - var5 * 37L)]); // L: 63
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
				var9.set(var14, ++this.field3662 - 1); // L: 75
				var9.rank = var1.readByte(); // L: 76
				var1.readStringCp1252NullTerminated(); // L: 77
				this.isLocalPlayer(var9); // L: 78
			}

		}
	} // L: 80

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkb;S)V",
		garbageValue = "179"
	)
	public final void method5371(Buffer var1) {
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

			var6.set(var3, ++this.field3662 - 1); // L: 102
			var6.rank = var4; // L: 103
			this.isLocalPlayer(var6); // L: 104
		}

	} // L: 106

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1379027801"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 109
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 110
		}

	} // L: 112

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-958910490"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 115
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 116
		}

	} // L: 118

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "1754058775"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 121
			this.rank = var1.rank;
		}

	} // L: 122

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1171740375"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ScriptFrame.loadInterface(var0)) { // L: 9322
			ItemContainer.field572 = null; // L: 9329
			WorldMapRegion.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9330
			if (ItemContainer.field572 != null) { // L: 9331
				WorldMapRegion.drawInterface(ItemContainer.field572, -1412584499, var1, var2, var3, var4, WorldMapSprite.field256, GrandExchangeOffer.field87, var7); // L: 9332
				ItemContainer.field572 = null; // L: 9333
			}

		} else {
			if (var7 != -1) { // L: 9323
				Client.field834[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9325
					Client.field834[var8] = true;
				}
			}

		}
	} // L: 9327 9335
}
