import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class101 extends UrlRequester {
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 1899904271
	)
	@Export("worldPort")
	static int worldPort;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-1783154457"
	)
	void vmethod2538(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 12

		try {
			try {
				String var3 = var1.url.getProtocol(); // L: 14
				if (var3.equals("http")) { // L: 15
					var2 = this.method2536(var1); // L: 16
				} else {
					if (!var3.equals("https")) { // L: 18
						var1.isDone0 = true; // L: 22
						return; // L: 23
					}

					var2 = this.method2537(var1); // L: 19
				}

				this.method2515(var2, var1); // L: 25
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true;
			if (var2 != null) {
				if (var2 instanceof HttpURLConnection) { // L: 31
					((HttpURLConnection)var2).disconnect();
				} else if (var2 instanceof HttpsURLConnection) {
					((HttpsURLConnection)var2).disconnect(); // L: 35
				}
			}

		}
	} // L: 39

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)Ljava/net/URLConnection;",
		garbageValue = "-2100261095"
	)
	URLConnection method2536(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 42
		this.method2524(var2); // L: 43
		return var2; // L: 44
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)Ljava/net/URLConnection;",
		garbageValue = "-1790312797"
	)
	URLConnection method2537(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 48
		var2.setSSLSocketFactory(new class15()); // L: 49
		this.method2524(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lbo;",
		garbageValue = "1275479769"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class135.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = Message.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}
}
