import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class194 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	static final class194 field2173;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	static final class194 field2169;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1295743339
	)
	@Export("value")
	final int value;

	static {
		field2173 = new class194(0);
		field2169 = new class194(1);
	}

	class194(int var1) {
		this.value = var1;
	}
}
