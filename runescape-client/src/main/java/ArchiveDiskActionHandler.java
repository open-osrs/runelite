import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 458683291
	)
	public static int field3239;
	@ObfuscatedName("p")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("b")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3239 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 57
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 58
				} // L: 59

				if (var1 != null) { // L: 60
					if (var1.type == 0) { // L: 61
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 62
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
							var1.remove(); // L: 64
						} // L: 65
					} else if (var1.type == 1) { // L: 67
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 68
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 69
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 70
						} // L: 71
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 73
						if (field3239 <= 1) { // L: 74
							field3239 = 0; // L: 75
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 76
							return; // L: 77
						}

						field3239 = 600; // L: 79
					}
				} else {
					GrandExchangeEvent.sleepExact(100L); // L: 83
					synchronized(ArchiveDiskActionHandler_lock) { // L: 84
						if (field3239 <= 1) { // L: 85
							field3239 = 0; // L: 86
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 87
							return; // L: 88
						}

						--field3239; // L: 90
					}
				}
			}
		} catch (Exception var13) { // L: 95
			class223.RunException_sendStackTrace((String)null, var13); // L: 96
		}
	} // L: 98
}
