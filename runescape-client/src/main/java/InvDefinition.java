import java.awt.Component;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1275234055
	)
	static int field1853;
	@ObfuscatedName("ct")
	public static char field1850;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1439045239
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-22"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "39742539"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "497001629"
	)
	static void method3264(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1661883390"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)V",
		garbageValue = "-420431954"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1910
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1911
			boolean var1 = var0.isMembersOnly(); // L: 1912
			if (var1 != class82.ItemDefinition_inMembersWorld) { // L: 1914
				class92.method2370(); // L: 1915
				class82.ItemDefinition_inMembersWorld = var1; // L: 1916
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1920
			Archive var3 = class305.archive8; // L: 1921
			int var2 = var0.properties; // L: 1922
			if ((var2 & 536870912) != 0) { // L: 1924
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 1925
			} else if ((var2 & 1073741824) != 0) { // L: 1927
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 1928
			} else {
				Clock.logoSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 1931
			}
		}

		Timer.worldHost = var0.host; // L: 1935
		Client.worldId = var0.id; // L: 1936
		Client.worldProperties = var0.properties; // L: 1937
		Tiles.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1938
		GrandExchangeEvent.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1939
		WorldMapRegion.currentPort = Tiles.worldPort; // L: 1940
	} // L: 1941

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	static final void method3268(boolean var0) {
		ArchiveLoader.playPcmPlayers(); // L: 5734
		++Client.packetWriter.pendingWrites; // L: 5735
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5736
			Client.packetWriter.pendingWrites = 0; // L: 5737
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5738
				PacketBufferNode var1 = WallDecoration.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher); // L: 5740
				Client.packetWriter.addNode(var1); // L: 5741

				try {
					Client.packetWriter.flush(); // L: 5743
				} catch (IOException var3) { // L: 5745
					Client.hadNetworkError = true; // L: 5746
				}
			}

		}
	} // L: 5749
}
