import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class89 {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -1242433920
	)
	static int field1140;
	@ObfuscatedName("t")
	static final BigInteger field1147;
	@ObfuscatedName("j")
	static final BigInteger field1142;

	static {
		field1147 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field1142 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-483488480"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lib;Ljava/lang/String;Ljava/lang/String;I)[Llo;",
		garbageValue = "-1519109689"
	)
	public static IndexedSprite[] method2123(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite[] var5;
		if (!class304.method5363(var0, var3, var4)) {
			var5 = null;
		} else {
			IndexedSprite[] var7 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

			for (int var8 = 0; var8 < class336.SpriteBuffer_spriteCount; ++var8) {
				IndexedSprite var9 = var7[var8] = new IndexedSprite();
				var9.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
				var9.height = class336.SpriteBuffer_spriteHeight;
				var9.xOffset = class336.SpriteBuffer_xOffsets[var8];
				var9.yOffset = class336.SpriteBuffer_yOffsets[var8];
				var9.subWidth = class336.SpriteBuffer_spriteWidths[var8];
				var9.subHeight = class336.SpriteBuffer_spriteHeights[var8];
				var9.palette = class336.SpriteBuffer_spritePalette;
				var9.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var8];
			}

			class336.SpriteBuffer_xOffsets = null;
			class336.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			class336.SpriteBuffer_spritePalette = null;
			GrandExchangeEvents.SpriteBuffer_pixels = null;
			var5 = var7;
		}

		return var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990775275"
	)
	static void method2122() {
		if (Login.clearLoginScreen) {
			WorldMapEvent.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			GZipDecompressor.runesSprite = null;
			class25.leftTitleSprite = null;
			class224.rightTitleSprite = null;
			class224.logoSprite = null;
			Login.title_muteSprite = null;
			DirectByteArrayCopier.options_buttons_0Sprite = null;
			ItemContainer.options_buttons_2Sprite = null;
			class301.worldSelectBackSprites = null;
			class90.worldSelectFlagSprites = null;
			WorldMapSectionType.worldSelectArrows = null;
			class349.worldSelectStars = null;
			class9.field42 = null;
			class1.loginScreenRunesAnimation.method1877();
			SecureRandomCallable.method1220(2);
			SoundSystem.method2564(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-373616735"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		InterfaceParent.scrollBarSprites[0].drawAt(var0, var1);
		InterfaceParent.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field711);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field712);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field714);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field714);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field714);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field714);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field713);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field713);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field713);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field713);
	}
}
