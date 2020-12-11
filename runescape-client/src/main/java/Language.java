import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
@Implements("Language")
public class Language implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("p")
	final String field2380;
	@ObfuscatedName("l")
	@Export("language")
	final String language;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1680963867
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field2402, 0, "GB"); // L: 10
		Language_DE = new Language("DE", "de", "German", ModeWhere.field2402, 1, "DE"); // L: 11
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field2402, 2, "FR"); // L: 12
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field2402, 3, "BR"); // L: 13
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field2397, 4, "NL"); // L: 14
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field2397, 5, "ES"); // L: 15
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field2402, 6, "MX"); // L: 16
		Language[] var0 = method3708(); // L: 23
		Language_valuesOrdered = new Language[var0.length]; // L: 24
		Language[] var1 = var0; // L: 26

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 27
			Language var3 = var1[var2]; // L: 28
			if (Language_valuesOrdered[var3.id] != null) { // L: 30
				throw new IllegalStateException(); // L: 31
			}

			Language_valuesOrdered[var3.id] = var3; // L: 33
		}

	} // L: 37

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lge;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field2380 = var1; // L: 44
		this.language = var2; // L: 45
		this.id = var5; // L: 46
		if (var6 != null) { // L: 47
			new Locale(var2.substring(0, 2), var6); // L: 48
		} else {
			new Locale(var2.substring(0, 2)); // L: 51
		}

	} // L: 53

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "379304040"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 56
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 60
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgi;",
		garbageValue = "-1061791428"
	)
	static Language[] method3708() {
		return new Language[]{Language_PT, Language_NL, Language_ES, Language_DE, Language_EN, Language_FR, Language_ES_MX}; // L: 40
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "-1"
	)
	public static Language method3701(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "684258970"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "59"
	)
	static int method3709(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1781
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.cycle; // L: 1782
			return 1; // L: 1783
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1785
				VarcInt.Interpreter_intStackSize -= 2; // L: 1786
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1787
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1788
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class60.method942(var3, var4); // L: 1789
				return 1; // L: 1790
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1792
				VarcInt.Interpreter_intStackSize -= 2; // L: 1793
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1794
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1795
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class8.ItemContainer_getCount(var3, var4); // L: 1796
				return 1; // L: 1797
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1799
				VarcInt.Interpreter_intStackSize -= 2; // L: 1800
				var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1801
				var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1802
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Frames.method3356(var3, var4); // L: 1803
				return 1; // L: 1804
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1806
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1807
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = LoginScreenAnimation.getInvDefinition(var3).size; // L: 1808
				return 1; // L: 1809
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1811
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1812
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1813
				return 1; // L: 1814
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1816
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1817
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1818
				return 1; // L: 1819
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1821
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1822
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1823
				return 1; // L: 1824
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1826
					var3 = GameObject.Client_plane; // L: 1827
					var4 = (PlayerAppearance.localPlayer.x >> 7) + NetFileRequest.baseX; // L: 1828
					var5 = (PlayerAppearance.localPlayer.y >> 7) + class41.baseY; // L: 1829
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1830
					return 1; // L: 1831
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1833
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1834
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1835
					return 1; // L: 1836
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1838
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1839
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1840
					return 1; // L: 1841
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1843
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1844
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1845
					return 1; // L: 1846
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1848
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1849
					return 1; // L: 1850
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1852
					VarcInt.Interpreter_intStackSize -= 2; // L: 1853
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768; // L: 1854
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1855
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class60.method942(var3, var4); // L: 1856
					return 1; // L: 1857
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1859
					VarcInt.Interpreter_intStackSize -= 2; // L: 1860
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768; // L: 1861
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1862
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class8.ItemContainer_getCount(var3, var4); // L: 1863
					return 1; // L: 1864
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1866
					VarcInt.Interpreter_intStackSize -= 2; // L: 1867
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize] + 32768; // L: 1868
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1869
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Frames.method3356(var3, var4); // L: 1870
					return 1; // L: 1871
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1873
					if (Client.staffModLevel >= 2) { // L: 1874
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1875
					}

					return 1; // L: 1876
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1878
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1879
					return 1; // L: 1880
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1882
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.worldId; // L: 1883
					return 1; // L: 1884
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1886
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1887
					return 1; // L: 1888
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1890
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.weight; // L: 1891
					return 1; // L: 1892
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1894
					if (Client.playerMod) { // L: 1895
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1896
					}

					return 1; // L: 1897
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1899
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1900
					return 1; // L: 1901
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1903
					VarcInt.Interpreter_intStackSize -= 4; // L: 1904
					var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 1905
					var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 1906
					var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 1907
					int var6 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 1908
					var3 += var4 << 14; // L: 1909
					var3 += var5 << 28; // L: 1910
					var3 += var6; // L: 1911
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3; // L: 1912
					return 1; // L: 1913
				} else {
					return 2; // L: 1915
				}
			}
		}
	}
}
