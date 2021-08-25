import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 494517725
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -527684957
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1285;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1308451043
	)
	int field1279;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 318973305
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	ServerPacket field1288;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	ServerPacket field1289;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	ServerPacket field1290;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1285 = true;
		this.field1279 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lil;I)V",
		garbageValue = "45336817"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)V",
		garbageValue = "-1644269631"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058963217"
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
		descriptor = "(I)V",
		garbageValue = "-1672369616"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "57"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1600925897"
	)
	static int method2358(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lco;III)V",
		garbageValue = "-454761472"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class17.SequenceDefinition_get(var1).field1961;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1099 = 0;
			}

			if (var3 == 2) {
				var0.field1099 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class17.SequenceDefinition_get(var1).field1955 >= class17.SequenceDefinition_get(var0.sequence).field1955) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1099 = 0;
			var0.field1152 = var0.pathLength;
		}

	}
}
