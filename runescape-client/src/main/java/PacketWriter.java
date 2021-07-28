import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -592223771
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 664186129
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("o")
	boolean field1210;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 642893305
	)
	int field1209;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1015319725
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	ServerPacket field1211;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	ServerPacket field1213;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	ServerPacket field1212;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1210 = true;
		this.field1209 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-626526349"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26503"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "1438482653"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "-1647707364"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "355652466"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1757409709"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "-1467862512"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-330695328"
	)
	public static int method2117(int var0) {
		return class345.field3945[var0 & 16383];
	}
}
