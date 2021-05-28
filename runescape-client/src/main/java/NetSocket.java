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
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("v")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("n")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("f")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("y")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("r")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1751872319
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1540552653
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("s")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -459397033
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1021465411
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Ldp;I)V"
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
		descriptor = "(I)V",
		garbageValue = "1654713390"
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
					try {
						Thread.sleep(1L); // L: 67
					} catch (InterruptedException var4) { // L: 69
					}
				}

				if (this.task.status == 1) { // L: 73
					try {
						((Thread)this.task.result).join(); // L: 75
					} catch (InterruptedException var3) { // L: 77
					}
				}
			}

			this.task = null; // L: 80
		}
	} // L: 81

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "479468921"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 88 89
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1659206769"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 93 94
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-211935081"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 98
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 99
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2041736219"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) { // L: 103
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) { // L: 104 105 109
				var5 = this.inputStream.read(var1, var2, var3); // L: 106
				if (var5 <= 0) { // L: 107
					throw new EOFException();
				}

				var2 += var5; // L: 108
			}

			return var4; // L: 111
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "12"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) { // L: 115
			if (this.exceptionWriting) { // L: 116
				this.exceptionWriting = false; // L: 117
				throw new IOException(); // L: 118
			} else {
				if (this.outBuffer == null) { // L: 120
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) { // L: 121
					for (int var5 = 0; var5 < var3; ++var5) { // L: 122
						this.outBuffer[this.outOffset] = var1[var5 + var2]; // L: 123
						this.outOffset = (this.outOffset + 1) % this.bufferLength; // L: 124
						if ((this.maxPacketLength + this.outLength) % this.bufferLength == this.outOffset) { // L: 125
							throw new IOException(); // L: 126
						}
					}

					if (this.task == null) { // L: 129
						this.task = this.taskHandler.newThreadTask(this, 3); // L: 130
					}

					this.notifyAll(); // L: 132
				}
			}
		}
	} // L: 134

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "263213011"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3); // L: 183
	} // L: 184

	protected void finalize() {
		this.close(); // L: 84
	} // L: 85

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) { // L: 141
						if (this.outOffset == this.outLength) { // L: 142
							if (this.isClosed) { // L: 143
								break label84;
							}

							try {
								this.wait(); // L: 145
							} catch (InterruptedException var10) { // L: 147
							}
						}

						var2 = this.outLength; // L: 149
						if (this.outOffset >= this.outLength) { // L: 150
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength; // L: 151
						}
					}

					if (var1 <= 0) { // L: 153
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1); // L: 155
					} catch (IOException var9) { // L: 157
						this.exceptionWriting = true; // L: 158
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength; // L: 160

					try {
						if (this.outLength == this.outOffset) { // L: 162
							this.outputStream.flush();
						}
					} catch (IOException var8) { // L: 164
						this.exceptionWriting = true; // L: 165
					}
					continue;
				}

				try {
					if (this.inputStream != null) { // L: 170
						this.inputStream.close();
					}

					if (this.outputStream != null) { // L: 171
						this.outputStream.close();
					}

					if (this.socket != null) { // L: 172
						this.socket.close();
					}
				} catch (IOException var7) { // L: 174
				}

				this.outBuffer = null; // L: 175
				break;
			}
		} catch (Exception var12) { // L: 177
			class266.RunException_sendStackTrace((String)null, var12); // L: 178
		}

	} // L: 180

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lce;ZI)V",
		garbageValue = "2061936798"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4361
			var0.isUnanimated = false; // L: 4362
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 4363 4364
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4366
			int var3 = var0.y >> 7; // L: 4367
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4368
				long var4 = DevicePcmPlayerProvider.calculateTag(0, 0, 0, false, var0.index); // L: 4369
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4370
					var0.isUnanimated = false; // L: 4371
					var0.tileHeight = class105.getTileHeight(var0.x, var0.y, class22.Client_plane); // L: 4372
					var0.playerCycle = Client.cycle; // L: 4373
					AbstractSocket.scene.addNullableObject(class22.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4374
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4377
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4378
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4379
					}

					var0.tileHeight = class105.getTileHeight(var0.x, var0.y, class22.Client_plane); // L: 4381
					var0.playerCycle = Client.cycle; // L: 4382
					AbstractSocket.scene.drawEntity(class22.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4383
				}
			}
		}

	} // L: 4387

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1283553484"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 7591
		Client.isMenuOpen = false; // L: 7592
		Client.menuActions[0] = "Cancel"; // L: 7594
		Client.menuTargets[0] = ""; // L: 7595
		Client.menuOpcodes[0] = 1006; // L: 7596
		Client.menuShiftClick[0] = false; // L: 7597
		Client.menuOptionsCount = 1; // L: 7598
	} // L: 7599
}
