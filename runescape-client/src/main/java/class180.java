import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class180 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class180 field2102;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class180 field2103;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1733060335
	)
	@Export("value")
	final int value;

	static {
		field2102 = new class180(0); // L: 4
		field2103 = new class180(1); // L: 5
	}

	class180(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
