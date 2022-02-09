import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("g")
public class class21 {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 23217011
	)
	static int field119;
	@ObfuscatedName("y")
	public static short[] field120;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1951447145
	)
	final int field121;
	@ObfuscatedName("l")
	final String field118;

	class21(String var1) {
		this.field121 = 400; // L: 32
		this.field118 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field121 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field121 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field118 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "968083277"
	)
	public int method294() {
		return this.field121; // L: 37
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1877515937"
	)
	public String method295() {
		return this.field118; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;IB)Ljj;",
		garbageValue = "-3"
	)
	static MusicPatch method302(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public static void method301() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 415
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 416
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 417
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 418
	} // L: 419

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "-117"
	)
	static int method292(int var0, Script var1, boolean var2) {
		Widget var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1264
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1265
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1269
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1273
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1274
			return 1; // L: 1275
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1277
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1278
			return 1; // L: 1279
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1281
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1282
			return 1; // L: 1283
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1285
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1286
			return 1; // L: 1287
		} else {
			return 2; // L: 1289
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "20"
	)
	static int method303(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2493
			if (var0 == 3702) { // L: 2498
				++Interpreter.Interpreter_intStackSize; // L: 2499
				return 1; // L: 2500
			} else {
				return 2; // L: 2502
			}
		} else {
			--Interpreter.Interpreter_intStackSize; // L: 2494
			--BufferedNetSocket.Interpreter_stringStackSize; // L: 2495
			return 1; // L: 2496
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Ljz;IIIZB)V",
		garbageValue = "1"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10316
			Widget var6 = var0[var5]; // L: 10317
			if (var6 != null && var6.parentId == var1) { // L: 10318 10319
				class141.alignWidgetSize(var6, var2, var3, var4); // L: 10320
				NetCache.alignWidgetPosition(var6, var2, var3); // L: 10321
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10322
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10323
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10324
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10325
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10326
					PcmPlayer.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10328

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	static final void method299(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11536
		if (var0 != class424.clientPreferences.musicVolume) { // L: 11537
			if (class424.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11538
				MenuAction.method1894(WorldMapLabelSize.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11539
				Client.field744 = false; // L: 11540
			} else if (var0 == 0) { // L: 11542
				class265.midiPcmStream.clear(); // L: 11544
				class265.musicPlayerStatus = 1; // L: 11545
				class265.musicTrackArchive = null; // L: 11546
				Client.field744 = false; // L: 11548
			} else {
				class111.method2528(var0); // L: 11550
			}

			class424.clientPreferences.musicVolume = var0; // L: 11551
			GameEngine.savePreferences(); // L: 11552
		}

	} // L: 11554
}
