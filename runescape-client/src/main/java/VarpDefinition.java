import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 447928959
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1862551275
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
		descriptor = "(Lkj;I)V",
		garbageValue = "-1194573420"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "263828873"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "789122507"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 3902
			if (class41.loadInterface(var0)) { // L: 3903
				Widget[] var1 = class9.Widget_interfaceComponents[var0]; // L: 3904

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 3905
					Widget var3 = var1[var2]; // L: 3906
					if (var3.onLoad != null) { // L: 3907
						ScriptEvent var4 = new ScriptEvent(); // L: 3908
						var4.widget = var3; // L: 3909
						var4.args = var3.onLoad; // L: 3910
						AttackOption.runScript(var4, 5000000); // L: 3911
					}
				}

			}
		}
	} // L: 3914
}
