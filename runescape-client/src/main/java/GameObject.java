import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1234198713
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1786079239
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1089622701
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -465774691
	)
	@Export("height")
	int height;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1923590497
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1996180969
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1051509529
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1723330507
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -621074209
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -178409117
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 144998379
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1469340071
	)
	int field2548;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 800381971
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -3336818157473405963L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1622989155
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "210014678"
	)
	static int method4341(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4274
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4279
				if (var0 == 6750) { // L: 4283
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 4284
					return 1; // L: 4285
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4287
					if (var0 == 6754) { // L: 4291
						int var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4292
						NPCComposition var4 = WorldMapLabelSize.getNpcDefinition(var3); // L: 4293
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4294
						return 1; // L: 4295
					} else {
						return 2; // L: 4297
					}
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4288
					return 1; // L: 4289
				}
			} else {
				--IsaacCipher.Interpreter_intStackSize; // L: 4280
				return 1; // L: 4281
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 4275
			--class13.Interpreter_stringStackSize; // L: 4276
			return 1; // L: 4277
		}
	}
}
