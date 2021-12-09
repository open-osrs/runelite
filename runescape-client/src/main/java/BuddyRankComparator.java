import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	static class370 field1342;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;I)I",
		garbageValue = "-1364999182"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1683360444"
	)
	public static void method2547(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2819, Client.packetWriter.isaacCipher); // L: 12675
		var4.packetBuffer.method7527(var3 ? Client.field607 * 1420477321 * -1761828167 : 0); // L: 12676
		var4.packetBuffer.method7349(var0); // L: 12677
		var4.packetBuffer.method7343(var2); // L: 12678
		var4.packetBuffer.writeShort(var1); // L: 12679
		Client.packetWriter.addNode(var4); // L: 12680
	} // L: 12681
}
