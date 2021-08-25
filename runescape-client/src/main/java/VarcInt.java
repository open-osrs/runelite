import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 786767549
	)
	static int field1647;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -2020728515
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("m")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "1"
	)
	void method2854(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method2860(var1, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;IB)V",
		garbageValue = "-97"
	)
	void method2860(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}
}
