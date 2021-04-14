import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1925008229
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 101057139
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("u")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("p")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 714
		this.height = var2; // L: 715
		this.xWidths = var3; // L: 716
		this.xStarts = var4; // L: 717
	} // L: 718

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "862387576"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 721
			int var3 = this.xStarts[var2]; // L: 722
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 723
				return true;
			}
		}

		return false; // L: 725
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljq;",
		garbageValue = "55"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1072788075"
	)
	static int method4173(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1854
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.cycle; // L: 1855
			return 1; // L: 1856
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1858
				class16.Interpreter_intStackSize -= 2; // L: 1859
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1860
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1861
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class82.method1923(var3, var4); // L: 1862
				return 1; // L: 1863
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1865
				class16.Interpreter_intStackSize -= 2; // L: 1866
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1867
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1868
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Language.ItemContainer_getCount(var3, var4); // L: 1869
				return 1; // L: 1870
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1872
				class16.Interpreter_intStackSize -= 2; // L: 1873
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1874
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1875
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameBuild.method4386(var3, var4); // L: 1876
				return 1; // L: 1877
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1879
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1880
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameObject.getInvDefinition(var3).size; // L: 1881
				return 1; // L: 1882
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1884
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1885
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1886
				return 1; // L: 1887
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1889
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1890
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1891
				return 1; // L: 1892
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1894
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1895
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1896
				return 1; // L: 1897
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1899
					var3 = class26.Client_plane; // L: 1900
					var4 = (Varcs.localPlayer.x >> 7) + ItemLayer.baseX; // L: 1901
					var5 = (Varcs.localPlayer.y >> 7) + Tile.baseY; // L: 1902
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1903
					return 1; // L: 1904
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1906
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1907
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1908
					return 1; // L: 1909
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1911
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1912
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1913
					return 1; // L: 1914
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1916
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1917
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1918
					return 1; // L: 1919
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1921
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1922
					return 1; // L: 1923
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1925
					class16.Interpreter_intStackSize -= 2; // L: 1926
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768; // L: 1927
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1928
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class82.method1923(var3, var4); // L: 1929
					return 1; // L: 1930
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1932
					class16.Interpreter_intStackSize -= 2; // L: 1933
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768; // L: 1934
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1935
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Language.ItemContainer_getCount(var3, var4); // L: 1936
					return 1; // L: 1937
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1939
					class16.Interpreter_intStackSize -= 2; // L: 1940
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768; // L: 1941
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1942
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameBuild.method4386(var3, var4); // L: 1943
					return 1; // L: 1944
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1946
					if (Client.staffModLevel >= 2) { // L: 1947
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1948
					}

					return 1; // L: 1949
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1951
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1952
					return 1; // L: 1953
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1955
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.worldId; // L: 1956
					return 1; // L: 1957
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1959
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1960
					return 1; // L: 1961
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1963
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.weight; // L: 1964
					return 1; // L: 1965
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1967
					if (Client.playerMod) { // L: 1968
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1969
					}

					return 1; // L: 1970
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1972
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1973
					return 1; // L: 1974
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1976
					class16.Interpreter_intStackSize -= 4; // L: 1977
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1978
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1979
					var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 1980
					int var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3]; // L: 1981
					var3 += var4 << 14; // L: 1982
					var3 += var5 << 28; // L: 1983
					var3 += var6; // L: 1984
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3; // L: 1985
					return 1; // L: 1986
				} else if (var0 == 3326) { // L: 1988
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field875; // L: 1989
					return 1; // L: 1990
				} else if (var0 == 3327) { // L: 1992
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field759; // L: 1993
					return 1; // L: 1994
				} else {
					return 2; // L: 1996
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "53"
	)
	static void method4172(int var0, int var1) {
		int var2 = class368.fontBold12.stringWidth("Choose Option"); // L: 7948

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 7949
			var4 = class368.fontBold12.stringWidth(class69.method1164(var3)); // L: 7950
			if (var4 > var2) { // L: 7951
				var2 = var4;
			}
		}

		var2 += 8; // L: 7953
		var3 = Client.menuOptionsCount * 15 + 22; // L: 7954
		var4 = var0 - var2 / 2; // L: 7955
		if (var2 + var4 > InterfaceParent.canvasWidth) { // L: 7956
			var4 = InterfaceParent.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 7957
			var4 = 0;
		}

		int var5 = var1; // L: 7958
		if (var1 + var3 > GameEngine.canvasHeight) { // L: 7959
			var5 = GameEngine.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 7960
			var5 = 0;
		}

		class16.menuX = var4; // L: 7961
		FontName.menuY = var5; // L: 7962
		Player.menuWidth = var2; // L: 7963
		class11.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 7964
	} // L: 7965

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "121"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		AbstractByteArrayCopier.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 9000
	} // L: 9001
}
