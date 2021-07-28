import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("s")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -719106667
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -261124495
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("j")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 403361141
	)
	static int field2477;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1964367721
	)
	static int field2478;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -203955225
	)
	static int field2479;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 558941443
	)
	static int field2480;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1061672799
	)
	static int field2481;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1931298313
	)
	static int field2482;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -751640175
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("a")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -99233219
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljy;III)Lom;",
		garbageValue = "-2110976883"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class290.method5208(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = class398.SpriteBuffer_spriteWidth;
			var4.height = class398.SpriteBuffer_spriteHeight;
			var4.xOffset = class398.SpriteBuffer_xOffsets[0];
			var4.yOffset = class398.SpriteBuffer_yOffsets[0];
			var4.subWidth = ClanChannelMember.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class374.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = class398.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = class118.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class398.SpriteBuffer_xOffsets = null;
			class398.SpriteBuffer_yOffsets = null;
			ClanChannelMember.SpriteBuffer_spriteWidths = null;
			class374.SpriteBuffer_spriteHeights = null;
			class118.SpriteBuffer_spritePalette = null;
			class398.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljr;",
		garbageValue = "8"
	)
	public static StudioGame[] method4318() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game3, StudioGame.oldscape, StudioGame.runescape, StudioGame.game4};
	}
}
