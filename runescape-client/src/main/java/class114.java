import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public enum class114 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1408(0, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1409(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1410(2, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1413(3, 3),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	field1412(4, 4);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2088995773
	)
	final int field1411;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1603954707
	)
	final int field1414;

	class114(int var3, int var4) {
		this.field1411 = var3; // L: 141
		this.field1414 = var4; // L: 142
	} // L: 143

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1414; // L: 146
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1896502825"
	)
	public static float method2609(int var0) {
		var0 &= 16383; // L: 24
		return (float)(6.283185307179586D * (double)((float)var0 / 16384.0F)); // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Lbi;",
		garbageValue = "13401"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class33.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}
}
