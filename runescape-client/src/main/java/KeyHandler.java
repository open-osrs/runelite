import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 138807253
	)
	static int field140;
	@ObfuscatedName("cu")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cl")
	public static boolean[] field121;
	@ObfuscatedName("cv")
	public static boolean[] field125;
	@ObfuscatedName("cg")
	public static int[] field129;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1330451443
	)
	public static int field138;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 542360451
	)
	public static int field124;
	@ObfuscatedName("cq")
	static char[] field115;
	@ObfuscatedName("cf")
	static int[] field130;
	@ObfuscatedName("cm")
	public static int[] field139;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 480717521
	)
	public static int field132;
	@ObfuscatedName("cj")
	public static int[] field133;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1701924001
	)
	public static int field134;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1014391871
	)
	public static int field135;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1239653249
	)
	public static int field136;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -463917317
	)
	public static int field137;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -958068693
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("de")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field121 = new boolean[112]; // L: 102
		field125 = new boolean[112]; // L: 103
		field129 = new int[128]; // L: 106
		field138 = 0; // L: 107
		field124 = 0; // L: 108
		field115 = new char[128]; // L: 109
		field130 = new int[128]; // L: 110
		field139 = new int[128]; // L: 111
		field132 = 0; // L: 112
		field133 = new int[128]; // L: 113
		field134 = 0; // L: 114
		field135 = 0; // L: 115
		field136 = 0; // L: 116
		field137 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 258
			field124 = -1; // L: 259
		}

	} // L: 261

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 186
			char var2 = var1.getKeyChar(); // L: 187
			if (var2 != 0 && var2 != '\uffff') { // L: 188
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 191
					var3 = true; // L: 192
				} else {
					label57: {
						if (var2 != 0) { // L: 195
							char[] var4 = class345.cp1252AsciiExtension; // L: 197

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 198
								char var6 = var4[var5]; // L: 199
								if (var6 == var2) { // L: 201
									var3 = true; // L: 202
									break label57;
								}
							}
						}

						var3 = false; // L: 209
					}
				}

				if (var3) { // L: 211
					int var7 = field136 + 1 & 127; // L: 212
					if (var7 != field135) { // L: 213
						field130[field136] = -1; // L: 214
						field115[field136] = var2; // L: 215
						field136 = var7; // L: 216
					}
				}
			}
		}

		var1.consume(); // L: 221
	} // L: 222

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 172
			int var2 = var1.getKeyCode(); // L: 173
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 174
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 175
			}

			if (field124 >= 0 && var2 >= 0) { // L: 176
				field129[field124] = ~var2; // L: 177
				field124 = field124 + 1 & 127; // L: 178
				if (field124 == field138) { // L: 179
					field124 = -1;
				}
			}
		}

		var1.consume(); // L: 182
	} // L: 183

	public final void focusGained(FocusEvent var1) {
	} // L: 255

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 144
			int var2 = var1.getKeyCode(); // L: 145
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 146
				var2 = KeyHandler_keyCodes[var2]; // L: 147
				if ((var2 & 128) != 0) { // L: 148
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 150
			}

			if (field124 >= 0 && var2 >= 0) { // L: 151
				field129[field124] = var2; // L: 152
				field124 = field124 + 1 & 127; // L: 153
				if (field124 == field138) { // L: 154
					field124 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 156
				var3 = field136 + 1 & 127; // L: 157
				if (var3 != field135) { // L: 158
					field130[field136] = var2; // L: 159
					field115[field136] = 0; // L: 160
					field136 = var3; // L: 161
				}
			}

			var3 = var1.getModifiers(); // L: 164
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 165
				var1.consume(); // L: 166
			}
		}

	} // L: 169

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1076431446"
	)
	static void method377(int var0) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "1727286765"
	)
	public static class386 method378() {
		synchronized(class386.field4342) { // L: 28
			if (class386.field4336 == 0) { // L: 29
				return new class386();
			} else {
				class386.field4342[--class386.field4336].method7033(); // L: 31
				return class386.field4342[class386.field4336]; // L: 32
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117472619"
	)
	public static boolean method376() {
		return class273.musicPlayerStatus != 0 ? true : WorldMapEvent.midiPcmStream.isReady(); // L: 36 37
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lcw;III)V",
		garbageValue = "840635869"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 3897
			int var3 = ItemContainer.SequenceDefinition_get(var1).field2172; // L: 3898
			if (var3 == 1) { // L: 3899
				var0.sequenceFrame = 0; // L: 3900
				var0.sequenceFrameCycle = 0; // L: 3901
				var0.sequenceDelay = var2; // L: 3902
				var0.field1169 = 0; // L: 3903
			}

			if (var3 == 2) { // L: 3905
				var0.field1169 = 0; // L: 3906
			}
		} else if (var1 == -1 || var0.sequence == -1 || ItemContainer.SequenceDefinition_get(var1).field2166 >= ItemContainer.SequenceDefinition_get(var0.sequence).field2166) { // L: 3909
			var0.sequence = var1; // L: 3910
			var0.sequenceFrame = 0; // L: 3911
			var0.sequenceFrameCycle = 0; // L: 3912
			var0.sequenceDelay = var2; // L: 3913
			var0.field1169 = 0; // L: 3914
			var0.field1134 = var0.pathLength; // L: 3915
		}

	} // L: 3917
}
