import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("n")
	static final int[] field1983;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -603401275
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -902508973
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1508398865
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1983 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1983[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "58"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 27
			if (var2 == 0) { // L: 28
				return; // L: 31
			}

			this.decodeNext(var1, var2); // L: 29
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IB)V",
		garbageValue = "-96"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 34
			this.baseVar = var1.readUnsignedShort(); // L: 35
			this.startBit = var1.readUnsignedByte(); // L: 36
			this.endBit = var1.readUnsignedByte(); // L: 37
		}

	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FI)F",
		garbageValue = "-1168558464"
	)
	static float method3555(class117 var0, float var1) {
		if (var0 == null) { // L: 161
			return 0.0F; // L: 162
		} else {
			float var2;
			if (var0.field1432 == var1) { // L: 165
				var2 = 0.0F; // L: 166
			} else if (var1 == var0.field1433) { // L: 168
				var2 = 1.0F; // L: 169
			} else {
				var2 = (var1 - var0.field1432) / (var0.field1433 - var0.field1432); // L: 172
			}

			float var3;
			if (var0.field1438) { // L: 175
				var3 = var2; // L: 176
			} else {
				float[] var4 = new float[]{var0.field1440[0] - var2, var0.field1440[1], var0.field1440[2], var0.field1440[3]}; // L: 179 180 181 182 183
				float[] var5 = new float[5]; // L: 184
				int var6 = class154.method3129(var4, 3, 0.0F, true, 1.0F, true, var5); // L: 185
				if (var6 == 1) { // L: 186
					var3 = var5[0]; // L: 187
				} else {
					var3 = 0.0F; // L: 190
				}
			}

			return (var0.field1435[1] + (var0.field1435[3] * var3 + var0.field1435[2]) * var3) * var3 + var0.field1435[0]; // L: 193
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "13"
	)
	public static boolean method3561(int var0) {
		return (var0 >> 31 & 1) != 0; // L: 41
	}
}
