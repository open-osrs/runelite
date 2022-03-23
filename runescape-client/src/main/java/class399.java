import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ox")
public class class399 implements class398 {
	@ObfuscatedName("h")
	JSONObject field4385;

	public class399(byte[] var1) throws UnsupportedEncodingException {
		this.method7231(var1); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2124784886"
	)
	public byte[] vmethod7229() throws UnsupportedEncodingException {
		return this.field4385 == null ? new byte[0] : this.field4385.toString().getBytes("UTF-8"); // L: 46 47 49
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1077952512"
	)
	void method7231(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 17
		this.method7224(var2); // L: 18
	} // L: 19

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "67"
	)
	void method7224(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 23
				this.field4385 = new JSONObject(var1); // L: 24
			} else {
				if (var1.charAt(0) != '[') { // L: 26
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 32
				}

				JSONArray var2 = new JSONArray(var1); // L: 27
				this.field4385 = new JSONObject(); // L: 28
				this.field4385.put("arrayValues", var2); // L: 29
			}

		} catch (JSONException var3) { // L: 35
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 36
		}
	} // L: 38

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "120"
	)
	public JSONObject method7225() {
		return this.field4385; // L: 41
	}
}
