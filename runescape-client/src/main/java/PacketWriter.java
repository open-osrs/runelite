import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1231198347
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -840603711
	)
	static int field1331;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 512771779
	)
	static int field1341;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -818108241
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2012352771
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("l")
	boolean field1332;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1974762033
	)
	int field1333;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1113999339
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	ServerPacket field1335;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	ServerPacket field1336;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	ServerPacket field1337;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1332 = true; // L: 22
		this.field1333 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15320"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1507185593"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1911016563"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llr;I)V",
		garbageValue = "-412452109"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1483874445"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "210420137"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Llr;",
		garbageValue = "659174081"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}
}
