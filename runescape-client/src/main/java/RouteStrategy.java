import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1047579843
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1846311175
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1025962081
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -881860999
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIILft;I)Z",
		garbageValue = "-1274441547"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;III)Lkr;",
		garbageValue = "87805054"
	)
	public static Font method3688(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 111
		boolean var4;
		if (var5 == null) { // L: 112
			var4 = false; // L: 113
		} else {
			Occluder.SpriteBuffer_decode(var5); // L: 116
			var4 = true; // L: 117
		}

		if (!var4) { // L: 119
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 121
			Font var8;
			if (var6 == null) { // L: 123
				var8 = null; // L: 124
			} else {
				Font var7 = new Font(var6, Username.SpriteBuffer_xOffsets, class335.SpriteBuffer_yOffsets, class335.SpriteBuffer_spriteWidths, class335.SpriteBuffer_spriteHeights, TaskHandler.SpriteBuffer_spritePalette, class92.SpriteBuffer_pixels); // L: 127
				Username.SpriteBuffer_xOffsets = null; // L: 129
				class335.SpriteBuffer_yOffsets = null; // L: 130
				class335.SpriteBuffer_spriteWidths = null; // L: 131
				class335.SpriteBuffer_spriteHeights = null; // L: 132
				TaskHandler.SpriteBuffer_spritePalette = null; // L: 133
				class92.SpriteBuffer_pixels = null; // L: 134
				var8 = var7; // L: 136
			}

			return var8; // L: 138
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1480468521"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (IntHashTable.pcmPlayer1 != null) { // L: 3254
			IntHashTable.pcmPlayer1.run();
		}

		if (WorldMapManager.pcmPlayer0 != null) { // L: 3255
			WorldMapManager.pcmPlayer0.run();
		}

	} // L: 3256
}
