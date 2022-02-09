import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 1283636305
	)
	static int field2534;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1628753811
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 121040327
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1962176809
	)
	@Export("z")
	int z;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1634225463
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lgz;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "32"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426410975"
	)
	public static void method4265() {
		Widget.Widget_cachedSprites.clear(); // L: 703
		Widget.Widget_cachedModels.clear(); // L: 704
		Widget.Widget_cachedFonts.clear(); // L: 705
		Widget.Widget_cachedSpriteMasks.clear(); // L: 706
	} // L: 707

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2102981058"
	)
	static final void method4267() {
		PacketBufferNode var0 = class135.getPacketBufferNode(ClientPacket.field2929, Client.packetWriter.isaacCipher); // L: 11671
		Client.packetWriter.addNode(var0); // L: 11672
		Interpreter.field848 = true; // L: 11673

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11674
			if (var1.type == 0 || var1.type == 3) { // L: 11675
				class127.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11677
			class112.invalidateWidget(Client.meslayerContinueWidget); // L: 11678
			Client.meslayerContinueWidget = null; // L: 11679
		}

		Interpreter.field848 = false; // L: 11681
	} // L: 11682
}
