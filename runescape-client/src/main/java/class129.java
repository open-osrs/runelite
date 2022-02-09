import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class129 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 8663139797518624471L
	)
	long field1538;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1174888179
	)
	int field1530;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	IterableNodeDeque field1531;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class129(Buffer var1) {
		this.field1530 = -1; // L: 9
		this.field1531 = new IterableNodeDeque(); // L: 10
		this.method2777(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1524635602"
	)
	void method2777(Buffer var1) {
		this.field1538 = var1.readLong(); // L: 32
		this.field1530 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class148(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class124(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class141(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class133(this);
			} else if (var2 == 6) {
				var3 = new class140(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class125(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class130(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class123(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class127(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class144(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class150(this);
			} else if (var2 == 10) {
				var3 = new class136(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class131(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class135(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class145(this);
			}

			((class126)var3).vmethod3019(var1); // L: 53
			this.field1531.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "1848526667"
	)
	public void method2775(ClanSettings var1) {
		if (this.field1538 == var1.field1588 && this.field1530 == var1.field1589) { // L: 60
			for (class126 var2 = (class126)this.field1531.last(); var2 != null; var2 = (class126)this.field1531.previous()) { // L: 61
				var2.vmethod3020(var1); // L: 62
			}

			++var1.field1589; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "-1439723306"
	)
	public static void method2774(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18
}
