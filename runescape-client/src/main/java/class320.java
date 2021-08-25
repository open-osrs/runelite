import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lr")
public final class class320 {
	@ObfuscatedName("n")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("c")
	static long[] field3864;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 57919547
	)
	@Export("baseY")
	static int baseY;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3864 = new long[12];

		for (int var0 = 0; var0 < field3864.length; ++var0) {
			field3864[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
