import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -2007745669
	)
	static int field402;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -477105871
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -718168197
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("e")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1; // L: 34
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(0.5D + 65536.0D * var17); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-792171906"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2059785269"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-387941357"
	)
	static void method1018() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class21.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class21.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1283916070"
	)
	public static void method1005(int var0) {
		if (class272.musicPlayerStatus != 0) { // L: 36
			class272.musicTrackVolume = var0;
		} else {
			class272.midiPcmStream.setPcmStreamVolume(var0); // L: 37
		}

	} // L: 38

	@ObfuscatedName("w")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 85
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "407625357"
	)
	static int method1019(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1892
			class446.Interpreter_intStackSize -= 3; // L: 1893
			SoundSystem.queueSoundEffect(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]); // L: 1894
			return 1; // L: 1895
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1897
			class16.playSong(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1898
			return 1; // L: 1899
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1901
			class446.Interpreter_intStackSize -= 2; // L: 1902
			PcmPlayer.method719(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 1903
			return 1; // L: 1904
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1906
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2018
					return var0 == 3211 ? 1 : 2; // L: 2127 2128 2130
				} else {
					var3 = class83.field1074; // L: 2019
					var4 = class82.field1069; // L: 2020
					boolean var8 = false; // L: 2021
					if (var0 == 3214) { // L: 2022
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2023
						var3 = (class83)Actor.findEnumerated(MilliClock.method3310(), var6); // L: 2024
						if (var3 == null) { // L: 2025
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2026
						}
					}

					if (var0 == 3215) { // L: 2029
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2030
						var4 = (class82)Actor.findEnumerated(WorldMapData_1.method4867(), var6); // L: 2031
						if (var4 == null) { // L: 2032
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2033
						}
					}

					if (var0 == 3210) { // L: 2036
						var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2037
						var3 = (class83)Actor.findEnumerated(MilliClock.method3310(), var6); // L: 2038
						if (var3 == null) { // L: 2039
							var4 = (class82)Actor.findEnumerated(WorldMapData_1.method4867(), var6); // L: 2040
							if (var4 == null) { // L: 2041
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2042
							}
						}
					} else if (var0 == 3182) { // L: 2046
						var3 = class83.field1079; // L: 2047
					} else if (var0 == 3204) { // L: 2049
						var4 = class82.field1067; // L: 2050
					} else if (var0 == 3206) { // L: 2052
						var4 = class82.field1068; // L: 2053
					} else if (var0 == 3208) { // L: 2055
						var4 = class82.field1073; // L: 2056
					}

					if (var4 == class82.field1069) { // L: 2058
						switch(var3.field1080) { // L: 2059
						case 1:
							var5 = class19.clientPreferences.method2247() ? 1 : 0; // L: 2087
							break; // L: 2088
						case 2:
							var5 = class19.clientPreferences.method2317() ? 1 : 0; // L: 2082
							break; // L: 2083
						case 3:
							var5 = class19.clientPreferences.method2252() ? 1 : 0; // L: 2067
							break; // L: 2068
						case 4:
							var5 = class19.clientPreferences.method2243(); // L: 2062
							break;
						case 5:
							var5 = class193.method3919(); // L: 2072
							break; // L: 2073
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2077
							throw new RuntimeException(var7); // L: 2078
						}
					} else {
						switch(var4.field1065) { // L: 2093
						case 1:
							var5 = class19.clientPreferences.method2245() ? 1 : 0; // L: 2096
							break; // L: 2097
						case 2:
							var6 = class19.clientPreferences.method2258(); // L: 2118
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2119
							break; // L: 2120
						case 3:
							var6 = class19.clientPreferences.method2241(); // L: 2112
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2113
							break; // L: 2114
						case 4:
							var6 = class19.clientPreferences.method2262(); // L: 2106
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2107
							break; // L: 2108
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2101
							throw new RuntimeException(var7); // L: 2102
						}
					}

					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5; // L: 2124
					return 1; // L: 2125
				}
			} else {
				var3 = class83.field1074; // L: 1907
				var4 = class82.field1069; // L: 1908
				var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1909
				if (var0 == 3212) { // L: 1910
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1911
					var3 = (class83)Actor.findEnumerated(MilliClock.method3310(), var6); // L: 1912
					if (var3 == null) { // L: 1913
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1914
					}
				}

				if (var0 == 3213) { // L: 1917
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1918
					var4 = (class82)Actor.findEnumerated(WorldMapData_1.method4867(), var6); // L: 1919
					if (var4 == null) { // L: 1920
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1921
					}
				}

				if (var0 == 3209) { // L: 1924
					var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1925
					var3 = (class83)Actor.findEnumerated(MilliClock.method3310(), var6); // L: 1926
					if (var3 == null) { // L: 1927
						var4 = (class82)Actor.findEnumerated(WorldMapData_1.method4867(), var6); // L: 1928
						if (var4 == null) { // L: 1929
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1930
						}
					}
				} else if (var0 == 3181) { // L: 1934
					var3 = class83.field1079; // L: 1935
				} else if (var0 == 3203) { // L: 1937
					var4 = class82.field1067; // L: 1938
				} else if (var0 == 3205) { // L: 1940
					var4 = class82.field1068; // L: 1941
				} else if (var0 == 3207) { // L: 1943
					var4 = class82.field1073; // L: 1944
				}

				if (var4 == class82.field1069) { // L: 1946
					switch(var3.field1080) { // L: 1947
					case 1:
						class19.clientPreferences.method2246(var5 == 1); // L: 1971
						break; // L: 1972
					case 2:
						class19.clientPreferences.method2248(var5 == 1); // L: 1950
						break;
					case 3:
						class19.clientPreferences.method2250(var5 == 1); // L: 1966
						break; // L: 1967
					case 4:
						if (var5 < 0) { // L: 1960
							var5 = 0;
						}

						class19.clientPreferences.method2330(var5); // L: 1961
						break; // L: 1962
					case 5:
						WorldMapEvent.method5120(var5); // L: 1955
						break; // L: 1956
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1976
						throw new RuntimeException(var7); // L: 1977
					}
				} else {
					switch(var4.field1065) { // L: 1982
					case 1:
						class19.clientPreferences.method2339(var5 == 1); // L: 1992
						break; // L: 1993
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1997
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 1998
						PacketBufferNode.method5196(var6); // L: 1999
						break; // L: 2000
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2004
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2005
						WorldMapData_0.method4563(var6); // L: 2006
						break; // L: 2007
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1985
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1986
						WorldMapEvent.method5121(var6); // L: 1987
						break; // L: 1988
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2011
						throw new RuntimeException(var7); // L: 2012
					}
				}

				return 1; // L: 2016
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "1000"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class356.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5921
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5922
			var7 = class356.scene.getObjectFlags(var0, var1, var2, var5); // L: 5923
			var8 = var7 >> 6 & 3; // L: 5924
			var9 = var7 & 31; // L: 5925
			var10 = var3; // L: 5926
			if (Canvas.method322(var5)) { // L: 5927
				var10 = var4;
			}

			int[] var11 = FloorUnderlayDefinition.sceneMinimapSprite.pixels; // L: 5928
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5929
			var13 = Entity_unpackID(var5); // L: 5930
			ObjectComposition var14 = class162.getObjectDefinition(var13); // L: 5931
			if (var14.mapSceneId != -1) { // L: 5932
				IndexedSprite var15 = class13.mapSceneSprites[var14.mapSceneId]; // L: 5933
				if (var15 != null) { // L: 5934
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5935
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5936
					var15.drawAt(var1 * 4 + var16 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5937
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5941
					if (var8 == 0) { // L: 5942
						var11[var12] = var10; // L: 5943
						var11[var12 + 512] = var10; // L: 5944
						var11[var12 + 1024] = var10; // L: 5945
						var11[var12 + 1536] = var10; // L: 5946
					} else if (var8 == 1) { // L: 5948
						var11[var12] = var10; // L: 5949
						var11[var12 + 1] = var10; // L: 5950
						var11[var12 + 2] = var10; // L: 5951
						var11[var12 + 3] = var10; // L: 5952
					} else if (var8 == 2) { // L: 5954
						var11[var12 + 3] = var10; // L: 5955
						var11[var12 + 512 + 3] = var10; // L: 5956
						var11[var12 + 1024 + 3] = var10; // L: 5957
						var11[var12 + 1536 + 3] = var10; // L: 5958
					} else if (var8 == 3) { // L: 5960
						var11[var12 + 1536] = var10; // L: 5961
						var11[var12 + 1536 + 1] = var10; // L: 5962
						var11[var12 + 1536 + 2] = var10; // L: 5963
						var11[var12 + 1536 + 3] = var10; // L: 5964
					}
				}

				if (var9 == 3) { // L: 5967
					if (var8 == 0) { // L: 5968
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5969
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5970
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5971
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5973
					if (var8 == 3) { // L: 5974
						var11[var12] = var10; // L: 5975
						var11[var12 + 512] = var10; // L: 5976
						var11[var12 + 1024] = var10; // L: 5977
						var11[var12 + 1536] = var10; // L: 5978
					} else if (var8 == 0) { // L: 5980
						var11[var12] = var10; // L: 5981
						var11[var12 + 1] = var10; // L: 5982
						var11[var12 + 2] = var10; // L: 5983
						var11[var12 + 3] = var10; // L: 5984
					} else if (var8 == 1) { // L: 5986
						var11[var12 + 3] = var10; // L: 5987
						var11[var12 + 512 + 3] = var10; // L: 5988
						var11[var12 + 1024 + 3] = var10; // L: 5989
						var11[var12 + 1536 + 3] = var10; // L: 5990
					} else if (var8 == 2) { // L: 5992
						var11[var12 + 1536] = var10; // L: 5993
						var11[var12 + 1536 + 1] = var10; // L: 5994
						var11[var12 + 1536 + 2] = var10; // L: 5995
						var11[var12 + 1536 + 3] = var10; // L: 5996
					}
				}
			}
		}

		var5 = class356.scene.getGameObjectTag(var0, var1, var2); // L: 6001
		if (0L != var5) { // L: 6002
			var7 = class356.scene.getObjectFlags(var0, var1, var2, var5); // L: 6003
			var8 = var7 >> 6 & 3; // L: 6004
			var9 = var7 & 31; // L: 6005
			var10 = Entity_unpackID(var5); // L: 6006
			ObjectComposition var24 = class162.getObjectDefinition(var10); // L: 6007
			int var19;
			if (var24.mapSceneId != -1) { // L: 6008
				IndexedSprite var20 = class13.mapSceneSprites[var24.mapSceneId]; // L: 6009
				if (var20 != null) { // L: 6010
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6011
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6012
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6013
				}
			} else if (var9 == 9) { // L: 6016
				var12 = 15658734; // L: 6017
				if (Canvas.method322(var5)) { // L: 6018
					var12 = 15597568;
				}

				int[] var18 = FloorUnderlayDefinition.sceneMinimapSprite.pixels; // L: 6019
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6020
				if (var8 != 0 && var8 != 2) { // L: 6021
					var18[var19] = var12; // L: 6028
					var18[var19 + 1 + 512] = var12; // L: 6029
					var18[var19 + 1024 + 2] = var12; // L: 6030
					var18[var19 + 1536 + 3] = var12; // L: 6031
				} else {
					var18[var19 + 1536] = var12; // L: 6022
					var18[var19 + 1 + 1024] = var12; // L: 6023
					var18[var19 + 512 + 2] = var12; // L: 6024
					var18[var19 + 3] = var12; // L: 6025
				}
			}
		}

		var5 = class356.scene.getFloorDecorationTag(var0, var1, var2); // L: 6035
		if (var5 != 0L) { // L: 6036
			var7 = Entity_unpackID(var5); // L: 6037
			ObjectComposition var21 = class162.getObjectDefinition(var7); // L: 6038
			if (var21.mapSceneId != -1) { // L: 6039
				IndexedSprite var22 = class13.mapSceneSprites[var21.mapSceneId]; // L: 6040
				if (var22 != null) { // L: 6041
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6042
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6043
					var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 6044
				}
			}
		}

	} // L: 6048

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIZI)V",
		garbageValue = "2074727207"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10684
		int var5 = var0.height; // L: 10685
		if (var0.widthAlignment == 0) { // L: 10686
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10687
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10688
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10689
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10690
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10691
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10692
			var0.width = var0.height * var0.field3385 / var0.field3386;
		}

		if (var0.heightAlignment == 4) { // L: 10693
			var0.height = var0.field3386 * var0.width / var0.field3385;
		}

		if (var0.contentType == 1337) { // L: 10694
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10695
			ScriptEvent var6 = new ScriptEvent(); // L: 10696
			var6.widget = var0; // L: 10697
			var6.args = var0.onResize; // L: 10698
			Client.scriptEvents.addFirst(var6); // L: 10699
		}

	} // L: 10701
}
