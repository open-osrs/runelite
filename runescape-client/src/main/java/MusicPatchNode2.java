import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("n")
	byte[] field2896;
	@ObfuscatedName("c")
	byte[] field2888;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -384855677
	)
	int field2889;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1941614975
	)
	int field2895;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 420962895
	)
	int field2891;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1489655771
	)
	int field2892;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1036239603
	)
	int field2893;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -367363133
	)
	int field2890;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -765214951
	)
	int field2887;

	MusicPatchNode2() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "-4"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class393.World_worlds[var6];
			class393.World_worlds[var6] = class393.World_worlds[var1];
			class393.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (InvDefinition.method2811(class393.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class393.World_worlds[var9];
					class393.World_worlds[var9] = class393.World_worlds[var7];
					class393.World_worlds[var7++] = var10;
				}
			}

			class393.World_worlds[var1] = class393.World_worlds[var7];
			class393.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
