import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class69 {
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		longValue = 2632665440634654357L
	)
	static long field557;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 814144915
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lfo;B)V",
		garbageValue = "115"
	)
	static final void method1252(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 78
			for (var7 = 0; var7 < 64; ++var7) { // L: 79
				for (var8 = 0; var8 < 64; ++var8) { // L: 80
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 81
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 85

		for (var7 = 0; var7 < 4; ++var7) { // L: 86
			for (var8 = 0; var8 < 64; ++var8) { // L: 87
				for (int var9 = 0; var9 < 64; ++var9) { // L: 88
					Huffman.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 89
				}
			}
		}

	} // L: 93
}
