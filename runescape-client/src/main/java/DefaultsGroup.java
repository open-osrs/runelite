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
		field3839 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19331"
	)
	static void method5939() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1335 = null;
		Client.packetWriter.field1336 = null;
		Client.packetWriter.field1337 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1333 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		PlayerAppearance.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		WorldMapCacheName.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field901[var0] = true;
		}

		MouseRecorder.method1264();
	}
}
