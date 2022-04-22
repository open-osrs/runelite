import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class101 extends UrlRequester {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "1977687936"
	)
	void vmethod2546(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 11

		try {
			try {
				String var3 = var1.url.getProtocol(); // L: 13
				if (var3.equals("http")) { // L: 14
					var2 = this.method2539(var1); // L: 15
				} else {
					if (!var3.equals("https")) { // L: 17
						var1.isDone0 = true; // L: 21
						return;
					}

					var2 = this.method2541(var1); // L: 18
				}

				this.method2518(var2, var1); // L: 24
			} catch (IOException var7) { // L: 26
			}

		} finally {
			var1.isDone0 = true; // L: 28
			if (var2 != null) { // L: 29
				if (var2 instanceof HttpURLConnection) { // L: 30
					((HttpURLConnection)var2).disconnect(); // L: 31
				} else if (var2 instanceof HttpsURLConnection) { // L: 33
					((HttpsURLConnection)var2).disconnect(); // L: 34
				}
			}

		}
	} // L: 38

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)Ljava/net/URLConnection;",
		garbageValue = "443987385"
	)
	URLConnection method2539(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 41
		this.method2517(var2); // L: 42
		return var2; // L: 43
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lcw;B)Ljava/net/URLConnection;",
		garbageValue = "48"
	)
	URLConnection method2541(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 47
		var2.setSSLSocketFactory(new class15()); // L: 48
		this.method2517(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-264358279"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 95

		for (int var6 = 0; var6 < var5; ++var6) { // L: 96
			char var7 = var0.charAt(var6 + var1); // L: 97
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 98
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 99
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 100
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 101
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 102
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 103
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 104
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 105
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 106
			} else if (var7 == 8240) { // L: 107
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 108
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 109
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 110
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 111
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 112
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 113
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 114
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 115
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 116
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 117
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 118
			} else if (var7 == 732) { // L: 119
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 120
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 121
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 122
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 123
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 124
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 125
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 126
			}
		}

		return var5; // L: 128
	}
}
