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
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("eq")
public class class155 {
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1553344027
	)
	int field1744;
	@ObfuscatedName("v")
	String field1745;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field1746;
	@ObfuscatedName("c")
	String field1742;
	@ObfuscatedName("w")
	float[] field1749;
	@ObfuscatedName("b")
	ArrayList field1748;
	@ObfuscatedName("t")
	ArrayList field1750;
	@ObfuscatedName("g")
	ArrayList field1751;
	@ObfuscatedName("x")
	Map field1743;
	@ObfuscatedName("n")
	Map field1753;

	public class155() {
		this.field1744 = -1; // L: 24
		this.field1742 = null; // L: 27
		this.field1749 = new float[4]; // L: 28
		this.field1748 = new ArrayList(); // L: 29
		this.field1750 = new ArrayList(); // L: 30
		this.field1751 = new ArrayList(); // L: 31
		this.field1743 = new HashMap(); // L: 32
		this.field1753 = new HashMap(); // L: 33
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;B)Z",
		garbageValue = "57"
	)
	public boolean method3085(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3073(); // L: 42

				try {
					this.field1745 = var1; // L: 44
					this.field1746 = var2.request(new URL(this.field1745)); // L: 45
					this.field1744 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3073(); // L: 50
					this.field1744 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)V",
		garbageValue = "2008517320"
	)
	public void method3064(UrlRequester var1) {
		switch(this.field1744) { // L: 57
		case 0:
			this.method3074(var1);
			break; // L: 64
		case 1:
			this.method3121(); // L: 59
			break;
		default:
			return; // L: 62
		}

	} // L: 67

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "649568402"
	)
	public int method3067() {
		return this.field1744; // L: 70
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1638920385"
	)
	public int method3066(String var1) {
		return this.field1743.containsKey(var1) ? (Integer)this.field1743.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-57"
	)
	public String method3097(String var1) {
		return (String)((String)(this.field1753.containsKey(var1) ? this.field1753.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1949744865"
	)
	public ArrayList method3110() {
		return this.field1750; // L: 82
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1585296838"
	)
	public ArrayList method3069() {
		return this.field1751; // L: 86
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-304867639"
	)
	public String method3075() {
		return this.field1742; // L: 90
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "63"
	)
	public float[] method3071() {
		return this.field1749; // L: 94
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "126443556"
	)
	public ArrayList method3072() {
		return this.field1748; // L: 98
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1659374882"
	)
	void method3073() {
		this.field1746 = null; // L: 102
		this.field1742 = null; // L: 103
		this.field1749[0] = 0.0F; // L: 104
		this.field1749[1] = 0.0F; // L: 105
		this.field1749[2] = 1.0F; // L: 106
		this.field1749[3] = 1.0F; // L: 107
		this.field1748.clear(); // L: 108
		this.field1750.clear(); // L: 109
		this.field1751.clear(); // L: 110
		this.field1743.clear(); // L: 111
		this.field1753.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V",
		garbageValue = "107"
	)
	void method3074(UrlRequester var1) {
		if (this.field1746 != null && this.field1746.isDone()) { // L: 116
			byte[] var2 = this.field1746.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3073(); // L: 121
				this.field1744 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2); // L: 127
					var3 = var4.method6947(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3073(); // L: 132
					this.field1744 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3076(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1750.clear(); // L: 140
				}

				try {
					this.method3098(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1751.clear(); // L: 146
				}

				try {
					this.method3083(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1742 = null; // L: 152
					this.field1749[0] = 0.0F; // L: 153
					this.field1749[1] = 0.0F; // L: 154
					this.field1749[2] = 1.0F; // L: 155
					this.field1749[3] = 1.0F; // L: 156
					this.field1748.clear(); // L: 157
				}

				try {
					this.method3079(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1743.clear(); // L: 163
					this.field1753.clear(); // L: 164
				}

				this.field1744 = this.field1750.size() > 0 ? 1 : 2; // L: 166
				this.field1746 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "533215283"
	)
	void method3121() {
		Iterator var1 = this.field1750.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1750.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1783 != null) { // L: 182
						byte[] var3 = var2.field1783.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1744 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3073(); // L: 191
				this.field1744 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1783 == null || var2.field1783.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lce;B)V",
		garbageValue = "120"
	)
	void method3076(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1783 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1782 = ChatChannel.method1965(var4, "placement"); // L: 202
					this.field1750.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-867893619"
	)
	void method3098(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class162 var4 = new class162(this); // L: 213
				var4.field1803 = var3.getString("text"); // L: 214
				var4.field1811 = class131.method2828(var3.getString("align_x")); // L: 215
				var4.field1806 = class131.method2828(var3.getString("align_y")); // L: 216
				var4.field1807 = var3.getInt("font"); // L: 217
				var4.field1804 = ChatChannel.method1965(var3, "placement"); // L: 218
				this.field1751.add(var4); // L: 219
			}

		}
	} // L: 221

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1307418854"
	)
	void method3083(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 224
			this.field1749 = ChatChannel.method1965(var1, "clickbounds"); // L: 225
			this.field1742 = var1.getString("endpoint"); // L: 226
			String[] var2 = JSONObject.getNames(var1); // L: 227

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 228
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 229
					try {
						int var4 = var1.getInt(var2[var3]); // L: 231
						this.field1748.add(new class163(this, var2[var3], var4)); // L: 232
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 236
							if (var5.equals("true")) { // L: 237
								this.field1748.add(new class163(this, var2[var3], 1)); // L: 238
							} else if (var5.equals("false")) { // L: 240
								this.field1748.add(new class163(this, var2[var3], 0)); // L: 241
							} else {
								this.field1748.add(new class154(this, var2[var3], var5)); // L: 244
							}
						} catch (Exception var7) { // L: 247
						}
					}
				}
			}

		}
	} // L: 251

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "1"
	)
	void method3079(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 254

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 255
			try {
				int var4 = var1.getInt(var2[var3]); // L: 257
				this.field1743.put(var2[var3], var4); // L: 258
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 262
					if (var5.equals("true")) { // L: 263
						this.field1743.put(var2[var3], 1); // L: 264
					} else if (var5.equals("false")) { // L: 266
						this.field1743.put(var2[var3], 0); // L: 267
					} else {
						this.field1753.put(var2[var3], var5); // L: 270
					}
				} catch (Exception var7) { // L: 273
				}
			}
		}

	} // L: 276

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1124617312"
	)
	static int method3124(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2124
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.cycle; // L: 2125
			return 1; // L: 2126
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2128
				class12.Interpreter_intStackSize -= 2; // L: 2129
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2130
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2131
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Message.method1079(var3, var4); // L: 2132
				return 1; // L: 2133
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2135
				class12.Interpreter_intStackSize -= 2; // L: 2136
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2137
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2138
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class290.ItemContainer_getCount(var3, var4); // L: 2139
				return 1; // L: 2140
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2142
				class12.Interpreter_intStackSize -= 2; // L: 2143
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2144
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2145
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Skeleton.method4019(var3, var4); // L: 2146
				return 1; // L: 2147
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2149
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2150
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = DirectByteArrayCopier.getInvDefinition(var3).size; // L: 2151
				return 1; // L: 2152
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2154
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2155
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2156
				return 1; // L: 2157
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2159
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2160
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2161
				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2164
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2165
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2166
				return 1; // L: 2167
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2169
					var3 = class128.Client_plane; // L: 2170
					var4 = (ModelData0.localPlayer.x >> 7) + SecureRandomCallable.baseX; // L: 2171
					var5 = (ModelData0.localPlayer.y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY; // L: 2172
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2176
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2177
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2178
					return 1; // L: 2179
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2181
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2182
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2183
					return 1; // L: 2184
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2186
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2187
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2188
					return 1; // L: 2189
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2191
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2192
					return 1; // L: 2193
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2195
					class12.Interpreter_intStackSize -= 2; // L: 2196
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768; // L: 2197
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2198
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Message.method1079(var3, var4); // L: 2199
					return 1; // L: 2200
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2202
					class12.Interpreter_intStackSize -= 2; // L: 2203
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768; // L: 2204
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2205
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class290.ItemContainer_getCount(var3, var4); // L: 2206
					return 1; // L: 2207
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2209
					class12.Interpreter_intStackSize -= 2; // L: 2210
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize] + 32768; // L: 2211
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2212
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Skeleton.method4019(var3, var4); // L: 2213
					return 1; // L: 2214
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2216
					if (Client.staffModLevel >= 2) { // L: 2217
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2218
					}

					return 1; // L: 2219
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2221
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2222
					return 1; // L: 2223
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2225
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.worldId; // L: 2226
					return 1; // L: 2227
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2229
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2230
					return 1; // L: 2231
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2233
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.weight; // L: 2234
					return 1; // L: 2235
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2237
					if (Client.playerMod) { // L: 2238
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2239
					}

					return 1; // L: 2240
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2242
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2243
					return 1; // L: 2244
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2246
					class12.Interpreter_intStackSize -= 4; // L: 2247
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2248
					var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2249
					var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 2250
					int var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 3]; // L: 2251
					var3 += var4 << 14; // L: 2252
					var3 += var5 << 28; // L: 2253
					var3 += var6; // L: 2254
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3; // L: 2255
					return 1; // L: 2256
				} else if (var0 == 3326) { // L: 2258
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field492; // L: 2259
					return 1; // L: 2260
				} else if (var0 == 3327) { // L: 2262
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.field681; // L: 2263
					return 1; // L: 2264
				} else {
					return 2; // L: 2266
				}
			}
		}
	}
}
