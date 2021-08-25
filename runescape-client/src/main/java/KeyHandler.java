import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("p")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -1730622273
	)
	static int field123;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 1247297477
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 8198013874257616023L
	)
	public static long field149;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static ClanChannel field146;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -807799673
	)
	static int field145;
	@ObfuscatedName("ch")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cx")
	public static boolean[] field124;
	@ObfuscatedName("cv")
	public static boolean[] field125;
	@ObfuscatedName("ck")
	public static int[] field126;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1362910477
	)
	public static int field143;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 193922977
	)
	public static int field128;
	@ObfuscatedName("cp")
	static char[] field129;
	@ObfuscatedName("cg")
	static int[] field130;
	@ObfuscatedName("cd")
	public static int[] field131;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1398164847
	)
	public static int field114;
	@ObfuscatedName("ca")
	public static int[] field139;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -565313275
	)
	public static int field132;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 168789529
	)
	public static int field135;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1063392473
	)
	public static int field136;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -869083273
	)
	public static int field137;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -514998399
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dk")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field124 = new boolean[112];
		field125 = new boolean[112];
		field126 = new int[128];
		field143 = 0;
		field128 = 0;
		field129 = new char[128];
		field130 = new int[128];
		field131 = new int[128];
		field114 = 0;
		field139 = new int[128];
		field132 = 0;
		field135 = 0;
		field136 = 0;
		field137 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff') {
				boolean var3;
				if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
					label54: {
						if (var2 != 0) {
							char[] var4 = class316.cp1252AsciiExtension;

							for (int var5 = 0; var5 < var4.length; ++var5) {
								char var6 = var4[var5];
								if (var6 == var2) {
									var3 = true;
									break label54;
								}
							}
						}

						var3 = false;
					}
				} else {
					var3 = true;
				}

				if (var3) {
					int var7 = field136 + 1 & 127;
					if (var7 != field135) {
						field130[field136] = -1;
						field129[field136] = var2;
						field136 = var7;
					}
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field128 = -1;
		}

	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field128 >= 0 && var2 >= 0) {
				field126[field128] = var2;
				field128 = field128 + 1 & 127;
				if (field143 == field128) {
					field128 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field136 + 1 & 127;
				if (var3 != field135) {
					field130[field136] = var2;
					field129[field136] = 0;
					field136 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field128 >= 0 && var2 >= 0) {
				field126[field128] = ~var2;
				field128 = field128 + 1 & 127;
				if (field128 == field143) {
					field128 = -1;
				}
			}
		}

		var1.consume();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZS)I",
		garbageValue = "27134"
	)
	static int method360(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class12.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ReflectionCheck.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = VarbitComposition.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class240.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					class240.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--class240.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					Interpreter.Interpreter_stringStackSize -= 2;
					--class240.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--Interpreter.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					VarbitComposition.clientPreferences.windowMode = var3;
					DevicePcmPlayerProvider.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2089553027"
	)
	static final void method337(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method4087(var17, var18, var19);
			Rasterizer3D.method4061(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4087(var17, var19, var20);
			Rasterizer3D.method4061(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
