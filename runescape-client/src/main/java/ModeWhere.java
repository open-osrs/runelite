import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2420("", 0, new class200[]{class200.field2397}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2402("", 1, new class200[]{class200.field2398, class200.field2397}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2404("", 2, new class200[]{class200.field2398, class200.field2401, class200.field2397}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2405("", 3, new class200[]{class200.field2398}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2403("", 4),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2407("", 5, new class200[]{class200.field2398, class200.field2397}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2408("", 6, new class200[]{class200.field2397}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2415("", 8, new class200[]{class200.field2398, class200.field2397}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2410("", 9, new class200[]{class200.field2398, class200.field2401}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2411("", 10, new class200[]{class200.field2398}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2412("", 11, new class200[]{class200.field2398}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2413("", 12, new class200[]{class200.field2398, class200.field2397}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	field2414("", 13, new class200[]{class200.field2398});

	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1707495011
	)
	public static int field2417;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 505828619
	)
	@Export("id")
	final int id;
	@ObfuscatedName("k")
	final Set field2416;

	static {
		method3870(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lgx;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2416 = new HashSet();
		this.id = var4; // L: 43
		class200[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class200 var8 = var6[var7]; // L: 47
			this.field2416.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field2416 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)[Lgw;",
		garbageValue = "128"
	)
	static ModeWhere[] method3870() {
		return new ModeWhere[]{field2402, field2405, field2407, field2415, field2420, field2410, field2414, field2412, field2413, field2404, field2408, field2403, field2411}; // L: 35
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "420566665"
	)
	public static boolean method3867(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 21
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	static final int method3877() {
		return ViewportMouse.ViewportMouse_y; // L: 106
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	static boolean method3875() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10369
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	static final void method3878() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher); // L: 11218
		Client.packetWriter.addNode(var0); // L: 11219

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11220
			if (var1.type == 0 || var1.type == 3) { // L: 11221
				GrandExchangeOffer.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11223
			IsaacCipher.invalidateWidget(Client.meslayerContinueWidget); // L: 11224
			Client.meslayerContinueWidget = null; // L: 11225
		}

	} // L: 11227

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1954380312"
	)
	static void method3871(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11474
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 11475
				var1.remove(); // L: 11476
			}
		}

	} // L: 11479
}
