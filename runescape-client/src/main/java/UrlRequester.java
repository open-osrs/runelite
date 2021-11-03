import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cf")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("g")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("i")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("w")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("s")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lcm;",
		garbageValue = "56"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) { // L: 72
			this.requests.add(var2); // L: 73
			this.notify(); // L: 74
			return var2; // L: 76
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 80

		try {
			synchronized(this) { // L: 82
				this.notify(); // L: 83
			} // L: 84

			this.thread.join(); // L: 85
		} catch (InterruptedException var4) { // L: 87
		}

	} // L: 88

	public void run() {
		while (!this.isClosed) { // L: 24
			try {
				UrlRequest var1;
				synchronized(this) { // L: 27
					var1 = (UrlRequest)this.requests.poll(); // L: 28
					if (var1 == null) { // L: 29
						try {
							this.wait(); // L: 31
						} catch (InterruptedException var13) { // L: 33
						}
						continue;
					}
				}

				DataInputStream var2 = null; // L: 37
				URLConnection var3 = null; // L: 38

				try {
					var3 = var1.url.openConnection(); // L: 40
					var3.setConnectTimeout(5000); // L: 41
					var3.setReadTimeout(5000); // L: 42
					var3.setUseCaches(false); // L: 43
					var3.setRequestProperty("Connection", "close"); // L: 44
					int var7 = var3.getContentLength(); // L: 45
					if (var7 >= 0) { // L: 46
						byte[] var5 = new byte[var7]; // L: 47
						var2 = new DataInputStream(var3.getInputStream()); // L: 48
						var2.readFully(var5); // L: 49
						var1.response0 = var5; // L: 50
					}

					var1.isDone0 = true; // L: 52
				} catch (IOException var14) { // L: 54
					var1.isDone0 = true; // L: 55
				} finally {
					if (var2 != null) { // L: 58
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 59
						((HttpURLConnection)var3).disconnect(); // L: 60
					}

				}
			} catch (Exception var17) { // L: 64
				MilliClock.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1444939304"
	)
	static int method2427(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1916
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.cycle; // L: 1917
			return 1; // L: 1918
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1920
				class14.Interpreter_intStackSize -= 2; // L: 1921
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1922
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1923
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Script.method1988(var3, var4); // L: 1924
				return 1; // L: 1925
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1927
				class14.Interpreter_intStackSize -= 2; // L: 1928
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1929
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1930
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.ItemContainer_getCount(var3, var4); // L: 1931
				return 1; // L: 1932
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1934
				class14.Interpreter_intStackSize -= 2; // L: 1935
				var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 1936
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1937
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapSectionType.method3920(var3, var4); // L: 1938
				return 1; // L: 1939
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1941
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1942
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AttackOption.getInvDefinition(var3).size; // L: 1943
				return 1; // L: 1944
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1946
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1947
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1948
				return 1; // L: 1949
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1951
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1952
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1953
				return 1; // L: 1954
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1956
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1957
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1958
				return 1; // L: 1959
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1961
					var3 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 1962
					var4 = (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX; // L: 1963
					var5 = (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY; // L: 1964
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1965
					return 1; // L: 1966
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1968
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1969
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1970
					return 1; // L: 1971
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1973
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1974
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1975
					return 1; // L: 1976
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1978
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 1979
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1980
					return 1; // L: 1981
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1983
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1984
					return 1; // L: 1985
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1987
					class14.Interpreter_intStackSize -= 2; // L: 1988
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768; // L: 1989
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1990
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Script.method1988(var3, var4); // L: 1991
					return 1; // L: 1992
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1994
					class14.Interpreter_intStackSize -= 2; // L: 1995
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768; // L: 1996
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 1997
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.ItemContainer_getCount(var3, var4); // L: 1998
					return 1; // L: 1999
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2001
					class14.Interpreter_intStackSize -= 2; // L: 2002
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize] + 32768; // L: 2003
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2004
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapSectionType.method3920(var3, var4); // L: 2005
					return 1; // L: 2006
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2008
					if (Client.staffModLevel >= 2) { // L: 2009
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2010
					}

					return 1; // L: 2011
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2013
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2014
					return 1; // L: 2015
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2017
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.worldId; // L: 2018
					return 1; // L: 2019
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2021
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2022
					return 1; // L: 2023
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2025
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.weight; // L: 2026
					return 1; // L: 2027
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2029
					if (Client.playerMod) { // L: 2030
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2031
					}

					return 1; // L: 2032
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2034
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2035
					return 1; // L: 2036
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2038
					class14.Interpreter_intStackSize -= 4; // L: 2039
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2040
					var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2041
					var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 2042
					int var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3]; // L: 2043
					var3 += var4 << 14; // L: 2044
					var3 += var5 << 28; // L: 2045
					var3 += var6; // L: 2046
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var3; // L: 2047
					return 1; // L: 2048
				} else if (var0 == 3326) { // L: 2050
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field475; // L: 2051
					return 1; // L: 2052
				} else if (var0 == 3327) { // L: 2054
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field476; // L: 2055
					return 1; // L: 2056
				} else {
					return 2; // L: 2058
				}
			}
		}
	}
}
