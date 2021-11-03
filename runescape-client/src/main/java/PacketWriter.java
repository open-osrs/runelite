import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 738275543
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1382536787
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("j")
	boolean field1280;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -284843695
	)
	int field1275;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2120666223
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1277;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1284;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1285;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1280 = true; // L: 22
		this.field1275 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "480041256"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-635097246"
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
		descriptor = "(Lib;B)V",
		garbageValue = "-1"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lmp;I)V",
		garbageValue = "-597928557"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401992191"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1183328030"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Lmp;",
		garbageValue = "113"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("w")
	public static double method2425(double var0, double var2, double var4) {
		return class112.method2517((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459150971"
	)
	public static void method2401() {
		Widget.Widget_cachedSprites.clear(); // L: 707
		Widget.Widget_cachedModels.clear(); // L: 708
		Widget.Widget_cachedFonts.clear(); // L: 709
		Widget.Widget_cachedSpriteMasks.clear(); // L: 710
	} // L: 711
}
