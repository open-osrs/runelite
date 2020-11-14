import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 921396255
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 67173535
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1340;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -330616605
	)
	int field1337;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -708203583
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	ServerPacket field1348;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	ServerPacket field1339;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	ServerPacket field1350;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1340 = true; // L: 22
		this.field1337 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "702095612"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "29"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)V",
		garbageValue = "-640227269"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1950086546"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804593474"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Llv;",
		garbageValue = "310"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "60"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = Occluder.method3413(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) { // L: 36
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 37
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_'); // L: 41
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_'); // L: 43
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + class217.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + NetFileRequest.clientType + "&e=" + var2); // L: 45
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read(); // L: 47
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Llu;",
		garbageValue = "987618759"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.GRADIENT_ALPHA, FillMode.GRADIENT}; // L: 15
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(ZLks;I)V",
		garbageValue = "-232306457"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5480
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5481
			var2 = var1.method5797(); // L: 5482
			var3 = var1.method5797(); // L: 5483
			int var4 = var1.readUnsignedShort(); // L: 5484
			WorldMapEvent.xteaKeys = new int[var4][4]; // L: 5485

			for (var5 = 0; var5 < var4; ++var5) { // L: 5486
				for (var6 = 0; var6 < 4; ++var6) { // L: 5487
					WorldMapEvent.xteaKeys[var5][var6] = var1.readInt(); // L: 5488
				}
			}

			class52.regions = new int[var4]; // L: 5491
			class22.regionMapArchiveIds = new int[var4]; // L: 5492
			WallDecoration.regionLandArchiveIds = new int[var4]; // L: 5493
			GrandExchangeOffer.regionLandArchives = new byte[var4][]; // L: 5494
			GameShell.regionMapArchives = new byte[var4][]; // L: 5495
			boolean var16 = false; // L: 5496
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5497
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5498
				var16 = true;
			}

			var4 = 0; // L: 5499

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5500
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5501
					var8 = var7 + (var6 << 8); // L: 5502
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5503
						class52.regions[var4] = var8; // L: 5504
						class22.regionMapArchiveIds[var4] = Varcs.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5505
						WallDecoration.regionLandArchiveIds[var4] = Varcs.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5506
						++var4; // L: 5507
					}
				}
			}

			Projectile.method2223(var2, var3, true); // L: 5510
		} else {
			var2 = var1.method5659(); // L: 5513
			var3 = var1.method5659(); // L: 5514
			boolean var15 = var1.method5668() == 1; // L: 5515
			var5 = var1.readUnsignedShort(); // L: 5516
			var1.importIndex(); // L: 5517

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5518
				for (var7 = 0; var7 < 13; ++var7) { // L: 5519
					for (var8 = 0; var8 < 13; ++var8) { // L: 5520
						var9 = var1.readBits(1); // L: 5521
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5522
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5523
						}
					}
				}
			}

			var1.exportIndex(); // L: 5527
			WorldMapEvent.xteaKeys = new int[var5][4]; // L: 5528

			for (var6 = 0; var6 < var5; ++var6) { // L: 5529
				for (var7 = 0; var7 < 4; ++var7) { // L: 5530
					WorldMapEvent.xteaKeys[var6][var7] = var1.readInt(); // L: 5531
				}
			}

			class52.regions = new int[var5]; // L: 5534
			class22.regionMapArchiveIds = new int[var5]; // L: 5535
			WallDecoration.regionLandArchiveIds = new int[var5]; // L: 5536
			GrandExchangeOffer.regionLandArchives = new byte[var5][]; // L: 5537
			GameShell.regionMapArchives = new byte[var5][]; // L: 5538
			var5 = 0; // L: 5539

			for (var6 = 0; var6 < 4; ++var6) { // L: 5540
				for (var7 = 0; var7 < 13; ++var7) { // L: 5541
					for (var8 = 0; var8 < 13; ++var8) { // L: 5542
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5543
						if (var9 != -1) { // L: 5544
							int var10 = var9 >> 14 & 1023; // L: 5545
							int var11 = var9 >> 3 & 2047; // L: 5546
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5547

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5548
								if (class52.regions[var13] == var12) {
									var12 = -1; // L: 5549
									break; // L: 5550
								}
							}

							if (var12 != -1) { // L: 5552
								class52.regions[var5] = var12; // L: 5553
								var13 = var12 >> 8 & 255; // L: 5554
								int var14 = var12 & 255; // L: 5555
								class22.regionMapArchiveIds[var5] = Varcs.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5556
								WallDecoration.regionLandArchiveIds[var5] = Varcs.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5557
								++var5; // L: 5558
							}
						}
					}
				}
			}

			Projectile.method2223(var3, var2, !var15); // L: 5564
		}

	} // L: 5566
}
