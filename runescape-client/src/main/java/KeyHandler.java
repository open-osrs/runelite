import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("e")
	static int[] field145;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -906031261
	)
	static int field142;
	@ObfuscatedName("cr")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cq")
	public static boolean[] field128;
	@ObfuscatedName("cs")
	public static boolean[] field129;
	@ObfuscatedName("cz")
	public static int[] field130;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1372251093
	)
	public static int field144;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1181141701
	)
	public static int field123;
	@ObfuscatedName("cn")
	static char[] field133;
	@ObfuscatedName("cf")
	static int[] field134;
	@ObfuscatedName("ch")
	public static int[] field135;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 613092295
	)
	public static int field136;
	@ObfuscatedName("cj")
	public static int[] field137;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1951942129
	)
	public static int field140;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -764636131
	)
	public static int field139;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1860624425
	)
	public static int field127;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 245979357
	)
	public static int field126;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -825263243
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dx")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field128 = new boolean[112];
		field129 = new boolean[112];
		field130 = new int[128];
		field144 = 0;
		field123 = 0;
		field133 = new char[128];
		field134 = new int[128];
		field135 = new int[128];
		field136 = 0;
		field137 = new int[128];
		field140 = 0;
		field139 = 0;
		field127 = 0;
		field126 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
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

			if (field123 >= 0 && var2 >= 0) {
				field130[field123] = var2;
				field123 = field123 + 1 & 127;
				if (field144 == field123) {
					field123 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field127 + 1 & 127;
				if (var3 != field139) {
					field134[field127] = var2;
					field133[field127] = 0;
					field127 = var3;
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

			if (field123 >= 0 && var2 >= 0) {
				field130[field123] = ~var2;
				field123 = field123 + 1 & 127;
				if (field123 == field144) {
					field123 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field123 = -1;
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff') {
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
					var3 = true;
				} else {
					label57: {
						if (var2 != 0) {
							char[] var4 = class316.cp1252AsciiExtension;

							for (int var5 = 0; var5 < var4.length; ++var5) {
								char var6 = var4[var5];
								if (var2 == var6) {
									var3 = true;
									break label57;
								}
							}
						}

						var3 = false;
					}
				}

				if (var3) {
					int var7 = field127 + 1 & 127;
					if (var7 != field139) {
						field134[field127] = -1;
						field133[field127] = var2;
						field127 = var7;
					}
				}
			}
		}

		var1.consume();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;Lnz;I)Lnz;",
		garbageValue = "2091535432"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = InvDefinition.method2881(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1992278741"
	)
	public static void method364() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1392114279"
	)
	public static boolean method336(int var0) {
		return (var0 >> 31 & 1) != 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-2636"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "980972475"
	)
	public static void method349() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
