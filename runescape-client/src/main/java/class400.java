import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class400 implements class398 {
	@ObfuscatedName("v")
	final Map field4437;

	public class400(Map var1) {
		this.field4437 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "793389020"
	)
	public byte[] vmethod7114() throws UnsupportedEncodingException {
		return this.method7122().getBytes("UTF-8"); // L: 16
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1192893333"
	)
	public String method7122() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 20
		Iterator var2 = this.field4437.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 24
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 25
			var1.append(var4).append("=").append(var5).append("&"); // L: 26
		}

		if (var1.length() == 0) { // L: 29
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 30
			var1.insert(0, "?"); // L: 31
			return var1.toString(); // L: 32
		}
	}
}
