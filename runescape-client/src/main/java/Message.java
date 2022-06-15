import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	static AbstractSocket field461;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 169965093
	)
	@Export("count")
	int count;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1756063821
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -163656379
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	@Export("sender")
	String sender;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("w")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("y")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "18718"
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
		descriptor = "(I)V",
		garbageValue = "2124874138"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1551662577"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1419615044"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = Player.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2083952991"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1213016043"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = Player.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-470307536"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class92.method2388(this.sender), HealthBarDefinition.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Z",
		garbageValue = "1375784000"
	)
	static final boolean method1065(Widget var0) {
		int var1 = var0.contentType; // L: 12043
		if (var1 == 205) { // L: 12044
			Client.logoutTimer = 250; // L: 12045
			return true; // L: 12046
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12048
				var2 = (var1 - 300) / 2; // L: 12049
				var3 = var1 & 1; // L: 12050
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12051
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12053
				var2 = (var1 - 314) / 2; // L: 12054
				var3 = var1 & 1; // L: 12055
				Client.playerAppearance.method5573(var2, var3 == 1); // L: 12056
			}

			if (var1 == 324) { // L: 12058
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 12059
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 12060
				PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field3010, Client.packetWriter.isaacCipher); // L: 12062
				Client.playerAppearance.write(var4.packetBuffer); // L: 12063
				Client.packetWriter.addNode(var4); // L: 12064
				return true; // L: 12065
			} else {
				return false; // L: 12067
			}
		}
	}
}
