import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 538081707
	)
	public static int field3940;
	@ObfuscatedName("g")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("l")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1748062659
	)
	@Export("menuY")
	static int menuY;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3940 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 32
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 33
				} // L: 34

				if (var1 != null) { // L: 35
					if (var1.type == 0) { // L: 36
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 37
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 38
							var1.remove(); // L: 39
						} // L: 40
					} else if (var1.type == 1) { // L: 42
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 43
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 44
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 45
						} // L: 46
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 48
						if (field3940 <= 1) { // L: 49
							field3940 = 0; // L: 50
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 51
							return; // L: 52
						}

						field3940 = 600; // L: 54
					}
				} else {
					GrandExchangeOfferTotalQuantityComparator.method6007(100L); // L: 58
					synchronized(ArchiveDiskActionHandler_lock) { // L: 59
						if (field3940 <= 1) { // L: 60
							field3940 = 0; // L: 61
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 62
							return; // L: 63
						}

						--field3940; // L: 65
					}
				}
			}
		} catch (Exception var13) { // L: 70
			class301.RunException_sendStackTrace((String)null, var13); // L: 71
		}
	} // L: 73
}
