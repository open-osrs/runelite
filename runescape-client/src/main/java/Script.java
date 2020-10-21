import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("b")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("l")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("m")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -289623255
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1416487067
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1408552327
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1198237171
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lll;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	} // L: 22

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)[Lll;",
		garbageValue = "20409592"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 125
	}

	@ObfuscatedName("f")
	static double method2356(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4; // L: 10
		double var6 = Math.exp(var8 * -var8 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 12
		return var6 / var4; // L: 14
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "1422774584"
	)
	static int method2355(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 430
			MilliClock.Interpreter_intStackSize -= 3; // L: 431
			var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 432
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 433
			int var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 434
			if (var4 == 0) { // L: 435
				throw new RuntimeException(); // L: 436
			} else {
				Widget var6 = UserComparator4.getWidget(var9); // L: 438
				if (var6.children == null) { // L: 439
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 440
					Widget[] var7 = new Widget[var11 + 1]; // L: 441

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 442
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 443
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 445
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 446
					var12.type = var4; // L: 447
					var12.parentId = var12.id = var6.id; // L: 448
					var12.childIndex = var11; // L: 449
					var12.isIf3 = true; // L: 450
					var6.children[var11] = var12; // L: 451
					if (var2) { // L: 452
						MouseRecorder.field621 = var12;
					} else {
						Interpreter.field1122 = var12; // L: 453
					}

					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var6); // L: 454
					return 1; // L: 455
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 457
				var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 458
				Widget var10 = UserComparator4.getWidget(var3.id); // L: 459
				var10.children[var3.childIndex] = null; // L: 460
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10); // L: 461
				return 1; // L: 462
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 464
				var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 465
				var3.children = null; // L: 466
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3); // L: 467
				return 1; // L: 468
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 470
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 483
					var3 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 484
					if (var3 != null) { // L: 485
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 486
						if (var2) { // L: 487
							MouseRecorder.field621 = var3;
						} else {
							Interpreter.field1122 = var3; // L: 488
						}
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 490
					}

					return 1; // L: 491
				} else {
					return 2; // L: 493
				}
			} else {
				MilliClock.Interpreter_intStackSize -= 2; // L: 471
				var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 472
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 473
				Widget var5 = ItemContainer.getWidgetChild(var9, var4); // L: 474
				if (var5 != null && var4 != -1) { // L: 475
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1; // L: 476
					if (var2) { // L: 477
						MouseRecorder.field621 = var5;
					} else {
						Interpreter.field1122 = var5; // L: 478
					}
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0; // L: 480
				}

				return 1; // L: 481
			}
		}
	}
}
