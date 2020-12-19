import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class89 {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 392946669
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
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lib;Ljava/lang/String;Ljava/lang/String;I)[Llo;",
		garbageValue = "-1519109689"
	)
	public static IndexedSprite[] method2123(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 87
		int var4 = var0.getFileId(var3, var2); // L: 88
		IndexedSprite[] var5;
		if (!class304.method5363(var0, var3, var4)) { // L: 91
			var5 = null; // L: 92
		} else {
			IndexedSprite[] var7 = new IndexedSprite[class336.SpriteBuffer_spriteCount]; // L: 97

			for (int var8 = 0; var8 < class336.SpriteBuffer_spriteCount; ++var8) { // L: 98
				IndexedSprite var9 = var7[var8] = new IndexedSprite(); // L: 99
				var9.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 100
				var9.height = class336.SpriteBuffer_spriteHeight; // L: 101
				var9.xOffset = class336.SpriteBuffer_xOffsets[var8]; // L: 102
				var9.yOffset = class336.SpriteBuffer_yOffsets[var8]; // L: 103
				var9.subWidth = class336.SpriteBuffer_spriteWidths[var8]; // L: 104
				var9.subHeight = class336.SpriteBuffer_spriteHeights[var8]; // L: 105
				var9.palette = class336.SpriteBuffer_spritePalette; // L: 106
				var9.pixels = GrandExchangeEvents.SpriteBuffer_pixels[var8]; // L: 107
			}

			class336.SpriteBuffer_xOffsets = null; // L: 110
			class336.SpriteBuffer_yOffsets = null; // L: 111
			class336.SpriteBuffer_spriteWidths = null; // L: 112
			class336.SpriteBuffer_spriteHeights = null; // L: 113
			class336.SpriteBuffer_spritePalette = null; // L: 114
			GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 115
			var5 = var7; // L: 119
		}

		return var5; // L: 121
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990775275"
	)
	static void method2122() {
		if (Login.clearLoginScreen) { // L: 217
			WorldMapEvent.titleboxSprite = null; // L: 218
			Login.titlebuttonSprite = null; // L: 219
			GZipDecompressor.runesSprite = null; // L: 220
			class25.leftTitleSprite = null; // L: 221
			class224.rightTitleSprite = null; // L: 222
			class224.logoSprite = null; // L: 223
			Login.title_muteSprite = null; // L: 224
			DirectByteArrayCopier.options_buttons_0Sprite = null; // L: 225
			ItemContainer.options_buttons_2Sprite = null; // L: 226
			class301.worldSelectBackSprites = null; // L: 227
			class90.worldSelectFlagSprites = null; // L: 228
			WorldMapSectionType.worldSelectArrows = null; // L: 229
			class349.worldSelectStars = null; // L: 230
			class9.field42 = null; // L: 231
			class1.loginScreenRunesAnimation.method1877(); // L: 232
			SecureRandomCallable.method1220(2); // L: 233
			SoundSystem.method2564(true); // L: 234
			Login.clearLoginScreen = false; // L: 235
		}
	} // L: 236

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-373616735"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		InterfaceParent.scrollBarSprites[0].drawAt(var0, var1); // L: 9564
		InterfaceParent.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 9565
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field711); // L: 9566
		int var5 = var3 * (var3 - 32) / var4; // L: 9567
		if (var5 < 8) { // L: 9568
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 9569
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field712); // L: 9570
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field714); // L: 9571
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field714); // L: 9572
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field714); // L: 9573
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field714); // L: 9574
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field713); // L: 9575
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field713); // L: 9576
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field713); // L: 9577
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field713); // L: 9578
	} // L: 9579
}
