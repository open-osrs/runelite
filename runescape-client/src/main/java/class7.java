import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class7 {
	@ObfuscatedName("v")
	ExecutorService field20;
	@ObfuscatedName("c")
	Future field18;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final Buffer field19;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class3 field17;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lf;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor(); // L: 10
		this.field19 = var1;
		this.field17 = var2;
		this.method42(); // L: 18
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-254090586"
	)
	public boolean method43() {
		return this.field18.isDone();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	public void method47() {
		this.field20.shutdown(); // L: 26
		this.field20 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-2056850231"
	)
	public Buffer method45() {
		try {
			return (Buffer)this.field18.get();
		} catch (Exception var2) { // L: 34
			return null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method42() {
		this.field18 = this.field20.submit(new class1(this, this.field19, this.field17)); // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "6"
	)
	static int method53(int var0, int var1) {
		FloorOverlayDefinition var2 = Clock.method3349(var0); // L: 15
		if (var2 == null) { // L: 16
			return var1; // L: 17
		} else if (var2.secondaryRgb >= 0) { // L: 19
			return var2.secondaryRgb | -16777216; // L: 20
		} else {
			int var3;
			int var4;
			byte var5;
			int var7;
			if (var2.texture >= 0) { // L: 22
				var4 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture); // L: 24
				var5 = 96; // L: 25
				if (var4 == -2) { // L: 27
					var3 = 12345678; // L: 28
				} else if (var4 == -1) { // L: 31
					if (var5 < 0) { // L: 32
						var5 = 0; // L: 33
					} else if (var5 > 127) { // L: 35
						var5 = 127; // L: 36
					}

					var7 = 127 - var5; // L: 38
					var3 = var7; // L: 39
				} else {
					var7 = var5 * (var4 & 127) / 128; // L: 42
					if (var7 < 2) {
						var7 = 2; // L: 43
					} else if (var7 > 126) { // L: 44
						var7 = 126;
					}

					var3 = var7 + (var4 & 65408); // L: 45
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216; // L: 48
			} else if (var2.primaryRgb == 16711935) { // L: 50
				return var1; // L: 51
			} else {
				var3 = FontName.method7415(var2.hue, var2.saturation, var2.lightness); // L: 54
				var5 = 96; // L: 56
				if (var3 == -2) { // L: 58
					var4 = 12345678; // L: 59
				} else if (var3 == -1) { // L: 62
					if (var5 < 0) { // L: 63
						var5 = 0; // L: 64
					} else if (var5 > 127) { // L: 66
						var5 = 127; // L: 67
					}

					var7 = 127 - var5; // L: 69
					var4 = var7; // L: 70
				} else {
					var7 = var5 * (var3 & 127) / 128; // L: 73
					if (var7 < 2) { // L: 74
						var7 = 2;
					} else if (var7 > 126) { // L: 75
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408); // L: 76
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216; // L: 79
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "17269568"
	)
	static int method54(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 561
		Widget var4;
		if (var0 >= 2000) { // L: 563
			var0 -= 1000; // L: 564
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 565
			var4 = class127.getWidget(var3); // L: 566
		} else {
			var4 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 568
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 569
			Interpreter.Interpreter_intStackSize -= 4; // L: 570
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 571
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 572
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 573
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 574
			class346.invalidateWidget(var4); // L: 575
			class127.client.alignWidget(var4); // L: 576
			if (var3 != -1 && var4.type == 0) { // L: 577
				AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 578
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 580
			Interpreter.Interpreter_intStackSize -= 4; // L: 581
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 582
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 583
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 584
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 585
			class346.invalidateWidget(var4); // L: 586
			class127.client.alignWidget(var4); // L: 587
			if (var3 != -1 && var4.type == 0) { // L: 588
				AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 589
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 591
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 592
			if (var5 != var4.isHidden) { // L: 593
				var4.isHidden = var5; // L: 594
				class346.invalidateWidget(var4); // L: 595
			}

			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 599
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 600
			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 603
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 604
			return 1; // L: 605
		} else {
			return 2; // L: 607
		}
	}
}
