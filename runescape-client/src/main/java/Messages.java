import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("v")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -202962725
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -78187277
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1155417987"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ItemContainer.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher); // L: 9075
		var2.packetBuffer.writeIntME(var0); // L: 9076
		var2.packetBuffer.method7795(var1); // L: 9077
		Client.packetWriter.addNode(var2); // L: 9078
	} // L: 9079

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIILql;Lkw;I)V",
		garbageValue = "1883987067"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11667
			int var6 = Client.camAngleY & 2047; // L: 11668
			int var7 = var3 * var3 + var2 * var2; // L: 11669
			if (var7 <= 6400) { // L: 11670
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11671
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11672
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 11673
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11674
				if (var7 > 2500) {
					var4.method8178(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11675
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11676
				}

			}
		}
	} // L: 11677
}
