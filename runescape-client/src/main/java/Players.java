import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Players")
public class Players {
	@ObfuscatedName("v")
	static byte[] field1372;
	@ObfuscatedName("y")
	static byte[] field1361;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	static Buffer[] field1362;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1407274759
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("m")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1572681721
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("d")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("z")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("b")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1672795699
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("k")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static Buffer field1373;

	static {
		field1372 = new byte[2048]; // L: 18
		field1361 = new byte[2048]; // L: 19
		field1362 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1373 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219077649"
	)
	public static void method2402() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 68
	} // L: 69
}
