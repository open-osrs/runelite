import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fb")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1405879659
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1291885051
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1139978387
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1146438231
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -144912345
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -720689063
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -18859023
	)
	int field1952;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1614238823
	)
	int field1947;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -120763515
	)
	int field1946;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1556024609
	)
	int field1955;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V",
		garbageValue = "1120913212"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field1952) { // L: 21
			var1.regionLowX = this.field1952;
		}

		if (var1.regionHighX < this.field1946) {
			var1.regionHighX = this.field1946; // L: 22
		}

		if (var1.regionLowY > this.field1947) { // L: 23
			var1.regionLowY = this.field1947;
		}

		if (var1.regionHighY < this.field1955) { // L: 24
			var1.regionHighY = this.field1955;
		}

	} // L: 25

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "264048682"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-11"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field1952 && var1 >> 6 <= this.field1946 && var2 >> 6 >= this.field1947 && var2 >> 6 <= this.field1955; // L: 35
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1943891890"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field1952 * 64 - this.regionStartX * 64), var3 + (this.field1947 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lii;",
		garbageValue = "691158162"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field1952 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field1947 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1138667895"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field1952 = var1.readUnsignedShort(); // L: 64
		this.field1947 = var1.readUnsignedShort(); // L: 65
		this.field1946 = var1.readUnsignedShort(); // L: 66
		this.field1955 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294582509"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-2037016852"
	)
	static int method3257(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1855
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.cycle; // L: 1856
			return 1; // L: 1857
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1859
				class44.Interpreter_intStackSize -= 2; // L: 1860
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1861
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1862
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GameEngine.method538(var3, var4); // L: 1863
				return 1; // L: 1864
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1866
				class44.Interpreter_intStackSize -= 2; // L: 1867
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1868
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1869
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class20.ItemContainer_getCount(var3, var4); // L: 1870
				return 1; // L: 1871
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1873
				class44.Interpreter_intStackSize -= 2; // L: 1874
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1875
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1876
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = LoginScreenAnimation.method2235(var3, var4); // L: 1877
				return 1; // L: 1878
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1880
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1881
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.getInvDefinition(var3).size; // L: 1882
				return 1; // L: 1883
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1885
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1886
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1887
				return 1; // L: 1888
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1890
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1891
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1892
				return 1; // L: 1893
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1895
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1896
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1897
				return 1; // L: 1898
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1900
					var3 = class22.Client_plane; // L: 1901
					var4 = (class93.localPlayer.x >> 7) + VertexNormal.baseX; // L: 1902
					var5 = (class93.localPlayer.y >> 7) + SoundSystem.baseY; // L: 1903
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1904
					return 1; // L: 1905
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1907
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1908
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1909
					return 1; // L: 1910
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1912
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1913
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1914
					return 1; // L: 1915
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1917
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 1918
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1919
					return 1; // L: 1920
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1922
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1923
					return 1; // L: 1924
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1926
					class44.Interpreter_intStackSize -= 2; // L: 1927
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768; // L: 1928
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1929
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = GameEngine.method538(var3, var4); // L: 1930
					return 1; // L: 1931
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1933
					class44.Interpreter_intStackSize -= 2; // L: 1934
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768; // L: 1935
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1936
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class20.ItemContainer_getCount(var3, var4); // L: 1937
					return 1; // L: 1938
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1940
					class44.Interpreter_intStackSize -= 2; // L: 1941
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize] + 32768; // L: 1942
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1943
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = LoginScreenAnimation.method2235(var3, var4); // L: 1944
					return 1; // L: 1945
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 1947
					if (Client.staffModLevel >= 2) { // L: 1948
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1949
					}

					return 1; // L: 1950
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 1952
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 1953
					return 1; // L: 1954
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 1956
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.worldId; // L: 1957
					return 1; // L: 1958
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 1960
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 1961
					return 1; // L: 1962
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 1964
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.weight; // L: 1965
					return 1; // L: 1966
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 1968
					if (Client.playerMod) { // L: 1969
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 1970
					}

					return 1; // L: 1971
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 1973
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 1974
					return 1; // L: 1975
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 1977
					class44.Interpreter_intStackSize -= 4; // L: 1978
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 1979
					var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 1980
					var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 1981
					int var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 1982
					var3 += var4 << 14; // L: 1983
					var3 += var5 << 28; // L: 1984
					var3 += var6; // L: 1985
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3; // L: 1986
					return 1; // L: 1987
				} else if (var0 == 3326) { // L: 1989
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.field651; // L: 1990
					return 1; // L: 1991
				} else if (var0 == 3327) { // L: 1993
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.field812; // L: 1994
					return 1; // L: 1995
				} else {
					return 2; // L: 1997
				}
			}
		}
	}
}
