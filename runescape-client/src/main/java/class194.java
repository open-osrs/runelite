import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class194 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2356;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2349;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2359;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2348;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2352;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2351;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2354;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2353;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2355;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final class194 field2357;

	static {
		field2356 = new class194(3); // L: 5
		field2349 = new class194(6); // L: 6
		field2359 = new class194(2); // L: 7
		field2348 = new class194(4); // L: 8
		field2352 = new class194(15); // L: 9
		field2351 = new class194(5); // L: 10
		field2354 = new class194(4); // L: 11
		field2353 = new class194(5); // L: 12
		field2355 = new class194(14); // L: 13
		field2357 = new class194(7); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-893482237"
	)
	public static int method3753(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 24 25 28
			if ((var1 & 1) != 0) {
				var2 = var0 * var2; // L: 26
			}

			var0 *= var0; // L: 27
		}

		if (var1 == 1) { // L: 30
			return var0 * var2;
		} else {
			return var2; // L: 31
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lij;",
		garbageValue = "1718964805"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}
}
