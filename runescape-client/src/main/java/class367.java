import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class367 {
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	public static class287 field4127;
	@ObfuscatedName("v")
	static final char[] field4124;
	@ObfuscatedName("j")
	static final char[] field4126;

	static {
		field4124 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field4126 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "2"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class15.World_worlds[var6];
			class15.World_worlds[var6] = class15.World_worlds[var1];
			class15.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (SecureRandomFuture.method1713(class15.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class15.World_worlds[var9];
					class15.World_worlds[var9] = class15.World_worlds[var7];
					class15.World_worlds[var7++] = var10;
				}
			}

			class15.World_worlds[var1] = class15.World_worlds[var7];
			class15.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
