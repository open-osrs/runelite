import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("h")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("c")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("o")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Ldh;",
		garbageValue = "-1471411357"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) {
			this.requests.add(var2);
			this.notify(); // L: 74
			return var2; // L: 76
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1011517268"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 80

		try {
			synchronized(this) { // L: 82
				this.notify(); // L: 83
			} // L: 84

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) { // L: 24
			try {
				UrlRequest var1;
				synchronized(this) { // L: 27
					var1 = (UrlRequest)this.requests.poll(); // L: 28
					if (var1 == null) { // L: 29
						try {
							this.wait(); // L: 31
						} catch (InterruptedException var13) { // L: 33
						}
						continue;
					}
				}

				DataInputStream var2 = null; // L: 37
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
				class27.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2060167605"
	)
	public static int method2421(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 85 86 89
			var2 = var2 << 1 | var0 & 1; // L: 87
			var0 >>>= 1; // L: 88
		}

		return var2; // L: 91
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1026203280"
	)
	public static void method2422() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 72
	} // L: 73
}
