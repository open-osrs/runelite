import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("h")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-81"
	)
	public void method3386(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method3387(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "141297465"
	)
	void method3387(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31
}
