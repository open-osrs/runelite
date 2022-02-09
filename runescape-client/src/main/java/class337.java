import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lh")
public final class class337 {
	@ObfuscatedName("c")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("l")
	static long[] field4061;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4061 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4061.length; ++var0) { // L: 8
			field4061[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9
}
