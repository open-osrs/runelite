import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("c")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1182603689
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 686717977
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("e")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2136153495
	)
	static int field2513;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 832839689
	)
	static int field2517;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -801595193
	)
	static int field2516;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1846938679
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("x")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgi;I)V",
		garbageValue = "167844022"
	)
	static final void method4264(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 113
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						int var15 = var2 + class147.method2997(var11 & 7, var12 & 7, var7); // L: 123
						int var18 = var11 & 7; // L: 126
						int var19 = var12 & 7; // L: 127
						int var20 = var7 & 3; // L: 130
						int var17;
						if (var20 == 0) { // L: 131
							var17 = var19; // L: 132
						} else if (var20 == 1) { // L: 135
							var17 = 7 - var18; // L: 136
						} else if (var20 == 2) { // L: 139
							var17 = 7 - var19; // L: 140
						} else {
							var17 = var18; // L: 143
						}

						UserComparator9.loadTerrain(var21, var1, var15, var3 + var17, 0, 0, var7); // L: 145
					} else {
						UserComparator9.loadTerrain(var21, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151
}
