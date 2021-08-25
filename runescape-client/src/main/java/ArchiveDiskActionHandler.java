import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1139239247
	)
	public static int field3676;
	@ObfuscatedName("k")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("o")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("af")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3676 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3676 <= 1) {
							field3676 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3676 = 600;
					}
				} else {
					PlayerType.method5099(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3676 <= 1) {
							field3676 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3676;
					}
				}
			}
		} catch (Exception var13) {
			class4.RunException_sendStackTrace((String)null, var13);
		}
	}
}
