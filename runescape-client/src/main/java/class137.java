import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eo")
public class class137 extends class128 {
	@ObfuscatedName("o")
	String field1626;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class137(class131 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1626 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.name = this.field1626; // L: 237
	} // L: 238

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "43434510"
	)
	static int method2873(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1882
			class12.Interpreter_intStackSize -= 3; // L: 1883
			WorldMapLabelSize.queueSoundEffect(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]); // L: 1884
			return 1; // L: 1885
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1887
			WorldMapIcon_0.playSong(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1888
			return 1; // L: 1889
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1891
			class12.Interpreter_intStackSize -= 2; // L: 1892
			class306.method5593(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 1893
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
					var3 = class83.field1088; // L: 2009
					var4 = class82.field1073; // L: 2010
					boolean var8 = false; // L: 2011
					if (var0 == 3214) { // L: 2012
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2013
						var3 = (class83)class291.findEnumerated(class141.method2962(), var6); // L: 2014
						if (var3 == null) { // L: 2015
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2016
						}
					}

					if (var0 == 3215) { // L: 2019
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2020
						var4 = (class82)class291.findEnumerated(Player.method2159(), var6); // L: 2021
						if (var4 == null) { // L: 2022
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2023
						}
					}

					if (var0 == 3210) { // L: 2026
						var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 2027
						var3 = (class83)class291.findEnumerated(class141.method2962(), var6); // L: 2028
						if (var3 == null) { // L: 2029
							var4 = (class82)class291.findEnumerated(Player.method2159(), var6); // L: 2030
							if (var4 == null) { // L: 2031
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2032
							}
						}
					} else if (var0 == 3182) { // L: 2036
						var3 = class83.field1092; // L: 2037
					} else if (var0 == 3204) { // L: 2039
						var4 = class82.field1078; // L: 2040
					} else if (var0 == 3206) { // L: 2042
						var4 = class82.field1075; // L: 2043
					} else if (var0 == 3208) { // L: 2045
						var4 = class82.field1076; // L: 2046
					}

					if (var4 == class82.field1073) { // L: 2048
						switch(var3.field1090) { // L: 2049
						case 1:
							var5 = class12.clientPreferences.method2257() ? 1 : 0; // L: 2052
							break;
						case 2:
							var5 = class12.clientPreferences.method2226() ? 1 : 0; // L: 2067
							break; // L: 2068
						case 3:
							var5 = class12.clientPreferences.method2229() ? 1 : 0; // L: 2072
							break; // L: 2073
						case 4:
							var5 = class12.clientPreferences.method2231(); // L: 2057
							break; // L: 2058
						case 5:
							var5 = GameBuild.method5586(); // L: 2077
							break; // L: 2078
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2062
							throw new RuntimeException(var7); // L: 2063
						}
					} else {
						switch(var4.field1077) { // L: 2083
						case 1:
							var5 = class12.clientPreferences.method2222() ? 1 : 0; // L: 2109
							break;
						case 2:
							var6 = class12.clientPreferences.method2248(); // L: 2097
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2098
							break; // L: 2099
						case 3:
							var6 = class12.clientPreferences.method2244(); // L: 2103
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2104
							break; // L: 2105
						case 4:
							var6 = class12.clientPreferences.method2239(); // L: 2086
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2087
							break; // L: 2088
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2092
							throw new RuntimeException(var7); // L: 2093
						}
					}

					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5; // L: 2114
					return 1; // L: 2115
				}
			} else {
				var3 = class83.field1088; // L: 1897
				var4 = class82.field1073; // L: 1898
				var5 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1899
				if (var0 == 3212) { // L: 1900
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1901
					var3 = (class83)class291.findEnumerated(class141.method2962(), var6); // L: 1902
					if (var3 == null) { // L: 1903
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1904
					}
				}

				if (var0 == 3213) { // L: 1907
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1908
					var4 = (class82)class291.findEnumerated(Player.method2159(), var6); // L: 1909
					if (var4 == null) { // L: 1910
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1911
					}
				}

				if (var0 == 3209) { // L: 1914
					var6 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 1915
					var3 = (class83)class291.findEnumerated(class141.method2962(), var6); // L: 1916
					if (var3 == null) { // L: 1917
						var4 = (class82)class291.findEnumerated(Player.method2159(), var6); // L: 1918
						if (var4 == null) { // L: 1919
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1920
						}
					}
				} else if (var0 == 3181) { // L: 1924
					var3 = class83.field1092; // L: 1925
				} else if (var0 == 3203) { // L: 1927
					var4 = class82.field1078; // L: 1928
				} else if (var0 == 3205) { // L: 1930
					var4 = class82.field1075; // L: 1931
				} else if (var0 == 3207) { // L: 1933
					var4 = class82.field1076; // L: 1934
				}

				if (var4 == class82.field1073) { // L: 1936
					switch(var3.field1090) { // L: 1937
					case 1:
						class12.clientPreferences.method2223(var5 == 1); // L: 1961
						break; // L: 1962
					case 2:
						class12.clientPreferences.method2305(var5 == 1); // L: 1966
						break; // L: 1967
					case 3:
						class12.clientPreferences.method2227(var5 == 1); // L: 1940
						break;
					case 4:
						if (var5 < 0) { // L: 1955
							var5 = 0;
						}

						class12.clientPreferences.method2230(var5); // L: 1956
						break; // L: 1957
					case 5:
						World.method1664(var5); // L: 1945
						break; // L: 1946
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1950
						throw new RuntimeException(var7); // L: 1951
					}
				} else {
					switch(var4.field1077) { // L: 1972
					case 1:
						class12.clientPreferences.method2219(var5 == 1); // L: 1994
						break; // L: 1995
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1980
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 1981
						class291.method5390(var6); // L: 1982
						break; // L: 1983
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1987
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1988
						class67.method1881(var6); // L: 1989
						break; // L: 1990
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1999
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2000
						MouseHandler.method591(var6); // L: 2001
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

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2079145454"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4982
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4983
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4984
				int var3 = var2.x >> 7; // L: 4985
				int var4 = var2.y >> 7; // L: 4986
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4987
					if (var2.field1167 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4988
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4989
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4990
					}

					long var5 = VarbitComposition.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4992
					var2.playerCycle = Client.cycle; // L: 4993
					class175.scene.drawEntity(class128.Client_plane, var2.x, var2.y, class202.getTileHeight(var2.field1167 * 64 - 64 + var2.x, var2.field1167 * 64 - 64 + var2.y, class128.Client_plane), var2.field1167 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4994
				}
			}
		}

	} // L: 4998
}
