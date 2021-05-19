import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class43 {
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		longValue = -7524999698275254637L
	)
	static long field302;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-114856401"
	)
	static void method486() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 41
			if (ArchiveDiskActionHandler.field3574 == 0) { // L: 42
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 43
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 44
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 45
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 46
			}

			ArchiveDiskActionHandler.field3574 = 600; // L: 48
		}
	} // L: 50

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1281907235"
	)
	static final int method487(int var0, int var1) {
		if (var0 == -2) { // L: 500
			return 12345678;
		} else if (var0 == -1) { // L: 501
			if (var1 < 2) { // L: 502
				var1 = 2;
			} else if (var1 > 126) { // L: 503
				var1 = 126;
			}

			return var1; // L: 504
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 506
			if (var1 < 2) { // L: 507
				var1 = 2;
			} else if (var1 > 126) { // L: 508
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 509
		}
	}
}
