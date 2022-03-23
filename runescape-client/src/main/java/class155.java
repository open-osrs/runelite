import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ef")
public class class155 {
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -636798581
	)
	int field1702;
	@ObfuscatedName("r")
	String field1714;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	UrlRequest field1710;
	@ObfuscatedName("x")
	String field1711;
	@ObfuscatedName("c")
	float[] field1712;
	@ObfuscatedName("j")
	ArrayList field1717;
	@ObfuscatedName("p")
	ArrayList field1713;
	@ObfuscatedName("s")
	ArrayList field1708;
	@ObfuscatedName("b")
	Map field1716;
	@ObfuscatedName("w")
	Map field1709;

	public class155() {
		this.field1702 = -1; // L: 24
		this.field1711 = null; // L: 27
		this.field1712 = new float[4]; // L: 28
		this.field1717 = new ArrayList(); // L: 29
		this.field1713 = new ArrayList(); // L: 30
		this.field1708 = new ArrayList(); // L: 31
		this.field1716 = new HashMap(); // L: 32
		this.field1709 = new HashMap(); // L: 33
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lci;I)Z",
		garbageValue = "1113383001"
	)
	public boolean method3131(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3143(); // L: 42

				try {
					this.field1714 = var1; // L: 44
					this.field1710 = var2.request(new URL(this.field1714)); // L: 45
					this.field1702 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3143(); // L: 50
					this.field1702 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "2095270255"
	)
	public void method3165(UrlRequester var1) {
		switch(this.field1702) { // L: 57
		case 0:
			this.method3142(var1);
			break; // L: 64
		case 1:
			this.method3135(); // L: 59
			break;
		default:
			return; // L: 62
		}

	} // L: 67

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method3141() {
		return this.field1702; // L: 70
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "8"
	)
	public int method3134(String var1) {
		return this.field1716.containsKey(var1) ? (Integer)this.field1716.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;",
		garbageValue = "24966"
	)
	public String method3144(String var1) {
		return (String)((String)(this.field1709.containsKey(var1) ? this.field1709.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1155378703"
	)
	public ArrayList method3130() {
		return this.field1713; // L: 82
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1265617281"
	)
	public ArrayList method3137() {
		return this.field1708; // L: 86
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1734627976"
	)
	public String method3138() {
		return this.field1711; // L: 90
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "35"
	)
	public float[] method3146() {
		return this.field1712; // L: 94
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-937062700"
	)
	public ArrayList method3140() {
		return this.field1717; // L: 98
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017672764"
	)
	void method3143() {
		this.field1710 = null; // L: 102
		this.field1711 = null; // L: 103
		this.field1712[0] = 0.0F; // L: 104
		this.field1712[1] = 0.0F; // L: 105
		this.field1712[2] = 1.0F; // L: 106
		this.field1712[3] = 1.0F; // L: 107
		this.field1717.clear(); // L: 108
		this.field1713.clear(); // L: 109
		this.field1708.clear(); // L: 110
		this.field1716.clear(); // L: 111
		this.field1709.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lci;B)V",
		garbageValue = "-74"
	)
	void method3142(UrlRequester var1) {
		if (this.field1710 != null && this.field1710.isDone()) { // L: 116
			byte[] var2 = this.field1710.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3143(); // L: 121
				this.field1702 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2); // L: 127
					var3 = var4.method7225(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3143(); // L: 132
					this.field1702 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3133(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1713.clear(); // L: 140
				}

				try {
					this.method3145(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1708.clear(); // L: 146
				}

				try {
					this.method3161(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1711 = null; // L: 152
					this.field1712[0] = 0.0F; // L: 153
					this.field1712[1] = 0.0F; // L: 154
					this.field1712[2] = 1.0F; // L: 155
					this.field1712[3] = 1.0F; // L: 156
					this.field1717.clear(); // L: 157
				}

				try {
					this.method3147(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1716.clear(); // L: 163
					this.field1709.clear(); // L: 164
				}

				this.field1702 = this.field1713.size() > 0 ? 1 : 2; // L: 166
				this.field1710 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-111140225"
	)
	void method3135() {
		Iterator var1 = this.field1713.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1713.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1749 != null) { // L: 182
						byte[] var3 = var2.field1749.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1702 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3143(); // L: 191
				this.field1702 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1749 == null || var2.field1749.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lci;B)V",
		garbageValue = "-122"
	)
	void method3133(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1749 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1748 = class14.method186(var4, "placement"); // L: 202
					this.field1713.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-1894946604"
	)
	void method3145(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class162 var4 = new class162(this); // L: 213
				var4.field1771 = var3.getString("text"); // L: 214
				String var7 = var3.getString("align_x"); // L: 217
				byte var6;
				if (var7.equals("centre")) { // L: 219
					var6 = 1; // L: 220
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 223
					var6 = 0; // L: 227
				} else {
					var6 = 2; // L: 224
				}

				var4.field1770 = var6; // L: 229
				String var10 = var3.getString("align_y"); // L: 232
				byte var9;
				if (var10.equals("centre")) { // L: 234
					var9 = 1; // L: 235
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 238
					var9 = 0; // L: 242
				} else {
					var9 = 2; // L: 239
				}

				var4.field1776 = var9; // L: 244
				var4.field1772 = var3.getInt("font"); // L: 245
				var4.field1769 = class14.method186(var3, "placement"); // L: 246
				this.field1708.add(var4); // L: 247
			}

		}
	} // L: 249

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "64"
	)
	void method3161(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 252
			this.field1712 = class14.method186(var1, "clickbounds"); // L: 253
			this.field1711 = var1.getString("endpoint"); // L: 254
			String[] var2 = JSONObject.getNames(var1); // L: 255

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 256
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 257
					try {
						int var4 = var1.getInt(var2[var3]); // L: 259
						this.field1717.add(new class163(this, var2[var3], var4)); // L: 260
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 264
							if (var5.equals("true")) { // L: 265
								this.field1717.add(new class163(this, var2[var3], 1)); // L: 266
							} else if (var5.equals("false")) { // L: 268
								this.field1717.add(new class163(this, var2[var3], 0)); // L: 269
							} else {
								this.field1717.add(new class154(this, var2[var3], var5)); // L: 272
							}
						} catch (Exception var7) { // L: 275
						}
					}
				}
			}

		}
	} // L: 279

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;S)V",
		garbageValue = "1459"
	)
	void method3147(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 282

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 283
			try {
				int var4 = var1.getInt(var2[var3]); // L: 285
				this.field1716.put(var2[var3], var4); // L: 286
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 290
					if (var5.equals("true")) { // L: 291
						this.field1716.put(var2[var3], 1); // L: 292
					} else if (var5.equals("false")) { // L: 294
						this.field1716.put(var2[var3], 0); // L: 295
					} else {
						this.field1709.put(var2[var3], var5); // L: 298
					}
				} catch (Exception var7) { // L: 301
				}
			}
		}

	} // L: 304
}
