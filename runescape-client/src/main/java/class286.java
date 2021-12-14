import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("kf")
public final class class286 {
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "2058183094"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class334.World_worlds[var6];
			class334.World_worlds[var6] = class334.World_worlds[var1];
			class334.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (UserComparator4.method2506(class334.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class334.World_worlds[var9];
					class334.World_worlds[var9] = class334.World_worlds[var7];
					class334.World_worlds[var7++] = var10;
				}
			}

			class334.World_worlds[var1] = class334.World_worlds[var7];
			class334.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
