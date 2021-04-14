import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bd")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1657025249
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1338843583
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -983973645
	)
	@Export("size")
	int size;
	@ObfuscatedName("p")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("b")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("e")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("k")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("g")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134581058"
	)
	public static void method1172() {
		Widget.Widget_cachedSprites.clear(); // L: 690
		Widget.Widget_cachedModels.clear(); // L: 691
		Widget.Widget_cachedFonts.clear(); // L: 692
		Widget.Widget_cachedSpriteMasks.clear(); // L: 693
	} // L: 694

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "298552186"
	)
	static int method1171(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1280
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1281
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1282
			return 1; // L: 1283
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1285
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1286
			return 1; // L: 1287
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1289
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1290
			return 1; // L: 1291
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1293
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1294
			return 1; // L: 1295
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1297
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1298
			return 1; // L: 1299
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1301
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1302
			return 1; // L: 1303
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1305
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1306
			return 1; // L: 1307
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1309
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1310
			return 1; // L: 1311
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1313
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1317
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1321
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1322
			return 1; // L: 1323
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1325
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color; // L: 1326
			return 1; // L: 1327
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1329
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color2; // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1333
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1334
			return 1; // L: 1335
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1337
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1338
			return 1; // L: 1339
		} else if (var0 != 2615 && var0 != 2616) { // L: 1341
			return 2; // L: 1345
		} else {
			++class16.Interpreter_intStackSize; // L: 1342
			return 1; // L: 1343
		}
	}
}
