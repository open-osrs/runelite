import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -698041547
	)
	static int field3741;
	@ObfuscatedName("ht")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;B)I",
		garbageValue = "-92"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;I)V",
		garbageValue = "482851304"
	)
	public static void method5361(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "953318230"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class157.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class157.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class157.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1241356200"
	)
	public static boolean method5360(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
