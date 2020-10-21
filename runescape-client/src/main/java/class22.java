import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("a")
public class class22 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("gz")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "-46"
	)
	static int method244(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3201
			MilliClock.Interpreter_intStackSize -= 2; // L: 3202
			Client.field873 = (short)FontName.method5455(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]); // L: 3203
			if (Client.field873 <= 0) { // L: 3204
				Client.field873 = 256;
			}

			Client.field932 = (short)FontName.method5455(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 3205
			if (Client.field932 <= 0) { // L: 3206
				Client.field932 = 256;
			}

			return 1; // L: 3207
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3209
			MilliClock.Interpreter_intStackSize -= 2; // L: 3210
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3211
			if (Client.zoomHeight <= 0) { // L: 3212
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3213
			if (Client.zoomWidth <= 0) { // L: 3214
				Client.zoomWidth = 320;
			}

			return 1; // L: 3215
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3217
			MilliClock.Interpreter_intStackSize -= 4; // L: 3218
			Client.field865 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 3219
			if (Client.field865 <= 0) { // L: 3220
				Client.field865 = 1;
			}

			Client.field753 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 3221
			if (Client.field753 <= 0) { // L: 3222
				Client.field753 = 32767;
			} else if (Client.field753 < Client.field865) { // L: 3223
				Client.field753 = Client.field865;
			}

			Client.field937 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 3224
			if (Client.field937 <= 0) { // L: 3225
				Client.field937 = 1;
			}

			Client.field935 = (short)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3]; // L: 3226
			if (Client.field935 <= 0) { // L: 3227
				Client.field935 = 32767;
			} else if (Client.field935 < Client.field937) { // L: 3228
				Client.field935 = Client.field937;
			}

			return 1; // L: 3229
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3231
			if (Client.viewportWidget != null) { // L: 3232
				Coord.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3233
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3234
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3235
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3238
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1; // L: 3239
			}

			return 1; // L: 3241
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3243
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3244
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3245
			return 1; // L: 3246
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3248
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = InterfaceParent.method1271(Client.field873); // L: 3249
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = InterfaceParent.method1271(Client.field932); // L: 3250
			return 1; // L: 3251
		} else if (var0 == 6220) { // L: 3253
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3254
			return 1; // L: 3255
		} else if (var0 == 6221) { // L: 3257
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 3258
			return 1; // L: 3259
		} else if (var0 == 6222) { // L: 3261
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ItemContainer.canvasWidth; // L: 3262
			return 1; // L: 3263
		} else if (var0 == 6223) { // L: 3265
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = HealthBar.canvasHeight; // L: 3266
			return 1; // L: 3267
		} else {
			return 2; // L: 3269
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-649676839"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11591
		short[] var2 = new short[16]; // L: 11592
		int var3 = 0; // L: 11593

		for (int var4 = 0; var4 < HealthBar.ItemDefinition_fileCount; ++var4) { // L: 11594
			ItemDefinition var9 = AbstractWorldMapData.ItemDefinition_get(var4); // L: 11595
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11596 11597 11598
				if (var3 >= 250) { // L: 11599
					PendingSpawn.foundItemIdCount = -1; // L: 11600
					Message.foundItemIds = null; // L: 11601
					return; // L: 11602
				}

				if (var3 >= var2.length) { // L: 11604
					short[] var6 = new short[var2.length * 2]; // L: 11605

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11606
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11607
				}

				var2[var3++] = (short)var4; // L: 11609
			}
		}

		Message.foundItemIds = var2; // L: 11611
		AbstractWorldMapIcon.foundItemIndex = 0; // L: 11612
		PendingSpawn.foundItemIdCount = var3; // L: 11613
		String[] var8 = new String[PendingSpawn.foundItemIdCount]; // L: 11614

		for (int var5 = 0; var5 < PendingSpawn.foundItemIdCount; ++var5) { // L: 11615
			var8[var5] = AbstractWorldMapData.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = Message.foundItemIds; // L: 11616
		Projectile.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 11618
	} // L: 11620

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "594289847"
	)
	static void method246(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 11623
			Client.randomDatData = new byte[24];
		}

		class311.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 11624
	} // L: 11625
}
