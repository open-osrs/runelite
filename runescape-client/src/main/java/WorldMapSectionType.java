import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1960357597
	)
	@Export("type")
	final int type;
	@ObfuscatedName("q")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1810910487"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (ByteArrayPool.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < Coord.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == Coord.ByteArrayPool_alternativeSizes[var1] && FloorDecoration.ByteArrayPool_altSizeArrayCounts[var1] < ByteArrayPool.ByteArrayPool_arrays[var1].length) { // L: 90
						ByteArrayPool.ByteArrayPool_arrays[var1][FloorDecoration.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86 96

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	static final boolean method336(int var0) {
		if (var0 < 0) { // L: 7925
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 7926
			if (var1 >= 2000) { // L: 7927
				var1 -= 2000;
			}

			return var1 == 1007; // L: 7928
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lht;IIIB)V",
		garbageValue = "-90"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11444
		if (var4 != null) { // L: 11445
			if (Client.minimapState < 3) { // L: 11446
				UserComparator5.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11447
			}

		}
	} // L: 11448
}
