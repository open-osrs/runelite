import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bs")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -990800587
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("o")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12755

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)I",
		garbageValue = "1102099344"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12758
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12759
				if (Client.worldId == var1.world) { // L: 12760
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12761
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12763
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12767
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12771
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "106"
	)
	static int method1120(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3428
			var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3429
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FileSystem.ItemDefinition_get(var3).name; // L: 3430
			return 1; // L: 3431
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3433
				class12.Interpreter_intStackSize -= 2; // L: 3434
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3435
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3436
				var5 = FileSystem.ItemDefinition_get(var3); // L: 3437
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3438
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3439
				}

				return 1; // L: 3440
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3442
				class12.Interpreter_intStackSize -= 2; // L: 3443
				var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3444
				var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3445
				var5 = FileSystem.ItemDefinition_get(var3); // L: 3446
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3447
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3448
				}

				return 1; // L: 3449
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3451
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3452
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FileSystem.ItemDefinition_get(var3).price; // L: 3453
				return 1; // L: 3454
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3456
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3457
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FileSystem.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3458
				return 1; // L: 3459
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3461
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3462
					var7 = FileSystem.ItemDefinition_get(var3); // L: 3463
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3464
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3; // L: 3465
					}

					return 1; // L: 3466
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3468
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3469
					var7 = FileSystem.ItemDefinition_get(var3); // L: 3470
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3471
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3; // L: 3472
					}

					return 1; // L: 3473
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3475
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3476
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FileSystem.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3477
					return 1; // L: 3478
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3480
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3481
					var7 = FileSystem.ItemDefinition_get(var3); // L: 3482
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3483
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3; // L: 3484
					}

					return 1; // L: 3485
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3487
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3488
					var7 = FileSystem.ItemDefinition_get(var3); // L: 3489
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3490
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3; // L: 3491
					}

					return 1; // L: 3492
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3494
					String var6 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3495
					var4 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3496
					class28.findItemDefinitions(var6, var4 == 1); // L: 3497
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator9.foundItemIdCount; // L: 3498
					return 1; // L: 3499
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3501
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3506
						Coord.foundItemIndex = 0; // L: 3507
						return 1; // L: 3508
					} else if (var0 == 4213) { // L: 3510
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3511
						var4 = FileSystem.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3512
						if (var4 == -1) { // L: 3513
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4; // L: 3514
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4 + 1; // L: 3517
						}

						return 1; // L: 3519
					} else {
						return 2; // L: 3521
					}
				} else {
					if (class182.foundItemIds != null && Coord.foundItemIndex < UserComparator9.foundItemIdCount) { // L: 3502
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class182.foundItemIds[++Coord.foundItemIndex - 1] & '\uffff'; // L: 3503
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3504
				}
			}
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1542062611"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4896
			var2 = 1;
		}

		if (var3 < 1) { // L: 4897
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4898
		int var6;
		if (var5 < 0) { // L: 4900
			var6 = Client.field748;
		} else if (var5 >= 100) { // L: 4901
			var6 = Client.field749;
		} else {
			var6 = (Client.field749 - Client.field748) * var5 / 100 + Client.field748; // L: 4902
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4903
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field656) { // L: 4904
			var10 = Client.field656; // L: 4905
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4906
			if (var6 > Client.field753) { // L: 4907
				var6 = Client.field753; // L: 4908
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4909
				var9 = (var2 - var8) / 2; // L: 4910
				if (var4) { // L: 4911
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4912
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4913
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4914
				}

				var0 += var9; // L: 4916
				var2 -= var9 * 2; // L: 4917
			}
		} else if (var7 > Client.field755) { // L: 4920
			var10 = Client.field755; // L: 4921
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4922
			if (var6 < Client.field752) { // L: 4923
				var6 = Client.field752; // L: 4924
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4925
				var9 = (var3 - var8) / 2; // L: 4926
				if (var4) { // L: 4927
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4928
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4929
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4930
				}

				var1 += var9; // L: 4932
				var3 -= var9 * 2; // L: 4933
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4936
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4937
			WorldMapArea.method4514(var2, var3); // L: 4938
		}

		Client.viewportOffsetX = var0; // L: 4940
		Client.viewportOffsetY = var1; // L: 4941
		Client.viewportWidth = var2; // L: 4942
		Client.viewportHeight = var3; // L: 4943
	} // L: 4944
}
