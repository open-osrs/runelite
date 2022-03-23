import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("p")
public class class14 {
	@ObfuscatedName("ug")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 659185471
	)
	final int field76;
	@ObfuscatedName("o")
	final String field74;
	@ObfuscatedName("h")
	final ThreadFactory field75;
	@ObfuscatedName("g")
	final ThreadPoolExecutor field73;

	public class14(String var1, int var2, int var3) {
		this.field74 = var1; // L: 15
		this.field76 = var2; // L: 16
		this.field75 = new class16(this); // L: 17
		this.field73 = this.method176(var3); // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-2010668855"
	)
	final ThreadPoolExecutor method176(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field76), this.field75); // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lk;I)Lm;",
		garbageValue = "-964082167"
	)
	public class19 method180(class10 var1) {
		if (this.field73.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field73.getCorePoolSize() + " Queue capacity " + this.field76); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field73.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-302987445"
	)
	public final void method178() {
		try {
			this.field73.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1120017674"
	)
	public static boolean method175(int var0) {
		return var0 >= WorldMapDecorationType.field3519.id && var0 <= WorldMapDecorationType.field3511.id || var0 == WorldMapDecorationType.field3514.id; // L: 43
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "28"
	)
	static float[] method186(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 307

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 309
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 310
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 311
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 312
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 313
		} catch (JSONException var4) { // L: 315
			var2[0] = 0.0F; // L: 316
			var2[1] = 0.0F; // L: 317
			var2[2] = 1.0F; // L: 318
			var2[3] = 1.0F; // L: 319
		}

		return var2; // L: 321
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1324190419"
	)
	static int method184(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2270
			class295.Interpreter_intStackSize -= 2; // L: 2271
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2272
			var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2273
			EnumComposition var10 = class268.getEnum(var3); // L: 2274
			if (var10.outputType != 's') { // L: 2275
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2276
				if (var9 == var10.keys[var6]) { // L: 2277
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2278
					var10 = null; // L: 2279
					break;
				}
			}

			if (var10 != null) { // L: 2283
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2284
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2286
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2312
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2313
				EnumComposition var4 = class268.getEnum(var3); // L: 2314
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.size(); // L: 2315
				return 1; // L: 2316
			} else {
				return 2; // L: 2318
			}
		} else {
			class295.Interpreter_intStackSize -= 4; // L: 2287
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2288
			var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2289
			int var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 2290
			var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 2291
			EnumComposition var7 = class268.getEnum(var5); // L: 2292
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2293
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2298
					if (var6 == var7.keys[var8]) { // L: 2299
						if (var9 == 115) { // L: 2300
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2301
						}

						var7 = null; // L: 2302
						break;
					}
				}

				if (var7 != null) { // L: 2306
					if (var9 == 115) { // L: 2307
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2308
					}
				}

				return 1; // L: 2310
			} else {
				if (var9 == 115) { // L: 2294
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2295
				}

				return 1; // L: 2296
			}
		}
	}
}
