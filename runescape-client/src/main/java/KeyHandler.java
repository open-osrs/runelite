import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cb")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cg")
	public static boolean[] field264;
	@ObfuscatedName("ca")
	public static boolean[] field265;
	@ObfuscatedName("cy")
	public static int[] field283;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 2097317257
	)
	public static int field267;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1162064339
	)
	public static int field268;
	@ObfuscatedName("cs")
	static char[] field269;
	@ObfuscatedName("co")
	static int[] field270;
	@ObfuscatedName("cj")
	public static int[] field257;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1885523729
	)
	public static int field271;
	@ObfuscatedName("cl")
	public static int[] field273;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 227302155
	)
	public static int field274;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 490430437
	)
	public static int field276;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1780430541
	)
	public static int field255;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -35185769
	)
	public static int field277;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1652881761
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("db")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field264 = new boolean[112]; // L: 102
		field265 = new boolean[112]; // L: 103
		field283 = new int[128]; // L: 106
		field267 = 0; // L: 107
		field268 = 0; // L: 108
		field269 = new char[128]; // L: 109
		field270 = new int[128]; // L: 110
		field257 = new int[128];
		field271 = 0;
		field273 = new int[128];
		field274 = 0;
		field276 = 0;
		field255 = 0;
		field277 = 0;
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
				var2 = -1; // L: 183
			}

			if (field268 >= 0 && var2 >= 0) {
				field283[field268] = var2;
				field268 = field268 + 1 & 127;
				if (field268 == field267) {
					field268 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 189
				var3 = field255 + 1 & 127;
				if (var3 != field276) {
					field270[field255] = var2;
					field269[field255] = 0;
					field255 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	} // L: 202

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field268 >= 0 && var2 >= 0) { // L: 209
				field283[field268] = ~var2;
				field268 = field268 + 1 & 127;
				if (field268 == field267) {
					field268 = -1;
				}
			}
		}

		var1.consume(); // L: 215
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && ItemLayer.method3861(var2)) {
				int var3 = field255 + 1 & 127; // L: 222
				if (var3 != field276) {
					field270[field255] = -1;
					field269[field255] = var2;
					field255 = var3;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	} // L: 264

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 267
			field268 = -1; // L: 268
		}

	} // L: 270

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIILfv;Lfl;B)Z",
		garbageValue = "30"
	)
	public static final boolean method475(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 111
		int var6 = var1; // L: 112
		byte var7 = 64; // L: 113
		byte var8 = 64; // L: 114
		int var9 = var0 - var7; // L: 115
		int var10 = var1 - var8; // L: 116
		class160.directions[var7][var8] = 99; // L: 117
		class160.distances[var7][var8] = 0; // L: 118
		byte var11 = 0; // L: 119
		int var12 = 0; // L: 120
		class160.bufferX[var11] = var0; // L: 121
		int var20 = var11 + 1;
		class160.bufferY[var11] = var1; // L: 122
		int[][] var13 = var4.flags; // L: 123

		while (true) {
			label307:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label284:
							do {
								if (var20 == var12) { // L: 124
									Login.field1033 = var5; // L: 243
									GrandExchangeOfferOwnWorldComparator.field608 = var6; // L: 244
									return false; // L: 245
								}

								var5 = class160.bufferX[var12]; // L: 125
								var6 = class160.bufferY[var12]; // L: 126
								var12 = var12 + 1 & 4095; // L: 127
								var18 = var5 - var9; // L: 128
								var19 = var6 - var10; // L: 129
								var14 = var5 - var4.xInset; // L: 130
								var15 = var6 - var4.yInset; // L: 131
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 132
									Login.field1033 = var5; // L: 133
									GrandExchangeOfferOwnWorldComparator.field608 = var6; // L: 134
									return true; // L: 135
								}

								var16 = class160.distances[var18][var19] + 1; // L: 137
								if (var18 > 0 && class160.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 138 139 140 141
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5 - 1; // L: 145
											class160.bufferY[var20] = var6; // L: 146
											var20 = var20 + 1 & 4095; // L: 147
											class160.directions[var18 - 1][var19] = 2; // L: 148
											class160.distances[var18 - 1][var19] = var16; // L: 149
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) { // L: 143
											break;
										}

										++var17; // L: 142
									}
								}

								if (var18 < 128 - var2 && class160.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 151 152 153 154
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5 + 1; // L: 158
											class160.bufferY[var20] = var6; // L: 159
											var20 = var20 + 1 & 4095; // L: 160
											class160.directions[var18 + 1][var19] = 8; // L: 161
											class160.distances[var18 + 1][var19] = var16; // L: 162
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 156
											break;
										}

										++var17; // L: 155
									}
								}

								if (var19 > 0 && class160.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 164 165 166 167
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5; // L: 171
											class160.bufferY[var20] = var6 - 1; // L: 172
											var20 = var20 + 1 & 4095; // L: 173
											class160.directions[var18][var19 - 1] = 1; // L: 174
											class160.distances[var18][var19 - 1] = var16; // L: 175
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 169
											break;
										}

										++var17; // L: 168
									}
								}

								if (var19 < 128 - var2 && class160.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 177 178 179 180
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5; // L: 184
											class160.bufferY[var20] = var6 + 1; // L: 185
											var20 = var20 + 1 & 4095; // L: 186
											class160.directions[var18][var19 + 1] = 4; // L: 187
											class160.distances[var18][var19 + 1] = var16; // L: 188
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 182
											break;
										}

										++var17; // L: 181
									}
								}

								if (var18 > 0 && var19 > 0 && class160.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 190 191 192
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class160.bufferX[var20] = var5 - 1; // L: 197
											class160.bufferY[var20] = var6 - 1; // L: 198
											var20 = var20 + 1 & 4095; // L: 199
											class160.directions[var18 - 1][var19 - 1] = 3; // L: 200
											class160.distances[var18 - 1][var19 - 1] = var16; // L: 201
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 194 195
											break;
										}

										++var17; // L: 193
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class160.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 203 204 205
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class160.bufferX[var20] = var5 + 1; // L: 210
											class160.bufferY[var20] = var6 - 1; // L: 211
											var20 = var20 + 1 & 4095; // L: 212
											class160.directions[var18 + 1][var19 - 1] = 9; // L: 213
											class160.distances[var18 + 1][var19 - 1] = var16; // L: 214
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 207 208
											break;
										}

										++var17; // L: 206
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class160.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 216 217 218
									for (var17 = 1; var17 < var2; ++var17) { // L: 219
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 220 221
											continue label284;
										}
									}

									class160.bufferX[var20] = var5 - 1; // L: 223
									class160.bufferY[var20] = var6 + 1; // L: 224
									var20 = var20 + 1 & 4095; // L: 225
									class160.directions[var18 - 1][var19 + 1] = 6; // L: 226
									class160.distances[var18 - 1][var19 + 1] = var16; // L: 227
								}
							} while(var18 >= 128 - var2); // L: 229
						} while(var19 >= 128 - var2);
					} while(class160.directions[var18 + 1][var19 + 1] != 0); // L: 230
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 231

				for (var17 = 1; var17 < var2; ++var17) { // L: 232
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) { // L: 233 234
						continue label307;
					}
				}

				class160.bufferX[var20] = var5 + 1; // L: 236
				class160.bufferY[var20] = var6 + 1; // L: 237
				var20 = var20 + 1 & 4095; // L: 238
				class160.directions[var18 + 1][var19 + 1] = 12; // L: 239
				class160.distances[var18 + 1][var19 + 1] = var16; // L: 240
			}
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZLns;I)V",
		garbageValue = "-739552124"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5526
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5527
			var2 = var1.method6651(); // L: 5528
			int var3 = var1.readUnsignedShort(); // L: 5529
			var4 = var1.readUnsignedShort(); // L: 5530
			class7.xteaKeys = new int[var4][4]; // L: 5531

			for (var5 = 0; var5 < var4; ++var5) { // L: 5532
				for (var6 = 0; var6 < 4; ++var6) { // L: 5533
					class7.xteaKeys[var5][var6] = var1.readInt(); // L: 5534
				}
			}

			UserComparator4.regions = new int[var4]; // L: 5537
			UrlRequester.regionMapArchiveIds = new int[var4]; // L: 5538
			class286.regionLandArchiveIds = new int[var4]; // L: 5539
			UrlRequest.regionLandArchives = new byte[var4][]; // L: 5540
			WorldMapDecorationType.regionMapArchives = new byte[var4][]; // L: 5541
			boolean var16 = false; // L: 5542
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5543
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5544
				var16 = true;
			}

			var4 = 0; // L: 5545

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5546
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5547
					var8 = var7 + (var6 << 8); // L: 5548
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5549
						UserComparator4.regions[var4] = var8; // L: 5550
						UrlRequester.regionMapArchiveIds[var4] = class4.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5551
						class286.regionLandArchiveIds[var4] = class4.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5552
						++var4; // L: 5553
					}
				}
			}

			class265.method4984(var2, var3, true); // L: 5556
		} else {
			var2 = var1.method6651(); // L: 5559
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5560
			var4 = var1.method6651(); // L: 5561
			var5 = var1.readUnsignedShort(); // L: 5562
			var1.importIndex(); // L: 5563

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5564
				for (var7 = 0; var7 < 13; ++var7) { // L: 5565
					for (var8 = 0; var8 < 13; ++var8) { // L: 5566
						var9 = var1.readBits(1); // L: 5567
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5568
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5569
						}
					}
				}
			}

			var1.exportIndex(); // L: 5573
			class7.xteaKeys = new int[var5][4]; // L: 5574

			for (var6 = 0; var6 < var5; ++var6) { // L: 5575
				for (var7 = 0; var7 < 4; ++var7) { // L: 5576
					class7.xteaKeys[var6][var7] = var1.readInt(); // L: 5577
				}
			}

			UserComparator4.regions = new int[var5]; // L: 5580
			UrlRequester.regionMapArchiveIds = new int[var5]; // L: 5581
			class286.regionLandArchiveIds = new int[var5]; // L: 5582
			UrlRequest.regionLandArchives = new byte[var5][]; // L: 5583
			WorldMapDecorationType.regionMapArchives = new byte[var5][]; // L: 5584
			var5 = 0; // L: 5585

			for (var6 = 0; var6 < 4; ++var6) { // L: 5586
				for (var7 = 0; var7 < 13; ++var7) { // L: 5587
					for (var8 = 0; var8 < 13; ++var8) { // L: 5588
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5589
						if (var9 != -1) { // L: 5590
							int var10 = var9 >> 14 & 1023; // L: 5591
							int var11 = var9 >> 3 & 2047; // L: 5592
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5593

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5594
								if (UserComparator4.regions[var13] == var12) {
									var12 = -1; // L: 5595
									break; // L: 5596
								}
							}

							if (var12 != -1) { // L: 5598
								UserComparator4.regions[var5] = var12; // L: 5599
								var13 = var12 >> 8 & 255; // L: 5600
								int var14 = var12 & 255; // L: 5601
								UrlRequester.regionMapArchiveIds[var5] = class4.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5602
								class286.regionLandArchiveIds[var5] = class4.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5603
								++var5; // L: 5604
							}
						}
					}
				}
			}

			class265.method4984(var4, var2, !var15); // L: 5610
		}

	} // L: 5612
}
