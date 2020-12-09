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
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1332 = true;
		this.field1333 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15320"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1507185593"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
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

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1911016563"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llr;I)V",
		garbageValue = "-412452109"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1483874445"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "210420137"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Llr;",
		garbageValue = "659174081"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}
}
