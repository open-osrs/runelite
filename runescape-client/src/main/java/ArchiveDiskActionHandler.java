import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1788680015
	)
	public static int field3187;
	@ObfuscatedName("c")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("y")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3187 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 43
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 44
				} // L: 45

				if (var1 != null) { // L: 46
					if (var1.type == 0) { // L: 47
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 48
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 49
							var1.remove(); // L: 50
						} // L: 51
					} else if (var1.type == 1) { // L: 53
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 54
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 55
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 56
						} // L: 57
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 59
						if (field3187 <= 1) { // L: 60
							field3187 = 0; // L: 61
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 62
							return; // L: 63
						}

						field3187 = 600; // L: 65
					}
				} else {
					ApproximateRouteStrategy.sleepExact(100L); // L: 69
					synchronized(ArchiveDiskActionHandler_lock) { // L: 70
						if (field3187 <= 1) { // L: 71
							field3187 = 0; // L: 72
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 73
							return; // L: 74
						}

						--field3187; // L: 76
					}
				}
			}
		} catch (Exception var13) { // L: 81
			SequenceDefinition.RunException_sendStackTrace((String)null, var13); // L: 82
		}
	} // L: 84
}
