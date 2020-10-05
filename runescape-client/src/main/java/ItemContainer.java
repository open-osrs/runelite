import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class ItemContainer extends Node {
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		longValue = 6214484709053611949L
	)
	static long field553;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeHashTable itemContainers;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractSocket js5Socket;
	@ObfuscatedName("ec")
	static String worldHost;
	@ObfuscatedName("k")
	int[] ids;
	@ObfuscatedName("s")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lgb;",
		garbageValue = "1985186614"
	)
	static PacketBufferNode method1226() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	static final void method1213() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2336, Client.packetWriter.isaacCipher); // L: 10474
		Client.packetWriter.addNode(var0); // L: 10475

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 10476
			if (var1.type == 0 || var1.type == 3) { // L: 10477
				class58.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 10479
			class52.invalidateWidget(Client.meslayerContinueWidget); // L: 10480
			Client.meslayerContinueWidget = null; // L: 10481
		}

	} // L: 10483

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-158946213"
	)
	static void method1225() {
		if (Client.oculusOrbState == 1) { // L: 10880
			Client.field759 = true; // L: 10881
		}

	} // L: 10883
}
