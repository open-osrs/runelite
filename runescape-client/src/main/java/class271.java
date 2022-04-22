import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jw")
public class class271 {
	@ObfuscatedName("v")
	static int[] field3155;
	@ObfuscatedName("b")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;

	static {
		new Object();
		field3155 = new int[33]; // L: 8
		field3155[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3155[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "27"
	)
	static int method5220(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1410
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1411
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1412
			return 1; // L: 1413
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1415
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1416
			if (var3.itemId != -1) { // L: 1417
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1418
			}

			return 1; // L: 1419
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1421
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1422
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1423
			if (var4 != null) { // L: 1424
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1425
			}

			return 1; // L: 1426
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1428
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1429
			return 1; // L: 1430
		} else if (var0 == 1707) { // L: 1432
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1433
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method5690() ? 1 : 0; // L: 1434
			return 1; // L: 1435
		} else if (var0 == 1708) { // L: 1437
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1438
			return UserComparator9.method2617(var3); // L: 1439
		} else if (var0 == 1708) { // L: 1441
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1442
			return class305.method5782(var3); // L: 1443
		} else {
			return 2; // L: 1445
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1452863306"
	)
	static int method5221(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4484
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4489
				if (var0 == 6750) { // L: 4493
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4494
					return 1; // L: 4495
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4497
					if (var0 == 6754) { // L: 4501
						int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4502
						NPCComposition var4 = KeyHandler.getNpcDefinition(var3); // L: 4503
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4504
						return 1; // L: 4505
					} else {
						return 2; // L: 4507
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4498
					return 1; // L: 4499
				}
			} else {
				--Interpreter.Interpreter_intStackSize; // L: 4490
				return 1; // L: 4491
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 4485
			--class122.Interpreter_stringStackSize; // L: 4486
			return 1; // L: 4487
		}
	}
}
