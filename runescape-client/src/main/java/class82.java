import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public enum class82 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1072(0, -1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1064(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1065(2, 7),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1069(3, 8),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	field1067(4, 9);

	@ObfuscatedName("rf")
	static boolean field1070;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -265282023
	)
	static int field1071;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 282017633
	)
	final int field1068;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1123667359
	)
	final int field1063;

	class82(int var3, int var4) {
		this.field1068 = var3; // L: 20
		this.field1063 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1063; // L: 26
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	public static void method2122() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 556
	} // L: 557

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-68"
	)
	static void method2123(int var0) {
		Client.oculusOrbState = var0; // L: 11902
	} // L: 11903
}
