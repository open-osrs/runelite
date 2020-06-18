import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
public class class231 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "340792557"
	)
	static int method4277(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = class58.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ScriptEvent.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = NetSocket.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--UrlRequester.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					NetSocket.clientPreferences.windowMode = var3;
					SpriteMask.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1553809797"
	)
	static int method4278(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
