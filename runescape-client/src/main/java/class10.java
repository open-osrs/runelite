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

@ObfuscatedName("x")
public class class10 {
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("i")
	HttpsURLConnection field46;
	@ObfuscatedName("w")
	final Map field40;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class360 field41;
	@ObfuscatedName("a")
	Map field42;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class9 field43;
	@ObfuscatedName("g")
	boolean field44;
	@ObfuscatedName("e")
	boolean field45;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 592251103
	)
	int field47;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lb;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field44 = false; // L: 20
		this.field45 = false; // L: 21
		this.field47 = 300000; // L: 22
		if (!var2.method76()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method78()); // L: 25
		} else {
			this.field46 = (HttpsURLConnection)var1.openConnection(); // L: 26
			this.field46.setSSLSocketFactory(new class15()); // L: 27
			this.field43 = var2; // L: 28
			this.field40 = new HashMap(); // L: 29
			this.field42 = new HashMap(); // L: 30
		}
	} // L: 31

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1308010097"
	)
	public void method86(String var1, String var2) {
		if (!this.field44) { // L: 34
			this.field40.put(var1, var2); // L: 35
		}
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1722889443"
	)
	String method87() {
		ArrayList var1 = new ArrayList(this.field42.entrySet()); // L: 39
		Collections.sort(var1, new class18(this)); // L: 40
		StringBuilder var2 = new StringBuilder(); // L: 53
		Iterator var3 = var1.iterator(); // L: 54

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 55
			if (var2.length() > 0) { // L: 57
				var2.append(",");
			}

			var2.append(((class359)var4.getKey()).method6418()); // L: 58
			float var5 = (Float)var4.getValue(); // L: 59
			if (var5 < 1.0F) { // L: 60
				String var6 = Float.toString(var5).substring(0, 4); // L: 61
				var2.append(";q=" + var6); // L: 62
			}
		}

		return var2.toString(); // L: 66
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-268892273"
	)
	void method88() throws ProtocolException {
		if (!this.field44) { // L: 70
			this.field46.setRequestMethod(this.field43.method78()); // L: 71
			if (!this.field42.isEmpty()) { // L: 72
				this.field40.put("Accept", this.method87());
			}

			Iterator var1 = this.field40.entrySet().iterator(); // L: 73

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 74
				this.field46.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 76
			}

			if (this.field43.method70() && this.field41 != null) { // L: 79
				this.field46.setDoOutput(true); // L: 80
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 81

				try {
					var13.write(this.field41.method6423(1606591795)); // L: 83
					var13.writeTo(this.field46.getOutputStream()); // L: 84
				} catch (IOException var11) { // L: 86
					var11.printStackTrace(); // L: 87
				} finally {
					if (var13 != null) { // L: 90
						try {
							var13.close(); // L: 92
						} catch (IOException var10) { // L: 94
							var10.printStackTrace(); // L: 95
						}
					}

				}
			}

			this.field46.setConnectTimeout(this.field47); // L: 100
			this.field46.setInstanceFollowRedirects(this.field45); // L: 101
			this.field44 = true; // L: 102
		}
	} // L: 103

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "315003479"
	)
	boolean method89() throws IOException, SocketTimeoutException {
		if (!this.field44) { // L: 106
			this.method88();
		}

		this.field46.connect(); // L: 107
		return this.field46.getResponseCode() == -1; // L: 108
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lm;",
		garbageValue = "-347704447"
	)
	class21 method100() {
		try {
			if (!this.field44 || this.field46.getResponseCode() == -1) { // L: 114
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 116
			this.field46.disconnect(); // L: 117
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 118
		}

		class21 var1 = null; // L: 120

		class21 var3;
		try {
			var1 = new class21(this.field46); // L: 122
			return var1; // L: 130
		} catch (IOException var8) { // L: 124
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 125
		} finally {
			this.field46.disconnect();
		}

		return var3; // L: 128
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method104() {
		Login.worldSelectOpen = false; // L: 1614
		RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1615
		class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1616
		class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18); // L: 1617
	} // L: 1618
}
