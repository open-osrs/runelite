import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class307 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-2104430234"
	)
	public static char method5555(char var0) {
		switch(var0) { // L: 48
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 62
		case '#':
		case '[':
		case ']':
			return var0; // L: 92
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
			return 'a'; // L: 117
		case 'Ç':
		case 'ç':
			return 'c'; // L: 79
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 88
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 57
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 95
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
			return 'o'; // L: 106
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 74
		case 'ß':
			return 'b'; // L: 50
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 65
		default:
			return Character.toLowerCase(var0); // L: 76
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[Lls;",
		garbageValue = "1"
	)
	static IndexedSprite[] method5558() {
		IndexedSprite[] var0 = new IndexedSprite[class335.SpriteBuffer_spriteCount]; // L: 154

		for (int var1 = 0; var1 < class335.SpriteBuffer_spriteCount; ++var1) { // L: 155
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 156
			var2.width = class335.SpriteBuffer_spriteWidth; // L: 157
			var2.height = class335.SpriteBuffer_spriteHeight; // L: 158
			var2.xOffset = Username.SpriteBuffer_xOffsets[var1]; // L: 159
			var2.yOffset = class335.SpriteBuffer_yOffsets[var1]; // L: 160
			var2.subWidth = class335.SpriteBuffer_spriteWidths[var1]; // L: 161
			var2.subHeight = class335.SpriteBuffer_spriteHeights[var1]; // L: 162
			var2.palette = TaskHandler.SpriteBuffer_spritePalette; // L: 163
			var2.pixels = class92.SpriteBuffer_pixels[var1]; // L: 164
		}

		Username.SpriteBuffer_xOffsets = null; // L: 167
		class335.SpriteBuffer_yOffsets = null; // L: 168
		class335.SpriteBuffer_spriteWidths = null; // L: 169
		class335.SpriteBuffer_spriteHeights = null; // L: 170
		TaskHandler.SpriteBuffer_spritePalette = null; // L: 171
		class92.SpriteBuffer_pixels = null; // L: 172
		return var0; // L: 174
	}
}
