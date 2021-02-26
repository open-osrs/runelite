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

@ObfuscatedName("ed")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static IndexedSprite field1956;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("n")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("v")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("d")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lei;",
		garbageValue = "1847135895"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-158100516"
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

				DataInputStream var2 = null;
				URLConnection var3 = null;

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
				SequenceDefinition.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "833500111"
	)
	static byte[] method3460(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-630790234"
	)
	public static String method3467(String var0) {
		int var1 = var0.length(); // L: 159
		char[] var2 = new char[var1]; // L: 160
		byte var3 = 2; // L: 161

		for (int var4 = 0; var4 < var1; ++var4) { // L: 162
			char var5 = var0.charAt(var4); // L: 163
			if (var3 == 0) { // L: 164
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 165
				var5 = LoginScreenAnimation.method1927(var5);
			}

			if (Character.isLetter(var5)) { // L: 166
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 167
				if (Character.isSpaceChar(var5)) { // L: 168
					if (var3 != 2) { // L: 169
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 171
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 172
		}

		return new String(var2); // L: 174
	}
}
