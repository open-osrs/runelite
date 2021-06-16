import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jd")
public class class267 {
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class262[] var2 = new class262[]{class262.field3194, class262.field3193}; // L: 14
		class262[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class262 var5 = var3[var4]; // L: 18
			if (var5.field3192 > var0) { // L: 20
				var0 = var5.field3192;
			}

			if (var5.field3195 > var1) { // L: 21
				var1 = var5.field3195;
			}
		}

	} // L: 25

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "2132527544"
	)
	static int method4991(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1869
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.cycle; // L: 1870
			return 1; // L: 1871
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1873
				ChatChannel.Interpreter_intStackSize -= 2; // L: 1874
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1875
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1876
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Canvas.method498(var3, var4); // L: 1877
				return 1; // L: 1878
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1880
				ChatChannel.Interpreter_intStackSize -= 2; // L: 1881
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1882
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1883
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class143.ItemContainer_getCount(var3, var4); // L: 1884
				return 1; // L: 1885
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1887
				ChatChannel.Interpreter_intStackSize -= 2; // L: 1888
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1889
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1890
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class26.method351(var3, var4); // L: 1891
				return 1; // L: 1892
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1894
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1895
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class261.getInvDefinition(var3).size; // L: 1896
				return 1; // L: 1897
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1899
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1900
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1901
				return 1; // L: 1902
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1904
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1905
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1906
				return 1; // L: 1907
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1909
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1910
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1911
				return 1; // L: 1912
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1914
					var3 = SoundSystem.Client_plane; // L: 1915
					var4 = (class262.localPlayer.x >> 7) + class15.baseX; // L: 1916
					var5 = (class262.localPlayer.y >> 7) + WorldMapSprite.baseY; // L: 1917
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1918
					return 1; // L: 1919
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1921
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1922
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1923
					return 1; // L: 1924
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1926
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1927
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1928
					return 1; // L: 1929
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1931
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1932
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1933
					return 1; // L: 1934
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1936
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1937
					return 1; // L: 1938
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1940
					ChatChannel.Interpreter_intStackSize -= 2; // L: 1941
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768; // L: 1942
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1943
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Canvas.method498(var3, var4); // L: 1944
					return 1; // L: 1945
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1947
					ChatChannel.Interpreter_intStackSize -= 2; // L: 1948
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768; // L: 1949
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1950
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class143.ItemContainer_getCount(var3, var4); // L: 1951
					return 1; // L: 1952
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1954
					ChatChannel.Interpreter_intStackSize -= 2; // L: 1955
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768; // L: 1956
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1957
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class26.method351(var3, var4); // L: 1958
					return 1; // L: 1959
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1961
					if (Client.staffModLevel >= 2) { // L: 1962
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1963
					}

					return 1; // L: 1964
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1966
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1967
					return 1; // L: 1968
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1970
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.worldId; // L: 1971
					return 1; // L: 1972
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1974
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1975
					return 1; // L: 1976
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1978
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.weight; // L: 1979
					return 1; // L: 1980
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1982
					if (Client.playerMod) { // L: 1983
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1984
					}

					return 1; // L: 1985
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1987
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1988
					return 1; // L: 1989
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1991
					ChatChannel.Interpreter_intStackSize -= 4; // L: 1992
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1993
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1994
					var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 1995
					int var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 1996
					var3 += var4 << 14; // L: 1997
					var3 += var5 << 28; // L: 1998
					var3 += var6; // L: 1999
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 2000
					return 1; // L: 2001
				} else if (var0 == 3326) { // L: 2003
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field843; // L: 2004
					return 1; // L: 2005
				} else if (var0 == 3327) { // L: 2007
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field633; // L: 2008
					return 1; // L: 2009
				} else {
					return 2; // L: 2011
				}
			}
		}
	}
}
