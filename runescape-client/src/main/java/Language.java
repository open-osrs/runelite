import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Llf;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("w")
	final String field3928;
	@ObfuscatedName("n")
	@Export("language")
	final String language;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2145435699
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3948, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3948, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3948, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3948, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3939, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3939, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3948, 6, "MX");
		Language[] var0 = new Language[]{Language_ES_MX, Language_EN, Language_NL, Language_PT, Language_ES, Language_DE, Language_FR};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llq;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3928 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1775253348"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "316979421"
	)
	public static int method5825(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Llf;",
		garbageValue = "77"
	)
	public static Language method5826(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2031072564"
	)
	public static int[] method5840() {
		int[] var0 = new int[KeyHandler.field142];

		for (int var1 = 0; var1 < KeyHandler.field142; ++var1) {
			var0[var1] = KeyHandler.field141[var1];
		}

		return var0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llx;Llx;I)V",
		garbageValue = "-1459903356"
	)
	static void method5841(Font var0, Font var1) {
		Archive var3;
		int var4;
		int var5;
		int var9;
		int var11;
		int var13;
		if (class148.worldSelectBackSprites == null) {
			var3 = UserComparator6.archive8;
			var4 = var3.getGroupId("sl_back");
			var5 = var3.getFileId(var4, "");
			SpritePixels[] var6;
			if (!class147.method3009(var3, var4, var5)) {
				var6 = null;
			} else {
				SpritePixels[] var8 = new SpritePixels[class440.SpriteBuffer_spriteCount];
				var9 = 0;

				while (true) {
					if (var9 >= class440.SpriteBuffer_spriteCount) {
						UserComparator3.method2529();
						var6 = var8;
						break;
					}

					SpritePixels var10 = var8[var9] = new SpritePixels();
					var10.width = class432.SpriteBuffer_spriteWidth;
					var10.height = class432.SpriteBuffer_spriteHeight;
					var10.xOffset = class141.SpriteBuffer_xOffsets[var9];
					var10.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9];
					var10.subWidth = class432.SpriteBuffer_spriteWidths[var9];
					var10.subHeight = class330.SpriteBuffer_spriteHeights[var9];
					var11 = var10.subHeight * var10.subWidth;
					byte[] var12 = class369.SpriteBuffer_pixels[var9];
					var10.pixels = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) {
						var10.pixels[var13] = class432.SpriteBuffer_spritePalette[var12[var13] & 255];
					}

					++var9;
				}
			}

			class148.worldSelectBackSprites = var6;
		}

		IndexedSprite[] var30;
		IndexedSprite[] var31;
		IndexedSprite var32;
		if (AbstractArchive.worldSelectFlagSprites == null) {
			var3 = UserComparator6.archive8;
			var4 = var3.getGroupId("sl_flags");
			var5 = var3.getFileId(var4, "");
			if (!class147.method3009(var3, var4, var5)) {
				var30 = null;
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) {
					var32 = var31[var9] = new IndexedSprite();
					var32.width = class432.SpriteBuffer_spriteWidth;
					var32.height = class432.SpriteBuffer_spriteHeight;
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9];
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9];
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9];
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9];
					var32.palette = class432.SpriteBuffer_spritePalette;
					var32.pixels = class369.SpriteBuffer_pixels[var9];
				}

				UserComparator3.method2529();
				var30 = var31;
			}

			AbstractArchive.worldSelectFlagSprites = var30;
		}

		if (UserComparator3.worldSelectArrows == null) {
			var3 = UserComparator6.archive8;
			var4 = var3.getGroupId("sl_arrows");
			var5 = var3.getFileId(var4, "");
			if (!class147.method3009(var3, var4, var5)) {
				var30 = null;
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) {
					var32 = var31[var9] = new IndexedSprite();
					var32.width = class432.SpriteBuffer_spriteWidth;
					var32.height = class432.SpriteBuffer_spriteHeight;
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9];
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9];
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9];
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9];
					var32.palette = class432.SpriteBuffer_spritePalette;
					var32.pixels = class369.SpriteBuffer_pixels[var9];
				}

				UserComparator3.method2529();
				var30 = var31;
			}

			UserComparator3.worldSelectArrows = var30;
		}

		if (class112.worldSelectStars == null) {
			var3 = UserComparator6.archive8;
			var4 = var3.getGroupId("sl_stars");
			var5 = var3.getFileId(var4, "");
			if (!class147.method3009(var3, var4, var5)) {
				var30 = null;
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount];

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) {
					var32 = var31[var9] = new IndexedSprite();
					var32.width = class432.SpriteBuffer_spriteWidth;
					var32.height = class432.SpriteBuffer_spriteHeight;
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9];
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9];
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9];
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9];
					var32.palette = class432.SpriteBuffer_spritePalette;
					var32.pixels = class369.SpriteBuffer_pixels[var9];
				}

				UserComparator3.method2529();
				var30 = var31;
			}

			class112.worldSelectStars = var30;
		}

		if (class11.worldSelectLeftSprite == null) {
			class11.worldSelectLeftSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "leftarrow", "");
		}

		if (UrlRequest.worldSelectRightSprite == null) {
			UrlRequest.worldSelectRightSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class112.worldSelectStars != null) {
			class112.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class112.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (UserComparator3.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				UserComparator3.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				UserComparator3.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				UserComparator3.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				UserComparator3.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				UserComparator3.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				UserComparator3.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				UserComparator3.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				UserComparator3.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class148.worldSelectBackSprites != null) {
			byte var34 = 88;
			byte var35 = 19;
			var4 = 765 / (var34 + 1) - 1;
			var5 = 480 / (var35 + 1);

			int var24;
			int var25;
			do {
				var24 = var5;
				var25 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var24 || var4 != var25);

			var24 = (765 - var4 * var34) / (var4 + 1);
			if (var24 > 5) {
				var24 = 5;
			}

			var25 = (480 - var35 * var5) / (var5 + 1);
			if (var25 > 5) {
				var25 = 5;
			}

			int var26 = (765 - var34 * var4 - var24 * (var4 - 1)) / 2;
			var9 = (480 - var35 * var5 - var25 * (var5 - 1)) / 2;
			int var27 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var27 - var4;
			if (class11.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class11.worldSelectLeftSprite.drawAt(8, BoundaryObject.canvasHeight / 2 - class11.worldSelectLeftSprite.subHeight / 2);
			}

			if (UrlRequest.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				UrlRequest.worldSelectRightSprite.drawAt(class186.canvasWidth - UrlRequest.worldSelectRightSprite.subWidth - 8, BoundaryObject.canvasHeight / 2 - UrlRequest.worldSelectRightSprite.subHeight / 2);
			}

			var11 = var9 + 23;
			int var28 = var26 + Login.xPadding;
			var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class334.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1679()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var28 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var28 + var34 && MouseHandler.MouseHandler_y < var11 + var35 && var18) {
					Login.hoveredWorldIndex = var16;
					class148.worldSelectBackSprites[var20].drawTransOverlayAt(var28, var11, 128, 16777215);
					var14 = true;
				} else {
					class148.worldSelectBackSprites[var20].drawAt(var28, var11);
				}

				if (AbstractArchive.worldSelectFlagSprites != null) {
					AbstractArchive.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var28 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var28 + 15, var35 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var28 + 60, var35 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var25 + var35;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var28 = var28 + var24 + var34;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class334.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var29 = var1.ascent + 8;
				int var33 = MouseHandler.MouseHandler_y + 25;
				if (var33 + var29 > 480) {
					var33 = MouseHandler.MouseHandler_y - 25 - var29;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var33, var16, var29, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var33, var16, var29, 0);
				var1.drawCentered(class334.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var33 + var1.ascent + 4, 0, -1);
			}
		}

		class19.rasterProvider.drawFull(0, 0);
	}
}
