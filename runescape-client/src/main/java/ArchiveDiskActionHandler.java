import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1281764183
	)
	public static int field3574;
	@ObfuscatedName("g")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("l")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("z")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	static class11 field3575;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3574 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 56
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 57
				} // L: 58

				if (var1 != null) { // L: 59
					if (var1.type == 0) { // L: 60
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 61
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 62
							var1.remove(); // L: 63
						} // L: 64
					} else if (var1.type == 1) { // L: 66
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 67
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 68
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 69
						} // L: 70
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 72
						if (field3574 <= 1) { // L: 73
							field3574 = 0; // L: 74
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 75
							return; // L: 76
						}

						field3574 = 600; // L: 78
					}
				} else {
					UrlRequest.sleepExact(100L); // L: 82
					synchronized(ArchiveDiskActionHandler_lock) { // L: 83
						if (field3574 <= 1) { // L: 84
							field3574 = 0; // L: 85
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 86
							return; // L: 87
						}

						--field3574; // L: 89
					}
				}
			}
		} catch (Exception var13) { // L: 94
			class27.RunException_sendStackTrace((String)null, var13); // L: 95
		}
	} // L: 97
}
