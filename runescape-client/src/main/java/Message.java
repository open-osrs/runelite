import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("st")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 655345323
	)
	@Export("count")
	int count;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -570932661
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -186645555
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@Export("sender")
	String sender;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("c")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("u")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-136019615"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Buddy.method5322(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "406070188"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "722132951"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917257545"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = WorldMapLabelSize.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "341204953"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = WorldMapLabelSize.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-799394234"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(GrandExchangeOfferUnitPriceComparator.method218(this.sender), UserComparator4.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("t")
	@Export("addEntityUnderMouse")
	static final void addEntityUnderMouse(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 83
	} // L: 84

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "91"
	)
	static final void method1314(boolean var0) {
		if (var0) { // L: 3037
			Client.field717 = Login.field1227 ? class169.field2029 : class169.field2034; // L: 3038
		} else {
			LinkedHashMap var1 = GrandExchangeOfferAgeComparator.clientPreferences.parameters; // L: 3041
			String var3 = Login.Login_username; // L: 3043
			int var4 = var3.length(); // L: 3045
			int var5 = 0; // L: 3046

			for (int var6 = 0; var6 < var4; ++var6) { // L: 3047
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field717 = var1.containsKey(var5) ? class169.field2033 : class169.field2028; // L: 3050
		}

	} // L: 3052

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1336792033"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11502
			PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher); // L: 11504
			var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0)); // L: 11505
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11506
			Client.packetWriter.addNode(var1); // L: 11507
		}
	} // L: 11508
}
