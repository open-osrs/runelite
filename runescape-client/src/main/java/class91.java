import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
public class class91 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "21"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 52
				} catch (Exception var4) { // L: 34
				}
			}

			if (class29.field158.startsWith("win")) { // L: 36
				Message.method1143(var0, 0); // L: 38
			} else if (class29.field158.startsWith("mac")) { // L: 42
				Occluder.method4485(var0, 1, "openjs"); // L: 43
			} else {
				Message.method1143(var0, 2); // L: 46
			}
		} else {
			Message.method1143(var0, 3); // L: 49
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lbw;",
		garbageValue = "-50"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? WorldMapEvent.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1496971599"
	)
	static int method2271(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3536
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class134.getWindowedMode(); // L: 3537
			return 1; // L: 3538
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3540
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3541
				if (var3 == 1 || var3 == 2) { // L: 3542
					HorizontalAlignment.setWindowedMode(var3);
				}

				return 1; // L: 3543
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3545
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.windowMode; // L: 3546
				return 1; // L: 3547
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3549
				if (var0 == 5310) { // L: 3557
					--class14.Interpreter_intStackSize; // L: 3558
					return 1; // L: 3559
				} else if (var0 == 5311) { // L: 3561
					class14.Interpreter_intStackSize -= 2; // L: 3562
					return 1; // L: 3563
				} else if (var0 == 5312) { // L: 3565
					--class14.Interpreter_intStackSize; // L: 3566
					return 1; // L: 3567
				} else if (var0 == 5350) { // L: 3569
					class295.Interpreter_stringStackSize -= 2; // L: 3570
					--class14.Interpreter_intStackSize; // L: 3571
					return 1; // L: 3572
				} else if (var0 == 5351) { // L: 3574
					--class295.Interpreter_stringStackSize; // L: 3575
					return 1; // L: 3576
				} else {
					return 2; // L: 3578
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3550
				if (var3 == 1 || var3 == 2) { // L: 3551
					class408.clientPreferences.windowMode = var3; // L: 3552
					Login.savePreferences(); // L: 3553
				}

				return 1; // L: 3555
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1813589022"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4639
			byte var2 = 4; // L: 4640
			int var3 = var2 + 6; // L: 4641
			int var4 = var2 + 6; // L: 4642
			int var5 = class6.fontPlain12.lineWidth(var0, 250); // L: 4643
			int var6 = class6.fontPlain12.lineCount(var0, 250) * 13; // L: 4644
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0); // L: 4645
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215); // L: 4646
			class6.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4647
			int var7 = var3 - var2; // L: 4648
			int var8 = var4 - var2; // L: 4649
			int var9 = var2 + var5 + var2; // L: 4650
			int var10 = var2 + var2 + var6; // L: 4651

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4653
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4654
					Client.field594[var11] = true;
				}
			}

			if (var1) { // L: 4657
				Canvas.rasterProvider.drawFull(0, 0); // L: 4658
			} else {
				Language.method5516(var3, var4, var5, var6); // L: 4661
			}

		}
	} // L: 4663
}
