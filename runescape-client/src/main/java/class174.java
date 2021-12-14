import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class174 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822723426"
	)
	static void method3383() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3815 == 0) {
				KeyHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				KeyHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				KeyHandler.ArchiveDiskActionHandler_thread.start();
				KeyHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3815 = 600;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lku;IB)Z",
		garbageValue = "97"
	)
	static boolean method3382(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			WorldMapSection0.SpriteBuffer_decode(var2);
			return true;
		}
	}
}
