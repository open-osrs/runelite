import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1517212731
	)
	static int field3215;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1591895723
	)
	static int field3218;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1173180629
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 834297023
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("s")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("e")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 727
		this.height = var2; // L: 728
		this.xWidths = var3; // L: 729
		this.xStarts = var4; // L: 730
	} // L: 731

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "603943300"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 734
			int var3 = this.xStarts[var2]; // L: 735
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 736
				return true;
			}
		}

		return false; // L: 738
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;B)V",
		garbageValue = "7"
	)
	public static void method5324(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method5325(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field131[var0] : false; // L: 256 257
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lpt;",
		garbageValue = "90"
	)
	static SpritePixels method5322() {
		SpritePixels var0 = new SpritePixels(); // L: 122
		var0.width = class434.SpriteBuffer_spriteWidth; // L: 123
		var0.height = class434.SpriteBuffer_spriteHeight; // L: 124
		var0.xOffset = class434.SpriteBuffer_xOffsets[0]; // L: 125
		var0.yOffset = class434.SpriteBuffer_yOffsets[0]; // L: 126
		var0.subWidth = class434.SpriteBuffer_spriteWidths[0]; // L: 127
		var0.subHeight = Fonts.SpriteBuffer_spriteHeights[0]; // L: 128
		int var1 = var0.subWidth * var0.subHeight; // L: 129
		byte[] var2 = WorldMapLabelSize.SpriteBuffer_pixels[0]; // L: 130
		var0.pixels = new int[var1]; // L: 131

		for (int var3 = 0; var3 < var1; ++var3) { // L: 132
			var0.pixels[var3] = HealthBarUpdate.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		Canvas.method365(); // L: 133
		return var0; // L: 134
	}
}
