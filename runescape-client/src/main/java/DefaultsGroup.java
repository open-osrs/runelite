import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final DefaultsGroup field3839;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 139926061
	)
	@Export("group")
	final int group;

	static {
		field3839 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19331"
	)
	static void method5939() {
		Client.packetWriter.clearBuffer(); // L: 2758
		Client.packetWriter.packetBuffer.offset = 0; // L: 2759
		Client.packetWriter.serverPacket = null; // L: 2760
		Client.packetWriter.field1335 = null; // L: 2761
		Client.packetWriter.field1336 = null; // L: 2762
		Client.packetWriter.field1337 = null; // L: 2763
		Client.packetWriter.serverPacketLength = 0; // L: 2764
		Client.packetWriter.field1333 = 0; // L: 2765
		Client.rebootTimer = 0; // L: 2766
		Client.menuOptionsCount = 0; // L: 2768
		Client.isMenuOpen = false; // L: 2769
		Client.minimapState = 0; // L: 2771
		Client.destinationX = 0; // L: 2772

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2773
			Client.players[var0] = null;
		}

		PlayerAppearance.localPlayer = null; // L: 2774

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2775
			NPC var1 = Client.npcs[var0]; // L: 2776
			if (var1 != null) { // L: 2777
				var1.targetIndex = -1; // L: 2778
				var1.false0 = false; // L: 2779
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2783
		WorldMapCacheName.updateGameState(30); // L: 2785

		for (var0 = 0; var0 < 100; ++var0) { // L: 2786
			Client.field901[var0] = true;
		}

		MouseRecorder.method1264(); // L: 2787
	} // L: 2788
}
