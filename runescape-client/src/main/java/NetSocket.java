import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ec")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	static StudioGame field1492;
	@ObfuscatedName("h")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("c")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("o")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("g")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("t")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -911833781
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1776922823
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("q")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -341311153
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 772156429
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Ldk;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false; // L: 16
		this.outLength = 0; // L: 20
		this.outOffset = 0; // L: 21
		this.exceptionWriting = false; // L: 22
		this.taskHandler = var2; // L: 28
		this.socket = var1; // L: 29
		this.bufferLength = var3; // L: 30
		this.maxPacketLength = var3 - 100; // L: 31
		this.socket.setSoTimeout(30000); // L: 32
		this.socket.setTcpNoDelay(true); // L: 33
		this.socket.setReceiveBufferSize(65536); // L: 34
		this.socket.setSendBufferSize(65536); // L: 35
		this.inputStream = this.socket.getInputStream(); // L: 36
		this.outputStream = this.socket.getOutputStream(); // L: 37
	} // L: 38

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) { // L: 41
			synchronized(this) { // L: 42
				this.isClosed = true; // L: 43
				this.notifyAll(); // L: 44
			} // L: 45

			if (this.task != null) { // L: 46
				while (this.task.status == 0) { // L: 47
					UrlRequest.sleepExact(1L); // L: 48
				}

				if (this.task.status == 1) { // L: 50
					try {
						((Thread)this.task.result).join(); // L: 52
					} catch (InterruptedException var3) { // L: 54
					}
				}
			}

			this.task = null; // L: 57
		}
	} // L: 58

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2027143758"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640327653"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1880004365"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1936066161"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) { // L: 80
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) { // L: 81 82 86
				var5 = this.inputStream.read(var1, var2, var3); // L: 83
				if (var5 <= 0) { // L: 84
					throw new EOFException();
				}

				var2 += var5; // L: 85
			}

			return var4; // L: 88
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1940944682"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) { // L: 92
			if (this.exceptionWriting) { // L: 93
				this.exceptionWriting = false; // L: 94
				throw new IOException(); // L: 95
			} else {
				if (this.outBuffer == null) { // L: 97
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) { // L: 98
					for (int var5 = 0; var5 < var3; ++var5) { // L: 99
						this.outBuffer[this.outOffset] = var1[var5 + var2]; // L: 100
						this.outOffset = (this.outOffset + 1) % this.bufferLength; // L: 101
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) { // L: 102
							throw new IOException(); // L: 103
						}
					}

					if (this.task == null) { // L: 106
						this.task = this.taskHandler.newThreadTask(this, 3); // L: 107
					}

					this.notifyAll(); // L: 109
				}
			}
		}
	} // L: 111

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1752522959"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 160
	} // L: 161

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) { // L: 118
						if (this.outLength == this.outOffset) { // L: 119
							if (this.isClosed) { // L: 120
								break label84;
							}

							try {
								this.wait(); // L: 122
							} catch (InterruptedException var10) { // L: 124
							}
						}

						var2 = this.outLength; // L: 126
						if (this.outOffset >= this.outLength) { // L: 127
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength; // L: 128
						}
					}

					if (var1 <= 0) { // L: 130
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1); // L: 132
					} catch (IOException var9) { // L: 134
						this.exceptionWriting = true; // L: 135
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength; // L: 137

					try {
						if (this.outLength == this.outOffset) { // L: 139
							this.outputStream.flush();
						}
					} catch (IOException var8) { // L: 141
						this.exceptionWriting = true; // L: 142
					}
					continue;
				}

				try {
					if (this.inputStream != null) { // L: 147
						this.inputStream.close();
					}

					if (this.outputStream != null) { // L: 148
						this.outputStream.close();
					}

					if (this.socket != null) { // L: 149
						this.socket.close();
					}
				} catch (IOException var7) { // L: 151
				}

				this.outBuffer = null; // L: 152
				break;
			}
		} catch (Exception var12) { // L: 154
			class27.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1636570408"
	)
	static int method2570(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1190
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1191
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var3)); // L: 1192
			return 1; // L: 1193
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1195
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1202
				if (var3.dataText == null) { // L: 1203
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1204
				}

				return 1; // L: 1205
			} else {
				return 2; // L: 1207
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1196
			--var4; // L: 1197
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1198
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1199
			} else {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1200
		}
	}
}
