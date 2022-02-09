import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class424 implements MouseWheel {
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	public static final class424 field4569;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	public static final class424 field4561;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class424 field4563;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class424 field4564;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class424 field4565;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class424 field4562;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1764301045
	)
	final int field4567;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1440415847
	)
	final int field4568;

	static {
		field4569 = new class424(5, 0); // L: 8
		field4561 = new class424(3, 2); // L: 9
		field4563 = new class424(1, 5); // L: 10
		field4564 = new class424(0, 6); // L: 11
		field4565 = new class424(4, 7); // L: 12
		field4562 = new class424(2, 8); // L: 13
	}

	class424(int var1, int var2) {
		this.field4567 = var1; // L: 18
		this.field4568 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4568; // L: 24
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "94"
	)
	public boolean method7628() {
		return this == field4561; // L: 28
	}
}
