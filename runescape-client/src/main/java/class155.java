import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("es")
public class class155 {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -793347601
	)
	int field1726;
	@ObfuscatedName("i")
	String field1730;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	UrlRequest field1729;
	@ObfuscatedName("t")
	String field1732;
	@ObfuscatedName("z")
	float[] field1733;
	@ObfuscatedName("r")
	ArrayList field1734;
	@ObfuscatedName("u")
	ArrayList field1735;
	@ObfuscatedName("k")
	ArrayList field1736;
	@ObfuscatedName("h")
	Map field1731;
	@ObfuscatedName("x")
	Map field1724;

	public class155() {
		this.field1726 = -1; // L: 24
		this.field1732 = null; // L: 27
		this.field1733 = new float[4]; // L: 28
		this.field1734 = new ArrayList(); // L: 29
		this.field1735 = new ArrayList(); // L: 30
		this.field1736 = new ArrayList(); // L: 31
		this.field1731 = new HashMap();
		this.field1724 = new HashMap(); // L: 33
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcd;I)Z",
		garbageValue = "-34327555"
	)
	public boolean method3174(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3226(); // L: 42

				try {
					this.field1730 = var1; // L: 44
					this.field1729 = var2.request(new URL(this.field1730)); // L: 45
					this.field1726 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3226(); // L: 50
					this.field1726 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "1224527567"
	)
	public void method3175(UrlRequester var1) {
		switch(this.field1726) { // L: 57
		case 0:
			this.method3185(var1); // L: 62
			break; // L: 63
		case 1:
			this.method3186(); // L: 59
			break;
		default:
			return; // L: 65
		}

	} // L: 67

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1504474906"
	)
	public int method3176() {
		return this.field1726; // L: 70
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2119043872"
	)
	public int method3196(String var1) {
		return this.field1731.containsKey(var1) ? (Integer)this.field1731.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1630145340"
	)
	public String method3178(String var1) {
		return (String)((String)(this.field1724.containsKey(var1) ? this.field1724.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1021496869"
	)
	public ArrayList method3179() {
		return this.field1735; // L: 82
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "100"
	)
	public ArrayList method3190() {
		return this.field1736; // L: 86
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2042009009"
	)
	public String method3201() {
		return this.field1732; // L: 90
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "208203188"
	)
	public float[] method3182() {
		return this.field1733; // L: 94
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "1"
	)
	public ArrayList method3183() {
		return this.field1734; // L: 98
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-10689"
	)
	void method3226() {
		this.field1729 = null; // L: 102
		this.field1732 = null; // L: 103
		this.field1733[0] = 0.0F; // L: 104
		this.field1733[1] = 0.0F; // L: 105
		this.field1733[2] = 1.0F; // L: 106
		this.field1733[3] = 1.0F; // L: 107
		this.field1734.clear(); // L: 108
		this.field1735.clear(); // L: 109
		this.field1736.clear(); // L: 110
		this.field1731.clear(); // L: 111
		this.field1724.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lcd;B)V",
		garbageValue = "9"
	)
	void method3185(UrlRequester var1) {
		if (this.field1729 != null && this.field1729.isDone()) { // L: 116
			byte[] var2 = this.field1729.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3226(); // L: 121
				this.field1726 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2); // L: 127
					var3 = var4.method7100(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3226(); // L: 132
					this.field1726 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3202(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1735.clear(); // L: 140
				}

				try {
					this.method3191(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1736.clear(); // L: 146
				}

				try {
					this.method3177(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1732 = null; // L: 152
					this.field1733[0] = 0.0F; // L: 153
					this.field1733[1] = 0.0F; // L: 154
					this.field1733[2] = 1.0F; // L: 155
					this.field1733[3] = 1.0F; // L: 156
					this.field1734.clear(); // L: 157
				}

				try {
					this.method3189(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1731.clear(); // L: 163
					this.field1724.clear(); // L: 164
				}

				this.field1726 = this.field1735.size() > 0 ? 1 : 2; // L: 166
				this.field1729 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	void method3186() {
		Iterator var1 = this.field1735.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1735.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1772 != null) { // L: 182
						byte[] var3 = var2.field1772.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1726 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3226(); // L: 191
				this.field1726 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1772 == null || var2.field1772.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lcd;B)V",
		garbageValue = "1"
	)
	void method3202(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1772 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1770 = class181.method3566(var4, "placement"); // L: 202
					this.field1735.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "112"
	)
	void method3191(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class161 var4 = new class161(this); // L: 213
				var4.field1775 = var3.getString("text"); // L: 214
				String var7 = var3.getString("align_x"); // L: 217
				byte var6;
				if (var7.equals("centre")) { // L: 219
					var6 = 1; // L: 220
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 223
					var6 = 0; // L: 227
				} else {
					var6 = 2; // L: 224
				}

				var4.field1773 = var6; // L: 229
				String var10 = var3.getString("align_y"); // L: 232
				byte var9;
				if (var10.equals("centre")) { // L: 234
					var9 = 1; // L: 235
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 238
					var9 = 0; // L: 242
				} else {
					var9 = 2; // L: 239
				}

				var4.field1777 = var9; // L: 244
				var4.field1779 = var3.getInt("font"); // L: 245
				var4.field1776 = class181.method3566(var3, "placement"); // L: 246
				this.field1736.add(var4); // L: 247
			}

		}
	} // L: 249

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1263600305"
	)
	void method3177(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 252
			this.field1733 = class181.method3566(var1, "clickbounds"); // L: 253
			this.field1732 = var1.getString("endpoint"); // L: 254
			String[] var2 = JSONObject.getNames(var1); // L: 255

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 256
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 257
					try {
						int var4 = var1.getInt(var2[var3]); // L: 259
						this.field1734.add(new class162(this, var2[var3], var4)); // L: 260
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 264
							if (var5.equals("true")) { // L: 265
								this.field1734.add(new class162(this, var2[var3], 1)); // L: 266
							} else if (var5.equals("false")) { // L: 268
								this.field1734.add(new class162(this, var2[var3], 0)); // L: 269
							} else {
								this.field1734.add(new class154(this, var2[var3], var5)); // L: 272
							}
						} catch (Exception var7) { // L: 275
						}
					}
				}
			}

		}
	} // L: 279

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1948226322"
	)
	void method3189(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 282

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 283
			try {
				int var4 = var1.getInt(var2[var3]); // L: 285
				this.field1731.put(var2[var3], var4); // L: 286
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 290
					if (var5.equals("true")) { // L: 291
						this.field1731.put(var2[var3], 1); // L: 292
					} else if (var5.equals("false")) { // L: 294
						this.field1731.put(var2[var3], 0); // L: 295
					} else {
						this.field1724.put(var2[var3], var5); // L: 298
					}
				} catch (Exception var7) { // L: 301
				}
			}
		}

	} // L: 304

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1008936985"
	)
	public static int method3194(int var0) {
		return class401.field4443[var0 & 16383]; // L: 32
	}
}
