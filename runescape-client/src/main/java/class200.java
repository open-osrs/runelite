import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class200 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static final class200 field2401;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static final class200 field2398;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static final class200 field2397;
	@ObfuscatedName("y")
	static byte[][][] field2399;

	static {
		field2401 = new class200(); // L: 4
		field2398 = new class200(); // L: 5
		field2397 = new class200(); // L: 6
	}

	class200() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1474141491"
	)
	public static int method3865(int var0) {
		return ReflectionCheck.method2451(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 56
	}
}
