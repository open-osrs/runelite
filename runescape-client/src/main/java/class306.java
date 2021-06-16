import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public final class class306 {
	@ObfuscatedName("f")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("e")
	static long[] field3756;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive15")
	static Archive archive15;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field3756 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field3756.length; ++var0) { // L: 8
			field3756[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9
}
