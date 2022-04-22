import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public enum class124 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1501(4, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1498(3, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1495(1, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1496(2, 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1497(0, 4);

	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -721615265
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1424208167
	)
	public final int field1493;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 669074999
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1493 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}
}
