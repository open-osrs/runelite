import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "Lib;"
	)
	static StudioGame field54;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ls;Ls;B)I",
		garbageValue = "-1"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1613064985"
	)
	static int method137(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize]);
				return 1;
			} else {
				--WorldMapEvent.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				UrlRequester.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				var4.parent = WorldMapLabelSize.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.field2744 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--UrlRequester.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						UrlRequester.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]};
						PendingSpawn.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						UrlRequester.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							WorldMapRectangle.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						WorldMapRectangle.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--UrlRequester.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							FontName.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						FontName.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						UrlRequester.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + UrlRequester.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UrlRequester.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UrlRequester.Interpreter_intStackSize + 1];
							}
						}
					} else {
						UrlRequester.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						PendingSpawn.Widget_setKey(var4, var7, var8, var9);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
