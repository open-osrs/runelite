import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class443 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	public static final class443 field4734;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	public static final class443 field4730;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static final class443 field4732;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static final class443 field4729;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static final class443 field4733;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static final class443 field4731;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 937638557
	)
	final int field4735;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1478684649
	)
	final int field4736;

	static {
		field4734 = new class443(3, 0); // L: 8
		field4730 = new class443(4, 2); // L: 9
		field4732 = new class443(1, 5); // L: 10
		field4729 = new class443(2, 6); // L: 11
		field4733 = new class443(5, 7); // L: 12
		field4731 = new class443(0, 8); // L: 13
	}

	class443(int var1, int var2) {
		this.field4735 = var1; // L: 18
		this.field4736 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4736; // L: 24
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-832611575"
	)
	public boolean method7790() {
		return this == field4730; // L: 28
	}
}
