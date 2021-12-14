import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class422 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	public static final class422 field4523;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	public static final class422 field4524;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static final class422 field4528;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static final class422 field4526;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static final class422 field4525;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static final class422 field4527;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2111165783
	)
	final int field4529;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1059382247
	)
	final int field4530;

	static {
		field4523 = new class422(5, 0);
		field4524 = new class422(4, 2);
		field4528 = new class422(0, 5);
		field4526 = new class422(1, 6);
		field4525 = new class422(2, 7);
		field4527 = new class422(3, 8);
	}

	class422(int var1, int var2) {
		this.field4529 = var1;
		this.field4530 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method7605() {
		return this == field4524;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4530;
	}
}
