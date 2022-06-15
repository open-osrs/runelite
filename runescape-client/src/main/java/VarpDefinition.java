import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 486330385
	)
	public static int field1822;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ct")
	static boolean field1821;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -737478807
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1095475514"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "1370423223"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1678307117"
	)
	public static int method3374(int var0) {
		return class270.field3179[var0]; // L: 24
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1226531684"
	)
	static final boolean method3373(int var0) {
		if (var0 < 0) { // L: 8693
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8694
			if (var1 >= 2000) { // L: 8695
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8696
		}
	}
}
