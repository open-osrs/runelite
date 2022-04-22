import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -60193045
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "-48"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "842367957"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "127"
	)
	static void method6828(int var0) {
		if (var0 != Login.loginIndex) { // L: 1852
			Login.loginIndex = var0; // L: 1853
		}
	} // L: 1854
}
