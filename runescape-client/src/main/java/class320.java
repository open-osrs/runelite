import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public final class class320 {
	@ObfuscatedName("i")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("w")
	static long[] field3860;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -433173711
	)
	static int field3868;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1325335001
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field3860 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field3860.length; ++var0) { // L: 8
			field3860[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9
}
