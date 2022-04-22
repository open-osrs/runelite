import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("op")
public class class399 implements class398 {
	@ObfuscatedName("i")
	JSONObject field4384;

	public class399(byte[] var1) throws UnsupportedEncodingException {
		this.method7148(var1); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "201"
	)
	public byte[] vmethod7150() throws UnsupportedEncodingException {
		return this.field4384 == null ? new byte[0] : this.field4384.toString().getBytes("UTF-8"); // L: 45 46 48
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1800116953"
	)
	void method7148(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 17
		this.method7149(var2); // L: 18
	} // L: 19

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2059250912"
	)
	void method7149(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 23
				this.field4384 = new JSONObject(var1); // L: 24
			} else {
				if (var1.charAt(0) != '[') { // L: 26
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 32
				}

				JSONArray var2 = new JSONArray(var1); // L: 27
				this.field4384 = new JSONObject(); // L: 28
				this.field4384.put("arrayValues", var2); // L: 29
			}

		} catch (JSONException var3) { // L: 35
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 36
		}
	} // L: 38

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "1611326690"
	)
	public JSONObject method7156() {
		return this.field4384; // L: 41
	}
}
