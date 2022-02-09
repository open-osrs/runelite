import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cs")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cl")
	public static boolean[] field131;
	@ObfuscatedName("ck")
	public static boolean[] field138;
	@ObfuscatedName("cr")
	public static int[] field133;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -48583837
	)
	public static int field145;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 79077775
	)
	public static int field148;
	@ObfuscatedName("ci")
	static char[] field136;
	@ObfuscatedName("ct")
	static int[] field132;
	@ObfuscatedName("ca")
	public static int[] field135;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1602435519
	)
	public static int field139;
	@ObfuscatedName("cz")
	public static int[] field125;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1015802681
	)
	public static int field141;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 2029736161
	)
	public static int field140;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1860741199
	)
	public static int field146;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -253542341
	)
	public static int field144;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 653575701
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("de")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field131 = new boolean[112]; // L: 102
		field138 = new boolean[112]; // L: 103
		field133 = new int[128]; // L: 106
		field145 = 0; // L: 107
		field148 = 0; // L: 108
		field136 = new char[128]; // L: 109
		field132 = new int[128]; // L: 110
		field135 = new int[128]; // L: 111
		field139 = 0; // L: 112
		field125 = new int[128]; // L: 113
		field141 = 0; // L: 114
		field140 = 0; // L: 115
		field146 = 0; // L: 116
		field144 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 203
			int var2 = var1.getKeyCode(); // L: 204
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 205
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 206
			}

			if (field148 >= 0 && var2 >= 0) { // L: 207
				field133[field148] = ~var2; // L: 208
				field148 = field148 + 1 & 127; // L: 209
				if (field145 == field148) { // L: 210
					field148 = -1;
				}
			}
		}

		var1.consume(); // L: 213
	} // L: 214

	public final void focusGained(FocusEvent var1) {
	} // L: 286

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 217
			char var2 = var1.getKeyChar(); // L: 218
			if (var2 != 0 && var2 != '\uffff') { // L: 219
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 222
					var3 = true; // L: 223
				} else {
					label58: {
						if (var2 != 0) { // L: 226
							char[] var4 = class333.cp1252AsciiExtension; // L: 228

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 229
								char var6 = var4[var5]; // L: 230
								if (var6 == var2) { // L: 232
									var3 = true; // L: 233
									break label58;
								}
							}
						}

						var3 = false; // L: 240
					}
				}

				if (var3) { // L: 242
					int var7 = field146 + 1 & 127; // L: 243
					if (var7 != field140) { // L: 244
						field132[field146] = -1; // L: 245
						field136[field146] = var2; // L: 246
						field146 = var7; // L: 247
					}
				}
			}
		}

		var1.consume(); // L: 252
	} // L: 253

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 289
			field148 = -1; // L: 290
		}

	} // L: 292

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 175
			int var2 = var1.getKeyCode(); // L: 176
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 177
				var2 = KeyHandler_keyCodes[var2]; // L: 178
				if ((var2 & 128) != 0) { // L: 179
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 181
			}

			if (field148 >= 0 && var2 >= 0) { // L: 182
				field133[field148] = var2; // L: 183
				field148 = field148 + 1 & 127; // L: 184
				if (field148 == field145) { // L: 185
					field148 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 187
				var3 = field146 + 1 & 127; // L: 188
				if (var3 != field140) { // L: 189
					field132[field146] = var2; // L: 190
					field136[field146] = 0; // L: 191
					field146 = var3; // L: 192
				}
			}

			var3 = var1.getModifiers(); // L: 195
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 196
				var1.consume(); // L: 197
			}
		}

	} // L: 200

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-730157037"
	)
	public static void method353() {
		class33.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfo;",
		garbageValue = "-1430977988"
	)
	static VerticalAlignment[] method322() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1886, VerticalAlignment.field1887}; // L: 14
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1298635805"
	)
	public static byte[] method332() {
		byte[] var0 = new byte[24]; // L: 308

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 310
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 311

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 312 313 314
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 316
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 319
				var0[var2] = -1;
			}
		}

		return var0; // L: 321
	}

	@ObfuscatedName("r")
	public static int method355(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 68
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "84"
	)
	static boolean method324() {
		return Client.tapToDrop || KeyHandler_pressedKeys[81]; // L: 10719
	}
}
