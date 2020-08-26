import java.io.IOException;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bj")
	public static String field2988;
	@ObfuscatedName("cx")
	public static String field2936;
	@ObfuscatedName("jv")
	public static String field3067;
	@ObfuscatedName("ji")
	public static String field3015;
	@ObfuscatedName("jb")
	public static String field3069;

	static {
		field2988 = "Please visit the support page for assistance."; // L: 60
		field2936 = "Please visit the support page for assistance."; // L: 99
		field3067 = ""; // L: 275
		field3015 = "Page has opened in a new window."; // L: 276
		field3069 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	static void method4202() {
		if (Login.clearLoginScreen) { // L: 226
			class296.titleboxSprite = null; // L: 227
			ModelData0.titlebuttonSprite = null; // L: 228
			GrandExchangeOfferTotalQuantityComparator.runesSprite = null; // L: 229
			UserComparator2.leftTitleSprite = null; // L: 230
			Login.rightTitleSprite = null; // L: 231
			AbstractByteArrayCopier.logoSprite = null; // L: 232
			ClientPreferences.title_muteSprite = null; // L: 233
			class227.options_buttons_0Sprite = null; // L: 234
			MusicPatchNode2.options_buttons_2Sprite = null; // L: 235
			MidiPcmStream.worldSelectBackSprites = null; // L: 236
			AbstractWorldMapIcon.worldSelectFlagSprites = null; // L: 237
			MusicPatchNode.worldSelectArrows = null; // L: 238
			Login.worldSelectStars = null; // L: 239
			class7.field36 = null; // L: 240
			Varcs.loginScreenRunesAnimation.method1904(); // L: 241
			class58.method915(2); // L: 242
			if (NetCache.NetCache_socket != null) { // L: 244
				try {
					Buffer var0 = new Buffer(4); // L: 246
					var0.writeByte(2); // L: 247
					var0.writeMedium(0); // L: 248
					NetCache.NetCache_socket.write(var0.array, 0, 4); // L: 249
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close(); // L: 253
					} catch (Exception var2) { // L: 255
					}

					++NetCache.NetCache_ioExceptions; // L: 256
					NetCache.NetCache_socket = null; // L: 257
				}
			}

			Login.clearLoginScreen = false; // L: 260
		}
	} // L: 261
}
