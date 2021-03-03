import java.applet.Applet;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("ph")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	static Bounds field409;
	@ObfuscatedName("cr")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cs")
	public static int[] field407;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -65232469
	)
	public static int field416;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1002446749
	)
	public static int field417;
	@ObfuscatedName("ci")
	static char[] field422;
	@ObfuscatedName("cy")
	static int[] field428;
	@ObfuscatedName("cm")
	public static int[] field420;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1646570973
	)
	public static int field421;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1868848877
	)
	public static int field418;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 284809291
	)
	public static int field423;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1588472735
	)
	public static int field424;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1023513531
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("cl")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1023846245
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1825492875
	)
	@Export("selectedItemId")
	static int selectedItemId;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field407 = new int[128]; // L: 103
		field416 = 0; // L: 104
		field417 = 0; // L: 105
		field422 = new char[128]; // L: 106
		field428 = new int[128]; // L: 107
		field420 = new int[128]; // L: 108
		field421 = 0; // L: 109
		field418 = 0; // L: 110
		field423 = 0; // L: 111
		field424 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 137
				var2 = KeyHandler_keyCodes[var2]; // L: 138
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field417 >= 0 && var2 >= 0) {
				field407[field417] = var2;
				field417 = field417 + 1 & 127; // L: 144
				if (field417 == field416) { // L: 145
					field417 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field423 + 1 & 127;
				if (var3 != field418) {
					field428[field423] = var2; // L: 150
					field422[field423] = 0; // L: 151
					field423 = var3;
				}
			}

			var3 = var1.getModifiers(); // L: 155
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume(); // L: 157
			}
		}

	} // L: 160

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 165
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 166
			}

			if (field417 >= 0 && var2 >= 0) {
				field407[field417] = ~var2; // L: 168
				field417 = field417 + 1 & 127; // L: 169
				if (field417 == field416) {
					field417 = -1;
				}
			}
		}

		var1.consume(); // L: 173
	} // L: 174

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 177
			char var2 = var1.getKeyChar(); // L: 178
			if (var2 != 0 && var2 != '\uffff' && FaceNormal.method3421(var2)) { // L: 179
				int var3 = field423 + 1 & 127; // L: 180
				if (var3 != field418) { // L: 181
					field428[field423] = -1; // L: 182
					field422[field423] = var2; // L: 183
					field423 = var3; // L: 184
				}
			}
		}

		var1.consume(); // L: 188
	} // L: 189

	public final void focusGained(FocusEvent var1) {
	} // L: 191

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 194
			field417 = -1; // L: 195
		}

	} // L: 197

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1009251772"
	)
	public static void method912(Applet var0, String var1) {
		class60.applet = var0; // L: 22
		if (var1 != null) { // L: 23
			class60.field454 = var1;
		}

	} // L: 24

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IIIIIII)V",
		garbageValue = "-1349171106"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 130
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 131

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 133
				if (var7 == 0) { // L: 134
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -ArchiveLoader.method1237(var2 + 932731 + var4, var5 + 556238 + var3) * 8; // L: 135
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 136
					}
					break;
				}

				if (var7 == 1) { // L: 139
					int var8 = var0.readUnsignedByte(); // L: 140
					if (var8 == 1) { // L: 141
						var8 = 0;
					}

					if (var1 == 0) { // L: 142
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 143
					}
					break;
				}

				if (var7 <= 49) { // L: 146
					class200.field2399[var1][var2][var3] = var0.readByte(); // L: 147
					Tiles.field530[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 148
					class1.field1[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 149
				} else if (var7 <= 81) { // L: 152
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 153
				} else {
					Tiles.field517[var1][var2][var3] = (byte)(var7 - 81); // L: 156
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 161
				if (var7 == 0) { // L: 162
					break;
				}

				if (var7 == 1) { // L: 163
					var0.readUnsignedByte(); // L: 164
					break;
				}

				if (var7 <= 49) { // L: 167
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 170

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146586711"
	)
	public static void method913() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 216
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 217
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 218
	} // L: 219

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "534090329"
	)
	static final void method911() {
		Client.field858 = Client.cycleCntr; // L: 11445
		ClanChat_inClanChat = true; // L: 11446
	} // L: 11447
}
