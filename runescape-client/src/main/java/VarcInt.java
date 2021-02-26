import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("d")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "-111"
	)
	public void method4594(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method4595(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-1938056419"
	)
	void method4595(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31
}
