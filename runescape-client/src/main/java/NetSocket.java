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

@ObfuscatedName("ft")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("v")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("o")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("h")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("g")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("d")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1965865583
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -401346385
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("r")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -418935701
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1680142407
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lfw;I)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) { // L: 41
			synchronized(this) { // L: 42
				this.isClosed = true; // L: 43
				this.notifyAll(); // L: 44
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					GrandExchangeOfferTotalQuantityComparator.method6007(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread)this.task.result).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1669312252"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1264669351"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "396806768"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "52142940"
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
		garbageValue = "2083273816"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-57"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 161
	} // L: 162

	protected void finalize() {
		this.close();
	}

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
						if (this.outOffset == this.outLength) { // L: 139
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
			class301.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "682010792"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			char var7 = var0.charAt(var6 + var1); // L: 47
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 48
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 49
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 50
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 51
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 52
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 53
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 58
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 59
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 60
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 61
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 62
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 63
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 64
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 65
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 66
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 67
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 68
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 69
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 70
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 71
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 72
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 73
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 74
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 75
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 76
			}
		}

		return var5; // L: 78
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1228266479"
	)
	public static int method3271(int var0, int var1, int var2) {
		int var3 = class260.method5203(var2 - var1 + 1); // L: 54
		var3 <<= var1; // L: 55
		var0 |= var3; // L: 56
		return var0; // L: 57
	}
}
