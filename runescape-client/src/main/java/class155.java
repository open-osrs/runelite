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

@ObfuscatedName("ev")
public class class155 {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2129786845
	)
	int field1694;
	@ObfuscatedName("o")
	String field1702;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	UrlRequest field1696;
	@ObfuscatedName("p")
	String field1704;
	@ObfuscatedName("w")
	float[] field1705;
	@ObfuscatedName("k")
	ArrayList field1706;
	@ObfuscatedName("d")
	ArrayList field1707;
	@ObfuscatedName("m")
	ArrayList field1708;
	@ObfuscatedName("u")
	Map field1709;
	@ObfuscatedName("t")
	Map field1710;

	public class155() {
		this.field1694 = -1; // L: 24
		this.field1704 = null; // L: 27
		this.field1705 = new float[4]; // L: 28
		this.field1706 = new ArrayList(); // L: 29
		this.field1707 = new ArrayList(); // L: 30
		this.field1708 = new ArrayList(); // L: 31
		this.field1709 = new HashMap(); // L: 32
		this.field1710 = new HashMap(); // L: 33
	} // L: 385

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lck;I)Z",
		garbageValue = "903767211"
	)
	public boolean method3201(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3192(); // L: 42

				try {
					this.field1702 = var1; // L: 44
					this.field1696 = var2.request(new URL(this.field1702)); // L: 45
					this.field1694 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3192(); // L: 50
					this.field1694 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lck;I)V",
		garbageValue = "2123246139"
	)
	public void method3184(UrlRequester var1) {
		switch(this.field1694) { // L: 57
		case 0:
			this.method3193(var1);
			break; // L: 64
		case 1:
			this.method3194(); // L: 59
			break;
		default:
			return; // L: 62
		}

	} // L: 67

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2027263418"
	)
	public int method3230() {
		return this.field1694; // L: 70
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "125"
	)
	public int method3189(String var1) {
		return this.field1709.containsKey(var1) ? (Integer)this.field1709.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1588699273"
	)
	public String method3223(String var1) {
		return (String)(this.field1710.containsKey(var1) ? this.field1710.get(var1) : null); // L: 78
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "1"
	)
	public ArrayList method3187() {
		return this.field1707; // L: 82
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1812482567"
	)
	public ArrayList method3229() {
		return this.field1708; // L: 86
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-121"
	)
	public String method3188() {
		return this.field1704; // L: 90
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1243511271"
	)
	public float[] method3190() {
		return this.field1705; // L: 94
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "969924942"
	)
	public ArrayList method3191() {
		return this.field1706; // L: 98
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "938648382"
	)
	void method3192() {
		this.field1696 = null; // L: 102
		this.field1704 = null; // L: 103
		this.field1705[0] = 0.0F; // L: 104
		this.field1705[1] = 0.0F; // L: 105
		this.field1705[2] = 1.0F; // L: 106
		this.field1705[3] = 1.0F; // L: 107
		this.field1706.clear(); // L: 108
		this.field1707.clear(); // L: 109
		this.field1708.clear(); // L: 110
		this.field1709.clear(); // L: 111
		this.field1710.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)V",
		garbageValue = "69"
	)
	void method3193(UrlRequester var1) {
		if (this.field1696 != null && this.field1696.isDone()) { // L: 116
			byte[] var2 = this.field1696.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3192(); // L: 121
				this.field1694 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2); // L: 127
					var3 = var4.method7156(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3192(); // L: 132
					this.field1694 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3195(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1707.clear(); // L: 140
				}

				try {
					this.method3196(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1708.clear(); // L: 146
				}

				try {
					this.method3197(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1704 = null; // L: 152
					this.field1705[0] = 0.0F; // L: 153
					this.field1705[1] = 0.0F; // L: 154
					this.field1705[2] = 1.0F; // L: 155
					this.field1705[3] = 1.0F; // L: 156
					this.field1706.clear(); // L: 157
				}

				try {
					this.method3240(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1709.clear(); // L: 163
					this.field1710.clear(); // L: 164
				}

				this.field1694 = this.field1707.size() > 0 ? 1 : 2; // L: 166
				this.field1696 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711663898"
	)
	void method3194() {
		Iterator var1 = this.field1707.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1707.iterator(); // L: 179

				while (var1.hasNext()) { // L: 190
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1737 != null) { // L: 182
						byte[] var3 = var2.field1737.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1694 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3192(); // L: 191
				this.field1694 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1737 == null || var2.field1737.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lck;B)V",
		garbageValue = "-22"
	)
	void method3195(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1737 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1735 = HorizontalAlignment.method3495(var4, "placement"); // L: 202
					this.field1707.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1024784917"
	)
	void method3196(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class162 var4 = new class162(this); // L: 213
				var4.field1758 = var3.getString("text"); // L: 214
				String var7 = var3.getString("align_x"); // L: 217
				byte var6;
				if (var7.equals("centre")) { // L: 219
					var6 = 1; // L: 220
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 223
					var6 = 0; // L: 227
				} else {
					var6 = 2; // L: 224
				}

				var4.field1755 = var6; // L: 229
				String var10 = var3.getString("align_y"); // L: 232
				byte var9;
				if (var10.equals("centre")) { // L: 234
					var9 = 1; // L: 235
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 238
					var9 = 0; // L: 242
				} else {
					var9 = 2; // L: 239
				}

				var4.field1756 = var9; // L: 244
				var4.field1752 = var3.getInt("font"); // L: 245
				var4.field1754 = HorizontalAlignment.method3495(var3, "placement");
				this.field1708.add(var4);
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "222428607"
	)
	void method3197(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 252
			this.field1705 = HorizontalAlignment.method3495(var1, "clickbounds");
			this.field1704 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1706.add(new class163(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 264
							if (var5.equals("true")) {
								this.field1706.add(new class163(this, var2[var3], 1));
							} else if (var5.equals("false")) { // L: 268
								this.field1706.add(new class163(this, var2[var3], 0)); // L: 269
							} else {
								this.field1706.add(new class154(this, var2[var3], var5)); // L: 272
							}
						} catch (Exception var7) { // L: 275
						}
					}
				}
			}

		}
	} // L: 279

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1700168973"
	)
	void method3240(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 282

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 283
			try {
				int var4 = var1.getInt(var2[var3]); // L: 285
				this.field1709.put(var2[var3], var4); // L: 286
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 290
					if (var5.equals("true")) { // L: 291
						this.field1709.put(var2[var3], 1); // L: 292
					} else if (var5.equals("false")) { // L: 294
						this.field1709.put(var2[var3], 0); // L: 295
					} else {
						this.field1710.put(var2[var3], var5); // L: 298
					}
				} catch (Exception var7) { // L: 301
				}
			}
		}

	} // L: 304

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkl;",
		garbageValue = "-124826849"
	)
	static GameBuild[] method3185() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE}; // L: 13
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (WorldMapSectionType.Widget_loadedInterfaces[var0]) { // L: 246
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) { // L: 247
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0); // L: 248
			if (var1 == 0) { // L: 249
				WorldMapSectionType.Widget_loadedInterfaces[var0] = true; // L: 250
				return true; // L: 251
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 253
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 254
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 255
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2); // L: 256
						if (var3 != null) { // L: 257
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 258
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 259
							if (var3[0] == -1) { // L: 260
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 261
							}
						}
					}
				}

				WorldMapSectionType.Widget_loadedInterfaces[var0] = true; // L: 265
				return true; // L: 266
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "([Lky;II)V",
		garbageValue = "-609081385"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11723
			Widget var3 = var0[var2]; // L: 11724
			if (var3 != null) { // L: 11725
				if (var3.type == 0) { // L: 11726
					if (var3.children != null) { // L: 11727
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11728
					if (var4 != null) { // L: 11729
						MouseRecorder.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11731
					var5 = new ScriptEvent(); // L: 11732
					var5.widget = var3; // L: 11733
					var5.args = var3.onDialogAbort; // L: 11734
					ClanSettings.runScriptEvent(var5); // L: 11735
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11737
					if (var3.childIndex >= 0) { // L: 11738
						Widget var6 = class127.getWidget(var3.id); // L: 11739
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11740
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11744
					var5.widget = var3; // L: 11745
					var5.args = var3.onSubChange; // L: 11746
					ClanSettings.runScriptEvent(var5); // L: 11747
				}
			}
		}

	} // L: 11750
}
