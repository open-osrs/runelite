import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class121 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1714829299
	)
	static int field1412;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -501523109
	)
	int field1416;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -22670281
	)
	int field1413;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 826571971
	)
	int field1414;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1587777273
	)
	int field1415;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class121(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1416 = var1.readInt();
		this.field1415 = var1.readInt();
		this.field1413 = var1.readUnsignedByte();
		this.field1414 = var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2598(this.field1416, this.field1415, this.field1413, this.field1414);
	}

	@ObfuscatedName("l")
	public static final void method2542(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "1097941230"
	)
	static int method2541(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = HealthBarUpdate.getWidget(var3);
		} else {
			var4 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			class16.invalidateWidget(var4);
			class21.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			class16.invalidateWidget(var4);
			class21.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class16.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
