import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static Bounds field3969;
	@ObfuscatedName("bd")
	@Export("otp")
	static String otp;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1208503279
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)I",
		garbageValue = "1729622870"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)I",
		garbageValue = "-81"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
