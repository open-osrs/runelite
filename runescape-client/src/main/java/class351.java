import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public enum class351 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field4021(2, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field4017(1, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field4018(0, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	field4019(3, 10);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -177039405
	)
	final int field4020;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 523466867
	)
	final int field4022;

	class351(int var3, int var4) {
		this.field4020 = var3;
		this.field4022 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4022;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2078126266"
	)
	public static int[] method6227() {
		int[] var0 = new int[KeyHandler.field132];

		for (int var1 = 0; var1 < KeyHandler.field132; ++var1) {
			var0[var1] = KeyHandler.field139[var1];
		}

		return var0;
	}
}
