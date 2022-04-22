import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Players")
public class Players {
	@ObfuscatedName("i")
	static byte[] field1283;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	static class193[] field1286;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lpi;"
	)
	static Buffer[] field1276;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1248043757
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("s")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1950904155
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("q")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("o")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("r")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("p")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2045827781
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("k")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static Buffer field1273;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive5")
	static Archive archive5;

	static {
		field1283 = new byte[2048]; // L: 18
		field1286 = new class193[2048]; // L: 19
		field1276 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1273 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "124"
	)
	public static int method2420(int var0) {
		return var0 >> 17 & 7; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-54"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class127.sortWorlds(DevicePcmPlayerProvider.World_worlds, 0, DevicePcmPlayerProvider.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1709005821"
	)
	static void method2421() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 240
			if (class131.clientPreferences.method2247() != null) { // L: 241
				Login.Login_username = class131.clientPreferences.method2247(); // L: 242
				Client.Login_isUsernameRemembered = true; // L: 243
			} else {
				Client.Login_isUsernameRemembered = false; // L: 245
			}

		}
	} // L: 246

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2053593928"
	)
	static void method2419(int var0, int var1) {
		if (class131.clientPreferences.method2321() != 0 && var0 != -1) { // L: 3622
			class18.method266(Message.archive11, var0, 0, class131.clientPreferences.method2321(), false); // L: 3623
			Client.field746 = true; // L: 3624
		}

	} // L: 3626
}
