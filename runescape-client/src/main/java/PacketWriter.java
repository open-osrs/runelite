import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1797910505
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2096948369
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("b")
	boolean field1383;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -553813647
	)
	int field1384;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1243600265
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1386;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1387;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1391;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1383 = true; // L: 22
		this.field1384 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383742396"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-727119774"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;S)V",
		garbageValue = "15740"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "-2036896276"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "446343289"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1365475884"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("h")
	public static double method2400(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4; // L: 10
		double var6 = Math.exp(var8 * -var8 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 12
		return var6 / var4; // L: 14
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-571772420"
	)
	public static boolean method2410(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liv;",
		garbageValue = "-96"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = DevicePcmPlayerProvider.getWidget(var0); // L: 207
		if (var1 == -1) { // L: 208
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 209 210
		}
	}

	@ObfuscatedName("l")
	static int method2409(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 70
	}
}
