import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cn")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cq")
	static int[] field257;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 414508597
	)
	static int field258;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1317034497
	)
	static int field259;
	@ObfuscatedName("cb")
	static char[] field252;
	@ObfuscatedName("cv")
	static int[] field256;
	@ObfuscatedName("cj")
	public static int[] field262;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 298211417
	)
	public static int field263;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1511679855
	)
	static int field264;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 531816263
	)
	static int field265;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 357930861
	)
	static int field271;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -515618943
	)
	@Export("KeyHandler_idleCycles")
	static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("ci")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field257 = new int[128]; // L: 103
		field258 = 0; // L: 104
		field259 = 0; // L: 105
		field252 = new char[128]; // L: 106
		field256 = new int[128]; // L: 107
		field262 = new int[128]; // L: 108
		field263 = 0; // L: 109
		field264 = 0; // L: 110
		field265 = 0; // L: 111
		field271 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 233
			char var2 = var1.getKeyChar(); // L: 234
			if (var2 != 0 && var2 != '\uffff') { // L: 235
				boolean var3;
				if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 238
					label53: {
						if (var2 != 0) { // L: 242
							char[] var4 = class300.cp1252AsciiExtension; // L: 244

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 245
								char var6 = var4[var5]; // L: 246
								if (var2 == var6) { // L: 248
									var3 = true; // L: 249
									break label53;
								}
							}
						}

						var3 = false; // L: 256
					}
				} else {
					var3 = true; // L: 239
				}

				if (var3) { // L: 258
					int var7 = field265 + 1 & 127; // L: 259
					if (var7 != field264) { // L: 260
						field256[field265] = -1; // L: 261
						field252[field265] = var2; // L: 262
						field265 = var7; // L: 263
					}
				}
			}
		}

		var1.consume(); // L: 268
	} // L: 269

	public final void focusGained(FocusEvent var1) {
	} // L: 271

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 274
			field259 = -1; // L: 275
		}

	} // L: 277

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 191
			int var2 = var1.getKeyCode(); // L: 192
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 193
				var2 = KeyHandler_keyCodes[var2]; // L: 194
				if ((var2 & 128) != 0) { // L: 195
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 197
			}

			if (field259 >= 0 && var2 >= 0) { // L: 198
				field257[field259] = var2; // L: 199
				field259 = field259 + 1 & 127; // L: 200
				if (field258 == field259) { // L: 201
					field259 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 203
				var3 = field265 + 1 & 127; // L: 204
				if (var3 != field264) { // L: 205
					field256[field265] = var2; // L: 206
					field252[field265] = 0; // L: 207
					field265 = var3; // L: 208
				}
			}

			var3 = var1.getModifiers(); // L: 211
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 212
				var1.consume(); // L: 213
			}
		}

	} // L: 216

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 219
			int var2 = var1.getKeyCode(); // L: 220
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 221
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 222
			}

			if (field259 >= 0 && var2 >= 0) { // L: 223
				field257[field259] = ~var2; // L: 224
				field259 = field259 + 1 & 127; // L: 225
				if (field258 == field259) { // L: 226
					field259 = -1;
				}
			}
		}

		var1.consume(); // L: 229
	} // L: 230

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "703180001"
	)
	static final void method462(String var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher); // L: 250
		var2.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 251
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 252
		var2.packetBuffer.method6606(var1); // L: 253
		Client.packetWriter.addNode(var2); // L: 254
	} // L: 255

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lhu;III)V",
		garbageValue = "388736615"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10016
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10017
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10018
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10019
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10020
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10021
		}

		if (var0.yAlignment == 0) { // L: 10022
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10023
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10024
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10025
		} else if (var0.yAlignment == 4) { // L: 10026
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10027
		}

	} // L: 10028
}
