import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1886230441
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1580613665
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -957882951
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 900719109
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 604774139
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1750111550"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;IB)V",
		garbageValue = "-100"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) { // L: 25
				return; // L: 28
			}

			this.decodeNext(var1, var3, var2); // L: 26
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;III)V",
		garbageValue = "-2023862800"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 31
			this.rgb = var1.readMedium();
		}

	} // L: 33

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1276241137"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 36
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 37
		double var6 = (double)(var1 & 255) / 256.0D; // L: 38
		double var8 = var2; // L: 39
		if (var4 < var2) { // L: 40
			var8 = var4;
		}

		if (var6 < var8) { // L: 41
			var8 = var6;
		}

		double var10 = var2; // L: 42
		if (var4 > var2) { // L: 43
			var10 = var4;
		}

		if (var6 > var10) { // L: 44
			var10 = var6;
		}

		double var12 = 0.0D; // L: 45
		double var14 = 0.0D; // L: 46
		double var16 = (var10 + var8) / 2.0D; // L: 47
		if (var8 != var10) { // L: 48
			if (var16 < 0.5D) { // L: 49
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 50
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 51
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 52
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 53
			}
		}

		var12 /= 6.0D; // L: 55
		this.saturation = (int)(var14 * 256.0D); // L: 56
		this.lightness = (int)(256.0D * var16); // L: 57
		if (this.saturation < 0) { // L: 58
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 59
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 60
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 61
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 62
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 63
		}

		if (this.hueMultiplier < 1) { // L: 64
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 65
	} // L: 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljn;",
		garbageValue = "-2098307250"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3093, ServerPacket.field3037, ServerPacket.field3038, ServerPacket.field3118, ServerPacket.field3040, ServerPacket.field3041, ServerPacket.field3142, ServerPacket.field3109, ServerPacket.field3130, ServerPacket.field3067, ServerPacket.field3046, ServerPacket.field3113, ServerPacket.field3048, ServerPacket.field3049, ServerPacket.field3050, ServerPacket.field3039, ServerPacket.field3052, ServerPacket.field3053, ServerPacket.field3054, ServerPacket.field3055, ServerPacket.field3056, ServerPacket.field3057, ServerPacket.field3058, ServerPacket.field3097, ServerPacket.field3079, ServerPacket.field3061, ServerPacket.field3051, ServerPacket.field3063, ServerPacket.field3044, ServerPacket.field3059, ServerPacket.field3066, ServerPacket.field3092, ServerPacket.field3068, ServerPacket.field3119, ServerPacket.field3070, ServerPacket.field3071, ServerPacket.field3129, ServerPacket.field3042, ServerPacket.field3069, ServerPacket.field3075, ServerPacket.field3076, ServerPacket.field3110, ServerPacket.field3078, ServerPacket.field3127, ServerPacket.field3080, ServerPacket.field3126, ServerPacket.field3082, ServerPacket.field3083, ServerPacket.field3084, ServerPacket.field3085, ServerPacket.field3086, ServerPacket.field3087, ServerPacket.field3088, ServerPacket.field3060, ServerPacket.field3090, ServerPacket.field3091, ServerPacket.field3096, ServerPacket.field3140, ServerPacket.field3094, ServerPacket.field3095, ServerPacket.field3045, ServerPacket.field3043, ServerPacket.field3062, ServerPacket.field3138, ServerPacket.field3100, ServerPacket.field3101, ServerPacket.field3064, ServerPacket.field3099, ServerPacket.field3104, ServerPacket.field3105, ServerPacket.field3047, ServerPacket.field3107, ServerPacket.field3081, ServerPacket.field3106, ServerPacket.field3074, ServerPacket.field3111, ServerPacket.field3112, ServerPacket.field3073, ServerPacket.field3114, ServerPacket.field3077, ServerPacket.field3116, ServerPacket.field3117, ServerPacket.field3108, ServerPacket.field3089, ServerPacket.field3120, ServerPacket.field3121, ServerPacket.field3122, ServerPacket.field3123, ServerPacket.field3124, ServerPacket.field3125, ServerPacket.field3072, ServerPacket.field3103, ServerPacket.field3128, ServerPacket.field3102, ServerPacket.field3065, ServerPacket.field3131, ServerPacket.field3132, ServerPacket.field3133, ServerPacket.field3134, ServerPacket.field3135, ServerPacket.field3136, ServerPacket.field3137, ServerPacket.field3115, ServerPacket.field3139, ServerPacket.field3098}; // L: 114
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfp;",
		garbageValue = "180"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}
}
