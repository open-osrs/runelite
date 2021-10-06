import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("f")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2028367777"
	)
	void method2924(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method2925(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "657554890"
	)
	void method2925(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}
}
