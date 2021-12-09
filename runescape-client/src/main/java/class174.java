import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class174 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822723426"
	)
	static void method3383() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 48
			if (ArchiveDiskActionHandler.field3815 == 0) { // L: 49
				KeyHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 50
				KeyHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 51
				KeyHandler.ArchiveDiskActionHandler_thread.start(); // L: 52
				KeyHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 53
			}

			ArchiveDiskActionHandler.field3815 = 600; // L: 55
		}
	} // L: 57

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lku;IB)Z",
		garbageValue = "97"
	)
	static boolean method3382(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 95
		if (var2 == null) { // L: 96
			return false;
		} else {
			WorldMapSection0.SpriteBuffer_decode(var2); // L: 97
			return true; // L: 98
		}
	}
}
