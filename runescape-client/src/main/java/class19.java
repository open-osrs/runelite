import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -7800373263393014969L
	)
	long field162;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 2996578654687834529L
	)
	long field160;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	IterableNodeDeque field163;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public class19(Buffer var1) {
		this.field160 = -1L; // L: 9
		this.field163 = new IterableNodeDeque(); // L: 10
		this.method221(var1); // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1275623765"
	)
	void method221(Buffer var1) {
		this.field162 = var1.readLong(); // L: 22
		this.field160 = var1.readLong(); // L: 23

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 24 25 35
			Object var3;
			if (var2 == 1) { // L: 27
				var3 = new class12(this);
			} else if (var2 == 4) { // L: 28
				var3 = new class7(this);
			} else if (var2 == 3) { // L: 29
				var3 = new class5(this);
			} else if (var2 == 2) { // L: 30
				var3 = new class20(this);
			} else {
				if (var2 != 5) { // L: 31
					throw new RuntimeException(""); // L: 32
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod266(var1); // L: 33
			this.field163.addFirst((Node)var3); // L: 34
		}

	} // L: 37

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "205429833"
	)
	public void method218(ClanChannel var1) {
		if (var1.key == this.field162 && var1.field29 == this.field160) { // L: 40
			for (class16 var2 = (class16)this.field163.last(); var2 != null; var2 = (class16)this.field163.previous()) { // L: 41
				var2.vmethod264(var1); // L: 42
			}

			++var1.field29; // L: 44
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lbh;I)V",
		garbageValue = "229174712"
	)
	public static final void method225(PlayerProvider var0) {
		class26.pcmPlayerProvider = var0; // L: 45
	} // L: 46
}
