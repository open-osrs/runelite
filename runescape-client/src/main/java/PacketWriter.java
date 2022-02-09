import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2067413841
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 516931455
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("v")
	boolean field1322;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -969138177
	)
	int field1323;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1999393413
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	ServerPacket field1325;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	ServerPacket field1326;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	ServerPacket field1327;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1322 = true; // L: 22
		this.field1323 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-266664682"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lii;I)V",
		garbageValue = "1102926475"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)V",
		garbageValue = "1368024855"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2128981183"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "1683746255"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}
}
