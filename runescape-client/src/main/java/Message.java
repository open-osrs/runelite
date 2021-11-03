import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1439385015
	)
	@Export("count")
	int count;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1007637791
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1516763961
	)
	@Export("type")
	int type;
	@ObfuscatedName("a")
	@Export("sender")
	String sender;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("p")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("j")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2078367400"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = WorldMapDecorationType.method5193(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1556257738"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-16"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-788455751"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class112.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1428904972"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1115298616"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class112.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1849939202"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(WallDecoration.method4643(this.sender), GrandExchangeOfferUnitPriceComparator.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "45"
	)
	static boolean method1143(String var0, int var1) {
		return Occluder.method4485(var0, var1, "openjs"); // L: 55
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "51397423"
	)
	static String method1149(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 195

		for (int var3 = 0; var3 < var1; ++var3) { // L: 196
			var2[var3] = var0;
		}

		return new String(var2); // L: 197
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1843523550"
	)
	static boolean method1147() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5128
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-404550822"
	)
	static final void method1146() {
		int var0 = SecureRandomCallable.menuX; // L: 8084
		int var1 = Frames.menuY; // L: 8085
		int var2 = ObjectComposition.menuWidth; // L: 8086
		int var3 = StudioGame.menuHeight; // L: 8087
		int var4 = 6116423; // L: 8088
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8089
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8090
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8091
		Login.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8092
		int var5 = MouseHandler.MouseHandler_x; // L: 8093
		int var6 = MouseHandler.MouseHandler_y; // L: 8094

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8095
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 8096
			int var9 = 16777215; // L: 8097
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8098
				var9 = 16776960;
			}

			Login.fontBold12.draw(class392.method6873(var7), var0 + 3, var8, var9, 0); // L: 8099
		}

		Language.method5516(SecureRandomCallable.menuX, Frames.menuY, ObjectComposition.menuWidth, StudioGame.menuHeight); // L: 8101
	} // L: 8102
}
