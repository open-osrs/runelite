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

@ObfuscatedName("fh")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Lki;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("o")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("q")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("l")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("k")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("p")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -440186297
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -375712399
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("v")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -759611045
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2033351313
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lfs;I)V"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "731891927"
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
					class241.method4815(1L); // L: 48
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1429957580"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-15219997"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-642682113"
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
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5; // L: 85
			}

			return var4; // L: 88
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "367101522"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "257086671"
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
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	@ObfuscatedName("y")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 84
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lck;ZB)V",
		garbageValue = "102"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12229
		int var3 = (int)var0.key; // L: 12230
		var0.remove(); // L: 12231
		if (var1 && var2 != -1 && class120.Widget_loadedInterfaces[var2]) { // L: 12232 12233 12234
			class134.Widget_archive.clearFilesGroup(var2); // L: 12235
			if (Widget_interfaceComponents[var2] != null) { // L: 12236
				boolean var4 = true; // L: 12237

				for (int var5 = 0; var5 < Widget_interfaceComponents[var2].length; ++var5) { // L: 12238
					if (Widget_interfaceComponents[var2][var5] != null) { // L: 12239
						if (Widget_interfaceComponents[var2][var5].type != 2) { // L: 12240
							Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 12241
						}
					}
				}

				if (var4) { // L: 12244
					Widget_interfaceComponents[var2] = null;
				}

				class120.Widget_loadedInterfaces[var2] = false; // L: 12245
			}
		}

		for (IntegerNode var6 = (IntegerNode)Client.widgetFlags.first(); var6 != null; var6 = (IntegerNode)Client.widgetFlags.next()) { // L: 12248
			if ((var6.key >> 48 & 65535L) == (long)var2) { // L: 12249
				var6.remove(); // L: 12250
			}
		}

		Widget var7 = class92.getWidget(var3); // L: 12254
		if (var7 != null) { // L: 12255
			GrandExchangeOfferTotalQuantityComparator.invalidateWidget(var7);
		}

		if (Client.rootInterface != -1) { // L: 12256
			WorldMapLabelSize.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12257
}
