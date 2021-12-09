import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("s")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("co")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cc")
	public static boolean[] field132;
	@ObfuscatedName("cs")
	public static boolean[] field130;
	@ObfuscatedName("cj")
	public static int[] field134;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -30228915
	)
	public static int field135;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1719312863
	)
	public static int field120;
	@ObfuscatedName("cw")
	static char[] field137;
	@ObfuscatedName("ct")
	static int[] field131;
	@ObfuscatedName("ci")
	public static int[] field139;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -341769643
	)
	public static int field140;
	@ObfuscatedName("cq")
	public static int[] field141;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 307265495
	)
	public static int field142;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -834396131
	)
	public static int field143;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 601711547
	)
	public static int field144;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1247090595
	)
	public static int field145;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 589740013
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dr")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static Archive field151;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field132 = new boolean[112]; // L: 102
		field130 = new boolean[112]; // L: 103
		field134 = new int[128]; // L: 106
		field135 = 0; // L: 107
		field120 = 0; // L: 108
		field137 = new char[128]; // L: 109
		field131 = new int[128]; // L: 110
		field139 = new int[128]; // L: 111
		field140 = 0; // L: 112
		field141 = new int[128]; // L: 113
		field142 = 0; // L: 114
		field143 = 0; // L: 115
		field144 = 0; // L: 116
		field145 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 179
			int var2 = var1.getKeyCode(); // L: 180
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 181
				var2 = KeyHandler_keyCodes[var2]; // L: 182
				if ((var2 & 128) != 0) { // L: 183
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 185
			}

			if (field120 >= 0 && var2 >= 0) { // L: 186
				field134[field120] = var2; // L: 187
				field120 = field120 + 1 & 127; // L: 188
				if (field135 == field120) { // L: 189
					field120 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 191
				var3 = field144 + 1 & 127; // L: 192
				if (var3 != field143) { // L: 193
					field131[field144] = var2; // L: 194
					field137[field144] = 0; // L: 195
					field144 = var3; // L: 196
				}
			}

			var3 = var1.getModifiers(); // L: 199
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 200
				var1.consume(); // L: 201
			}
		}

	} // L: 204

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 207
			int var2 = var1.getKeyCode(); // L: 208
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 209
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 210
			}

			if (field120 >= 0 && var2 >= 0) { // L: 211
				field134[field120] = ~var2; // L: 212
				field120 = field120 + 1 & 127; // L: 213
				if (field135 == field120) { // L: 214
					field120 = -1;
				}
			}
		}

		var1.consume(); // L: 217
	} // L: 218

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 221
			char var2 = var1.getKeyChar(); // L: 222
			if (var2 != 0 && var2 != '\uffff' && class136.method2842(var2)) { // L: 223
				int var3 = field144 + 1 & 127; // L: 224
				if (var3 != field143) { // L: 225
					field131[field144] = -1; // L: 226
					field137[field144] = var2; // L: 227
					field144 = var3; // L: 228
				}
			}
		}

		var1.consume(); // L: 232
	} // L: 233

	public final void focusGained(FocusEvent var1) {
	} // L: 266

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 269
			field120 = -1; // L: 270
		}

	} // L: 272

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "1763095521"
	)
	public static void method390(String[] var0, short[] var1) {
		Projectile.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "51"
	)
	static final int method367(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 488
		var2 ^= var2 << 13; // L: 489
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 490
		return var3 >> 19 & 255; // L: 491
	}
}
