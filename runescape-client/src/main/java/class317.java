import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
public class class317 {
	@ObfuscatedName("c")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("s")
	int[] field3968;
	@ObfuscatedName("e")
	int[] field3970;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 531245581
	)
	int field3967;

	public class317() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3968 = new int[2048]; // L: 12
		this.field3970 = new int[2048]; // L: 13
		this.field3967 = 0; // L: 14
		WorldMapData_1.method4642(); // L: 21
	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-178971158"
	)
	void method5762(int var1) {
		int var2 = var1 * 2 + 1; // L: 46
		double var4 = (double)((float)var1 / 3.0F); // L: 48
		int var6 = var1 * 2 + 1; // L: 50
		double[] var7 = new double[var6]; // L: 51
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4; // L: 58
			double var14 = Math.exp(-var16 * var16 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 60
			double var24 = var14 / var4; // L: 62
			var7[var9] = var24; // L: 64
			++var8; // L: 52
		}

		double[] var18 = var7; // L: 68
		double var19 = var7[var1] * var7[var1]; // L: 69
		int[] var21 = new int[var2 * var2]; // L: 70
		boolean var10 = false; // L: 71

		for (int var11 = 0; var11 < var2; ++var11) { // L: 72
			for (int var12 = 0; var12 < var2; ++var12) { // L: 73
				int var13 = var21[var12 + var2 * var11] = (int)(var18[var11] * var18[var12] / var19 * 256.0D); // L: 74
				if (!var10 && var13 > 0) { // L: 75
					var10 = true; // L: 76
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2); // L: 80
		this.spriteMap.put(var1, var22); // L: 81
	} // L: 82

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpt;",
		garbageValue = "109"
	)
	SpritePixels method5781(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 85
			this.method5762(var1); // L: 86
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 88
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-702903043"
	)
	public final void method5764(int var1, int var2) {
		if (this.field3967 < this.field3968.length) {
			this.field3968[this.field3967] = var1;
			this.field3970[this.field3967] = var2;
			++this.field3967;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5275"
	)
	public final void method5765() {
		this.field3967 = 0;
	} // L: 100

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IILpt;FI)V",
		garbageValue = "802145631"
	)
	public final void method5766(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F); // L: 103
		SpritePixels var6 = this.method5781(var5); // L: 104
		int var7 = var5 * 2 + 1; // L: 105
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 106
		Bounds var9 = new Bounds(0, 0); // L: 107
		this.bounds.setHigh(var7, var7); // L: 108
		System.nanoTime(); // L: 109

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3967; ++var10) { // L: 110
			var11 = this.field3968[var10]; // L: 111
			var12 = this.field3970[var10]; // L: 112
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 113
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 114
			this.bounds.setLow(var13, var14); // L: 115
			this.bounds.method6600(var8, var9); // L: 116
			this.method5767(var6, var3, var9); // L: 117
		}

		System.nanoTime(); // L: 119
		System.nanoTime(); // L: 120

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 121
			if (var3.pixels[var10] == 0) { // L: 122
				var3.pixels[var10] = -16777216; // L: 123
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 126
				if (var11 <= 0) { // L: 127
					var3.pixels[var10] = -16777216; // L: 128
				} else {
					if (var11 > VerticalAlignment.field1884.length) { // L: 131
						var11 = VerticalAlignment.field1884.length;
					}

					var12 = VerticalAlignment.field1884[var11 - 1]; // L: 132
					var3.pixels[var10] = -16777216 | var12; // L: 133
				}
			}
		}

		System.nanoTime(); // L: 135
	} // L: 136

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpt;Lna;B)V",
		garbageValue = "34"
	)
	void method5767(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 139
			int var4 = 0; // L: 140
			int var5 = 0; // L: 141
			if (var3.lowX == 0) { // L: 142
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 143
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 144
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 145

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 146
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 147
					int[] var10000 = var2.pixels; // L: 148
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 150
				var7 += var2.subWidth - var3.highX; // L: 151
			}

		}
	} // L: 153

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lpg;",
		garbageValue = "344070416"
	)
	static IndexedSprite method5780() {
		IndexedSprite var0 = new IndexedSprite(); // L: 89
		var0.width = class434.SpriteBuffer_spriteWidth; // L: 90
		var0.height = class434.SpriteBuffer_spriteHeight; // L: 91
		var0.xOffset = class434.SpriteBuffer_xOffsets[0]; // L: 92
		var0.yOffset = class434.SpriteBuffer_yOffsets[0]; // L: 93
		var0.subWidth = class434.SpriteBuffer_spriteWidths[0]; // L: 94
		var0.subHeight = Fonts.SpriteBuffer_spriteHeights[0]; // L: 95
		var0.palette = HealthBarUpdate.SpriteBuffer_spritePalette; // L: 96
		var0.pixels = WorldMapLabelSize.SpriteBuffer_pixels[0]; // L: 97
		Canvas.method365(); // L: 98
		return var0; // L: 99
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1895797746"
	)
	static int method5768(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1920
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 1921
			return 1; // L: 1922
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1924
				Interpreter.Interpreter_intStackSize -= 2; // L: 1925
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1926
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1927
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class341.method6228(var3, var4); // L: 1928
				return 1; // L: 1929
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1931
				Interpreter.Interpreter_intStackSize -= 2; // L: 1932
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1933
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1934
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class335.ItemContainer_getCount(var3, var4); // L: 1935
				return 1; // L: 1936
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1938
				Interpreter.Interpreter_intStackSize -= 2; // L: 1939
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1940
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1941
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.method2942(var3, var4); // L: 1942
				return 1; // L: 1943
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1945
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1946
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator10.getInvDefinition(var3).size; // L: 1947
				return 1; // L: 1948
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1950
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1951
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1952
				return 1; // L: 1953
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1955
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1956
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1957
				return 1; // L: 1958
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1960
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1961
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1962
				return 1; // L: 1963
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1965
					var3 = SoundSystem.Client_plane; // L: 1966
					var4 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX; // L: 1967
					var5 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY; // L: 1968
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1969
					return 1; // L: 1970
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1972
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1973
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1974
					return 1; // L: 1975
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1977
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1978
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1979
					return 1; // L: 1980
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1982
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1983
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1984
					return 1; // L: 1985
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1987
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1988
					return 1; // L: 1989
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1991
					Interpreter.Interpreter_intStackSize -= 2; // L: 1992
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 1993
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1994
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class341.method6228(var3, var4); // L: 1995
					return 1; // L: 1996
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1998
					Interpreter.Interpreter_intStackSize -= 2; // L: 1999
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2000
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2001
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class335.ItemContainer_getCount(var3, var4); // L: 2002
					return 1; // L: 2003
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2005
					Interpreter.Interpreter_intStackSize -= 2; // L: 2006
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2007
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2008
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.method2942(var3, var4); // L: 2009
					return 1; // L: 2010
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2012
					if (Client.staffModLevel >= 2) { // L: 2013
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2014
					}

					return 1; // L: 2015
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2017
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2018
					return 1; // L: 2019
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2021
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2022
					return 1; // L: 2023
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2025
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2026
					return 1; // L: 2027
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2029
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2030
					return 1; // L: 2031
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2033
					if (Client.playerMod) { // L: 2034
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2035
					}

					return 1; // L: 2036
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2038
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2039
					return 1; // L: 2040
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2042
					Interpreter.Interpreter_intStackSize -= 4; // L: 2043
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2044
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2045
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2046
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2047
					var3 += var4 << 14; // L: 2048
					var3 += var5 << 28; // L: 2049
					var3 += var6; // L: 2050
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2051
					return 1; // L: 2052
				} else if (var0 == 3326) { // L: 2054
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field508; // L: 2055
					return 1; // L: 2056
				} else if (var0 == 3327) { // L: 2058
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field509; // L: 2059
					return 1; // L: 2060
				} else {
					return 2; // L: 2062
				}
			}
		}
	}
}
