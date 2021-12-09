import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("d")
class class12 extends SSLSocket {
	@ObfuscatedName("i")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("dj")
	static boolean field72;
	@ObfuscatedName("c")
	Certificate[] field67;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Le;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 90
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 262

	public String[] getSupportedCipherSuites() {
		return null; // L: 248
	}

	public String[] getEnabledProtocols() {
		return null; // L: 123
	}

	public boolean getNeedClientAuth() {
		return false; // L: 128
	}

	public SSLSession getSession() {
		return new class17(this); // L: 133
	}

	public String[] getSupportedProtocols() {
		return null; // L: 243
	}

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 268

	public boolean getWantClientAuth() {
		return false; // L: 258
	}

	public void setWantClientAuth(boolean var1) {
	} // L: 280

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 284
	} // L: 334

	public void setNeedClientAuth(boolean var1) {
	} // L: 274

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 95
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 271

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 100
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 113
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 109

	public String[] getEnabledCipherSuites() {
		return null; // L: 118
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 265

	public boolean getUseClientMode() {
		return false; // L: 253
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 105
	} // L: 106

	public void setUseClientMode(boolean var1) {
	} // L: 277

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "392889295"
	)
	static int method189(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Loz;III)I",
		garbageValue = "-1062038297"
	)
	static int method158(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("w")
	static boolean method188(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 81
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "122"
	)
	static int method190(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 1913
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.cycle; // L: 1914
			return 1; // L: 1915
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 1917
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 1918
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1919
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1920
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = method189(var3, var4); // L: 1921
				return 1; // L: 1922
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 1924
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 1925
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1926
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1927
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ReflectionCheck.ItemContainer_getCount(var3, var4); // L: 1928
				return 1; // L: 1929
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 1931
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 1932
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 1933
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1934
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = MouseRecorder.method2160(var3, var4); // L: 1935
				return 1; // L: 1936
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 1938
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1939
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class78.getInvDefinition(var3).size; // L: 1940
				return 1; // L: 1941
			} else if (var0 == ScriptOpcodes.STAT) { // L: 1943
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1944
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 1945
				return 1; // L: 1946
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 1948
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1949
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 1950
				return 1; // L: 1951
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 1953
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1954
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 1955
				return 1; // L: 1956
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 1958
					var3 = class20.Client_plane; // L: 1959
					var4 = (class340.localPlayer.x >> 7) + class131.baseX; // L: 1960
					var5 = (class340.localPlayer.y >> 7) + TileItem.baseY; // L: 1961
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 1962
					return 1; // L: 1963
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 1965
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1966
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 1967
					return 1; // L: 1968
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 1970
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1971
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 >> 28; // L: 1972
					return 1; // L: 1973
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 1975
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1976
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & 16383; // L: 1977
					return 1; // L: 1978
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 1980
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 1981
					return 1; // L: 1982
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 1984
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 1985
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768; // L: 1986
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1987
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = method189(var3, var4); // L: 1988
					return 1; // L: 1989
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 1991
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 1992
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768; // L: 1993
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 1994
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ReflectionCheck.ItemContainer_getCount(var3, var4); // L: 1995
					return 1; // L: 1996
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 1998
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 1999
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768; // L: 2000
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2001
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = MouseRecorder.method2160(var3, var4); // L: 2002
					return 1; // L: 2003
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2005
					if (Client.staffModLevel >= 2) { // L: 2006
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2007
					}

					return 1; // L: 2008
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2010
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2011
					return 1; // L: 2012
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2014
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.worldId; // L: 2015
					return 1; // L: 2016
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2018
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2019
					return 1; // L: 2020
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2022
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.weight; // L: 2023
					return 1; // L: 2024
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2026
					if (Client.playerMod) { // L: 2027
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 2028
					}

					return 1; // L: 2029
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2031
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2032
					return 1; // L: 2033
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2035
					IsaacCipher.Interpreter_intStackSize -= 4; // L: 2036
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 2037
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 2038
					var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 2039
					int var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3]; // L: 2040
					var3 += var4 << 14; // L: 2041
					var3 += var5 << 28; // L: 2042
					var3 += var6; // L: 2043
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3; // L: 2044
					return 1; // L: 2045
				} else if (var0 == 3326) { // L: 2047
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.field483; // L: 2048
					return 1; // L: 2049
				} else if (var0 == 3327) { // L: 2051
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.field746; // L: 2052
					return 1; // L: 2053
				} else {
					return 2; // L: 2055
				}
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "60"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class242.loadInterface(var0)) { // L: 10372
			BufferedFile.field4430 = null; // L: 10379
			class118.drawInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10380
			if (BufferedFile.field4430 != null) { // L: 10381
				class118.drawInterface(BufferedFile.field4430, -1412584499, var1, var2, var3, var4, HitSplatDefinition.field1945, class78.field1000, var7); // L: 10382
				BufferedFile.field4430 = null; // L: 10383
			}

		} else {
			if (var7 != -1) { // L: 10373
				Client.field504[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10375
					Client.field504[var8] = true;
				}
			}

		}
	} // L: 10377 10385

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1583315903"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11368
	} // L: 11369
}
