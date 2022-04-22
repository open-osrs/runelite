import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("c")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("i")
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
		descriptor = "(Lcw;I)V",
		garbageValue = "1977687936"
	)
	abstract void vmethod2546(UrlRequest var1) throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "28"
	)
	void method2517(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 49
		var1.setReadTimeout(5000); // L: 50
		var1.setUseCaches(false); // L: 51
		var1.setRequestProperty("Connection", "close"); // L: 52
	} // L: 53

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lcw;B)V",
		garbageValue = "4"
	)
	void method2518(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 56

		try {
			int var5 = var1.getContentLength(); // L: 59
			var3 = new DataInputStream(var1.getInputStream()); // L: 60
			byte[] var4;
			if (var5 >= 0) { // L: 61
				var4 = new byte[var5]; // L: 62
				var3.readFully(var4); // L: 63
			} else {
				var4 = new byte[0]; // L: 66
				byte[] var6 = ArchiveDiskActionHandler.ByteArrayPool_getArray(5000); // L: 67

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 68 69 73
					var8 = new byte[var4.length + var7]; // L: 70
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 71
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 72
				}

				UserComparator10.ByteArrayPool_release(var6); // L: 75
			}

			var2.response0 = var4; // L: 77
		} catch (IOException var10) { // L: 79
		}

		if (var3 != null) { // L: 80
			try {
				var3.close(); // L: 82
			} catch (IOException var9) { // L: 84
			}
		}

	} // L: 86

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lcw;",
		garbageValue = "30"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 89
		synchronized(this) { // L: 90
			this.requests.add(var2); // L: 91
			this.notify(); // L: 92
			return var2; // L: 94
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 98

		try {
			synchronized(this) { // L: 100
				this.notify(); // L: 101
			} // L: 102

			this.thread.join(); // L: 103
		} catch (InterruptedException var4) { // L: 105
		}

	} // L: 106

	public void run() {
		while (!this.isClosed) { // L: 25
			try {
				UrlRequest var1;
				synchronized(this) { // L: 28
					var1 = (UrlRequest)this.requests.poll(); // L: 29
					if (var1 == null) { // L: 30
						try {
							this.wait(); // L: 32
						} catch (InterruptedException var5) { // L: 34
						}
						continue;
					}
				}

				this.vmethod2546(var1); // L: 38
			} catch (Exception var7) { // L: 40
				Widget.RunException_sendStackTrace((String)null, var7); // L: 41
			}
		}

	} // L: 44

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1814729991"
	)
	static final void method2537(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8618
			if (Client.showMouseOverText) { // L: 8619
				int var2 = GameBuild.method5773(); // L: 8620
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8622
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8623
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = AbstractUserComparator.method6736(var2); // L: 8624
				}

				if (Client.menuOptionsCount > 2) { // L: 8625
					var3 = var3 + UserComparator9.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				RouteStrategy.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8626
			}
		}
	} // L: 8627
}
