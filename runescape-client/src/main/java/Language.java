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
		Language_EN = new Language("EN", "en", "English", ModeWhere.field3948, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field3948, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field3948, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field3948, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field3939, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3939, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3948, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_ES_MX, Language_EN, Language_NL, Language_PT, Language_ES, Language_DE, Language_FR}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 33
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException(); // L: 37
			}

			Language_valuesOrdered[var4.id] = var4; // L: 39
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llq;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field3928 = var1;
		this.language = var2;
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1775253348"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "316979421"
	)
	public static int method5825(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 42
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 43
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 44
		var0 += var0 >>> 8; // L: 45
		var0 += var0 >>> 16; // L: 46
		return var0 & 255; // L: 47
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Llf;",
		garbageValue = "77"
	)
	public static Language method5826(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2031072564"
	)
	public static int[] method5840() {
		int[] var0 = new int[KeyHandler.field142]; // L: 259

		for (int var1 = 0; var1 < KeyHandler.field142; ++var1) { // L: 260
			var0[var1] = KeyHandler.field141[var1]; // L: 261
		}

		return var0; // L: 263
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
		if (class148.worldSelectBackSprites == null) { // L: 1671
			var3 = UserComparator6.archive8; // L: 1673
			var4 = var3.getGroupId("sl_back"); // L: 1675
			var5 = var3.getFileId(var4, ""); // L: 1676
			SpritePixels[] var6;
			if (!class147.method3009(var3, var4, var5)) { // L: 1679
				var6 = null; // L: 1680
			} else {
				SpritePixels[] var8 = new SpritePixels[class440.SpriteBuffer_spriteCount]; // L: 1685
				var9 = 0;

				while (true) {
					if (var9 >= class440.SpriteBuffer_spriteCount) {
						UserComparator3.method2529(); // L: 1699
						var6 = var8; // L: 1702
						break;
					}

					SpritePixels var10 = var8[var9] = new SpritePixels(); // L: 1687
					var10.width = class432.SpriteBuffer_spriteWidth; // L: 1688
					var10.height = class432.SpriteBuffer_spriteHeight; // L: 1689
					var10.xOffset = class141.SpriteBuffer_xOffsets[var9]; // L: 1690
					var10.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9]; // L: 1691
					var10.subWidth = class432.SpriteBuffer_spriteWidths[var9]; // L: 1692
					var10.subHeight = class330.SpriteBuffer_spriteHeights[var9]; // L: 1693
					var11 = var10.subHeight * var10.subWidth; // L: 1694
					byte[] var12 = class369.SpriteBuffer_pixels[var9]; // L: 1695
					var10.pixels = new int[var11]; // L: 1696

					for (var13 = 0; var13 < var11; ++var13) { // L: 1697
						var10.pixels[var13] = class432.SpriteBuffer_spritePalette[var12[var13] & 255];
					}

					++var9; // L: 1686
				}
			}

			class148.worldSelectBackSprites = var6; // L: 1706
		}

		IndexedSprite[] var30;
		IndexedSprite[] var31;
		IndexedSprite var32;
		if (AbstractArchive.worldSelectFlagSprites == null) { // L: 1708
			var3 = UserComparator6.archive8; // L: 1710
			var4 = var3.getGroupId("sl_flags"); // L: 1712
			var5 = var3.getFileId(var4, ""); // L: 1713
			if (!class147.method3009(var3, var4, var5)) { // L: 1716
				var30 = null; // L: 1717
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 1722

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) { // L: 1723
					var32 = var31[var9] = new IndexedSprite(); // L: 1724
					var32.width = class432.SpriteBuffer_spriteWidth; // L: 1725
					var32.height = class432.SpriteBuffer_spriteHeight; // L: 1726
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9]; // L: 1727
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9]; // L: 1728
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9]; // L: 1729
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9]; // L: 1730
					var32.palette = class432.SpriteBuffer_spritePalette; // L: 1731
					var32.pixels = class369.SpriteBuffer_pixels[var9]; // L: 1732
				}

				UserComparator3.method2529(); // L: 1734
				var30 = var31; // L: 1737
			}

			AbstractArchive.worldSelectFlagSprites = var30; // L: 1741
		}

		if (UserComparator3.worldSelectArrows == null) { // L: 1743
			var3 = UserComparator6.archive8; // L: 1745
			var4 = var3.getGroupId("sl_arrows"); // L: 1747
			var5 = var3.getFileId(var4, ""); // L: 1748
			if (!class147.method3009(var3, var4, var5)) { // L: 1751
				var30 = null; // L: 1752
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 1757

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) { // L: 1758
					var32 = var31[var9] = new IndexedSprite(); // L: 1759
					var32.width = class432.SpriteBuffer_spriteWidth; // L: 1760
					var32.height = class432.SpriteBuffer_spriteHeight; // L: 1761
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9]; // L: 1762
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9]; // L: 1763
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9]; // L: 1764
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9]; // L: 1765
					var32.palette = class432.SpriteBuffer_spritePalette; // L: 1766
					var32.pixels = class369.SpriteBuffer_pixels[var9]; // L: 1767
				}

				UserComparator3.method2529(); // L: 1769
				var30 = var31; // L: 1772
			}

			UserComparator3.worldSelectArrows = var30; // L: 1776
		}

		if (class112.worldSelectStars == null) { // L: 1778
			var3 = UserComparator6.archive8; // L: 1780
			var4 = var3.getGroupId("sl_stars"); // L: 1782
			var5 = var3.getFileId(var4, ""); // L: 1783
			if (!class147.method3009(var3, var4, var5)) { // L: 1786
				var30 = null; // L: 1787
			} else {
				var31 = new IndexedSprite[class440.SpriteBuffer_spriteCount]; // L: 1792

				for (var9 = 0; var9 < class440.SpriteBuffer_spriteCount; ++var9) { // L: 1793
					var32 = var31[var9] = new IndexedSprite(); // L: 1794
					var32.width = class432.SpriteBuffer_spriteWidth; // L: 1795
					var32.height = class432.SpriteBuffer_spriteHeight; // L: 1796
					var32.xOffset = class141.SpriteBuffer_xOffsets[var9]; // L: 1797
					var32.yOffset = RouteStrategy.SpriteBuffer_yOffsets[var9]; // L: 1798
					var32.subWidth = class432.SpriteBuffer_spriteWidths[var9]; // L: 1799
					var32.subHeight = class330.SpriteBuffer_spriteHeights[var9]; // L: 1800
					var32.palette = class432.SpriteBuffer_spritePalette; // L: 1801
					var32.pixels = class369.SpriteBuffer_pixels[var9]; // L: 1802
				}

				UserComparator3.method2529(); // L: 1804
				var30 = var31; // L: 1807
			}

			class112.worldSelectStars = var30; // L: 1811
		}

		if (class11.worldSelectLeftSprite == null) { // L: 1813
			class11.worldSelectLeftSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "leftarrow", "");
		}

		if (UrlRequest.worldSelectRightSprite == null) { // L: 1814
			UrlRequest.worldSelectRightSprite = ClientPreferences.SpriteBuffer_getIndexedSpriteByName(UserComparator6.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1815
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1816
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1817
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1818
		if (class112.worldSelectStars != null) { // L: 1819
			class112.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1820
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1821
			class112.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1822
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1823
		}

		if (UserComparator3.worldSelectArrows != null) { // L: 1825
			int var22 = Login.xPadding + 280; // L: 1826
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1827
				UserComparator3.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var22, 4); // L: 1828
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1829
				UserComparator3.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1830
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1831
			int var23 = Login.xPadding + 390; // L: 1832
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1833
				UserComparator3.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var23, 4); // L: 1834
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1835
				UserComparator3.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1836
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1837
			var4 = Login.xPadding + 500; // L: 1838
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1839
				UserComparator3.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var4, 4); // L: 1840
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1841
				UserComparator3.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1842
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1843
			var5 = Login.xPadding + 610; // L: 1844
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1845
				UserComparator3.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				UserComparator3.worldSelectArrows[0].drawAt(var5, 4); // L: 1846
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1847
				UserComparator3.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				UserComparator3.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1848
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1849
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1851
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1852
		Login.hoveredWorldIndex = -1; // L: 1853
		if (class148.worldSelectBackSprites != null) { // L: 1854
			byte var34 = 88; // L: 1855
			byte var35 = 19; // L: 1856
			var4 = 765 / (var34 + 1) - 1; // L: 1857
			var5 = 480 / (var35 + 1); // L: 1858

			int var24;
			int var25;
			do {
				var24 = var5; // L: 1860
				var25 = var4; // L: 1861
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1862
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1863
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1864
					--var5;
				}
			} while(var5 != var24 || var4 != var25); // L: 1865

			var24 = (765 - var4 * var34) / (var4 + 1); // L: 1867
			if (var24 > 5) { // L: 1868
				var24 = 5;
			}

			var25 = (480 - var35 * var5) / (var5 + 1); // L: 1869
			if (var25 > 5) { // L: 1870
				var25 = 5;
			}

			int var26 = (765 - var34 * var4 - var24 * (var4 - 1)) / 2; // L: 1871
			var9 = (480 - var35 * var5 - var25 * (var5 - 1)) / 2; // L: 1872
			int var27 = (var5 + World.World_count - 1) / var5; // L: 1873
			Login.worldSelectPagesCount = var27 - var4; // L: 1874
			if (class11.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1875
				class11.worldSelectLeftSprite.drawAt(8, BoundaryObject.canvasHeight / 2 - class11.worldSelectLeftSprite.subHeight / 2); // L: 1876
			}

			if (UrlRequest.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1878
				UrlRequest.worldSelectRightSprite.drawAt(class186.canvasWidth - UrlRequest.worldSelectRightSprite.subWidth - 8, BoundaryObject.canvasHeight / 2 - UrlRequest.worldSelectRightSprite.subHeight / 2); // L: 1879
			}

			var11 = var9 + 23; // L: 1881
			int var28 = var26 + Login.xPadding; // L: 1882
			var13 = 0; // L: 1883
			boolean var14 = false; // L: 1884
			int var15 = Login.worldSelectPage; // L: 1885

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1886 1887
				World var17 = class334.World_worlds[var16]; // L: 1890
				boolean var18 = true; // L: 1891
				String var19 = Integer.toString(var17.population); // L: 1892
				if (var17.population == -1) { // L: 1893
					var19 = "OFF"; // L: 1894
					var18 = false; // L: 1895
				} else if (var17.population > 1980) { // L: 1897
					var19 = "FULL"; // L: 1898
					var18 = false; // L: 1899
				}

				int var21 = 0; // L: 1902
				byte var20;
				if (var17.isBeta()) { // L: 1903
					if (var17.isMembersOnly()) { // L: 1904
						var20 = 7;
					} else {
						var20 = 6; // L: 1905
					}
				} else if (var17.isDeadman()) { // L: 1907
					var21 = 16711680; // L: 1908
					if (var17.isMembersOnly()) { // L: 1909
						var20 = 5;
					} else {
						var20 = 4; // L: 1910
					}
				} else if (var17.method1679()) { // L: 1912
					if (var17.isMembersOnly()) { // L: 1913
						var20 = 9;
					} else {
						var20 = 8; // L: 1914
					}
				} else if (var17.isPvp()) { // L: 1916
					if (var17.isMembersOnly()) { // L: 1917
						var20 = 3;
					} else {
						var20 = 2; // L: 1918
					}
				} else if (var17.isMembersOnly()) { // L: 1921
					var20 = 1;
				} else {
					var20 = 0; // L: 1922
				}

				if (MouseHandler.MouseHandler_x >= var28 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var28 + var34 && MouseHandler.MouseHandler_y < var11 + var35 && var18) { // L: 1924
					Login.hoveredWorldIndex = var16; // L: 1925
					class148.worldSelectBackSprites[var20].drawTransOverlayAt(var28, var11, 128, 16777215); // L: 1926
					var14 = true; // L: 1927
				} else {
					class148.worldSelectBackSprites[var20].drawAt(var28, var11); // L: 1929
				}

				if (AbstractArchive.worldSelectFlagSprites != null) { // L: 1930
					AbstractArchive.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var28 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var28 + 15, var35 / 2 + var11 + 5, var21, -1); // L: 1931
				var1.drawCentered(var19, var28 + 60, var35 / 2 + var11 + 5, 268435455, -1); // L: 1932
				var11 = var11 + var25 + var35; // L: 1933
				++var13; // L: 1934
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1935
					var28 = var28 + var24 + var34; // L: 1936
					var13 = 0; // L: 1937
					++var15; // L: 1938
				}
			}

			if (var14) { // L: 1941
				var16 = var1.stringWidth(class334.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1942
				int var29 = var1.ascent + 8; // L: 1943
				int var33 = MouseHandler.MouseHandler_y + 25; // L: 1944
				if (var33 + var29 > 480) { // L: 1945
					var33 = MouseHandler.MouseHandler_y - 25 - var29; // L: 1946
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var33, var16, var29, 16777120); // L: 1948
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var33, var16, var29, 0); // L: 1949
				var1.drawCentered(class334.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var33 + var1.ascent + 4, 0, -1); // L: 1950
			}
		}

		class19.rasterProvider.drawFull(0, 0); // L: 1953
	} // L: 1954
}
