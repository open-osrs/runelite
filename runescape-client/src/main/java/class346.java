import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class346 {
	@ObfuscatedName("v")
	static char[] field4147;
	@ObfuscatedName("o")
	static char[] field4148;
	@ObfuscatedName("h")
	static char[] field4150;
	@ObfuscatedName("g")
	static int[] field4149;

	static {
		field4147 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4147[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4147[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4147[var0] = (char)(var0 + 48 - 52);
		}

		field4147[62] = '+';
		field4147[63] = '/';
		field4148 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) {
			field4148[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4148[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4148[var0] = (char)(var0 + 48 - 52);
		}

		field4148[62] = '*';
		field4148[63] = '-';
		field4150 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4150[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4150[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4150[var0] = (char)(var0 + 48 - 52);
		}

		field4150[62] = '-'; // L: 33
		field4150[63] = '_'; // L: 34
		field4149 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4149.length; ++var0) { // L: 41
			field4149[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4149[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4149[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4149[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4149; // L: 45
		field4149[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4149; // L: 48
		field4149[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;IZI)Lgo;",
		garbageValue = "2016790540"
	)
	public static Frames method6480(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;B)V",
		garbageValue = "103"
	)
	static void method6482(Font var0, Font var1) {
		if (class128.worldSelectBackSprites == null) { // L: 1808
			class128.worldSelectBackSprites = DirectByteArrayCopier.method5541(WorldMapData_1.archive8, "sl_back", "");
		}

		if (class162.worldSelectFlagSprites == null) { // L: 1809
			class162.worldSelectFlagSprites = class271.method5255(WorldMapData_1.archive8, "sl_flags", "");
		}

		if (Client.worldSelectArrows == null) { // L: 1810
			Client.worldSelectArrows = class271.method5255(WorldMapData_1.archive8, "sl_arrows", "");
		}

		if (class29.worldSelectStars == null) { // L: 1811
			class29.worldSelectStars = class271.method5255(WorldMapData_1.archive8, "sl_stars", "");
		}

		if (Interpreter.worldSelectLeftSprite == null) { // L: 1812
			Interpreter.worldSelectLeftSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "leftarrow", "");
		}

		if (class124.worldSelectRightSprite == null) { // L: 1813
			class124.worldSelectRightSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1814
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1815
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1816
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1817
		if (class29.worldSelectStars != null) { // L: 1818
			class29.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1819
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1820
			class29.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1821
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1822
		}

		int var4;
		int var5;
		if (Client.worldSelectArrows != null) { // L: 1824
			int var2 = Login.xPadding + 280; // L: 1825
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1826
				Client.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var2, 4); // L: 1827
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1828
				Client.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var2 + 15, 4); // L: 1829
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1); // L: 1830
			int var3 = Login.xPadding + 390; // L: 1831
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1832
				Client.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var3, 4); // L: 1833
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1834
				Client.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var3 + 15, 4); // L: 1835
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1); // L: 1836
			var4 = Login.xPadding + 500; // L: 1837
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1838
				Client.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var4, 4); // L: 1839
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1840
				Client.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1841
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1842
			var5 = Login.xPadding + 610; // L: 1843
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1844
				Client.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Client.worldSelectArrows[0].drawAt(var5, 4); // L: 1845
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1846
				Client.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Client.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1847
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1848
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1850
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1851
		Login.hoveredWorldIndex = -1; // L: 1852
		if (class128.worldSelectBackSprites != null) { // L: 1853
			byte var23 = 88; // L: 1854
			byte var24 = 19; // L: 1855
			var4 = 765 / (var23 + 1) - 1; // L: 1856
			var5 = 480 / (var24 + 1); // L: 1857

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1859
				var7 = var4; // L: 1860
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1861
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1862
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1863
					--var5;
				}
			} while(var5 != var6 || var7 != var4); // L: 1864

			var6 = (765 - var23 * var4) / (var4 + 1); // L: 1866
			if (var6 > 5) { // L: 1867
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1); // L: 1868
			if (var7 > 5) { // L: 1869
				var7 = 5;
			}

			int var8 = (765 - var4 * var23 - var6 * (var4 - 1)) / 2; // L: 1870
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2; // L: 1871
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1872
			Login.worldSelectPagesCount = var10 - var4; // L: 1873
			if (Interpreter.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1874
				Interpreter.worldSelectLeftSprite.drawAt(8, class309.canvasHeight / 2 - Interpreter.worldSelectLeftSprite.subHeight / 2); // L: 1875
			}

			if (class124.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1877
				class124.worldSelectRightSprite.drawAt(class4.canvasWidth - class124.worldSelectRightSprite.subWidth - 8, class309.canvasHeight / 2 - class124.worldSelectRightSprite.subHeight / 2); // L: 1878
			}

			int var11 = var9 + 23; // L: 1880
			int var12 = var8 + Login.xPadding; // L: 1881
			int var13 = 0; // L: 1882
			boolean var14 = false; // L: 1883
			int var15 = Login.worldSelectPage; // L: 1884

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1885 1886
				World var17 = World.World_worlds[var16]; // L: 1889
				boolean var18 = true; // L: 1890
				String var19 = Integer.toString(var17.population); // L: 1891
				if (var17.population == -1) { // L: 1892
					var19 = "OFF"; // L: 1893
					var18 = false; // L: 1894
				} else if (var17.population > 1980) { // L: 1896
					var19 = "FULL"; // L: 1897
					var18 = false; // L: 1898
				}

				int var21 = 0; // L: 1901
				byte var20;
				if (var17.isBeta()) { // L: 1902
					if (var17.isMembersOnly()) { // L: 1903
						var20 = 7;
					} else {
						var20 = 6; // L: 1904
					}
				} else if (var17.isDeadman()) { // L: 1906
					var21 = 16711680; // L: 1907
					if (var17.isMembersOnly()) { // L: 1908
						var20 = 5;
					} else {
						var20 = 4; // L: 1909
					}
				} else if (var17.method1638()) { // L: 1911
					if (var17.isMembersOnly()) { // L: 1912
						var20 = 9;
					} else {
						var20 = 8; // L: 1913
					}
				} else if (var17.isPvp()) { // L: 1915
					if (var17.isMembersOnly()) { // L: 1916
						var20 = 3;
					} else {
						var20 = 2; // L: 1917
					}
				} else if (var17.isMembersOnly()) { // L: 1920
					var20 = 1;
				} else {
					var20 = 0; // L: 1921
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var11 + var24 && var18) { // L: 1923
					Login.hoveredWorldIndex = var16; // L: 1924
					class128.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1925
					var14 = true; // L: 1926
				} else {
					class128.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1928
				}

				if (class162.worldSelectFlagSprites != null) { // L: 1929
					class162.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1); // L: 1930
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1); // L: 1931
				var11 = var11 + var24 + var7; // L: 1932
				++var13; // L: 1933
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1934
					var12 = var12 + var23 + var6; // L: 1935
					var13 = 0; // L: 1936
					++var15; // L: 1937
				}
			}

			if (var14) { // L: 1940
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1941
				int var22 = var1.ascent + 8; // L: 1942
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1943
				if (var25 + var22 > 480) { // L: 1944
					var25 = MouseHandler.MouseHandler_y - 25 - var22; // L: 1945
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120); // L: 1947
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0); // L: 1948
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1949
			}
		}

		SpotAnimationDefinition.rasterProvider.drawFull(0, 0); // L: 1952
	} // L: 1953
}
