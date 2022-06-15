import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public enum class83 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1074(0, -1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1084(1, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1075(2, 3),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1077(3, 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1078(4, 5),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1079(5, 6);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -91214193
	)
	final int field1080;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1146405405
	)
	final int field1081;

	class83(int var3, int var4) {
		this.field1080 = var3; // L: 21
		this.field1081 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1081; // L: 27
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "155608234"
	)
	public static void method2118() {
		if (KeyHandler.KeyHandler_instance != null) { // L: 167
			synchronized(KeyHandler.KeyHandler_instance) { // L: 168
				KeyHandler.KeyHandler_instance = null; // L: 169
			} // L: 170
		}

	} // L: 172

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "563268449"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 159
	}
}
