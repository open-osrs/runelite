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

@ObfuscatedName("ea")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("f")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("e")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("v")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("y")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("m")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1328963059
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1887422677
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("d")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 957852253
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1007889337
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lda;I)V"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1854440694"
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
					class18.method272(1L); // L: 48
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574875272"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2063198043"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2019948581"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-334344092"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-94"
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
						if ((this.outLength + this.maxPacketLength) % this.bufferLength == this.outOffset) { // L: 102
							throw new IOException(); // L: 103
						}
					}

					if (this.task == null) { // L: 106
						this.task = this.taskHandler.newThreadTask(this, 3); // L: 107
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1206684972"
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
					synchronized(this) {
						if (this.outLength == this.outOffset) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) { // L: 130
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1); // L: 132
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outOffset == this.outLength) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
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
			FriendsChat.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcf;",
		garbageValue = "1671409942"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 108
		Buffer var2 = new Buffer(var0); // L: 109
		var2.offset = var2.array.length - 2; // L: 110
		int var3 = var2.readUnsignedShort(); // L: 111
		int var4 = var2.array.length - 2 - var3 - 12; // L: 112
		var2.offset = var4; // L: 113
		int var5 = var2.readInt(); // L: 114
		var1.localIntCount = var2.readUnsignedShort(); // L: 115
		var1.localStringCount = var2.readUnsignedShort(); // L: 116
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 117
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 118
		int var6 = var2.readUnsignedByte(); // L: 119
		int var7;
		int var8;
		if (var6 > 0) { // L: 120
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 121

			for (var7 = 0; var7 < var6; ++var7) { // L: 122
				var8 = var2.readUnsignedShort(); // L: 123
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? UrlRequester.method2504(var8) : 1); // L: 124
				var1.switches[var7] = var9; // L: 125

				while (var8-- > 0) { // L: 126
					int var10 = var2.readInt(); // L: 127
					int var11 = var2.readInt(); // L: 128
					var9.put(new IntegerNode(var11), (long)var10); // L: 129
				}
			}
		}

		var2.offset = 0; // L: 133
		var1.field1069 = var2.readStringCp1252NullTerminatedOrNull(); // L: 134
		var1.opcodes = new int[var5]; // L: 135
		var1.intOperands = new int[var5]; // L: 136
		var1.stringOperands = new String[var5]; // L: 137

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 138 139 144
			var8 = var2.readUnsignedShort(); // L: 140
			if (var8 == 3) { // L: 141
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 142
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 143
			}
		}

		return var1; // L: 146
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "582256450"
	)
	static int method2676(int var0) {
		return var0 * 3 + 600; // L: 1723
	}
}
