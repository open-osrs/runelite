import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class92 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1103523851
	)
	int field1259;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 304225625
	)
	int field1258;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1607522393
	)
	int field1257;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -534320671
	)
	int field1260;

	class92(int var1, int var2, int var3, int var4) {
		this.field1259 = var1; // L: 10
		this.field1258 = var2; // L: 11
		this.field1257 = var3; // L: 12
		this.field1260 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1046968979"
	)
	int method2276() {
		return this.field1259; // L: 17
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	int method2274() {
		return this.field1258; // L: 21
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-243783355"
	)
	int method2275() {
		return this.field1257; // L: 25
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	int method2282() {
		return this.field1260; // L: 29
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcg;B)V",
		garbageValue = "-91"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class1.runScript(var0, 500000, 475000); // L: 110
	} // L: 111

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5210
		int var4 = var1 >> 7; // L: 5211
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5212
			int var5 = var2; // L: 5213
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5214
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5215
			int var7 = var1 & 127; // L: 5216
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5217
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5218
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5219
		} else {
			return 0;
		}
	}
}
