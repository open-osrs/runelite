import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1754728745
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkc;I)I",
		garbageValue = "-857572865"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(Ljf;I)I",
		garbageValue = "334051838"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
