import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "[Lgz;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("u")
	final String field2396;
	@ObfuscatedName("a")
	@Export("language")
	final String language;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1862658961
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2412, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2412, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2412, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2412, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2405, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2405, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2412, 6, "MX");
		Language[] var0 = method3783();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lge;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2396 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-15"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Llf;III)I",
		garbageValue = "924911925"
	)
	static int method3801(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)[Lgz;",
		garbageValue = "1898345943"
	)
	static Language[] method3783() {
		return new Language[]{Language_EN, Language_DE, Language_ES, Language_ES_MX, Language_PT, Language_FR, Language_NL};
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IB)Lbr;",
		garbageValue = "-87"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)Lgz;",
		garbageValue = "-67"
	)
	@Export("Language_get")
	public static Language Language_get(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("u")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lko;Lko;I)V",
		garbageValue = "916076858"
	)
	static void method3786(Font var0, Font var1) {
		int var4;
		int var5;
		if (class90.worldSelectBackSprites == null) {
			Archive var3 = GrandExchangeEvent.archive8;
			var4 = var3.getGroupId("sl_back");
			var5 = var3.getFileId(var4, "");
			Sprite[] var2 = class217.method4091(var3, var4, var5);
			class90.worldSelectBackSprites = var2;
		}

		if (SpotAnimationDefinition.worldSelectFlagSprites == null) {
			SpotAnimationDefinition.worldSelectFlagSprites = PendingSpawn.method1806(GrandExchangeEvent.archive8, "sl_flags", "");
		}

		if (GrandExchangeEvent.worldSelectArrows == null) {
			GrandExchangeEvent.worldSelectArrows = PendingSpawn.method1806(GrandExchangeEvent.archive8, "sl_arrows", "");
		}

		if (class228.worldSelectStars == null) {
			class228.worldSelectStars = PendingSpawn.method1806(GrandExchangeEvent.archive8, "sl_stars", "");
		}

		if (class13.worldSelectLeftSprite == null) {
			class13.worldSelectLeftSprite = class329.SpriteBuffer_getIndexedSpriteByName(GrandExchangeEvent.archive8, "leftarrow", "");
		}

		if (ClientPreferences.worldSelectRightSprite == null) {
			ClientPreferences.worldSelectRightSprite = class329.SpriteBuffer_getIndexedSpriteByName(GrandExchangeEvent.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class228.worldSelectStars != null) {
			class228.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class228.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (GrandExchangeEvent.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				GrandExchangeEvent.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				GrandExchangeEvent.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				GrandExchangeEvent.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				GrandExchangeEvent.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				GrandExchangeEvent.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				GrandExchangeEvent.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				GrandExchangeEvent.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				GrandExchangeEvent.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				GrandExchangeEvent.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class90.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var6 != var5 || var7 != var4);

			var6 = (765 - var4 * var26) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var27 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class13.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class13.worldSelectLeftSprite.drawAt(8, class52.canvasHeight / 2 - class13.worldSelectLeftSprite.subHeight / 2);
			}

			if (ClientPreferences.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				ClientPreferences.worldSelectRightSprite.drawAt(Varcs.canvasWidth - ClientPreferences.worldSelectRightSprite.subWidth - 8, class52.canvasHeight / 2 - ClientPreferences.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var24 = class13.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var24.population);
				if (var24.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var24.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				int var21 = 0;
				byte var20;
				if (var24.isBeta()) {
					if (var24.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var24.isDeadman()) {
					var21 = 16711680;
					if (var24.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var24.method1835()) {
					if (var24.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var24.isPvp()) {
					if (var24.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var24.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					class90.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class90.worldSelectBackSprites[var20].drawAt(var12, var11);
				}

				if (SpotAnimationDefinition.worldSelectFlagSprites != null) {
					SpotAnimationDefinition.worldSelectFlagSprites[(var24.isMembersOnly() ? 8 : 0) + var24.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var24.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var27 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var6 + var26;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class13.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var17 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var17 + var25 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var17;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var17, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var17, 0);
				var1.drawCentered(class13.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

		ArchiveLoader.rasterProvider.drawFull(0, 0);
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "179125696"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var9 * var7 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1826045916"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (UserComparator4.loadInterface(var0)) {
			Skeleton.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
		}
	}
}
