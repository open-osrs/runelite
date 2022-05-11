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
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("cn")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cc")
	public static boolean[] field120;
	@ObfuscatedName("cy")
	public static boolean[] field132;
	@ObfuscatedName("cw")
	public static int[] field133;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 389412323
	)
	public static int field150;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1808601055
	)
	public static int field135;
	@ObfuscatedName("cg")
	static char[] field136;
	@ObfuscatedName("cl")
	static int[] field122;
	@ObfuscatedName("cu")
	public static int[] field138;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 897973963
	)
	public static int field139;
	@ObfuscatedName("cz")
	public static int[] field140;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1147676417
	)
	public static int field134;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1995078643
	)
	public static int field142;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1414175135
	)
	public static int field143;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1395793263
	)
	public static int field144;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -2030198205
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dp")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1725658923
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field120 = new boolean[112]; // L: 102
		field132 = new boolean[112]; // L: 103
		field133 = new int[128]; // L: 106
		field150 = 0; // L: 107
		field135 = 0; // L: 108
		field136 = new char[128]; // L: 109
		field122 = new int[128]; // L: 110
		field138 = new int[128]; // L: 111
		field139 = 0; // L: 112
		field140 = new int[128]; // L: 113
		field134 = 0; // L: 114
		field142 = 0; // L: 115
		field143 = 0; // L: 116
		field144 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 188
			char var2 = var1.getKeyChar(); // L: 189
			if (var2 != 0 && var2 != '\uffff') { // L: 190
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) { // L: 193
					var3 = true; // L: 194
				} else {
					label58: {
						if (var2 != 0) { // L: 197
							char[] var4 = class341.cp1252AsciiExtension; // L: 199

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 200
								char var6 = var4[var5]; // L: 201
								if (var6 == var2) { // L: 203
									var3 = true; // L: 204
									break label58;
								}
							}
						}

						var3 = false; // L: 211
					}
				}

				if (var3) { // L: 213
					int var7 = field143 + 1 & 127; // L: 214
					if (var7 != field142) { // L: 215
						field122[field143] = -1; // L: 216
						field136[field143] = var2; // L: 217
						field143 = var7; // L: 218
					}
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	} // L: 257

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 260
			field135 = -1; // L: 261
		}

	} // L: 263

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 146
			int var2 = var1.getKeyCode(); // L: 147
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 148
				var2 = KeyHandler_keyCodes[var2]; // L: 149
				if ((var2 & 128) != 0) { // L: 150
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 152
			}

			if (field135 >= 0 && var2 >= 0) { // L: 153
				field133[field135] = var2; // L: 154
				field135 = field135 + 1 & 127; // L: 155
				if (field135 == field150) { // L: 156
					field135 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 158
				var3 = field143 + 1 & 127; // L: 159
				if (var3 != field142) { // L: 160
					field122[field143] = var2; // L: 161
					field136[field143] = 0; // L: 162
					field143 = var3; // L: 163
				}
			}

			var3 = var1.getModifiers(); // L: 166
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 167
				var1.consume(); // L: 168
			}
		}

	} // L: 171

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 174
			int var2 = var1.getKeyCode(); // L: 175
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 176
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 177
			}

			if (field135 >= 0 && var2 >= 0) { // L: 178
				field133[field135] = ~var2; // L: 179
				field135 = field135 + 1 & 127; // L: 180
				if (field150 == field135) { // L: 181
					field135 = -1;
				}
			}
		}

		var1.consume(); // L: 184
	} // L: 185

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-1"
	)
	static int method329(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 427
			return SoundSystem.method777(var0, var1, var2);
		} else if (var0 < 1100) { // L: 428
			return GrandExchangeOfferNameComparator.method5782(var0, var1, var2);
		} else if (var0 < 1200) { // L: 429
			return WorldMapAreaData.method4887(var0, var1, var2);
		} else if (var0 < 1300) { // L: 430
			return Interpreter.method1793(var0, var1, var2);
		} else if (var0 < 1400) { // L: 431
			return Calendar.method5349(var0, var1, var2);
		} else if (var0 < 1500) { // L: 432
			return Player.method2157(var0, var1, var2);
		} else if (var0 < 1600) { // L: 433
			return FriendsList.method6454(var0, var1, var2);
		} else if (var0 < 1700) { // L: 434
			return class138.method2880(var0, var1, var2);
		} else if (var0 < 1800) { // L: 435
			return class270.method5036(var0, var1, var2);
		} else if (var0 < 1900) { // L: 436
			return ArchiveLoader.method2041(var0, var1, var2);
		} else if (var0 < 2000) { // L: 437
			return FaceNormal.method4212(var0, var1, var2);
		} else if (var0 < 2100) { // L: 438
			return GrandExchangeOfferNameComparator.method5782(var0, var1, var2);
		} else if (var0 < 2200) { // L: 439
			return WorldMapAreaData.method4887(var0, var1, var2);
		} else if (var0 < 2300) { // L: 440
			return Interpreter.method1793(var0, var1, var2);
		} else if (var0 < 2400) { // L: 441
			return Calendar.method5349(var0, var1, var2);
		} else if (var0 < 2500) {
			return Player.method2157(var0, var1, var2); // L: 442
		} else if (var0 < 2600) { // L: 443
			return Tile.method3903(var0, var1, var2);
		} else if (var0 < 2700) { // L: 444
			return WorldMapDecoration.method4804(var0, var1, var2);
		} else if (var0 < 2800) { // L: 445
			return VerticalAlignment.method3447(var0, var1, var2);
		} else if (var0 < 2900) { // L: 446
			return class282.method5334(var0, var1, var2);
		} else if (var0 < 3000) { // L: 447
			return FaceNormal.method4212(var0, var1, var2);
		} else if (var0 < 3200) { // L: 448
			return DynamicObject.method1963(var0, var1, var2);
		} else if (var0 < 3300) { // L: 449
			return class137.method2873(var0, var1, var2);
		} else if (var0 < 3400) { // L: 450
			return class155.method3124(var0, var1, var2);
		} else if (var0 < 3500) { // L: 451
			return class309.method5600(var0, var1, var2);
		} else if (var0 < 3600) { // L: 452
			return ArchiveLoader.method2045(var0, var1, var2);
		} else if (var0 < 3700) { // L: 453
			return class305.method5591(var0, var1, var2);
		} else if (var0 < 3800) { // L: 454
			return class182.method3473(var0, var1, var2);
		} else if (var0 < 3900) { // L: 455
			return Language.method5884(var0, var1, var2);
		} else if (var0 < 4000) { // L: 456
			return Tiles.method2030(var0, var1, var2);
		} else if (var0 < 4100) { // L: 457
			return class302.method5584(var0, var1, var2);
		} else if (var0 < 4200) {
			return class267.method5027(var0, var1, var2); // L: 458
		} else if (var0 < 4300) { // L: 459
			return GrandExchangeOfferOwnWorldComparator.method1120(var0, var1, var2);
		} else if (var0 < 5100) { // L: 460
			return FontName.method7231(var0, var1, var2);
		} else if (var0 < 5400) { // L: 461
			return VertexNormal.method4377(var0, var1, var2);
		} else if (var0 < 5600) { // L: 462
			return Archive.method5623(var0, var1, var2);
		} else if (var0 < 5700) { // L: 463
			return class290.method5389(var0, var1, var2);
		} else if (var0 < 6300) { // L: 464
			return Client.method1240(var0, var1, var2);
		} else if (var0 < 6600) { // L: 465
			return class33.method592(var0, var1, var2);
		} else if (var0 < 6700) { // L: 466
			return class326.method5868(var0, var1, var2);
		} else if (var0 < 6800) { // L: 467
			return class6.method47(var0, var1, var2);
		} else if (var0 < 6900) { // L: 468
			return DevicePcmPlayerProvider.method335(var0, var1, var2);
		} else if (var0 < 7000) { // L: 469
			return ReflectionCheck.method598(var0, var1, var2);
		} else if (var0 < 7100) { // L: 470
			return TextureProvider.method4246(var0, var1, var2);
		} else if (var0 < 7200) { // L: 471
			return Tile.method3902(var0, var1, var2);
		} else if (var0 < 7300) { // L: 472
			return class182.method3472(var0, var1, var2);
		} else {
			return var0 < 7500 ? MusicPatch.method5277(var0, var1, var2) : 2; // L: 473 474
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbx;Lbx;IZI)I",
		garbageValue = "-380169429"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 221
			int var4 = var0.population; // L: 222
			int var5 = var1.population; // L: 223
			if (!var3) { // L: 224
				if (var4 == -1) { // L: 225
					var4 = 2001;
				}

				if (var5 == -1) { // L: 226
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 228
		} else if (var2 == 2) { // L: 230
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 231
			if (var0.activity.equals("-")) { // L: 232
				if (var1.activity.equals("-")) { // L: 233
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 234
				}
			} else if (var1.activity.equals("-")) { // L: 236
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 237
			}
		} else if (var2 == 4) { // L: 239
			return var0.method1644() ? (var1.method1644() ? 0 : 1) : (var1.method1644() ? -1 : 0);
		} else if (var2 == 5) { // L: 240
			return var0.method1615() ? (var1.method1615() ? 0 : 1) : (var1.method1615() ? -1 : 0);
		} else if (var2 == 6) { // L: 241
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 242
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 243
		}
	}
}
