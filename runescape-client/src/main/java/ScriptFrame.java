import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -166615445
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("h")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("g")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1868195415"
	)
	static SpritePixels method1084() {
		SpritePixels var0 = new SpritePixels(); // L: 138
		var0.width = class451.SpriteBuffer_spriteWidth; // L: 139
		var0.height = class451.SpriteBuffer_spriteHeight; // L: 140
		var0.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 141
		var0.yOffset = class451.SpriteBuffer_yOffsets[0]; // L: 142
		var0.subWidth = class451.SpriteBuffer_spriteWidths[0]; // L: 143
		var0.subHeight = class451.SpriteBuffer_spriteHeights[0]; // L: 144
		int var1 = var0.subWidth * var0.subHeight; // L: 145
		byte[] var2 = class460.SpriteBuffer_pixels[0]; // L: 146
		var0.pixels = new int[var1]; // L: 147

		for (int var3 = 0; var3 < var1; ++var3) { // L: 148
			var0.pixels[var3] = GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		RouteStrategy.method3872(); // L: 149
		return var0; // L: 150
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lbp;III)V",
		garbageValue = "-96287651"
	)
	static final void method1083(MenuAction var0, int var1, int var2) {
		SoundCache.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 8194
	} // L: 8195
}
