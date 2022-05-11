import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("o")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("q")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("l")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -995653473
	)
	public static int field3348;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20299938"
	)
	static final void method5366() {
		PacketBufferNode var0 = WallDecoration.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher); // L: 12197
		Client.packetWriter.addNode(var0); // L: 12198
		Interpreter.field833 = true; // L: 12199

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12200
			if (var1.type == 0 || var1.type == 3) { // L: 12201
				NetSocket.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12203
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(Client.meslayerContinueWidget); // L: 12204
			Client.meslayerContinueWidget = null; // L: 12205
		}

		Interpreter.field833 = false; // L: 12207
	} // L: 12208
}
