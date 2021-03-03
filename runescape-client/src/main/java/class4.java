import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
final class class4 implements class0 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkx;B)V",
		garbageValue = "-41"
	)
	public void vmethod48(Object var1, Buffer var2) {
		this.method54((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)Ljava/lang/Object;",
		garbageValue = "1678106953"
	)
	public Object vmethod45(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkx;I)V",
		garbageValue = "-768475899"
	)
	void method54(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-21"
	)
	static final void method55(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					TaskHandler.field2045[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)Lcl;",
		garbageValue = "836178308"
	)
	static Script method46(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 59
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0); // L: 63
			int var4 = WorldMapSection0.archive12.getGroupId(var3); // L: 64
			if (var4 == -1) { // L: 65
				return null; // L: 66
			} else {
				byte[] var5 = WorldMapSection0.archive12.takeFileFlat(var4); // L: 68
				if (var5 != null) { // L: 69
					if (var5.length <= 1) { // L: 70
						return null; // L: 71
					}

					var2 = GameObject.newScript(var5); // L: 73
					if (var2 != null) { // L: 74
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 75
						return var2; // L: 76
					}
				}

				return null; // L: 79
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-989634997"
	)
	public static boolean method56() {
		return class206.musicPlayerStatus != 0 ? true : VertexNormal.midiPcmStream.isReady(); // L: 60 61
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "856520106"
	)
	static int method53(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 500
		Widget var4;
		if (var0 >= 2000) { // L: 502
			var0 -= 1000; // L: 503
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 504
			var4 = class237.getWidget(var3); // L: 505
		} else {
			var4 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 507
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 508
			Interpreter.Interpreter_intStackSize -= 4; // L: 509
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 510
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 511
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 512
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 513
			IsaacCipher.invalidateWidget(var4); // L: 514
			class1.client.alignWidget(var4); // L: 515
			if (var3 != -1 && var4.type == 0) { // L: 516
				class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 517
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 519
			Interpreter.Interpreter_intStackSize -= 4; // L: 520
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 521
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 522
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 523
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 524
			IsaacCipher.invalidateWidget(var4); // L: 525
			class1.client.alignWidget(var4); // L: 526
			if (var3 != -1 && var4.type == 0) { // L: 527
				class182.revalidateWidgetScroll(DefaultsGroup.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 528
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 530
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 531
			if (var5 != var4.isHidden) { // L: 532
				var4.isHidden = var5; // L: 533
				IsaacCipher.invalidateWidget(var4); // L: 534
			}

			return 1; // L: 536
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 538
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 539
			return 1; // L: 540
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 542
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 543
			return 1; // L: 544
		} else {
			return 2; // L: 546
		}
	}
}
