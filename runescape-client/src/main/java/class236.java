import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class236 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;III)Lkq;",
		garbageValue = "-34187782"
	)
	public static Font method4378(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 122
		boolean var4;
		if (var5 == null) { // L: 123
			var4 = false; // L: 124
		} else {
			class244.SpriteBuffer_decode(var5); // L: 127
			var4 = true; // L: 128
		}

		if (!var4) { // L: 130
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 132
			Font var8;
			if (var6 == null) { // L: 134
				var8 = null; // L: 135
			} else {
				Font var7 = new Font(var6, class0.SpriteBuffer_xOffsets, Interpreter.SpriteBuffer_yOffsets, class395.SpriteBuffer_spriteWidths, class157.SpriteBuffer_spriteHeights, Varps.SpriteBuffer_spritePalette, class223.SpriteBuffer_pixels); // L: 138
				WorldMapDecorationType.method4370(); // L: 139
				var8 = var7; // L: 140
			}

			return var8; // L: 142
		}
	}
}
