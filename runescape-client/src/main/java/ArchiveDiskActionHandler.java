import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1967146285
	)
	public static int field3179;
	@ObfuscatedName("i")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite worldSelectRightSprite;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3179 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 68
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 69
				} // L: 70

				if (var1 != null) { // L: 71
					if (var1.type == 0) { // L: 72
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 73
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 74
							var1.remove(); // L: 75
						} // L: 76
					} else if (var1.type == 1) { // L: 78
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 79
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 80
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 81
						} // L: 82
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 84
						if (field3179 <= 1) { // L: 85
							field3179 = 0; // L: 86
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 87
							return; // L: 88
						}

						field3179 = 600; // L: 90
					}
				} else {
					class227.sleepExact(100L); // L: 94
					synchronized(ArchiveDiskActionHandler_lock) { // L: 95
						if (field3179 <= 1) { // L: 96
							field3179 = 0; // L: 97
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 98
							return; // L: 99
						}

						--field3179; // L: 101
					}
				}
			}
		} catch (Exception var13) { // L: 106
			Decimator.RunException_sendStackTrace((String)null, var13); // L: 107
		}
	} // L: 109

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;IZI)Lef;",
		garbageValue = "2091199656"
	)
	public static Frames method4337(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "46"
	)
	static final String method4338(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 9327 9328
	}
}
