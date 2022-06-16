import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class437 extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static AbstractArchive field4675;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("q")
	Object[][] field4676;
	@ObfuscatedName("f")
	int[][] field4677;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1231945791
	)
	public int field4678;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class437() {
	} // L: 17

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "1"
	)
	void method7635(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method7627(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "-23"
	)
	public Object[] method7625(int var1) {
		return this.field4676 == null ? null : this.field4676[var1]; // L: 43 44
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-1966368366"
	)
	void method7627(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4676 == null) { // L: 50
				this.field4676 = new Object[var3][]; // L: 51
				this.field4677 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 78
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				Object[][] var16 = this.field4676; // L: 61
				int var10 = var1.readUShortSmart(); // L: 65
				Object[] var11 = new Object[var6.length * var10]; // L: 66

				for (int var12 = 0; var12 < var10; ++var12) { // L: 67
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 68
						int var14 = var13 + var6.length * var12; // L: 69
						class432 var15 = MusicPatchNode.method5472(var6[var13]); // L: 70
						var11[var14] = var15.method7565(var1); // L: 71
					}
				}

				var16[var4] = var11; // L: 76
				this.field4677[var4] = var6; // L: 77
			}
		} else if (var2 == 4) { // L: 81
			this.field4678 = var1.method7754(); // L: 82
		}

	} // L: 85

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-110987764"
	)
	void method7636() {
	} // L: 87
}
