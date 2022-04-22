import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	field3923(6, 22, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	field3927(7, 41, false, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	field3920(8, 42, false, false, true);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1109984117
	)
	@Export("id")
	final int id;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 571102393
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("p")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("w")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 26
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 33
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llo;I)I",
		garbageValue = "-380323275"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101; // L: 65
			} else if (var10 == 223) { // L: 68
				var12 = 115; // L: 69
			} else if (var10 == 338) { // L: 72
				var12 = 69; // L: 73
			} else if (var10 == 339) { // L: 76
				var12 = 101; // L: 77
			} else {
				var12 = 0; // L: 80
			}

			var8 = var12; // L: 82
			var9 = class291.standardizeChar(var9, var2); // L: 83
			var10 = class291.standardizeChar(var10, var2); // L: 84
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 85
				var9 = Character.toLowerCase(var9); // L: 86
				var10 = Character.toLowerCase(var10); // L: 87
				if (var10 != var9) { // L: 88
					return SecureRandomCallable.lowercaseChar(var9, var2) - SecureRandomCallable.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 91

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) { // L: 92
			if (var2 == Language.Language_FR) { // L: 93
				var5 = var3 - 1 - var17; // L: 94
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6); // L: 99
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var18 != var20) {
					return SecureRandomCallable.lowercaseChar(var18, var2) - SecureRandomCallable.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var13 != var20) { // L: 111
					return SecureRandomCallable.lowercaseChar(var20, var2) - SecureRandomCallable.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1428968028"
	)
	static int method5803(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1882
			Interpreter.Interpreter_intStackSize -= 3; // L: 1883
			Actor.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 1884
			return 1; // L: 1885
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1887
			SoundCache.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1888
			return 1; // L: 1889
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1891
			Interpreter.Interpreter_intStackSize -= 2; // L: 1892
			Players.method2419(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1893
			return 1; // L: 1894
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1896
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2008
					return var0 == 3211 ? 1 : 2; // L: 2117 2118 2120
				} else {
					var3 = class83.field1064; // L: 2009
					var4 = class82.field1055; // L: 2010
					boolean var8 = false; // L: 2011
					if (var0 == 3214) { // L: 2012
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2013
						var3 = (class83)MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6); // L: 2014
						if (var3 == null) { // L: 2015
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2016
						}
					}

					if (var0 == 3215) { // L: 2019
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2020
						var4 = (class82)MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6); // L: 2021
						if (var4 == null) { // L: 2022
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2023
						}
					}

					if (var0 == 3210) { // L: 2026
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2027
						var3 = (class83)MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6); // L: 2028
						if (var3 == null) { // L: 2029
							var4 = (class82)MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6); // L: 2030
							if (var4 == null) { // L: 2031
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2032
							}
						}
					} else if (var0 == 3182) { // L: 2036
						var3 = class83.field1065; // L: 2037
					} else if (var0 == 3204) { // L: 2039
						var4 = class82.field1059; // L: 2040
					} else if (var0 == 3206) { // L: 2042
						var4 = class82.field1057; // L: 2043
					} else if (var0 == 3208) { // L: 2045
						var4 = class82.field1056; // L: 2046
					}

					if (var4 == class82.field1055) { // L: 2048
						switch(var3.field1060) { // L: 2049
						case 1:
							var5 = class131.clientPreferences.method2317() ? 1 : 0; // L: 2057
							break; // L: 2058
						case 2:
							var5 = class131.clientPreferences.method2279() ? 1 : 0; // L: 2067
							break; // L: 2068
						case 3:
							var5 = class131.clientPreferences.method2236() ? 1 : 0; // L: 2052
							break;
						case 4:
							var5 = class131.clientPreferences.method2238(); // L: 2062
							break; // L: 2063
						case 5:
							var5 = VarbitComposition.method3578(); // L: 2072
							break; // L: 2073
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2077
							throw new RuntimeException(var7); // L: 2078
						}
					} else {
						switch(var4.field1054) { // L: 2083
						case 1:
							var5 = class131.clientPreferences.method2263() ? 1 : 0; // L: 2092
							break; // L: 2093
						case 2:
							var6 = class131.clientPreferences.method2321(); // L: 2108
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2109
							break;
						case 3:
							var6 = class131.clientPreferences.method2243(); // L: 2102
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2103
							break; // L: 2104
						case 4:
							var6 = class131.clientPreferences.method2270(); // L: 2086
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2087
							break; // L: 2088
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2097
							throw new RuntimeException(var7); // L: 2098
						}
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 2114
					return 1; // L: 2115
				}
			} else {
				var3 = class83.field1064; // L: 1897
				var4 = class82.field1055; // L: 1898
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1899
				if (var0 == 3212) { // L: 1900
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1901
					var3 = (class83)MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6); // L: 1902
					if (var3 == null) { // L: 1903
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1904
					}
				}

				if (var0 == 3213) { // L: 1907
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1908
					var4 = (class82)MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6); // L: 1909
					if (var4 == null) { // L: 1910
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1911
					}
				}

				if (var0 == 3209) { // L: 1914
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1915
					var3 = (class83)MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6); // L: 1916
					if (var3 == null) { // L: 1917
						var4 = (class82)MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6); // L: 1918
						if (var4 == null) { // L: 1919
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1920
						}
					}
				} else if (var0 == 3181) { // L: 1924
					var3 = class83.field1065; // L: 1925
				} else if (var0 == 3203) { // L: 1927
					var4 = class82.field1059; // L: 1928
				} else if (var0 == 3205) { // L: 1930
					var4 = class82.field1057; // L: 1931
				} else if (var0 == 3207) { // L: 1933
					var4 = class82.field1056; // L: 1934
				}

				if (var4 == class82.field1055) { // L: 1936
					switch(var3.field1060) { // L: 1937
					case 1:
						class131.clientPreferences.method2230(var5 == 1); // L: 1961
						break; // L: 1962
					case 2:
						class131.clientPreferences.method2237(var5 == 1); // L: 1946
						break; // L: 1947
					case 3:
						class131.clientPreferences.method2234(var5 == 1); // L: 1966
						break; // L: 1967
					case 4:
						if (var5 < 0) { // L: 1940
							var5 = 0;
						}

						class131.clientPreferences.method2260(var5); // L: 1941
						break;
					case 5:
						class113.method2650(var5); // L: 1951
						break; // L: 1952
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1956
						throw new RuntimeException(var7); // L: 1957
					}
				} else {
					switch(var4.field1054) { // L: 1972
					case 1:
						class131.clientPreferences.method2246(var5 == 1); // L: 1980
						break; // L: 1981
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1992
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 1993
						class1.method11(var6); // L: 1994
						break; // L: 1995
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1985
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1986
						class126.method2824(var6); // L: 1987
						break; // L: 1988
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1999
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2000
						class127.method2830(var6); // L: 2001
						break; // L: 2002
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 1975
						throw new RuntimeException(var7); // L: 1976
					}
				}

				return 1; // L: 2006
			}
		}
	}
}
