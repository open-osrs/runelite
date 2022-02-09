import java.io.File;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("r")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("c")
	@Export("url")
	final URL url;
	@ObfuscatedName("l")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("s")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1; // L: 97
	} // L: 98

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1976117199"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0; // L: 101
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1707102034"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 105
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILnb;Lkz;I)V",
		garbageValue = "-793908641"
	)
	static void method2422(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3869 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3869 = 600; // L: 34
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1455921541"
	)
	public static int method2432(int var0) {
		return class383.field4276[var0 & 16383]; // L: 37
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1421327475"
	)
	static final void method2424(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11563
		class424.clientPreferences.areaSoundEffectsVolume = var0; // L: 11564
		GameEngine.savePreferences(); // L: 11565
	} // L: 11566
}
