import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 20750645
	)
	@Export("count")
	int count;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1521210849
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2033042895
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@Export("sender")
	String sender;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("w")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("n")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-707456994"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1704976906"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend(); // L: 44
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 46
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = GameEngine.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1173025660"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = GameEngine.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "719777600"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 69
			this.senderUsername = new Username(AbstractWorldMapData.method4791(this.sender), class194.loginType);
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1989735073"
	)
	static final void method1115() {
		boolean var0 = false; // L: 10008

		while (!var0) { // L: 10009
			var0 = true; // L: 10010

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10011
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10012
					String var2 = Client.menuTargets[var1]; // L: 10013
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10014
					Client.menuTargets[var1 + 1] = var2; // L: 10015
					String var3 = Client.menuActions[var1]; // L: 10016
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10017
					Client.menuActions[var1 + 1] = var3; // L: 10018
					int var4 = Client.menuOpcodes[var1]; // L: 10019
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10020
					Client.menuOpcodes[var1 + 1] = var4; // L: 10021
					var4 = Client.menuArguments1[var1]; // L: 10022
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10023
					Client.menuArguments1[var1 + 1] = var4; // L: 10024
					var4 = Client.menuArguments2[var1]; // L: 10025
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10026
					Client.menuArguments2[var1 + 1] = var4; // L: 10027
					var4 = Client.menuIdentifiers[var1]; // L: 10028
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10029
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10030
					boolean var5 = Client.menuShiftClick[var1]; // L: 10031
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10032
					Client.menuShiftClick[var1 + 1] = var5; // L: 10033
					var0 = false; // L: 10034
				}
			}
		}

	} // L: 10038

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1320031067"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class242.loadInterface(var0)) { // L: 11879
			Canvas.runComponentCloseListeners(MouseRecorder.Widget_interfaceComponents[var0], var1); // L: 11880
		}
	} // L: 11881
}
