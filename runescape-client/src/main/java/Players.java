import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Players")
public class Players {
	@ObfuscatedName("q")
	static byte[] field1282;
	@ObfuscatedName("j")
	static byte[] field1278;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "[Lkn;"
	)
	static Buffer[] field1279;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1356497417
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("n")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -533970605
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("a")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("z")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("w")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("y")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -144867877
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("h")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkn;"
	)
	static Buffer field1289;

	static {
		field1282 = new byte[2048];
		field1278 = new byte[2048];
		field1279 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1289 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1312297159"
	)
	static int method2285(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "910052167"
	)
	public static void method2274() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}
}
