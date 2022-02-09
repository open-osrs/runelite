import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -153421111
	)
	static int field3869;
	@ObfuscatedName("e")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("r")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("m")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3869 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 72
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 73
				} // L: 74

				if (var1 != null) { // L: 75
					if (var1.type == 0) { // L: 76
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 77
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 78
							var1.remove(); // L: 79
						} // L: 80
					} else if (var1.type == 1) { // L: 82
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 83
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 84
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 85
						} // L: 86
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 88
						if (field3869 <= 1) { // L: 89
							field3869 = 0; // L: 90
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 91
							return; // L: 92
						}

						field3869 = 600; // L: 94
					}
				} else {
					Language.method5813(100L); // L: 98
					synchronized(ArchiveDiskActionHandler_lock) { // L: 99
						if (field3869 <= 1) { // L: 100
							field3869 = 0; // L: 101
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 102
							return; // L: 103
						}

						--field3869; // L: 105
					}
				}
			}
		} catch (Exception var13) { // L: 110
			FloorDecoration.RunException_sendStackTrace((String)null, var13); // L: 111
		}
	} // L: 113
}
