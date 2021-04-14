import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("q")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("f")
	@Export("array")
	int[] array;

	public IntHashTable(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) { // L: 7 8
		}

		this.array = new int[var2 + var2]; // L: 9

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) { // L: 10
			this.array[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.array[var4 + var4 + 1] = var3++) { // L: 11 15
			for (var4 = var1[var3] & var2 - 1; this.array[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) { // L: 12 13
			}

			this.array[var4 + var4] = var1[var3]; // L: 14
		}

	} // L: 17

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1744823882"
	)
	@Export("get")
	public int get(int var1) {
		int var2 = (this.array.length >> 1) - 1; // L: 20
		int var3 = var1 & var2; // L: 21

		while (true) {
			int var4 = this.array[var3 + var3 + 1]; // L: 23
			if (var4 == -1) { // L: 24
				return -1;
			}

			if (this.array[var3 + var3] == var1) { // L: 25
				return var4;
			}

			var3 = var3 + 1 & var2; // L: 26
		}
	}
}
