import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iy")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -170825093
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -727750889
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1798867267
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2105271367"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class120.Widget_loadedInterfaces[var0]) { // L: 246
			return true;
		} else if (!class134.Widget_archive.tryLoadGroup(var0)) { // L: 247
			return false;
		} else {
			int var1 = class134.Widget_archive.getGroupFileCount(var0); // L: 248
			if (var1 == 0) { // L: 249
				class120.Widget_loadedInterfaces[var0] = true; // L: 250
				return true; // L: 251
			} else {
				if (NetSocket.Widget_interfaceComponents[var0] == null) { // L: 253
					NetSocket.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 254
					if (NetSocket.Widget_interfaceComponents[var0][var2] == null) { // L: 255
						byte[] var3 = class134.Widget_archive.takeFile(var0, var2); // L: 256
						if (var3 != null) { // L: 257
							NetSocket.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 258
							NetSocket.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 259
							if (var3[0] == -1) { // L: 260
								NetSocket.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								NetSocket.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 261
							}
						}
					}
				}

				class120.Widget_loadedInterfaces[var0] = true; // L: 265
				return true; // L: 266
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1988799748"
	)
	static int method4804(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1341
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1342
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1343
			return 1; // L: 1344
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1346
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1350
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var3.text; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1354
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1355
			return 1; // L: 1356
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1358
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1359
			return 1; // L: 1360
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1362
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1363
			return 1; // L: 1364
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1366
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1367
			return 1; // L: 1368
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1370
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1374
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1378
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1379
			return 1; // L: 1380
		} else if (var0 == 2610) { // L: 1382
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1386
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color; // L: 1387
			return 1; // L: 1388
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1390
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.color2; // L: 1391
			return 1; // L: 1392
		} else if (var0 == 2613) { // L: 1394
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1395
			return 1; // L: 1396
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1398
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1399
			return 1; // L: 1400
		} else if (var0 != 2615 && var0 != 2616) { // L: 1402
			return 2; // L: 1406
		} else {
			++class12.Interpreter_intStackSize; // L: 1403
			return 1; // L: 1404
		}
	}
}
