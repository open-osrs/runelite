import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1574703913
	)
	static int field156;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lag;",
		garbageValue = "-33"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-356427702"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class13.loadInterface(var0)) { // L: 11222
			class33.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 11223
		}
	} // L: 11224

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-119"
	)
	public static void method361(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher); // L: 12094
		var4.packetBuffer.method7450(var3 ? Client.field513 * 1156105773 * 1721858469 : 0); // L: 12095
		var4.packetBuffer.method7555(var0); // L: 12096
		var4.packetBuffer.method7370(var2); // L: 12097
		var4.packetBuffer.method7555(var1); // L: 12098
		Client.packetWriter.addNode(var4); // L: 12099
	} // L: 12100
}
