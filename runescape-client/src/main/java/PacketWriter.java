import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 85190489
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1705844849
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -438499277
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("y")
	boolean field1341;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 482936903
	)
	int field1342;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1898199617
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	ServerPacket field1350;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	ServerPacket field1347;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	ServerPacket field1352;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1341 = true; // L: 22
		this.field1342 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1277685397"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "885234902"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljt;B)V",
		garbageValue = "-46"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)V",
		garbageValue = "-1968764439"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2070187507"
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
		garbageValue = "-59"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)Lnl;",
		garbageValue = "-13159"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;ZI)V",
		garbageValue = "-1796247845"
	)
	public static void method2517(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		class328.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 75
	} // L: 76
}
