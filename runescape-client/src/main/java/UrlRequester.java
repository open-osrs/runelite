import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1967298029
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("o")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("h")
	@Export("requests")
	Queue requests;

	UrlRequester() {
		this.requests = new LinkedList(); // L: 16
		this.thread = new Thread(this); // L: 19
		this.thread.setPriority(1); // L: 20
		this.thread.start(); // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-1783154457"
	)
	abstract void vmethod2538(UrlRequest var1) throws IOException;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "4"
	)
	void method2524(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 50
		var1.setReadTimeout(5000); // L: 51
		var1.setUseCaches(false); // L: 52
		var1.setRequestProperty("Connection", "close"); // L: 53
	} // L: 54

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lct;I)V",
		garbageValue = "328398044"
	)
	void method2515(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 57

		try {
			int var5 = var1.getContentLength(); // L: 60
			var3 = new DataInputStream(var1.getInputStream()); // L: 61
			byte[] var4;
			if (var5 >= 0) { // L: 62
				var4 = new byte[var5]; // L: 63
				var3.readFully(var4); // L: 64
			} else {
				var4 = new byte[0]; // L: 67
				byte[] var6 = class355.ByteArrayPool_getArray(5000); // L: 68

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 69 70 74
					var8 = new byte[var4.length + var7]; // L: 71
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 72
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 73
				}

				ServerPacket.ByteArrayPool_release(var6); // L: 76
			}

			var2.response0 = var4; // L: 78
		} catch (IOException var10) { // L: 80
		}

		if (var3 != null) { // L: 81
			try {
				var3.close(); // L: 83
			} catch (IOException var9) { // L: 85
			}
		}

	} // L: 87

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lct;",
		garbageValue = "1891707218"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 90
		synchronized(this) { // L: 91
			this.requests.add(var2); // L: 92
			this.notify(); // L: 93
			return var2; // L: 95
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 99

		try {
			synchronized(this) { // L: 101
				this.notify(); // L: 102
			} // L: 103

			this.thread.join(); // L: 104
		} catch (InterruptedException var4) { // L: 106
		}

	} // L: 107

	public void run() {
		while (!this.isClosed) { // L: 26
			try {
				UrlRequest var1;
				synchronized(this) { // L: 29
					var1 = (UrlRequest)this.requests.poll(); // L: 30
					if (var1 == null) { // L: 31
						try {
							this.wait(); // L: 33
						} catch (InterruptedException var5) { // L: 35
						}
						continue;
					}
				}

				this.vmethod2538(var1); // L: 39
			} catch (Exception var7) { // L: 41
				class301.RunException_sendStackTrace((String)null, var7); // L: 42
			}
		}

	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-106"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 128
		int var2 = 0; // L: 129

		for (int var3 = 0; var3 < var1; ++var3) { // L: 130
			var2 = (var2 << 5) - var2 + class123.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 131
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2085317549"
	)
	static void method2533(int var0) {
		if (var0 != Client.loginState) { // L: 11960
			Client.loginState = var0; // L: 11961
		}
	} // L: 11962
}
