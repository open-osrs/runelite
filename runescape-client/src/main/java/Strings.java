import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hi")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bp")
	public static String field2841;
	@ObfuscatedName("cy")
	public static String field2918;
	@ObfuscatedName("jd")
	public static String field3056;
	@ObfuscatedName("jv")
	public static String field3057;
	@ObfuscatedName("ji")
	public static String field3058;

	static {
		field2841 = "Please visit the support page for assistance.";
		field2918 = "Please visit the support page for assistance."; // L: 99
		field3056 = ""; // L: 275
		field3057 = "Page has opened in a new window."; // L: 276
		field3058 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-894693523"
	)
	public static void method4329(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 19
			TriBool.ByteArrayPool_alternativeSizes = var0;
			class225.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < TriBool.ByteArrayPool_alternativeSizes.length; ++var2) {
				ByteArrayPool.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			TriBool.ByteArrayPool_alternativeSizes = null; // L: 20
			class225.ByteArrayPool_altSizeArrayCounts = null; // L: 21
			ByteArrayPool.ByteArrayPool_arrays = null; // L: 22
		}
	} // L: 23

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static void method4324() {
		Coord.field2560 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = class231.method4321((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
			Coord.field2560[var0] = var3;
			++var0; // L: 29
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < Coord.field2560.length; var1 -= var5) {
			var3 = var0 * 2; // L: 36

			for (int var4 = class231.method4321((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < Coord.field2560.length; ++var0) {
				Coord.field2560[var0] = var4;
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-983754831"
	)
	public static String method4327(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 30
		int var4 = 0; // L: 31
		int var5 = var1; // L: 32

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 33 34 65
			int var7 = var0[var5++] & 255; // L: 35
			if (var7 < 128) { // L: 37
				if (var7 == 0) { // L: 38
					var8 = 65533;
				} else {
					var8 = var7; // L: 39
				}
			} else if (var7 < 192) { // L: 41
				var8 = 65533;
			} else if (var7 < 224) { // L: 42
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 43
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 44
					if (var8 < 128) { // L: 45
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 47
				}
			} else if (var7 < 240) { // L: 49
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 50
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 51
					if (var8 < 2048) { // L: 52
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 54
				}
			} else if (var7 < 248) { // L: 56
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 57
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 58
					if (var8 >= 65536 && var8 <= 1114111) { // L: 59
						var8 = 65533; // L: 60
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 62
				}
			} else {
				var8 = 65533; // L: 64
			}
		}

		return new String(var3, 0, var4); // L: 67
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-570785562"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 151
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "580078079"
	)
	static int method4326(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1782
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 1783
			return 1; // L: 1784
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1786
				Interpreter.Interpreter_intStackSize -= 2; // L: 1787
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1788
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1789
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1375(var3, var4); // L: 1790
				return 1; // L: 1791
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1793
				Interpreter.Interpreter_intStackSize -= 2; // L: 1794
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1795
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1796
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.ItemContainer_getCount(var3, var4); // L: 1797
				return 1; // L: 1798
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1800
				Interpreter.Interpreter_intStackSize -= 2; // L: 1801
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1802
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1803
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class232.method4322(var3, var4); // L: 1804
				return 1; // L: 1805
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1807
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1808
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.getInvDefinition(var3).size; // L: 1809
				return 1; // L: 1810
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1812
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1813
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1814
				return 1; // L: 1815
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1817
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1818
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1819
				return 1; // L: 1820
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1822
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1823
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1824
				return 1; // L: 1825
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1827
					var3 = class90.Client_plane; // L: 1828
					var4 = (UserComparator9.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX; // L: 1829
					var5 = (UserComparator9.localPlayer.y >> 7) + NetCache.baseY; // L: 1830
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1831
					return 1; // L: 1832
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1834
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1835
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1836
					return 1; // L: 1837
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1839
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1840
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1841
					return 1; // L: 1842
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1844
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1845
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1846
					return 1; // L: 1847
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1849
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1850
					return 1; // L: 1851
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1853
					Interpreter.Interpreter_intStackSize -= 2; // L: 1854
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1855
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1856
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1375(var3, var4); // L: 1857
					return 1; // L: 1858
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1860
					Interpreter.Interpreter_intStackSize -= 2; // L: 1861
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1862
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1863
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.ItemContainer_getCount(var3, var4); // L: 1864
					return 1; // L: 1865
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1867
					Interpreter.Interpreter_intStackSize -= 2; // L: 1868
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1869
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1870
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class232.method4322(var3, var4); // L: 1871
					return 1; // L: 1872
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1874
					if (Client.staffModLevel >= 2) { // L: 1875
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1876
					}

					return 1; // L: 1877
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1879
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1880
					return 1; // L: 1881
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1883
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 1884
					return 1; // L: 1885
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1887
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1888
					return 1; // L: 1889
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1891
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 1892
					return 1; // L: 1893
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1895
					if (Client.playerMod) { // L: 1896
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1897
					}

					return 1; // L: 1898
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1900
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1901
					return 1; // L: 1902
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1904
					Interpreter.Interpreter_intStackSize -= 4; // L: 1905
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1906
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1907
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1908
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 1909
					var3 += var4 << 14; // L: 1910
					var3 += var5 << 28; // L: 1911
					var3 += var6; // L: 1912
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 1913
					return 1; // L: 1914
				} else {
					return 2; // L: 1916
				}
			}
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lhz;B)Lhz;",
		garbageValue = "-45"
	)
	static Widget method4325(Widget var0) {
		int var2 = class60.getWidgetFlags(var0); // L: 11489
		int var1 = var2 >> 17 & 7; // L: 11491
		int var3 = var1; // L: 11493
		if (var1 == 0) { // L: 11494
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 11495
				var0 = class237.getWidget(var0.parentId); // L: 11496
				if (var0 == null) { // L: 11497
					return null;
				}
			}

			return var0; // L: 11499
		}
	}
}
