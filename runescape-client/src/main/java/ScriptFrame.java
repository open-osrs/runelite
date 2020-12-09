import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bk")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1247485995
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 555040569
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("x")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("w")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "259452362"
	)
	static int method1213(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
				return 1;
			} else {
				--Interpreter.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				VarcInt.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				var4.parent = class92.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--VarcInt.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						VarcInt.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]};
						ItemContainer.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						VarcInt.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							Player.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						Player.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--VarcInt.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							GrandExchangeOfferUnitPriceComparator.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						GrandExchangeOfferUnitPriceComparator.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						VarcInt.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + VarcInt.Interpreter_intStackSize + 1];
							}
						}
					} else {
						VarcInt.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ItemContainer.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
