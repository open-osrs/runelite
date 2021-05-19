import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;I)I",
		garbageValue = "2030845639"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILlw;Lji;S)V",
		garbageValue = "-5330"
	)
	static void method4987(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		class43.method486(); // L: 26
	} // L: 27

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-537107433"
	)
	static final int method4986(int var0, int var1) {
		if (var0 == -1) { // L: 492
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 493
			if (var1 < 2) { // L: 494
				var1 = 2;
			} else if (var1 > 126) { // L: 495
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 496
		}
	}
}
