import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -1948740643
	)
	static int field1882;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkd;II)V",
		garbageValue = "-1780574680"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		WorldMapDecoration.method404(var0); // L: 73
		MusicPatch.method4095(var0); // L: 74
		if (var0.offset - var2 != var1) { // L: 75
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 76
		}
	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lfe;I)V",
		garbageValue = "255234267"
	)
	static final void method3411(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					KeyHandler.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108
}
