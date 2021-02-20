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

@ObfuscatedName("fw")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("h")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("v")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("x")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("w")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("n")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1457420997
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 976468503
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("z")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 464417007
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1893306917
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lfa;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0; // L: 20
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2; // L: 28
		this.socket = var1;
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
		garbageValue = "-10"
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
					class236.sleepExact(1L); // L: 48
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read(); // L: 65 66
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1974658106"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available(); // L: 70 71
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-7"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) { // L: 75
			return false;
		} else {
			return this.inputStream.available() >= var1; // L: 76
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "98"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "2119529681"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2028715299"
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
			PlayerComposition.RunException_sendStackTrace((String)null, var12); // L: 155
		}

	} // L: 157

	protected void finalize() {
		this.close(); // L: 61
	} // L: 62

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lla;I)Lla;",
		garbageValue = "-1038873122"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = World.method1870(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Llj;",
		garbageValue = "8"
	)
	@Export("FillMode_values")
	public static WidgetFillMode[] FillMode_values() {
		return new WidgetFillMode[]{WidgetFillMode.field3897, WidgetFillMode.field3898, WidgetFillMode.SOLID}; // L: 15
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "327738104"
	)
	static final void method3608() {
		if (GameObject.Client_plane != Client.field874) { // L: 3735
			Client.field874 = GameObject.Client_plane; // L: 3736
			int var0 = GameObject.Client_plane; // L: 3737
			int[] var1 = class25.sceneMinimapSprite.pixels; // L: 3739
			int var2 = var1.length; // L: 3740

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3741
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3742
				var4 = (103 - var3) * 2048 + 24628; // L: 3743

				for (var5 = 1; var5 < 103; ++var5) { // L: 3744
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3745
						ArchiveLoader.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						ArchiveLoader.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3); // L: 3746
					}

					var4 += 4; // L: 3747
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3750
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3751
			class25.sceneMinimapSprite.setRaster(); // L: 3752

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3753
				for (var6 = 1; var6 < 103; ++var6) { // L: 3754
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3755
						class1.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3756
						class1.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3759

			for (var5 = 0; var5 < 104; ++var5) { // L: 3760
				for (var6 = 0; var6 < 104; ++var6) { // L: 3761
					long var7 = ArchiveLoader.scene.getFloorDecorationTag(GameObject.Client_plane, var5, var6); // L: 3762
					if (0L != var7) { // L: 3763
						int var9 = Occluder.Entity_unpackID(var7); // L: 3764
						int var10 = WorldMapDecoration.getObjectDefinition(var9).mapIconId; // L: 3765
						if (var10 >= 0 && UserComparator10.WorldMapElement_get(var10).field3263) { // L: 3766 3767
							Client.mapIcons[Client.mapIconCount] = UserComparator10.WorldMapElement_get(var10).getSpriteBool(false); // L: 3770
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3771
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3772
							++Client.mapIconCount; // L: 3773
						}
					}
				}
			}

			WorldMapIcon_0.rasterProvider.apply(); // L: 3778
		}

	} // L: 3781

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-60"
	)
	static int method3587(int var0, int var1) {
		int var2 = var1 - 334; // L: 5287
		if (var2 < 0) { // L: 5288
			var2 = 0;
		} else if (var2 > 100) { // L: 5289
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5290
		return var0 * var3 / 256; // L: 5291
	}
}
