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

@ObfuscatedName("fc")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("c")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("l")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("s")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("e")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("i")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -818522115
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 991491695
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("a")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 123579555
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1696123211
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lex;I)V"
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
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-499949391"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll(); // L: 44
			} // L: 45

			if (this.task != null) { // L: 46
				while (this.task.status == 0) { // L: 47
					Language.method5813(1L); // L: 48
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-86"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2115909346"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "67"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-781316249"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) { // L: 84
					throw new EOFException();
				}

				var2 += var5; // L: 85
			}

			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "155"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) { // L: 93
				this.exceptionWriting = false;
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "300460862"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 161
	} // L: 162

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
			FloorDecoration.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfs;",
		garbageValue = "1"
	)
	public static HealthBarDefinition method3073(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1639582857"
	)
	public static void method3105() {
		try {
			if (class265.musicPlayerStatus == 1) { // L: 70
				int var0 = class265.midiPcmStream.method5096(); // L: 71
				if (var0 > 0 && class265.midiPcmStream.isReady()) { // L: 72
					var0 -= GrandExchangeOfferNameComparator.pcmSampleLength; // L: 73
					if (var0 < 0) { // L: 74
						var0 = 0;
					}

					class265.midiPcmStream.setPcmStreamVolume(var0); // L: 75
					return; // L: 76
				}

				class265.midiPcmStream.clear(); // L: 78
				class265.midiPcmStream.removeAll(); // L: 79
				if (class265.musicTrackArchive != null) { // L: 80
					class265.musicPlayerStatus = 2;
				} else {
					class265.musicPlayerStatus = 0; // L: 81
				}

				class265.musicTrack = null; // L: 82
				FileSystem.soundCache = null; // L: 83
			}
		} catch (Exception var2) { // L: 86
			var2.printStackTrace(); // L: 87
			class265.midiPcmStream.clear(); // L: 88
			class265.musicPlayerStatus = 0; // L: 89
			class265.musicTrack = null; // L: 90
			FileSystem.soundCache = null; // L: 91
			class265.musicTrackArchive = null; // L: 92
		}

	} // L: 94

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1276680943"
	)
	static void method3096(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1472

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1473
			int var4 = var3 * 32 + 15 + 128; // L: 1474
			int var5 = var4 * 3 + 600; // L: 1477
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1480
			int var6 = class167.method3254(var5, var1); // L: 1481
			var2[var3] = var6 * var7 >> 16; // L: 1482
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1484
	} // L: 1485
}
