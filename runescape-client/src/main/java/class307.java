import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public final class class307 {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("s")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("t")
	static long[] field3764;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static Bounds field3766;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3764 = new long[12];

		for (int var0 = 0; var0 < field3764.length; ++var0) {
			field3764[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
