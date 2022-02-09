import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class116 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1443;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1436;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1439;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1438;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1441;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static final class116 field1440;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1481632183
	)
	final int field1437;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1174817355
	)
	final int field1442;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1470617479
	)
	final int field1435;

	static {
		field1443 = new class116(0, 0, (String)null, 0); // L: 14
		field1436 = new class116(1, 1, (String)null, 9); // L: 15
		field1439 = new class116(2, 2, (String)null, 3); // L: 16
		field1438 = new class116(3, 3, (String)null, 6); // L: 17
		field1441 = new class116(4, 4, (String)null, 1); // L: 18
		field1440 = new class116(5, 5, (String)null, 3); // L: 19
	}

	class116(int var1, int var2, String var3, int var4) {
		this.field1437 = var1; // L: 25
		this.field1442 = var2; // L: 26
		this.field1435 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1442; // L: 46
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2640() {
		return this.field1435; // L: 41
	}
}
