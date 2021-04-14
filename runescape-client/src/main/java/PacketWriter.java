import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	static Widget field1394;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1424950051
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -408097885
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("h")
	boolean field1388;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1141971331
	)
	int field1391;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1591339787
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	ServerPacket field1381;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	ServerPacket field1392;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	ServerPacket field1393;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1388 = true;
		this.field1391 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lgy;B)V",
		garbageValue = "95"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V",
		garbageValue = "949465191"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;",
		garbageValue = "-99883679"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgc;",
		garbageValue = "22"
	)
	static LoginPacket[] method2386() {
		return new LoginPacket[]{LoginPacket.field2449, LoginPacket.field2450, LoginPacket.field2454, LoginPacket.field2452, LoginPacket.field2451, LoginPacket.field2456}; // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	public static void method2368(int var0) {
		class210.musicPlayerStatus = 1; // L: 58
		class210.musicTrackArchive = null; // L: 59
		FaceNormal.musicTrackGroupId = -1; // L: 60
		WorldMapID.musicTrackFileId = -1; // L: 61
		class375.musicTrackVolume = 0; // L: 62
		class210.musicTrackBoolean = false; // L: 63
		class1.pcmSampleLength = var0; // L: 64
	} // L: 65
}
