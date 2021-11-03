import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("w")
	@Export("javaVersion")
	public static String javaVersion;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)I",
		garbageValue = "-1967726110"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ljf;S)Z",
		garbageValue = "-6395"
	)
	static final boolean method5423(Widget var0) {
		int var1 = var0.contentType; // L: 11600
		if (var1 == 205) { // L: 11601
			Client.logoutTimer = 250; // L: 11602
			return true; // L: 11603
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11605
				var2 = (var1 - 300) / 2; // L: 11606
				var3 = var1 & 1; // L: 11607
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11608
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11610
				var2 = (var1 - 314) / 2; // L: 11611
				var3 = var1 & 1; // L: 11612
				Client.playerAppearance.method5045(var2, var3 == 1); // L: 11613
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11615
			}

			if (var1 == 325) { // L: 11616
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11617
				PacketBufferNode var4 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2688, Client.packetWriter.isaacCipher); // L: 11619
				Client.playerAppearance.write(var4.packetBuffer); // L: 11620
				Client.packetWriter.addNode(var4); // L: 11621
				return true; // L: 11622
			} else {
				return false; // L: 11624
			}
		}
	}
}
