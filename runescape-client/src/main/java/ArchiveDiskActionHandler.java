import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 264350285
	)
	static int field3557;
	@ObfuscatedName("y")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3557 = 0; // L: 11
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
						if (field3557 <= 1) { // L: 89
							field3557 = 0; // L: 90
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 91
							return; // L: 92
						}

						field3557 = 600; // L: 94
					}
				} else {
					class18.method272(100L); // L: 98
					synchronized(ArchiveDiskActionHandler_lock) { // L: 99
						if (field3557 <= 1) { // L: 100
							field3557 = 0; // L: 101
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 102
							return; // L: 103
						}

						--field3557; // L: 105
					}
				}
			}
		} catch (Exception var13) { // L: 110
			FriendsChat.RunException_sendStackTrace((String)null, var13); // L: 111
		}
	} // L: 113
}
