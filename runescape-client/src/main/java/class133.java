import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class133 {
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 47036115
	)
	static int field1499;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 2363637495059539125L
	)
	long field1494;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 132184713843925465L
	)
	long field1492;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	IterableNodeDeque field1500;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public class133(Buffer var1) {
		this.field1492 = -1L; // L: 10
		this.field1500 = new IterableNodeDeque(); // L: 11
		this.method2770(var1); // L: 19
	} // L: 20

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-354049752"
	)
	void method2770(Buffer var1) {
		this.field1494 = var1.readLong(); // L: 23
		this.field1492 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class128(this);
			} else if (var2 == 4) {
				var3 = new class139(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class124(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class122(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class129(this);
			}

			((class132)var3).vmethod2839(var1); // L: 34
			this.field1500.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1626491571"
	)
	public void method2777(ClanChannel var1) {
		if (this.field1494 == var1.key && this.field1492 == var1.field1514) { // L: 41
			for (class132 var2 = (class132)this.field1500.last(); var2 != null; var2 = (class132)this.field1500.previous()) { // L: 42
				var2.vmethod2838(var1); // L: 43
			}

			++var1.field1514; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46
}
