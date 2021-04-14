import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lir;III)Loh;",
		garbageValue = "-2108875586"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 91
		boolean var3;
		if (var4 == null) { // L: 92
			var3 = false; // L: 93
		} else {
			class244.SpriteBuffer_decode(var4); // L: 96
			var3 = true; // L: 97
		}

		if (!var3) { // L: 99
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 102
			var5.width = class395.SpriteBuffer_spriteWidth; // L: 103
			var5.height = class395.SpriteBuffer_spriteHeight; // L: 104
			var5.xOffset = class0.SpriteBuffer_xOffsets[0]; // L: 105
			var5.yOffset = Interpreter.SpriteBuffer_yOffsets[0]; // L: 106
			var5.subWidth = class395.SpriteBuffer_spriteWidths[0]; // L: 107
			var5.subHeight = class157.SpriteBuffer_spriteHeights[0]; // L: 108
			int var6 = var5.subWidth * var5.subHeight; // L: 109
			byte[] var7 = class223.SpriteBuffer_pixels[0]; // L: 110
			var5.pixels = new int[var6]; // L: 111

			for (int var8 = 0; var8 < var6; ++var8) { // L: 112
				var5.pixels[var8] = Varps.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			WorldMapDecorationType.method4370(); // L: 113
			return var5; // L: 116
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1135384010"
	)
	static final void method3784(int var0, int var1, int var2, boolean var3) {
		if (class15.loadInterface(var0)) { // L: 9976
			Message.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 9977
		}
	} // L: 9978
}
