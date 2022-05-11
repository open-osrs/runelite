import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class239 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class239 field2875;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class239 field2872;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2125298345
	)
	@Export("value")
	final int value;

	static {
		field2875 = new class239(0); // L: 4
		field2872 = new class239(1); // L: 5
	}

	class239(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-299459182"
	)
	public static int method4810(CharSequence var0) {
		int var1 = var0.length(); // L: 139
		int var2 = 0; // L: 140

		for (int var3 = 0; var3 < var1; ++var3) { // L: 141
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 142
	}
}
