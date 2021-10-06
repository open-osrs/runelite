import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("t")
	@Export("name")
	public final String name;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1358867387
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-183027792"
	)
	public static void method5130() {
		class135.SpriteBuffer_xOffsets = null;
		class131.SpriteBuffer_yOffsets = null;
		class414.SpriteBuffer_spriteWidths = null;
		class16.SpriteBuffer_spriteHeights = null;
		class351.SpriteBuffer_spritePalette = null;
		class414.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIILon;Liw;B)V",
		garbageValue = "-74"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7318(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
