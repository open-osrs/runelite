import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class257 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -523015899
	)
	static int field3042;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("fc")
	static String field3044;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1757234345"
	)
	public static boolean method5020(int var0) {
		return (var0 >> 28 & 1) != 0;
	}
}
