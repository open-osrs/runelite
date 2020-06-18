import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dm")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1835332677
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -514712003
	)
	@Export("size")
	int size;
	@ObfuscatedName("j")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("p")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("g")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("n")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("u")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1841893741"
	)
	static int method2418(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
