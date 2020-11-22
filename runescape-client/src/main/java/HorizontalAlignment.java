import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3481(1, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	field3479(0, 2);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1229271323
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1995234347
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Liw;III)[Llc;",
		garbageValue = "2130018574"
	)
	public static Sprite[] method4882(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 100
		boolean var3;
		if (var4 == null) { // L: 101
			var3 = false; // L: 102
		} else {
			class217.SpriteBuffer_decode(var4); // L: 105
			var3 = true; // L: 106
		}

		if (!var3) { // L: 108
			return null;
		} else {
			Sprite[] var5 = new Sprite[class336.SpriteBuffer_spriteCount]; // L: 111

			for (int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) { // L: 112
				Sprite var7 = var5[var6] = new Sprite(); // L: 113
				var7.width = class336.SpriteBuffer_spriteWidth; // L: 114
				var7.height = class336.SpriteBuffer_spriteHeight; // L: 115
				var7.xOffset = class336.SpriteBuffer_xOffsets[var6]; // L: 116
				var7.yOffset = class225.SpriteBuffer_yOffsets[var6]; // L: 117
				var7.subWidth = class336.SpriteBuffer_spriteWidths[var6]; // L: 118
				var7.subHeight = class336.SpriteBuffer_spriteHeights[var6]; // L: 119
				int var8 = var7.subHeight * var7.subWidth; // L: 120
				byte[] var9 = class13.SpriteBuffer_pixels[var6]; // L: 121
				var7.pixels = new int[var8]; // L: 122

				for (int var10 = 0; var10 < var8; ++var10) { // L: 123
					var7.pixels[var10] = WorldMapID.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class336.SpriteBuffer_xOffsets = null; // L: 126
			class225.SpriteBuffer_yOffsets = null; // L: 127
			class336.SpriteBuffer_spriteWidths = null; // L: 128
			class336.SpriteBuffer_spriteHeights = null; // L: 129
			WorldMapID.SpriteBuffer_spritePalette = null; // L: 130
			class13.SpriteBuffer_pixels = null; // L: 131
			return var5; // L: 135
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-874256905"
	)
	static int method4876(int var0, int var1) {
		int var2 = var1 - 334; // L: 5436
		if (var2 < 0) { // L: 5437
			var2 = 0;
		} else if (var2 > 100) { // L: 5438
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5439
		return var0 * var3 / 256; // L: 5440
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1158098047"
	)
	static final String method4880(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 9990 9991
	}
}
