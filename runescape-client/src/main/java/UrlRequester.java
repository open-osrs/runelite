import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2009862837
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("b")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("l")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Leg;",
		garbageValue = "70"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) { // L: 72
			this.requests.add(var2); // L: 73
			this.notify(); // L: 74
			return var2; // L: 76
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1551713219"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 80

		try {
			synchronized(this) { // L: 82
				this.notify(); // L: 83
			} // L: 84

			this.thread.join(); // L: 85
		} catch (InterruptedException var4) { // L: 87
		}

	} // L: 88

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var13) { // L: 33
						}
						continue;
					}
				}

				DataInputStream var2 = null;
				URLConnection var3 = null; // L: 38

				try {
					var3 = var1.url.openConnection(); // L: 40
					var3.setConnectTimeout(5000); // L: 41
					var3.setReadTimeout(5000); // L: 42
					var3.setUseCaches(false); // L: 43
					var3.setRequestProperty("Connection", "close"); // L: 44
					int var7 = var3.getContentLength(); // L: 45
					if (var7 >= 0) { // L: 46
						byte[] var5 = new byte[var7]; // L: 47
						var2 = new DataInputStream(var3.getInputStream()); // L: 48
						var2.readFully(var5); // L: 49
						var1.response0 = var5; // L: 50
					}

					var1.isDone0 = true; // L: 52
				} catch (IOException var14) { // L: 54
					var1.isDone0 = true; // L: 55
				} finally {
					if (var2 != null) { // L: 58
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 59
						((HttpURLConnection)var3).disconnect(); // L: 60
					}

				}
			} catch (Exception var17) { // L: 64
				PacketWriter.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[BLlt;I)V",
		garbageValue = "300500560"
	)
	static void method3417(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3176 == 0) { // L: 28
				class105.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				class105.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				class105.ArchiveDiskActionHandler_thread.start(); // L: 31
				class105.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3176 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-25"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 136
		int var2 = 0; // L: 137

		for (int var3 = 0; var3 < var1; ++var3) { // L: 138
			var2 = (var2 << 5) - var2 + class219.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 139
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BB)Lkq;",
		garbageValue = "98"
	)
	public static Font method3430(byte[] var0) {
		if (var0 == null) { // L: 239
			return null;
		} else {
			Font var1 = new Font(var0, class336.SpriteBuffer_xOffsets, class225.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class336.SpriteBuffer_spriteHeights, WorldMapID.SpriteBuffer_spritePalette, class13.SpriteBuffer_pixels); // L: 240
			class336.SpriteBuffer_xOffsets = null; // L: 242
			class225.SpriteBuffer_yOffsets = null; // L: 243
			class336.SpriteBuffer_spriteWidths = null; // L: 244
			class336.SpriteBuffer_spriteHeights = null; // L: 245
			WorldMapID.SpriteBuffer_spritePalette = null; // L: 246
			class13.SpriteBuffer_pixels = null; // L: 247
			return var1; // L: 249
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4200
	}
}
