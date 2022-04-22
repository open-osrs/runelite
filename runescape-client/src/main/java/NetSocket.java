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

@ObfuscatedName("fd")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("j")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("v")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("c")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("i")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("f")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("s")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1178030211
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -831152753
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("o")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 512219451
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1168737827
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lff;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false; // L: 16
		this.outLength = 0; // L: 20
		this.outOffset = 0; // L: 21
		this.exceptionWriting = false; // L: 22
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3; // L: 30
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536); // L: 35
		this.inputStream = this.socket.getInputStream(); // L: 36
		this.outputStream = this.socket.getOutputStream(); // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13138"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) { // L: 42
				this.isClosed = true; // L: 43
				this.notifyAll();
			} // L: 45

			if (this.task != null) { // L: 46
				while (this.task.status == 0) { // L: 47
					class93.method2384(1L); // L: 48
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
		garbageValue = "-891040314"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-118"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1255813086"
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

					this.notifyAll(); // L: 109
				}
			}
		}
	} // L: 111

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1359342670"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 160
	} // L: 161

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
			Widget.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1794283621"
	)
	static final boolean method3309(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (class131.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class422.field4560; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class422.field4563; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}
}
