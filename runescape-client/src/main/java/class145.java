import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class145 {
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -627241765
	)
	static int field1690;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -4087609161665050259L
	)
	long field1683;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 1088515563671951847L
	)
	long field1688;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	IterableNodeDeque field1685;

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	public class145(Buffer var1) {
		this.field1688 = -1L; // L: 10
		this.field1685 = new IterableNodeDeque(); // L: 11
		this.method2985(var1); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-84"
	)
	void method2985(Buffer var1) {
		this.field1683 = var1.readLong(); // L: 23
		this.field1688 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class136(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class134(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class141(this);
			}

			((class144)var3).vmethod3037(var1); // L: 34
			this.field1685.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1678529975"
	)
	public void method2987(ClanChannel var1) {
		if (this.field1683 == var1.key && var1.field1709 == this.field1688) { // L: 41
			for (class144 var2 = (class144)this.field1685.last(); var2 != null; var2 = (class144)this.field1685.previous()) { // L: 42
				var2.vmethod3032(var1); // L: 43
			}

			++var1.field1709; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "708009599"
	)
	static boolean method2991(int var0) {
		for (int var1 = 0; var1 < Client.field719; ++var1) { // L: 11734
			if (Client.field721[var1] == var0) { // L: 11735
				return true;
			}
		}

		return false; // L: 11737
	}
}
