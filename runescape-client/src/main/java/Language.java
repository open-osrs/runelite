import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lq")
@Implements("Language")
public class Language implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Llq;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("s")
	final String field4120;
	@ObfuscatedName("r")
	@Export("language")
	final String language;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1541903629
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4125, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4125, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4125, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4125, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4130, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4130, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4125, 6, "MX"); // L: 18
		Language[] var0 = new Language[]{Language_FR, Language_NL, Language_DE, Language_ES, Language_ES_MX, Language_EN, Language_PT}; // L: 27
		Language_valuesOrdered = new Language[var0.length]; // L: 30
		Language[] var2 = var0; // L: 32

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 33
			Language var4 = var2[var3]; // L: 34
			if (Language_valuesOrdered[var4.id] != null) { // L: 36
				throw new IllegalStateException(); // L: 37
			}

			Language_valuesOrdered[var4.id] = var4; // L: 39
		}

	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4120 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 68
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-380169429"
	)
	static char method5877(char var0) {
		switch(var0) { // L: 103
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 163
		case '#':
		case '[':
		case ']':
			return var0; // L: 135
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 128
		case 'Ç':
		case 'ç':
			return 'c'; // L: 117
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 144
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 172
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 131
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 114
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 153
		case 'ß':
			return 'b'; // L: 155
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 158
		default:
			return Character.toLowerCase(var0); // L: 165
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;I)V",
		garbageValue = "412458899"
	)
	static void method5885(Font var0, Font var1) {
		if (GameEngine.worldSelectBackSprites == null) { // L: 1661
			GameEngine.worldSelectBackSprites = Frames.method4218(class305.archive8, "sl_back", "");
		}

		IndexedSprite[] var2;
		Archive var3;
		int var4;
		int var5;
		if (class260.worldSelectFlagSprites == null) { // L: 1662
			var3 = class305.archive8; // L: 1664
			var4 = var3.getGroupId("sl_flags"); // L: 1666
			var5 = var3.getFileId(var4, ""); // L: 1667
			var2 = ItemContainer.method2062(var3, var4, var5); // L: 1668
			class260.worldSelectFlagSprites = var2; // L: 1670
		}

		if (class114.worldSelectArrows == null) { // L: 1672
			var3 = class305.archive8; // L: 1674
			var4 = var3.getGroupId("sl_arrows"); // L: 1676
			var5 = var3.getFileId(var4, ""); // L: 1677
			var2 = ItemContainer.method2062(var3, var4, var5); // L: 1678
			class114.worldSelectArrows = var2; // L: 1680
		}

		if (class267.worldSelectStars == null) { // L: 1682
			var3 = class305.archive8; // L: 1684
			var4 = var3.getGroupId("sl_stars"); // L: 1686
			var5 = var3.getFileId(var4, ""); // L: 1687
			var2 = ItemContainer.method2062(var3, var4, var5); // L: 1688
			class267.worldSelectStars = var2; // L: 1690
		}

		if (class126.worldSelectLeftSprite == null) { // L: 1692
			class126.worldSelectLeftSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "leftarrow", "");
		}

		if (class424.worldSelectRightSprite == null) { // L: 1693
			class424.worldSelectRightSprite = JagexCache.SpriteBuffer_getIndexedSpriteByName(class305.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1694
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1695
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1696
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1697
		if (class267.worldSelectStars != null) { // L: 1698
			class267.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1699
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1700
			class267.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1701
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1702
		}

		if (class114.worldSelectArrows != null) { // L: 1704
			int var22 = Login.xPadding + 280; // L: 1705
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1706
				class114.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var22, 4); // L: 1707
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1708
				class114.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1709
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1710
			int var23 = Login.xPadding + 390; // L: 1711
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1712
				class114.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var23, 4); // L: 1713
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1714
				class114.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1715
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1716
			var4 = Login.xPadding + 500; // L: 1717
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1718
				class114.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var4, 4); // L: 1719
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1720
				class114.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1721
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1722
			var5 = Login.xPadding + 610; // L: 1723
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1724
				class114.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class114.worldSelectArrows[0].drawAt(var5, 4); // L: 1725
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1726
				class114.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class114.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1727
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1728
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1730
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1731
		Login.hoveredWorldIndex = -1; // L: 1732
		if (GameEngine.worldSelectBackSprites != null) { // L: 1733
			byte var26 = 88; // L: 1734
			byte var27 = 19; // L: 1735
			var4 = 765 / (var26 + 1) - 1; // L: 1736
			var5 = 480 / (var27 + 1); // L: 1737

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1739
				var7 = var4; // L: 1740
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1741
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1742
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1743
					--var5;
				}
			} while(var5 != var6 || var4 != var7); // L: 1744

			var6 = (765 - var26 * var4) / (var4 + 1); // L: 1746
			if (var6 > 5) { // L: 1747
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1); // L: 1748
			if (var7 > 5) { // L: 1749
				var7 = 5;
			}

			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2; // L: 1750
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2; // L: 1751
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1752
			Login.worldSelectPagesCount = var10 - var4; // L: 1753
			if (class126.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1754
				class126.worldSelectLeftSprite.drawAt(8, class433.canvasHeight / 2 - class126.worldSelectLeftSprite.subHeight / 2); // L: 1755
			}

			if (class424.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1757
				class424.worldSelectRightSprite.drawAt(GraphicsObject.canvasWidth - class424.worldSelectRightSprite.subWidth - 8, class433.canvasHeight / 2 - class424.worldSelectRightSprite.subHeight / 2); // L: 1758
			}

			int var11 = var9 + 23; // L: 1760
			int var12 = var8 + Login.xPadding; // L: 1761
			int var13 = 0; // L: 1762
			boolean var14 = false; // L: 1763
			int var15 = Login.worldSelectPage; // L: 1764

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1765 1766
				World var17 = World.World_worlds[var16]; // L: 1769
				boolean var18 = true; // L: 1770
				String var19 = Integer.toString(var17.population); // L: 1771
				if (var17.population == -1) { // L: 1772
					var19 = "OFF"; // L: 1773
					var18 = false; // L: 1774
				} else if (var17.population > 1980) { // L: 1776
					var19 = "FULL"; // L: 1777
					var18 = false; // L: 1778
				}

				int var21 = 0; // L: 1781
				byte var20;
				if (var17.isBeta()) { // L: 1782
					if (var17.isMembersOnly()) { // L: 1783
						var20 = 7;
					} else {
						var20 = 6; // L: 1784
					}
				} else if (var17.isDeadman()) { // L: 1786
					var21 = 16711680; // L: 1787
					if (var17.isMembersOnly()) { // L: 1788
						var20 = 5;
					} else {
						var20 = 4; // L: 1789
					}
				} else if (var17.method1619()) { // L: 1791
					if (var17.isMembersOnly()) { // L: 1792
						var20 = 9;
					} else {
						var20 = 8; // L: 1793
					}
				} else if (var17.isPvp()) { // L: 1795
					if (var17.isMembersOnly()) { // L: 1796
						var20 = 3;
					} else {
						var20 = 2; // L: 1797
					}
				} else if (var17.isMembersOnly()) { // L: 1800
					var20 = 1;
				} else {
					var20 = 0; // L: 1801
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) { // L: 1803
					Login.hoveredWorldIndex = var16; // L: 1804
					GameEngine.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1805
					var14 = true; // L: 1806
				} else {
					GameEngine.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1808
				}

				if (class260.worldSelectFlagSprites != null) { // L: 1809
					class260.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 1810
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 1811
				var11 = var11 + var7 + var27; // L: 1812
				++var13; // L: 1813
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1814
					var12 = var12 + var6 + var26; // L: 1815
					var13 = 0; // L: 1816
					++var15; // L: 1817
				}
			}

			if (var14) { // L: 1820
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1821
				int var24 = var1.ascent + 8; // L: 1822
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1823
				if (var25 + var24 > 480) { // L: 1824
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1825
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 1827
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 1828
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1829
			}
		}

		DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0); // L: 1832
	} // L: 1833

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-27"
	)
	static int method5884(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2710
			if (class358.guestClanSettings != null) { // L: 2711
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 2712
				FontName.field4583 = class358.guestClanSettings; // L: 2713
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2715
			}

			return 1; // L: 2716
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2718
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2719
				if (Client.currentClanSettings[var3] != null) { // L: 2720
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 2721
					FontName.field4583 = Client.currentClanSettings[var3]; // L: 2722
				} else {
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2724
				}

				return 1; // L: 2725
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2727
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.name; // L: 2728
				return 1; // L: 2729
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2731
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.allowGuests ? 1 : 0; // L: 2732
				return 1; // L: 2733
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2735
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1633; // L: 2736
				return 1; // L: 2737
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2739
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1641; // L: 2740
				return 1; // L: 2741
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2743
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1642; // L: 2744
				return 1; // L: 2745
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2747
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1648; // L: 2748
				return 1; // L: 2749
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2751
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.memberCount; // L: 2752
				return 1; // L: 2753
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2755
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2756
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.memberNames[var3]; // L: 2757
				return 1; // L: 2758
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2760
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2761
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.memberRanks[var3]; // L: 2762
				return 1; // L: 2763
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2765
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.bannedMemberCount; // L: 2766
				return 1; // L: 2767
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2769
				var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2770
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = FontName.field4583.bannedMemberNames[var3]; // L: 2771
				return 1; // L: 2772
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2774
					class12.Interpreter_intStackSize -= 3; // L: 2775
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2776
					var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2777
					var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 2778
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.method2885(var3, var6, var5); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2782
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.currentOwner; // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2786
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1652; // L: 2787
					return 1; // L: 2788
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2790
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.method2884(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]); // L: 2791
					return 1; // L: 2792
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2794
					Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = FontName.field4583.getSortedMembers()[Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]]; // L: 2795
					return 1; // L: 2796
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2798
					class12.Interpreter_intStackSize -= 2; // L: 2799
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2800
					var6 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 2801
					class142.method2967(var6, var3); // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2805
					var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2806
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1649[var3]; // L: 2807
					return 1; // L: 2808
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2810
						class12.Interpreter_intStackSize -= 3; // L: 2811
						var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 2812
						boolean var4 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1] == 1; // L: 2813
						var5 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 2814
						class168.method3251(var5, var3, var4); // L: 2815
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2817
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2818
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = FontName.field4583.field1650[var3] ? 1 : 0; // L: 2819
						return 1; // L: 2820
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2822
						if (UserComparator10.guestClanChannel != null) { // L: 2823
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 2824
							class1.field2 = UserComparator10.guestClanChannel; // L: 2825
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2827
						}

						return 1; // L: 2828
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2830
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2831
						if (Client.currentClanChannels[var3] != null) { // L: 2832
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 1; // L: 2833
							class1.field2 = Client.currentClanChannels[var3]; // L: 2834
							class121.field1529 = var3; // L: 2835
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 2837
						}

						return 1; // L: 2838
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2840
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = class1.field2.name; // L: 2841
						return 1; // L: 2842
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2844
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.field1706; // L: 2845
						return 1; // L: 2846
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2848
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.field1711; // L: 2849
						return 1; // L: 2850
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2852
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.method3005(); // L: 2853
						return 1; // L: 2854
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2856
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2857
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).username.getName(); // L: 2858
						return 1; // L: 2859
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2861
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2862
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).rank; // L: 2863
						return 1; // L: 2864
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2866
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2867
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field2.members.get(var3)).world; // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2871
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2872
						InterfaceParent.method2069(class121.field1529, var3); // L: 2873
						return 1; // L: 2874
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2876
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class1.field2.method3023(Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]); // L: 2877
						return 1; // L: 2878
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2880
						Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1] = class1.field2.getSortedMembers()[Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize - 1]]; // L: 2881
						return 1; // L: 2882
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2884
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = UserComparator8.field1378 != null ? 1 : 0; // L: 2885
						return 1; // L: 2886
					} else {
						return 2; // L: 2888
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "([Lki;IIIZB)V",
		garbageValue = "74"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10781
			Widget var6 = var0[var5]; // L: 10782
			if (var6 != null && var6.parentId == var1) { // L: 10783 10784
				FloorOverlayDefinition.alignWidgetSize(var6, var2, var3, var4); // L: 10785
				ChatChannel.alignWidgetPosition(var6, var2, var3); // L: 10786
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10787
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10788
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10789
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10790
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10791
					UserComparator8.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10793
}
