import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class PacketWriter {
	@ObfuscatedName("cw")
	public static char field1350;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	AbstractSocket socket;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1900413985
	)
	int bufferSize;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	Buffer buffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public IsaacCipher isaacCipher;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	PacketBuffer packetBuffer;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	ServerPacket serverPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1678952517
	)
	int serverPacketLength;
	@ObfuscatedName("g")
	boolean field1344;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2044305253
	)
	int field1345;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2009057559
	)
	int pendingWrites;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	ServerPacket field1336;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	ServerPacket field1348;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	ServerPacket field1346;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0;
		this.field1344 = true;
		this.field1345 = 0;
		this.pendingWrites = 0; // L: 24
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256200238"
	)
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1276124374"
	)
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "1906163027"
	)
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-666263315"
	)
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058968107"
	)
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lln;",
		garbageValue = "43"
	)
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-123"
	)
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class306.field3723) { // L: 15
			class217.field2536 += class306.field3723 - var0;
		}

		class306.field3723 = var0;
		return class217.field2536 + var0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Llq;I)Llq;",
		garbageValue = "309027289"
	)
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class297.method5378(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-371855810"
	)
	public static void method2357() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 50
			synchronized(MouseHandler.MouseHandler_instance) { // L: 51
				MouseHandler.MouseHandler_instance = null; // L: 52
			} // L: 53
		}

	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-27993"
	)
	public static int method2360(int var0) {
		if (var0 > 0) { // L: 190
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 191 192
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "82642187"
	)
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapSprite.loadInterface(var0)) { // L: 10286
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 10287

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 10288
				Widget var3 = var1[var2]; // L: 10289
				if (var3 != null) { // L: 10290
					var3.modelFrame = 0; // L: 10291
					var3.modelFrameCycle = 0; // L: 10292
				}
			}

		}
	} // L: 10294
}
