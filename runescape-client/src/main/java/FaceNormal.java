import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 875969351
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -440953057
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1278044513
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-2056587398"
	)
	public static void method3392(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			Coord.ByteArrayPool_alternativeSizes = var0; // L: 25
			FloorDecoration.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 26
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 27

			for (int var2 = 0; var2 < Coord.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 28
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 29
			}

		} else {
			Coord.ByteArrayPool_alternativeSizes = null;
			FloorDecoration.ByteArrayPool_altSizeArrayCounts = null; // L: 21
			ByteArrayPool.ByteArrayPool_arrays = null; // L: 22
		}
	} // L: 23 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "-1326300873"
	)
	public static void method3393(AbstractArchive var0) {
		class25.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = class25.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20
}
