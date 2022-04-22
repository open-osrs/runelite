import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -669543133
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 365925591
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("q")
	boolean field1317;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -11589615
	)
	int field1322;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1829594601
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	ServerPacket field1324;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	ServerPacket field1325;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	ServerPacket field1313;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0;
		this.field1317 = true; // L: 22
		this.field1322 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1641157190"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)V",
		garbageValue = "-1704102815"
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
		descriptor = "(Lny;I)V",
		garbageValue = "1949084856"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-600547113"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "1980129228"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "948804767"
	)
	public static boolean method2498(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIII)V",
		garbageValue = "-2050353968"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12305
		if (var4 != null) { // L: 12306
			if (Client.minimapState < 3) { // L: 12307
				class14.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12308
			}

		}
	} // L: 12309
}
