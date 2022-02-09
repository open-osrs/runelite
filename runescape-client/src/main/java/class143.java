import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class143 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static IndexedSprite field1638;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -5735003153287195111L
	)
	long field1640;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 4673579608958775799L
	)
	long field1639;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	IterableNodeDeque field1642;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class143(Buffer var1) {
		this.field1639 = -1L; // L: 10
		this.field1642 = new IterableNodeDeque(); // L: 11
		this.method2956(var1); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1523562517"
	)
	void method2956(Buffer var1) {
		this.field1640 = var1.readLong(); // L: 23
		this.field1639 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class138(this);
			} else if (var2 == 4) { // L: 29
				var3 = new class149(this);
			} else if (var2 == 3) { // L: 30
				var3 = new class134(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class132(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class139(this);
			}

			((class142)var3).vmethod3014(var1); // L: 34
			this.field1642.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "1"
	)
	public void method2957(ClanChannel var1) {
		if (var1.key == this.field1640 && this.field1639 == var1.field1660) { // L: 41
			for (class142 var2 = (class142)this.field1642.last(); var2 != null; var2 = (class142)this.field1642.previous()) { // L: 42
				var2.vmethod3015(var1); // L: 43
			}

			++var1.field1660; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46
}
