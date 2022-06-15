import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class10 {
	@ObfuscatedName("uu")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 2013387747
	)
	static int field53;
	@ObfuscatedName("c")
	HttpsURLConnection field55;
	@ObfuscatedName("v")
	final Map field43;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	class398 field45;
	@ObfuscatedName("f")
	Map field44;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	final class9 field46;
	@ObfuscatedName("e")
	boolean field41;
	@ObfuscatedName("g")
	boolean field47;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1112676483
	)
	int field48;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Li;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field41 = false; // L: 20
		this.field47 = false; // L: 21
		this.field48 = 300000; // L: 22
		if (!var2.method61()) { // L: 25
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method64());
		} else {
			this.field55 = (HttpsURLConnection)var1.openConnection(); // L: 26
			if (!var3) { // L: 27
				HttpsURLConnection var4 = this.field55; // L: 28
				if (class15.field85 == null) { // L: 31
					class15.field85 = new class15(); // L: 32
				}

				class15 var5 = class15.field85; // L: 34
				var4.setSSLSocketFactory(var5); // L: 36
			}

			this.field46 = var2; // L: 38
			this.field43 = new HashMap(); // L: 39
			this.field44 = new HashMap(); // L: 40
		}
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "34"
	)
	public void method79(String var1, String var2) {
		if (!this.field41) { // L: 44
			this.field43.put(var1, var2); // L: 45
		}
	} // L: 46

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-66"
	)
	String method76() {
		ArrayList var1 = new ArrayList(this.field44.entrySet()); // L: 49
		Collections.sort(var1, new class18(this)); // L: 50
		StringBuilder var2 = new StringBuilder(); // L: 63
		Iterator var3 = var1.iterator(); // L: 64

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 65
			if (var2.length() > 0) { // L: 67
				var2.append(",");
			}

			var2.append(((class397)var4.getKey()).method7086()); // L: 68
			float var5 = (Float)var4.getValue(); // L: 69
			if (var5 < 1.0F) { // L: 70
				String var6 = Float.toString(var5).substring(0, 4); // L: 71
				var2.append(";q=" + var6); // L: 72
			}
		}

		return var2.toString(); // L: 76
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821819060"
	)
	void method77() throws ProtocolException {
		if (!this.field41) { // L: 80
			this.field55.setRequestMethod(this.field46.method64()); // L: 81
			if (!this.field44.isEmpty()) { // L: 82
				this.field43.put("Accept", this.method76());
			}

			Iterator var1 = this.field43.entrySet().iterator(); // L: 83

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 84
				this.field55.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 86
			}

			if (this.field46.method62() && this.field45 != null) { // L: 89
				this.field55.setDoOutput(true); // L: 90
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 91

				try {
					var13.write(this.field45.vmethod7114()); // L: 93
					var13.writeTo(this.field55.getOutputStream()); // L: 94
				} catch (IOException var11) { // L: 96
					var11.printStackTrace(); // L: 97
				} finally {
					if (var13 != null) { // L: 100
						try {
							var13.close(); // L: 102
						} catch (IOException var10) { // L: 104
							var10.printStackTrace(); // L: 105
						}
					}

				}
			}

			this.field55.setConnectTimeout(this.field48); // L: 110
			this.field55.setInstanceFollowRedirects(this.field47); // L: 111
			this.field41 = true; // L: 112
		}
	} // L: 113

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1746167507"
	)
	boolean method78() throws IOException, SocketTimeoutException {
		if (!this.field41) { // L: 116
			this.method77();
		}

		this.field55.connect(); // L: 117
		return this.field55.getResponseCode() == -1; // L: 118
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lb;",
		garbageValue = "2065804848"
	)
	class21 method90() {
		try {
			if (!this.field41 || this.field55.getResponseCode() == -1) { // L: 124
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 126
			this.field55.disconnect(); // L: 127
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 128
		}

		class21 var1 = null; // L: 130

		class21 var3;
		try {
			var1 = new class21(this.field55); // L: 132
			return var1; // L: 140
		} catch (IOException var8) { // L: 134
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 135
		} finally {
			this.field55.disconnect(); // L: 138
		}

		return var3;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkb;B)Ljava/lang/String;",
		garbageValue = "34"
	)
	static String method74(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10594
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10595
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10597
					if (var3 == -1) { // L: 10598
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10599
					int var6 = Canvas.method319(var1, var2 - 1); // L: 10601
					String var5;
					if (var6 < 999999999) { // L: 10603
						var5 = Integer.toString(var6); // L: 10604
					} else {
						var5 = "*"; // L: 10607
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10609
				}
			}
		}

		return var0; // L: 10613
	}
}
