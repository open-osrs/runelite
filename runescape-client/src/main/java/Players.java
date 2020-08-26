import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Players")
public class Players {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("s")
	static byte[] field1285;
	@ObfuscatedName("t")
	static byte[] field1284;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	static Buffer[] field1277;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1580537391
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("x")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1079575751
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("g")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("m")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("n")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("d")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1779975483
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("a")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static Buffer field1287;

	static {
		field1285 = new byte[2048]; // L: 18
		field1284 = new byte[2048]; // L: 19
		field1277 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1287 = new Buffer(new byte[5000]); // L: 30
	}
}
