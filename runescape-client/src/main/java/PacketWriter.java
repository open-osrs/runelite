import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1878760487
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 824884821
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("h")
	boolean field1412;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1875627651
	)
	int field1408;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 120433437
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1410;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1411;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1399;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1412 = true; // L: 22
		this.field1408 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055980283"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160814368"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "-1221651734"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llk;S)V",
		garbageValue = "3168"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099753174"
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
		garbageValue = "-1099127678"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Llk;",
		garbageValue = "526936130"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1259341442"
	)
	static boolean method2496(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 689
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "22"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 8954
			if (Client.menuOptionsCount < 500) { // L: 8955
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 8956
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 8957
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 8958
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 8959
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 8960
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 8961
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 8962
				++Client.menuOptionsCount; // L: 8963
			}

		}
	} // L: 8965

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-277336927"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class20.loadInterface(var0)) { // L: 10365
			MenuAction.updateInterface(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10366
		}
	} // L: 10367
}
