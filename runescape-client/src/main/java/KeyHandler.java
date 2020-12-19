import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("KeyHandler_instance")
	static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cb")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ch")
	static int[] field408;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1299680861
	)
	static int field401;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -556224925
	)
	static int field410;
	@ObfuscatedName("cw")
	static char[] field409;
	@ObfuscatedName("cp")
	static int[] field412;
	@ObfuscatedName("cu")
	public static int[] field413;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -753956463
	)
	public static int field414;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 56497991
	)
	static int field415;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -688605193
	)
	static int field419;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1389632297
	)
	static int field417;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1798762127
	)
	@Export("KeyHandler_idleCycles")
	static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("cs")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -25501975
	)
	@Export("cameraY")
	static int cameraY;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field408 = new int[128]; // L: 103
		field401 = 0; // L: 104
		field410 = 0; // L: 105
		field409 = new char[128]; // L: 106
		field412 = new int[128]; // L: 107
		field413 = new int[128]; // L: 108
		field414 = 0; // L: 109
		field415 = 0; // L: 110
		field419 = 0; // L: 111
		field417 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 205
			int var2 = var1.getKeyCode(); // L: 206
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 207
				var2 = KeyHandler_keyCodes[var2]; // L: 208
				if ((var2 & 128) != 0) { // L: 209
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 211
			}

			if (field410 >= 0 && var2 >= 0) { // L: 212
				field408[field410] = var2; // L: 213
				field410 = field410 + 1 & 127; // L: 214
				if (field401 == field410) { // L: 215
					field410 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 217
				var3 = field419 + 1 & 127; // L: 218
				if (var3 != field415) { // L: 219
					field412[field419] = var2; // L: 220
					field409[field419] = 0; // L: 221
					field419 = var3; // L: 222
				}
			}

			var3 = var1.getModifiers(); // L: 225
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 226
				var1.consume(); // L: 227
			}
		}

	} // L: 230

	public final void focusGained(FocusEvent var1) {
	} // L: 261

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 264
			field410 = -1; // L: 265
		}

	} // L: 267

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 233
			int var2 = var1.getKeyCode(); // L: 234
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 235
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 236
			}

			if (field410 >= 0 && var2 >= 0) { // L: 237
				field408[field410] = ~var2; // L: 238
				field410 = field410 + 1 & 127; // L: 239
				if (field410 == field401) { // L: 240
					field410 = -1;
				}
			}
		}

		var1.consume(); // L: 243
	} // L: 244

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 247
			char var2 = var1.getKeyChar(); // L: 248
			if (var2 != 0 && var2 != '\uffff' && WorldMapData_0.method247(var2)) { // L: 249
				int var3 = field419 + 1 & 127; // L: 250
				if (var3 != field415) { // L: 251
					field412[field419] = -1; // L: 252
					field409[field419] = var2; // L: 253
					field419 = var3; // L: 254
				}
			}
		}

		var1.consume(); // L: 258
	} // L: 259

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I[BLlx;I)V",
		garbageValue = "-1114556828"
	)
	static void method872(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3178 == 0) { // L: 28
				SecureRandomFuture.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				SecureRandomFuture.ArchiveDiskActionHandler_thread.start(); // L: 31
				SecureRandomFuture.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3178 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class41.loadInterface(var0)) { // L: 8914
			class200.field2390 = null; // L: 8921
			FontName.drawInterface(class9.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 8922
			if (class200.field2390 != null) { // L: 8923
				FontName.drawInterface(class200.field2390, -1412584499, var1, var2, var3, var4, Client.field923, Entity.field1893, var7); // L: 8924
				class200.field2390 = null; // L: 8925
			}

		} else {
			if (var7 != -1) { // L: 8915
				Client.field901[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 8917
					Client.field901[var8] = true;
				}
			}

		}
	} // L: 8919 8927
}
