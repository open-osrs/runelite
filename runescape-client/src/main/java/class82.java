import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public enum class82 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	field1055(0, -1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	field1053(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	field1059(2, 7),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	field1057(3, 8),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	field1056(4, 9);

	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1351015755
	)
	final int field1054;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -520596277
	)
	final int field1058;

	class82(int var3, int var4) {
		this.field1054 = var3;
		this.field1058 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1058;
	}

	@ObfuscatedName("v")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class349.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljq;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3033, ServerPacket.field3053, ServerPacket.field3096, ServerPacket.field3026, ServerPacket.field3038, ServerPacket.field3028, ServerPacket.field3025, ServerPacket.field3030, ServerPacket.field3031, ServerPacket.field3027, ServerPacket.field3072, ServerPacket.field3116, ServerPacket.field3035, ServerPacket.field3036, ServerPacket.field3037, ServerPacket.field3128, ServerPacket.field3114, ServerPacket.field3111, ServerPacket.field3041, ServerPacket.field3042, ServerPacket.field3097, ServerPacket.field3044, ServerPacket.field3086, ServerPacket.field3047, ServerPacket.field3119, ServerPacket.field3048, ServerPacket.field3049, ServerPacket.field3050, ServerPacket.field3034, ServerPacket.field3052, ServerPacket.field3029, ServerPacket.field3023, ServerPacket.field3024, ServerPacket.field3056, ServerPacket.field3057, ServerPacket.field3058, ServerPacket.field3045, ServerPacket.field3060, ServerPacket.field3054, ServerPacket.field3062, ServerPacket.field3063, ServerPacket.field3064, ServerPacket.field3101, ServerPacket.field3066, ServerPacket.field3067, ServerPacket.field3068, ServerPacket.field3105, ServerPacket.field3070, ServerPacket.field3071, ServerPacket.field3120, ServerPacket.field3073, ServerPacket.field3079, ServerPacket.field3043, ServerPacket.field3076, ServerPacket.field3077, ServerPacket.field3078, ServerPacket.field3069, ServerPacket.field3080, ServerPacket.field3081, ServerPacket.field3115, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.field3085, ServerPacket.field3061, ServerPacket.field3087, ServerPacket.field3046, ServerPacket.field3089, ServerPacket.field3090, ServerPacket.field3091, ServerPacket.field3092, ServerPacket.field3093, ServerPacket.field3094, ServerPacket.field3051, ServerPacket.field3095, ServerPacket.field3032, ServerPacket.field3040, ServerPacket.field3099, ServerPacket.field3100, ServerPacket.field3074, ServerPacket.field3102, ServerPacket.field3088, ServerPacket.field3103, ServerPacket.field3075, ServerPacket.field3106, ServerPacket.field3107, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.field3110, ServerPacket.field3055, ServerPacket.field3112, ServerPacket.field3113, ServerPacket.field3039, ServerPacket.field3059, ServerPacket.field3104, ServerPacket.field3117, ServerPacket.field3118, ServerPacket.field3082, ServerPacket.field3098, ServerPacket.field3121, ServerPacket.field3122, ServerPacket.field3123, ServerPacket.field3124, ServerPacket.field3125, ServerPacket.field3126}; // L: 113
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "54"
	)
	public static int method2102(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 85
		return (var0 + var2) / var1 - var2; // L: 86
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "542795153"
	)
	public static final void method2104() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 75
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 76
	} // L: 77
}
