import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gr")
public class class196 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "145453040"
	)
	static int method3972(int var0, Script var1, boolean var2) {
		Widget var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 1296
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1297
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1298
			return 1; // L: 1299
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1301
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1302
			return 1; // L: 1303
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1305
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.text; // L: 1306
			return 1; // L: 1307
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1309
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1310
			return 1; // L: 1311
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1313
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1317
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1321
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1322
			return 1; // L: 1323
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1325
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1326
			return 1; // L: 1327
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1329
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1333
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1334
			return 1; // L: 1335
		} else if (var0 == 2610) { // L: 1337
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1338
			return 1; // L: 1339
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1341
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color; // L: 1342
			return 1; // L: 1343
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1345
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.color2; // L: 1346
			return 1; // L: 1347
		} else if (var0 == 2613) { // L: 1349
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1350
			return 1; // L: 1351
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1353
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1354
			return 1; // L: 1355
		} else if (var0 != 2615 && var0 != 2616) { // L: 1357
			return 2; // L: 1361
		} else {
			++class14.Interpreter_intStackSize; // L: 1358
			return 1; // L: 1359
		}
	}
}
