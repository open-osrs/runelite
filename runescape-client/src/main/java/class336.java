import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("le")
public class class336 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZB)I",
		garbageValue = "-81"
	)
	static int method6380(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3201
			Interpreter.Interpreter_intStackSize -= 2; // L: 3202
			Client.field769 = (short)class197.method3741(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 3203
			if (Client.field769 <= 0) { // L: 3204
				Client.field769 = 256;
			}

			Client.field928 = (short)class197.method3741(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3205
			if (Client.field928 <= 0) { // L: 3206
				Client.field928 = 256;
			}

			return 1; // L: 3207
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3209
			Interpreter.Interpreter_intStackSize -= 2; // L: 3210
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3211
			if (Client.zoomHeight <= 0) { // L: 3212
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3213
			if (Client.zoomWidth <= 0) { // L: 3214
				Client.zoomWidth = 320;
			}

			return 1; // L: 3215
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3217
			Interpreter.Interpreter_intStackSize -= 4; // L: 3218
			Client.field931 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3219
			if (Client.field931 <= 0) { // L: 3220
				Client.field931 = 1;
			}

			Client.field932 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3221
			if (Client.field932 <= 0) { // L: 3222
				Client.field932 = 32767;
			} else if (Client.field932 < Client.field931) { // L: 3223
				Client.field932 = Client.field931;
			}

			Client.field938 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3224
			if (Client.field938 <= 0) { // L: 3225
				Client.field938 = 1;
			}

			Client.field934 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3226
			if (Client.field934 <= 0) { // L: 3227
				Client.field934 = 32767;
			} else if (Client.field934 < Client.field938) { // L: 3228
				Client.field934 = Client.field938;
			}

			return 1; // L: 3229
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3231
			if (Client.viewportWidget != null) { // L: 3232
				class231.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3233
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3234
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3235
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3238
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3239
			}

			return 1; // L: 3241
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3243
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3244
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3245
			return 1; // L: 3246
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3248
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapManager.method725(Client.field769); // L: 3249
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapManager.method725(Client.field928); // L: 3250
			return 1; // L: 3251
		} else if (var0 == 6220) { // L: 3253
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3254
			return 1; // L: 3255
		} else if (var0 == 6221) { // L: 3257
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3258
			return 1; // L: 3259
		} else if (var0 == 6222) { // L: 3261
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorDecoration.canvasWidth; // L: 3262
			return 1; // L: 3263
		} else if (var0 == 6223) { // L: 3265
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameShell.canvasHeight; // L: 3266
			return 1; // L: 3267
		} else {
			return 2; // L: 3269
		}
	}
}
