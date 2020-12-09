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
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3178 = 0;
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
						if (field3178 <= 1) {
							field3178 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3178 = 600;
					}
				} else {
					class236.sleepExact(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3178 <= 1) {
							field3178 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3178;
					}
				}
			}
		} catch (Exception var13) {
			PlayerAppearance.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "961736597"
	)
	public static double[] method4294(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var11 = FriendSystem.method1972(((double)var7 - var0) / var2) / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}
}
