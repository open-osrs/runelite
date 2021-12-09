import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1266642989
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 594259629
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("n")
	boolean field1278;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1553002221
	)
	int field1287;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1843561553
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	ServerPacket field1289;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	ServerPacket field1290;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	ServerPacket field1291;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1278 = true; // L: 22
		this.field1287 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "750502280"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-148495881"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "-1673237142"
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
		descriptor = "(Lmd;I)V",
		garbageValue = "1972212609"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419164143"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1910470967"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lmd;",
		garbageValue = "305203979"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("n")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 85
	}
}
