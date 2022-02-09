import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 73955387
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("c")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12206

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lld;Lld;I)I",
		garbageValue = "-23540014"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12209
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12210
				if (Client.worldId == var1.world) { // L: 12211
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12212
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12214
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12218
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12222
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1983193854"
	)
	public static int method1118(int var0) {
		return var0 >> 17 & 7; // L: 21
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "-44"
	)
	static int method1115(int var0, Script var1, boolean var2) {
		Widget var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1293
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1294
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1295
			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1298
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1302
			Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.text; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1306
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1310
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1314
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1318
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1322
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1326
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1327
			return 1; // L: 1328
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1330
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1331
			return 1; // L: 1332
		} else if (var0 == 2610) { // L: 1334
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1338
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1339
			return 1; // L: 1340
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1342
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1343
			return 1; // L: 1344
		} else if (var0 == 2613) { // L: 1346
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1350
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1351
			return 1; // L: 1352
		} else if (var0 != 2615 && var0 != 2616) { // L: 1354
			return 2; // L: 1358
		} else {
			++Interpreter.Interpreter_intStackSize; // L: 1355
			return 1; // L: 1356
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1657692174"
	)
	protected static final void method1121() {
		GameEngine.clock.mark(); // L: 414

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 415
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 416
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class147.gameCyclesToDo = 0; // L: 417
	} // L: 418
}
