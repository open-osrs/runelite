import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class435 extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static AbstractArchive field4666;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("q")
	public int[][] field4668;
	@ObfuscatedName("f")
	public Object[][] field4669;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(64); // L: 11
	}

	class435() {
	} // L: 16

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "1788628332"
	)
	void method7592(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method7593(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1985465936"
	)
	void method7593(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field4668 == null) { // L: 44
				this.field4668 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field4668[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field4669 == null) {
						this.field4669 = new Object[this.field4668.length][]; // L: 55
					}

					this.field4669[var5] = Frames.method4353(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1716843483"
	)
	void method7602() {
	} // L: 64
}
