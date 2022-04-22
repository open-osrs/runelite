import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public enum class123 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1483(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1492(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1486(2, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1482(3, 3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1481(4, 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1484(5, 5),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1487(6, 6),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1488(7, 7),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1489(8, 8);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1942889575
	)
	final int field1490;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -315171815
	)
	final int field1491;

	class123(int var3, int var4) {
		this.field1490 = var3; // L: 110
		this.field1491 = var4; // L: 111
	} // L: 112

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1491; // L: 115
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfk;",
		garbageValue = "2122696884"
	)
	public static FloorUnderlayDefinition method2806(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
