import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class260 {
	@ObfuscatedName("k")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("cs")
	static boolean field2888;
	@ObfuscatedName("fp")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-537168296"
	)
	public static int method5203(int var0) {
		return class271.field3160[var0]; // L: 35
	}
}
