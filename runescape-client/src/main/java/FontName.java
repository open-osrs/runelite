import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nx")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("t")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "1133097003"
	)
	static int method6619(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var3 = HealthBarUpdate.getWidget(var4);
		} else {
			var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			class16.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 5];
			class16.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class16.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class16.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				class16.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					TaskHandler.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				Decimator.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				FillMode var6 = (FillMode)class128.findEnumerated(class125.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class16.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					var3.field3081 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
