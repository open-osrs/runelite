import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class230 {
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("z")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljd;",
		garbageValue = "-327946270"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3127, ServerPacket.field3025, ServerPacket.field3026, ServerPacket.field3078, ServerPacket.field3028, ServerPacket.field3029, ServerPacket.field3060, ServerPacket.field3031, ServerPacket.field3058, ServerPacket.field3033, ServerPacket.field3034, ServerPacket.field3129, ServerPacket.field3036, ServerPacket.field3037, ServerPacket.field3038, ServerPacket.field3039, ServerPacket.field3040, ServerPacket.field3082, ServerPacket.field3042, ServerPacket.field3043, ServerPacket.field3044, ServerPacket.field3080, ServerPacket.field3046, ServerPacket.field3052, ServerPacket.field3104, ServerPacket.field3049, ServerPacket.field3050, ServerPacket.field3122, ServerPacket.field3102, ServerPacket.field3053, ServerPacket.field3054, ServerPacket.field3055, ServerPacket.field3041, ServerPacket.field3057, ServerPacket.field3110, ServerPacket.field3089, ServerPacket.field3093, ServerPacket.field3061, ServerPacket.field3062, ServerPacket.field3032, ServerPacket.field3064, ServerPacket.field3065, ServerPacket.field3066, ServerPacket.field3067, ServerPacket.field3068, ServerPacket.field3069, ServerPacket.field3098, ServerPacket.field3071, ServerPacket.field3072, ServerPacket.field3073, ServerPacket.field3074, ServerPacket.field3075, ServerPacket.field3076, ServerPacket.field3077, ServerPacket.field3116, ServerPacket.field3079, ServerPacket.field3047, ServerPacket.field3081, ServerPacket.field3024, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.field3085, ServerPacket.field3051, ServerPacket.field3087, ServerPacket.field3088, ServerPacket.field3070, ServerPacket.field3117, ServerPacket.field3091, ServerPacket.field3092, ServerPacket.field3048, ServerPacket.field3094, ServerPacket.field3095, ServerPacket.field3096, ServerPacket.field3035, ServerPacket.field3114, ServerPacket.field3099, ServerPacket.field3030, ServerPacket.field3101, ServerPacket.field3124, ServerPacket.field3103, ServerPacket.field3126, ServerPacket.field3105, ServerPacket.field3106, ServerPacket.field3107, ServerPacket.field3108, ServerPacket.field3027, ServerPacket.field3045, ServerPacket.field3111, ServerPacket.field3112, ServerPacket.field3113, ServerPacket.field3125, ServerPacket.field3115, ServerPacket.field3100, ServerPacket.field3097, ServerPacket.field3118, ServerPacket.field3119, ServerPacket.field3120, ServerPacket.field3121, ServerPacket.field3059, ServerPacket.field3123, ServerPacket.field3086, ServerPacket.field3063, ServerPacket.field3109, ServerPacket.field3090}; // L: 113
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "82"
	)
	static void method4894(boolean var0) {
		byte var1 = 0; // L: 1288
		boolean var2 = Interpreter.clientPreferences.method2268() >= Client.field484; // L: 1291
		if (!var2) { // L: 1293
			var1 = 12; // L: 1294
		} else if (UserComparator10.client.method1138() || UserComparator10.client.method1139()) { // L: 1296
			var1 = 10; // L: 1297
		}

		class150.method3089(var1); // L: 1299
		if (var0) { // L: 1300
			Login.Login_username = ""; // L: 1301
			Login.Login_password = ""; // L: 1302
			UrlRequest.field1346 = 0; // L: 1303
			class452.otp = ""; // L: 1304
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1307
			if (Interpreter.clientPreferences.method2273() != null) { // L: 1308
				Login.Login_username = Interpreter.clientPreferences.method2273(); // L: 1309
				Client.Login_isUsernameRemembered = true; // L: 1310
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1312
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1315
			Login.currentLoginField = 1; // L: 1316
		} else {
			Login.currentLoginField = 0; // L: 1319
		}

	} // L: 1322

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1546407580"
	)
	static final boolean method4890() {
		return Client.isMenuOpen; // L: 8028
	}
}
