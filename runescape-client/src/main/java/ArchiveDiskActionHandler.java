import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 608159891
	)
	static int field3181;
	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("p")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3181 = 0;
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
						if (field3181 <= 1) {
							field3181 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3181 = 600;
					}
				} else {
					SpriteMask.sleepExact(99L);
					SpriteMask.sleepExact(1L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3181 <= 1) {
							field3181 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3181;
					}
				}
			}
		} catch (Exception var13) {
			class197.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;I)I",
		garbageValue = "-1395527740"
	)
	static int method4429(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		if (var0.tryLoadFileByNames("title.jpg", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_deadman_mode", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("logo_seasonal_mode", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebox", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("titlebutton", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("runes", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("title_mute", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,0", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,2", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,4", "")) {
			++var2;
		}

		if (var1.tryLoadFileByNames("options_radio_buttons,6", "")) {
			++var2;
		}

		var1.tryLoadFileByNames("sl_back", "");
		var1.tryLoadFileByNames("sl_flags", "");
		var1.tryLoadFileByNames("sl_arrows", "");
		var1.tryLoadFileByNames("sl_stars", "");
		var1.tryLoadFileByNames("sl_button", "");
		return var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "8"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZB)V",
		garbageValue = "-20"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = MusicPatchNode2.fontPlain12.lineWidth(var0, 250);
			int var6 = MusicPatchNode2.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
			MusicPatchNode2.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class1.method7(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6);
			if (var1) {
				ArchiveLoader.rasterProvider.drawFull(0, 0);
			} else {
				WorldMapData_0.method243(var3, var4, var5, var6);
			}

		}
	}
}
