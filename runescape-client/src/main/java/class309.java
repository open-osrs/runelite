import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class309 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;III)[Low;",
		garbageValue = "1718772272"
	)
	public static IndexedSprite[] method5603(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class244.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class124.SpriteBuffer_spriteCount]; // L: 36

			for (int var6 = 0; var6 < class124.SpriteBuffer_spriteCount; ++var6) { // L: 37
				IndexedSprite var7 = var5[var6] = new IndexedSprite(); // L: 38
				var7.width = class395.SpriteBuffer_spriteWidth; // L: 39
				var7.height = class395.SpriteBuffer_spriteHeight; // L: 40
				var7.xOffset = class0.SpriteBuffer_xOffsets[var6]; // L: 41
				var7.yOffset = Interpreter.SpriteBuffer_yOffsets[var6]; // L: 42
				var7.subWidth = class395.SpriteBuffer_spriteWidths[var6]; // L: 43
				var7.subHeight = class157.SpriteBuffer_spriteHeights[var6]; // L: 44
				var7.palette = Varps.SpriteBuffer_spritePalette; // L: 45
				var7.pixels = class223.SpriteBuffer_pixels[var6]; // L: 46
			}

			WorldMapDecorationType.method4370(); // L: 48
			return var5; // L: 51
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "386677351"
	)
	static char method5602(char var0) {
		switch(var0) { // L: 93
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 145
		case '#':
		case '[':
		case ']':
			return var0; // L: 129
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 140
		case 'Ç':
		case 'ç':
			return 'c'; // L: 98
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 107
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 123
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 148
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 159
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 116
		case 'ß':
			return 'b'; // L: 95
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 162
		default:
			return Character.toLowerCase(var0); // L: 125
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[Lox;",
		garbageValue = "-1941444476"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4229, FillMode.field4230}; // L: 15
	}
}
