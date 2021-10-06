import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1760192501
	)
	static int field1285;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2092986285
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2128041511
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("e")
	boolean field1289;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -880191509
	)
	int field1290;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1893951709
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	ServerPacket field1281;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	ServerPacket field1293;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	ServerPacket field1288;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1289 = true;
		this.field1290 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "586577523"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lis;B)V",
		garbageValue = "0"
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
		descriptor = "(Lmk;I)V",
		garbageValue = "1927110230"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1001132724"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "533248193"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lmk;",
		garbageValue = "119"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081885223"
	)
	static final void method2354() {
		if (WorldMapSectionType.ClanChat_inClanChat) {
			if (class264.friendsChat != null) {
				class264.friendsChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}

			WorldMapSectionType.ClanChat_inClanChat = false;
		}

	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "926421993"
	)
	static final void method2375(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2729()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2715, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + class113.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					var3.addNode(var4);
				}
			}
		}
	}
}
