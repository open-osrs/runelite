import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public enum class283 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3638(-1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3640(0),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3639(1),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	field3637(2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 534862973
	)
	final int field3636;

	class283(int var3) {
		this.field3636 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3636; // L: 23
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[Low;",
		garbageValue = "113976049"
	)
	static SpritePixels[] method5221() {
		SpritePixels[] var0 = new SpritePixels[class414.SpriteBuffer_spriteCount]; // L: 173

		for (int var1 = 0; var1 < class414.SpriteBuffer_spriteCount; ++var1) { // L: 174
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 175
			var2.width = class414.SpriteBuffer_spriteWidth; // L: 176
			var2.height = class414.SpriteBuffer_spriteHeight; // L: 177
			var2.xOffset = class414.SpriteBuffer_xOffsets[var1]; // L: 178
			var2.yOffset = class414.SpriteBuffer_yOffsets[var1]; // L: 179
			var2.subWidth = UrlRequester.SpriteBuffer_spriteWidths[var1]; // L: 180
			var2.subHeight = class414.SpriteBuffer_spriteHeights[var1]; // L: 181
			int var3 = var2.subHeight * var2.subWidth; // L: 182
			byte[] var4 = class295.SpriteBuffer_pixels[var1]; // L: 183
			var2.pixels = new int[var3]; // L: 184

			for (int var5 = 0; var5 < var3; ++var5) { // L: 185
				var2.pixels[var5] = HitSplatDefinition.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		PacketBuffer.method6913(); // L: 187
		return var0; // L: 188
	}
}
