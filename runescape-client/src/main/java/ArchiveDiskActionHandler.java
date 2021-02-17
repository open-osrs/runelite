import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -39259267
	)
	public static int field3178;
	@ObfuscatedName("w")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("u")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3178 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 76
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 77
				} // L: 78

				if (var1 != null) { // L: 79
					if (var1.type == 0) { // L: 80
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 81
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 82
							var1.remove(); // L: 83
						} // L: 84
					} else if (var1.type == 1) { // L: 86
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 87
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 88
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 89
						} // L: 90
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 92
						if (field3178 <= 1) { // L: 93
							field3178 = 0; // L: 94
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 95
							return; // L: 96
						}

						field3178 = 600; // L: 98
					}
				} else {
					class236.sleepExact(100L); // L: 102
					synchronized(ArchiveDiskActionHandler_lock) { // L: 103
						if (field3178 <= 1) { // L: 104
							field3178 = 0; // L: 105
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 106
							return; // L: 107
						}

						--field3178; // L: 109
					}
				}
			}
		} catch (Exception var13) { // L: 114
			PlayerComposition.RunException_sendStackTrace((String)null, var13); // L: 115
		}
	} // L: 117

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "961736597"
	)
	public static double[] method4294(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 13
		double[] var6 = new double[var5]; // L: 14
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var11 = FriendSystem.method1972(((double)var7 - var0) / var2) / var2; // L: 20
			var6[var8] = var11; // L: 22
			++var7; // L: 15
		}

		return var6; // L: 24
	}
}
