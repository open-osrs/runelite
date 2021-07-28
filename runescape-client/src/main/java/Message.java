import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1404682675
	)
	@Export("count")
	int count;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1530522167
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 254325393
	)
	@Export("type")
	int type;
	@ObfuscatedName("j")
	@Export("sender")
	String sender;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("f")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("o")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1561850800"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class303.method5561();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-735144549"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "797420695"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = Canvas.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1898608622"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-832326948"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-889441578"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = Canvas.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "97400477"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class52.method1648(this.sender), GraphicsObject.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)V",
		garbageValue = "1115623564"
	)
	static final void method878(Actor var0) {
		if (var0.field1067 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > World.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1067 - var0.field1073;
			int var2 = Client.cycle - var0.field1073;
			int var3 = var0.field1023 * 64 + var0.field1062 * 128;
			int var4 = var0.field1023 * 64 + var0.field1064 * 128;
			int var5 = var0.field1023 * 64 + var0.field1063 * 128;
			int var6 = var0.field1023 * 64 + var0.field1065 * 128;
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1;
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1;
		}

		var0.field1078 = 0;
		var0.orientation = var0.field1050;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-49"
	)
	static boolean method865() {
		return (Client.drawPlayerNames & 8) != 0;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2077375589"
	)
	static void method879(String var0) {
		SpotAnimationDefinition.field1660 = var0;

		try {
			String var1 = Script.client.getParameter(Integer.toString(18));
			String var2 = Script.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + ItemContainer.method1792(UrlRequester.method2125() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class14.method147(Script.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
