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
		intValue = -291144419
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-264858177"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnc;S)I",
		garbageValue = "-8912"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
