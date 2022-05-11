import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -28865855
	)
	static int field2242;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -716123983
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1217895239
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1357888893
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -546663349
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIILgh;I)Z",
		garbageValue = "-425355466"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1536877918"
	)
	static char method3795(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 179
		var1.offset = var0.length - 2; // L: 180
		class453.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 181
		class453.SpriteBuffer_xOffsets = new int[class453.SpriteBuffer_spriteCount]; // L: 182
		class453.SpriteBuffer_yOffsets = new int[class453.SpriteBuffer_spriteCount]; // L: 183
		ScriptFrame.SpriteBuffer_spriteWidths = new int[class453.SpriteBuffer_spriteCount]; // L: 184
		class453.SpriteBuffer_spriteHeights = new int[class453.SpriteBuffer_spriteCount]; // L: 185
		class127.SpriteBuffer_pixels = new byte[class453.SpriteBuffer_spriteCount][]; // L: 186
		var1.offset = var0.length - 7 - class453.SpriteBuffer_spriteCount * 8; // L: 187
		class453.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 188
		class453.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 189
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 190

		int var3;
		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) { // L: 191
			class453.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) { // L: 192
			class453.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) { // L: 193
			ScriptFrame.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) { // L: 194
			class453.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class453.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 195
		Decimator.SpriteBuffer_spritePalette = new int[var2]; // L: 196

		for (var3 = 1; var3 < var2; ++var3) { // L: 197
			Decimator.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 198
			if (Decimator.SpriteBuffer_spritePalette[var3] == 0) { // L: 199
				Decimator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 201

		for (var3 = 0; var3 < class453.SpriteBuffer_spriteCount; ++var3) { // L: 202
			int var4 = ScriptFrame.SpriteBuffer_spriteWidths[var3]; // L: 203
			int var5 = class453.SpriteBuffer_spriteHeights[var3]; // L: 204
			int var6 = var4 * var5; // L: 205
			byte[] var7 = new byte[var6]; // L: 206
			class127.SpriteBuffer_pixels[var3] = var7; // L: 207
			int var8 = var1.readUnsignedByte(); // L: 208
			int var9;
			if (var8 == 0) { // L: 209
				for (var9 = 0; var9 < var6; ++var9) { // L: 210
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 212
				for (var9 = 0; var9 < var4; ++var9) { // L: 213
					for (int var10 = 0; var10 < var5; ++var10) { // L: 214
						var7[var9 + var10 * var4] = var1.readByte(); // L: 215
					}
				}
			}
		}

	} // L: 220
}
