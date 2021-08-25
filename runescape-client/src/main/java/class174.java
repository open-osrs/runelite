import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class174 {
	@ObfuscatedName("m")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("k")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 978490773
	)
	static int field1991;
	@ObfuscatedName("a")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("u")
	@Export("bufferY")
	static int[] bufferY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[Loc;",
		garbageValue = "-1552339754"
	)
	public static SpritePixels[] method3364() {
		SpritePixels[] var0 = new SpritePixels[class413.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class413.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = class413.SpriteBuffer_spriteWidth;
			var2.height = class413.SpriteBuffer_spriteHeight;
			var2.xOffset = class413.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class413.SpriteBuffer_yOffsets[var1];
			var2.subWidth = InvDefinition.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class413.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class283.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = ItemContainer.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class413.SpriteBuffer_xOffsets = null;
		class413.SpriteBuffer_yOffsets = null;
		InvDefinition.SpriteBuffer_spriteWidths = null;
		class413.SpriteBuffer_spriteHeights = null;
		ItemContainer.SpriteBuffer_spritePalette = null;
		class283.SpriteBuffer_pixels = null;
		return var0;
	}
}
