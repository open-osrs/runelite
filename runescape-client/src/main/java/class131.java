import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class131 {
	@ObfuscatedName("a")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("e")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 8236093129399313125L
	)
	long field1588;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1513231141
	)
	int field1587;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	IterableNodeDeque field1589;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	public class131(Buffer var1) {
		this.field1587 = -1; // L: 9
		this.field1589 = new IterableNodeDeque(); // L: 10
		this.method2827(var1); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1779541187"
	)
	void method2827(Buffer var1) {
		this.field1588 = var1.readLong(); // L: 32
		this.field1587 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class150(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class126(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class143(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class127(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class132(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class125(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class129(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class146(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class152(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class138(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class133(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class137(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3040(var1); // L: 53
			this.field1589.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V",
		garbageValue = "-1989711462"
	)
	public void method2822(ClanSettings var1) {
		if (var1.field1635 == this.field1588 && this.field1587 == var1.field1636) { // L: 60
			for (class128 var2 = (class128)this.field1589.last(); var2 != null; var2 = (class128)this.field1589.previous()) { // L: 61
				var2.vmethod3041(var1); // L: 62
			}

			++var1.field1636; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2088063820"
	)
	static int method2828(String var0) {
		if (var0.equals("centre")) { // L: 297
			return 1; // L: 298
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 300 301 303
		}
	}
}
