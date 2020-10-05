import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1545647129
	)
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1963217868"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-1931159207"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1532284396"
	)
	public static IndexedSprite method4448() {
		IndexedSprite var0 = new IndexedSprite(); // L: 178
		var0.width = class335.SpriteBuffer_spriteWidth; // L: 179
		var0.height = class335.SpriteBuffer_spriteHeight; // L: 180
		var0.xOffset = Username.SpriteBuffer_xOffsets[0]; // L: 181
		var0.yOffset = class335.SpriteBuffer_yOffsets[0]; // L: 182
		var0.subWidth = class335.SpriteBuffer_spriteWidths[0]; // L: 183
		var0.subHeight = class335.SpriteBuffer_spriteHeights[0]; // L: 184
		var0.palette = TaskHandler.SpriteBuffer_spritePalette; // L: 185
		var0.pixels = class92.SpriteBuffer_pixels[0]; // L: 186
		Username.SpriteBuffer_xOffsets = null; // L: 188
		class335.SpriteBuffer_yOffsets = null; // L: 189
		class335.SpriteBuffer_spriteWidths = null; // L: 190
		class335.SpriteBuffer_spriteHeights = null; // L: 191
		TaskHandler.SpriteBuffer_spritePalette = null; // L: 192
		class92.SpriteBuffer_pixels = null; // L: 193
		return var0; // L: 195
	}
}
