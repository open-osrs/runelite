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
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1278 = true;
		this.field1287 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "750502280"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-148495881"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "-1673237142"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lmd;I)V",
		garbageValue = "1972212609"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419164143"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1910470967"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lmd;",
		garbageValue = "305203979"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("n")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
