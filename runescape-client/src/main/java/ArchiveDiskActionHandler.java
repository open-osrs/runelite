import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 449251955
	)
	static int field3815;
	@ObfuscatedName("m")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3815 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 63
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 64
				} // L: 65

				if (var1 != null) { // L: 66
					if (var1.type == 0) { // L: 67
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 68
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 69
							var1.remove(); // L: 70
						} // L: 71
					} else if (var1.type == 1) { // L: 73
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 74
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 75
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 76
						} // L: 77
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 79
						if (field3815 <= 1) { // L: 80
							field3815 = 0; // L: 81
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 82
							return; // L: 83
						}

						field3815 = 600; // L: 85
					}
				} else {
					Bounds.method6608(100L); // L: 89
					synchronized(ArchiveDiskActionHandler_lock) { // L: 90
						if (field3815 <= 1) { // L: 91
							field3815 = 0; // L: 92
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 93
							return; // L: 94
						}

						--field3815; // L: 96
					}
				}
			}
		} catch (Exception var13) { // L: 101
			AccessFile.RunException_sendStackTrace((String)null, var13); // L: 102
		}
	} // L: 104

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-14"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 5120
			byte var2 = 4; // L: 5121
			int var3 = var2 + 6; // L: 5122
			int var4 = var2 + 6; // L: 5123
			int var5 = class114.fontPlain12.lineWidth(var0, 250); // L: 5124
			int var6 = class114.fontPlain12.lineCount(var0, 250) * 13; // L: 5125
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 5126
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 5127
			class114.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 5128
			class10.method124(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2); // L: 5129
			if (var1) { // L: 5130
				class19.rasterProvider.drawFull(0, 0); // L: 5131
			} else {
				int var7 = var3; // L: 5134
				int var8 = var4; // L: 5135
				int var9 = var5; // L: 5136
				int var10 = var6; // L: 5137

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 5139
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 5140
						Client.field686[var11] = true;
					}
				}
			}

		}
	} // L: 5144
}
