import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1073207223
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "[Lki;"
	)
	static Widget[] field1408;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;I)I",
		garbageValue = "84512734"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljg;",
		garbageValue = "-369068324"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3166, ServerPacket.field3085, ServerPacket.field3152, ServerPacket.field3087, ServerPacket.field3088, ServerPacket.field3170, ServerPacket.field3090, ServerPacket.field3179, ServerPacket.field3149, ServerPacket.field3140, ServerPacket.field3093, ServerPacket.field3112, ServerPacket.field3096, ServerPacket.field3092, ServerPacket.field3089, ServerPacket.field3099, ServerPacket.field3100, ServerPacket.field3101, ServerPacket.field3102, ServerPacket.field3103, ServerPacket.field3187, ServerPacket.field3105, ServerPacket.field3106, ServerPacket.field3107, ServerPacket.field3108, ServerPacket.field3109, ServerPacket.field3139, ServerPacket.field3111, ServerPacket.field3182, ServerPacket.field3084, ServerPacket.field3183, ServerPacket.field3115, ServerPacket.field3091, ServerPacket.field3117, ServerPacket.field3118, ServerPacket.field3119, ServerPacket.field3120, ServerPacket.field3121, ServerPacket.field3122, ServerPacket.field3123, ServerPacket.field3161, ServerPacket.field3125, ServerPacket.field3124, ServerPacket.field3127, ServerPacket.field3154, ServerPacket.field3129, ServerPacket.field3130, ServerPacket.field3131, ServerPacket.field3188, ServerPacket.field3133, ServerPacket.field3142, ServerPacket.field3110, ServerPacket.field3114, ServerPacket.field3137, ServerPacket.field3094, ServerPacket.field3190, ServerPacket.field3126, ServerPacket.field3141, ServerPacket.field3180, ServerPacket.field3143, ServerPacket.field3144, ServerPacket.field3153, ServerPacket.field3146, ServerPacket.field3116, ServerPacket.field3148, ServerPacket.field3097, ServerPacket.field3150, ServerPacket.field3151, ServerPacket.field3134, ServerPacket.field3147, ServerPacket.field3162, ServerPacket.field3155, ServerPacket.field3156, ServerPacket.field3157, ServerPacket.field3158, ServerPacket.field3159, ServerPacket.field3160, ServerPacket.field3098, ServerPacket.field3113, ServerPacket.field3163, ServerPacket.field3164, ServerPacket.field3165, ServerPacket.field3104, ServerPacket.field3167, ServerPacket.field3168, ServerPacket.field3169, ServerPacket.field3135, ServerPacket.field3171, ServerPacket.field3172, ServerPacket.field3173, ServerPacket.field3174, ServerPacket.field3175, ServerPacket.field3176, ServerPacket.field3177, ServerPacket.field3132, ServerPacket.field3086, ServerPacket.field3145, ServerPacket.field3181, ServerPacket.field3095, ServerPacket.field3186, ServerPacket.field3184, ServerPacket.field3185, ServerPacket.field3178, ServerPacket.field3136}; // L: 113
	}
}
