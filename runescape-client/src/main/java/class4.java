import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class4 extends class14 {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1261708709
	)
	static int field47;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -2110888403
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	static Widget[] field49;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 82874555
	)
	int field43;
	@ObfuscatedName("n")
	String field40;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field43 = var1.readInt(); // L: 326
		this.field40 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method115(this.field43, this.field40); // L: 331
	} // L: 332

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-402074125"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23226"
	)
	static final void method47() {
		PacketBufferNode var0 = class21.getPacketBufferNode(ClientPacket.field2594, Client.packetWriter.isaacCipher); // L: 11030
		Client.packetWriter.addNode(var0); // L: 11031

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11032
			if (var1.type == 0 || var1.type == 3) { // L: 11033
				class43.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11035
			WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget); // L: 11036
			Client.meslayerContinueWidget = null; // L: 11037
		}

	} // L: 11039

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1166427642"
	)
	public static void method50(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher); // L: 11482
		var4.packetBuffer.method6602(var1); // L: 11483
		var4.packetBuffer.writeInt(var3 ? Client.field723 * -315190483 * 711341221 : 0); // L: 11484
		var4.packetBuffer.writeByte(var2); // L: 11485
		var4.packetBuffer.method6619(var0); // L: 11486
		Client.packetWriter.addNode(var4); // L: 11487
	} // L: 11488
}
