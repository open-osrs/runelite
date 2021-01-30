import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static final PrivateChatMode field3833;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	public static final PrivateChatMode field3832;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static final PrivateChatMode field3834;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -976230065
	)
	public final int field3835;

	static {
		field3833 = new PrivateChatMode(0); // L: 5
		field3832 = new PrivateChatMode(1); // L: 6
		field3834 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3835 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;III)Lku;",
		garbageValue = "1224864347"
	)
	public static Font method5934(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		return !class304.method5363(var0, var2, var3) ? null : class308.method5482(var1.takeFile(var2, var3)); // L: 82 83
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Llo;",
		garbageValue = "64"
	)
	static IndexedSprite method5937() {
		IndexedSprite var0 = new IndexedSprite(); // L: 166
		var0.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 167
		var0.height = class336.SpriteBuffer_spriteHeight; // L: 168
		var0.xOffset = class336.SpriteBuffer_xOffsets[0]; // L: 169
		var0.yOffset = class336.SpriteBuffer_yOffsets[0]; // L: 170
		var0.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 171
		var0.subHeight = class336.SpriteBuffer_spriteHeights[0]; // L: 172
		var0.palette = class336.SpriteBuffer_spritePalette; // L: 173
		var0.pixels = GrandExchangeEvents.SpriteBuffer_pixels[0]; // L: 174
		class336.SpriteBuffer_xOffsets = null; // L: 176
		class336.SpriteBuffer_yOffsets = null; // L: 177
		class336.SpriteBuffer_spriteWidths = null; // L: 178
		class336.SpriteBuffer_spriteHeights = null; // L: 179
		class336.SpriteBuffer_spritePalette = null; // L: 180
		GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 181
		return var0; // L: 183
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "1"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 424
		int var2 = var1.readUnsignedByte(); // L: 425
		int var3 = var1.readInt(); // L: 426
		if (var3 < 0 || AbstractArchive.field3171 != 0 && var3 > AbstractArchive.field3171) { // L: 427
			throw new RuntimeException(); // L: 428
		} else if (var2 == 0) { // L: 430
			byte[] var6 = new byte[var3]; // L: 431
			var1.readBytes(var6, 0, var3); // L: 432
			return var6; // L: 433
		} else {
			int var4 = var1.readInt(); // L: 436
			if (var4 >= 0 && (AbstractArchive.field3171 == 0 || var4 <= AbstractArchive.field3171)) { // L: 437
				byte[] var5 = new byte[var4]; // L: 440
				if (var2 == 1) { // L: 441
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 442
				}

				return var5; // L: 443
			} else {
				throw new RuntimeException(); // L: 438
			}
		}
	}
}
