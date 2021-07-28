import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class282 {
	@ObfuscatedName("o")
	public static short[] field3634;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1086292669
	)
	static int field3639;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-166028996"
	)
	public static void method5133(String[] var0, int[] var1) {
		ScriptEvent.method1809(var0, var1, 0, var0.length - 1);
	}
}
