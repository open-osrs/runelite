import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class228 {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 335336935
	)
	static int field2740;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;B)V",
		garbageValue = "-43"
	)
	public static void method4310(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-1439463638"
	)
	static int method4309(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 433
			Interpreter.Interpreter_intStackSize -= 3; // L: 434
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 435
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 436
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 437
			if (var4 == 0) { // L: 438
				throw new RuntimeException(); // L: 439
			} else {
				Widget var6 = class237.getWidget(var9); // L: 441
				if (var6.children == null) { // L: 442
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 443
					Widget[] var7 = new Widget[var11 + 1]; // L: 444

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 445
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 446
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 448
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 449
					var12.type = var4; // L: 450
					var12.parentId = var12.id = var6.id; // L: 451
					var12.childIndex = var11; // L: 452
					var12.isIf3 = true; // L: 453
					var6.children[var11] = var12; // L: 454
					if (var2) { // L: 455
						class277.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12; // L: 456
					}

					IsaacCipher.invalidateWidget(var6); // L: 457
					return 1; // L: 458
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 460
				var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 461
				Widget var10 = class237.getWidget(var3.id); // L: 462
				var10.children[var3.childIndex] = null; // L: 463
				IsaacCipher.invalidateWidget(var10); // L: 464
				return 1; // L: 465
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 467
				var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 468
				var3.children = null; // L: 469
				IsaacCipher.invalidateWidget(var3); // L: 470
				return 1; // L: 471
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 473
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 486
					var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 487
					if (var3 != null) { // L: 488
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 489
						if (var2) { // L: 490
							class277.scriptDotWidget = var3;
						} else {
							Interpreter.scriptActiveWidget = var3; // L: 491
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 493
					}

					return 1; // L: 494
				} else {
					return 2; // L: 496
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 474
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 475
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 476
				Widget var5 = ArchiveLoader.getWidgetChild(var9, var4); // L: 477
				if (var5 != null && var4 != -1) { // L: 478
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 479
					if (var2) { // L: 480
						class277.scriptDotWidget = var5;
					} else {
						Interpreter.scriptActiveWidget = var5; // L: 481
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 483
				}

				return 1; // L: 484
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112037440"
	)
	public static void method4311() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 98
	} // L: 99

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "585"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapCacheName.loadInterface(var0)) { // L: 10840
			WorldMapData_1.runComponentCloseListeners(DefaultsGroup.Widget_interfaceComponents[var0], var1); // L: 10841
		}
	} // L: 10842
}
