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

@ObfuscatedName("ff")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("c")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("b")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("p")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("m")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("j")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1984666421
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 773716871
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("r")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1772673061
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -19944007
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Leb;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2099219864"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					Bounds.method6608(1L);
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1579083707"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1654551476"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "909"
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
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-34"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1320460000"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outOffset == this.outLength) {
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

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outLength == this.outOffset) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			}
		} catch (Exception var12) {
			AccessFile.RunException_sendStackTrace((String)null, var12);
		}

	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "320078998"
	)
	static final boolean method3119(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIIZI)V",
		garbageValue = "1774445817"
	)
	public static void method3118(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class260.musicPlayerStatus = 1;
		class124.musicTrackArchive = var0;
		VarcInt.musicTrackGroupId = var1;
		class260.musicTrackFileId = var2;
		ChatChannel.musicTrackVolume = var3;
		DynamicObject.musicTrackBoolean = var4;
		class260.pcmSampleLength = 10000;
	}
}
