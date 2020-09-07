import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class194 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2371;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2362;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2363;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2370;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2365;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2366;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2364;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2368;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2361;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	public static final class194 field2367;

	static {
		field2371 = new class194(5); // L: 5
		field2362 = new class194(4); // L: 6
		field2363 = new class194(3); // L: 7
		field2370 = new class194(5); // L: 8
		field2365 = new class194(4); // L: 9
		field2366 = new class194(14); // L: 10
		field2364 = new class194(15); // L: 11
		field2368 = new class194(6); // L: 12
		field2361 = new class194(7); // L: 13
		field2367 = new class194(2); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class194(int var1) {
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "4096"
	)
	static final String method3712(int var0) {
		if (var0 < 100000) { // L: 421
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 422 423
		}
	}
}
