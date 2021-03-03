import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -916897149
	)
	@Export("count")
	int count;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2019207433
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1490859287
	)
	@Export("type")
	int type;
	@ObfuscatedName("c")
	@Export("sender")
	String sender;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("e")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("q")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-313070172"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1; // L: 25
		this.count = var5; // L: 27
		this.cycle = Client.cycle; // L: 28
		this.type = var1; // L: 29
		this.sender = var2; // L: 30
		this.fillSenderUsername(); // L: 31
		this.prefix = var3; // L: 32
		this.text = var4; // L: 33
		this.clearIsFromFriend(); // L: 34
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-624975397"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-547685075"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = InterfaceParent.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "170822627"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = InterfaceParent.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1712388135"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 69
			this.senderUsername = new Username(Calendar.method4153(this.sender), loginType);
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11389
		if (var4 != null) { // L: 11390
			if (Client.minimapState < 3) { // L: 11391
				LoginScreenAnimation.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11392
			}

		}
	} // L: 11393
}
