import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class441 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	public static final class441 field4678;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	public static final class441 field4671;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static final class441 field4673;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static final class441 field4674;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static final class441 field4677;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static final class441 field4676;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 489938793
	)
	final int field4675;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 464620871
	)
	final int field4672;

	static {
		field4678 = new class441(2, 0); // L: 8
		field4671 = new class441(4, 2); // L: 9
		field4673 = new class441(0, 5); // L: 10
		field4674 = new class441(3, 6); // L: 11
		field4677 = new class441(1, 7); // L: 12
		field4676 = new class441(5, 8); // L: 13
	}

	class441(int var1, int var2) {
		this.field4675 = var1; // L: 18
		this.field4672 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4672; // L: 23
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1052027203"
	)
	public boolean method7928() {
		return this == field4671; // L: 27
	}
}
