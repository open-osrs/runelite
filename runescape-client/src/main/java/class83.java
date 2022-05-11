import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public enum class83 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1088(0, -1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1083(1, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1084(2, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1087(3, 4),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1086(4, 5),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1092(5, 6);

	@ObfuscatedName("n")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("he")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 403650745
	)
	final int field1090;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 105353159
	)
	final int field1089;

	class83(int var3, int var4) {
		this.field1090 = var3; // L: 21
		this.field1089 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1089; // L: 27
	}
}
