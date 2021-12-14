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
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public boolean getUseClientMode() {
		return false;
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void setUseClientMode(boolean var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "392889295"
	)
	static int method189(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Loz;III)I",
		garbageValue = "-1062038297"
	)
	static int method158(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("w")
	static boolean method188(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "122"
	)
	static int method190(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = method189(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ReflectionCheck.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = MouseRecorder.method2160(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class78.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class20.Client_plane;
					var4 = (class340.localPlayer.x >> 7) + class131.baseX;
					var5 = (class340.localPlayer.y >> 7) + TileItem.baseY;
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = method189(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ReflectionCheck.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = MouseRecorder.method2160(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					IsaacCipher.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.field483;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.field746;
					return 1;
				} else {
					return 2;
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
		if (class242.loadInterface(var0)) {
			BufferedFile.field4430 = null;
			class118.drawInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (BufferedFile.field4430 != null) {
				class118.drawInterface(BufferedFile.field4430, -1412584499, var1, var2, var3, var4, HitSplatDefinition.field1945, class78.field1000, var7);
				BufferedFile.field4430 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field504[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field504[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1583315903"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
