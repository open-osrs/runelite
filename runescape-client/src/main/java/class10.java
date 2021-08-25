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

@ObfuscatedName("l")
public class class10 {
	@ObfuscatedName("n")
	HttpsURLConnection field46;
	@ObfuscatedName("c")
	final Map field42;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class359 field43;
	@ObfuscatedName("k")
	Map field44;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	final class9 field48;
	@ObfuscatedName("g")
	boolean field41;
	@ObfuscatedName("z")
	boolean field50;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1757954479
	)
	int field47;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Le;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field41 = false;
		this.field50 = false;
		this.field47 = 300000;
		if (!var2.method71()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method72());
		} else {
			this.field46 = (HttpsURLConnection)var1.openConnection();
			this.field46.setSSLSocketFactory(new class15());
			this.field48 = var2;
			this.field42 = new HashMap();
			this.field44 = new HashMap();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-794666028"
	)
	public void method104(String var1, String var2) {
		if (!this.field41) {
			this.field42.put(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "159386071"
	)
	String method105() {
		ArrayList var1 = new ArrayList(this.field44.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class358)var4.getKey()).method6273());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "336"
	)
	void method100() throws ProtocolException {
		if (!this.field41) {
			this.field46.setRequestMethod(this.field48.method72());
			if (!this.field44.isEmpty()) {
				this.field42.put("Accept", this.method105());
			}

			Iterator var1 = this.field42.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field46.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field48.method73() && this.field43 != null) {
				this.field46.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field43.method6276(1403875276));
					var13.writeTo(this.field46.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field46.setConnectTimeout(this.field47);
			this.field46.setInstanceFollowRedirects(this.field50);
			this.field41 = true;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2091217505"
	)
	boolean method97() throws IOException, SocketTimeoutException {
		if (!this.field41) {
			this.method100();
		}

		this.field46.connect();
		return this.field46.getResponseCode() == -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lt;",
		garbageValue = "-1470332984"
	)
	class21 method111() {
		try {
			if (!this.field41 || this.field46.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field46.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field46);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field46.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1382258045"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1120035384"
	)
	public static int method98(int var0, int var1, int var2) {
		int var3 = class120.method2512(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIII)V",
		garbageValue = "-1034555918"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3135 == null) {
			throw new RuntimeException();
		} else {
			var0.field3135[var1] = var2;
			var0.field3123[var1] = var3;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	static String method112() {
		String var0 = "";

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') {
			var2 = (Message)var1.next();
		}

		return var0;
	}
}
