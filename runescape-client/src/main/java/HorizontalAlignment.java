import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1844(0, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1842(2, 2);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	static StudioGame field1846;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1041895701
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -829537569
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "90"
	)
	public static boolean method3275(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1930800832"
	)
	static final void method3279(boolean var0) {
		class122.playPcmPlayers(); // L: 5454
		++Client.packetWriter.pendingWrites; // L: 5455
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5456
			Client.packetWriter.pendingWrites = 0; // L: 5457
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5458
				PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2837, Client.packetWriter.isaacCipher); // L: 5460
				Client.packetWriter.addNode(var1); // L: 5461

				try {
					Client.packetWriter.flush(); // L: 5463
				} catch (IOException var3) { // L: 5465
					Client.hadNetworkError = true; // L: 5466
				}
			}

		}
	} // L: 5469
}
