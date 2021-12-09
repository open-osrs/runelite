import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jj")
public class class273 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-9"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-2100883024"
	)
	static int method5332(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 480
			IsaacCipher.Interpreter_intStackSize -= 3; // L: 481
			var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 482
			var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 483
			int var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 484
			if (var4 == 0) { // L: 485
				throw new RuntimeException(); // L: 486
			} else {
				Widget var6 = ChatChannel.getWidget(var9); // L: 488
				if (var6.children == null) { // L: 489
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 490
					Widget[] var7 = new Widget[var11 + 1]; // L: 491

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 492
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 493
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 495
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 496
					var12.type = var4; // L: 497
					var12.parentId = var12.id = var6.id; // L: 498
					var12.childIndex = var11; // L: 499
					var12.isIf3 = true; // L: 500
					var6.children[var11] = var12; // L: 501
					if (var2) { // L: 502
						WorldMapArea.scriptDotWidget = var12;
					} else {
						Messages.scriptActiveWidget = var12; // L: 503
					}

					SecureRandomCallable.invalidateWidget(var6); // L: 504
					return 1; // L: 505
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 507
				var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 508
				Widget var10 = ChatChannel.getWidget(var3.id); // L: 509
				var10.children[var3.childIndex] = null; // L: 510
				SecureRandomCallable.invalidateWidget(var10); // L: 511
				return 1; // L: 512
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 514
				var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 515
				var3.children = null; // L: 516
				SecureRandomCallable.invalidateWidget(var3); // L: 517
				return 1; // L: 518
			} else if (var0 == 103) { // L: 520
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 521
				return 1; // L: 522
			} else if (var0 == 104) { // L: 524
				--IsaacCipher.Interpreter_intStackSize; // L: 525
				return 1; // L: 526
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 528
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 541
					var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 542
					if (var3 != null) { // L: 543
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 544
						if (var2) { // L: 545
							WorldMapArea.scriptDotWidget = var3;
						} else {
							Messages.scriptActiveWidget = var3; // L: 546
						}
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 548
					}

					return 1; // L: 549
				} else if (var0 == 202) { // L: 551
					Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] = 0; // L: 552
					return 1; // L: 553
				} else if (var0 == 203) { // L: 555
					Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize + 1] = 0; // L: 556
					return 1; // L: 557
				} else {
					return 2; // L: 559
				}
			} else {
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 529
				var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 530
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 531
				Widget var5 = class126.getWidgetChild(var9, var4); // L: 532
				if (var5 != null && var4 != -1) { // L: 533
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 534
					if (var2) { // L: 535
						WorldMapArea.scriptDotWidget = var5;
					} else {
						Messages.scriptActiveWidget = var5; // L: 536
					}
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 538
				}

				return 1; // L: 539
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-11359"
	)
	public static void method5333(int var0) {
		if (var0 != -1) { // L: 240
			if (Widget.Widget_loadedInterfaces[var0]) { // L: 241
				CollisionMap.Widget_archive.clearFilesGroup(var0); // L: 242
				if (MouseRecorder.Widget_interfaceComponents[var0] != null) { // L: 243
					boolean var1 = true; // L: 244

					for (int var2 = 0; var2 < MouseRecorder.Widget_interfaceComponents[var0].length; ++var2) { // L: 245
						if (MouseRecorder.Widget_interfaceComponents[var0][var2] != null) { // L: 246
							if (MouseRecorder.Widget_interfaceComponents[var0][var2].type != 2) { // L: 247
								MouseRecorder.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 248
							}
						}
					}

					if (var1) {
						MouseRecorder.Widget_interfaceComponents[var0] = null; // L: 251
					}

					Widget.Widget_loadedInterfaces[var0] = false; // L: 252
				}
			}
		}
	} // L: 253
}
