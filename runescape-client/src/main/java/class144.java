import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public abstract class class144 extends Node {
	@ObfuscatedName("o")
	public static short[][] field1629;

	class144() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "23"
	)
	abstract void vmethod3152(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1764669808"
	)
	abstract void vmethod3153(ClanChannel var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;ZIB)V",
		garbageValue = "64"
	)
	static void method3080(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 159
			if (var3 == 4) { // L: 160
				Ignored.method6828(4); // L: 161
			}

		} else {
			if (var3 == 0) { // L: 165
				class348.method6505(var2); // L: 166
			} else {
				Ignored.method6828(var3); // L: 169
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 171
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 172
			class17.leftTitleSprite = Interpreter.method1889(var4); // L: 173
			ViewportMouse.rightTitleSprite = class17.leftTitleSprite.mirrorHorizontally(); // L: 174
			class260.method5174(var1, Client.worldProperties); // L: 175
			Login.titleboxSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 176
			Login.titlebuttonSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 177
			class296.field3496 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 178
			class259.field2887 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 179
			AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 180
			Login.runesSprite = class93.method2386(var1, "runes", ""); // L: 181
			class92.title_muteSprite = class93.method2386(var1, "title_mute", ""); // L: 182
			WorldMapSection2.options_buttons_0Sprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 183
			class93.field1254 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 184
			class54.options_buttons_2Sprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 185
			ParamComposition.field1983 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 186
			AbstractSocket.field4275 = WorldMapSection2.options_buttons_0Sprite.subWidth; // L: 187
			Occluder.field2687 = WorldMapSection2.options_buttons_0Sprite.subHeight; // L: 188
			class341.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 189
			if (var2) { // L: 190
				Login.Login_username = ""; // L: 191
				Login.Login_password = ""; // L: 192
				Login.field904 = new String[8]; // L: 193
				Login.field903 = 0; // L: 194
			}

			WorldMapID.field2386 = 0; // L: 196
			HealthBar.otp = ""; // L: 197
			Login.field907 = true; // L: 198
			Login.worldSelectOpen = false; // L: 199
			if (!class131.clientPreferences.method2279()) { // L: 200
				Archive var5 = class16.archive6; // L: 201
				int var6 = var5.getGroupId("scape main"); // L: 203
				int var7 = var5.getFileId(var6, ""); // L: 204
				NPCComposition.method3530(2, var5, var6, var7, 255, false); // L: 205
			} else {
				Actor.method2183(2); // L: 208
			}

			if (NetCache.NetCache_socket != null) { // L: 210
				try {
					Buffer var11 = new Buffer(4); // L: 212
					var11.writeByte(3); // L: 213
					var11.writeMedium(0); // L: 214
					NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 215
				} catch (IOException var10) {
					try {
						NetCache.NetCache_socket.close(); // L: 219
					} catch (Exception var9) { // L: 221
					}

					++NetCache.NetCache_ioExceptions; // L: 222
					NetCache.NetCache_socket = null; // L: 223
				}
			}

			Login.clearLoginScreen = true; // L: 226
			Login.xPadding = (InvDefinition.canvasWidth - 765) / 2; // L: 227
			Login.loginBoxX = Login.xPadding + 202; // L: 228
			HealthBarDefinition.loginBoxCenter = Login.loginBoxX + 180; // L: 229
			class17.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 230
			ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 231
			Decimator.logoSprite.drawAt(Login.xPadding + 382 - Decimator.logoSprite.subWidth / 2, 18); // L: 232
		}
	} // L: 163 233

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-9"
	)
	public static int method3081(int var0) {
		return class400.field4391[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "18"
	)
	public static int method3082(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
