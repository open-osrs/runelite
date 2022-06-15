import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class305 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class301[] var2 = new class301[]{class301.field3575, class301.field3576}; // L: 14
		class301[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class301 var5 = var3[var4]; // L: 18
			if (var5.field3580 > var0) { // L: 20
				var0 = var5.field3580;
			}

			if (var5.field3578 > var1) { // L: 21
				var1 = var5.field3578;
			}
		}

	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILnd;Llc;B)V",
		garbageValue = "82"
	)
	static void method5764(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 30
		var3.type = 1; // L: 31
		var3.key = (long)var0; // L: 32
		var3.archiveDisk = var1; // L: 33
		var3.archive = var2; // L: 34
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 35
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 36
		} // L: 37

		Tiles.method2065(); // L: 38
	} // L: 39
}
