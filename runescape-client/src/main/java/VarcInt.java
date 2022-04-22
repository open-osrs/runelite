import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public static class326 field1841;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -248717599
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("i")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-400441754"
	)
	void method3414(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.method3407(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "114"
	)
	void method3407(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.persist = true; // L: 36
		}

	} // L: 39
}
