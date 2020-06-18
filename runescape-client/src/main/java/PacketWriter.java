import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljx;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -315328335
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lkn;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llb;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgu;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1069759871
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("a")
	boolean field1347;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1004833869
	)
	int field1348;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -126397603
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lgu;"
	)
	ServerPacket field1350;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgu;"
	)
	ServerPacket field1351;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgu;"
	)
	ServerPacket field1342;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1347 = true;
		this.field1348 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "65"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1917984042"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lgj;I)V",
		garbageValue = "-251135286"
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
		signature = "(Llj;I)V",
		garbageValue = "-1410560856"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "446694129"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2011501008"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Llj;",
		garbageValue = "2137567404"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}
}
