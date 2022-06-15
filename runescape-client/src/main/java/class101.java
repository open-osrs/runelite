import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class101 extends UrlRequester {
	@ObfuscatedName("df")
	static boolean field1366;
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("j")
	final boolean field1364;

	public class101(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1364 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "1538294108"
	)
	void vmethod2537(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			String var3 = var1.url.getProtocol(); // L: 21
			if (var3.equals("http")) { // L: 22
				var2 = this.method2548(var1); // L: 23
			} else {
				if (!var3.equals("https")) { // L: 25
					var1.isDone0 = true; // L: 29
					return; // L: 30
				}

				var2 = this.method2540(var1); // L: 26
			}

			this.method2522(var2, var1); // L: 32
		} catch (IOException var7) {
		} finally {
			var1.isDone0 = true; // L: 36
			if (var2 != null) { // L: 37
				if (var2 instanceof HttpURLConnection) { // L: 38
					((HttpURLConnection)var2).disconnect(); // L: 39
				} else if (var2 instanceof HttpsURLConnection) { // L: 41
					((HttpsURLConnection)var2).disconnect(); // L: 42
				}
			}

		}

	} // L: 46

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lct;S)Ljava/net/URLConnection;",
		garbageValue = "6416"
	)
	URLConnection method2548(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2520(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)Ljava/net/URLConnection;",
		garbageValue = "2028242666"
	)
	URLConnection method2540(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1364) { // L: 56
			if (class15.field85 == null) { // L: 60
				class15.field85 = new class15(); // L: 61
			}

			class15 var4 = class15.field85; // L: 63
			var2.setSSLSocketFactory(var4); // L: 65
		}

		this.method2520(var2); // L: 67
		return var2; // L: 68
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-585632517"
	)
	static final boolean method2549(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 107
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 108
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 109
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 110
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 111
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 112
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 113
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 114
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method2547(boolean var0) {
		byte var1 = 0; // L: 1178
		boolean var2 = class19.clientPreferences.method2266() >= Client.field482; // L: 1181
		if (!var2) { // L: 1183
			var1 = 12; // L: 1184
		} else if (class353.client.method1102() || class353.client.method1103()) { // L: 1186
			var1 = 10; // L: 1187
		}

		WorldMapData_1.method4872(var1); // L: 1189
		if (var0) { // L: 1190
			Login.Login_username = ""; // L: 1191
			Login.Login_password = ""; // L: 1192
			class240.field2846 = 0; // L: 1193
			World.otp = ""; // L: 1194
		}

		KeyHandler.method286(); // L: 1196
		class29.method357(); // L: 1197
	} // L: 1198

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1829
		Login.Login_response2 = var1; // L: 1830
		Login.Login_response3 = var2; // L: 1831
	} // L: 1832
}
