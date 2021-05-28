import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2106150539
	)
	static int field3562;
	@ObfuscatedName("y")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("p")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3562 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 21
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 22
				} // L: 23

				if (var1 != null) { // L: 24
					if (var1.type == 0) { // L: 25
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 26
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 27
							var1.remove(); // L: 28
						} // L: 29
					} else if (var1.type == 1) { // L: 31
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 32
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 33
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 34
						} // L: 35
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 37
						if (field3562 <= 1) { // L: 38
							field3562 = 0; // L: 39
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 40
							return; // L: 41
						}

						field3562 = 600; // L: 43
					}
				} else {
					long var8 = 99L; // L: 50

					try {
						Thread.sleep(var8); // L: 53
					} catch (InterruptedException var15) { // L: 55
					}

					try {
						Thread.sleep(1L); // L: 59
					} catch (InterruptedException var14) { // L: 61
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 71
						if (field3562 <= 1) { // L: 72
							field3562 = 0; // L: 73
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 74
							return; // L: 75
						}

						--field3562; // L: 77
					}
				}
			}
		} catch (Exception var17) { // L: 82
			class266.RunException_sendStackTrace((String)null, var17); // L: 83
		}
	} // L: 85

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	public static void method4867(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 51
	} // L: 52
}
