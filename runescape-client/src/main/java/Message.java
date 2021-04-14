import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ca")
	public static char field591;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -845346373
	)
	@Export("count")
	int count;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 31951867
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1009586671
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	@Export("sender")
	String sender;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("g")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("h")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-1"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "358595620"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "42063064"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class13.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1647458411"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1249487016"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "620284728"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class13.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1679854800"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class1.method24(this.sender), AbstractUserComparator.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1076003545"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 95

		try {
			var0 = class15.getPreferencesFile("", class27.field208.name, true); // L: 97
			Buffer var1 = Login.clientPreferences.toBuffer(); // L: 98
			var0.write(var1.array, 0, var1.offset); // L: 99
		} catch (Exception var3) { // L: 101
		}

		try {
			if (var0 != null) { // L: 103
				var0.closeSync(true); // L: 104
			}
		} catch (Exception var2) { // L: 107
		}

	} // L: 108

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1080419559"
	)
	static final int method1191(int var0, int var1) {
		if (var0 == -1) { // L: 991
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 992
			if (var1 < 2) { // L: 993
				var1 = 2;
			} else if (var1 > 126) { // L: 994
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 995
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "([Lhu;IIIZI)V",
		garbageValue = "1850842206"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9981
			Widget var6 = var0[var5]; // L: 9982
			if (var6 != null && var6.parentId == var1) { // L: 9983 9984
				class401.alignWidgetSize(var6, var2, var3, var4); // L: 9985
				KeyHandler.alignWidgetPosition(var6, var2, var3); // L: 9986
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9987
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9988
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 9989
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 9990
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9991
					UserList.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9993
}
