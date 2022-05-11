import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 157062685
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnz;B)I",
		garbageValue = "0"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "434999779"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1881391939"
	)
	static float method6616(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var2 * var3 + var0[var4]; // L: 110
		}

		return var3; // L: 112
	}
}
