import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cp")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cf")
	public static boolean[] field136;
	@ObfuscatedName("cv")
	public static boolean[] field141;
	@ObfuscatedName("cz")
	public static int[] field138;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1987409485
	)
	public static int field139;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -21544437
	)
	public static int field140;
	@ObfuscatedName("cy")
	static char[] field149;
	@ObfuscatedName("ca")
	static int[] field148;
	@ObfuscatedName("ck")
	public static int[] field134;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2113543409
	)
	public static int field144;
	@ObfuscatedName("cs")
	public static int[] field142;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 245483503
	)
	public static int field146;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1050842761
	)
	public static int field147;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1124751465
	)
	public static int field143;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1769782215
	)
	public static int field127;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -504992793
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dd")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field136 = new boolean[112]; // L: 102
		field141 = new boolean[112]; // L: 103
		field138 = new int[128]; // L: 106
		field139 = 0; // L: 107
		field140 = 0; // L: 108
		field149 = new char[128]; // L: 109
		field148 = new int[128]; // L: 110
		field134 = new int[128]; // L: 111
		field144 = 0; // L: 112
		field142 = new int[128]; // L: 113
		field146 = 0; // L: 114
		field147 = 0; // L: 115
		field143 = 0; // L: 116
		field127 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 185
			int var2 = var1.getKeyCode(); // L: 186
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 187
				var2 = KeyHandler_keyCodes[var2]; // L: 188
				if ((var2 & 128) != 0) { // L: 189
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 191
			}

			if (field140 >= 0 && var2 >= 0) { // L: 192
				field138[field140] = var2; // L: 193
				field140 = field140 + 1 & 127; // L: 194
				if (field139 == field140) { // L: 195
					field140 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 197
				var3 = field143 + 1 & 127; // L: 198
				if (var3 != field147) { // L: 199
					field148[field143] = var2; // L: 200
					field149[field143] = 0; // L: 201
					field143 = var3; // L: 202
				}
			}

			var3 = var1.getModifiers(); // L: 205
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 206
				var1.consume(); // L: 207
			}
		}

	} // L: 210

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 213
			int var2 = var1.getKeyCode(); // L: 214
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 215
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 216
			}

			if (field140 >= 0 && var2 >= 0) { // L: 217
				field138[field140] = ~var2; // L: 218
				field140 = field140 + 1 & 127; // L: 219
				if (field140 == field139) { // L: 220
					field140 = -1;
				}
			}
		}

		var1.consume(); // L: 223
	} // L: 224

	public final void focusGained(FocusEvent var1) {
	} // L: 272

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 275
			field140 = -1;
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 227
			char var2 = var1.getKeyChar(); // L: 228
			if (var2 != 0 && var2 != '\uffff' && MusicPatchNode2.method5243(var2)) { // L: 229
				int var3 = field143 + 1 & 127; // L: 230
				if (var3 != field147) { // L: 231
					field148[field143] = -1; // L: 232
					field149[field143] = var2; // L: 233
					field143 = var3; // L: 234
				}
			}
		}

		var1.consume(); // L: 238
	} // L: 239

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-82055101"
	)
	static void method286() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 276
			if (class19.clientPreferences.method2264() != null) { // L: 277
				Login.Login_username = class19.clientPreferences.method2264(); // L: 278
				Client.Login_isUsernameRemembered = true; // L: 279
			} else {
				Client.Login_isUsernameRemembered = false; // L: 281
			}

		}
	} // L: 282

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1053414301"
	)
	public static int method302(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 85 86 89
			var2 = var2 << 1 | var0 & 1; // L: 87
			var0 >>>= 1; // L: 88
		}

		return var2; // L: 91
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "50"
	)
	static final void method300(int var0, int var1) {
		if (var0 < 128) { // L: 3970
			var0 = 128;
		}

		if (var0 > 383) { // L: 3971
			var0 = 383;
		}

		if (ViewportMouse.cameraPitch < var0) { // L: 3972
			ViewportMouse.cameraPitch = (var0 - ViewportMouse.cameraPitch) * MidiPcmStream.field3231 / 1000 + ViewportMouse.cameraPitch + GameBuild.field3588; // L: 3973
			if (ViewportMouse.cameraPitch > var0) { // L: 3974
				ViewportMouse.cameraPitch = var0;
			}
		}

		if (ViewportMouse.cameraPitch > var0) { // L: 3976
			ViewportMouse.cameraPitch -= (ViewportMouse.cameraPitch - var0) * MidiPcmStream.field3231 / 1000 + GameBuild.field3588; // L: 3977
			if (ViewportMouse.cameraPitch < var0) { // L: 3978
				ViewportMouse.cameraPitch = var0;
			}
		}

		int var2 = var1 - SoundCache.cameraYaw; // L: 3980
		if (var2 > 1024) {
			var2 -= 2048; // L: 3981
		}

		if (var2 < -1024) { // L: 3982
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3983
			SoundCache.cameraYaw = var2 * MidiPcmStream.field3231 / 1000 + SoundCache.cameraYaw + GameBuild.field3588; // L: 3984
			SoundCache.cameraYaw &= 2047; // L: 3985
		}

		if (var2 < 0) { // L: 3987
			SoundCache.cameraYaw -= -var2 * MidiPcmStream.field3231 / 1000 + GameBuild.field3588; // L: 3988
			SoundCache.cameraYaw &= 2047; // L: 3989
		}

		int var3 = var1 - SoundCache.cameraYaw; // L: 3991
		if (var3 > 1024) { // L: 3992
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3993
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3994
			SoundCache.cameraYaw = var1;
		}

	} // L: 3995

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1730640649"
	)
	static final void method301(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 5477
		if (var8 < 0) { // L: 5478
			var8 = 0;
		} else if (var8 > 100) { // L: 5479
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 5480
		int var7 = var5 * var9 / 256; // L: 5481
		var8 = 2048 - var3 & 2047; // L: 5484
		var9 = 2048 - var4 & 2047; // L: 5485
		int var10 = 0; // L: 5486
		int var11 = 0; // L: 5487
		int var12 = var7; // L: 5488
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 5489
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5490
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5491
			var15 = var11 * var14 - var13 * var7 >> 16; // L: 5492
			var12 = var14 * var7 + var11 * var13 >> 16; // L: 5493
			var11 = var15; // L: 5494
		}

		if (var9 != 0) { // L: 5496
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 5497
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 5498
			var15 = var12 * var13 + var14 * var10 >> 16; // L: 5499
			var12 = var12 * var14 - var10 * var13 >> 16; // L: 5500
			var10 = var15; // L: 5501
		}

		if (Client.isCameraLocked) { // L: 5503
			Interpreter.field846 = var0 - var10; // L: 5504
			WorldMapManager.field2743 = var1 - var11; // L: 5505
			BoundaryObject.field2622 = var2 - var12; // L: 5506
			Decimator.field402 = var3; // L: 5507
			class390.field4423 = var4; // L: 5508
		} else {
			class18.cameraX = var0 - var10; // L: 5511
			class16.cameraY = var1 - var11; // L: 5512
			class228.cameraZ = var2 - var12; // L: 5513
			ViewportMouse.cameraPitch = var3; // L: 5514
			SoundCache.cameraYaw = var4; // L: 5515
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (InterfaceParent.oculusOrbFocalPointX >> 7 != class101.localPlayer.x >> 7 || class141.oculusOrbFocalPointY >> 7 != class101.localPlayer.y >> 7)) { // L: 5517 5518
			var13 = class101.localPlayer.plane; // L: 5519
			var14 = (InterfaceParent.oculusOrbFocalPointX >> 7) + class28.baseX; // L: 5520
			var15 = (class141.oculusOrbFocalPointY >> 7) + WorldMapLabelSize.baseY; // L: 5521
			PacketBufferNode var16 = EnumComposition.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 5524
			var16.packetBuffer.method7763(var13); // L: 5525
			var16.packetBuffer.writeIntME(var15); // L: 5526
			var16.packetBuffer.method7760(Client.field635); // L: 5527
			var16.packetBuffer.writeIntME(var14); // L: 5528
			Client.packetWriter.addNode(var16); // L: 5529
		}

	} // L: 5533
}
