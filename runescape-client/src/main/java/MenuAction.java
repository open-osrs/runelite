import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1877540813
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -319901543
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2124872737
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1182228171
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("o")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12091

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-780302169"
	)
	static final void method1912(boolean var0) {
		class14.playPcmPlayers(); // L: 5878
		++Client.packetWriter.pendingWrites; // L: 5879
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5880
			Client.packetWriter.pendingWrites = 0; // L: 5881
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5882
				PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2726, Client.packetWriter.isaacCipher); // L: 5884
				Client.packetWriter.addNode(var1); // L: 5885

				try {
					Client.packetWriter.flush(); // L: 5887
				} catch (IOException var3) { // L: 5889
					Client.hadNetworkError = true; // L: 5890
				}
			}

		}
	} // L: 5893
}
